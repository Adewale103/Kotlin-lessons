package kotlinexercises

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
//    22. Calculate power of a number
    println("Enter number: ")
    val number = scanner.nextInt()
    println("Enter the value the number is raised to: ")
    val power = scanner.nextInt()
    var result = 1
    for(num in 1..power){
        result*=number
    }

    println("$number raised to the power of $power is $result ")

}
