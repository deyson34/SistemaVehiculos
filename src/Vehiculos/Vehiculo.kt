package Vehiculos

abstract class Vehiculo(val marca: String, val modelo: String) {

    abstract val tipoCombustible: String

    init {
        println("Vehículo de marca $marca y modelo $modelo creado.")
    }

    abstract fun conducir()

    fun detallesVehiculo() {
        println("Marca: $marca, Modelo: $modelo, Combustible: $tipoCombustible")
    }
}
