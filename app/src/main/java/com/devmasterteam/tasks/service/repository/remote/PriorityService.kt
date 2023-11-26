/*
 * Copyright (c) 2023. Created by Alexsander at 11/25. All rights reserved.
 * GitHub: https://github.com/alexsanderfer/
 * Portfolio: https://alexsanderfer.netlify.app/
 */

package com.devmasterteam.tasks.service.repository.remote

import com.devmasterteam.tasks.service.model.PriorityModel
import retrofit2.Call
import retrofit2.http.GET

interface PriorityService {
    @GET("Priority")
    fun list(): Call<List<PriorityModel>>

}