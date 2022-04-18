package operators.operators

import io.reactivex.Observable
import io.reactivex.functions.BiFunction

class Scan {

    //функция соединяет поступающие данные из потока с прошлыми
    fun operator() {
        Observable.just(1,2,3,4,5,6,7,8,9,10)
            .scan(object : BiFunction<Int, Int, Int> {
                override fun apply(t1: Int, t2: Int): Int {
                    return t1 + t2
                }
            })
            .subscribe {
                println("multi value = $it ")
            }
    }
}