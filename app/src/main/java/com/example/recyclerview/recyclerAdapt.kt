package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/*class recyclerAdapt (private val myDataset: Array<String>){
    RecyclerView.recyclerAdapt<recyclerAdapt.MyViewHolder>() {
        class MyViewHolder(val textView: TextView) :   RecyclerView.ViewHolder(textView)
        override fun onCreateViewHolder(parent: ViewGroup,
                                        viewType: Int): recyclerAdapt.MyViewHolder{
            val textView = LayoutInflater.from(parent.context)
                .inflate(R.layout.my_text_view, parent, false) as TextView
            return MyViewHolder(textView)
        }
        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            holder.textView.text = myDataset[position]
        }
        override fun getItemCount() = myDataset.size
    }
}
}*/