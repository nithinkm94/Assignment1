import Versions.dagger_version
import Versions.okhttp_interceptor
import Versions.retrofit_version
import Versions.rxjava2_android_version
import Versions.rxjava2_version


object Versions {
    val kotlin = "1.1.51"
    val gradle = "3.0.1";
    val retrofit_version = "2.2.0"
    val dagger_version = "2.10-rc2"
    val rxjava2_version = "2.1.1"
    val rxjava2_android_version = "2.0.1"
    val okhttp_interceptor = "3.8.0"
    val picasso = "2.5.2"
    val support = "27.0.1"
    val circle_indicator = "1.2.2"
    val play_service = "11.6.2"
    val zxing_core = "3.2.1"
    val zxing_android = "3.2.0"
    val constraint_layout = "1.0.2"
    val junit = "4.12"
    val test_runner = "1.0.1"
    val espresso = "3.0.1"
}

object Deps {
    val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jre7:${Versions.kotlin}"
    val android_gradle_plugin = "com.android.tools.build:gradle:${Versions.gradle}"
    val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    val dagger_lib = "com.google.dagger:dagger:${Versions.dagger_version}"
    val dagger_compiler_lib = "com.google.dagger:dagger-compiler:${Versions.dagger_version}"
    val rx_java_2_lib = "io.reactivex.rxjava2:rxjava:${Versions.rxjava2_version}"
    val rx_android_2_lib = "io.reactivex.rxjava2:rxandroid:${Versions.rxjava2_android_version}"
    val retrofit_lib = "com.squareup.retrofit2:retrofit:${Versions.retrofit_version}"
    val retrofit_rxjava_lib = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit_version}"
    val retrofit_gson_lib = "com.squareup.retrofit2:converter-gson:${Versions.retrofit_version}"
    val okhttp_interceptor_lib = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp_interceptor}"
    val picasso_lib = "com.squareup.picasso:picasso:${Versions.picasso}"
    val cardview_support_lib = "com.android.support:cardview-v7:${Versions.support}"
    val grid_support_lib = "com.android.support:gridlayout-v7:${Versions.support}"
    val circle_indicator_lib = "me.relex:circleindicator:${Versions.circle_indicator}@aar"
    val play_service_lib = "com.google.android.gms:play-services:${Versions.play_service}"
    val zxing_core_lib = "com.google.zxing:core:${Versions.zxing_core}"
    val zxing_android_lib = "com.journeyapps:zxing-android-embedded:${Versions.zxing_android}@aar"
    val appcompat_support_v7_lib = "com.android.support:appcompat-v7:${Versions.support}"
    val support_design_lib = "com.android.support:design:${Versions.support}"
    val constraint_layout_lib = "com.android.support.constraint:constraint-layout:${Versions.constraint_layout}"
    val support_vector_drawable_lib = "com.android.support:support-vector-drawable:${Versions.support}"
    val junit_lib = "junit:junit:${Versions.junit}"
    val support_test_runner_lib = "com.android.support.test:runner:${Versions.test_runner}"
    val espresso_lib = "com.android.support.test.espresso:espresso-core:${Versions.espresso}"
}