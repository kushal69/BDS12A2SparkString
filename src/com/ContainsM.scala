package com

object ContainsM {
  def main(args : Array[String]){
    // Declaring the array List
    val argList = List("alpha","gamma","omega","zeta","beta");
    
    println("Below are the List of String which contains M :");
    // Loop to print the String which has M in it
    for(value <- argList){
      if(value.indexOf("m") != -1){
        println("-> " + value);
      }
    }
  }
}