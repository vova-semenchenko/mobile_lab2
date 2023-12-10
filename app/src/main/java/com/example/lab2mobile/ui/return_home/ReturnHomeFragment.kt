package com.example.lab2mobile.ui.return_home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.lab2mobile.MainActivity
import com.example.lab2mobile.R
import com.example.lab2mobile.databinding.FragmentHelpBinding
import com.example.lab2mobile.databinding.FragmentReturnHomeBinding


class ReturnHomeFragment : Fragment() {

    private var _binding: FragmentReturnHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentReturnHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.buttonOpenFirstActivity.setOnClickListener {
            val intent = Intent(requireContext(), MainActivity::class.java)
            startActivity(intent)
            activity?.finish()
        }
        return root
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            ReturnHomeFragment()

    }
}