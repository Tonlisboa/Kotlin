package br.edu.ifsp.scl.sdm.kotlin

fun multiplo (a: Int, b: Int) : Boolean{
    val c: Int = a % b
    if (c == 0){
        return true
    }
    return false
}

infix fun Int.multiploo(b: Int): Boolean{
    return multiplo(this, b)
}

fun main() {
    println(multiplo(11,2))
    println(10.multiploo(2))
    println(10 multiploo 2)
}