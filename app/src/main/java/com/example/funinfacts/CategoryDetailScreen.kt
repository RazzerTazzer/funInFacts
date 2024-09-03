package com.example.funinfacts

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.funinfacts.Data.funFactMap


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CategoryDetailScreen(category: String) {
    val funFact = funFactMap[category] ?: listOf("hello World")
    val pagerState = rememberPagerState(pageCount = { funFact.size })
    val context = LocalContext.current


    Scaffold(
    ) { paddingValues ->
        Column(
            modifier = Modifier.padding(0.dp, 10.dp,)
                .padding(paddingValues)
        ) {

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
                            IconButton(
                                onClick = {
                                    shareText(context, funFact[page])
                                },
                                modifier = Modifier
                                    .align(Alignment.TopEnd) // Position icon at the top right corner
                                    .padding(8.dp) // Add some padding
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Share,
                                    contentDescription = "Copy funfact",
                                    tint = Color.White
                                )
                            }
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
}

fun shareText(context: Context, text: String) {
    val intent = Intent(Intent.ACTION_SEND).apply {
        type = "text/plain"
        putExtra(Intent.EXTRA_TEXT, "Fun Fact: $text")
    }
    context.startActivity(Intent.createChooser(intent, "Share via"))
}

