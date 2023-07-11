package com.example.roomdatabase.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "Sexo", indices = [Index(value = ["nombre"], unique = true)])
data class Sexo (
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    @ColumnInfo(name = "Nombre")
    var nombre: String
)
