package org.artemissoftware.athenalink.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.artemissoftware.athenalink.navigation.Route

@Composable
fun ListScreen(
    navigateToDetail: (Int) -> Unit,
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(100) {
            Text(
                text = "Item $it",
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        navigateToDetail(it)
                    }
                    .padding(16.dp)
            )
        }
    }
}

