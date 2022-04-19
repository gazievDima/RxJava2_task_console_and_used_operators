package operators.task.data.mapper

import operators.task.data.models.ProductEntity
import operators.task.domain.model.ProductDetails

class ProductMapper : IMapper<ProductEntity, ProductDetails> {

    override fun map(t: ProductEntity): ProductDetails {
        return ProductDetails(t.id, t.price, t.type, t.name)
    }
}