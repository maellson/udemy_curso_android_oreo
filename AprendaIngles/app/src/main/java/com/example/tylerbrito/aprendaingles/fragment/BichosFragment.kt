package com.example.tylerbrito.aprendaingles.fragment


import android.media.MediaPlayer
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton

import com.example.tylerbrito.aprendaingles.R
import kotlinx.android.synthetic.main.fragment_bichos.*
import kotlinx.android.synthetic.main.fragment_bichos.view.*

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class BichosFragment : Fragment(), View.OnClickListener {

    private var mediaPlayer: MediaPlayer = MediaPlayer()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_bichos, container, false)

        view.btnCao.setOnClickListener(this)
        view.btnGato.setOnClickListener(this)
        view.btnLeao.setOnClickListener(this)
        view.btnMacaco.setOnClickListener(this)
        view.btnOvelha.setOnClickListener(this)
        view.btnVaca.setOnClickListener(this)

        return view
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnCao -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.dog)
                play()
            }
            R.id.btnGato -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.cat)
                play()
            }
            R.id.btnLeao -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.lion)
                play()
            }
            R.id.btnMacaco -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.monkey)
                play()
            }
            R.id.btnOvelha -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.sheep)
                play()
            }
            R.id.btnVaca -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.cow)
                play()
            }
        }
    }

    private fun play() {
        mediaPlayer?.let {
            mediaPlayer.start()
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        if (mediaPlayer != null) mediaPlayer.release()
    }
}

