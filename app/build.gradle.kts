import inimitable.buildsrc.Config
import inimitable.buildsrc.Libs

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = Config.APPLICATION_ID
    compileSdk = Config.COMPILE_SDK

    defaultConfig {
        applicationId = Config.APPLICATION_ID
        minSdk = Config.MIN_SDK
        targetSdk = Config.TARGET_SDK
        versionCode = Config.VERSION_CODE
        versionName = Config.VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Libs.CORE_KTX)
    implementation(Libs.LIFECYCLE)

    implementation(Libs.MATERIAL_3)

    implementation(Libs.ACTIVITY_COMPOSE)
    implementation(platform(Libs.COMPOSE_BOM))
    androidTestImplementation(platform(Libs.COMPOSE_BOM))
    implementation(Libs.COMPOSE_UI)
    implementation(Libs.COMPOSE_UI_GRAPHICS)
    implementation(Libs.COMPOSE_UI_TOOLING_PREVIEW)
    debugImplementation(Libs.COMPOSE_UI_TOOLING)
    debugImplementation(Libs.COMPOSE_UI_TEST_MANIFEST)
}