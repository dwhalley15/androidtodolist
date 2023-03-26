package com.example.todolist

interface TaskItemListener {

    fun editTaskItem(taskItem: TaskItem)

    fun completedTaskItem(taskItem: TaskItem)
}