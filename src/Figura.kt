package src

abstract class Figura(val color: Color) {
    abstract fun area(): Double

    abstract fun perimetro(): Double
}