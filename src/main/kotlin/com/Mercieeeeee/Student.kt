package com.kotlin.student

import java.util.*

fun main() {
//    userInput()
    val stu = Student("Mercieeeeee", 77, 99)
    stu.print()
    val test = 123
    println("Test is $test")
    println("High score ${stu.highest()}")
}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    println("Please enter student's name: ")
//    var name = scanner.next()
    var name = null
    println("Please enter student's english: ")
    var english = scanner.nextInt()
    println("Please enter student's math: ")
    var math = scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()
    stu.nameCheck()
}

class Student(var name: String?, var english: Int, var math: Int) {
    fun print() {
        println(name + "\t" + english + "\t" + math + "\t"
                    + (english + math) / 2)
    }

    fun highest() : Int {
        var max = if (english > math) {
            println("english")
            english
        } else {
            println("math")
            math
        }
//        var max = 0
        /*if (english > math) {
            max = english
        } else {
            max = math
        }*/
        return max
    }

    fun nameCheck() {
        println(name?.length)
    }
}