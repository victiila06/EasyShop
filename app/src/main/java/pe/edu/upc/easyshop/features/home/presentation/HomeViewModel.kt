package pe.edu.upc.easyshop.features.home.presentation

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import pe.edu.upc.easyshop.shared.models.Product


class HomeViewModel : ViewModel() {
    private val _products = MutableStateFlow(emptyList<Product>())

    val products : StateFlow<List<Product>> = _products

    fun getAllProducts() {

    }
}