package com.gastropodinteractive.mvvmplayground.di.builder;

import com.gastropodinteractive.mvvmplayground.activites.MainActivity;
import com.gastropodinteractive.mvvmplayground.activites.MainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Kei Lazu on 7/22/2018
 * check https://github.com/KeiLazu for more
 */

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = {
            MainActivityModule.class
    })
    abstract MainActivity bindMainActivity();

}
