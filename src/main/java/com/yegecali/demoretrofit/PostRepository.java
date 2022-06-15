package com.yegecali.demoretrofit;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface PostRepository {
    @GET("posts")
    Observable<List<Post>> getAllPosts();
}
