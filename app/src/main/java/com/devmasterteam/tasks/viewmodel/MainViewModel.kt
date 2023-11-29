/*
 * Copyright (c) 2023. Created by Alexsander at 11/29. All rights reserved.
 * GitHub: https://github.com/alexsanderfer/
 * Portfolio: https://alexsanderfer.netlify.app/
 */

package com.devmasterteam.tasks.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.devmasterteam.tasks.service.constants.TaskConstants
import com.devmasterteam.tasks.service.repository.SecurityPreferences

class MainViewModel(application: Application) : AndroidViewModel(application) {
    private val securityPreferences = SecurityPreferences(application.applicationContext)

    private val _userName = MutableLiveData<String>()
    val userName: LiveData<String> = _userName

    fun lougout() {
        securityPreferences.remove(TaskConstants.SHARED.TOKEN_KEY)
        securityPreferences.remove(TaskConstants.SHARED.PERSON_KEY)
        securityPreferences.remove(TaskConstants.SHARED.PERSON_NAME)
    }

    fun loadUserName() {
        _userName.value = securityPreferences.get(TaskConstants.SHARED.PERSON_NAME)
    }
}