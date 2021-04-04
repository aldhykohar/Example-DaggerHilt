package com.aldhykohar.exampledaggerhilt.viewmodel

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.aldhykohar.exampledaggerhilt.model.Post
import com.aldhykohar.exampledaggerhilt.repository.PostRepository
import kotlinx.coroutines.flow.catch


/**
 * Created by aldhykohar on 4/4/2021.
 */
class PostViewModel
@ViewModelInject
constructor(private val postRepository: PostRepository) : ViewModel() {

    val response: LiveData<List<Post>> = postRepository.getPost()
        .catch { e ->
            Log.e("main", "${e.message}")
        }.asLiveData()

}