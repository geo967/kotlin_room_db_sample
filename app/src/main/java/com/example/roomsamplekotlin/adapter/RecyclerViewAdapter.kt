package com.example.roomsamplekotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.roomsamplekotlin.R
import com.example.roomsamplekotlin.db.UserEntity

class RecyclerViewAdapter: RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {
    private var items=ArrayList<UserEntity>()
    fun setListName(data:ArrayList<UserEntity>) {
        items = data
    }




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater=LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_row,parent,false)
        return MyViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class MyViewHolder(v: View):RecyclerView.ViewHolder(v){
        val tvName:TextView=v.findViewById(R.id.name_text_item_design_id)
        val tvEmail:TextView=v.findViewById(R.id.email_text_item_design_id)
        fun bind(data:UserEntity){
            tvName.text=data.name
            tvEmail.text=data.email
        }
    }

    interface RowClickListener{
        fun onItemClickListener(user:UserEntity)
    }

}