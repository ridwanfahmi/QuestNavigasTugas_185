package com.example.tugas5.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas5.R



@Composable
fun HalamanAwal(
    onDaftarClick: () -> Unit,
    onLihatDaftarClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(R.string.welcome),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 4.dp)
        )


        Image(
            painter = painterResource(id = R.drawable.babymonster), // Ganti sesuai nama file Anda
            contentDescription = "Logo Aplikasi",
            modifier = Modifier
                .size(120.dp)
                .padding(bottom = 24.dp)
        )
        Text(
            text = "${stringResource(R.string.nama)} ${stringResource(R.string.nim)}",
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(bottom = 32.dp)

        )
        // Tombol Submit
        Button(
            onClick = onDaftarClick,
            modifier = Modifier
                .width(200.dp)
                .height(50.dp)
        ){
            Text(
                text = stringResource(R.string.masuk),
                fontSize = 16.sp
            )
        }
    }
}