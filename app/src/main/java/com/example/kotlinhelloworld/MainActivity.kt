package com.example.kotlinhelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textView : TextView
    private lateinit var ansView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.inputValue)
        ansView = findViewById(R.id.AnsValue)

    }




    fun onTap1(view: View) {
        textView.append("1")
    }
    fun onTap2(view: View) {
        textView.append("2")
    }
    fun onTap3(view: View) {
        textView.append("3")
    }
    fun onTap4(view: View) {
        textView.append("4")
    }
    fun onTap5(view: View) {
        textView.append("5")

    }
    fun onTap6(view: View) {
        textView.append("6")
    }
    fun onTap7(view: View) {
        textView.append("7")
    }
    fun onTap8(view: View) {
        textView.append("8")
    }
    fun onTap9(view: View) {
        textView.append("9")
    }
    fun onTapC(view: View) {
        textView.text = ""
        ansView.text=""
    }
    fun onTad0(view: View) {
        textView.append("0")
    }
    fun onTapBack(view: View) {
        var s:String= textView.text.toString()
        textView.text= s.substring(0,s.length - 1)
    }
    fun onTapx(view: View) {
        textView.append("x")
    }
    fun onTapdevide(view: View) {
        textView.append("/")
    }
    fun onTapminus(view: View) {
        textView.append("-")
    }
    fun onTapAdd(view: View) {
        textView.append("+")
    }
    fun onTapEqual(view: View) {
        ansView.text =""
        var s:String= textView.text.toString()
        println(s)
        var num:String = ""
        val numbers = mutableListOf<Double>()
        val operators = mutableListOf<Char>()
        for(i in 0..s.length - 1){
            println(s[i])
            if(s[i].equals('x')||s[i].equals('/')||s[i].equals('-')||s[i].equals('+')){
                numbers.add(num.toDouble())
                operators.add(s[i])
                num=""
                println("0")
            }
            else{
                num= num + s[i]
                println("1")
            }
            

        }
        println("Done")
//        println(num.toInt())
        numbers.add(num.toDouble())
        println(numbers)
        println("Done")
        var c:Int = 0
        var t:Double= 0.0
        if(numbers.size <2){
            ansView.append(numbers[0].toString())
        }
        else{
            if(operators[c].equals('x')){
                t = numbers[0] * numbers[1]
            }
            else if(operators[c].equals('/')){
                t = numbers[0] / numbers[1]
            }
            else if(operators[c].equals('-')){
                t = numbers[0] - numbers[1]
            }
            else if(operators[c].equals('+')){
                t = numbers[0] + numbers[1]
            }
            c++
            println(t)
            println(numbers.size)
            for(j in 2..numbers.size - 1){
                println("done")
                if(operators[c].equals('x')){
                    t*=numbers[j]
                }
                else if(operators[c].equals('/')){
                    t/=numbers[j]
                }
                else if(operators[c].equals('-')){
                    t-=numbers[j]
                }
                else if(operators[c].equals('+')){
                    t+=numbers[j]
                }
                c++
            }


            ansView.append(t.toString())
        }


    }

    fun onTaddot(view: View) {
        textView.append(".")
    }


}