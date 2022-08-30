package com.example.roomdatabase.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "Usuario",
    foreignKeys = [
        ForeignKey(entity = Sexo::class, parentColumns = ["id"], childColumns = ["SexoID"])]
)

data class Usuario(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    @ColumnInfo(name = "Nombre")
    var nombre: String,

    @ColumnInfo(name = "SexoID")
    var SexoID: Int
)