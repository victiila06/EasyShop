package pe.edu.upc.easyshop.shared.models

data class Product(
    val name: String,
    val image: String,
    val price: Double
)

val products = listOf(
    Product(name = "Essence Mascara Lash Princess", image = "", price = 9.99),
    Product(name = "Cotton T-Shirt", image = "", price = 69.0),
    Product(name = "Cotton T-Shirt", image = "", price = 69.0)
)