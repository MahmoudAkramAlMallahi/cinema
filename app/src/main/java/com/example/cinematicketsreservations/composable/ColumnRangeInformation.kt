package com.example.cinematicketsreservations.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp


@Composable
fun ColumnRangeInformation(
    data: String = "",
    range: String = "",
    text: String = ""
) {

    Column(horizontalAlignment = Alignment.CenterHorizontally){
        Row{
            Text(
                text = data,
                fontSize = 14.sp,
                color = Color.Black
            )
            Text(
                text = range,
                fontSize = 14.sp,
                color = Color(0x99000000)

            )

        }
        Text(text = text, color = Color(0x99000000))
    }

}