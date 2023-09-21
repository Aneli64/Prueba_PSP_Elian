class Disco(var genero: Genero_musica, var grupo: String, var stock:Int, titulo: String, precio: Float, Año_publ: Int) : Producto(titulo,
    precio, Año_publ){
    override fun toString(): String {
        return "Disco(genero=$genero, grupo='$grupo', stock=$stock, titulo='$titulo', precio='$precio', Año_publ='$Año_publ')"
    }
}