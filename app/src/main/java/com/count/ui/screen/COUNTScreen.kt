package com.count.ui.screen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.count.data.Count
import com.count.data.CountPeriod
import org.w3c.dom.Text

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun COUNTScreen(){
    // -- STATE --
    // Replace dummy list with a ViewModel or real Storage later
    var counters by remember {
        mutableStateOf(
            listOf(
                Count(name = "Meditation", count = 108, target = 108, period = CountPeriod.DAY),
                Count(name = "Exercise", count = 30, target = 40, period = CountPeriod.MONTH),
                Count(name = "Books Read", count = 20, target = 30, period = CountPeriod.YEAR),

            )
        )
    }

    // -- UI --
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = {
                //  TODO: Open "Add Counter" dialog (Step 3)
            }) {
                Icon(Icons.Default.Add, contentDescription = "Add Counter")
            }
        }
    ){  innerPadding ->
        LazyColumn(
            modifier = Modifier.padding(innerPadding)
        ) {
            items(counters) { count ->
                COUNTCard(count)

            }
        }
    }
}


// Counter Card - REUSABLE - QuietCraft Theme Style

@Composable
fun COUNTCard(count: Count){
    Card(
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        //Layout: Name (left), Count (right), Target (optional, right)
        ListItem(
            headlineContent = { Text(count.name, style = MaterialTheme.typography.titleLarge)},
            supportingContent = { Text(count.period.name, style = MaterialTheme.typography.labelSmall)},
            trailingContent = {
                Row{
                    Text(
                        count.count.toString(),
                        style = MaterialTheme.typography.headlineMedium
                    )
                    if (count.target != null) {
                        Text(
                            " /${count.target}",
                            color = MaterialTheme.colorScheme.primary,
                            style = MaterialTheme.typography.titleMedium
                        )
                    }
                }
            }
        )
    }

}