package com.example.funinfacts

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.funinfacts.Data.funFactMap


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CategoryDetailScreen(category: String) {
    val funFact = funFactMap[category] ?: listOf("hello World")

    //val pagerState = rememberPagerState(pageCount = {funFact.size})
    // Display 10 items
    val pagerState = rememberPagerState(pageCount = {
        10
    })
    HorizontalPager(
        state = pagerState,
        contentPadding = PaddingValues(horizontal = 64.dp), // Adjust padding to center the pages
        pageSpacing = 40.dp, // Space between pages
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .background(color = Color.Red)
            .fillMaxHeight(0.6f)
    ) { page ->
        // Our page content
        Box(modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Cyan)
        ) {
            Text(
                text = "Page: $page",
                modifier = Modifier.fillMaxWidth()
            )
        }

    }
}

