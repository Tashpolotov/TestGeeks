package com.example.testgeeks.presenter.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.testgeeks.databinding.ItemHomeBinding
import com.example.testgeeks.domain.model.HomeModel

class HomeAdapter(val onClick:()->Unit): ListAdapter<HomeModel, HomeAdapter.ViewHolder>(Diff()) {

    inner class ViewHolder(val binding:ItemHomeBinding):RecyclerView.ViewHolder(binding.root) {
        fun bind(model: HomeModel) {
            binding.tvName.text = model.name
            binding.tvYears.text = model.years

            Glide.with(binding.root)
                .load(model.img)
                .into(binding.img)

            itemView.setOnClickListener {
                onClick()
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemHomeBinding.inflate(LayoutInflater.from(parent.context), parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

class Diff:DiffUtil.ItemCallback<HomeModel>() {
    override fun areItemsTheSame(oldItem: HomeModel, newItem: HomeModel): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: HomeModel, newItem: HomeModel): Boolean {
        return oldItem == newItem
    }

}
