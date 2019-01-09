package com.nimtego.leadengi

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.nimtego.leadengi.R.id
import com.nimtego.leadengi.R.layout
import kotlinx.android.synthetic.main.toolbar.toolbar

abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_base_form)
        setSupportActionBar(toolbar)
        addFragment(savedInstanceState)
    }

    override fun onBackPressed() {
        (supportFragmentManager.findFragmentById(
                id.fragmentContainer) as BaseFragment).onBackPressed()
        super.onBackPressed()
    }

    private fun addFragment(savedInstanceState: Bundle?) =
            savedInstanceState ?: supportFragmentManager.inTransaction {
                add(
                        id.fragmentContainer, fragment())
            }

    abstract fun fragment(): BaseFragment
}