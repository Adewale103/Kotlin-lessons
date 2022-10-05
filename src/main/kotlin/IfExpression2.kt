import java.util.Scanner

fun main(){
val input = Scanner(System.`in`)
    print("Enter the first number: ")
    val n1 = input.nextInt();
    print("Enter the second number: ")
    val n2 = input.nextInt()
    print("Enter the third number: ")
    val n3 = input.nextInt()
    val max = if(n1 > n2){
        if(n1 > n3) n1
        else n3
    } else {
        if(n2 > n3) n2
        else n3
    }
    println("max = $max")
}

