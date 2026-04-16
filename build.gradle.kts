plugins { 
    id("com.android.application") 
}

android { 
    compileSdk = 33

    defaultConfig { 
        applicationId = "com.example.app" 
        minSdk = 21 
        targetSdk = 33 
        versionCode = 1 
        versionName = "1.0" 
    }

    buildTypes { 
        release { 
            isMinifyEnabled = false 
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}
