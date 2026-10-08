plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "eu.kanade.tachiyomi.animeextension.en.pimpbunny"
    compileSdk = 34

    defaultConfig {
        applicationId = "eu.kanade.tachiyomi.animeextension.en.pimpbunny"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        // Must be "<extensions-lib version>.<n>" -> lib 14 => 14.1
        versionName = "14.1"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("debug")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

// Everything is provided by the Aniyomi app at runtime -> compileOnly
dependencies {
    compileOnly("com.github.aniyomiorg:extensions-lib:14")
    compileOnly("org.jetbrains.kotlin:kotlin-stdlib:1.9.22")
    compileOnly("com.squareup.okhttp3:okhttp:5.0.0-alpha.11")
    compileOnly("org.jsoup:jsoup:1.15.1")
    compileOnly("io.reactivex:rxjava:1.3.8")
}
