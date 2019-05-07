package com.example.shakyouofbasicsample.model

import java.util.Date

interface Comment {
    var id: Int
    var productId: Int
    var text: String
    var postedAt: Date
}