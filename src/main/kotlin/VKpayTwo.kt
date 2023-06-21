fun main() {
    val commissionRate = 0.0075
    val minimumCommission = 35.0

    val amount = 1000.0

    var commission = amount * commissionRate
    if (commission < minimumCommission) {
        commission = minimumCommission
    }

    println("Transfer amount: $amount rubles")
    println("Commission: $commission rubles")
}

