// Hands-on 1: Higher-Order Function

fun calculate(
    a: Int,
    b: Int,
    operation: (Int, Int) -> Int
): Int {
    return operation(a, b)
}

fun main() {

    // Penjumlahan
    val tambah = calculate(10, 4) { x, y ->
        x + y
    }
    println("Tambah: $tambah")

    // Pengurangan
    val kurang = calculate(10, 4) { x, y ->
        x - y
    }
    println("Kurang: $kurang")

    // Perkalian
    val kali = calculate(10, 4) { x, y ->
        x * y
    }
    println("Kali: $kali")
}