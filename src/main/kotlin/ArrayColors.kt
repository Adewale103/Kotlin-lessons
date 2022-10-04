fun main() {
    val numbers = intArrayOf(4,5,6,8,8,5,5)

    if(8 !in numbers){
        println("8 is not in number")
    }
    else{
        println("8 is in number")
    }

    println(numbers[2])
    numbers[2] = 11
    println(numbers[2])

    val number1: Int = 55
    val number2 : Long = number1.toLong()
    
}