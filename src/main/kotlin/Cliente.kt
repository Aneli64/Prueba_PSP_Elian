interface Cliente {
    fun aplicarDescuento(producto: Producto):Int
    fun pagar(cantidad: Float): Boolean
}