package com.km.nithin.assignment1.util

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable



/**
 * Created by bineesh on 20/10/17.
 */
class DisposableManager() {
    companion object {
        private var compositeDisposable: CompositeDisposable? = null

        fun add(disposable: Disposable?) {
            if (disposable != null) {
                getDisposable().add(disposable)
            }
        }

        fun dispose() {
            getDisposable().dispose()
        }
        private fun getDisposable(): CompositeDisposable {
            if (compositeDisposable == null || compositeDisposable!!.isDisposed) {
                compositeDisposable = CompositeDisposable()
            }
            return compositeDisposable as CompositeDisposable
        }
    }




}