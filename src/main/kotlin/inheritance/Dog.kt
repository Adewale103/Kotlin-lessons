package inheritance

class Dog(name : String) : Animal(name) {
    override fun makeSound(){
        println("Goa Goa Goa")
    }
}