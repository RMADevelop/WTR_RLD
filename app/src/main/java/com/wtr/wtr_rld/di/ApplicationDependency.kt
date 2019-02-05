package com.wtr.wtr_rld.di

import com.wtr.wtr_rld.WtrApp
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Singleton
@Component
interface AppComponent {

    fun inject(wtrApp: WtrApp)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun withApplication(wtrApp: WtrApp): Builder

        fun build(): AppComponent
    }
}

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideContext(wtrApp: WtrApp) = wtrApp.baseContext
}