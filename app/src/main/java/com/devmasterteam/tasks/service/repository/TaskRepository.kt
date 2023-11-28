/*
 * Copyright (c) 2023. Created by Alexsander at 11/28. All rights reserved.
 * GitHub: https://github.com/alexsanderfer/
 * Portfolio: https://alexsanderfer.netlify.app/
 */

package com.devmasterteam.tasks.service.repository

import android.content.Context
import com.devmasterteam.tasks.service.listener.APIListener
import com.devmasterteam.tasks.service.model.TaskModel
import com.devmasterteam.tasks.service.repository.remote.RetrofitClient
import com.devmasterteam.tasks.service.repository.remote.TaskService

class TaskRepository(context: Context) : BaseRepository(context) {
    private val remote = RetrofitClient.getService(TaskService::class.java)

    fun list(listener: APIListener<List<TaskModel>>) {
        executeCall(remote.list(), listener)
    }

    fun listNext7Days(listener: APIListener<List<TaskModel>>) {
        executeCall(remote.listNext7Days(), listener)
    }

    fun listOverdue(listener: APIListener<List<TaskModel>>) {
        executeCall(remote.listOverdue(), listener)
    }

    fun create(task: TaskModel, listener: APIListener<Boolean>) {
        executeCall(
            remote.create(
                task.priorityId, task.description, task.dueDate, task.complete
            ), listener
        )
    }

    fun delete(id: Int, listener: APIListener<Boolean>) {
        executeCall(remote.delete(id), listener)
    }

}