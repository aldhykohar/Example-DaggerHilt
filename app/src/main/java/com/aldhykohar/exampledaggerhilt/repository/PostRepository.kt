package com.aldhykohar.exampledaggerhilt.repository

import com.aldhykohar.exampledaggerhilt.model.Post
import com.aldhykohar.exampledaggerhilt.network.PostServiceImp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject


/**
 * Created by aldhykohar on 4/4/2021.
 */
class PostRepository
@Inject
constructor(private val postServiceImp: PostServiceImp) {

    fun getPost():Flow<List<Post>> = flow {
        val response = postServiceImp.getPost()
        emit(response)
    }.flowOn(Dispatchers.IO)
}