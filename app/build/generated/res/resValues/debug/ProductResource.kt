data class ProductResource(
    val limit: Int,
    val products: List<Product>,
    val skip: Int,
    val total: Int
)