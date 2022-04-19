package operators.task.domain

import io.reactivex.Observable
import operators.task.domain.model.ProductDetails
import java.util.*
import kotlin.Comparator
import kotlin.collections.ArrayList


class GetListProductsUseCase(
    private val getListProductsRepository: IGetListProductsRepository,
    private val productNameComparator: Comparator<ProductDetails>,
    private val productPriceComparator: Comparator<ProductDetails>
) {

    fun sortedPriceUp(): Observable<List<ProductDetails>> {
        return getListProductsRepository.getListProducts()
            .map {
                val sortedProducts = ArrayList<ProductDetails>(it)
                Collections.sort(sortedProducts, productPriceComparator)
                sortedProducts
            }
    }

    fun sortedNameUp(): Observable<List<ProductDetails>> {
        return getListProductsRepository.getListProducts()
            .map {
                val sortedProducts = ArrayList<ProductDetails>(it)
                Collections.sort(sortedProducts, productNameComparator)
                sortedProducts
            }
    }

    fun filterPriceUp(minPrice: Int, maxPrice: Int): Observable<List<ProductDetails>> {
        return getListProductsRepository.getListProducts()
            .map {
                it.filter { product ->
                    product.price in minPrice..maxPrice
                }
            }
            .flatMap {
                Observable.just(it)
                    .map {
                        val sortedProducts = ArrayList<ProductDetails>(it)
                        Collections.sort(sortedProducts, productPriceComparator)
                        sortedProducts
                    }
            }
    }

}











