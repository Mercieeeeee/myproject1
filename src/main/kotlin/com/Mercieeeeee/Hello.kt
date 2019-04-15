package com.Mercieeeeee

fun main(args: Array<String>) {
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