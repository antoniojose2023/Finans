package br.com.devmobile.finans.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.com.devmobile.finans.R
import br.com.devmobile.finans.databinding.ActivityCalculoSimulacaoBinding
import br.com.devmobile.finans.view.util.CalculoInvertimento

class CalculoSimulacaoActivity : AppCompatActivity() {
    private val binding by lazy{ ActivityCalculoSimulacaoBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btCalcularSimulacao.setOnClickListener {
             val valorInicial = binding.editValorInicial.text.toString().replace(",", ".")
             val aporte = binding.editAportemensal.text.toString().replace(",", ".")
             val taxaJuros = binding.editTaxaJuros.text.toString().replace(",", ".")
             val tempo = binding.editTempo.text.toString()

             if(valorInicial.isNotEmpty() && aporte.isNotEmpty() && taxaJuros.isNotEmpty() && tempo.isNotEmpty()){
                 val calculoInvertimento = CalculoInvertimento(valorInicial.toDouble(), aporte.toDouble(), taxaJuros.toDouble(), tempo.toInt())
                 val intent = Intent(this, ResultadoActivity::class.java)
                 intent.putExtra("CalcInvestimento", calculoInvertimento)
                 startActivity( intent )
             }else{
                 Toast.makeText(this, "Existem campos vázios", Toast.LENGTH_SHORT).show()
             }


        }



    }

}