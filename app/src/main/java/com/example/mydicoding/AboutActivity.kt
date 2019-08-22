package com.example.mydicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.request.RequestOptions

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        setTitle("About")
        val actionbars = supportActionBar
        actionbars!!.title = "About"
        actionbars.setDisplayHomeAsUpEnabled(true)


        var resepPhoto: ImageView = this.findViewById(R.id.resepPhoto)
        Glide.with(this)
            .load("https://fileak.upbatam.ac.id/fotomhs/181510042.jpg?time=20190822165612")
            .apply(
                RequestOptions()
                    .format(DecodeFormat.PREFER_ARGB_8888))
            .into(resepPhoto)

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
