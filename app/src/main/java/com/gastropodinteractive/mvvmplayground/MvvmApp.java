package com.gastropodinteractive.mvvmplayground;

import android.app.Activity;
import android.app.Application;

import com.gastropodinteractive.mvvmplayground.di.components.DaggerAppComponent;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by Kei Lazu on 7/22/2018
 * check https://github.com/KeiLazu for more
 */
public class MvvmApp extends Application implements HasActivityInjector {

    DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return activityDispatchingAndroidInjector;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        DaggerAppComponent.builder()
                .application(this)
                .build()
                .inject(this);

    }
}
