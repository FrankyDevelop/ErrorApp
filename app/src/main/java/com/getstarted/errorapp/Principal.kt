package com.getstarted.errorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.getstarted.errorapp.viewmodel.FIrebaseViewModel
import kotlinx.android.synthetic.main.activity_principal.*

class Principal : AppCompatActivity() {

    private lateinit var viewModel: FIrebaseViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        btnperfil.setOnClickListener {
            startActivity(Intent(this,Perfil::class.java))
        }

        viewModel=ViewModelProvider(this).get(FIrebaseViewModel::class.java)

        btnAddProject.setOnClickListener {
            crearUsuario()
        }

    }

    //todo pasos para guardar #4

    //Crear usuario
    fun crearUsuario(){
        val nombre:String=edtNombre.text.toString().trim()
        val descripcion:String =edtDescripcion.text.toString().trim()

        if(nombre.isNotEmpty() && descripcion.isNotEmpty()){
            viewModel.crearUsuario(nombre,descripcion)
            Toast.makeText(this,"Usuario guardado exitosamente",Toast.LENGTH_SHORT).show()
        }else{
        }
    }
}
