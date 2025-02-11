package src

class Circulo(color: Color = Color.FUCSIA, val radio: Double): Figura(color) {

    override fun area(): Double {
        return Math.PI * radio * radio
    }

    override fun perimetro(): Double{
        return 2 * Math.PI * radio
    }

    override fun toString(): String {
        return "Circulo de color $color. Radio = $radio cms."
    }
}