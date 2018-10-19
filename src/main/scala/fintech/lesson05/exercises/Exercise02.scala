package fintech.lesson05.exercises

object Exercise02 {

  // Используя Map написать реализацию для интерфейса KVInterface. Скрыть детали реализации.
  // Добавить логирование вызовов (в консоль с помощью println). Вынести функции логирования в отдельный трейт Logging

  trait KVInterface {
    def store(key: String, value: String): Unit
    def find(key: String): Option[String]
  }

}
