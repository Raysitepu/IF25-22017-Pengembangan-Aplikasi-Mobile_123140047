// Hands-on 2: Lambda vs Function Reference

fun isEvenLength(s: String): Boolean {
    return s.length % 2 == 0
}

fun toUpper(s: String): String {
    return s.uppercase()
}

fun main() {

    val mahasiswa = listOf(
        "Andi",
        "Budi",
        "Citra",
        "Dewi",
        "Eka",
        "Fajar"
    )

    // TODO 1: Menggunakan Lambda Expression
    val hasilLambda: List<String> = mahasiswa
        .filter { it.length % 2 == 0 }
        .map { it.uppercase() }

    // TODO 2: Menggunakan Function Reference
    val hasilReference: List<String> = mahasiswa
        .filter(::isEvenLength)
        .map(::toUpper)

    // Menampilkan hasil
    println("Lambda   : $hasilLambda")

    println("Reference: $hasilReference")

    println("Sama? ${hasilLambda == hasilReference}")
}