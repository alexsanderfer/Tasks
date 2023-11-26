/*
 * Copyright (c) 2023. Created by Alexsander at 11/25. All rights reserved.
 * GitHub: https://github.com/alexsanderfer/
 * Portfolio: https://alexsanderfer.netlify.app/
 */

package com.devmasterteam.tasks.service.model

import com.google.gson.annotations.SerializedName

class PersonModel {

    @SerializedName("token")
    lateinit var token: String

    @SerializedName("personKey")
    lateinit var personKey: String

    @SerializedName("name")
    lateinit var name: String

}