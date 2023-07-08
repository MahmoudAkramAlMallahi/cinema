package com.example.cinematicketsreservations

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cinematicketsreservations.screen.HomeScreen
import com.example.cinematicketsreservations.screen.MovieDetailsScreen
import com.example.cinematicketsreservations.screen.ReservationScreen
import com.example.cinematicketsreservations.ui.theme.CinemaTicketsReservationsTheme

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CinemaApp(){
    CinemaTicketsReservationsTheme {
        Scaffold{
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "homeScreen"){
                composable(route = "homeScreen"){ HomeScreen(navController) }
                composable(route = "movieDetailsScreen"){ MovieDetailsScreen(navController) }
                composable(route = "reservationScreen"){ ReservationScreen() }
            }
        }

    }
}