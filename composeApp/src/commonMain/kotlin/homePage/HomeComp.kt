package homePage

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.BottomSheetScaffold
import androidx.compose.material.BottomSheetScaffoldState
import androidx.compose.material.BottomSheetState
import androidx.compose.material.BottomSheetValue
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.rememberBottomSheetScaffoldState
import androidx.compose.material.rememberBottomSheetState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.Navigator
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.withContext
import mainBGC
import sheetScaffoldColor

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun HomeComp(navController: NavController) {
    val bottomSheetState = rememberBottomSheetScaffoldState(
        bottomSheetState = rememberBottomSheetState(initialValue = BottomSheetValue.Collapsed)
    )
    var expandTheSheet by remember { mutableStateOf(true) }
    LaunchedEffect(expandTheSheet) {
        if (expandTheSheet) {
            bottomSheetState.bottomSheetState.expand()

        } else {
            bottomSheetState.bottomSheetState.collapse()
        }
    }


    Box(Modifier.fillMaxSize()) {

        val scaffoldState = rememberScaffoldState()
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            scaffoldState = scaffoldState,
            topBar = { TopBarComp() }) {
            if (expandTheSheet) {
                Box(Modifier.size(50.dp).background(Color.Magenta))
            }
            BottomSheetScaffold(
                modifier = Modifier.fillMaxSize(),
                sheetBackgroundColor = mainBGC,
                backgroundColor = if (bottomSheetState.bottomSheetState.isExpanded) sheetScaffoldColor else Color.Transparent,
                scaffoldState = bottomSheetState,
                sheetPeekHeight = 0.dp,
                sheetContent = { Box(Modifier.size(50.dp).background(Color.Blue)) }) {

                val scrollState = rememberScrollState()
                Column(Modifier.fillMaxSize().verticalScroll(scrollState)) {
                    Column(
                        Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Row(Modifier.clickable { expandTheSheet =!expandTheSheet }
                            .fillMaxWidth(0.5f).clip(RoundedCornerShape(100))) {
                            Text(
                                "BTC",
                                color = Color.Black,
                                fontSize = 35.sp,
                                fontWeight = FontWeight.Normal
                            )
                        }
                    }
                }

            }
        }

    }


}
