package com.cooknow.cooknow

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.cooknow.cooknow.classes.Recetario

class BottomNavigationActivity : AppCompatActivity() {

    val recetario = Recetario()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)

        val diarioFragment = DiarioFragment()
        val recetarioFragment = RecetarioFragment()
        val listaCompraFragment = ListaCompraFragment()
        val perfilFragment = PerfilFragment()


        setCurrentFragment(diarioFragment)


        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        navView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.navigation_diario->setCurrentFragment(diarioFragment)
                R.id.navigation_recetario->setCurrentFragment(recetarioFragment)
                R.id.navigation_lista_compra->setCurrentFragment(listaCompraFragment)
                R.id.navigation_perfil->setCurrentFragment(perfilFragment)

                
            }
            true
        }

    }

    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.nav_host_fragment,fragment)
            commit()
        }
}