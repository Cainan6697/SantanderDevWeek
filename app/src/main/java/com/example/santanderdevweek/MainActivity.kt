package com.example.santanderdevweek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        minhaIdade()
    }

//     Declaração de variáveis
//     val = não pode ser mudado
//     var = mutável
//    var contador : int = 10;
//    contador = 11;
//    val contador2 : int = 12;
//     Segurança Nula
//    val languageName : String? = null;
//     Condicionais
//    var idade : int = 24;
//    if(idade > 18) {
//        println("Maior de idade");
//    } else {
//        println("Menor de idade");
//    }
//     Outra forma:
//     val maiorIdade : String = if(idade > 18) {
//         "Maior de idade"
//     } else {
//         "Menor de idade"
//     }
//     Usando when
//    val maiorIdade : String = when {
//        idade > 18 -> "Maior de idade"
//        else -> "Menor de idade"
//    }
//     Funções
//    fun minhaIdade() : String {
//        return "Minha idade é 23"
//   }
//     Forma simplificada
//    fun minhaIdade() : String = "Minha idade é 23"
}