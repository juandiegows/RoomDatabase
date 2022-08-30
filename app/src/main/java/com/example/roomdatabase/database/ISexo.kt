package com.example.roomdatabase.database

import androidx.room.*
import androidx.room.OnConflictStrategy.IGNORE

@Dao
interface ISexo {
    @Query("SELECT * FROM Sexo")
    fun Get(): List<Sexo>

    @Query("SELECT * FROM Sexo WHERE id = :id")
    suspend fun Get(id: Int): Sexo

    @Insert(onConflict = IGNORE)
    suspend fun Add(Sexo: Sexo)

    @Update(onConflict = IGNORE)
    suspend fun Update(Sexo: Sexo)

    @Delete
    suspend fun Delete(Sexo: Sexo)






}