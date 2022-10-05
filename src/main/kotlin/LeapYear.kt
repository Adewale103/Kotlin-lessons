import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter the year: ")
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

}