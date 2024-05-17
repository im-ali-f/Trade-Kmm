package homePage

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import tradekmm.composeapp.generated.resources.Res
import tradekmm.composeapp.generated.resources.search

@OptIn(ExperimentalResourceApi::class)
@Composable
fun TopBarComp() {
    Row(
        Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        IconButton(modifier = Modifier.size(46.dp).clip(RoundedCornerShape(100)),onClick = {}){
            Icon(modifier = Modifier.size(9.dp),painter = painterResource(Res.drawable.search),contentDescription = null)
        }
    }
}