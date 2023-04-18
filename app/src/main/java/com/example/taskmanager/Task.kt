package com.example.taskmanager

data class Task(val name: String, val category: TaskCategory, var isSelected: Boolean = false)