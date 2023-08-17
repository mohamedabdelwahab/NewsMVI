package com.mohamed.newsmvi.searchNews

import androidx.recyclerview.widget.RecyclerView
import com.mohamed.domain.entity.NewsDto
import com.mohamed.newsmvi.databinding.ItemNewsArticleBinding
import com.mohamed.newsmvi.extensions.loadImage

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