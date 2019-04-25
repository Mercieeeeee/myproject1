package com.Mercieeeeee

import java.io.File

fun main() {
    File("data.txt").bufferedReader().lines().forEach {
        println(it)
    }

//    write()

}

private fun write() {
//    File("outout.txt").writeText("abc123")
    File("outout.txt").bufferedWriter().use {
        it.write("1st line\n")
        it.write("2nd line\n")
        it.write("3rd line\n")
    }
}