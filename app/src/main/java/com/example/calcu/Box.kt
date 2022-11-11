package com.example.calcu

/**
 * Creates a Box Object.
 * @author Team Sheeshable
 * @property length Length of the box.
 * @property width Width of the box.
 * @property height Height of the box.
 */
class Box(
    var length: Int = 0,
    var width: Int = 0,
    var height: Int = 0
) {
    init {
        println("Init Block Called")
    }

    constructor() : this(0,0,0){
        println("Secondary constructor called")
    }

    val volume
        get() = length * width * height

    /**
     * Prints if box has value.
     */
    fun fillContents() {
        println("Box is Filled")
    }

    /**
     * Prints when box is opened.
     */
    fun open() {
        println("Box Opened")
    }
}