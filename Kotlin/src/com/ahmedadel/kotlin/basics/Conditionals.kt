package com.ahmedadel.kotlin.basics

import java.lang.Integer.parseInt

fun main(args: Array<String>) {

    val a = 10
    val b = 20
    var max = 50
    val twentyString = "20"
    val validNumbers = listOf(10, 20)

    // Traditional If Condition
    if (a < b) max = b
    println(max)

    println("------------------------------------------------")

    // Traditional If Condition With Else
    if (a > b) {
        max = a
    } else {
        max = b
    }
    println(max)

    println("------------------------------------------------")

    // Traditional If Condition As Expression
    max = if (a > b) {
        a
    } else {
        b
    }
    println(max)

    println("------------------------------------------------")

    // Traditional If Condition As Expression in One Line
    val result = if (a > b) a else b
    println(result)

    println("------------------------------------------------")

    // when replaces the switch operator of C-like languages
    // Traditional When
    when (a) {
        10 -> print("a == 10")
        20 -> print("b == 20")
        else -> { // acting as a default case like switch of C-like languages and it is mandatory
            print("a is neither 10 nor 20")
        }
    }

    println("------------------------------------------------")

    // If many cases should be handled in the same way, the branch conditions may be combined with a comma:
    when (b) {
        10, 20 -> print("b == 10 or b == 20")
        else -> print("otherwise")
    }

    println("------------------------------------------------")

    // We can use arbitrary expressions (not only constants) as branch conditions
    when (b) {
        parseInt(twentyString) -> print("twentyString encodes to 20")
        else -> print("s does not encode twentyString")
    }

    println("------------------------------------------------")

    // We can also check a value for being in or !in a range or a collection:
    when (a) {
        in 1..10 -> print("a is in the range")
        in validNumbers -> print("a is valid")
        !in 10..20 -> print("a is outside the range")
        else -> print("none of the above")
    }

    println("------------------------------------------------")

    // Another possibility is to check that a value is or !is of a particular type.
    fun hasPrefix(x: Any) = when(x) {
        is String -> x.startsWith("prefix")
        else -> false
    }
    print(hasPrefix("prefixString"))

}