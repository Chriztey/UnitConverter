package com.chris.unitconverter

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chris.unitconverter.ui.theme.UnitConverterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnitConverterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    UnitConverter()
                }
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UnitConverter () {
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        ) { // stacked below ea other
        Text(text = "Unit Converter")
        Spacer(modifier = Modifier.height(16.dp))
        //Spacer(modifier = Modifier.padding(100.dp))
        OutlinedTextField(value = "Enter Value" , onValueChange = {})
        Spacer(modifier = Modifier.height(16.dp))
        Row {// stacked beside ea other
            
            Box {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Select")
                    Icon(Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow Down")
                }
                DropdownMenu(expanded = true, onDismissRequest = { /*TODO*/ }) {
                    DropdownMenuItem(text = {
                        Text(text = "Centimeters")},
                        onClick = { /*TODO*/ }
                    )

                    DropdownMenuItem(text = {
                        Text(text = "Meters")},
                        onClick = { /*TODO*/ }
                    )

                    DropdownMenuItem(text = {
                        Text(text = "Feet")},
                        onClick = { /*TODO*/ }
                    )

                    DropdownMenuItem(text = {
                        Text(text = "Milimeters")},
                        onClick = { /*TODO*/ }
                    )
                }

            }
            Spacer(modifier = Modifier.width(16.dp))

            Box {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Select")
                    Icon(Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow Down")

            }
                DropdownMenu(expanded = true, onDismissRequest = { /*TODO*/ }) {
                    DropdownMenuItem(text = {
                        Text(text = "Centimeters")},
                        onClick = { /*TODO*/ }
                    )

                    DropdownMenuItem(text = {
                        Text(text = "Mters")},
                        onClick = { /*TODO*/ }
                    )

                    DropdownMenuItem(text = {
                        Text(text = "Feet")},
                        onClick = { /*TODO*/ }
                    )

                    DropdownMenuItem(text = {
                        Text(text = "Milimeters")},
                        onClick = { /*TODO*/ }
                    )
                }

             //Button & Toast Use
//            val context = LocalContext.current
//            Button(onClick = { Toast.makeText(context,
//                "Thanks for Clicking!",
//                Toast.LENGTH_SHORT).show() }) {
//                Text(text = "Click Here")
//
//            }

        }

    }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Result")
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview
@Composable
fun UnitConverterPreview(){
    UnitConverter()
}}