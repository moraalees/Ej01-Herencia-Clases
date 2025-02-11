package src

enum class Color {
    Azul,
    Blanco,
    Rojo,
    Fucsia,
    Granate,
    Amarillo,
    Dorado;

    companion object{
        fun generarColorAleatorio(): Color{
            return entries.toTypedArray().random()
        }
    }
}