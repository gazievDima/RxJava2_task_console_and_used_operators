package operators.task.data.sources

import io.reactivex.Observable
import operators.task.data.models.ProductEntity
import operators.task.data.repository.IProductsService

class LocalProductsService : IProductsService {

    override fun get(): Observable<List<ProductEntity>> {
        return Observable.just(
            listOf(
                ProductEntity(1, 250, "nonfood", "зубная паста"),
                ProductEntity(3, 320, "nonfood", "ковер"),
                ProductEntity(7, 349, "food", "картошка фри"),
                ProductEntity(8, 350, "food", "пюре картофельное"),
                ProductEntity(13, 685, "nonfood", "мыло"),
                ProductEntity(14, 973, "nonfood", "полотенце"),
                ProductEntity(19, 70, "food", "печенье"),
                ProductEntity(20, 444, "food", "вишня")
            )
        )
    }
}