package kotlinexercises

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
//10.  Largest among three numbers
    println("Enter the first integer: ")
    val firstNumber = scanner.nextInt()
    println("Enter the second integer: ")
    val secondNumber = scanner.nextInt()
    println("Enter the third integer: ")
    val thirdNumber = scanner.nextInt()

    if(firstNumber > secondNumber){
        if(firstNumber > thirdNumber){
            println("Largest is $firstNumber")
        } else {
            println("Largest is $thirdNumber")
        }
    } else{
        if(secondNumber > thirdNumber){
            println("Largest is $secondNumber")
        }
        else{
            println("Largest is $thirdNumber")

        }
    }

//11.    Check leap year
    println("Enter year: ")
    val year = scanner.nextInt()

    if((year%4==0) and (year%100 != 0)){
        println("It is a leap year")
    }
    else if((year%400== 0) and (year%100 == 0)){
        println("It is a leap year")
    }
    else {
        println("It is not a leap year")
    }

//12.    check if a character is alphabet or not
    println("Enter any character: ")
    val character = scanner.nextLine()
    if(character.length > 1){
        println("Ops! What you entered is not a character!")
    }
    else{
        when(character.lowercase()[0]){
            in 'a'..'z' -> println("$character is an alphabet")
            else -> println("$character is not an alphabet")
        }
    }

}