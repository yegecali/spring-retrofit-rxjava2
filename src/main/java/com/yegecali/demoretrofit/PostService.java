package com.yegecali.demoretrofit;

import io.reactivex.Observable;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

@Service
public class PostService implements JsonPlaceholderConfig{

    private PostRepository postRepository;

    public PostService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        postRepository = retrofit.create(PostRepository.class);
    }

    public Observable<List<Post>> getPosts() throws IOException {
        return postRepository.getAllPosts();
    }

}
