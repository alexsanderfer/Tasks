/*
 * Copyright (c) 2023. Created by Alexsander at 11/25. All rights reserved.
 * GitHub: https://github.com/alexsanderfer/
 * Portfolio: https://alexsanderfer.netlify.app/
 */

package com.devmasterteam.tasks.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.devmasterteam.tasks.databinding.ActivityRegisterBinding
import com.devmasterteam.tasks.viewmodel.RegisterViewModel

class RegisterActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var viewModel: RegisterViewModel
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Variáveis da classe
        viewModel = ViewModelProvider(this).get(RegisterViewModel::class.java)
        binding = ActivityRegisterBinding.inflate(layoutInflater)

        // Eventos
        binding.buttonSave.setOnClickListener(this)

        // Layout
        setContentView(binding.root)
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}