import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    println("Enter a 24-hour format time: ")
    val hourInput = scanner.nextInt();
    when(hourInput){
        in 1..12 -> println("12 hour format ->$hourInput")
        in 13..23 -> println("12 hour format -> ${hourInput%12}")
    }










//    println("Enter a 24-hour format time: e.g 13:45")
//    val collectedTimeInput = scanner.nextLine();
//    if(!collectedTimeInput.contains(":")){
//        println("Invalid time format, please check again!")
//    }
//
//    var hourTime = collectedTimeInput.substring(0,collectedTimeInput.indexOf(":"))
//    var minuteTime = collectedTimeInput.substring(collectedTimeInput.indexOf(":")+1)
//
//    if((Integer.valueOf(hourTime) <= 12) and (Integer.valueOf(minuteTime) < 60)){
//        println(collectedTimeInput)
//    }
//    else if((Integer.valueOf(hourTime) > 12) and (Integer.valueOf(hourTime) < 24) and (Integer.valueOf(minuteTime) < 60)){
//        var newHour = Integer.valueOf(hourTime)%12
//        println("0$newHour:${collectedTimeInput.substring(3)}")
//    }
//    else{
//        println("Invalid time format, please check again!")
//    }


}