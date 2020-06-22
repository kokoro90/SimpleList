package com.chi.simplelist.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import com.chi.simplelist.R
import kotlinx.android.synthetic.main.fragment_items.*

class ItemsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_items, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonDetails.setOnClickListener {
            val action:NavDirections = ItemsFragmentDirections.actionItemsFragmentToItemDetailFragment()
            Navigation.findNavController(it).navigate(action)
        }

        backToListButton.setOnClickListener {
            val action:NavDirections = ItemsFragmentDirections.actionItemsFragmentToListFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }
}