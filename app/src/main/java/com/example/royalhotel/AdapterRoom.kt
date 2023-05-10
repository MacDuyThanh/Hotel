package com.example.royalhotel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.demomanagehotel.data.Room

class AdapterRoom(private var room: ArrayList<Room>, private val onItemClick: (Room) -> Unit) : RecyclerView.Adapter<AdapterRoom.ViewHolder>() {


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

        //        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        private val numberRoom: TextView = view.findViewById(R.id.tv_NumberRoom)
        private val price: TextView = view.findViewById(R.id.price)
        private val imageThumbnail: ImageView = view.findViewById(R.id.previewImage)
//        val videoRoom: ImageView = view.findViewById(R.id.videoRoomDetail)
//        val numberRoomDetail: TextView = view.findViewById(R.id.tv_NumberRoomDetail)
//        val desRoomDetail: TextView = view.findViewById(R.id.tv_DesRoomDetail)

//        val itemR: TextView = view.findViewById(R.id.tv_itemR)

        fun bind(room: Room, onItemClick: (Room) -> Unit) {
            numberRoom.text = room.numberRoom.toString()
            price.text = room.price.toString()
            Glide.with(imageThumbnail).load(room.imageThumbnail).into(imageThumbnail)
//recyclerView.setOnClickListener { onItemClick(room) }
//            numberRoomDetail.text = room.numberRoom.toString()
//            desRoomDetail.text = room.description

//            itemR.text = room..toString()
            itemView.setOnClickListener { onItemClick(room) }
        }




    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val layoutItem = layoutInflater.inflate(R.layout.item_list_room, parent, false)
        return ViewHolder(layoutItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(room[position], onItemClick)
    }

    override fun getItemCount() = room.size

}