package br.senai.sp.jandira.login

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.login.ui.theme.LoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting2()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
            Column(
            modifier = Modifier
                .width(400.dp)
                .height(900.dp)
    )
            {
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ){
            Box(
                modifier = Modifier
                    .width(150.dp)
                    .height(50.dp)
                    .background(
                        Color(0xFFCF06F0),
                        shape = RoundedCornerShape(bottomStart = 30.dp)
                    )
            )
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(500.dp)
                .offset(y = 180.dp),
            colors = CardDefaults.cardColors(Color.Transparent),
        )

        {
            Column (
                modifier = Modifier.width(400.dp)
            ) {
                Text(
                    modifier = Modifier.padding(start = 15.dp),
                    text = "Login",
                    fontSize = 48.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFCF06F0)
                )
                Text(
                    modifier = Modifier.padding(start = 15.dp),
                    text = "Please sign in to continue.",
                    fontSize = 14.sp,
                    color = Color.Gray
                )

                Spacer(modifier = Modifier.height(60.dp))

                Spacer(modifier = Modifier.height(12.dp))

                    OutlinedTextField(
                        modifier = Modifier
                            .width(380.dp)
                            .padding(start = 15.dp),
                        value = "",
                        onValueChange = {},
                        label = {
                            Text(text = "Email")
                        },
                        colors = OutlinedTextFieldDefaults
                            .colors(
                                unfocusedBorderColor = Color(0xFFCF06F0),
                                unfocusedPlaceholderColor = Color.Black,
                            ),
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Filled.Email,
                                contentDescription = "",
                                tint = Color(0xFFCF06F0)

                            )
                        }

                    )


                Spacer(modifier = Modifier.height(12.dp))
                OutlinedTextField(
                    modifier = Modifier
                        .width(380.dp)
                        .padding(start = 15.dp)
                    ,
                    value = "",
                    onValueChange = {},
                    label = {
                        Text(text = "Password")
                    },
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            unfocusedBorderColor = Color(0xFFCF06F0),
                            unfocusedPlaceholderColor = Color.Black,
                        ),
                    leadingIcon =   {
                        Icon(
                            imageVector = Icons.Filled.Lock,
                            contentDescription = "",
                            tint = Color(0xFFCF06F0)

                        )
                    }

                )
                Spacer(modifier = Modifier.height(48.dp))
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0xFFCF06F0)),
                    modifier = Modifier
                        .align(Alignment.End)
                        .padding(end = 15.dp)
                        .width(134.dp)
                        .height(48.dp)

                ) {
                    Text(
                        text = "SIGN IN",
                        fontSize = 18.sp,
                        letterSpacing = 1.sp
                    )
                    Icon(
                        imageVector = Icons.Filled.ArrowForward,
                        contentDescription = "",
                        tint = Color.White

                    )







                }
                Spacer(modifier = Modifier.height(30.dp))
                Row {
                    Text(
                        modifier = Modifier.padding(start = 170.dp),
                        text = "Don't have an account?",
                        fontSize = 12.sp,
                        color = Color.Gray,
                        letterSpacing = 1.sp
                    )
                    Text(
                        modifier = Modifier.padding(end = 10.dp),
                        color = Color(0xFFCF06F0),
                        fontSize = 12.sp,
                        text = "Sign up"

                    )
                }
            }

        }

    }
    Row (
        modifier = Modifier
            .offset(y = 801.dp)

        ){
        Box(
            modifier = Modifier
                .width(150.dp)
                .height(50.dp)
                .background(
                    Color(0xFFCF06F0),
                    shape = RoundedCornerShape(topEnd = 30.dp)
                )
        )
    }

}


