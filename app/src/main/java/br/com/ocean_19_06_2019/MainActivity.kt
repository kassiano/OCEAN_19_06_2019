package br.com.ocean_19_06_2019

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



//        val preco:Float = 10F
//        val inteiro:Int = 3
//        val boleano:Boolean = true
//
//        val teste:String? = null
//        teste = "novo valor"
//
//        var variavel = "teste"
//        variavel = "novo valor"

        var qtdCliques = 0

        btClique.setOnClickListener {
            qtdCliques ++

            val text :String = "Samsumg $qtdCliques"
            tvHello.text = text
        }

        btCadastro.setOnClickListener {

            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)

        }

        btCalculadora.setOnClickListener {

            val intent = Intent(this, CalculadoraActivity::class.java)
            startActivity(intent)

        }

    }

}
