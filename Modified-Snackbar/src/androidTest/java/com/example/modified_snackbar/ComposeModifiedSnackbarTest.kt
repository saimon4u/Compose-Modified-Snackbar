package com.example.modified_snackbar

import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.modified_snackbar.presentation.ComposeModifiedSnackbar
import com.example.modified_snackbar.presentation.rememberComposeModifiedSnackbarState
import com.example.modified_snackbar.util.ComposeModifiedSnackbarState
import com.example.modified_snackbar.util.TestTag
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ComposeModifiedSnackbarTest {

    @get:Rule
    val testRule = createComposeRule()

    private lateinit var state: ComposeModifiedSnackbarState

    @Test
    fun assert_SnackbarIsNotExist(){
        testRule.setContent {
            state = rememberComposeModifiedSnackbarState()
            ComposeModifiedSnackbar(state = state)
        }
        testRule.onNodeWithTag(TestTag.SNACKBAR).assertDoesNotExist()
    }

    @Test
    fun showSnackbar_Assert_SnackbarIsVisible_And_CorrectMessageIsDisplayed_And_DismissActionIsNotPresent(){
        testRule.setContent {
            state = rememberComposeModifiedSnackbarState()
            ComposeModifiedSnackbar(state = state)
        }
        state.showSnackbar("Test Snackbar")
        testRule.onNodeWithTag(TestTag.SNACKBAR).assertExists()
        testRule.onNodeWithTag(TestTag.SNACKBAR_MESSAGE).assertTextEquals("Test Snackbar")
        testRule.onNodeWithTag(TestTag.SNACKBAR_DISMISS).assertDoesNotExist()
    }

    @Test
    fun showSnackbar_Assert_DismissActionActuallyDismissTheSnackbar(){
        testRule.setContent {
            state = rememberComposeModifiedSnackbarState()
            ComposeModifiedSnackbar(state = state, withDismissAction = true)
        }
        state.showSnackbar("Test Snackbar")
        testRule.onNodeWithTag(TestTag.SNACKBAR).assertExists()
        testRule.onNodeWithTag(TestTag.SNACKBAR_DISMISS).performClick()
        testRule.onNodeWithTag(TestTag.SNACKBAR).assertDoesNotExist()
    }
}