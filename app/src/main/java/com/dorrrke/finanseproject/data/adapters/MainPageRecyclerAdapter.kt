package com.dorrrke.finanseproject.data.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dorrrke.finanseproject.R
import com.dorrrke.finanseproject.data.dbModels.PlanModel

class MainPageRecyclerAdapter(private val plans: List<PlanModel>) :
RecyclerView.Adapter<MainPageRecyclerAdapter.PlanViewHolder>(){

    class PlanViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var periodTextView: TextView? = null
        var budgetTextView: TextView? = null
        var spentTextView: TextView? = null

        init{
            periodTextView = itemView.findViewById(R.id.period)
            budgetTextView = itemView.findViewById(R.id.budget)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.plans_view, parent, false)
        return PlanViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PlanViewHolder, position: Int) {
        holder.periodTextView?.text = plans[position].period
        holder.budgetTextView?.text = plans[position].budget.toString()
//        holder.spentTextView?.text = plans[position].
    }

    override fun getItemCount() = plans.size

}