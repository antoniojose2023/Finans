package br.com.devmobile.finans.view.util

import java.io.Serializable
import kotlin.math.pow

class CalculoInvertimento(
    var capitalInicial: Double = 0.0,
    var aporteMensal: Double = 0.0,
    var taxaJurosMensal: Double = 0.0,
    var ano: Int = 0): Serializable {

    fun getMontanteTotal(): Double{
        val meses = ano * 12

        val fatorJuros = (1.0 + taxaJurosMensal).pow(meses.toDouble())

        val montanteInicial = capitalInicial * fatorJuros

        val montanteAportes = aporteMensal * ((fatorJuros - 1.0) / taxaJurosMensal)

        return montanteInicial + montanteAportes
    }

    fun getLurco(): Double{
        return getMontanteTotal() - getTotalInverstido()
    }

    fun getTotalInverstido(): Double{
        val meses = ano * 12
         return capitalInicial + (aporteMensal * meses)
    }

}