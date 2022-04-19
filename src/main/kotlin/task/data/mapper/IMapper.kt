package operators.task.data.mapper

interface IMapper<T, V> {
    fun map(t: T): V
}