package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta

class FakeData {
    fun getLocalData(): Conta {
        val cliente = Cliente("Cainan")
        val cartao = Cartao("000222244443666")
        return Conta(
            "003366-6",
            "0336-6",
            "R$ 3.000,00",
            "R$6.000,00",
            cliente,
            cartao
        );
    }
}