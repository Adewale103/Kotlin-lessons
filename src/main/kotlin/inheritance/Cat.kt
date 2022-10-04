package inheritance

class Cat(name : String) : Animal(name) {
    override fun makeSound() {
        println("Meow Meow Meow")
    }
}