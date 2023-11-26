/*
 * Copyright (c) 2023. Created by Alexsander at 11/25. All rights reserved.
 * GitHub: https://github.com/alexsanderfer/
 * Portfolio: https://alexsanderfer.netlify.app/
 */

package com.devmasterteam.tasks.view.viewholder

import android.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.devmasterteam.tasks.service.listener.TaskListener
import com.devmasterteam.tasks.service.model.TaskModel
import com.devmasterteam.tasks.R
import com.devmasterteam.tasks.databinding.RowTaskListBinding

class TaskViewHolder(private val itemBinding: RowTaskListBinding, val listener: TaskListener) :
    RecyclerView.ViewHolder(itemBinding.root) {

    /**
     * Atribui valores aos elementos de interface e também eventos
     */
    fun bindData(task: TaskModel) {

        itemBinding.textDescription.text = ""
        itemBinding.textPriority.text = ""
        itemBinding.textDueDate.text = ""

        // Eventos
        // itemBinding.textDescription.setOnClickListener { listener.onListClick(task.id) }
        // itemBinding.imageTask.setOnClickListener { }

        itemBinding.textDescription.setOnLongClickListener {
            AlertDialog.Builder(itemView.context)
                .setTitle(R.string.remocao_de_tarefa)
                .setMessage(R.string.remover_tarefa)
                .setPositiveButton(R.string.sim) { dialog, which ->
                    // listener.onDeleteClick(task.id)
                }
                .setNeutralButton(R.string.cancelar, null)
                .show()
            true
        }

    }
}