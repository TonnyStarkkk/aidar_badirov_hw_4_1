package com.example.aidar_badirov_hw_4_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.aidar_badirov_hw_4_1.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    private val args: DetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        val view = binding.root

        val userDetailFragment = args.user

        binding.tvName.text = userDetailFragment.name
        binding.tvEmail.text = userDetailFragment.email
        binding.tvPassword.text = userDetailFragment.password.toString()

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}