package com.app1.cameraandroid

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.VideoView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var open_btn = findViewById<Button>(R.id.open_btn)
        println(packageName) /// com.app1.cameraandroid
        // println(open_btn) //androidx.appcompat.widget.AppCompatButton{448a66c VFED..C.. ......I. 0,0-0,0 #7f070075 app:id/open_btn}

        open_btn.setOnClickListener {
//            val intent = Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE)
//            val intent = Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
//
//            startActivityForResult(intent, 111)
//            startActivity(Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "111111111", null)))
//            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("sms:"+ 5366543222)))
//            val intent =  Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + 5457377336478))
//            intent.putExtra("sns_body", "Hello Bro")
//            startActivity(intent)



//            try{
//                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.google.android.calculator")))
//            }
//            catch (error:android.content.ActivityNotFoundException){
//                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=$packageName")))
//            }

            val video_url = "https://youtu.be/sRC-R0s1LB0"
            val videoURI = Uri.parse(video_url)
            val video = findViewById<VideoView>(R.id.videoView)

            video.setVideoURI(videoURI)
            video.start()


        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
            if(requestCode==111){
                if(data!=null){
                    val imageUri = data.data
                    val image_view = findViewById<ImageView>(R.id.image_gallary)
                    println(imageUri) //content://com.google.android.apps.photos.contentprovider/-1/1/content%3A%2F%2Fmedia%2Fexternal%2Fimages%2Fmedia%2F29/ORIGINAL/NONE/1776219444
                    println(image_view) //androidx.appcompat.widget.AppCompatImageView{672abfe V.ED..... ......ID 0,0-1080,919 #7f070061 app:id/image_gallary}
                    image_view.setImageURI(imageUri)
                }
//                val image = data!!.extras?.get("data") as Bitmap  // as BitMapがないとただの数字
//                val Image_view = findViewById<ImageView>(R.id.image_gallary)
//
//                Image_view.setImageBitmap(image)
            }

    }

}
