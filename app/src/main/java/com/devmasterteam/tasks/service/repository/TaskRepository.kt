/*
 * Copyright (c) 2023. Created by Alexsander at 11/28. All rights reserved.
 * GitHub: https://github.com/alexsanderfer/
 * Portfolio: https://alexsanderfer.netlify.app/
 */

package com.devmasterteam.tasks.service.repository

import android.content.Context
import com.devmasterteam.tasks.R
import com.devmasterteam.tasks.service.listener.APIListener
import com.devmasterteam.tasks.service.model.TaskModel
import com.devmasterteam.tasks.service.repository.remote.RetrofitClient
import com.devmasterteam.tasks.service.repository.remote.TaskService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TaskRepository(val context: Context) : BaseRepository() {
    private val remote = RetrofitClient.getService(TaskService::class.java)

    // Função extraída para TaskModel
    private fun extracted(call: Call<List<TaskModel>>, listener: APIListener<List<TaskModel>>) {
        call.enqueue(object : Callback<List<TaskModel>> {
            override fun onResponse(call: Call<List<TaskModel>>, response: Response<List<TaskModel>>) {
                handleResponse(response, listener)
            }

            override fun onFailure(call: Call<List<TaskModel>>, t: Throwable) {
                listener.onFailure(context.getString(R.string.ERROR_UNEXPECTED))
            }
        })
    }

    // Função extraída para Boolean - create & delete methods.
    private fun extracted2(call: Call<Boolean>, listener: APIListener<Boolean>) {
        call.enqueue(object : Callback<Boolean> {
            override fun onResponse(call: Call<Boolean>, response: Response<Boolean>) {
                handleResponse(response, listener)
            }

            override fun onFailure(call: Call<Boolean>, t: Throwable) {
                listener.onFailure(context.getString(R.string.ERROR_UNEXPECTED))
            }
        })
    }

    fun list(listener: APIListener<List<TaskModel>>) {
        val call = remote.list()
        extracted(call, listener)
    }

    fun listNext7Days(listener: APIListener<List<TaskModel>>) {
        val call = remote.listNext7Days()
        extracted(call, listener)
    }

    fun listOverdue(listener: APIListener<List<TaskModel>>) {
        val call = remote.listOverdue()
        extracted(call, listener)
    }

    fun create(task: TaskModel, listener: APIListener<Boolean>) {
        val call = remote.create(task.priorityId, task.description, task.dueDate, task.complete)
        extracted2(call, listener)
    }

    fun delete(id: Int, listener: APIListener<Boolean>) {
        val call = remote.delete(id)
        extracted2(call, listener)
    }
}