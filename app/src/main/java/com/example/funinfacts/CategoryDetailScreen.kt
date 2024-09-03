package com.example.funinfacts

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.funinfacts.Data.funFactMap


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CategoryDetailScreen(category: String, navController: NavHostController) {
    val funFact = funFactMap[category] ?: listOf("hello World")
    val pagerState = rememberPagerState(pageCount = { funFact.size })

    Column {

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)

        ) {
            Text(
                text = category,
                textAlign = TextAlign.Left,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                style = TextStyle(
                    fontSize = 50.sp
                )
            )
        }
        HorizontalPager(
            state = pagerState,
            contentPadding = PaddingValues(horizontal = 64.dp), // Adjust padding to center the pages
            pageSpacing = 40.dp, // Space between pages
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxHeight(0.6f)
        ) { page ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Card(
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 6.dp
                    ),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Black,
                    ),
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(), // Ensures Box fills the Card
                        contentAlignment = Alignment.Center // Centers content vertically and horizontally
                    ) {
                        Text(
                            text = funFact[page],
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            style = TextStyle(fontSize = 20.sp),
                            modifier = Modifier.padding(10.dp) // Add padding around the Text
                        )
                    }
                }
            }
        }
    }
}




