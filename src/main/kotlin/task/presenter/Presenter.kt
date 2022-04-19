package operators.task.presenter

import operators.task.domain.GetListProductsUseCase
import operators.task.domain.model.ProductDetails

class Presenter(
    private val getListProductsUseCase: GetListProductsUseCase
) {

    fun getSortedPriceUpProducts() {
        getListProductsUseCase.sortedPriceUp()
            .subscribe {
                println(toString(it))
                println("List products sorted to Price Up: ====================================================\n\n")
            }
    }

    fun getSortedNameUpProducts() {
        getListProductsUseCase.sortedNameUp()
            .subscribe {
                println(toString(it))
                println("List products sorted to Name Up: ====================================================\n\n")
            }
    }

    fun getFilterProductsPriceUp(minPrice: Int, maxPrice: Int) {
        getListProductsUseCase.filterPriceUp(minPrice, maxPrice)
            .subscribe {
                println(toString(it))
                println("List products FILTERED MIN > && < MAX to Price Up: ====================================================\n\n")
            }
    }

    private fun toString(list: List<ProductDetails>): String {
        var string = ""
        list.forEach {
            string +=
                "id: ${it.id}\t price: ${it.price}\t name: ${it.name} = ${it.type}\n"
        }
        return string
    }

}








