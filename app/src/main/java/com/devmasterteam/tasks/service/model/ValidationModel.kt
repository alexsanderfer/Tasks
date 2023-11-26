/*
 * Copyright (c) 2023. Created by Alexsander at 11/25. All rights reserved.
 * GitHub: https://github.com/alexsanderfer/
 * Portfolio: https://alexsanderfer.netlify.app/
 */

package com.devmasterteam.tasks.service.model

class ValidationModel(message: String = "") {
    private var status: Boolean = true
    private var validationMessage: String = ""

    init {
        if (message.isNotEmpty()) {
            validationMessage = message
            status = false
        }
    }

    fun status() = status
    fun message() = validationMessage
}