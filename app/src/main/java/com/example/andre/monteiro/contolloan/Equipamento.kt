package com.example.andre.monteiro.controlloan

import java.io.Serializable

class Equipamento : Serializable{
    var id: Long = 0
    var Equipamento : String = ""
    var modelo: String =""
    var marca: String = ""
    var foto: String = ""

    override fun toString(): String {
        return "Equipamento (Tipo= '$Equipamento', )"
    }

}