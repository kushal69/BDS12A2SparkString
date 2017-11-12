package com

object ConvertList {
  def main(args : Array[String]){
    // Declaring the array List
    val argList = List("alpha","gamma","omega","zeta","beta");
    // Declaring a new List of type integer
    var argIntList = List[Integer]();
    
    // Loop to create the a new list with the length of string in "argList"
    for(value <- argList) {
      argIntList = value.length() :: argIntList;
    }
    
    println("Below are the List of String to Int length of  :");
    // Loop to print the new list values
    for(intValue <- argIntList.reverse){
      println(intValue);
    }
  }
}