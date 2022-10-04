fun main(){
    var counter = 1
    while(counter in 1..50){
        print("-> $counter")
        counter++
    }
    println()

    for (i in 1..50){
        print("$i ")
    }
    val x = 1
    when(x){
        in 1..3 -> println(" between 1 and 3")
        in 4..6 -> println(" between 4 and 6")
        else -> println("Not within range")
    }
}
