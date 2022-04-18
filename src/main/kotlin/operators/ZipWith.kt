package operators.operators

import io.reactivex.Observable
import io.reactivex.functions.BiFunction

class ZipWith {

    //позволяет соединять потоки данных, в случае если количество поступаемых
    //данных отличается, непарные данные отбрасываются
    fun operator() {

        val surnames = Observable.just("Копылова", "Газиев", "Сак", "Одинцов", "Гайсин")
        val firstnames = Observable.just("Милена", "Дима", "Кирилл", "Саша", "Марат", "Артем", "Оля")

        surnames.zipWith(firstnames, object : BiFunction<String, String, String> {
            override fun apply(t1: String, t2: String): String {
                return "$t1 $t2"
            }
        }).subscribe {
            println(it)
        }
    }
}