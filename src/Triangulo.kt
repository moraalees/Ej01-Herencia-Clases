package src

class Triangulo(color: Color = Color.Fucsia, val base: Double, val altura: Double): Figura(color) {

    override fun area(): Double {
        return (base * altura) / 2
    }

    override fun perimetro(): Double {
        return base * 3
    }

    override fun toString(): String {
        return "Triángulo de color $color. Base = $base cms. / Altura = $altura cms. Su área es de ${area()} cms3 y su perímetro de ${perimetro()} cms2."
    }
}