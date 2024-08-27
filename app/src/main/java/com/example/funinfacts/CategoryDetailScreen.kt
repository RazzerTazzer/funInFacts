package com.example.funinfacts

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.funinfacts.Data.funFactMap


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CategoryDetailScreen(category: String) {
    val funFact = funFactMap[category] ?: listOf("hello World")

    val pagerState = rememberPagerState(pageCount = {funFact.size})

    HorizontalPager(
        state = pagerState,
        modifier = Modifier.fillMaxHeight(0.6f)
            .fillMaxWidth(1f)
    ) { page ->
        val item = funFact[page]
        Box(
            modifier = Modifier.fillMaxSize()
                .padding(16.dp)
        ) {
            Card(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant,
                ),
                modifier = Modifier
                    .fillMaxSize()
                    .padding(6.dp)
            ) {
                Text(
                    text = item,
                    modifier = Modifier
                        .padding(16.dp)
                )
            }
        }

    }
}

