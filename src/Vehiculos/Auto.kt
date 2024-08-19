package Vehiculos

class Auto(marca: String, modelo: String) : Vehiculo(marca, modelo), Reparacion {

    override val tipoCombustible: String = "Gasolina"

    constructor(marca: String, modelo: String, color: String) : this(marca, modelo) {
        this.color = color
    }

    var color: String = "Desconocido"
        get() = "Color del auto: $field"
        set(value) {
            field = value
        }

    override fun conducir() {
        println("Conduciendo un auto de marca $marca y modelo $modelo.")
    }

    override fun reparar() {
        println("Reparando el auto de marca $marca y modelo $modelo.")
    }
}
