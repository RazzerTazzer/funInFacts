package com.example.funinfacts

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.funinfacts.Data.FunFactsMap


@Composable
fun CategoryListScreen(navController: NavController, funFact: FunFactsMap?) {
    var searchQuery by remember { mutableStateOf("") }
    var isSearchVisible by remember { mutableStateOf(true) } // State to control visibility of search field
    val categories = funFact?.categories?.keys?.toList()?.sorted() ?: listOf("")

    // Filter categories based on the search query
    val filteredCategories = categories.filter { it.contains(searchQuery, ignoreCase = true) }
    Column {
        if (isSearchVisible) {
            // Search bar
            SearchBar(
                query = searchQuery,
                onQueryChange = { query ->
                    searchQuery = query
                }

            )
        }
        LazyVerticalGrid(columns = GridCells.Fixed(2)) {

            items(filteredCategories) { category ->
                val imageRes =
                    funFact?.categories?.get(category)?.imageId ?: R.drawable.default_image

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
                        navController.navigate("category_detail/$category")
                    }
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
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
                            text = category,
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
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar(query: String, onQueryChange: (String) -> Unit) {
    // Local focus and keyboard controllers
    val focusManager = LocalFocusManager.current
    val keyboardController = LocalSoftwareKeyboardController.current

    TextField(
        value = query,
        onValueChange = { query ->
            onQueryChange(query)
        },
        placeholder = { Text(text = "Search for category") },
        trailingIcon = {
            if (query.isNotEmpty()) {
                IconButton(onClick = {
                    onQueryChange("")
                    // Clear the focus and hide the keyboard
                    focusManager.clearFocus()
                    keyboardController?.hide()
                }) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "Clear",
                        tint = Color.Gray
                    )
                }
            }
        },
        keyboardOptions = KeyboardOptions.Default.copy(
            imeAction = ImeAction.Done // Set the IME action to "Done"
        ),
        keyboardActions = KeyboardActions(
            onDone = {
                // Clear the focus and hide the keyboard when "Done" is pressed
                focusManager.clearFocus()
                keyboardController?.hide()
            }
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    )
}