// Databricks notebook source
// Scala does not have its own module for datetime, since it is java based, we can leverage java modules 
// followings are the class and description of datetime 
/*
  LocalDate       -- represents a date                  -- LocalDate.now()
  LocalTime       -- represents time only               -- LocalTime.now()
  LocalDateTime   -- represents both date and time      -- LocalDateTime.now()
  Instant         -- a moment in UTC time               -- Instant.now()
  ZonedDateTime   -- date/time with time zone info      -- ZonedDatTime.now()
  ZoneId          -- represents a time zone             -- ZoneId.of("America/New_York")

*/

import java.time._

val date = LocalDate.now()
val time = LocalTime.now()
val dateTime = LocalDateTime.now()

println(date)
println(time)
println(dateTime)

// COMMAND ----------

val customDate = LocalDate.of(2025, 12, 31)
val customTime = LocalTime.of(23, 58, 59)
val customDateTime = LocalDateTime.of(customDate, customTime)

println(customDate)
println(customTime)
println(customDateTime)

// COMMAND ----------

val today = LocalDate.now()
val nextWeek = today.plusDays(7)
val lastMonth = today.minusMonths(1)

println(s"$today $nextWeek $lastMonth")

// COMMAND ----------

import java.time._

val start = LocalDate.now()
val end = start.plusDays(5)
val period = Period.between(start, end)

println(s"$start $end $period")

// COMMAND ----------

import java.time.format.DateTimeFormatter

val now = LocalDateTime.now()
val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:MM")

println(now.format(formatter))

// COMMAND ----------

// Reading a file line by line and all lines into a list 
import scala.io.Source

// open the file 
val filename:String = "path.txt"
val source = Source.fromFile(filename)

try{
  // iterate over the lines
  for (eachline <- source.getLines()){
    println(eachline)
  }
}catch{
  e:Exception => {
    println("Error while opening the file")
  }
}finally {
  source.cloase() // always close the file
}

// all the lines in a list at once
val lines:List[String] = Source.fromFile(filename).getLines().toList
print(lines)

// COMMAND ----------

// Write to a file 
import java.io.PrintWriter

val writer = new PrintWriter("output.text")
writer.write("Hello Scala!\n This is a new line.")
writer.close() // flush and close 

// COMMAND ----------

// Append to a File
import java.io.FileWriter

val fw = new FileWriter("output.txt",true)
fw.write("\nThis is a new line!")
fw.close()

// COMMAND ----------

// Some general file operations 
/*
  Check if file exists  -- import java.io.File; new File("file.txt").exists
  Get file size         -- new File("file.txt").length
  Delete file           -- new File("emp.txt").delete()
  Copy file             -- Files.copy(Paths.get("src.txt"), Paths.get("dest.txt"))
  Move/ Rename File     -- Files.move(Paths.get("old.txt"), Paths.get("new.txt"))

*/