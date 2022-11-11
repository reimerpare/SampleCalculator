package com.example.calcu

/**
 * Main function for Box class example.
 * @author Team Sheeshable
 */
fun main() {
    val box1 = Box(20, 20, 10)
    val box2 = Box(
        length = 10,
        width = 10,
        height = 10
    )

    println("Box 1 Volume: ${box1.volume}")
    println("Box 2 Volume: ${box2.volume}")
    box1.fillContents()
    box2.open()
}