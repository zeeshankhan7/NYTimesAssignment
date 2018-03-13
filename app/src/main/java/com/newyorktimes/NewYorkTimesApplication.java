package com.newyorktimes;

import android.app.Application;

import com.newyorktimes.network.AppComponent;
import com.newyorktimes.network.AppModule;
import com.newyorktimes.network.DaggerAppComponent;
import com.newyorktimes.network.NetWorkModule;

/**
 * Created by punit.shrirao on 13-03-2018.
 */

public class NewYorkTimesApplication  extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .netWorkModule(new NetWorkModule())
                .build();

    }
    public AppComponent getAppComponent() {
        return appComponent;
    }
}