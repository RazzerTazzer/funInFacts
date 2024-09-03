package com.example.funinfacts

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun CategoryListScreen(navController: NavController, catgories: List<String>) {
    val categoryImageMap = mapOf(
        "animals" to R.drawable.animal,
        "space" to R.drawable.space,
        "history" to R.drawable.history,
        "science" to R.drawable.sience,
        "geography" to R.drawable.geography,
        "food" to R.drawable.food,
        "sports" to R.drawable.sports,
        "music" to R.drawable.music,
        "art" to R.drawable.art,
        "technology" to R.drawable.technology
    )
    LazyVerticalGrid(columns = GridCells.Fixed(2)) {

        items(catgories) { item ->
            val imageRes = categoryImageMap[item] ?: R.drawable.default_image

            Card(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant,
                ),
                modifier = Modifier
                    .size(150.dp)
                    .padding(6.dp),
                onClick = {
                    // Navigate to the detail screen with the selected category
                    navController.navigate("category_detail/$item")
                }
            ) {
                Box(
                    contentAlignment = Alignment.Center, // Center the content
                    modifier = Modifier.fillMaxSize()

                ) {
                    Image(
                        painter = painterResource(id = imageRes),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )
                    Image(
                        painter = painterResource(id = R.drawable.overlaydark2),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )
                    val offset = Offset(2.0f, 2.0f)

                    Text(
                        text = item,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        style = TextStyle(
                                fontSize = 24.sp,
                                shadow = Shadow(
                                color = Color.Black, offset = offset, blurRadius = 3f
                            )
                        )
                    )
                }
            }
        }
    }
}
