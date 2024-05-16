package startPage

import DotActiveBGC
import DotDeActiveBGC
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import brush
import mainBGC
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import tradekmm.composeapp.generated.resources.Res
import tradekmm.composeapp.generated.resources.illus

@OptIn(ExperimentalResourceApi::class)
@Composable
fun startComp(navController: NavController) {
    var turn by remember { mutableStateOf(1) }


    Box(
        modifier = Modifier.fillMaxSize().background(mainBGC),
        contentAlignment = Alignment.BottomCenter
    ) {
        Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(0.9f)) {
            Box(
                modifier = Modifier.fillMaxSize(0.6f)
                    .align(Alignment.TopCenter)
            ) {
                Image(
                    painter = painterResource(Res.drawable.illus),
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.fillMaxSize(),
                    contentDescription = null
                )

            }


            Box(
                modifier = Modifier.fillMaxWidth().align(Alignment.Center)
                    .offset(y = 40.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        "Property",
                        color = Color.White,
                        fontSize = 35.sp,
                        fontWeight = FontWeight.Normal
                    )
                    Text(
                        "Diversity",
                        style = TextStyle(
                            brush = brush
                        ),
                        fontSize = 40.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

            }

            Box(
                modifier = Modifier.fillMaxWidth()
                    .align(Alignment.BottomCenter)
            ) {
                Column {
                    Row(
                        Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Box(
                            Modifier.size(8.dp).clip(RoundedCornerShape(100))
                                .background(if (turn == 1) DotActiveBGC else DotDeActiveBGC)
                        )
                        Spacer(Modifier.width(4.dp))
                        Box(
                            Modifier.size(8.dp).clip(RoundedCornerShape(100))
                                .background(if (turn == 2) DotActiveBGC else DotDeActiveBGC)
                        )
                    }
                    Spacer(Modifier.height(22.dp))

                    //btn

                    Button(
                        modifier = Modifier.fillMaxWidth().padding(start = 25.dp, end = 25.dp)
                            .height(48.dp).clip(RoundedCornerShape(100)),
                        onClick = {
                            if (turn == 1) turn = 2 else navController.navigate("homePage")
                        },
                        colors = ButtonDefaults.buttonColors(
                            contentColor = Color(0xFF202832),
                            backgroundColor = Color(0xFF202832)

                        ),
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Text(
                            "Next",
                            color = Color.White,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Normal
                        )
                    }

                    Spacer(modifier = Modifier.height(40.dp))

                }

            }

        }
    }
}