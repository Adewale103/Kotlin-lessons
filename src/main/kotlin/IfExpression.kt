fun main(){
    val number = 5
    val result = if(number > 0) "Positive number" else "Negative number";
    println(result)

    val a = -9
    val b = -11
    val max = if(a>b) {
        println("$a is larger than $b")
        println("max variable holds value of a")
        a
    } else {
        println("$b is larger than $a")
        println("max variable holds value of b.")
        b
    }
    println("max = $max")
}
