package com.Mercieeeeee

import com.Kotlin.student.Student

fun main(args: Array<String>) {
    val stu = Student("Mercieeeeee", 50 ,60)
    var s = "abcde"
    println(s.length)
    println(s.get(3))
    println(s.substring(3))
    var s1:String? = "ABCDE"
    s1 = null
    println(s1?.length)
    println(s1?.get(3))
    println(s1?.substring(3))
    /*var s2:String? = "12345"
    s2 = null
    println(s2!!.length)
    println(s2!!.get(3))
    println(s2!!.substring(3))*/

    println("Hello kotlin")
    val h = Human(weight = 66.5f, height = 1.7f)
    println(h.bmi())
    /*var age = 19
    age = 20
    var weught : Float = 66.5f
    var name : String
    name = "Mercieeeeee"*/
}

class Human(var name:String = "", var weight:Float,var height:Float) {
    init {
        println("test $weight")
    }
//    constructor(name:String, weight: Float, height: Float) :this(weight, height)
    fun bmi() :Float{
        val bmi = weight/(height*height)
        return bmi
    }
    fun hello() {
        println("Hello kotlin")
    }

}