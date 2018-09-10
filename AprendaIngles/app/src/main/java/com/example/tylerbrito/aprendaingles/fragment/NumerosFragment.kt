package com.example.tylerbrito.aprendaingles.fragment


import android.media.MediaPlayer
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.tylerbrito.aprendaingles.R
import kotlinx.android.synthetic.main.fragment_numeros.view.*

// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class NumerosFragment : Fragment(), View.OnClickListener {

    private var mediaPlayer: MediaPlayer = MediaPlayer()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_numeros, container, false)

        view.btnUm.setOnClickListener(this)
        view.btnDois.setOnClickListener(this)
        view.btnTres.setOnClickListener(this)
        view.btnQuatro.setOnClickListener(this)
        view.btnCinco.setOnClickListener(this)
        view.btnSeis.setOnClickListener(this)

        return view
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnUm -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.one)
                play()
            }
            R.id.btnDois -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.two)
                play()
            }
            R.id.btnTres -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.three)
                play()
            }
            R.id.btnQuatro -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.four)
                play()
            }
            R.id.btnCinco -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.five)
                play()
            }
            R.id.btnSeis -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.six)
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
