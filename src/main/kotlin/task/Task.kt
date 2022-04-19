package operators.task
/*

we have model Product(id: Int, name: String, price: Int, description: String)
we have list products from server
we have list products from cache (local database)

task sources:
- RemoteProductsService.kt, получить список продуктов с удаленного сервера
    -api:
        get(): Single<List<ProductRemoteData>>
- LocalProductsService.kt, get list products from cache (локальная бд)
    -api:
        get(): Single<List<ProductLocalData>>

task repository:
- GetListProductsRepository.kt, get list products
    -api:
        getListProducts(): Single<List<Product>> - merge 2 flow from sources in one flow no repetitive

task use-cases:
- GetListProductsUseCase.kt, возвращает список продуктов по условию, разбитый по non-food, food
    -api:
       getProducts(): List<Product> - get list products from sources without filtration
       getSortedProductsPriceComparator.up(): List<Product> - get sorted list to price from min to max
       getSortedProductsPriceComparator.down(): List<Product> - get sorted list to price from max to min
       getSortedProductsNameComparator.up(): List<Product> - get sorted list to name from a to z
       getSortedProductsNameComparator.down(): List<Product> - get sorted list to name from z to a
       getProductsFilterPrice.filterUp(minPrice: Int, maxPrice): List<Product> - get products with filter price from min to max
       getProductsFilterPrice.filterDown(minPrice: Int, maxPrice): List<Product> - get products with filter price from max to min

task presenter:
- Presenter.kt, used use-cases for get list products

task view:
- View.kt, client code for used Presenter.kt

 */

fun main() {
}