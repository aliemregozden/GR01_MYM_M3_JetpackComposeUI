package com.leadercoders.gr01_mym_m3_jetpackcomposeui.ders5proje

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun D350_Proje() {
    Column(
        modifier = Modifier
            .padding(24.dp)
            .background(color = Color(0xFFF8F9FA))
    ) {
        Row() {
            Box(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .background(
                        color = Color(0xFF21963F3)

                    )
                    .border(width = 1.dp, color = Color.Gray, shape = RoundedCornerShape(16.dp))
            ) {
                Text(
                    "Aramıza Katılın",
                    fontSize = 24.sp,
                    textAlign = TextAlign.End,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                    ,

                )

            }
        }
    }
}