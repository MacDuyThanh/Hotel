package com.example.royalhotel.screens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.example.demomanagehotel.data.Room
import com.example.demomanagehotel.data.getAllRoom
import com.example.royalhotel.AdapterImageButton
import com.example.royalhotel.AdapterManageRoom
import com.example.royalhotel.AdapterRoom
import com.example.royalhotel.R
import com.example.royalhotel.databinding.ActivityManageRoomBinding
import com.example.royalhotel.databinding.FragmentAddNewBinding
import com.example.royalhotel.databinding.ListItemManageRoomBinding
import com.example.royalhotel.screens.AddNewScreen.AddNewFragment

class ManageRoomActivity : AppCompatActivity(), AdapterManageRoom.OnItemClickListener{
    private lateinit var binding: ActivityManageRoomBinding
    private val dataRoom: ArrayList<Room> = getAllRoom()
    private lateinit var bindingItemManageRoom: ListItemManageRoomBinding
    private lateinit var bindingAddNew: FragmentAddNewBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityManageRoomBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addNewRoom.setOnClickListener {
            val dialogFragment = AddNewFragment()
            dialogFragment.show(supportFragmentManager,"AddNew")
        }

        binding.imageBack.setOnClickListener {
            onBackPressed()
        }

        initRcv()
//        updateRoom()
    }

    private fun updateRoom() {
//        binding.listRoom.setOnClickListener {
//            val dialogFragment = AddNewFragment()
////            bindingAddNew.tvAddNewRoom.visibility = View.GONE
////            bindingAddNew.tvUpdateRoom.visibility = View.VISIBLE
//            dialogFragment.show(supportFragmentManager,"Update")
//        }
//if(bindingItemManageRoom)
        bindingItemManageRoom.imgVUpdateRoom.setOnClickListener {
            val dialogFragment = AddNewFragment()
            bindingAddNew.tvAddNewRoom.visibility = View.GONE
            bindingAddNew.tvUpdateRoom.visibility = View.VISIBLE
            dialogFragment.show(supportFragmentManager,"AddNew")
            Log.d("Click", "updateRoom:clicked ")

        }
    }

    private fun initRcv() {
        var dataRcv: ArrayList<Room> = arrayListOf()


        for (item in dataRoom) {
            if (!dataRcv.any { it.idRoom == item.idRoom }) {
                dataRcv.add(item)
            }
        }



//        binding.listRoom.layoutManager = GridLayoutManager(this, 2)


//        binding.listRoom.adapter = AdapterManageRoom(dataRcv,onItemClick(position ))
    }

    override fun onItemClick(position: Int) {
        TODO("Not yet implemented")
    }

}