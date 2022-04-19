package operators.task.domain.comparators

import operators.task.domain.model.ProductDetails

class ProductComparator() {

    class NameUp : Comparator<ProductDetails> {
        override fun compare(p0: ProductDetails, p1: ProductDetails): Int {
            return p0.name.compareTo(p1.name)
        }
    }

    class PriceUp : Comparator<ProductDetails> {
        override fun compare(p0: ProductDetails, p1: ProductDetails): Int {
            return p0.price - p1.price
        }
    }

}