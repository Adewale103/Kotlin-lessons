package kotlinexercises

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
//13.    Sum of natural numbers
    println("Printing natural numbers between 1 and 100...")
    var number = 1
    while(number in 1..100){
        println(number)
        number++
    }

//14.    Factorial of a number
    println("Enter the number: ")
    var factorial = 1
    var num = scanner.nextInt()
    while(num > 0){
        factorial *= num
        num--
    }
    println("The factorial of $number is $factorial")

//15.    Generate Multiplication Table
    for(digit in 1..12){
        for(digit2 in 1.. 12){
            println("$digit * $digit2 = ${digit*digit2}")
        }
        println("============")
    }
}