package com.example.connectmeproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.connectmeproject.Learn
import com.example.connectmeproject.R
import com.example.connectmeproject.databinding.ItemListBinding
//import java.util.ArrayList
//import kotlin.collections.ArrayList

class LearningAdapter(
    var c: Context, var learningList:ArrayList<Learn>
):RecyclerView.Adapter<LearningAdapter.LearningViewHolder>()

{
    inner class LearningViewHolder(var v:ItemListBinding):RecyclerView.ViewHolder(v.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LearningViewHolder {
        val inflter = LayoutInflater.from(parent.context)
        val v = DataBindingUtil.inflate<ItemListBinding>(
            inflter, R.layout.item_list,parent,
            false)

        return LearningViewHolder(v)
    }

    override fun onBindViewHolder(holder: LearningViewHolder, position: Int) {
        //holder.v.isLearn = learningList[position]
    }

    override fun getItemCount(): Int {
        return learningList.size

    }

}