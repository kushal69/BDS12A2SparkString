package com

object CountFour {
  def main(args : Array[String]){
    // Declaring the array List
    val argList = List("alpha","gamma","omega","zeta","beta");
    
    println("Below are the List of String which have length 4 :");
    
    // Loop to check the string length in the array list
    for(value <- argList if value.length() == 4) {
      println("-> " + value);
    }
  }
}