package com.example.cinematicketsreservations.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.cinematicketsreservations.R

@Composable
fun ReservationScreen(){
    ReservationContent()
}

@Composable
private fun ReservationContent(){
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.Black)) {
        Card(
            Modifier
                .padding(horizontal = 16.dp, vertical = 16.dp)
                .clip(CircleShape),
            colors = CardDefaults.cardColors(Color(0x99838383))
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_close),
                contentDescription = "",
                modifier = Modifier
                    .padding(8.dp)
                    .size(24.dp)
                    .clip(CircleShape),
                tint = Color.White
            )

        }
        Image(
            modifier = Modifier.fillMaxWidth(),
            painter = painterResource(id = R.drawable.img_displayed_movie)
            , contentDescription = "")

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
            ) {

            LazyColumn(
                modifier = Modifier.rotate(4f),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ){
                items(count = 5) {
                    OneSeat()
                }
            }

            LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)){
                items(count = 5) {
                    OneSeat()
                }
            }

            LazyColumn(
                Modifier.rotate(-4f),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ){
                items(count = 5) {
                    OneSeat()
                }
            }

        }

        Row(
            modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Row{
                Card(
                    Modifier
                        .clip(CircleShape)
                        .padding(end = 4.dp)
                        .size(8.dp)
                        .align(Alignment.CenterVertically),
                    colors = CardDefaults.cardColors(Color(0x99F7F6F6))

                ) {}

                Text(text = "Available", color = Color(0x99868585))
            }

            Row{
                Card(
                    Modifier
                        .clip(CircleShape)
                        .padding(end = 4.dp)
                        .size(8.dp)
                        .align(Alignment.CenterVertically),
                    colors = CardDefaults.cardColors(Color(0x994F4F4F))

                    ) {}

                Text(text = "Taken", color = Color(0x99868585))
            }

            Row{
                Card(
                    Modifier
                        .clip(CircleShape)
                        .padding(end = 4.dp)
                        .size(8.dp)
                        .align(Alignment.CenterVertically),
                    colors = CardDefaults.cardColors(Color(0xFFEB7551))
                    ) {}

                Text(text = "Selected", color = Color(0x99868585))
            }

        }

        Spacer(modifier = Modifier.height(8.dp))

        Column(
            modifier = Modifier
                .fillMaxHeight()
                .clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
                .background(Color.White),
            verticalArrangement = Arrangement.Bottom
        ) {

            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                modifier = Modifier.clip(RoundedCornerShape(5.dp))
            ) {
                items(30) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .clip(RoundedCornerShape(24.dp))
                            .background(Color.Transparent)
                            .clickable { }
                            .border(
                                1.dp,
                                color = Color.LightGray,
                                shape = RoundedCornerShape(24.dp)
                            )
                            .padding(vertical = 16.dp, horizontal = 20.dp)
                    ){
                        Text(
                            text = "14",
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp,
                            color = Color.Black,
                        )

                        Text(
                            text = "Thu",
                            fontWeight = FontWeight.Medium,
                            fontSize = 10.sp,
                            color = Color(0x809E9E9E),
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier
                    .clip(RoundedCornerShape(5.dp))
            ) {
                items(40) {
                    Text(
                        text = "12:4345",
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp,
                        color = Color.LightGray,
                        modifier = Modifier
                            .clip(RoundedCornerShape(Int.MAX_VALUE.dp))
                            .clickable { }
                            .border(
                                1.dp,
                                color = Color.LightGray,
                                shape = RoundedCornerShape(Int.MAX_VALUE.dp)
                            )
                            .padding(vertical = 8.dp, horizontal = 8.dp)
                    )
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, top = 24.dp, bottom = 24.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Column {
                    Row {
                        Text(
                            text = "$",
                            fontWeight = FontWeight.Bold,
                            fontSize = 22.sp,
                            color = Color.Black
                        )
                        Text(
                            text = "100.00",
                            fontWeight = FontWeight.Bold,
                            fontSize = 22.sp,
                            color = Color.Black
                        )
                    }
                    Row {
                        Text(
                            modifier = Modifier.padding(end = 2.dp),
                            text = "4",
                            fontWeight = FontWeight.Normal,
                            fontSize = 12.sp,
                            color = Color(0x43757575),
                        )
                        Text(
                            text = "Tickets",
                            fontWeight = FontWeight.Normal,
                            fontSize = 12.sp,
                            color = Color(0x43757575)
                        )
                    }

                }

                Button(
                    onClick = {  },
                    modifier = Modifier
                        .height(48.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF5524)),
                    contentPadding = PaddingValues(horizontal = 16.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_credit_card),
                        contentDescription = null,
                        tint = Color(0xFFFFEAD2)
                    )
                    Text(
                        text = "Buy tickets",
                        modifier = Modifier.padding(start = 8.dp),
                        color = Color(0xFFFFEAD2),
                        fontWeight = FontWeight.Normal,
                        fontSize = 14.sp
                    )
                }

            }
        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun previewReservationScreen(){
    ReservationScreen()
}

@Preview
@Composable
fun OneSeat(){
    ConstraintLayout(modifier = Modifier.width( 115.dp)){
        val icon = createRef()
        val row = createRef()
        Icon(
            modifier = Modifier
                .constrainAs(icon){
                    start.linkTo(parent.start)
                },
            painter = painterResource(id = R.drawable.chair_border), contentDescription ="",
            tint = Color(0xFF3C3C3C)
        )
        Row(
            modifier = Modifier
                .padding(horizontal = 20.dp)
                .padding(bottom = 8.dp)
                .constrainAs(icon) {
                    start.linkTo(icon.start)
                    bottom.linkTo(icon.bottom)
                }
        ) {
            Image(modifier = Modifier.size(35.dp),painter = painterResource(id = R.drawable.ic_seat), contentDescription = "")
            Image(modifier = Modifier.size(35.dp),painter = painterResource(id = R.drawable.ic_seat), contentDescription = "")
        }
    }
}