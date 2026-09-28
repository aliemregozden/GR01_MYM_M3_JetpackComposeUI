package com.leadercoders.gr01_mym_m3_jetpackcomposeui.ders2

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun D322_TemelDizilimler() {
    Column(
        modifier = Modifier
            .background(color = Color.LightGray)
            .border(2.dp, color = Color.Red)
            .fillMaxSize()
            .padding(24.dp)
    )
    {
        Text("\uD83D\uDC64")
        Text("Ali yılmaz")
        Text("Mobil uygulama geliştiricisi")

        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier
                .background(color = Color(0xFFA8A492))
                .border(2.dp, color = Color(0xFF524646))
                .fillMaxWidth()
                .padding(vertical = 20.dp)

        ) {
            Text("Takipçi: 500 |")
            Spacer(modifier = Modifier.weight(1f))
            Text("Takip edilen: 200")

            Spacer(modifier = Modifier.height(20.dp))
        }
        Box(
            modifier = Modifier
                .background(color = Color(0xFFFCF2E5))
                .border(2.dp,color = Color(0xFFA8A492))
                .width(100.dp)
                .height(100.dp)
                .padding(top = 20.dp, start = 20.dp)
        ) {
            Text("\uD83D\uDFE5")
            Text("Beğen")
        }
    }


}/*
        MÜHENDİSLİK UYARISI: Modifier’lar zincirleme (chaining) yöntemiyle nokta (.) konularak ardı ardına yazılır.
        Sıraları çok önemlidir! .padding().background() ile .background().padding() farklı görünür.
         Önce arkaplanı (veya çerçeveyi) çizip sonra içeri doğru boşluk bırakmak
        (padding) içeriklerin dış çeperden uzaklaşmasını sağlar.
       */