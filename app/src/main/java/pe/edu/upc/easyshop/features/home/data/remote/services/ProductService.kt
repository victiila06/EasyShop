package pe.edu.upc.easyshop.features.home.data.remote.services


import pe.edu.upc.easyshop.features.home.data.remote.ProductDto
import pe.edu.upc.easyshop.features.home.data.remote.ProductWrapperDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ProductService {

    @GET("products")
    suspend fun getAllProducts(): Response<ProductWrapperDto>

    @GET("products/{id}")
    suspend fun getProductById(@Path("id") id: Int): Response<ProductDto>
}