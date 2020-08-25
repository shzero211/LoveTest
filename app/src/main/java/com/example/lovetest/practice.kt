package com.example.lovetest

fun sanghun(name:String,age:Int):String{
  var introduce:String.(Int)->String={"${name}is${it}"}
  return name.introduce(age)

}


fun main(){
  println(sanghun("sanghun",25))
}