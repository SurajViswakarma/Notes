// Databricks notebook source
// functions 
def get_add(num_1:Int, num_2:Int) = {
  return num_1 + num_2
}

println(get_add(10,20))

// COMMAND ----------

// ananymous functions (lambda)
val suraj_add_me = (num_1:Int, num_2:Int) => num_1+num_2
println(suraj_add_me(10,20))

// COMMAND ----------

// Function Returning Unit (like void in Java)
// it performs an action but does not return a meaningful value
// Unit is a special type in Scala that represents the absence of a return value.

def greet_me(msg:String=""): Unit = {
  print("greetings of the day")
}

greet_me()

// COMMAND ----------

// Collections
// collections are powerful data structures used to store, manipulate, and process groups of elements.
/*
1. Sequential Collections
These maintain the order of elements.


List: Immutable, ordered, allows duplicates
List(1, 2, 3)


Vector: Immutable, fast random access
Vector(1, 2, 3)


Array: Mutable, fixed size, fast access
Array(1, 2, 3)


Queue: FIFO structure
scala.collection.mutable.Queue(1, 2, 3)


Range: Represents a sequence of numbers
1 to 5 → Range(1, 2, 3, 4, 5)



2. Set Collections
These store unique elements.


Set: Immutable by default
Set(1, 2, 3)


HashSet: Mutable, fast lookup
scala.collection.mutable.HashSet(1, 2, 3)


TreeSet: Sorted set
scala.collection.immutable.TreeSet(3, 1, 2)



3. Map Collections
Store key-value pairs.


Map: Immutable by default
Map("a" -> 1, "b" -> 2)


HashMap: Mutable, fast access
scala.collection.mutable.HashMap("a" -> 1)


TreeMap: Sorted by keys
scala.collection.immutable.TreeMap("b" -> 2, "a" -> 1)



🔹 Mutable vs Immutable Collections

Immutable: Cannot be changed after creation. Preferred in functional programming.
Mutable: Can be modified (add/remove/update elements).

🔹 Common Operations on Collections

map: Transform each element
filter: Select elements based on condition
reduce / fold: Aggregate elements
foreach: Iterate over elements
groupBy: Group elements by a function
zip: Combine two collections element-wise

*/



// COMMAND ----------

// Option Type 
// In Scala, the Option type is a powerful tool for handling optional or missing values safely, without resorting to null. It represents a value that may or may not exist.

val name: Option[String] = Some("Suraj")
val name: Option[String] = None

// Why Use Option?

// Avoids NullPointerException
// Encourages safe handling of missing data
// Common in functional programming and APIs

val maybeName: Option[String] = Some("Suraj")

maybeName match {
  case Some(name) => println(s"Hello, $name")
  case None       => println("Hello, Guest")
}

// Use Cases

// Safe return types from functions
// Handling optional fields in data models
// Avoiding nulls in APIs and libraries
// Working with collections and transformations

// COMMAND ----------

// MAGIC %md
// MAGIC | Method      | Description                                      | Example                                      |
// MAGIC |-------------|--------------------------------------------------|----------------------------------------------|
// MAGIC | `get`       | Returns the value (unsafe if `None`)             | `Some(1).get` → `1`                          |
// MAGIC | `getOrElse` | Returns value or default                         | `None.getOrElse(0)` → `0`                   |
// MAGIC | `isEmpty`   | Checks if value is absent                        | `None.isEmpty` → `true`                     |
// MAGIC | `isDefined` | Checks if value is present                       | `Some(1).isDefined` → `true`                |
// MAGIC | `map`       | Transforms the value if present                  | `Some(2).map(_ * 2)` → `Some(4)`            |
// MAGIC | `flatMap`   | Transforms and flattens nested Option            | `Some(2).flatMap(x => Some(x * 2))` → `Some(4)` |
// MAGIC | `filter`    | Keeps value only if it satisfies condition       | `Some(4).filter(_ > 2)` → `Some(4)`         |
// MAGIC | `contains`  | Checks if value matches                          | `Some(3).contains(3)` → `true`              |
// MAGIC | `foreach`   | Executes side-effect if value is present         | `Some("Hi").foreach(println)`               |
// MAGIC | `fold`      | Combines default and transformation              | `None.fold("default")(_.toUpperCase)` → `"default"` |

// COMMAND ----------

// Core Transformations on Collection 
/*
  map      -- transform each element
  flatMap  -- Maps + flattens nested collections
  filter   -- keep element matching a condition 
  reduce   -- reduces to a single value
  fold     -- like reduce, with initial value 
  groupBy  -- groups elements by a function 

*/
