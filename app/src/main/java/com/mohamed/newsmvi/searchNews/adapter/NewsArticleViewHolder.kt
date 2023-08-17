package com.mohamed.newsmvi.searchNews.adapter

import androidx.recyclerview.widget.RecyclerView
import com.mohamed.domain.entity.NewsDto
import com.mohamed.newsmvi.databinding.ItemNewsArticleBinding
import com.mohamed.newsmvi.utils.loadImage

class NewsArticleViewHolder(
    private val binding: ItemNewsArticleBinding,
    private val onItemClick: (Int) -> Unit,
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(article: NewsDto) {
        binding.apply {
            imageView.loadImage(article.urlToImage)
            title.text = article.title ?: ""
        }
    }

    init {
        binding.apply {
            root.setOnClickListener {
                val position = bindingAdapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    onItemClick(position)
                }
            }
        }
    }
}