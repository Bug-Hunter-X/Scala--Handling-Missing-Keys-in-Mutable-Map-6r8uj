```scala
class MyClass {
  private val myMap = scala.collection.mutable.Map[String, Int]()

  def addValue(key: String, value: Int): Unit = {
    myMap += (key -> value)
  }

  def getValue(key: String): Int = {
    myMap.getOrElse(key, 0) // Potential error: returns 0 for missing keys
  }
}
```