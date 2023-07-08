package com.example.cinematicketsreservations.composable

import android.icu.text.CaseMap.Title
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.cinematicketsreservations.R

@Composable
fun MovieTime(
    title: String,
    color: Color,
    modifier: Modifier= Modifier
){
    Row(verticalAlignment = Alignment.CenterVertically, modifier = modifier) {
        Icon(
            modifier = Modifier.size(16.dp),
            painter = painterResource(id = R.drawable.ic_clock),
            contentDescription = "",
            tint = Color(0x99868585)
        )
        Text(text = "2h 23m",color = color, modifier = Modifier.padding(horizontal = 2.dp, vertical = 4.dp))
    }
}