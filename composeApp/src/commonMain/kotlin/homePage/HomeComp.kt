package homePage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomSheetScaffold
import androidx.compose.material.BottomSheetState
import androidx.compose.material.BottomSheetValue
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberBottomSheetScaffoldState
import androidx.compose.material.rememberBottomSheetState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.Navigator
import mainBGC

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun HomeComp(navController: NavController) {
    val bottomSheetState = rememberBottomSheetScaffoldState(
        bottomSheetState = BottomSheetState(BottomSheetValue.Expanded)
    )
    Box(Modifier.fillMaxSize()){


        val scaffoldState = rememberScaffoldState()
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            scaffoldState = scaffoldState,
            topBar = { TopBarComp() }) {

            BottomSheetScaffold(
                modifier = Modifier,
                sheetBackgroundColor = mainBGC,
                backgroundColor = Color.Transparent,
                scaffoldState = bottomSheetState,
                sheetPeekHeight = 0.dp,
                sheetContent = { Box(Modifier.size(50.dp).background(Color.Blue)) }) {
            }
        }

    }


}