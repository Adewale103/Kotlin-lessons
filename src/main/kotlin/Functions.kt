fun main(){
  var result = isPalindrome("ebuBE")
    println(result)
}

fun checkIfEven(number : Int) : Boolean{
    return number % 2 == 0
}

fun isPalindrome(number : String) : Boolean{
    var numberArray = number.lowercase().toCharArray();
    var count = 0
    var result = 0;
    while(count < number.length){
        if(numberArray[count] == numberArray[number.length-1-count]){
            result++
        }
        count++
    }
    if(result == number.length){
        return true
    }
    return false;
}