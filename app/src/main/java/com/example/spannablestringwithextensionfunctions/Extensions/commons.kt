package com.example.spannablestringwithextensionfunctions.Extensions

import android.graphics.Color
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.widget.TextView

fun TextView.changeTextColour(originalText: String) {

    val spannableString: SpannableString = SpannableString(originalText)
    val foregroundColorSpan: ForegroundColorSpan = ForegroundColorSpan(Color.BLUE)

    spannableString.setSpan(
        foregroundColorSpan,
        0,
        originalText.length,
        Spanned.SPAN_INCLUSIVE_INCLUSIVE
    )

    this.text = spannableString
}


/*
SpannableString spannableStr = new SpannableString(originalText);
ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.RED);
spannableStr.setSpan(foregroundColorSpan, 15, 30, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
spannableTextView.setText(spannableStr);*/
