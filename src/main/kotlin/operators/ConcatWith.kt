package operators.operators

import io.reactivex.Observable
import io.reactivex.functions.BiFunction
import java.util.concurrent.TimeUnit

class ConcatWith {

    //объединяет потоки данных в один поток в последовательно
    fun operator() {

        val flow1 = Observable.just("Копылова", "Газиев", "Сак", "Одинцов", "Гайсин")
        val flow2 = Observable.just("Милена", "Дима", "Кирилл", "Саша", "Марат", "Артем", "Оля")
        val flow3 = Observable.just("1", "2", "3", "4", "5")

        flow1
            .zipWith(Observable.interval(300, TimeUnit.MILLISECONDS), object : BiFunction<String, Any, String> {
                override fun apply(t1: String, t2: Any): String {
                    return t1
                }
            }).concatWith(flow2.zipWith(Observable.interval(400, TimeUnit.MILLISECONDS), object : BiFunction<String, Any, String> {
                override fun apply(t1: String, t2: Any): String {
                    return t1
                }
            })).concatWith(flow3.zipWith(Observable.interval(250, TimeUnit.MILLISECONDS), object : BiFunction<String, Any, String> {
                override fun apply(t1: String, t2: Any): String {
                    return t1
                }
            }))
            .subscribe {
                println(" -> $it ")
            }

    }
}