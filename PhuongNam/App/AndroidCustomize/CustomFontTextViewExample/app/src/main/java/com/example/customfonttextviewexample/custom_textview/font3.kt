package com.example.customfonttextviewexample.custom_textview

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class font1 : AppCompatTextView {
    constructor(context: Context) : super(context) {
        setFontTextView()
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        setFontTextView()
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        setFontTextView()
    }

    fun setFontTextView() {
        var typeface: Typeface? = Utils.getFont1(context)
        setTypeface(typeface)
    }
}