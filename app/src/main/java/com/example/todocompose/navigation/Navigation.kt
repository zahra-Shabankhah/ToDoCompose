package com.example.todocompose.navigation

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost

import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import com.example.todocompose.navigation.destination.listComposable
import com.example.todocompose.utils.Constants.LIST_SCREEN

@ExperimentalMaterialApi
@Composable
fun SetUpNavigation(
    navController: NavHostController
){
    val screen = remember(navController){
        Screen(navController = navController)
    }

    NavHost(
        navController = navController,
        startDestination = LIST_SCREEN
    ) {
        listComposable(
            navigateToTaskScreen = screen.task,
            sharedViewModel = sharedViewModel
        )
        taskComposable(
            navigateToListScreen = screen.list
        )
    }

}