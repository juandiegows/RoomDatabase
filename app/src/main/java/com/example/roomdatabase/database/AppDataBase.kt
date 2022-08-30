package com.example.roomdatabase.database

import android.content.Context
import androidx.room.*
import androidx.sqlite.db.SupportSQLiteOpenHelper

@Database(entities = [Sexo::class, Usuario::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun SexoDAO(): ISexo
    abstract fun UsuarioDAO(): IUsuario

    companion object {
        @Volatile
        private var INSTANCIA: AppDataBase? = null

        fun GetDataBase(context: Context): AppDataBase {
            if (INSTANCIA != null) {
                return INSTANCIA!!
            }

            INSTANCIA = Room.databaseBuilder(
                context.applicationContext,
                AppDataBase::class.java,
                "DBTest"
            ).build()
            return INSTANCIA!!

        }


    }
}