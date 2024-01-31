
open class Kelvin(val name: String) {

    fun speak() {
        println("$name makes a sound")
    }
}

class Dog(name: String) : Kelvin(name) {
    fun bark() {
        println("$name barks")
    }
}
//In this illustration, an kelvin class functions as the base class, equipped with a
// property named name and a method titled speak(). On the other hand,
// the Dog class emerges as the derived class, inheriting from kelvin and introducing an exclusive method called bark().