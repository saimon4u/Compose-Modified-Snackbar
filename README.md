[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)  [![](https://jitpack.io/v/saimon4u/Compose-Modified-Snackbar.svg)](https://jitpack.io/#saimon4u/Compose-Modified-Snackbar)

🎨 This is a custom snackbar library for jetpack compose that will help you to integrate and customize a snackbar as you want in your android application.

## 📚 Implementation
```kotlin dsl
// Add this to your settings.gradle file
repositories {  
  maven("https://jitpack.io")
}  

// Add this to your app-level build.gradle file
dependencies {  
 implementation("com.github.saimon4u:Compose-Modified-Snackbar:latest-version")
}  
```


## 🏅 How to use it?

### ComposeModifiedSnackbarSuccess ✔

```kotlin
  val state = rememberComposeModifiedSnackbarState()
  Box(
    modifier = Modifier.fillMaxSize(),
    contentAlignment = Alignment.Center
  ){
    Button(
      onClick = { state.showSnackbar("Snackbar") },
    ){
      Text(text = "Show Snackbar"
    }
  }
  ComposeModifiedSnackbarSuccess(
    state = state,
    position = ComposeModifiedSnackbarPosition.Bottom,
    duration = ComposeModifierSnackbarDuration.SHORT,
    withDismissAction = true
  )
```
<p align="center"> <img src="https://github.com/user-attachments/assets/dafc62dc-0342-4da8-8c68-168cfd9a17b3" width="250"/> </p>

### ComposeModifiedSnackbarError ❌
```kotlin
val state = rememberComposeModifiedSnackbarState()
  Box(
    modifier = Modifier.fillMaxSize(),
    contentAlignment = Alignment.Center
  ){
    Button(
      onClick = { state.showSnackbar("Snackbar") },
    ){
      Text(text = "Show Snackbar"
    }
  }
  ComposeModifiedSnackbar(
    state = state,
    position = ComposeModifiedSnackbarPosition.Bottom,
    duration = ComposeModifierSnackbarDuration.SHORT,
    
    withDismissAction = true
  )
```
<p align="center"> <img src="https://github.com/user-attachments/assets/57c14a56-0e56-4bb4-a36e-a4c9ad725200" width="250"/> </p>

### ComposeModifiedSnackbar 🎉
```kotlin
val state = rememberComposeModifiedSnackbarState()
  Box(
    modifier = Modifier.fillMaxSize(),
    contentAlignment = Alignment.Center
  ){
    Button(
      onClick = { state.showSnackbar("Snackbar") },
    ){
      Text(text = "Show Snackbar"
    }
  }
  ComposeModifiedSnackbar(
    state = state,
    position = ComposeModifiedSnackbarPosition.Bottom,
    duration = ComposeModifierSnackbarDuration.SHORT,
    containerColor = ComposeModifiedSnackbarColor.CustomColor(Color.Black),
    contentColor = ComposeModifiedSnackbarColor.TextWhite,
    icon = Icons.Default.Star,
    withDismissAction = true
  )
```

<p align="center"> <img src="https://github.com/user-attachments/assets/f763aec6-2b01-4758-a076-65a539645796" width="250"/> </p>

### Floating ComposeModifiedSnackbar 🎉
```kotlin
val state = rememberComposeModifiedSnackbarState()
  Box(
    modifier = Modifier.fillMaxSize(),
    contentAlignment = Alignment.Center
  ){
    Button(
      onClick = { state.showSnackbar("Snackbar") },
    ){
      Text(text = "Show Snackbar"
    }
  }
  ComposeModifiedSnackbar(
    state = state,
    position = ComposeModifiedSnackbarPosition.Float,
    duration = ComposeModifierSnackbarDuration.SHORT,
    containerColor = ComposeModifiedSnackbarColor.CustomColor(Color.Black),
    contentColor = ComposeModifiedSnackbarColor.TextWhite,
    icon = Icons.Default.Favourite,
    withDismissAction = true
  )
```
<p align="center"> <img src="https://github.com/user-attachments/assets/02341384-e368-4ada-9d93-c1ca690fbde6" width="250"/> </p>


# 🌍 Contribution 

Please feel free to contribute! 

If this will be your first contributon, you can check this [website.](https://opensource.guide/how-to-contribute/)


## 📝 License

Copyright © 2024 [Saimon Bhuiyan](https://github.com/saimon4u). <br />
This project is [MIT](https://github.com/saimon4u/Compose-Modified-Snackbar/blob/main/LICENSE) licensed.
