package com.example.roomdatabase.database

import androidx.room.*
@Dao
interface IUsuario {
    @Query("SELECT * FROM Usuario")
    fun Get(): List<Usuario>

    @Query("SELECT * FROM Usuario WHERE id = :id")
    suspend fun Get(id: Int): Usuario

    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun Add(Usuario: Usuario)

    @Update(onConflict = OnConflictStrategy.ABORT)
    suspend fun Update(Usuario: Usuario)

    @Delete
    suspend fun Delete(Usuario: Usuario)


}