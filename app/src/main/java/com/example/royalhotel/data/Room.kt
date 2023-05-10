package com.example.demomanagehotel.data

data class Room(
    val idRoom: Int,
    val numberRoom: Int,
    val typeRoom: String,
    val price: Int,
    val floor: Int,
    val status: Boolean,
    val description: String,
    val startDate: String?="",
    val endDate: String? = "",
    val imageThumbnail: String? = "",
    val video: String,
    val imageRoom: MutableList<String>
)

val listRoom = ArrayList<Room>()
fun getAllRoom(): ArrayList<Room> {
    listRoom.add(
        Room(
            1,
            101,
            "Single Room",
            150000,
            1,
            true,
            "Sized at 12 sqm, Standard Room is precisely well-equipped with comprehensive amenities including high-definition TV, mini fridge, hairdryer, kettle, in-room safe and shower, offering a cozy yet convenient environment for travellers. \n" +
                    "\n" +
                    "\n" +
                    "Located on high floors, Standard Room features a variety of splendid views. Twin-bed and Double-bed settings are available to accommodate different guest preferences.\n" +
                    "\n",
            "",
            "",
            "https://hotelvilnia.lt/wp-content/uploads/2018/06/DSC07003-HDR-Edit-Edit-1.jpg",
            "https://www.youtube.com/watch?v=4kGwj9NbuFU",
            mutableListOf(
                "https://www.hotelmonterey.co.jp/upload_file/monhtyo/stay/sng_600_001.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2018/06/DSC07003-HDR-Edit-Edit-1.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2017/05/DSC07615-HDR-Edit.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg"
            )
        )
    )
    listRoom.add(
        Room(
            2,
            102,
            "Double Room",
            250000,
            1,
            false,
            "Sized at 32 sqm, Prime Deluxe Room features spacious accommodation. You may get pampered and rejuvenated with the spectacular river view while lying by wall-to-wall glass window bay to soak up the sun or immerse in relaxing ambience along Shing Mun River.\n" +
                    "\n" +
                    "Decorated in sophisticated colour scheme, each room features premium furnishings and a host of amenities including expansive working station with international voltage sockets, adjustable desk lamp and in-room Wi-Fi service to meet all your needs and ensure your stay at Regal Riverside Hotel is connected, convenient and productive.\n" +
                    "\n" +
                    "Sophisticated business or leisure guests may enjoy unparalleled accommodation at Prime Deluxe Room with a choice of double-bed or twin-bed setting. ",
            "",
            "",
            "https://hotelvilnia.lt/wp-content/uploads/2017/05/DSC07615-HDR-Edit.jpg",
            "https://www.youtube.com/watch?v=Vn1HO-8tLHE",
            mutableListOf(
                "https://www.hotelmonterey.co.jp/upload_file/monhtyo/stay/sng_600_001.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2018/06/DSC07003-HDR-Edit-Edit-1.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2017/05/DSC07615-HDR-Edit.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg"
            )
        )
    )
    listRoom.add(
        Room(
            3,
            103,
            "Twin Room",
            330000,
            1,
            true,
            "Sized at 28 sqm, Superior Room is elegantly designed with a spacious sitting area and a fully-equipped bathroom that promises to make your stay a high level of comfort. Meticulously designed by applying the hues of brown and beige, the room provides business and leisure travellers a sense of warm and welcoming note.\n" +
                    "\n" +
                    "Overlooking the stunning pool or garden view, the room allows guests to enjoy a moment of leisure with natural sunlight by the wall-to-wall glass window.\n" +
                    "\n" +
                    "Available in double-bed or twin-bed setting, the room is equipped with a plethora of amenities and attentive services including in-room Wi-Fi service to ensure guests are connected with families, friends and business partners at all times.",
            "",
            "",
            "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg",
            "https://www.youtube.com/watch?v=icl8zsWH3_E",
            mutableListOf(
                "https://www.hotelmonterey.co.jp/upload_file/monhtyo/stay/sng_600_001.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2018/06/DSC07003-HDR-Edit-Edit-1.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2017/05/DSC07615-HDR-Edit.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg"
            )
        )
    )
    listRoom.add(
        Room(
            4,
            104,
            "Quad Room",
            500000,
            1,
            true,
            "Designed with maximum flexibility and comfort, Quadruple Room offers spacious and pleasant accommodation for a group of up to four persons, with value-for-money guaranteed. Sized at 32 sqm, the room is equipped with four single beds and comprehensive amenities for four persons, allowing guests to unwind in the complete comfort and convenience.\n" +
                    "\n" +
                    "Overlooking the magnificent mountain view, the room features a wide window and a window bay allowing guests to sit back to enjoy relaxing moments anytime. Quadruple Room offers unparalleled accommodation with a host of privileges including in-room Wi-Fi service, deep-soaking tub and other modern facilities to provide you the convenience of a home away from home.",
            "",
            "",
            "https://www.regalhotel.com/uploads/rrh/accommodations/720x475/Family-Quadruple-Room-1.jpg",
            "https://www.youtube.com/watch?v=ACJAv9Ug_7M",
            mutableListOf(
                "https://www.hotelmonterey.co.jp/upload_file/monhtyo/stay/sng_600_001.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2018/06/DSC07003-HDR-Edit-Edit-1.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2017/05/DSC07615-HDR-Edit.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg"
            )
        )
    )
    listRoom.add(
        Room(
            5,
            105,
            "Suit Room",
            800000,
            1,
            false,
            "Good",
            "",
            "",
            "https://hotelvilnia.lt/wp-content/uploads/2018/06/DSC08600-HDR-Edit.jpg",
            "https://www.youtube.com/watch?v=VOJUG8I5uUc",
            mutableListOf(
                "https://www.hotelmonterey.co.jp/upload_file/monhtyo/stay/sng_600_001.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2018/06/DSC07003-HDR-Edit-Edit-1.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2017/05/DSC07615-HDR-Edit.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg"
            )
        )
    )
    listRoom.add(
        Room(
            6,
            201,
            "Double Room",
            250000,
            2,
            true,
            "Sized at 32 sqm, Prime Deluxe Room features spacious accommodation. You may get pampered and rejuvenated with the spectacular river view while lying by wall-to-wall glass window bay to soak up the sun or immerse in relaxing ambience along Shing Mun River.\n" +
                    "\n" +
                    "Decorated in sophisticated colour scheme, each room features premium furnishings and a host of amenities including expansive working station with international voltage sockets, adjustable desk lamp and in-room Wi-Fi service to meet all your needs and ensure your stay at Regal Riverside Hotel is connected, convenient and productive.\n" +
                    "\n" +
                    "Sophisticated business or leisure guests may enjoy unparalleled accommodation at Prime Deluxe Room with a choice of double-bed or twin-bed setting. ",
            "",
            "",
            "https://hotelvilnia.lt/wp-content/uploads/2017/05/DSC07615-HDR-Edit.jpg",
            "https://www.youtube.com/watch?v=Vn1HO-8tLHE",
            mutableListOf(
                "https://www.hotelmonterey.co.jp/upload_file/monhtyo/stay/sng_600_001.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2018/06/DSC07003-HDR-Edit-Edit-1.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2017/05/DSC07615-HDR-Edit.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg"
            )
        )
    )
    listRoom.add(
        Room(
            7,
            202,
            "Twin Room",
            330000,
            2,
            true,
            "Sized at 28 sqm, Superior Room is elegantly designed with a spacious sitting area and a fully-equipped bathroom that promises to make your stay a high level of comfort. Meticulously designed by applying the hues of brown and beige, the room provides business and leisure travellers a sense of warm and welcoming note.\n" +
                    "\n" +
                    "Overlooking the stunning pool or garden view, the room allows guests to enjoy a moment of leisure with natural sunlight by the wall-to-wall glass window.\n" +
                    "\n" +
                    "Available in double-bed or twin-bed setting, the room is equipped with a plethora of amenities and attentive services including in-room Wi-Fi service to ensure guests are connected with families, friends and business partners at all times.",
            "",
            "",
            "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg",
            "https://www.youtube.com/watch?v=icl8zsWH3_E",
            mutableListOf(
                "https://www.hotelmonterey.co.jp/upload_file/monhtyo/stay/sng_600_001.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2018/06/DSC07003-HDR-Edit-Edit-1.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2017/05/DSC07615-HDR-Edit.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg"
            )
        )
    )
    listRoom.add(
        Room(
            8,
            203,
            "Quad Room",
            500000,
            2,
            true,
            "Designed with maximum flexibility and comfort, Quadruple Room offers spacious and pleasant accommodation for a group of up to four persons, with value-for-money guaranteed. Sized at 32 sqm, the room is equipped with four single beds and comprehensive amenities for four persons, allowing guests to unwind in the complete comfort and convenience.\n" +
                    "\n" +
                    "Overlooking the magnificent mountain view, the room features a wide window and a window bay allowing guests to sit back to enjoy relaxing moments anytime. Quadruple Room offers unparalleled accommodation with a host of privileges including in-room Wi-Fi service, deep-soaking tub and other modern facilities to provide you the convenience of a home away from home.",
            "",
            "",
            "https://www.regalhotel.com/uploads/rrh/accommodations/720x475/Family-Quadruple-Room-1.jpg",
            "https://www.youtube.com/watch?v=ACJAv9Ug_7M",
            mutableListOf(
                "https://www.hotelmonterey.co.jp/upload_file/monhtyo/stay/sng_600_001.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2018/06/DSC07003-HDR-Edit-Edit-1.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2017/05/DSC07615-HDR-Edit.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg"
            )
        )
    )
    listRoom.add(
        Room(
            9,
            301,
            "Suit Room",
            800000,
            3,
            false,
            "Good",
            "",
            "",
            "https://hotelvilnia.lt/wp-content/uploads/2018/06/DSC08600-HDR-Edit.jpg",
            "https://www.youtube.com/watch?v=VOJUG8I5uUc",
            mutableListOf(
                "https://www.hotelmonterey.co.jp/upload_file/monhtyo/stay/sng_600_001.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2018/06/DSC07003-HDR-Edit-Edit-1.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2017/05/DSC07615-HDR-Edit.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg"
            )
        )
    )
    listRoom.add(
        Room(
            10,
            302,
            "Single Room",
            150000,
            3,
            true,
            "Sized at 12 sqm, Standard Room is precisely well-equipped with comprehensive amenities including high-definition TV, mini fridge, hairdryer, kettle, in-room safe and shower, offering a cozy yet convenient environment for travellers. \n" +
                    "\n" +
                    "\n" +
                    "Located on high floors, Standard Room features a variety of splendid views. Twin-bed and Double-bed settings are available to accommodate different guest preferences.\n" +
                    "\n",
            "",
            "",
            "https://hotelvilnia.lt/wp-content/uploads/2018/06/DSC07003-HDR-Edit-Edit-1.jpg",
            "https://www.youtube.com/watch?v=4kGwj9NbuFU",
            mutableListOf(
                "https://www.hotelmonterey.co.jp/upload_file/monhtyo/stay/sng_600_001.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2018/06/DSC07003-HDR-Edit-Edit-1.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2017/05/DSC07615-HDR-Edit.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg"
            )
        )
    )
    listRoom.add(
        Room(
            11,
            303,
            "Double Room",
            250000,
            3,
            true,
            "Sized at 32 sqm, Prime Deluxe Room features spacious accommodation. You may get pampered and rejuvenated with the spectacular river view while lying by wall-to-wall glass window bay to soak up the sun or immerse in relaxing ambience along Shing Mun River.\n" +
                    "\n" +
                    "Decorated in sophisticated colour scheme, each room features premium furnishings and a host of amenities including expansive working station with international voltage sockets, adjustable desk lamp and in-room Wi-Fi service to meet all your needs and ensure your stay at Regal Riverside Hotel is connected, convenient and productive.\n" +
                    "\n" +
                    "Sophisticated business or leisure guests may enjoy unparalleled accommodation at Prime Deluxe Room with a choice of double-bed or twin-bed setting. ",
            "",
            "",
            "https://hotelvilnia.lt/wp-content/uploads/2017/05/DSC07615-HDR-Edit.jpg",
            "https://www.youtube.com/watch?v=Vn1HO-8tLHE",
            mutableListOf(
                "https://www.hotelmonterey.co.jp/upload_file/monhtyo/stay/sng_600_001.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2018/06/DSC07003-HDR-Edit-Edit-1.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2017/05/DSC07615-HDR-Edit.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg"
            )
        )
    )
    listRoom.add(
        Room(
            12,
            304,
            "Twin Room",
            330000,
            3,
            false,
            "Sized at 28 sqm, Superior Room is elegantly designed with a spacious sitting area and a fully-equipped bathroom that promises to make your stay a high level of comfort. Meticulously designed by applying the hues of brown and beige, the room provides business and leisure travellers a sense of warm and welcoming note.\n" +
                    "\n" +
                    "Overlooking the stunning pool or garden view, the room allows guests to enjoy a moment of leisure with natural sunlight by the wall-to-wall glass window.\n" +
                    "\n" +
                    "Available in double-bed or twin-bed setting, the room is equipped with a plethora of amenities and attentive services including in-room Wi-Fi service to ensure guests are connected with families, friends and business partners at all times.",
            "",
            "",
            "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg",
            "https://www.youtube.com/watch?v=icl8zsWH3_E",
            mutableListOf(
                "https://www.hotelmonterey.co.jp/upload_file/monhtyo/stay/sng_600_001.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2018/06/DSC07003-HDR-Edit-Edit-1.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2017/05/DSC07615-HDR-Edit.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg"
            )
        )
    )
    listRoom.add(
        Room(
            13,
            305,
            "Quad Room",
            500000,
            3,
            true,
            "Designed with maximum flexibility and comfort, Quadruple Room offers spacious and pleasant accommodation for a group of up to four persons, with value-for-money guaranteed. Sized at 32 sqm, the room is equipped with four single beds and comprehensive amenities for four persons, allowing guests to unwind in the complete comfort and convenience.\n" +
                    "\n" +
                    "Overlooking the magnificent mountain view, the room features a wide window and a window bay allowing guests to sit back to enjoy relaxing moments anytime. Quadruple Room offers unparalleled accommodation with a host of privileges including in-room Wi-Fi service, deep-soaking tub and other modern facilities to provide you the convenience of a home away from home.",
            "",
            "",
            "https://www.regalhotel.com/uploads/rrh/accommodations/720x475/Family-Quadruple-Room-1.jpg",
            "https://www.youtube.com/watch?v=ACJAv9Ug_7M",
            mutableListOf(
                "https://www.hotelmonterey.co.jp/upload_file/monhtyo/stay/sng_600_001.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2018/06/DSC07003-HDR-Edit-Edit-1.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2017/05/DSC07615-HDR-Edit.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg"
            )
        )
    )
    listRoom.add(
        Room(
            14,
            401,
            "Suit Room",
            800000,
            4,
            false,
            "Good",
            "",
            "",
            "https://hotelvilnia.lt/wp-content/uploads/2018/06/DSC08600-HDR-Edit.jpg",
            "https://www.youtube.com/watch?v=VOJUG8I5uUc",
            mutableListOf(
                "https://www.hotelmonterey.co.jp/upload_file/monhtyo/stay/sng_600_001.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2018/06/DSC07003-HDR-Edit-Edit-1.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2017/05/DSC07615-HDR-Edit.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg"
            )
        )
    )
    listRoom.add(
        Room(
            15,
            402,
            "Double Room",
            250000,
            4,
            false,
            "Sized at 32 sqm, Prime Deluxe Room features spacious accommodation. You may get pampered and rejuvenated with the spectacular river view while lying by wall-to-wall glass window bay to soak up the sun or immerse in relaxing ambience along Shing Mun River.\n" +
                    "\n" +
                    "Decorated in sophisticated colour scheme, each room features premium furnishings and a host of amenities including expansive working station with international voltage sockets, adjustable desk lamp and in-room Wi-Fi service to meet all your needs and ensure your stay at Regal Riverside Hotel is connected, convenient and productive.\n" +
                    "\n" +
                    "Sophisticated business or leisure guests may enjoy unparalleled accommodation at Prime Deluxe Room with a choice of double-bed or twin-bed setting. ",
            "",
            "",
            "https://hotelvilnia.lt/wp-content/uploads/2017/05/DSC07615-HDR-Edit.jpg",
            "https://www.youtube.com/watch?v=Vn1HO-8tLHE",
            mutableListOf(
                "https://www.hotelmonterey.co.jp/upload_file/monhtyo/stay/sng_600_001.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2018/06/DSC07003-HDR-Edit-Edit-1.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2017/05/DSC07615-HDR-Edit.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg"
            )
        )
    )
    listRoom.add(
        Room(
            16,
            403,
            "Twin Room",
            330000,
            4,
            false,
            "Sized at 28 sqm, Superior Room is elegantly designed with a spacious sitting area and a fully-equipped bathroom that promises to make your stay a high level of comfort. Meticulously designed by applying the hues of brown and beige, the room provides business and leisure travellers a sense of warm and welcoming note.\n" +
                    "\n" +
                    "Overlooking the stunning pool or garden view, the room allows guests to enjoy a moment of leisure with natural sunlight by the wall-to-wall glass window.\n" +
                    "\n" +
                    "Available in double-bed or twin-bed setting, the room is equipped with a plethora of amenities and attentive services including in-room Wi-Fi service to ensure guests are connected with families, friends and business partners at all times.",
            "",
            "",
            "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg",
            "https://www.youtube.com/watch?v=icl8zsWH3_E",
            mutableListOf(
                "https://www.hotelmonterey.co.jp/upload_file/monhtyo/stay/sng_600_001.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2018/06/DSC07003-HDR-Edit-Edit-1.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2017/05/DSC07615-HDR-Edit.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg"
            )
        )
    )
    listRoom.add(
        Room(
            17,
            404,
            "Quad Room",
            500000,
            4,
            false,
            "Designed with maximum flexibility and comfort, Quadruple Room offers spacious and pleasant accommodation for a group of up to four persons, with value-for-money guaranteed. Sized at 32 sqm, the room is equipped with four single beds and comprehensive amenities for four persons, allowing guests to unwind in the complete comfort and convenience.\n" +
                    "\n" +
                    "Overlooking the magnificent mountain view, the room features a wide window and a window bay allowing guests to sit back to enjoy relaxing moments anytime. Quadruple Room offers unparalleled accommodation with a host of privileges including in-room Wi-Fi service, deep-soaking tub and other modern facilities to provide you the convenience of a home away from home.",
            "",
            "",
            "https://www.regalhotel.com/uploads/rrh/accommodations/720x475/Family-Quadruple-Room-1.jpg",
            "https://www.youtube.com/watch?v=ACJAv9Ug_7M",
            mutableListOf(
                "https://www.hotelmonterey.co.jp/upload_file/monhtyo/stay/sng_600_001.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2018/06/DSC07003-HDR-Edit-Edit-1.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2017/05/DSC07615-HDR-Edit.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg"
            )
        )
    )
    listRoom.add(
        Room(
            18,
            405,
            "Suit Room",
            800000,
            4,
            false,
            "Good",
            "",
            "",
            "https://hotelvilnia.lt/wp-content/uploads/2018/06/DSC08600-HDR-Edit.jpg",
            "https://www.youtube.com/watch?v=VOJUG8I5uUc",
            mutableListOf(
                "https://www.hotelmonterey.co.jp/upload_file/monhtyo/stay/sng_600_001.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2018/06/DSC07003-HDR-Edit-Edit-1.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2017/05/DSC07615-HDR-Edit.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg"
            )
        )
    )
    listRoom.add(
        Room(
            19,
            204,
            "Single Room",
            150000,
            2,
            false,
            "Sized at 12 sqm, Standard Room is precisely well-equipped with comprehensive amenities including high-definition TV, mini fridge, hairdryer, kettle, in-room safe and shower, offering a cozy yet convenient environment for travellers. \n" +
                    "\n" +
                    "\n" +
                    "Located on high floors, Standard Room features a variety of splendid views. Twin-bed and Double-bed settings are available to accommodate different guest preferences.\n" +
                    "\n",
            "",
            "",
            "https://hotelvilnia.lt/wp-content/uploads/2018/06/DSC07003-HDR-Edit-Edit-1.jpg",
            "https://www.youtube.com/watch?v=4kGwj9NbuFU",
            mutableListOf(
                "https://www.hotelmonterey.co.jp/upload_file/monhtyo/stay/sng_600_001.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2018/06/DSC07003-HDR-Edit-Edit-1.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2017/05/DSC07615-HDR-Edit.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg"
            )
        )
    )
    listRoom.add(
        Room(
            20,
            205,
            "Single Room",
            150000,
            2,
            true,
            "Sized at 12 sqm, Standard Room is precisely well-equipped with comprehensive amenities including high-definition TV, mini fridge, hairdryer, kettle, in-room safe and shower, offering a cozy yet convenient environment for travellers. \n" +
                    "\n" +
                    "\n" +
                    "Located on high floors, Standard Room features a variety of splendid views. Twin-bed and Double-bed settings are available to accommodate different guest preferences.\n" +
                    "\n",
            "",
            "",
            "https://hotelvilnia.lt/wp-content/uploads/2018/06/DSC07003-HDR-Edit-Edit-1.jpg",
            "https://www.youtube.com/watch?v=4kGwj9NbuFU",
            mutableListOf(
                "https://www.hotelmonterey.co.jp/upload_file/monhtyo/stay/sng_600_001.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2018/06/DSC07003-HDR-Edit-Edit-1.jpg",
                "https://hotelvilnia.lt/wp-content/uploads/2017/05/DSC07615-HDR-Edit.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg",
                "https://castlehotel.net/wp-content/uploads/2017/06/057_CastleH-1200x504.jpg"
            )
        )
    )

    return listRoom
}

fun getTypeRoom(): List<String> {
    val listTypeRoom: ArrayList<String> = arrayListOf()
    for (item in listRoom) {
        listTypeRoom.add(item.typeRoom)
    }

    return listTypeRoom.distinct()
}

fun getFloor(): List<Int> {
    val listFloor: ArrayList<Int> = arrayListOf()
    for (item in listRoom) {
        listFloor.add(item.floor)
    }
    return listFloor.distinct()
}