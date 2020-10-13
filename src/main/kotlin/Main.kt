fun main() {
    val itemPrice = 1000
    val itemCount = 11
    val discount = 100
    val discountStart = 1_000
    val discountMax = 10_000
    val totalPrice = itemPrice * itemCount
    val result =
        if ((totalPrice > discountStart) && (totalPrice < discountMax)) totalPrice - discount
        else if (totalPrice > discountMax) totalPrice - (totalPrice * 0.05)
        else totalPrice
    println("Total Price: $result")
}
