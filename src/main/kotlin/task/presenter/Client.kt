package operators.task.presenter

import operators.task.data.mapper.ProductMapper
import operators.task.data.repository.GetListProductsRepository
import operators.task.data.sources.LocalProductsService
import operators.task.data.sources.RemoteProductsService
import operators.task.domain.GetListProductsUseCase
import operators.task.domain.comparators.ProductComparator

fun main() {
    val remoteService = RemoteProductsService()
    val localService = LocalProductsService()
    val mapper = ProductMapper()
    val repository = GetListProductsRepository(localService, remoteService, mapper)
    val productNameComparator = ProductComparator.NameUp()
    val productPriceComparator = ProductComparator.PriceUp()
    val useCase = GetListProductsUseCase(repository, productNameComparator, productPriceComparator)

    val presenter = Presenter(useCase)

    //сперва выводятся объекты из локального кеша, после из эмулированного удаленного сервиса
    presenter.getSortedPriceUpProducts()
    presenter.getSortedNameUpProducts()
    presenter.getFilterProductsPriceUp(300, 800)

}
