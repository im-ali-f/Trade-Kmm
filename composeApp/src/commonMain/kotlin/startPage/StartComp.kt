package startPage

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import mainBGC
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import tradekmm.composeapp.generated.resources.Res
import tradekmm.composeapp.generated.resources.illus

@OptIn(ExperimentalResourceApi::class)
@Composable
fun startComp(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize().background(mainBGC), contentAlignment = Alignment.BottomCenter){
        Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(0.8f).background(Color.Red)){
            Box(modifier = Modifier.fillMaxSize(0.5f).background(Color.Blue).align(Alignment.TopCenter)){
                Image(painter = painterResource(Res.drawable.illus), contentScale = ContentScale.Fit, modifier = Modifier.fillMaxSize(),contentDescription = null)

            }
        }
    }
}