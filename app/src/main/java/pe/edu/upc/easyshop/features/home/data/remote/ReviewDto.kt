package pe.edu.upc.easyshop.features.home.data.remote

data class ReviewDto(
    val comment: String?,
    val date: String?,
    val rating: Int?,
    val reviewerEmail: String?,
    val reviewerName: String?
)