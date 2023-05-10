package com.example.royalhotel.screens

import android.app.DatePickerDialog
import android.content.Context
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.MediaController
import androidx.appcompat.app.AlertDialog
import com.example.royalhotel.databinding.ActivityDetailRoomBinding
import com.example.royalhotel.databinding.HeaderBinding
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import java.time.LocalDate
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.List

class DetailRoomActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailRoomBinding
    private lateinit var bindingHeader: HeaderBinding
    private lateinit var startDate: String
    private lateinit var endDate: String
    private var numberRoomDetail: Int = 0
    private var desRoomDetail: String = ""
    private var typeRoomDetail: String = ""
    private var floor: Int = 0
    private var price: Int = 0
    private var currentDate = LocalDate.now()
    private var videoRoomDetail: String = ""
//    private lateinit var imageRoomDetail: ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailRoomBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val desTV = binding.tvDesRoomDetail
        val numberRoomTv = binding.tvNumberRoomDetail
        val videoRoom = binding.videoRoomDetail
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoRoom)
//        val imageRoom = binding.gridView

        numberRoomDetail = intent.getIntExtra("numberRoom", 0)
        desRoomDetail = intent.getStringExtra("des").toString()
        typeRoomDetail = intent.getStringExtra("typeRoom").toString()
        floor = intent.getIntExtra("floor", 0)
        price = intent.getIntExtra("price", 0)
        videoRoomDetail = intent.getStringExtra("video").toString()
        Log.d("VideoURI", "$videoRoomDetail")
        val uri = Uri.parse(videoRoomDetail)
//        imageRoomDetail = intent.getStringArrayListExtra("imageRoom") as ArrayList<String>



        numberRoomTv.text = numberRoomDetail.toString()
        desTV.text = desRoomDetail
//        imageRoom =
//        bookRoom()

        operationHeader()
        playVideo()
    }

    private fun playVideo() {
        fun extractVideoIdFromYouTubeUrl(url: String): String? {
            videoRoomDetail
            val pattern = "(?<=v=)[\\w-]+".toRegex()
            val matchResult = pattern.find(url)
            return matchResult?.value
        }

        binding.videoRoomDetail.addYouTubePlayerListener(object: AbstractYouTubePlayerListener(){
            override fun onReady(youTubePlayer: YouTubePlayer) {
                val videoId = extractVideoIdFromYouTubeUrl(videoRoomDetail)
                youTubePlayer.loadVideo(videoId.toString(),0f)
            }

            override fun onError(youTubePlayer: YouTubePlayer, error: PlayerConstants.PlayerError) {
                super.onError(youTubePlayer, error)
            }


        })

    }

    private fun operationHeader() {
        bindingHeader = binding.headerLayout
        bindingHeader.tvHeaderNameHotel.visibility = View.GONE
        bindingHeader.btnDropdownSearch.visibility = View.GONE
        bindingHeader.backButton.visibility = View.VISIBLE
        bindingHeader.backButton.setOnClickListener {
            onBackPressed()
        }
    }

    private fun bookRoom() {
        fun showDatePickerDialog(context: Context, onDateSelected: (date: String) -> Unit) {
            val calendar = Calendar.getInstance()

            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)

            val datePickerDialog = DatePickerDialog(
                context,
                { _, selectedYear, selectedMonth, selectedDay ->
                    val selectedDate = "$selectedYear-${selectedMonth + 1}-$selectedDay"

                    onDateSelected(selectedDate)
                },
                year,
                month,
                day
            )
            datePickerDialog.show()
        }

        binding.btnBookRoomDetail.setOnClickListener {
            showDatePickerDialog(this) { date ->

                if (!::startDate.isInitialized || !::endDate.isInitialized) {
                    startDate = date
                    if (startDate >= currentDate.toString()) {
                        showDatePickerDialog(this) { endDate ->
                            this.endDate = endDate
                            if (this.endDate >= startDate) {
                                showSelectedDatesDialog()
                            }

                        }
                    }


                }
            }
        }
    }

    private fun showSelectedDatesDialog() {
        val message =
            "$currentDate\n Number Room: $numberRoomDetail\nType Room: $typeRoomDetail\nFloor: $floor\nPrice Of Night: $price\nStart Date: $startDate\nEnd Date: $endDate"
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setMessage(message)
            .setPositiveButton("OK") { dialog, _ -> dialog.dismiss() }
        val alertDialog = alertDialogBuilder.create()

        alertDialog.show()
    }
}