/*
 * Copyright (c) 2023. Created by Alexsander at 11/25. All rights reserved.
 * GitHub: https://github.com/alexsanderfer/
 * Portfolio: https://alexsanderfer.netlify.app/
 */

package com.devmasterteam.tasks.service.listener

interface TaskListener {

    /**
     * Click para edição
     */
    fun onListClick(id: Int)

    /**
     * Remoção
     */
    fun onDeleteClick(id: Int)

    /**
     * Completa tarefa
     */
    fun onCompleteClick(id: Int)

    /**
     * Descompleta tarefa
     */
    fun onUndoClick(id: Int)

}