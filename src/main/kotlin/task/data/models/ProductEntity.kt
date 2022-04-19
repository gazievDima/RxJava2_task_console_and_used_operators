package operators.task.data.models

class ProductEntity(
    val id: Int,
    val price: Int,
    val type: String,
    val name: String,
    ) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ProductEntity

        if (id != other.id) return false
        if (name != other.name) return false
        if (price != other.price) return false
        if (type != other.type) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + name.hashCode()
        result = 31 * result + price
        result = 31 * result + type.hashCode()
        return result
    }
}