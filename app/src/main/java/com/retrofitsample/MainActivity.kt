package com.retrofitsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.retrofitsample.model.RetrofitSampleResponse
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {
    private val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // do network call
        doNetworkCall()
    }


    private fun initRetrofit() = Retrofit.Builder()
            .baseUrl("http://www.mocky.io/v2/")
            .addConverterFactory(GsonConverterFactory.create()).build()

    private fun doNetworkCall() {
        initRetrofit().create(RestApi::class.java).networkCall().enqueue(object : Callback<List<RetrofitSampleResponse>?> {
            override fun onFailure(call: Call<List<RetrofitSampleResponse>?>?, t: Throwable?) {
                Log.e(TAG, "onResponse: ", t)
            }

            override fun onResponse(call: Call<List<RetrofitSampleResponse>?>?, response: Response<List<RetrofitSampleResponse>?>?) {
                Log.d(TAG, "onResponse: " + response?.body().toString())

                /*set the response as text in text view*/
                textNetworkResp.text = formatString(response?.body().toString())
            }
        })
    }


    /*this function format the json string*/
    fun formatString(text: String): String {
        val json = StringBuilder()
        var indentString = ""

        (0 until text.length)
                .asSequence()
                .map { text[it] }
                .forEach {
                    when (it) {
                        '{', '[' -> {
                            json.append("\n" + indentString + it + "\n")
                            indentString += "\t"
                            json.append(indentString)
                        }
                        '}', ']' -> {
                            indentString = indentString.replaceFirst("\t".toRegex(), "")
                            json.append("\n" + indentString + it)
                        }
                        ',' -> json.append(it + "\n" + indentString)

                        else -> json.append(it)
                    }
                }

        return json.toString()
    }
}
