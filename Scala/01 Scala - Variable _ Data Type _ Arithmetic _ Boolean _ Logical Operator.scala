// Databricks notebook source
// Define a variable
// Get the data type

val var_1 = 10
val var_2 = 20.00
val var_3 = "My first company !!"
val var_4 = true 

// it's value can be changed. val var_5 = 19 : this can not be changed
var var_5 = 19

// COMMAND ----------

// print the variable value 
println(s"Variable 1 - $var_1")
println(s"Variable 2 - $var_2")
println(s"Variable 3 - $var_3")
println(s"Variable 4 - $var_4")
println(s"Variable 5 - $var_5")

// COMMAND ----------

// print the data type of each 
// use {} to execute the expression 
// print for simple print on the same line 
// println is used to print and move to the next line 
println(s"Data Type of variable 1 - ${var_1.getClass()}")
println(s"Data Type of variable 2 - ${var_2.getClass()}")
println(s"Data Type of variable 3 - ${var_3.getClass()}")
println(s"Data Type of variable 4 - ${var_4.getClass()}")
println(s"Data Type of variable 5 - ${var_5.getClass()}")

// COMMAND ----------


// Arithmetic Operators
println(s"Addition       of var_1($var_1) and var_2($var_2) = ${var_1+var_2}")
println(s"Substraction   of var_1($var_1) and var_2($var_2) = ${var_1-var_2}")
println(s"Division       of var_1($var_1) and var_2($var_2) = ${var_1/var_2}")
println(s"Multiplication of var_1($var_1) and var_2($var_2) = ${var_1*var_2}")
println(s"Modulus        of var_1($var_1) and var_2($var_2) = ${var_1%var_2}")

// COMMAND ----------

// Boolean Comparison Operators

println(10==10) // true
println(10!=10) // false
println(10>=10) // true
println(10<=10) // true
println(10>10) // false 
println(10<10) // false

// COMMAND ----------

// Logical Operators in Scala

val one = true 
val two = false 

println(one && two)
println(one || two)
println(!one)

// COMMAND ----------

// String Operations and Interpolation

val greeting:String = "Welcome to the Optum"
val name = "suraj"

println(greeting+" "+name) // concatenation 
println(name.length)
println(name.toUpperCase)
println(name.substring(0,2))

// COMMAND ----------

// some of the basic string operations are
val one = "Suraj "
val two = "Viswakarma"

println(one+" "+two) // concatenation
println(one.length) // length
println(one.toUpperCase) // case change 
println(two.toLowerCase) // case change
println(one.trim) // trim space
println(name.substring(1, 3)) // substring 
println(one.startsWith("S")) 
println(two.endsWith("a"))
println(one.contains("a"))
println(one.replace("S", "s"))
println(one.split(" "))
println(one.reverse)

// COMMAND ----------

// to know all the methods, there is a way 
for (i <- one.getClass().getMethods()) {
  println(i.getName())
}

// COMMAND ----------

// String Interpolations 
val language = "Scala"
val version = 3.0

// s-interpolator (substitute variables)
println(s"This is the language value $language")

// f-interpolator (formatted output)
println(f"Pi is approximately - ${3.14159}%.2f")

// raw-interpolator (ignore escape sequence)
println("path - C:\networkfolder\test")