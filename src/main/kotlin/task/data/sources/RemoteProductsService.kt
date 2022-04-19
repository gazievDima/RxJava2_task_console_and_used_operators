package operators.task.data.sources

import io.reactivex.Observable
import operators.task.data.models.ProductEntity
import operators.task.data.repository.IProductsService

class RemoteProductsService : IProductsService {

    override fun get(): Observable<List<ProductEntity>> {
        return Observable.just(
            listOf(
                ProductEntity(1, 250, "nonfood", "зубная паста"),
                ProductEntity(2, 120, "nonfood", "зубная щетка"),
                ProductEntity(3, 320, "nonfood", "ковер"),
                ProductEntity(4, 750, "nonfood", "куртка"),
                ProductEntity(5, 900, "nonfood", "стиральный порошок"),
                ProductEntity(6, 99, "food", "гамбургер"),
                ProductEntity(7, 349, "food", "картошка фри"),
                ProductEntity(8, 350, "food", "пюре картофельное"),
                ProductEntity(9, 110, "food", "каша молочная"),
                ProductEntity(10, 120, "food", "чай"),
                ProductEntity(11, 644, "nonfood", "духи"),
                ProductEntity(12, 311, "nonfood", "мочалка"),
                ProductEntity(13, 685, "nonfood", "мыло"),
                ProductEntity(14, 973, "nonfood", "полотенце"),
                ProductEntity(15, 98, "nonfood", "тарелка"),
                ProductEntity(16, 244, "food", "яблоки"),
                ProductEntity(17, 333, "food", "бананы"),
                ProductEntity(18, 451, "food", "абрикосы"),
                ProductEntity(19, 70, "food", "печенье"),
                ProductEntity(20, 444, "food", "вишня")
            )
        )
    }

}

