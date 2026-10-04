package br.com.devmobile.finans.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import br.com.devmobile.finans.R
import java.text.NumberFormat
import java.util.Locale

class ResultadoFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_resultado, container, false)

        val locale = Locale("pt", "BR")
        val formatador = NumberFormat.getCurrencyInstance(locale)

        val montanteTotal = arguments?.getSerializable("MONTANTETOTAL")
        val valorInvestido = arguments?.getSerializable("INVESTIMENTOTOTAL")
        val lucro = arguments?.getSerializable("LUCRO")

        view.findViewById<TextView>(R.id.tvMontanteTotal).text = "${formatador.format(montanteTotal)}"
        view.findViewById<TextView>(R.id.tvTotalInvestido).text = "${formatador.format(valorInvestido)}"
        view.findViewById<TextView>(R.id.tvLucro).text = "${formatador.format(lucro)}"

        return view
    }


}