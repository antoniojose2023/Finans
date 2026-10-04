package br.com.devmobile.finans.view

import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.com.devmobile.finans.R
import br.com.devmobile.finans.databinding.ActivityResultadoBinding
import br.com.devmobile.finans.view.fragment.ResultadoFragment
import br.com.devmobile.finans.view.util.CalculoInvertimento
import java.text.NumberFormat
import java.util.Locale

class ResultadoActivity : AppCompatActivity() {

    private val binding by lazy { ActivityResultadoBinding.inflate(layoutInflater) }
    private var calculoInvertimento = CalculoInvertimento()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        val bundle = intent.extras

        if(bundle != null){

              calculoInvertimento = if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU){
                   bundle.getSerializable("CalcInvestimento", CalculoInvertimento::class.java) as CalculoInvertimento
              }else{
                   bundle.getSerializable("CalcInvestimento") as CalculoInvertimento
              }
        }


        binding.ivVoltar.setOnClickListener {
             finish()
        }


        val resultadoFragment = ResultadoFragment()
        val argumento = bundleOf(
            "MONTANTETOTAL" to calculoInvertimento.getMontanteTotal(),
             "INVESTIMENTOTOTAL" to calculoInvertimento.getTotalInverstido(),
             "LUCRO" to calculoInvertimento.getLurco()
        )

        resultadoFragment.arguments = argumento

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragemtContainer, resultadoFragment)
            .commit()

    }
}