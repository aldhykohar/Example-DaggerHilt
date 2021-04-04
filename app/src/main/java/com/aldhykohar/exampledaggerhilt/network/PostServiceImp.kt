package com.aldhykohar.exampledaggerhilt.network

import com.aldhykohar.exampledaggerhilt.model.Post
import javax.inject.Inject


/**
 * Created by aldhykohar on 4/4/2021.
 */
class PostServiceImp @Inject constructor(private val postApiService: PostApiService) {

    suspend fun getPost():List<Post> = postApiService.getPost()
}