fun main() {
    var num = 1
    var sum = 0

    while(num in 1..100){
    sum+=num
        num++
    }
    println("The sum of natural numbers between 1 and 100 is $sum")
}