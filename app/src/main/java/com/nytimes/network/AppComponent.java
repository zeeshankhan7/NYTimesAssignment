package com.nytimes.network;



import com.nytimes.activity.MainActivity;
import com.nytimes.fragment.ArticlesFragment;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = {NetWorkModule.class, AppModule.class})
public interface AppComponent {

//    void inject(UploadImageFragment uploadImageFragment);
    void inject(MainActivity mainActivity);
    void inject(ArticlesFragment articlesFragment);
}
