package com.example.criminalinten

import java.util.*

data class Crime(val id: UUID = UUID.randomUUID(),
                 var title: String = "",
                 var date: Date = Date(),
                 var requirePolice:Boolean=false,
                 var isSolved: Boolean = false)
