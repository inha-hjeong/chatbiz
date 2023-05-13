

package com.example.compose.jetchat.data

import com.example.compose.jetchat.R
import com.example.compose.jetchat.conversation.ConversationUiState
import com.example.compose.jetchat.conversation.Message
import com.example.compose.jetchat.profile.ProfileScreenState

private val initialMessages = listOf(
    Message(
        "me",
        "Thank you for your positive feedback! @Komiljon",
        "12:12 PM"
    ),
    Message(
        "me",
        "This is the project we worked on",
        "12:11 PM"
    ),
    Message(
        "Komiljon",
        "Thank you for adding me to the chat",
        "12:10 PM"
    ),
    Message(
        "Komiljon",
        "@Shohruh This app looks cool!",
        "12:09 PM"
    ),
    Message(
        "Komiljon",
        "Hello everyone",
        "12:08 PM"
    ),
    Message(
        "me",
        "Welcome to the Mobile Programming chat.",
        "12:07 PM"
    )
)

val exampleUiState = ConversationUiState(
    initialMessages = initialMessages,
    channelName = "#Android",
    channelMembers = 3
)

/**
 * Example colleague profile
 */
val colleagueProfile = ProfileScreenState(
    userId = "12345",
    photo = R.drawable.komiljon,
    name = "Yangiboev Komiljon",
    status = "Away",
    displayName = "Komiljon",
    position = "Platform Engineer",
    twitter = "twitter.com/komiljon",
    timeZone = "12:25 AM (Pacific Daylight Time)",
    commonChannels = "2"
)
val colleagueProfile2 = ProfileScreenState(
    userId = "123456",
    photo = R.drawable.komiljon,
    name = "Mirzaakbarov Javokhirbek",
    status = "Away",
    displayName = "Javokhir",
    position = "Software Engineer",
    twitter = "twitter.com/Javokhir",
    timeZone = "12:25 AM (Pacific Daylight Time)",
    commonChannels = "2"
)
/**
 * Example "me" profile.
 */
val meProfile = ProfileScreenState(
    userId = "me",
    photo = R.drawable.shohruh,
    name = "Shohruhmirzo Gulomov",
    status = "Online",
    displayName = "Shohruh",
    position = "Systems Engineer",
    twitter = "twitter.com/shohruh",
    timeZone = "In your timezone",
    commonChannels = null
)

object EMOJIS {
    // EMOJI 15
    const val EMOJI_PINK_HEART = "\uD83E\uDE77"

    // EMOJI 14 🫠
    const val EMOJI_MELTING = "\uD83E\uDEE0"

    // ANDROID 13.1 😶‍🌫️
    const val EMOJI_CLOUDS = "\uD83D\uDE36\u200D\uD83C\uDF2B️"

    // ANDROID 12.0 🦩
    const val EMOJI_FLAMINGO = "\uD83E\uDDA9"

    // ANDROID 12.0  👉
    const val EMOJI_POINTS = " \uD83D\uDC49"
}
