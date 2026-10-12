package com.leadercoders.gr01_mym_m3_jetpackcomposeui.ders4

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.leadercoders.BoslukBirak

@Composable
fun D345_GirisYapEkrani() {
    var eposta by rememberSaveable { mutableStateOf("") }
    var sifre by rememberSaveable { mutableStateOf("") }
    var girisBasarili by rememberSaveable { mutableStateOf(false) }
    Column(

        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center


    ) {
        Text(
            "Hoşgeldiniz", fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
        OutlinedTextField(
            value = eposta,
            onValueChange = { eposta = it },
            label = { Text("E-posta adresi") }, singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Next
            )
        )
        BoslukBirak(16)
        OutlinedTextField(
            value = sifre,
            onValueChange = { sifre = it },
            label = { Text("Sifre") },
            singleLine = true,
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Done
            )
        )
        BoslukBirak(32)

        Button(
            onClick = {
                if (sifre.isNotEmpty() && eposta.isNotEmpty()) {
                    girisBasarili = true
                }
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0XFF2196F3))
        ) {
            Text(
                "Giriş yap",
                fontSize = 16.sp
            )
        }
        if (girisBasarili) {
            BoslukBirak(20)
            Text(
                "Giriş Başarılı!", color = Color.LightGray,
                fontWeight = FontWeight.Bold,
            )
        }
    }
}