package com.example.myapplication.bean

data class Fiction(
    var children: List<String> = listOf(),
    var courseId: Int  = 0 ,
    var id:  Int  = 0 ,
    var name: String = "",
    var order:  Int  = 0 ,
    var parentChapterId:  Int  = 0 ,
    var userControlSetTop: Boolean = false,
    var visible: Int = 1
)