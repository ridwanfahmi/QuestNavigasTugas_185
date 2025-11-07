package com.example.tugas5

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tugas5.view.HalamanTampilData
import com.example.tugas5.view.HalamanAwal
import com.example.tugas5.view.HalamanFormulir



// Model data
data class Pendaftar(
    val nama: String,
    val jenisKelamin: String,
    val status: String,
    val alamat: String
)

@Composable
fun DataApp(modifier: Modifier) {
    val navController = rememberNavController()
    val daftarPendaftar = remember { mutableStateListOf<Pendaftar>() }

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HalamanAwal(
                onDaftarClick = { navController.navigate("form") },
                onLihatDaftarClick = { navController.navigate("list") }
            )
        }
        composable("form") {
            HalamanFormulir(
                onSimpan = { nama, jk, status, alamat ->
                    daftarPendaftar.add(Pendaftar(nama, jk, status, alamat))
                    navController.navigate("list")
                },
                onBack = { navController.popBackStack() }
            )
        }
        composable("list") {
            HalamanTampilData (
                daftarPendaftar = daftarPendaftar,
                onBackToHome = { navController.navigate("home") },
                onGoToForm = { navController.navigate("form") }
            )
        }
    }
}