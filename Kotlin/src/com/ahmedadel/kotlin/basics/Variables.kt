package com.ahmedadel.kotlin.basics

fun main(args: Array<String>) {

    // Mutable variables :
    var x = 5
    x += 1
    println("x = $x")

    println("------------------------------------------------")

    // Immutable variables :
    val a = 1
    val b = 2 + a
    val c: Int = 3 + b
    println("a = $a, b = $b, c = $c")

    println("------------------------------------------------")

    // Data Types :
    val longType = 100L
    val floatType = 100F
    val hexaDecimalType = 0x0F
    val binaryType = 0b01
    println("long type : $longType " +
            "float type : $floatType " +
            "hexadecimal type : $hexaDecimalType " +
            "binary type : $binaryType")

    println("------------------------------------------------")

    // Explicit Casting from Integer to Double :
    val integer = 100
    val double: Long = integer.toLong()
    println("Casting Integer to Double : $double")

    println("------------------------------------------------")

    // Characters and Strings
    val charType = 'A'
    val stringType = "My String"
    val multipleLinesString = """
        This is a string
        And this is another line
        """
    println("Character : $charType , String Type : $stringType , Multiple Lines String : $multipleLinesString")

    println("------------------------------------------------")

    // simple name in template:
    val cost = 50
    val totalCost = "It costs $cost dollars"
    println(totalCost)
    // arbitrary expression in template :
    val myName = "Ahmed Adel"
    val lengthOfMyName = "The length of of my name is ${myName.length} characters"
    println(lengthOfMyName)

}