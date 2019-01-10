package com.nimtego.leadengi

import android.support.v4.app.Fragment


abstract class BaseFragment : Fragment() {
    abstract fun onBackPressed()

}