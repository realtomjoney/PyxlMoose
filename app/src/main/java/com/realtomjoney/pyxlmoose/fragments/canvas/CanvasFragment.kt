package com.realtomjoney.pyxlmoose.fragments.canvas

import android.graphics.Bitmap
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.realtomjoney.pyxlmoose.customviews.mycanvasview.PixelGridView
import com.realtomjoney.pyxlmoose.databinding.FragmentCanvasBinding

class CanvasFragment(val spanCount: Int) : Fragment() {
    private var _binding: FragmentCanvasBinding? = null

    private val binding get() = _binding!!

    lateinit var myCanvasViewInstance: PixelGridView

    var bitmap: Bitmap? = null

    private fun setupCanvas() {
        myCanvasViewInstance = PixelGridView(requireContext(), spanCount)
        binding.fragmentCanvasRootLayout.addView(myCanvasViewInstance)
    }

    companion object {
        fun newInstance(spanCount: Int) = CanvasFragment(spanCount)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentCanvasBinding.inflate(inflater, container, false)

        setupCanvas()

        return binding.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}