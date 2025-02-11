package src

class Rectangulo(color: Color = Color.FUCSIA, val altura: Double, val ancho: Double): Figura(color) {

    override fun area(): Double {
        return ancho * altura
    }

    override fun perimetro(): Double {
        return altura * 2 + ancho * 2
    }

    override fun toString(): String {
        return "Rectángulo de color $color. Altura = $altura cms. / Anchura = $ancho cms."
    }
}