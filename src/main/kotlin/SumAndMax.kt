import java.util.Scanner
fun main(){
    var reader = Scanner(System.`in`)
    println("Enter the first number: ")
    var number = reader.nextInt();

    println("Enter the second number: ")
    var number2 = reader.nextInt()

    var sum = number + number2
    var max = if(number > number2){
        number
    }else if(number2 > number){
        number2
    }
    else{
        number
    }
    println("The sum  of $number and $number2 is $sum")
    println("The maximum number is $max")
}