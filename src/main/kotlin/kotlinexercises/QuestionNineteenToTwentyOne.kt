package kotlinexercises

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
//19.    Display characters from A-Z using loop
    for(alphabet in 'A'..'Z'){
        print("$alphabet ")
    }

    println()
//20.    Count number of digits in an integer
    println("Enter the Integer: ")
    val enteredInteger = scanner.nextInt()
    println("The number of digits in $enteredInteger is ${enteredInteger.toString().length}")

//21. Reverse a number
    println("Enter any number you want to reverse: ")
    val enteredNumber = scanner.nextInt()
    println("The reverse of $enteredNumber is ${enteredNumber.toString().reversed()}")
}

