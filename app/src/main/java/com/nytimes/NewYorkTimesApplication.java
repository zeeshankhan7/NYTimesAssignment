package com.nytimes;

import android.app.Application;

import com.nytimes.network.AppComponent;
import com.nytimes.network.AppModule;
import com.nytimes.network.DaggerAppComponent;
import com.nytimes.network.NetWorkModule;

/**
 * Created by Zeeshan on 14-07-2022.
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