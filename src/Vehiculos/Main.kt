import Vehiculos.Auto

fun main() {
    val auto1 = Auto("Toyota", "Corolla")
    auto1.conducir()
    auto1.reparar()
    auto1.detallesVehiculo()

    val auto2 = Auto("Honda", "Civic", "Rojo")
    println(auto2.color) // Uso del getter
    auto2.color = "Azul" // Uso del setter
    println(auto2.color)
}
