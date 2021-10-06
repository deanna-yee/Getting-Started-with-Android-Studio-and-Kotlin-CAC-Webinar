package com.deannayee.clickerGame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.deannayee.clickerGame.databinding.FragmentGameBinding


class GameFragment : Fragment() {
    private var score:Int = 0
    override fun onCreateView(inflater: LayoutInflater, container:ViewGroup?, savedInstanceState: Bundle?): View{
        val binding: FragmentGameBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_game,
        container, false)
        score = 0
        binding.clickButton.setOnClickListener{
            score += 1
            binding.scoreLabel.text = score.toString()
        }
        return binding.root
    }
}