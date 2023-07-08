package com.example.cinematicketsreservations.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.cinematicketsreservations.R
import com.example.cinematicketsreservations.composable.ColumnRangeInformation
import com.example.cinematicketsreservations.composable.MovieTime
import com.example.cinematicketsreservations.composable.MyChip

@Composable
fun MovieDetailsScreen(
    navController: NavController
) {
    MovieDetailsContent{
        navController.navigate("reservationScreen")
    }

}

@Composable
private fun MovieDetailsContent(onClick: ()->Unit) {

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box {
            Image(
                painter = painterResource(id = R.drawable.img_movie),
                contentScale = ContentScale.FillBounds,
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.6f)
            )

            Icon(
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .background(Color(0xFFFF5524))
                    .padding(16.dp)
                    .align(Alignment.Center),
                painter = painterResource(id = R.drawable.ic_play),
                contentDescription = null,
                tint = Color.White
            )
        }

        Card(
            Modifier
                .padding(start = 16.dp, top = 32.dp)
                .clip(CircleShape),
            colors = CardDefaults.cardColors(Color(0x990F0F0F))
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

        Row(
            verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                .padding(end = 16.dp, top = 32.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color(0x990F0F0F))
                .align(Alignment.TopEnd)
        ) {
            Icon(
                modifier = Modifier
                    .padding(start = 4.dp)
                    .size(16.dp),
                painter = painterResource(id = R.drawable.ic_clock),
                contentDescription = "",
                tint = Color(0x99868585)
            )
            Text(
                text = "2h 23m",
                color = Color.White,
                modifier = Modifier.padding(end = 4.dp, top = 4.dp, bottom = 4.dp)
            )
        }

        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(topStart = 28.dp, topEnd = 28.dp))
                .fillMaxWidth()
                .fillMaxHeight(0.55f)
                .align(Alignment.BottomCenter)
                .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                ColumnRangeInformation(data = "3.8" , range ="/10", text ="IMDb")
                ColumnRangeInformation(data = "63%" , text ="Rotten Tomatoes")
                ColumnRangeInformation(data = "4" , range ="/10", text ="IGN")
            }
            Text(
                modifier = Modifier.padding(horizontal = 16.dp),
                text = "Fanntastic Beasts: The Secrets Of Dumbledore",
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                maxLines = 2,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(12.dp))

            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                items(2) {
                    MyChip(title = "Mahmoud")
                }
            }

            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                contentPadding = PaddingValues(16.dp)
            ) {
                items(20) {
                    Image(
                        modifier = Modifier
                            .size(64.dp)
                            .clip(CircleShape),
                        painter = painterResource(id = R.drawable.img_movie) ,
                        contentDescription ="",
                        contentScale = ContentScale.FillBounds
                    )
                }
            }

            Text(
                text = "Fanntastic Beasts: The Secrets Of Dumbledore Fanntastic Beasts: TheFanntastic Beasts: The S Fanntastic Beasts: The S Fanntastic Beasts: The S Secrets Of Dumbledore Fanntastic Beasts: The Secrets Of Dumbledore",
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                maxLines = 3,
                modifier = Modifier.padding(horizontal = 16.dp),
                color = Color.Black,
            )

            Row(
                verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                    .padding(bottom = 16.dp, top = 16.dp)
                    .clip(RoundedCornerShape(48.dp))
                    .background(Color(0xFFFF5524))
                    .clickable { onClick() }

            ) {
                Icon(
                    modifier = Modifier
                        .padding(start = 16.dp, end = 8.dp, top = 16.dp, bottom = 16.dp)
                        .size(24.dp),
                    painter = painterResource(id = R.drawable.ic_credit_card),
                    contentDescription = "",
                    tint = Color.White
                )
                Text(
                    text = "Booking",
                    color = Color.White,
                    modifier = Modifier.padding(end = 16.dp),
                    fontSize = 16.sp
                )

                Spacer(modifier = Modifier.width(16.dp))
            }

            Spacer(modifier = Modifier.height(12.dp))

        }
    }
}

@Preview
@Composable
fun previewDetailsScreen(){
    MovieDetailsContent {

    }
}
