package com.roomdemo.myapplication.entitites

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class School(
    @PrimaryKey(autoGenerate = false)
    val schoolName : String
)