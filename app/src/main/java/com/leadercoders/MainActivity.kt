package com.leadercoders.gr01_mym_m3_jetpackcomposeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.leadercoders.gr01_mym_m3_jetpackcomposeui.ders2.D322_TemelDizilimler
import com.leadercoders.gr01_mym_m3_jetpackcomposeui.ders2.D326_ProfilKarti
import com.leadercoders.gr01_mym_m3_jetpackcomposeui.ders3.D332_TextBileseni
import com.leadercoders.gr01_mym_m3_jetpackcomposeui.ders3.D333_ButonCesitleri
import com.leadercoders.gr01_mym_m3_jetpackcomposeui.ui.theme.GR01_MYM_M3_JetpackComposeUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GR01_MYM_M3_JetpackComposeUITheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        //DERS1
                        //SelamlamaEkrani()

                        ///DERS2
                      //  D322_TemelDizilimler()
                        //D326_ProfilKarti()
                    //Ders3
                      D332_TextBileseni()
                        //   D333_ButonCesitleri()
                    }

                }

            }

        }

    }
}

@Composable
fun SelamlamaEkrani() {
    Text("Merhaba Dünya! İlk Compose uygulamam çalışıyor 🎉")
}

