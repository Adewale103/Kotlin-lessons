package kotlinexercises

import java.util.*

fun main() {
//4.    ASCII value of any character
    val scanner = Scanner(System.`in`)
    println("Enter any character: ")
    val input = scanner.nextLine()
    if(input.length > 1){
        println("Ops! Not a character, try again")
    }
    else {
        val asciiValue = input[0].code
        println("The ascii value of $input is: $asciiValue")
    }

//5.   Compute quotient and remainder
    println("Enter the first number: ")
    val num1 = scanner.nextInt()
    println("Enter the second number: ")
    val num2 = scanner.nextInt()
    val quotient = num1/num2
    val remainder = num1%num2
    println("$num1/$num2=$quotient")
    println("$num1%$num2=$remainder")

//6.    Swap two numbers
    println("Enter the first number: ")
    var number1 = scanner.nextInt()
    println("Enter the second number: ")
    var number2 = scanner.nextInt()
    println("Before swapping: number1 is $number1 and number2 is $number2")
    val temp = number1
    number1 = number2
    number2 = temp
    println("After swapping: number1 is now $number1 and number2 is now $number2")




}
