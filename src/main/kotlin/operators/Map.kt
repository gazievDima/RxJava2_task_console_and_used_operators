package operators

import io.reactivex.Observable

class Map {

    //получаем каждый элемент потока
    fun operator() {
        Observable.just(1, 2, 3, 4, 5)
            .map { it * 2 }
            .subscribe {
                println("value = $it ")
            }
    }
}