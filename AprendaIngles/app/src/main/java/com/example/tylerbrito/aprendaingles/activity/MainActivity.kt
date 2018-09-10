package com.example.tylerbrito.aprendaingles.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.tylerbrito.aprendaingles.R
import com.example.tylerbrito.aprendaingles.fragment.BichosFragment
import com.example.tylerbrito.aprendaingles.fragment.NumerosFragment
import com.example.tylerbrito.aprendaingles.fragment.VogaisFragment
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.elevation = 0.toFloat()
        supportActionBar?.title = "Aprenda Inglês"

        val adapter = FragmentPagerItemAdapter(
                supportFragmentManager, FragmentPagerItems.with(this)
                .add("Bichos", BichosFragment::class.java)
                .add("Números", NumerosFragment::class.java)
                .add("Vogais", VogaisFragment::class.java)
                .create())

        viewPager.adapter = adapter
        viewPagerTab.setViewPager(viewPager)
    }
}
