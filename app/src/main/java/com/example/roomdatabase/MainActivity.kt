package com.example.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.roomdatabase.database.AppDataBase
import com.example.roomdatabase.database.Sexo
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception

class MainActivity : AppCompatActivity() {
   lateinit var db:AppDataBase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        db = AppDataBase.GetDataBase(this)
        Agregar()
    }

    fun Agregar() {
        CoroutineScope(Dispatchers.IO).launch {
         try{
             db.SexoDAO().Add(Sexo(0,"Juan"))
            var lista = db.SexoDAO().Get()
             Log.e("Exito", "Agregar:${lista.size}" )
         }catch (e:Exception){
             Log.e("Error", "Error ${e.message}" )
         }


        }

    }
}