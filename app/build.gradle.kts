plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("com.google.gms.google-services")
    id("com.google.firebase.crashlytics")
    id("kotlin-kapt")
    id("kotlin-parcelize")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.gity.myzarqa"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.gity.myzarqa"
        minSdk = 28
        //noinspection EditedTargetSdkVersion
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    // Firebase
    // Import the Firebase BoM
    implementation(platform("com.google.firebase:firebase-bom:33.12.0"))

    // TODO: Add the dependencies for Firebase products you want to use
    // When using the BoM, don't specify versions in Firebase dependencies
    implementation("com.google.firebase:firebase-analytics")

    // Add the dependencies for any other desired Firebase products
    // https://firebase.google.com/docs/android/setup#available-libraries

    // Glide
    //noinspection UseTomlInstead
    implementation("com.github.bumptech.glide:glide:4.16.0")

    // Image Auto Slider
    //noinspection UseTomlInstead
    implementation("com.github.denzcoskun:ImageSlideshow:0.1.2")

    // Circle Image
    //noinspection UseTomlInstead
    implementation("de.hdodenhof:circleimageview:3.1.0")

    // Cloudinary
    //noinspection UseTomlInstead
    implementation ("com.cloudinary:cloudinary-android:2.3.1")

    //  Chip Navigation Bar
    //noinspection UseTomlInstead
    implementation("com.github.ismaeldivita:chip-navigation-bar:1.4.0")

    // Paging 3
    //noinspection UseTomlInstead
    implementation("androidx.paging:paging-runtime-ktx:3.3.6")

    // Coil untuk loading gambar
    //noinspection UseTomlInstead
    implementation("io.coil-kt:coil:2.5.0")
    //noinspection UseTomlInstead
    implementation("io.coil-kt.coil3:coil-compose:3.0.4")
    //noinspection UseTomlInstead
    implementation("io.coil-kt.coil3:coil-network-okhttp:3.0.4")

    // Dagger hilt
    //noinspection UseTomlInstead
   implementation("com.google.dagger:hilt-android:2.51.1")
    //noinspection UseTomlInstead
    kapt("com.google.dagger:hilt-android-compiler:2.51.1")

    implementation("com.google.firebase:firebase-auth")
    implementation("com.google.firebase:firebase-firestore")
    implementation("com.google.firebase:firebase-perf")
    implementation("com.google.firebase:firebase-crashlytics")
    implementation("com.google.firebase:firebase-analytics")

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}

// Allow references to generated code
kapt {
    correctErrorTypes = true
}