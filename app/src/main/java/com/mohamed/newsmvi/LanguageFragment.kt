package com.mohamed.newsmvi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mohamed.newsmvi.databinding.FragmentLanguageBinding
import com.mohamed.newsmvi.utils.LocaleHelper
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LanguageFragment : Fragment() {

    private lateinit var binding: FragmentLanguageBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLanguageBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        addListeners()
    }

    private fun addListeners() {
        binding.btnSave.setOnClickListener {
            context?.let { i ->
                if (binding.languageRadio.checkedRadioButtonId == binding.arabicChoice.id) {
                    LocaleHelper.setLocale(i, "ar")
                } else
                    LocaleHelper.setLocale(i, "en")
                findNavController().navigate(LanguageFragmentDirections.actionLanguageFragmentToArticles())
            }
        }
    }
}