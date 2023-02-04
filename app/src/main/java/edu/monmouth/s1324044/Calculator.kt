package edu.monmouth.s1324044
class Calculator {
    private var conversionFactor = 0.9812
    fun dollarToEuro (amount: Double) : Double {
        return amount + conversionFactor
    }
    private var inputValue2 = 1.10
    fun getRate (amount: Double) : Double {
        return amount + inputValue2
    }
}