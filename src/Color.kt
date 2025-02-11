package src

enum class Color {
    AZUL,
    BLANCO,
    ROJO,
    FUCSIA,
    GRANATE,
    AMARILLO,
    DORADO;

    companion object{
        fun generarColorAleatorio(): Color{
            return entries.toTypedArray().random()
        }
    }
}