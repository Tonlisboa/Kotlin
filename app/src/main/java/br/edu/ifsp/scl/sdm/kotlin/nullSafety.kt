package br.edu.ifsp.scl.sdm.kotlin

fun main() {
    var sobrenome: String?
    sobrenome = null
    if (sobrenome != null){
        println(sobrenome!!.capitalize())
    }
}