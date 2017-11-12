package com

object ContainsA {
  def main(args : Array[String]){
    // Declaring the array List
    val argList = List("alpha","gamma","omega","zeta","beta");
    var count = 0;
    
    // Loop to check and increment if the string starts with A
    for(value <- argList if (value.startsWith("a"))){
      count = count + 1;
    }
    println("Count of Strings which starts with A is :" + count);
  }
}