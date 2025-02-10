package src

class Triangulo(color: String, val base: Double, val altura: Double, val lado: Double): Figura(color) {

    override fun area(): Double {
        return (base * altura) / 2
    }

    override fun perimetro(): Double {
        return lado * 3
    }

}