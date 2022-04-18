package operators.operators

import io.reactivex.Observable
import io.reactivex.disposables.Disposable
import java.util.*
import io.reactivex.Observer
import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit

class Debounce {

    //функция отправляет данные подписчику только в случае если не было
    //новых данных от источника за установленный промежуток времени
    fun operator() { }

    /**
     * пример данной функции наглядно продемонстирован в коде ниже
     * с помощью реализации EditText в андроид приложении

    val disposable = getObservableEditText()
                        .debounce(500, TimeUnit.MILLISECONDS)
                        .subscribe {
                            Log.i(TAG, it)
                        }
    }

    private fun getObservableEditText(): PublishSubject<String> {
    val subject = PublishSubject.create<String>()

    binding.editText.addTextChangedListener(object : TextWatcher {
        override fun onTextChanged(text: CharSequence?, p1: Int, p2: Int, p3: Int) {
            subject.onNext(text.toString())
        }
    })
    return subject
    }

     */

}