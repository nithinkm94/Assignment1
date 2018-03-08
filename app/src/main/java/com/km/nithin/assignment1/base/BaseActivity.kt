package com.km.nithin.assignment1.base

import android.content.Intent
import android.os.Bundle
import android.support.annotation.CallSuper
import android.support.v7.app.AppCompatActivity
import com.km.nithin.assignment1.application.TestApplication
import com.km.nithin.assignment1.di.component.ApplicationComponent

/**
 * Created by Nithin.Kumar on 3/8/2018.
 */
abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getContentView())
        onViewReady(savedInstanceState, intent)

    }

    @CallSuper
    protected open fun onViewReady(savedInstanceState: Bundle? , intent: Intent?) {
        resolveDaggerDependency()
    }

    abstract fun getContentView(): Int
    protected open fun resolveDaggerDependency() {}

    protected fun getApplicationComponent(): ApplicationComponent? {
        return (application as TestApplication).getApplicationComponent()
    }

    protected fun showBackArrow() {
        val supportActionBar = supportActionBar

        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true)
            supportActionBar.setDisplayShowHomeEnabled(true)
            supportActionBar.setDisplayShowTitleEnabled(false)
        }
    }

}