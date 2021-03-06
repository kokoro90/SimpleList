package com.chi.simplelist.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import com.chi.simplelist.R
import kotlinx.android.synthetic.main.fragment_item_detail.*

class ItemDetailFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_item_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        backToItemsButton.setOnClickListener {
            val action: NavDirections =
                ItemDetailFragmentDirections.actionItemDetailFragmentToItemsFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }
}