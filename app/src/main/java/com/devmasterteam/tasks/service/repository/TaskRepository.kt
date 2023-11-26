/*
 * Copyright (c) 2023. Created by Alexsander at 11/26. All rights reserved.
 * GitHub: https://github.com/alexsanderfer/
 * Portfolio: https://alexsanderfer.netlify.app/
 */

package com.devmasterteam.tasks.service.repository

import com.devmasterteam.tasks.service.repository.remote.RetrofitClient
import com.devmasterteam.tasks.service.repository.remote.TaskService

class TaskRepository {
    private val remote = RetrofitClient.getService(TaskService::class.java)
}