@Composable
fun Greeting2() {
    Column(
        modifier = Modifier
            .width(400.dp)
            .height(900.dp)
    ) {
        Column {
            Box(
                modifier = Modifier
                    .offset(x = 245.dp)
                    .width(150.dp)
                    .height(50.dp)
                    .background(
                        Color(0xFFCF06F0),
                        shape = RoundedCornerShape(bottomStart = 30.dp)
                    )
            )
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(230.dp)
                .offset(y = 5.dp),
            colors = CardDefaults.cardColors(Color.Transparent),
        )
        {
            Column(
                modifier = Modifier
                    .width(600.dp)
            ) {
                Text(
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .offset(x = 130.dp),
                    text = "Sign in",
                    fontSize = 45.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFCF06F0)
                )
                Text(
                    modifier = Modifier
                        .width(200.dp)
                        .offset(x = 120.dp),
                text = "Please sign in to continue.",
                fontSize = 14.sp,
                color = Color.Gray
                )
                Card(
                    modifier = Modifier
                        .height(100.dp)
                        .width(100.dp)
                        .offset(x = 155.dp, y = 30.dp),
                    shape = CircleShape,
                    border = BorderStroke(1.dp, Color.Magenta)
                ) {
                    Icon(
                        modifier = Modifier.fillMaxSize(),
                        imageVector = Icons.Filled.Person,
                        contentDescription = "",
                        tint = Color.White,
                    )
                }
                Image(
                    modifier = Modifier
                        .size(30.dp)
                        .offset(x = 220.dp),
                    painter = painterResource(
                        id = R.drawable.camera
                    ),
                    contentDescription = "Camera",
                )

            }
        }
    Column(modifier = Modifier
        .padding(top = 40.dp)
        .width(400.dp)
        .height(310.dp))

    {
        OutlinedTextField(
            modifier = Modifier
                .width(380.dp)
                .padding(start = 15.dp),
            value = "",
            onValueChange = {},
            label = {
                Text(text = "Username")
            },
            colors = OutlinedTextFieldDefaults
                .colors(
                    unfocusedBorderColor = Color(0xFFCF06F0),
                    unfocusedPlaceholderColor = Color.Black,
                ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Person,
                    contentDescription = "",
                    tint = Color(0xFFCF06F0)
                )
            }
        )

        OutlinedTextField(
            modifier = Modifier
                .width(380.dp)
                .padding(start = 15.dp),
            value = "",
            onValueChange = {},
            label = {
                Text(text = "Phone")
            },
            colors = OutlinedTextFieldDefaults
                .colors(
                    unfocusedBorderColor = Color(0xFFCF06F0),
                    unfocusedPlaceholderColor = Color.Black,
                ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Phone,
                    contentDescription = "",
                    tint = Color(0xFFCF06F0)

                )
            }

        )
        OutlinedTextField(
            modifier = Modifier
                .width(380.dp)
                .padding(start = 15.dp),
            value = "",
            onValueChange = {},
            label = {
                Text(text = "E-mail")
            },
            colors = OutlinedTextFieldDefaults
                .colors(
                    unfocusedBorderColor = Color(0xFFCF06F0),
                    unfocusedPlaceholderColor = Color.Black,
                ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = "",
                    tint = Color(0xFFCF06F0)

                )
            }

        )
        OutlinedTextField(
            modifier = Modifier
                .width(380.dp)
                .padding(start = 15.dp),
            value = "",
            onValueChange = {},
            label = {
                Text(text = "Password")
            },
            colors = OutlinedTextFieldDefaults
                .colors(
                    unfocusedBorderColor = Color(0xFFCF06F0),
                    unfocusedPlaceholderColor = Color.Black,
                ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Lock,
                    contentDescription = "",
                    tint = Color(0xFFCF06F0)

                )
            }

        )
        Box(
            modifier = Modifier
                .offset(x = 15.dp, y = 15.dp)
                .width(30.dp)
                .height(30.dp)
                .background(Color.White)
                .border(BorderStroke(width = 1.dp, color = Color(0xFFCF06F0)))
        )
        Text(
            modifier = Modifier.offset(x = 55.dp, y = -12.dp),
            text = "Over 18?")
    }

        Spacer(modifier = Modifier.height(20.dp))


        Column (modifier = Modifier
            .width(400.dp)
            .height(100.dp)
    ) {
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color(0xFFCF06F0)),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .width(350.dp)
                .height(48.dp)
        ) {
                Text(
                    text = "CREATE ACCOUNT",
                    fontSize = 18.sp,
                    letterSpacing = 1.sp
                )
        }

        Row (modifier = Modifier
            .align(Alignment.End)
            .padding(15.dp)
        ){
            Text(
                text = "Already have an account?",
                fontSize = 14.sp,
                color = Color.Gray,
            )
            Text(
                text = "Sign in",
                fontSize = 14.sp,
                color = Color(0xFFCF06F0)
            )
        }
    }
        Box(
            modifier = Modifier
                .offset(y = 50.dp)
                .width(150.dp)
                .height(50.dp)
                .background(
                    Color(0xFFCF06F0),
                    shape = RoundedCornerShape(topEnd = 30.dp)
                )
        )



    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LoginTheme {
        Greeting2()
    }
}