// Databricks notebook source
// MAGIC %md
// MAGIC # 📦 Scala Data Structures Summary
// MAGIC
// MAGIC | Data Structure     | Description                                                                 | Example                                      |
// MAGIC |--------------------|-----------------------------------------------------------------------------|----------------------------------------------|
// MAGIC | `Array`            | Fixed-size, mutable collection of elements of the same type                 | `val arr = Array(1, 2, 3)`                   |
// MAGIC | `List`             | Immutable, ordered collection                                               | `val list = List(1, 2, 3)`                   |
// MAGIC | `Set`              | Immutable collection of unique elements                                     | `val set = Set(1, 2, 2, 3)` → `Set(1, 2, 3)` |
// MAGIC | `Map`              | Immutable key-value pair collection                                         | `val map = Map("a" -> 1, "b" -> 2)`          |
// MAGIC | `Tuple`            | Fixed-size collection of elements of different types                        | `val tup = (1, "Scala", true)`              |
// MAGIC | `Vector`           | Immutable, indexed sequence optimized for random access                     | `val vec = Vector(1, 2, 3)`                  |
// MAGIC | `Queue`            | Mutable FIFO collection                                                     | `val queue = scala.collection.mutable.Queue(1, 2)` |
// MAGIC | `Stack`            | Mutable LIFO collection                                                     | `val stack = scala.collection.mutable.Stack(1, 2)` |
// MAGIC | `Option`           | Represents optional values (Some or None)                                   | `val opt = Some(5)` or `val opt = None`     |

// COMMAND ----------

// try catch and finally 

val num_1:Int = 10 
val num_2:Int = 2

try{
      val result:Int = num_1/num_2
      println(s"Result - $result")

} catch {
    case ae: ArithmeticException => {
      println("Cannot be divided by zero")
    }

    case e: Exception => {
      println(s"Error $e")
      // println(s"Error ${e.getMessage}")
    }

} finally {
  println("Code is executed")
}

// COMMAND ----------

// some common exceptions in scala 
/*
  ArithmeticException
  NullPointerException
  FileNotFoundException
  IndexOutOfBoundsException
  NoSuchElementException
*/

// COMMAND ----------

// List 
// Immutable: Once created, cannot be changed.
// Ordered: Maintains insertion order.
// Allows duplicates.
// Usage: Ideal for functional programming and when immutability is preferred.
// In scala, a List is homogeneous by default. However, you can store heterogeneous types
val fruit_list:List[String] = List("Apple","Banana","Orange")
println(fruit_list)

val random_list:List[Any] = List("Apple","Banana","Orange",1,2,3)
println(random_list)

// COMMAND ----------

// Tuple 
// Fixed-size collection of elements.
// Can hold heterogeneous types (e.g., Tuple3[Int, String, Boolean]).
// Immutable.
// Usage: Useful for grouping related but different types of values.
val person:Tuple3[String, Int, Boolean] = ("Suraj", 30, true)  // Tuple3[String, Int, Boolean]
val name = person._1
println(person)
println(name)

// COMMAND ----------

// Set
// Unordered collection.
// No duplicates allowed.
// Can be mutable or immutable.
val set:Set[Any] = Set(1, 2, 3, 3, "Suraj")  // Result: Set(1, 2, 3)
val newSet = set + 4
println(set)
println(newSet)

// COMMAND ----------

// Vector
// Immutable, indexed sequence.
// Efficient random access.
// Better performance than List for large collections.

val vector:Vector[Int] = Vector(1, 2, 3)
val updatedVector = vector :+ 4

println(vector)
println(updatedVector)

// COMMAND ----------

// Array
// Mutable, fixed-size.
// Efficient for performance-critical tasks.
// Not idiomatic in functional Scala, but useful in interoperability with Java.
val arr:Array[Int] = Array(1, 2, 3)
arr(0) = 10  // Mutates the array
println(arr)

// COMMAND ----------

// Option
// Represents optional values (presence or absence).
// Avoids null usage.
// Two subtypes: Some(value) and None.

val maybeName: Option[String] = Some("Suraj")
val noName: Option[String] = None

val greeting = maybeName.getOrElse("Guest")

println(maybeName)
println(noName)
println(greeting)

// COMMAND ----------

// Map 
// Immutable Map - by default 
// Mutable Map
// Map is a collection of key-value pairs
// It's similar to dictionaries in Python
val myMap = Map("a" -> 1, "b" -> 2)
val myMutableMap = Map("a" -> 1, "b" -> 2)

println(myMap)
println(myMutableMap)

for ((first,second) <- myMutableMap) {
  println(first, second)
}

// COMMAND ----------

