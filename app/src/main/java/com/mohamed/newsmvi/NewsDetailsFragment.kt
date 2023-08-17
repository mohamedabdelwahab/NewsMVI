package com.mohamed.newsmvi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.mohamed.newsmvi.databinding.FragmentNewsDetailsBinding
import com.mohamed.newsmvi.extensions.loadImage
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NewsDetailsFragment : Fragment() {
    val args by navArgs<NewsDetailsFragmentArgs>()

    private lateinit var binding: FragmentNewsDetailsBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewsDetailsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            image.loadImage(args.news.urlToImage)
            date.text = args.news.publishedAt
            author.text = args.news.author
            source.text = args.news.source
            title.text = args.news.title
            description.text = args.news.description
            content.text = args.news.content
        }
        addListners()
    }

    private fun addListners() {
    }


}