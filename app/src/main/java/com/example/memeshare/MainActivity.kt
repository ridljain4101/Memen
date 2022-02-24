package com.example.memeshare

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.bumptech.glide.Glide
import org.json.JSONObject

class MainActivity(val memeImageview: ImageView) : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

private fun loadMeme(){
    val textView = findViewById<TextView>(R.id.text)
// ...

// Instantiate the RequestQueue.
    Volley.newRequestQueue(this)
    val url = "https://meme-api.herokuapp.com/gimme"

// Request a string response from the provided URL.

    val jsonObjectRequest = JsonObjectRequest(Request.Method.GET, url, null,
        { response ->

             val url = response.getString("url")


             Glide.with(this).load(url).into(memeImageview)

         }, {
        Toast.makeText(this,"Something went wrong", Toast.LENGTH_LONG).show()
         }
                public OutOfMemoryError ()
    )


    fun nextMeme(view: android.view.View) {}
}

    private fun JsonObjectRequest(get: Int, url: String, nothing: Nothing?, function: (response: JSONObject) -> Unit, unit: Unit) {

    }

    fun nextShare(view: android.view.View) {}
}

private infix fun <R1> (() -> R1).public(outOfMemoryError: OutOfMemoryError) {

}
