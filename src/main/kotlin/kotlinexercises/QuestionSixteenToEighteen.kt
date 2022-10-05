package kotlinexercises

import java.util.*

fun main() {
//16.    Display Fibonacci series
    val scanner = Scanner(System.`in`)
    var firstDigit = 0
    var secondDigit = 1
    println("Enter number: ")
    val number = scanner.nextInt()
    var sum = 0 + 1
    for(digit in 1..number){
        print("$firstDigit ")
        firstDigit =secondDigit
        secondDigit = sum
        sum = firstDigit + secondDigit
    }
    println()
//17.    GCD of two numbers
    println("Enter the first number: ")
    var number1 = scanner.nextInt()
    println("Enter the second number: ")
    var number2 = scanner.nextInt()

    val factorsOfNumber1 = mutableListOf<Int>()
    val factorsOfNumber2 = mutableListOf<Int>()

    for(digit in 1..number1){
        if(number1%digit == 0){
            factorsOfNumber1.add(digit)
        }
    }

    for(digit in 1..number2){
        if(number2%digit == 0){
            factorsOfNumber2.add(digit)
        }
    }
    val gcd = factorsOfNumber1.intersect(factorsOfNumber2.toSet()).maxOrNull()
    println("The GCD of $number1 and $number2 is $gcd")

//18.     LCM of two numbers
    println("Enter the first number: ")
    number1 = scanner.nextInt()
    println("Enter the second number: ")
    number2 = scanner.nextInt()
    val multiplesOfNumber1 = mutableListOf<Int>()
    val multiplesOfNumber2 = mutableListOf<Int>()

    for(digit in 2..number1*number2){
        if(digit % number1 == 0){
            multiplesOfNumber1.add(digit)
        }
    }
    for(digit in 2..number1*number2){
        if(digit % number2 == 0){
            multiplesOfNumber2.add(digit)
        }
    }
    val lcm = multiplesOfNumber1.intersect(multiplesOfNumber2.toSet()).minOrNull()
    println("The LCM of $number1 and $number2 is $lcm")

}