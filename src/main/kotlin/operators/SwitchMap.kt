package operators

import io.reactivex.Observable
import java.util.concurrent.TimeUnit

class SwitchMap {

    //получаем последний элемент потока и можем сконвертировать в новый поток данных
    fun operator() {
        Observable.just(1,2,3,4,5)
            .switchMap { Observable.just(it).delay(1, TimeUnit.SECONDS) }
            .subscribe {
                println("value = $it ")
            }
    }

}