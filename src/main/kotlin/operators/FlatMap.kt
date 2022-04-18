package operators

import io.reactivex.Single

class FlatMap {

    //получаем каждый элемент потока и можем сконвертить в новый поток данных
    //***функция возвращает поток данных в хаотичном порядке в случае делая в потоке
    fun operator() {
        val disposable = getUsers(UsersApi().get())
            .subscribe({
                it.map { user ->
                    println("name: ${user.name}, avatar: ${user.avatar}")
                }
            }, {
                println("error")
            })
    }

    private fun getUsers(usersApi: Single<List<UserApi>>): Single<List<User>> {
        return usersApi.flatMap { userApi ->
            Single.just(
                userApi.map { user ->
                    if (user.name == null || user.avatar == null) {
                        User("Not found user", "empty_ava.jpg")
                    } else {
                        User(user.name, user.avatar)
                    }
                }
            )
        }
    }
}

class UserApi(val name: String?, val avatar: String?)
class User(val name: String, val avatar: String)

class UsersApi {
    private val users: Single<List<UserApi>> = Single.just(
        listOf(
            UserApi("Dima", "dima_ava.jpg"),
            UserApi(null, null),
            UserApi("Alexey", "alex_ava.jpg"),
            UserApi("Olga", "olga_ava.jpt"),
            UserApi(null, null)
        )
    )

    fun get(): Single<List<UserApi>> {
        return users
    }

}