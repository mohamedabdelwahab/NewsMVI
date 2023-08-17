package com.mohamed.newsmvi.searchNews.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import com.mohamed.domain.entity.NewsDto
import com.mohamed.newsmvi.databinding.ItemNewsArticleBinding

class NewsArticlePagingAdapter(
    private val onItemClick: (NewsDto) -> Unit,
) : PagingDataAdapter<NewsDto, NewsArticleViewHolder>(diffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsArticleViewHolder {
        val binding =
            ItemNewsArticleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NewsArticleViewHolder(binding,
            onItemClick = { position ->
                val article = getItem(position)
                if (article != null) {
                    onItemClick(article)
                }
            }
        )
    }

    override fun onBindViewHolder(holder: NewsArticleViewHolder, position: Int) {
        val currentItem = getItem(position)
        if (currentItem != null) {
            holder.bind(currentItem)
        }
    }

    companion object {
        val diffCallback = object : DiffUtil.ItemCallback<NewsDto>() {

            override fun areItemsTheSame(oldItem: NewsDto, newItem: NewsDto) =
                oldItem.url == newItem.url

            override fun areContentsTheSame(oldItem: NewsDto, newItem: NewsDto) =
                oldItem == newItem
        }

    }
}