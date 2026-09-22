// Hands-on 3: Variance — declaration-site "out"

open class Animal(val name: String)

class Cat(name: String) : Animal(name)

interface Container<out T> {
    fun get(): T
}

class CatContainer(
    private val cat: Cat
) : Container<Cat> {

    override fun get(): Cat {
        return cat
    }
}

fun printAnimalName(container: Container<Animal>) {
    println("Nama hewan: ${container.get().name}")
}

fun main() {
    val catContainer: Container<Cat> =
        CatContainer(Cat("Whiskers"))

    printAnimalName(catContainer)
}