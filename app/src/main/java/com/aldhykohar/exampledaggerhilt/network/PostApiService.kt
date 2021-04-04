package com.aldhykohar.exampledaggerhilt.network

import com.aldhykohar.exampledaggerhilt.model.Post
import retrofit2.http.GET


/**
 * Created by aldhykohar on 4/4/2021.
 */
interface PostApiService {

    @GET("posts")
    suspend fun getPost(): List<Post>
}