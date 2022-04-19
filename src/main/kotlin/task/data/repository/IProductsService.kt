package operators.task.data.repository

import io.reactivex.Observable
import operators.task.data.models.ProductEntity

interface IProductsService {

    fun get(): Observable<List<ProductEntity>>
}