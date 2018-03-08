package com.km.nithin.assignment1.base

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.km.nithin.assignment1.application.TestApplication
import com.km.nithin.assignment1.di.component.ApplicationComponent

/**
 * Created by Nithin.Kumar on 3/8/2018.
 */
abstract class BaseFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater , container: ViewGroup? , savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(getContentView(), container, false)
        return view
    }

    abstract fun getContentView(): Int
    protected fun getApplicationComponent(): ApplicationComponent? {
        return (activity?.application as TestApplication).getApplicationComponent()
    }

    protected open fun resolveDaggerDependency() {

    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        resolveDaggerDependency()

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        setActionBar()
        onInitializeView()
    }
    protected open fun onInitializeView(){

    }
//    fun setActionBar(){
//        (activity as AppCompatActivity).setSupportActionBar(toolbar)
//        val supportActionBar=(activity as AppCompatActivity)?.supportActionBar
//        supportActionBar?.setDisplayShowHomeEnabled(true)
//        supportActionBar?.setHomeButtonEnabled(false)
//        supportActionBar?.setDisplayShowTitleEnabled(false)
//        supportActionBar?.setIcon(R.drawable.logo_home)
//    }
//    fun setActionBarHome(){
//        (activity as AppCompatActivity).setSupportActionBar(toolbar)
//        val supportActionBar=(activity as AppCompatActivity)?.supportActionBar
//        supportActionBar?.setDisplayShowHomeEnabled(false)
//        supportActionBar?.setHomeButtonEnabled(false)
//        supportActionBar?.setDisplayShowTitleEnabled(false)
//    }

}