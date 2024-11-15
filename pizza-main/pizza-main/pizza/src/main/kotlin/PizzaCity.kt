abstract class PizzaCity(
    val neapolitanPizzaPrice: Double, val romanPizzaPrice: Double
    )
    {
        var neapolitanPizzaCount = 0
        var romanPizzaCount = 0
        var sicilianPizzaCount = 0
        var tyroleanPizzaCount = 0

        abstract fun neapolitanPizzaSale()
        abstract fun romanPizzaSale()
        abstract fun sicilianPizzaSale()
        abstract fun tyroleanPizzaSale()
    }

}