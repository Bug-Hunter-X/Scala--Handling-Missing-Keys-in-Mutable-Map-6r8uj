```scala
class MyClass {
  private val myMap = scala.collection.mutable.Map[String, Int]()

  def addValue(key: String, value: Int): Unit = {
    myMap += (key -> value)
  }

  def getValue(key: String): Option[Int] = {
    myMap.get(key) // Returns Option[Int]: Some(value) if found, None otherwise
  }
}
```