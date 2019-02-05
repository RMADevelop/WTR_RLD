package com.wtr.wtr_rld

import android.app.Application
import com.wtr.wtr_rld.di.ComponentInjector

class WtrApp : Application() {

    override fun onCreate() {
        super.onCreate()

        ComponentInjector.injectAppComponent(this)
    }
}