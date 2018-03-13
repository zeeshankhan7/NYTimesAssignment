package com.newyorktimes.network;

import com.newyorktimes.model.Response;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by punit.shrirao on 09-05-2017.
 */

public interface NetworkService {


    @GET("svc/mostpopular/v2/mostviewed/all-sections/7.json?api-key=aea8b7c7a56e4bdd994a1325a61869ec")
    Observable<Response> getBaseURL();
}
