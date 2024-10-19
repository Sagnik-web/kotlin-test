package com.example.myapplication

fun main(){
    MainClass(10).add(10,20)

    SecondClass()
}

class MainClass: MyInterface {

     override fun add(a: Int, b: Int) {

        println(a+b)
    }
    constructor(x: Int){
        println(x)
    }

}

class SecondClass: NewClass(), MyInterface{

    init {
        println("Second Class Sagnik Biswas")
    }

    override fun add(a: Int, b: Int) {

    }
}


