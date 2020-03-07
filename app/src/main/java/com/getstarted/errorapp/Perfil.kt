package com.getstarted.errorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.activity_principal.*

class Perfil : AppCompatActivity() {


    lateinit var mAuth: FirebaseAuth
    var mUser: FirebaseUser? = null
    private lateinit var txtNombre: TextView
    private lateinit var txtCorreo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        txtNombre=findViewById(R.id.txtNombre)
        txtCorreo=findViewById(R.id.txtCorreo)
        //imgUsuario=findViewById(R.id.imgUsuario)


        mAuth = FirebaseAuth.getInstance()
        mUser = mAuth.currentUser


        val name: String? = mUser?.displayName
        val email: String? = mUser?.email

        txtNombre.text = name
        txtCorreo.text = email
    }
}
