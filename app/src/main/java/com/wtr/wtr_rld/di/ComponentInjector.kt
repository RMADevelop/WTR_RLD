package com.wtr.wtr_rld.di

import com.wtr.wtr_rld.WtrApp

object ComponentInjector {

    lateinit var appComponent: AppComponent

    fun injectAppComponent(wtrApp: WtrApp): AppComponent {
        appComponent = DaggerAppComponent.builder()
            .withApplication(wtrApp)
            .build()
        return appComponent
    }
}