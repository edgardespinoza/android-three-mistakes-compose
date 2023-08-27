package com.eespinor.mistakesjetpack

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp

@Composable
fun Mistake1() {
    val scrollState = rememberScrollState()
    Column (
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
    ){
        for (i in 1 .. 20){
            MyListItem(
                scrollOffSet=scrollState.value.toFloat(),
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}


@Composable
fun MyListItem(
    scrollOffSet: Float,
    modifier: Modifier=Modifier
) {
    Text(
        text = "Scroll item",
        modifier = modifier
            .padding(32.dp)
            .graphicsLayer {
                translationX = scrollOffSet
            }
    )
}