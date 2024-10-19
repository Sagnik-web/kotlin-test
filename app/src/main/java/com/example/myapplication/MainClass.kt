package com.example.myapplication

fun main(){
//    MainClass(10).add(10,20)

//    SecondClass()

//    println(employee.ABC)

//    for (item in employee.entries){
//        if(item.value){
//            println(item)
//        }
//    }

     GenericsClass<String>("Sagnik Biswas")
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

enum class employee(val value :Boolean =  false){
    ABC(true),
    DEF,
    GHI,
    JKL( true)
}



open class GenericsClass<T> (newVal:T){
    val newVal : T
    init {
        this.newVal = newVal
        println("My Name is "+this.newVal)
    }
}
