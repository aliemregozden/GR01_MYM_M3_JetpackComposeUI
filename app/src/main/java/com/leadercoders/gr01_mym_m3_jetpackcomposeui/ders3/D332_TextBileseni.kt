package com.leadercoders.gr01_mym_m3_jetpackcomposeui.ders3

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.leadercoders.BoslukBirak

@Composable
fun D332_TextBileseni() {

    Column(modifier = Modifier.padding(24.dp)) {
        Text("Haktan çam")

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            "Büyük Başlık",
            fontSize = 32.sp,
            color = Color.Red
        )
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            "Bu metin satırlar arası uzun bir boşluk olarak eklenen bir metindir, " +
                    "özellikle uzun paragraflarda kolaylaştırmak için lineHeight parametresi" +
                    " kullanılır",
            lineHeight = 28.sp
        )

        BoslukBirak(20)

        Text(
            "Sağ dayalı metin",
            textAlign = TextAlign.End,
            modifier = Modifier
                .background(color = Color.LightGray)
                .fillMaxWidth()
        )
        BoslukBirak(20)

        Text("Bu metin normalde ekrana sığmayıp alt satırlara taşa taşa devam edicek fakat biz" +
                " bunu seve seve sınırlandıracağız",
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.clickable {
               // buna tıklandığında yapılacak işlemler buraya yazılır
                println("Kullanıcı metne tıkladı")
            })
    }


}