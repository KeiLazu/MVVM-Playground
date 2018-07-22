package com.gastropodinteractive.mvvmplayground.di.components;

import android.app.Application;

import com.gastropodinteractive.mvvmplayground.MvvmApp;
import com.gastropodinteractive.mvvmplayground.di.builder.ActivityBuilder;
import com.gastropodinteractive.mvvmplayground.di.modules.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by Kei Lazu on 7/22/2018
 * check https://github.com/KeiLazu for more
 */
@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, ActivityBuilder.class})
public interface AppComponent {

    void inject(MvvmApp app);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

}
