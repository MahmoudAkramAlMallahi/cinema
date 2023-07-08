package com.example.cinematicketsreservations.composable

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyChip(
    title: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = title,
        modifier.border(
                shape = RoundedCornerShape(16.dp),
                width = 1.dp,
                color = Color.LightGray,
            )
            .padding(vertical = 4.dp, horizontal = 8.dp),
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        color = Color.Black
    )
}

@Preview
@Composable
fun previewMyChip(){
    MyChip(title = "")
}