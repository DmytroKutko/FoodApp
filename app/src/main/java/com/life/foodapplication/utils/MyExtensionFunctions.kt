package com.life.foodapplication.utils

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

fun <T> LiveData<T>.observeOnce(lifecycleOwner: LifecycleOwner, observer: Observer<T>){
    observe(lifecycleOwner, object : Observer<T> {
        override fun onChanged(p0: T) {
            removeObserver(this)
            observer.onChanged(p0)
        }
    })
}