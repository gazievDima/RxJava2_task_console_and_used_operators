package operators.operators

import io.reactivex.Observable
import java.util.concurrent.TimeUnit

class Skip {

    //пропускаем первые элементы с потока (количество указываем в аргументах)
    fun operatorSkip() {
        Observable.just(1,2,3,4,5)
            .skip(2)
            .subscribe {
                println("value = $it ")
            }
    }

    //пропускаем последние элементы с потока (количество указываем в аргументах)
    fun operatorSkipLast() {
        Observable.just(1,2,3,4,5)
            .skipLast(2)
            .subscribe {
                println("value = $it ")
            }
    }
}