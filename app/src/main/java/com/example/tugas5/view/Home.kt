import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas5.R

@Composable
fun HalamanAwal(
    onMasukClick: () -> Unit
) {
    val blueTheme = Color(0xFF74EDFF)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Spacer(modifier = Modifier.height(60.dp))

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                stringResource(id = R.string.welcome),
                fontSize = 28.sp,
                fontWeight = FontWeight.Light,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(32.dp))

            Image(
                painterResource(id = R.drawable.Babymonster),
                contentDescription = "Babymonster",
                modifier = Modifier.size(200.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                stringResource(id = R.string.nama),
                fontSize = 36.sp,
                fontWeight = FontWeight.ExtraBold,
                color = blueTheme
            )
            Text(
                text = stringResource(id = R.string.nim),
                fontSize = 14.sp,
                color = Color.Gray
            )

        }
        Button(
            onClick = onMasukClick,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .height(56.dp),
            colors = ButtonDefaults.buttonColors(containerColor = blueTheme),
            shape = MaterialTheme.shapes.medium
        ) {
            Text(
                text = stringResource(id = R.string.masuk),
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}