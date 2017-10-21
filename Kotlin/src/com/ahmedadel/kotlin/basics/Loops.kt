package com.ahmedadel.kotlin.basics

fun main(args: Array<String>) {

    // Traditional For Loop
    for(a in 1..100) {
        println(a)
    }

    println("------------------------------------------------")

    // Define range in a variable
    val numbers = 1..100
    for (a in numbers) {
        print(a)
    }

    println("------------------------------------------------")

    // Reverse For Loop
    for (a in 100 downTo 1) {
        println(a)
    }

    println("------------------------------------------------")

    // Traditional For Loop with step
    for (a in 100 downTo 1 step 5) {
        println(a)
    }

    println("------------------------------------------------")

    // Iterate over array list of strings
    val firstItems = listOf("apple", "banana", "kiwi")
    for (item in firstItems) {
        println(item)
    }

    println("------------------------------------------------")

    // Iterate over array list of strings by index
    val secondItems = listOf("apple", "banana", "kiwi")
    for (index in secondItems.indices) {
        println("item at $index is ${secondItems[index]}")
    }

    println("------------------------------------------------")

    // Iterate over array list of strings by value and index
    val thirdItems = listOf("apple", "banana", "kiwi")
    for ((index, value) in thirdItems.withIndex()) {
        println("the element at $index is $value")
    }

    println("------------------------------------------------")

    // Traditional For Loop with continue
    for (i in 1..100) {
        if (i % 2 == 0) {
            continue
        }
    }

    println("------------------------------------------------")

    // Traditional For Loop with break
    outer@ for (i in 1..100) {
        for (j in 1..100) {
            if (j % i == 0) {
                break@outer
            }
        }
    }

    println("------------------------------------------------")

    // Traditional While Loop
    val items = listOf("apple", "banana", "kiwi")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }

}