package com.leadercoders.gr01_mym_m3_jetpackcomposeui.ders4

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import com.leadercoders.BoslukBirak

@Composable
fun D344_KullanicidanVeriAlma(){
    Column(modifier = Modifier.fillMaxSize().
    padding(24.dp)) {

        var isim by rememberSaveable { mutableStateOf("") }
        var eposta by rememberSaveable { mutableStateOf("") }
        var yas by rememberSaveable { mutableStateOf("") }
        var sifre by rememberSaveable { mutableStateOf("") }


TextField(
    value = yas,
    onValueChange = {yas = it},
    label = { Text("Haktan Çam") },
    placeholder = { Text("yaş gir") },
    singleLine = true,
    keyboardOptions = KeyboardOptions(
        imeAction = ImeAction.Next,
        keyboardType = KeyboardType.Number
    )
)
        BoslukBirak(20)

        OutlinedTextField(
            value = eposta,
            onValueChange = {eposta = it},
            label = { Text("Haktan Çam") },
            placeholder = { Text("eposta girin") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(

                keyboardType = KeyboardType.Number ,
                imeAction = ImeAction.Next
            )
        )

        BoslukBirak(20)

        OutlinedTextField(
            value = sifre,
            onValueChange = {sifre = it},
            label = { Text("Şifre") },
            placeholder = { Text("şifre girin") },
            singleLine = true,
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(

                keyboardType = KeyboardType.Password ,
                imeAction = ImeAction.Next
            )
        )

        BoslukBirak(20)
        OutlinedTextField(
            value = isim,
            onValueChange = {isim = it},
            label = { Text("Ad soyad") },
            placeholder = { Text("Adınızı ve Soyadınızı girin") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            )
        )


    }
}