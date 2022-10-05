package kotlinexercises

import java.util.*

fun main() {
    val input = Scanner(System.`in`)
//7.    Check if number is odd or even
    println("Enter any number: ")
    val number = input.nextInt()
    input.nextLine()
    if(number % 2 == 0){
        println("$number is an even number")
    }
    else{
        println("$number is a odd number")
    }
//8.    Frequency of a character in a string
    var count : Int = 0
    println("Enter a String: ")
    val string = input.nextLine()
    val stringEntered = string.lowercase()
    println("Enter the character you want to find: ")
    val character = input.nextLine().lowercase()
    if(character.length > 1){
        println("Ops! Not a character, try again!!!")
    }
    else {
        for(i in stringEntered){
            if (i == character[0]){
                count++
            }
        }
        println("$character appears $count times in $string")
    }

//9.    Check whether an alphabet is vowel or consonant
    println("Enter any english alphabet: ")
    val alphabet = input.nextLine()
    when(alphabet.lowercase(Locale.getDefault())){
        in "a","e","i","o","u" -> println("$alphabet is a vowel")
        in "b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z" -> println("$alphabet is a consonant")
        else -> println("$alphabet is neither a vowel or a consonant")

    }
}