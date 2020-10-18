fun main() {
    val itemPrice = 100.0
    val itemCount = 1
    var totalPrice = itemPrice * itemCount

    val previousMonthPurchase = 10_001.0
    val regularCustomer = true
    val discountForRegularCustomer = 0.01

    val discountMin = 1_000.0
    val discountMinAmount = 100.0

    val discountMax = 10_000.0
    val discountMaxAmount = 0.05

    totalPrice =
        if ((previousMonthPurchase > discountMin) && (previousMonthPurchase < discountMax))
            totalPrice - discountMinAmount
        else if (previousMonthPurchase > discountMax) totalPrice - (totalPrice * discountMaxAmount)
        else totalPrice

    val result = if (regularCustomer) totalPrice - (totalPrice * discountForRegularCustomer)
    else totalPrice

    println("Total Price: $result")
}
