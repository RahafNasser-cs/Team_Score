package com.example.teamscore.ui.score

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.teamscore.databinding.FragmentTeamScoreBinding


class TeamScoreFragment : Fragment() {
    var binding: FragmentTeamScoreBinding? = null

    private val viewModel: TeamScourViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTeamScoreBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding!!.addOnePoint.setOnClickListener{
            viewModel.addOnePoint()
            updateScour()
        }
        binding!!.subTwoPoint.setOnClickListener{
            viewModel.subTwoPoint()
            updateScour()
        }
        binding!!.addFourPoint.setOnClickListener {
            viewModel.addFourPoint()
            updateScour()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
    fun updateScour(){
        binding!!.scoreTextview.setText(viewModel.score.toString())
        binding!!.action.setText(viewModel.action.toString())
    }

}