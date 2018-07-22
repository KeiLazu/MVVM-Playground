package com.gastropodinteractive.mvvmplayground.di.modules;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Kei Lazu on 7/22/2018
 * check https://github.com/KeiLazu for more
 */
@Module
public class AppModule {

    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

}
