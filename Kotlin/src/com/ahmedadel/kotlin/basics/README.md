# Basics in Kotlin

In Kotlin, everything is an object in the sense that we can call member 
functions and properties on any variable. 

Some of the types can have a special 
internal representation - for example, numbers, characters and booleans can be 
represented as primitive values at runtime - 
but to the user they look like ordinary classes. 

In this section we describe 
the basic types used in Kotlin: numbers, characters, booleans, 
and strings. 

Also we will take a look on Control Flow like : if, when, for and while.

-----------------------------------------------------------------------------------------------------

## Variables :

1. Data Types : 

Every number type supports the following conversions :
```kotlin
toByte(): Byte
toShort(): Short
toInt(): Int
toLong(): Long
toFloat(): Float
toDouble(): Double
toChar(): Char
```

Example :
 ```kotlin
 val longType = 100L
 val floatType = 100F
 val hexaDecimalType = 0x0F
 val binaryType = 0b01
 println("long type : $longType " +
         "float type : $floatType " +
         "hexadecimal type : $hexaDecimalType " +
         "binary type : $binaryType")

// Explicit Casting/Conversion from Integer to Double :
val integer = 100
val double: Long = integer.toLong()
println("Casting/Conversion the Integer to Double : $double")
```
 
 -----------------------------------------------------------------------------------------------------
 
2. Characters and Strings : 

Characters are represented by the type ``` Char ```. They can not be treated directly as numbers :
```kotlin
fun check(c: Char) {
    if (c == 1) {
        println("true")
    }
}
```

Strings are represented by the type ``` String ```. Strings are immutable. Elements of a string are characters that can be accessed by the indexing operation: s[i]. A string can be iterated over with a for-loop :
```kotlin
for (c in str) {
    println(c)
}
```
Example :
```kotlin
val charType = 'A'
val stringType = "My String"
val multipleLinesString = """
        This is a string
        And this is another line
        """
println("Character : $charType , String Type : $stringType , Multiple Lines String : $multipleLinesString")
```

 -----------------------------------------------------------------------------------------------------

3. Mutable and Immutable variables :

we just need to write ``` var ``` for mutable or ``` val ``` for immutable depending on the type of variable we want to generate, and the type can normally be inferred.

a. Mutable Variables :
```kotlin
    var x = 5
    x += 1
    println("x = $x")
```
b. Immutable Variables :
```kotlin
    val a = 1
    val b = 2 + a
    val c: Int = 3 + b
    println("a = $a, b = $b, c = $c")
```

-----------------------------------------------------------------------------------------------------

4. String Template :

Strings may contain template expressions, i.e. pieces of code that are evaluated and whose results are concatenated into the string. A template expression starts with a dollar sign ($) and consists of either a simple name :
```kotlin
val cost = 50
val totalCost = "It costs $cost dollars"
println(totalCost)

// arbitrary expression in template :
val myName = "Ahmed Adel"
val lengthOfMyName = "The length of of my name is ${myName.length} characters"
println(lengthOfMyName)
```

-----------------------------------------------------------------------------------------------------

## Conditionals :

1. Traditional usage :

In Kotlin, ``` if ``` is an expression, i.e. it returns a value. Therefore there is no ternary operator (condition ? then : else), because ordinary ``` if ``` works fine in this role.

Example :
```kotlin
// Traditional If Condition
if (a < b) max = b
println(max)

// Traditional If Condition With Else
if (a > b) {
    max = a
} else {
    max = b
}
println(max)

// Traditional If Condition As Expression
max = if (a > b) {
    a
} else {
    b
}
println(max)

// Traditional If Condition As Expression in One Line
val result = if (a > b) a else b
println(result)
```
 
-----------------------------------------------------------------------------------------------------
 
2. When Expression :

``` when ``` replaces the ``` switch ``` operator of C-like languages. The ``` else ``` is acting as a ``` default ```  case like switch of C-like languages and it is mandatory.

Example :
```kotlin
// Traditional When
when (a) {
    10 -> print("a == 10")
    20 -> print("b == 20")
    else -> {
            print("a is neither 10 nor 20")
    }
}

// If many cases should be handled in the same way, the branch conditions may be combined with a comma:
when (b) {
    10, 20 -> print("b == 10 or b == 20")
    else -> print("otherwise")
}

// We can use arbitrary expressions (not only constants) as branch conditions
when (b) {
    parseInt(twentyString) -> print("twentyString encodes to 20")
    else -> print("s does not encode twentyString")
}

// We can also check a value for being in or !in a range or a collection:
when (a) {
    in 1..10 -> print("a is in the range")
    in validNumbers -> print("a is valid")
    !in 10..20 -> print("a is outside the range")
    else -> print("none of the above")
}

// Another possibility is to check that a value is or !is of a particular type.
fun hasPrefix(x: Any) = when(x) {
    is String -> x.startsWith("prefix")
    else -> false
}
print(hasPrefix("prefixString"))
```

-----------------------------------------------------------------------------------------------------

## Loops :

1. For Loops

``` for ``` loop iterates through anything that provides an iterator. This is equivalent to the ``` foreach ``` loop in languages like C#.

Example :
```kotlin
// Traditional For Loop
for(a in 1..100) {
    println(a)
}

// Define range in a variable
val numbers = 1..100
for (a in numbers) {
    print(a)
}

// Reverse For Loop
for (a in 100 downTo 1) {
    println(a)
}

// Traditional For Loop with step
for (a in 100 downTo 1 step 5) {
    println(a)
}

// Iterate over array list of strings
val firstItems = listOf("apple", "banana", "kiwi")
for (item in firstItems) {
    println(item)
}

// Iterate over array list of strings by index
val secondItems = listOf("apple", "banana", "kiwi")
for (index in secondItems.indices) {
    println("item at $index is ${secondItems[index]}")
}

// Iterate over array list of strings by value and index
val thirdItems = listOf("apple", "banana", "kiwi")
for ((index, value) in thirdItems.withIndex()) {
    println("the element at $index is $value")
}

// Traditional For Loop with continue
for (i in 1..100) {
    if (i % 2 == 0) {
        continue
    }
}

// Traditional For Loop with break
outer@ for (i in 1..100) {
    for (j in 1..100) {
        if (j % i == 0) {
            break@outer
        }
    }
}
```

-----------------------------------------------------------------------------------------------------

2. While Loops

``` while ``` and ``` do..while ``` work as usual.

Example :
```kotlin
// Traditional While Loop
val items = listOf("apple", "banana", "kiwi")
var index = 0
while (index < items.size) {
    println("item at $index is ${items[index]}")
    index++
}
