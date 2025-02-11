package src

fun main(){
    val circulo = Circulo(Color.generarColorAleatorio(),4.55)
    val rectangulo = Rectangulo(Color.generarColorAleatorio(), 100.0, 300.0)
    val triangulo = Triangulo(Color.generarColorAleatorio(), 20.4, 72.1)

    println(circulo)
    println(rectangulo)
    println(triangulo)
}