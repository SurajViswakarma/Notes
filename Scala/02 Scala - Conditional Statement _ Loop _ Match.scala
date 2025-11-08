// Databricks notebook source
// if, else if, else
val num_1 : Int =  10 // explicit typing
val name_1 : String = "raja"
val age = 10 // inferred typing 

if ((num_1 == 10) && (name_1 == "suraj")){
  println("Yes")
} 
else if ((num_1 == 10) && (name_1 == "amit")) {
  println("No")
}
else {
  println("Ohh No")
}

// COMMAND ----------


val name:String = "Suraj"

val name_result = name match{
  case "Suraj" => s"Hello $name"
  case _ => "You are unknown"
}

println(name_result)

// COMMAND ----------


// define a function to return the week number 

val weekday:String = "Sunday"

def udf_get_week_number(weekday:String):String = weekday match {
  case "Monday" => "One"
  case "Tuesday" => "Two"
  case "Wednesday" => "Three"
  case "Thursday" => "Four"
  case "Friday" => "Five"
  case "Saturday" => "Six"
  case "Sunday" => "Seven"
  case _ => "Please select the correct weekday !"

}

println(udf_get_week_number(weekday))

// COMMAND ----------

// MAGIC %md
// MAGIC # 🔁 Scala Loops Summary
// MAGIC
// MAGIC | Loop Type           | Syntax Example                                                                 | Description                                                                 |
// MAGIC |---------------------|----------------------------------------------------------------------------------|-----------------------------------------------------------------------------|
// MAGIC | `for` loop          | `for (i <- 1 to 5) println(i)`                                                  | Iterates from 1 to 5 (inclusive).                                           |
// MAGIC | `for` with `if`     | `for (i <- 1 to 10 if i % 2 == 0) println(i)`                                   | Filters values during iteration.                                            |
// MAGIC | Nested `for` loop   | `for (i <- 1 to 3; j <- 1 to 2) println(s"i=$i, j=$j")`                         | Combines multiple loops.                                                    |
// MAGIC | `for` with `yield`  | `val squares = for (i <- 1 to 5) yield i * i`                                   | Returns a new collection from the loop.                                     |
// MAGIC | `while` loop        | `var i = 0; while (i < 5) { println(i); i += 1 }`                               | Executes while the condition is true.                                       |
// MAGIC | `do...while` loop   | `var i = 0; do { println(i); i += 1 } while (i < 5)`                            | Executes the block at least once, then checks the condition.                |
// MAGIC | `foreach` loop      | `List(1, 2, 3).foreach(i => println(i))`                                       | Applies a function to each element in a collection.                         |
// MAGIC | `map` (functional)  | `List(1, 2, 3).map(i => i * 2)`                                                 | Transforms each element and returns a new collection.                       |
// MAGIC
// MAGIC

// COMMAND ----------

// there are three loops used in the scala 
// for, while, and do while loop 
// it can also be used to yield the result

// COMMAND ----------

println(scala.util.Properties.versionString)

// COMMAND ----------

for (i <- 1 to 5) {
  println(i)
}


// COMMAND ----------

for (i <- 1 to 5 by 2) {
  println(i)
}


// COMMAND ----------

// for {
//   i <- 1 to 3
//   j <- 1 to 2
// } {
//   println(s"i = $i, j = $j")
// }

for (i <- 1 to 3; j <- 1 to 2) {
  println(s"i = $i, j = $j")
}


// COMMAND ----------

for(i <- 1 to 100; if i%25==0){
  println(i)
}

// COMMAND ----------

for (i <- 1 to 10;if i > 3;if i < 6;if i % 2 == 0) {
  println(i)
}

// COMMAND ----------

val yield_result = for(i <- 1 to 10; if i%5==0) yield i
println(yield_result)
println(yield_result.getClass()) // return type data type

// COMMAND ----------

// while loop

var i = 0

while (i < 3) {
  println(i)
  i += 1
}

// COMMAND ----------

// match 
// `i` is an integer
val day = i match {
  case 0 => "Sunday"
  case 1 => "Monday"
  case 2 => "Tuesday"
  case 3 => "Wednesday"
  case 4 => "Thursday"
  case 5 => "Friday"
  case 6 => "Saturday"
  case _ => "invalid day"   // the default, catch-all
}

// COMMAND ----------

i match {
  case 0 => println("1")
  case 1 => println("2")
  case what => println(s"You gave me: $what")
}

// COMMAND ----------

val N = 42
i match {
  case 0 => println("1")
  case 1 => println("2")
  case N => println("42")
  case n => println(s"You gave me: $n" )
}

// COMMAND ----------

val evenOrOdd = i match {
  case 1 | 3 | 5 | 7 | 9 => println("odd")
  case 2 | 4 | 6 | 8 | 10 => println("even")
  case _ => println("some other number")
}

// COMMAND ----------

i match {
  case 1 => println("one, a lonely number")
  case x if x == 2 || x == 3 => println("two’s company, three’s a crowd")
  case x if x > 3 => println("4+, that’s a party")
  case _ => println("i’m guessing your number is zero or less")
}

// COMMAND ----------

i match {
  case a if 0 to 9 contains a => println(s"0-9 range: $a")
  case b if 10 to 19 contains b => println(s"10-19 range: $b")
  case c if 20 to 29 contains c => println(s"20-29 range: $c")
  case _ => println("Hmmm...")
}

// COMMAND ----------

