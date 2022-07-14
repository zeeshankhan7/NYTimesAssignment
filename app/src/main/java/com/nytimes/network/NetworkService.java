package com.nytimes.network;

import com.nytimes.model.Response;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by Zeeshan on 14-07-2022.
 */

public interface NetworkService {


    @GET("svc/mostpopular/v2/mostviewed/all-sections/7.json?api-key=UIeodAIHPs6MX5wvxE3O50Nw2H82sbzz")
    Observable<Response> getBaseURL();
}
