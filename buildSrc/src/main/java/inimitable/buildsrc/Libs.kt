package inimitable.buildsrc

object Libs {
    const val CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"
    const val LIFECYCLE = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE}"
    const val ACTIVITY_COMPOSE = "androidx.activity:activity-compose:${Versions.ACTIVITY_COMPOSE}"
    const val COMPOSE_BOM = "androidx.compose:compose-bom:${Versions.COMPOSE_BOM}"
    const val COMPOSE_UI = "androidx.compose.ui:ui"
    const val COMPOSE_UI_GRAPHICS = "androidx.compose.ui:ui-graphics"
    const val COMPOSE_UI_TOOLING_PREVIEW = "androidx.compose.ui:ui-tooling-preview"
    const val COMPOSE_UI_TOOLING = "androidx.compose.ui:ui-tooling"
    const val MATERIAL_3 = "androidx.compose.material3:material3"
    const val COMPOSE_UI_TEST_MANIFEST = "androidx.compose.ui:ui-test-manifest"
}

internal object Versions {
    const val CORE_KTX = "1.10.1"
    const val LIFECYCLE = "2.6.1"
    const val ACTIVITY_COMPOSE = "1.7.0"
    const val COMPOSE_BOM = "2023.08.00"
}