class Tienda_DM(): Cliente{
    var listaProduc:MutableList<Producto> = mutableListOf()
    var listaCliente:MutableList<Cliente_registrado> = mutableListOf()

    fun buscaProducto(nombreProducto: String): Int {
        var cantProduct = 0
        for (item in listaProduc) if (item.titulo == nombreProducto) cantProduct ++
        return cantProduct
    }

    fun buscaDisco(id_disco: Int): Producto {
        return listaProduc[id_disco]
    }

    fun buscaPelicula(id_pelicula: Int): Producto {
        return listaProduc[id_pelicula]
    }

    fun comprarPelicula(tituloPelicula: String, numEjemplares: Int): Float {
        var sumaTotal = 0.0F
        for (item in listaProduc) if (item.titulo == tituloPelicula) sumaTotal += item.precio
        return sumaTotal
    }

    fun comprarDisco(tituloDisco: String, numEJemplares: Int): Float {
        var sumaTotal = 0.0F
        for (item in listaProduc) if (item.titulo == tituloDisco) sumaTotal += item.precio
        return sumaTotal
    }

    override fun aplicarDescuento(producto: Producto): Int {
        return producto.obtenerDescuento()
    }

    override fun pagar(cantidad: Float): Boolean {
        TODO("Not yet implemented")
    }
}