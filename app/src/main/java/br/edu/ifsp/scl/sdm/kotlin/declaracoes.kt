package br.edu.ifsp.scl.sdm.kotlin

fun main() {
    //declaração de variável
    var frase: String = "Hello, World!"
    println(frase)
    println("$frase")
    println("${frase}")
    println("Quantidade de caracteres: ${frase.count { it:Char -> it == 'l' }}")
    println("Quantidade caracteres: ${frase.length}")
}