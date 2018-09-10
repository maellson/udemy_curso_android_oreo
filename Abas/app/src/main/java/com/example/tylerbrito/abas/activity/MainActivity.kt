package com.example.tylerbrito.abas.activity

import android.support.v7.app.AppCompatActivity

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import com.example.tylerbrito.abas.R
import com.example.tylerbrito.abas.fragment.EmAltaFragment
import com.example.tylerbrito.abas.fragment.HomeFragment
import com.example.tylerbrito.abas.fragment.InscricoesFragment
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.elevation = 0.toFloat()
        supportActionBar?.title = "Iú túbio"

        val adapter = FragmentPagerItemAdapter(
                supportFragmentManager, FragmentPagerItems.with(this)
                .add("Home", HomeFragment::class.java)
                .add("Inscrições", InscricoesFragment::class.java)
                .add("Em Alta", EmAltaFragment::class.java)
                .create())

        viewPager.adapter = adapter
        viewPagerTab.setViewPager(viewPager)
    }
}
