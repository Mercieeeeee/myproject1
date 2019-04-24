package com.Kotlin.student

import java.util.*

fun main() {
//    userInput()
    Student.pass = 50
    val stu = Student("Mercieeeeee", 60, 99)
    val stu1 = Student("Tom", 44, 68)
    val stu2 = Student("Eric", 30, 49)
    val gstu = GraduateStudent("Jack", 55, 65, 60)
    gstu.print()
    stu.print()
    stu1.print()
    stu2.print()
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

class GraduateStudent(name: String?, english: Int, math: Int, var thesis: Int) : Student(name, english, math) {
    companion object {
        var pass = 70
    }

    override fun print() {
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    override fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"
}

open class Student(var name: String?, var english: Int, var math: Int) {
    companion object {
        @JvmStatic
        var pass = 60
        fun test() {
            println("testing")
        }
    }

    open fun print() {
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    internal fun grading() = when(getAverage()) {
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    open fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"

    fun getAverage() : Int {
        return (english + math) / 2
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