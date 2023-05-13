

package com.example.compose.jetchat

import androidx.compose.ui.test.junit4.ComposeTestRule
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.printToLog


fun ComposeTestRule.dumpSemanticNodes() {
    this.onRoot().printToLog(tag = "JetchatLog")
}
