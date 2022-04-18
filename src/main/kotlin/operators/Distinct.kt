import io.reactivex.Observable

class Distinct {

    //функция убирает дублированные данные из потока
    fun operator() {
        Observable.just("Dima", "Vanya", "Dima")
            .distinct()
            .subscribe {
                println("value = $it ")
            }
    }
}