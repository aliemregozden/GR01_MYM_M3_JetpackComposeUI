package com.leadercoders.gr01_mym_m3_jetpackcomposeui.ders3

import android.widget.Space
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.leadercoders.BoslukBirak

@Composable
fun D333_ButonCesitleri() {
    Column(modifier = Modifier.padding(24.dp)) {
        //Dolu buton
        Button(onClick = { println("Sepete ekle butonu çalışıyor") }) {
            Text("Sepete Ekle")
        }
//ayırıcı çizgi kullanılabilir boşluk yerine
      HorizontalDivider(
        thickness = 1.dp,
          color = Color.Blue,
          modifier = Modifier.padding(vertical = 12.dp)
      )
//

        OutlinedButton(onClick = { println("iptal butonu çalışıyor") }) {
            Text("İptal et")
        }

        BoslukBirak(20)

        TextButton(onClick = {}) {
            Text("Şifremi unuttum")
        }

        //Yan yana eşit paylaşımlı butonlar
        Row(modifier = Modifier.fillMaxWidth()) {
            OutlinedButton(
                onClick = {},
                modifier = Modifier.weight(2f)
            ) {
                Text("Vazgeçiyor musun")
            }
            BoslukBirak(20)
            Button(
                onClick = {},
                modifier = Modifier.weight(1f)
            ) {
                Text("Onayla")
            }
        }
        //Tam genişlikte Renkli buton
        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(contentColor = Color.LightGray, containerColor = Color.DarkGray)
        ) {
            Text("Tam genişlikte Renkli Buton")
        }
    }
}