package kotlinexercises

import java.util.Scanner

fun main() {
//1.    Print an Integer
 val scanner = Scanner(System.`in`)
    println("Enter any integer: ")
    val number = scanner.nextInt()
    println("The number you entered is: $number")

//2.  Add two integers
    println("Enter the first integer: ")
    val firstNumber = scanner.nextInt()
    println("Enter the second integer: ")
    val secondNumber = scanner.nextInt()
    val sum = firstNumber + secondNumber
    println("The sum of $firstNumber and $secondNumber is $sum")

//3.   Multiply two floating point numbers
    println("Enter the first number: ")
    val num1 = scanner.nextInt()
    println("Enter the second number: ")
    val num2 = scanner.nextInt()
    val multiplication = num1 * num2
    println("$firstNumber x $secondNumber = $multiplication")

}
