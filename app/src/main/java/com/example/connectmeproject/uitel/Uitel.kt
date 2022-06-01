package com.example.connectmeproject.uitel

import android.content.Context
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.example.connectmeproject.R
import com.google.android.gms.fido.fido2.api.common.RequestOptions

fun getProgressDrawable(c:Context): CircularProgressDrawable {
    return CircularProgressDrawable(c).apply {
        strokeWidth = 5f
        centerRadius = 40f
        start()
    }
}

/**set images*/
/*
fun ImageView.loadImage(uri:String?,progressDrawable: CircularProgressDrawable){
        val option =RequestOptions().placeholder(progressDrawable)
            .error(R.mipmap.ic_launcher)

        Glide.with(context)
            .setDefaultRequestOptions(option)
            .load(uri)
            .into(this)

}
//@BindingAdapter("android:imageUrl")
fun loadImage(view:ImageView,url:String){
    view.loadImage(url, getProgressDrawable(view.context))
}
*/
