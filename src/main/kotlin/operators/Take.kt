package operators.operators

import io.reactivex.Observable
import java.util.concurrent.TimeUnit

class Take {

    //берем первые элементы с потока (количество указываем в аргументах)
    fun operatorTake() {
        Observable.just(1,2,3,4,5)
            .take(3)
            .subscribe {
                println("value = $it ")
            }
    }

    //берем последние элементы с потока (количество указываем в аргументах)
    fun operatorTakeLast() {
        Observable.just(1,2,3,4,5)
            .takeLast(3)
            .subscribe {
                println("value = $it ")
            }
    }
}