package com.example.funinfacts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.funinfacts.ui.theme.FunInFactsTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val catgories = listOf("animals", "space", "history", "science", "geography", "technology", "food", "sports", "music", "art")

        enableEdgeToEdge()
        setContent {
            FunInFactsTheme {
                val navController = rememberNavController()
                Scaffold(modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = "category_list",
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        composable("category_list") {
                            CategoryListScreen(navController, catgories)
                        }
                        composable("category_detail/{categoryName}") { backStackEntry ->
                            val categoryName = backStackEntry.arguments?.getString("categoryName")
                            if (categoryName != null) {
                                CategoryDetailScreen(categoryName, navController)
                            }
                        }
                    }
                }
            }
        }
    }
}
