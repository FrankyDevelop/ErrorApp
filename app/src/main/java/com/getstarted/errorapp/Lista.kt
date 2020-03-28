package com.getstarted.errorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.getstarted.errorapp.adaptador.PrincipalAdapter
import com.getstarted.errorapp.data.UsuarioModel
import kotlinx.android.synthetic.main.activity_lista.*

class Lista : AppCompatActivity() {
    //esto se hace en el #5
    private lateinit var adapter: PrincipalAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)
        //se hace en el #5
        adapter= PrincipalAdapter(this)
         //todo #1 para lista
         rcLista.layoutManager=LinearLayoutManager(this)
         //rcLista.adapter=PrincipalAdapter(this)
        //se cambia en el #5
        rcLista.adapter=adapter

        //todo #5 obtener la informacion en la vista
        val dummyList= mutableListOf<UsuarioModel>()
        //creamos un elemento de prueba
        dummyList.add(UsuarioModel(
            "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Favatars0.githubusercontent.com%2Fu%2F9919%3Fs%3D280%26v%3D4&f=1&nofb=1",
            "Franky","Pasen el pack :v"))

        dummyList.add(UsuarioModel(
            "https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2Fwww.freevector.com%2Fsite_media%2Fpreview_images%2FFreeVector-Android-Logo.jpg&f=1&nofb=1",
            "Packman","Otra imagen"))

        dummyList.add(UsuarioModel(
            "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwallpapersite.com%2Fimages%2Fwallpapers%2Fandroid-oreo-2560x1440-android-8-stock-4k-9614.jpg&f=1&nofb=1",
            "Nuevo","Ultimate imagen"))

        adapter.setListData(dummyList)
        adapter.notifyDataSetChanged()
    }
}
