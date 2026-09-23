// Hands-on 3: Closure — Counter Factory

fun makeCounter(): () -> Int {

    // TODO 1: Deklarasikan variabel count
    var count: Int = 0

    // TODO 2: Kembalikan lambda
    return {
        count++
        count
    }
}

fun main() {

    // Membuat dua counter independen
    val counterA = makeCounter()
    val counterB = makeCounter()

    // Pemanggilan counter A
    println(counterA())
    println(counterA())
    println(counterA())

    // Pemanggilan counter B
    println(counterB())
    println(counterB())
}