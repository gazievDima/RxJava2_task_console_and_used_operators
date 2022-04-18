package operators.operators

import io.reactivex.Observable
import java.util.concurrent.TimeUnit

class TakeLast {

    //получаем последние элементы потока данных с конца
    //в аргументе функции необходимо указать количество необходимых данных из потока
    fun operator() {
        Observable.just(1,2,3,4,5)
            .takeLast(1)
            .subscribe {
                println("value = $it ")
            }
    }

}