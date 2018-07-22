package com.gastropodinteractive.mvvmplayground.activites;

import android.arch.lifecycle.ViewModelProvider;

import com.gastropodinteractive.mvvmplayground.ViewModelProviderFactory;

import dagger.Module;

/**
 * Created by Kei Lazu on 7/22/2018
 * check https://github.com/KeiLazu for more
 */
@Module
public class MainActivityModule {

    ViewModelProvider.Factory mainViewModelProvider(MainViewModel mainViewModel) {
        return new ViewModelProviderFactory<>(mainViewModel);
    }

}
