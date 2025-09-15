package pe.edu.upc.easyshop.features.home.data.remote

data class ProductWrapperDto(
    val limit: Int?,
    val products: List<ProductDto>?,
    val skip: Int?,
    val total: Int?
)