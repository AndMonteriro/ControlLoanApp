package com.example.andre.monteiro.controlloan

import android.content.Context

object EquipamentoService {
    fun getEquipamentos(context: Context): List<Equipamento>{
        val equipamentos = mutableListOf<Equipamento>()
        for (i in 1..3) {
            val e =  Equipamento()
            e.Equipamento = "Equipamento $i"
            e.modelo = "Modelo $i"
            e.marca = "marca $i"
            e.foto = "https://img.clasf.com.br/2018/01/16/Ultra-book-ASUS-i5-aceito-troca-20180116132921.jpg"
            equipamentos.add(e)
        }
        return equipamentos
    }

}