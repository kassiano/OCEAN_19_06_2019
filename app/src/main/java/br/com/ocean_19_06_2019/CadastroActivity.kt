package br.com.ocean_19_06_2019

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_cadastro.*

class CadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)


        btSalvar.setOnClickListener {
            
            val nome = etNome.text.toString()
            val sobrenome = etSobrenome.text.toString()

            tvResultado.text = "Oie $nome $sobrenome"
        }

    }
}
