fun main(){
    val a = 12
    val b = -12
    val c = -1
    val result : Boolean
//
//    val max = if(a > b){
//        println("a is larger than b.")
//        a
//    }else {
//        println("b is larger than a.")
//        b
//    }
//
//    println("max = $max")
    val max : Int
    if( a > b){
        println("a is larger than b.")
        max = a
    }
    else{
        println("b is larger than a.")
        max = b
    }
    println("max = $max")
    result = (a>b) and (a>c)
    println(result)
    println((a>b) or (a>c))


}