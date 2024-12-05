package com.example.praktika15_fragments.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.praktika15_fragments.R
import com.example.praktika15_fragments.databinding.ActivityMainBinding
import com.example.praktika15_fragments.fragments.ListaFragment
import com.example.praktika15_fragments.fragments.ErropaGehituFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(R.id.frameContainer,ListaFragment()).commit()

        binding.boMenu.setOnItemSelectedListener {
            when(it.itemId){
               R.id.itemInicio       ->supportFragmentManager.beginTransaction().replace(R.id.frameContainer,ListaFragment()).commit()
               R.id.itemErropaGehitu -> supportFragmentManager.beginTransaction().replace(R.id.frameContainer,ErropaGehituFragment()).commit()
               R.id.itemSupport      ->  finishAffinity()
               R.id.itemSalir-> finish()
            }
            true
        }

    }
}