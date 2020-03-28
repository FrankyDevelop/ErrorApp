package com.getstarted.errorapp.data

import com.google.firebase.firestore.FirebaseFirestore
import kotlin.Comparable as Comparable1

class FirebaseRepo {
    //todo pasos para guardar info  #1
    //Instancia FIrestore
    val db = FirebaseFirestore.getInstance()
     //Pasar info
    fun AgregarUsuario(nombre:String,descripcion:String){
        //Estructura de la coleccion
        val userHashMap = hashMapOf(
            "Nombre" to nombre,
            "Descripcion" to descripcion
        )

        //Coleccion
        db.collection("Usuarios")
            .add(userHashMap).addOnCompleteListener {
                if (it.isSuccessful){
                    //algo
                }else{
                    //algo
                }
            }
    }
}