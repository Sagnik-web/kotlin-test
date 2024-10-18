package com.example.myapplication

class MyClass : NewClass() {

    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            println("Hello World")

//            val a = NewClass()
//            a.Name()

//            abc()
            var a = 0
            for (i in 0 until 10){
             println(a)
                a += 1
            }

            for (i in 10 downTo  0){
                println(i)

            }
        }


        fun abc(){
            println("AbC")
        }
    }
}