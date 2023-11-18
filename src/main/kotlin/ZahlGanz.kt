fun main() {
    val zahlEins = 12
    val zahlZwei = 17

    println(zahlEins + zahlZwei)
    println("$zahlEins $zahlZwei")
    println("Text:$zahlEins $zahlZwei")
    println("Ganze Zahlen: $zahlEins $zahlZwei\n")

    val zahlDrei = 3_000_000_000
    val zahlVier: Long = -3500L
    println("Lange ganze Zahlen: $zahlDrei $zahlVier\n")

    println("Int: ${Int.MAX_VALUE} ${Int.MIN_VALUE}")
    println("Long: ${Long.MAX_VALUE} ${Long.MIN_VALUE}\n")

    val zahlFuenf = 0xb2f
    println("Hexadezimale Zahl: $zahlFuenf")

    val zahlSechs = 0b101110
    println("Dual Zahl: $zahlSechs")


}