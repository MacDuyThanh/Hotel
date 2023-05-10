package com.example.royalhotel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.demomanagehotel.data.Room
import com.example.royalhotel.databinding.FragmentAddNewBinding
import com.example.royalhotel.databinding.ListItemManageRoomBinding
import com.example.royalhotel.screens.AddNewScreen.AddNewFragment
import kotlinx.coroutines.NonDisposableHandle.parent

class AdapterManageRoom(
    private var room: ArrayList<Room>, private val listener: OnItemClickListener
) : RecyclerView.Adapter<AdapterManageRoom.ViewHolder>() {
    private lateinit var binding: ListItemManageRoomBinding

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    class ViewHolder(view: View, listener: OnItemClickListener) : RecyclerView.ViewHolder(view) {

        val imageButton: ImageButton = itemView.findViewById(R.id.imgV_update_room)

        init {
            imageButton.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }

        private lateinit var bindingAddNew: FragmentAddNewBinding

        private val numberRoom: TextView = view.findViewById(R.id.tv_manage_NumberRoom)
        private val imageThumbnail: ImageView = view.findViewById(R.id.previewImage_manageRoom)


        fun bind(room: Room) {
            numberRoom.text = room.numberRoom.toString()
            Glide.with(imageThumbnail).load(room.imageThumbnail).into(imageThumbnail)


        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val layoutItem = layoutInflater.inflate(R.layout.list_item_manage_room, parent, false)
        return ViewHolder(layoutItem,listener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        binding.imgVUpdateRoom.setOnClickListener {
//            callback.onImageButtonClick()
//        }


        holder.bind(room[position])

    }

    override fun getItemCount() = room.size

}