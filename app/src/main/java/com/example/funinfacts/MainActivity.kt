package com.example.funinfacts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.funinfacts.Data.funFacts
import com.example.funinfacts.ui.theme.FunInFactsTheme
import com.example.funinfacts.CustomTopAppBar as CustomeTopAppBar

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val funFacts = funFacts

        enableEdgeToEdge()
        setContent {
            FunInFactsTheme {
                val navController = rememberNavController()
                val currentScreen = remember { mutableStateOf("Category") }

                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        CustomeTopAppBar(screen = currentScreen.value, navController = navController)
                    }
                ) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = "category_list",
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        composable("category_list") {
                            currentScreen.value = "Category"
                            CategoryListScreen(navController, funFacts)
                        }
                        composable("category_detail/{categoryName}") { backStackEntry ->
                            val categoryName = backStackEntry.arguments?.getString("categoryName")
                            if (categoryName != null) {
                                currentScreen.value = "CategoryDetail"
                                currentScreen.value = categoryName
                                CategoryDetailScreen(funFacts.categories[categoryName])
                            }
                        }
                    }
                }
            }
        }
    }
}
