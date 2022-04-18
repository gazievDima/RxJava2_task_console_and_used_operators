package operators.task

//задача по операторам rxjava2

/*

задача: получаем объект с апи ProductApi с полями:
    id, name, price, type, description
    вывести товары по группам.

- убрать дубли
- преобразовать в GetProducts (в случае если приходит ценой null то изменить description на "нет товара")
- отфильтровать по увеличению цены
- разбить по типам (типы food, non-food)

 */

fun main() {
    val repository = GetProductsRepository()
    //repository.get()
}