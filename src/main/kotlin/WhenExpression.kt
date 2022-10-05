import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    println("Enter any english alphabet: ")
    var ch = scanner.nextLine().uppercase(Locale.getDefault())
    when(ch){
        "A","E","I","O","U" -> println("$ch is a vowel")
//        '1','2','3','4','5','6','7','8','9' -> println("$ch is a number")
        else -> println("$ch is a Consonant")
    }

    println("Enter any number between 1 and 100: ")
    val a = scanner.nextInt();
    when(a){
        in 1..10 -> println("A positive number less than 11.")
        in 10..100-> println("A positive number between 10 and 100 (inclusive)")
    }
}