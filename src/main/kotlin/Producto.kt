abstract class Producto
    (var titulo: String, var precio: Float, var Año_publ: Int, var descProduct: Int = 0) {

    fun obtenerDescuento(): Int {
        return descProduct
    }
}