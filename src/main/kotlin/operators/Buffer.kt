package operators.operators

import io.reactivex.Observable
import java.util.concurrent.TimeUnit

class Buffer {

    //группирует полученные данные из потока по параметру указанному в аргументах count = n
    fun operator() {
        Observable.just(1,2,3,4,5,6,7,8,9,10)
            .buffer(2)
            .subscribe {
                println("value = $it ")
            }
    }
}