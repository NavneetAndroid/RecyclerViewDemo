package com.example.recyclerview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

val mylist:MutableList<Abc> = mutableListOf<Abc>()
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Abc=Abc("Abhishek","Dubey","abc@gmail.com")
        mylist.add(Abc)
        val Abc1=Abc("Navneet","Singh","abc@gmail.com")
        mylist.add(Abc1)
     val userAdapter=UserAdapter(mylist)
        findViewById<RecyclerView>(R.id.recycle).adapter=userAdapter
    }
}