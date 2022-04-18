package operators.operators

import io.reactivex.functions.Function
import io.reactivex.Observable

class GroupBy {

    //позволяет получать группы данных из потока инициализируя новый поток выходных данных
    fun operator() {
        GetHumansRepository().get()
            .groupBy(object : Function<Human, Boolean> {
                override fun apply(t: Human): Boolean {
                    return t.gender.contains("boy")
                }
            })
            .subscribe {
                if (it.key == true) {
                    it.subscribe { human ->
                            println("this is: ${human.name}, ${human.gender}")
                        }
                }
            }
    }
}

class GetHumansRepository() {
    fun get(): Observable<Human> {
        return Observable.just(
            Human("Dima", "boy"),
            Human("Milena", "girl"),
            Human("Artem", "boy"),
            Human("Alena", "girl"),
            Human("Nikita", "boy"),
            Human("Olga", "girl"),
        )
    }
}

class Human(val name: String, val gender: String)