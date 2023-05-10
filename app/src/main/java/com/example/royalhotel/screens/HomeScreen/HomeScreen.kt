package com.example.royalhotel.screens.HomeScreen

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.SeekBar
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.example.demomanagehotel.data.Room
import com.example.demomanagehotel.data.getAllRoom
import com.example.demomanagehotel.data.getFloor
import com.example.demomanagehotel.data.getTypeRoom
import com.example.royalhotel.AdapterRoom
import com.example.royalhotel.screens.DetailRoomActivity
import com.example.royalhotel.R
import com.example.royalhotel.databinding.FragmentHomeScreenBinding
import com.example.royalhotel.databinding.HeaderBinding


class HomeScreen : Fragment(R.layout.fragment_home_screen) {
    private lateinit var binding: FragmentHomeScreenBinding
    private val dataRoom: ArrayList<Room> = getAllRoom()
    private var itemTypeRoomSelected: Any = ""
    private var itemFloorSelected: Any = 0
    private var itemPriceSelectedMin: Int = 0
    private var itemPriceSelectedMax: Int = 0
    private lateinit var bindingHeader: HeaderBinding

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        arguments?.let {
//
//        }
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeScreenBinding.inflate(inflater, container, false)
        val root: View = binding.root
        initRcv()
        initListDropDownType()
        initListFloor()
        initFilterPrice()
        searchRoom()
        initLayoutSearch()


        return root
    }

    private fun initLayoutSearch() {
        bindingHeader = binding.layoutHeader
        bindingHeader.btnDropdownSearch.setOnClickListener {

            binding.linearLayoutSearch.visibility = View.VISIBLE
            bindingHeader.btnDropdownSearch.visibility = View.GONE
            bindingHeader.btnUpSearch.visibility = View.VISIBLE
        }
        bindingHeader.btnUpSearch.setOnClickListener {
            binding.linearLayoutSearch.visibility = View.GONE
            bindingHeader.btnDropdownSearch.visibility = View.VISIBLE
            bindingHeader.btnUpSearch.visibility = View.GONE
        }
    }


    private fun searchRoom() {
        binding.btnSearch.setOnClickListener {
            var dataEmpty: ArrayList<Room> = arrayListOf()

            for (it in dataRoom) {
                // conditions to search
                val condition =
                    it.typeRoom == itemTypeRoomSelected && itemPriceSelectedMin <= it.price && it.price <= itemPriceSelectedMax && it.floor == itemFloorSelected
                            || itemTypeRoomSelected == it.typeRoom && itemFloorSelected == 0 && itemPriceSelectedMax == 0 && itemPriceSelectedMin == 0
                            || it.floor == itemFloorSelected && itemTypeRoomSelected == "" && itemPriceSelectedMax == 0 && itemPriceSelectedMin == 0
                            || itemPriceSelectedMin <= it.price && it.price <= itemPriceSelectedMax && itemFloorSelected == 0 && itemTypeRoomSelected == ""
                            || it.typeRoom == itemTypeRoomSelected && itemPriceSelectedMin <= it.price && it.price <= itemPriceSelectedMax && itemFloorSelected == 0
                            || it.typeRoom == itemTypeRoomSelected && itemPriceSelectedMax == 0 && itemPriceSelectedMin == 0 && it.floor == itemFloorSelected
                            || it.typeRoom == "" && itemPriceSelectedMin <= it.price && it.price <= itemPriceSelectedMax && it.floor == itemFloorSelected

                if (condition) {
                    if (dataEmpty.isNotEmpty()) {
                        for (item in dataEmpty) {
                            if (item.idRoom != it.idRoom) {
                                dataEmpty.add(it)
                            }
                            break
                        }
                    } else {
                        dataEmpty.add(it)
                    }
                }
            }
            binding.recyclerView.adapter = AdapterRoom(dataEmpty) {
                val intent = Intent(requireContext(), DetailRoomActivity::class.java)
                intent.putExtra("item_id", it.idRoom)
                intent.putExtra("numberRoom", it.numberRoom)
                intent.putExtra("typeRoom", it.typeRoom)
                intent.putExtra("floor", it.floor)
                intent.putExtra("price", it.price)
                intent.putExtra("des", it.description)
                intent.putExtra("video", it.video)
                startActivity(intent)
            }


        }
    }

    private fun initFilterPrice() {
        val seekBarMin = binding.skFilterPriceMin
        val seekBarMax = binding.skFilterPriceMax
//        seekBar.max = 1000000

        seekBarMin.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                // Handle the progress change event here
                itemPriceSelectedMin = progress/10000*10000
                seekBar.progress = itemPriceSelectedMin
                binding.tvPriceMin.text = itemPriceSelectedMin.toString()

            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Handle the start tracking touch event here
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Handle the stop tracking touch event here
            }


        })

        seekBarMax.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                // Handle the progress change event here
                itemPriceSelectedMax = progress/10000*10000
                seekBar.progress = itemPriceSelectedMax
//                itemPriceSelectedMax += if (progress> seekBarMax!!.progress) 10000 else
                binding.tvPriceMax.text = itemPriceSelectedMax.toString()

            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Handle the start tracking touch event here
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Handle the stop tracking touch event here
            }
        })
    }

    private fun initListFloor() {
        val dataFloor: List<Int> = getFloor()

        val autoCompleteTextView = binding.acFilterFloor
        val adapter = ArrayAdapter(requireContext(), R.layout.list_item_filter, dataFloor)
        autoCompleteTextView.setAdapter(adapter)

        autoCompleteTextView.onItemClickListener =
            AdapterView.OnItemClickListener { adapterView, view, i, l ->
                itemFloorSelected = adapterView.getItemAtPosition(i)
            }
    }

    private fun initListDropDownType() {
        val dataTypeRoom: List<String> = getTypeRoom()

        val autoCompleteTextView = binding.acFilterType
        val adapter = ArrayAdapter(requireContext(), R.layout.list_item_filter, dataTypeRoom)
        autoCompleteTextView.setAdapter(adapter)

        autoCompleteTextView.onItemClickListener =
            AdapterView.OnItemClickListener { adapterView, view, i, l ->
                itemTypeRoomSelected = adapterView.getItemAtPosition(i)

            }
    }

    private fun initRcv() {
        var dataRcv: ArrayList<Room> = arrayListOf()


        for (item in dataRoom) {
            if (!dataRcv.any { it.idRoom == item.idRoom }) {
                dataRcv.add(item)
            }
        }



        binding.recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)


        binding.recyclerView.adapter = AdapterRoom(dataRcv) {
            val intent = Intent(requireContext(), DetailRoomActivity::class.java)
            intent.putExtra("item_id", it.idRoom)
            intent.putExtra("numberRoom", it.numberRoom)
            intent.putExtra("typeRoom", it.typeRoom)
            intent.putExtra("floor", it.floor)
            intent.putExtra("price", it.price)
            intent.putExtra("des", it.description)
            intent.putExtra("video", it.video)
//            intent.putExtra("imageRoom",it.imageRoom )
            startActivity(intent)
        }
    }
}