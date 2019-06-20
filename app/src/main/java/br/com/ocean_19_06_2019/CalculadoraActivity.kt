package br.com.ocean_19_06_2019

import android.content.Intent
import android.os.Bundle
import android.os.SystemClock
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_calculadora.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class CalculadoraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)


        btCalcular.setOnClickListener {


            if(etIdade.text.isNotEmpty()) {

                btCalcular.visibility = View.GONE
                progress.visibility = View.VISIBLE

                doAsync {
                    SystemClock.sleep(2000)

                    uiThread {
                        val idade = etIdade.text.toString().toInt()

                        val idadeCachorro = idade * 7

                        tvResultado.text = "A idade do seu cachorro é $idadeCachorro"

                        btCalcular.visibility = View.VISIBLE
                        progress.visibility = View.GONE

                    }

                }


            }else{
                etIdade.error = "Digite um valor"
            }

        }

        // github.com/kassiano

        btShare.setOnClickListener {

            val intentShare = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, tvResultado.text.toString())
                type = "text/plain"
            }

            startActivity(intentShare)

        }

    }
}
