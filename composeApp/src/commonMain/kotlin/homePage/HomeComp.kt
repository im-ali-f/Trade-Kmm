package homePage

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
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.Navigator

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun HomeComp(navController: NavController) {
    val bottomSheetState = rememberBottomSheetScaffoldState(
        bottomSheetState = BottomSheetState(BottomSheetValue.Collapsed)
    )
    BottomSheetScaffold(scaffoldState = bottomSheetState, sheetPeekHeight = 0.dp, sheetContent = {
        val scaffoldState = rememberScaffoldState()
        Scaffold(scaffoldState = scaffoldState, topBar = { TopBarComp() }) {

        }


    }) {

    }

}