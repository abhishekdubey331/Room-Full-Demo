package com.roomdemo.myapplication.entitites.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.roomdemo.myapplication.entitites.Director
import com.roomdemo.myapplication.entitites.School

data class SchoolAndDirector(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director
)