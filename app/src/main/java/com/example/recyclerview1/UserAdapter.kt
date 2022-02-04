package com.example.recyclerview1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(val mylist:List<Abc>): RecyclerView.Adapter<UserAdapter.MyViewHolder>() {

    class MyViewHolder(val view: View): RecyclerView.ViewHolder(view){
        val firstname=view.findViewById<TextView>(R.id.firstname)
        val email=view.findViewById<TextView>(R.id.email)
        val lastname=view.findViewById<TextView>(R.id.lastname)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.list,parent,false)
        return MyViewHolder(view)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.firstname.text= mylist.get(position).firstname
        holder.lastname.text= mylist.get(position).lastname
        holder.email.text= mylist.get(position).email
    }

    override fun getItemCount(): Int {
       return mylist.size

    }
}