package src

class Triangulo(color: Color = Color.FUCSIA, val base: Double, val altura: Double): Figura(color) {

    override fun area(): Double {
        return (base * altura) / 2
    }

    override fun perimetro(): Double {
        return base * 3
    }

    override fun toString(): String {
        return "Triángulo de color $color. Base = $base cms. / Altura = $altura cms."
    }
}