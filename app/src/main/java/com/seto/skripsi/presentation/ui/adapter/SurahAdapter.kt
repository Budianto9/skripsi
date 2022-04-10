package com.seto.skripsi.presentation.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.seto.core.data.source.remote.response.SurahResponse
import com.seto.skripsi.databinding.ListItemBinding

class SurahAdapter : RecyclerView.Adapter<SurahAdapter.HomeViewHolder>() {

    private val listSurahResponse = mutableListOf<SurahResponse>()

    fun setData(items: List<SurahResponse>?){
        if (items == null) return
        listSurahResponse.clear()
        listSurahResponse.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder =
        HomeViewHolder(ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val data = listSurahResponse[position]
        holder.bindTo(data)
    }

    override fun getItemCount(): Int = listSurahResponse.size

    inner class HomeViewHolder(private val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root){

        fun bindTo(item: SurahResponse){

            binding.tvTitle.text = item.name
            binding.tvNumberOfAyah.text = item.numberOfAyah.toString()
            binding.tvType.text = item.type
        }
    }
}