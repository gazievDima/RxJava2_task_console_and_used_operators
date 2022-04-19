package operators.task.data.repository

import io.reactivex.Observable
import io.reactivex.functions.BiFunction
import operators.task.data.mapper.IMapper
import operators.task.data.models.ProductEntity
import operators.task.domain.IGetListProductsRepository
import operators.task.domain.model.ProductDetails

class GetListProductsRepository(
    private val localService: IProductsService,
    private val remoteService: IProductsService,
    private val fromDataMapper: IMapper<ProductEntity, ProductDetails>
) : IGetListProductsRepository {

    override fun getListProducts(): Observable<List<ProductDetails>> {
        return localService.get()
            .mergeWith(remoteService.get())
            .flatMap { products ->
                Observable.just(products
                    .map { product -> fromDataMapper.map(product) }
                )
            }
    }

}