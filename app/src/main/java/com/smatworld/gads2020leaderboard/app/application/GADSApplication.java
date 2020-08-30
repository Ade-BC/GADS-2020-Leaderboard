package com.smatworld.gads2020leaderboard.app.application;

import android.app.Application;

import com.smatworld.gads2020leaderboard.app.di.ApplicationComponent;
import com.smatworld.gads2020leaderboard.app.di.DaggerApplicationComponent;

public class GADSApplication extends Application {

    // ApplicationComponent lives in the Application class to share its lifecycle
    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        // Reference to the application graph that is used across the whole app by Activities
        // Creates an instance of ApplicationComponent using its Factory constructor
        // We pass the applicationContext that will be used as Context in the graph
        mApplicationComponent = DaggerApplicationComponent.factory().create(this);
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }
}
