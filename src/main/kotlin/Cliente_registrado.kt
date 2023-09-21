class Cliente_registrado(var nombre: String, var apellidos: String, var DNI_NIF: String,
    var telefono: String, var saldo: Float, var descuento: Int = 2) : Cliente{
    override fun aplicarDescuento(producto: Producto): Int {
        TODO("Not yet implemented")
    }

    override fun pagar(cantidad: Float): Boolean {
       saldo =- cantidad
        return true
    }

    fun valida_dni(): Boolean{
        return true
    }

    fun esVIP(): Boolean{
        return true
    }

    fun actualizarDescuento(){

    }
}
