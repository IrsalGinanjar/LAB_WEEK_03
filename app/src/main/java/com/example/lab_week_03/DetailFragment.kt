package com.example.lab_week_03

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lab_week_03.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val coffeeId = arguments?.getString("coffeeId")

        when (coffeeId) {
            "affogato" -> {
                binding.coffeeTitle.text = getString(R.string.affogato_title)
                binding.coffeeDesc.text = getString(R.string.affogato_desc)
            }
            "americano" -> {
                binding.coffeeTitle.text = getString(R.string.americano_title)
                binding.coffeeDesc.text = getString(R.string.americano_desc)
            }
            "latte" -> {
                binding.coffeeTitle.text = getString(R.string.latte_title)
                binding.coffeeDesc.text = getString(R.string.latte_desc)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
