package com.example.tp1customcomponent

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout

class CustomComponent(context: Context, attributeSet: AttributeSet): LinearLayout(context, attributeSet) {

    init{
        View.inflate(context, R.layout.custom_component_view, this)
        val img: ImageView = findViewById(R.id.img)
        val text_edit: EditText = findViewById(R.id.text_edit_field)
        val att_img = R.styleable.CustomComponent_src
        val att_text = R.styleable.CustomComponent_text
        val att_text_color = R.styleable.CustomComponent_textColor

        val values = context.obtainStyledAttributes(attributeSet, R.styleable.CustomComponent)
        img.setImageDrawable(values.getDrawable(att_img))
        text_edit.setText(values.getString(att_text))
        text_edit.setTextColor(values.getColor(att_text_color, Color.GREEN))
        values.recycle()
    }

}