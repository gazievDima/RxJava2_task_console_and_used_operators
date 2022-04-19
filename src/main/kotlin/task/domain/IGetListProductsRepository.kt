package operators.task.domain

import io.reactivex.Observable
import operators.task.domain.model.ProductDetails

interface IGetListProductsRepository {

    fun getListProducts(): Observable<List<ProductDetails>>
}