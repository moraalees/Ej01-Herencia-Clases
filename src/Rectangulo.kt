package src

class Rectangulo(color: String, val altura: Double, val ancho: Double): Figura(color) {

    override fun area(): Double {
        return ancho * altura
    }

    override fun perimetro(): Double {
        return altura * 2 + ancho * 2
    }

}