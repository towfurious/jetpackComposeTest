package com.example.dogprofilepage

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun ProfilePage() {
    Card(
        elevation = CardDefaults.elevatedCardElevation(), modifier = Modifier
            .fillMaxSize()
            .padding(top = 100.dp, bottom = 100.dp, start = 16.dp, end = 16.dp)
    ) {
        ConstraintLayout {
            val (image, nameText, textLocation, rowStats, buttonFollow, buttonMessage) = createRefs()
            val guideLine = createGuidelineFromTop(0.3f)
            Image(
                painter = painterResource(id = R.drawable.pusia),
                contentDescription = "Dog",
                modifier = Modifier
                    .size(200.dp)
                    .clip(CircleShape)
                    .border(
                        width = 2.dp,
                        color = Color.Gray,
                        shape = CircleShape
                    )
                    .constrainAs(image) {
                        top.linkTo(guideLine)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    },
                contentScale = ContentScale.Crop
            )

            Text(text = "Pusia the cat",
                modifier = Modifier.constrainAs(nameText) {
                    top.linkTo(image.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                })
            Text(text = "DFW", fontSize = 16.sp,
                modifier = Modifier.constrainAs(textLocation) {
                    top.linkTo(nameText.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                })
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .constrainAs(rowStats) {
                        top.linkTo(textLocation.top)

                    }
            )
            {
                ProfileStats("150", "Followers")
                ProfileStats("100", "Following")
                ProfileStats("1230", "Posts")
            }

            Button(onClick = { }, modifier = Modifier.constrainAs(buttonFollow) {
                top.linkTo(rowStats.bottom, margin = 16.dp)
                start.linkTo(parent.start)
                end.linkTo(buttonMessage.start)
                width = Dimension.wrapContent
            }) {
                Text(text = "Follow User")
            }
            Button(onClick = { }, modifier = Modifier.constrainAs(buttonMessage) {
                top.linkTo(rowStats.bottom, margin = 16.dp)
                start.linkTo(buttonFollow.end)
                end.linkTo(parent.end)
                width = Dimension.wrapContent
            }) {
                Text(text = "Direct Message")
            }
        }

    }

}

@Composable
fun ProfileStats(count: String, title: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = count, fontWeight = FontWeight.Bold)
        Text(text = title)
    }
}

@Preview(showBackground = true)
@Composable
fun ProfilePagePreview() {
    ProfilePage()
}
