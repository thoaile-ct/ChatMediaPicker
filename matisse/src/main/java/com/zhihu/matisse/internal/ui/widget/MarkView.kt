package com.zhihu.matisse.internal.ui.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.zhihu.matisse.R
import kotlinx.android.synthetic.main.mark_view.view.*

class MarkView : ConstraintLayout {

    constructor(context: Context) : super(context) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(context)
    }

    private fun init(context: Context) {
        LayoutInflater.from(context).inflate(R.layout.mark_view, this, true)
    }

    /**
    set count number
     */
    fun setCountNumber(number: Int) {
        tvMarkNumber.setText(number.toString())
    }
}