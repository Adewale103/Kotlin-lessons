package inheritance

open class Animal (var name : String) {
    init {
        println("I am an animal")
    }
    open fun makeSound(){
        println("Animal makes sound!")
    }
}