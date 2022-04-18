package operators

import io.reactivex.Observable
import java.util.concurrent.TimeUnit

class ConcatMap {

    //получаем все элементы из потока без исключений, независимо от того как долго
    //мы будем ожидать/обрабатывать элемент из потока
    fun operator() {
        Observable.just(1,2,3,4,5)
            .concatMap { Observable.just(it).delay(1, TimeUnit.SECONDS) }
            .subscribe {
                println("value = $it ")
            }
    }

}