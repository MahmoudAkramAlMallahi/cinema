package com.example.cinematicketsreservations.screen

import android.graphics.ColorSpace
import androidx.compose.foundation.ExperimentalFoundationApi
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.cinematicketsreservations.R
import com.example.cinematicketsreservations.composable.MovieTime
import com.example.cinematicketsreservations.composable.MyChip
import kotlin.math.absoluteValue

@Composable
fun HomeScreen(
    navController: NavController
) {
    HomeContent(
        onClick = {
            navController.navigate("movieDetailsScreen")
        })
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeContent(
    onClick: ()->Unit
) {

    val sliderList = listOf(
        R.drawable.img_movie,
        R.drawable.img_movie,
        R.drawable.img_movie,
        R.drawable.img_movie,
        R.drawable.img_movie
    )



    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
    ) {

        Image(
            modifier = Modifier
                .blur(32.dp)
                .background(
                    brush = Brush.verticalGradient(
                        listOf(
                            Color.Transparent,
                            Color.Transparent,
                            Color.White,
                            Color.Transparent
                        )
                    )
                )
                .fillMaxWidth()
                .fillMaxHeight(0.55f)
                .drawWithCache {
                    onDrawWithContent {
                        drawContent()
                        drawRect(
                            Brush.verticalGradient(
                                0.5f to Color.White.copy(alpha = 0F),
                                1F to Color.White
                            )
                        )
                    }
                },
            painter = painterResource(id = R.drawable.img_movie),
            contentDescription = "",
            contentScale = ContentScale.FillBounds,

            )

        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {

            Box(
                modifier = Modifier
                    .padding(top = 48.dp)
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {

                Row() {
                    Text(
                        text = "Now Showing",
                        Modifier
                            .clip(RoundedCornerShape(16.dp))
                            .background(Color(0xFFFF5524))
                            .padding(vertical = 8.dp, horizontal = 12.dp),
                        fontWeight = FontWeight.Normal,
                        fontSize = 14.sp,
                        color = Color.White,
                    )

                    Spacer(modifier = Modifier.width(6.dp))

                    Text(
                        text = "Coming Soon",
                        Modifier
                            .border(
                                shape = RoundedCornerShape(16.dp),
                                width = 1.dp,
                                color = Color.LightGray,
                            )
                            .padding(vertical = 8.dp, horizontal = 12.dp),
                        fontWeight = FontWeight.Normal,
                        fontSize = 14.sp,
                        color = Color.White,
                    )
                }

            }

            Spacer(modifier = Modifier.height(32.dp))

            val pagerState = rememberPagerState(pageCount = { sliderList.size }, initialPage = 1)
            HorizontalPager(
                state = pagerState,
                contentPadding = PaddingValues(horizontal = 65.dp),
            ) { pager ->
                Image(
                    painter = painterResource(id = R.drawable.img_movie),
                    contentDescription = "",
                    modifier = Modifier
                        .clickable { onClick() }
                        .height(350.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .graphicsLayer {
                            val pageOffset = (
                                    (pagerState.currentPage - pager) + pagerState
                                        .currentPageOffsetFraction
                                    ).absoluteValue

                            alpha = 1f - pageOffset.coerceIn(0f, 0.5f)
                            scaleY = 1f - pageOffset.coerceIn(0f, 0.1f)
                            scaleX = 1f - pageOffset.coerceIn(0f, 0.1f)
                        }
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            MovieTime(title = "2h 23m", color = Color.Black)

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Fanntastic Beasts: The Secrets Of Dumbledore",
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                maxLines = 2,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(24.dp))

            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                items(2) {
                    MyChip(title = "Mahmoud")
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 12.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly,
            ) {
                Card(
                    Modifier
                        .clip(CircleShape),
                    colors = CardDefaults.cardColors(Color(0xFFFF5524))
                ) {
                    Icon(
                        modifier= Modifier.padding(12.dp),
                        painter = painterResource(id = R.drawable.ic_video),
                        contentDescription = "",
                        tint = Color.White
                    )
                }

                Icon(painter = painterResource(id = R.drawable.ic_search), contentDescription = "")
                Icon(painter = painterResource(id = R.drawable.ic_credit_card), contentDescription = "")
                Icon(painter = painterResource(id = R.drawable.ic_person), contentDescription = "")
            }

        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MyPager(modifier: Modifier) {

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun previewHomeScreen() {
    HomeContent({})
}