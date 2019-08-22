package com.example.mydicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.request.RequestOptions

class resepDetail : AppCompatActivity() {
    private val resepDatas: ArrayList<Resep> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resep_detail)




        val posNow = intent.getIntExtra("posNow",0)
        //setTitle(resepNameGet.toString())

        resepDatas.addAll(ResepData.listData)
        val (resepNameVal, resepSourceVal, resepDescVal, resepIngVal, resepDoVal, resepPhotoVal)  = resepDatas[posNow]

      //var resepName: AppCompatTextView = this.findViewById(R.id.resepName)
        var resepSource: AppCompatTextView = this.findViewById(R.id.resepSourceDet)
        var resepDesc: AppCompatTextView = this.findViewById(R.id.resepDescDet)
        var resepPhoto: ImageView = this.findViewById(R.id.resepPhotoDet)
        var resepIng: AppCompatTextView = this.findViewById(R.id.resepIngDet)
        var resepDo: AppCompatTextView = this.findViewById(R.id.resepDoDet)

        setTitle(resepNameVal)
        Glide.with(this)
            .load(resepPhotoVal)
            .apply(
                RequestOptions()
                    .format(DecodeFormat.PREFER_ARGB_8888))
            .into(resepPhoto)
        //resepName.text = resepName
        resepSource.text = "Sumber : " + resepSourceVal
        resepDesc.text = resepDescVal
        resepIng.text = resepIngVal
        resepDo.text = resepDoVal


        val actionbar = supportActionBar
        actionbar!!.title = resepNameVal
        actionbar.setDisplayHomeAsUpEnabled(true)

    }
    companion object {
        const val resepName = "resepName"
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
