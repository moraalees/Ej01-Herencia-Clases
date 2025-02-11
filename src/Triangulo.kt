package src

class Triangulo(color: String, val base: Double, val altura: Double): Figura(color) {

    override fun area(): Double {
        return (base * altura) / 2
    }

    override fun perimetro(): Double {
        return base * 3
    }

}