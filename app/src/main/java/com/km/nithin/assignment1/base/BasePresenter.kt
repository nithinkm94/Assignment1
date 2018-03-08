package com.km.nithin.assignment1.base

import com.km.nithin.assignment1.mvp.view.BaseView
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.Subject
import java.util.concurrent.TimeUnit
import javax.inject.Inject

/**
 * Created by Nithin.Kumar on 3/8/2018.
 */
open class BasePresenter<V : BaseView> {

    @Inject
    lateinit var mView: V

    fun getView(): V? {
        return mView
    }

    protected fun <T> subscribe(observable: Observable<T>? , observer: Observer<T>) {
        observable?.subscribeOn(Schedulers.io())
                ?.observeOn(AndroidSchedulers.mainThread())
                ?.subscribe(observer)
    }
    protected fun <T> subscribeWithDebounce(observable: Observable<T>? , observer: Subject<T>) {
        observable?.debounce(500, TimeUnit.MILLISECONDS)?.subscribeOn(Schedulers.io())
                ?.observeOn(AndroidSchedulers.mainThread())
                ?.subscribe(observer)
    }
}