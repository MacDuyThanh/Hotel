package com.example.royalhotel.screens.AddNewScreen

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.demomanagehotel.data.Room
import com.example.demomanagehotel.data.getAllRoom
import com.example.royalhotel.R
import com.example.royalhotel.databinding.FragmentAddNewBinding
import com.example.royalhotel.screens.HomeScreen.HomeScreen
import com.example.royalhotel.screens.LoginActivity
import com.example.royalhotel.screens.ManageRoomActivity


class AddNewFragment : DialogFragment() {
private lateinit var binding: FragmentAddNewBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddNewBinding.inflate(inflater,container,false)
        val root: View = binding.root

        addNewRoom()

        return root
    }

    private fun addNewRoom() {
        val roomList: ArrayList<Room> = getAllRoom()
        binding.addRoomButton.setOnClickListener {
            val roomId = roomList.size + 1
            val roomNumber = binding.roomNumberEditText.text.toString().toInt()
            val roomType = binding.roomTypeEditText.text.toString()
            val roomPrice = binding.roomPriceEditText.text.toString().toInt()
            val roomFloor = binding.roomFloorEditText.text.toString().toInt()
            val roomDescription = binding.roomDescriptionEditText.text.toString()
            val roomThumbnail = binding.roomThumbnailEditText.text.toString()
            val roomImage = binding.roomImageEditText.text.map { it.toString() }.toMutableList()
            val roomVideo = binding.roomVideoEditText.text.toString()
            val roomStatus = binding.statusCheckBox.isChecked
            val startDate = ""
            val endDate = ""

            val newRoom = Room(roomId,roomNumber,roomType,roomPrice,roomFloor,roomStatus,roomDescription,startDate,endDate,roomThumbnail,roomVideo,roomImage)

            if (roomList.any { it.numberRoom == newRoom.numberRoom }){
                Toast.makeText(context,"Number Room Exist", Toast.LENGTH_SHORT).show()
            }else{
                roomList.add(newRoom)
                Toast.makeText(context,"Add Room Success", Toast.LENGTH_SHORT).show()
                val intent = Intent(requireContext(), ManageRoomActivity::class.java)
                startActivity(intent)
            }





        }
    }

}