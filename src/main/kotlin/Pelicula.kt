class Pelicula(var genero: Genero_pelicula, var director: String, titulo: String, precio: Float, Año_publ: Int) : Producto(titulo, precio,
    Año_publ) {
    override fun toString(): String {
        return "Pelicula(genero=$genero, director='$director', titulo='$titulo', precio='$precio', Año_publ='$Año_publ')"
    }
}