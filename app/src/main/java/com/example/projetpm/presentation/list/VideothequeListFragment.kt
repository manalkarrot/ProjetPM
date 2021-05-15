package com.example.projetpm.presentation.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projetpm.R

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class VideothequeListFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    private val adapter = VideothequeAdapter(listOf())
    private val layoutManager = LinearLayoutManager(context)

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_videotheque_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.videotheque_recyclerview)

        recyclerView.apply {
            layoutManager = this@VideothequeListFragment.layoutManager
            adapter = this@VideothequeListFragment.adapter
        }

        val seriesfilmsList = arrayListOf<Videotheque>().apply {
            add(Videotheque("The Walking Dead"))
            add(Videotheque("Lupin"))
            add(Videotheque("Murder"))
            add(Videotheque("Vampire Diaries"))
            add(Videotheque("The 100"))
            add(Videotheque("Riverdale"))
            add(Videotheque("Stranger Things"))

        }

        adapter.updateList(seriesfilmsList)

    }
}