package com.example.myapplication

class MyClass : NewClass() {

    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            println("Hello World")

            val a = NewClass()
            a.Name()

            abc()
//            for ()
        }


        fun abc(){
            println("AbC")
        }
    }
}