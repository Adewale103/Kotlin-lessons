package inheritance

    fun main(){
        var animal = Animal("Animal")
        var dog = Dog("Fred")
        dog.makeSound()
        var cat = Cat("Pussy")
        cat.makeSound()
    }