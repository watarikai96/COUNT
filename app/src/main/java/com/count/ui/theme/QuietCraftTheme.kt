package com.count.ui.theme

import androidx.compose.animation.core.Easing
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.*
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

//Theme Color Roles
object QCColors{

    // Base
    val background = Color(0xFFF9FAFB)        // subtle warm white
    val surface = Color(0xFFFFFFFF)           // pure white for cards, modals
    val onBackground = Color(0xFF212121)      // main text, high contrast
    val onSurface = Color(0xFF222333)         // secondary text

    // Primary Accent (Buttons, Highlights)
    val primary = Color(0xFF3B82F6)           // soft blue
    val onPrimary = Color(0xFFFFFFFF)         // text/icons on primary
    val accent = Color(0xFFFFA726)            // warm accent

    // State Colors
    val success = Color(0xFF2ECC40)           // green for success/completed
    val warning = Color(0xFFFFC107)           // yellow for warning
    val error = Color(0xFFD32F2F)             // red for errors

    // Disabled | Outline
    val disabled = Color(0xFFE0E0E0)          // for disabled buttons, fields
    val outline = Color(0xFFBDBDBD)           // outlines, borders

    //Grays (Dividers, Subtle Backgrounds)
    val gray50 = Color(0xFFFAFAFA)
    val gray100 = Color(0xFFF3F4F6)
    val gray200 = Color(0xFFE5E7EB)
    val gray300 = Color(0xFFD1D5DB)
    val gray400 = Color(0xFF9CA3AF)
    val gray500 = Color(0xFF6B7280)

    //Link | Info
    val info = Color(0xFF2196F3)
    val link = Color(0xFF1565C0)

    //Backdrop | Overlay
    val backdrop = Color(0x66000000)          // 40% black, for modals
}

// Color Palette Presets for User Choice (Tags etc)

object QCPresets{
    val colors = listOf(
        "Amber Glow" to Color(0xFFFFC107),
        "Coral Blush" to Color(0xFFFF6F61),
        "Terra Clay" to Color(0xFFD2691E),
        "Rose Dust" to Color(0xFFF48FB1),
        "Soft Peach" to Color(0xFFFFDAB9),
        "Sky Ice" to Color(0xFF81D4FA),
        "Oceanic" to Color(0xFF0288D1),
        "Teal Bloom" to Color(0xFF009688),
        "Frosted Lime" to Color(0xFFAED581),
        "Violet Dream" to Color(0xFF7C4DFF),
        "Midnight Purple" to Color(0xFF512DA8),
        "Lavender Fog" to Color(0xFFB39DDB),
        "Grape Fade" to Color(0xFF9575CD),
        "Orchid Pop" to Color(0xFFBA68C8),
        "Indigo Ink" to Color(0xFF3F51B5),
        "Denim" to Color(0xFF5C6BC0),
        "Sapphire Stone" to Color(0xFF1976D2),
        "Night Sky" to Color(0xFF283593),
        "Arctic Mist" to Color(0xFFE3F2FD),
        "Fresh Meadow" to Color(0xFF66BB6A),
        "Spruce Blue" to Color(0xFF33691E),
        "Forest Walk" to Color(0xFF388E3C),
        "Aloe Dew" to Color(0xFFC8E6C9),
        "Pale Sage" to Color(0xFFDCEDC8),
        "Graphite Gray" to Color(0xFF424242),
        "Ash Mist" to Color(0xFFBDBDBD),
        "Cream Paper" to Color(0xFFFFF8E1),
        "Dust White" to Color(0xFFF5F5F5),
        "Jet Black" to Color(0xFF212121),
        "Ink Blue" to Color(0xFF263238),
        "Neon Orange" to Color(0xFFFF5722),
        "Cyber Lime" to Color(0xFFCDDC39),
        "Pale Goldenrod" to Color(0xFFEEE8AA),
        "Medium Aquamarine" to Color(0xFF66CDAA),
        "Sky Blue" to Color(0xFF87CEEB),
        "Deep Sky Blue" to Color(0xFF00BFFF),
        "Plum" to Color(0xFFDDA0DD),
        "Mint Cream" to Color(0xFFF5FFFA),
        "Light Coral" to Color(0xFFF08080),
        "Gold" to Color(0xFFFFD700),
        "Silver" to Color(0xFFC0C0C0),
        "Light Sky Blue" to Color(0xFF87CEFA),
        "Honeydew" to Color(0xFFF0FFF0),
        "Aqua" to Color(0xFF00FFFF),
        "Dark Goldenrod" to Color(0xFFB8860B),
        "Crimson" to Color(0xFFDC143C),
        "Lemon Chiffon" to Color(0xFFFFFACD),
        "Coral" to Color(0xFFFF7F50),
        "Aquamarine" to Color(0xFF7FFFD4),
        "Goldenrod" to Color(0xFFDAA520),
        "Rose Quartz" to Color(0xFFF7CAC9),
        "Moonlight Lilac" to Color(0xFFE0BBE4),
        "Light Goldenrod Yellow" to Color(0xFFFAFAD2),
        "Azure" to Color(0xFFF0FFFF),
        "Teal" to Color(0xFF008080),
        "Misty Rose" to Color(0xFFFFE4E1)
    )

    //Helpers (Need Clarification)

    fun getByName(name: String): Color? =
        colors.firstOrNull{it.first == name}?.second

    fun allNames(): List<String> = colors.map{it.first}

    fun random(): Pair<String, Color> = colors.random()

}



// Typography

object QCTypography{
    //Headlines
    val headlineLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp,
        lineHeight = 36.sp,
        letterSpacing = 0.0.sp
    )

    val headlineMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.0.sp
    )

    //Title (cards, dialogs, screens)
    val titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.0.sp
    )

    val titleMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 22.sp,
        letterSpacing = 0.0.sp
    )

    //Body
    val bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 22.sp
    )

    val body = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp
    )

    val bodySmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp
    )

    //Labels
    val labelLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 18.sp
    )

    val labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 10.sp,
        lineHeight = 14.sp
    )

}


// Icons
object QCIcons {
    object QCIcons {
        //        val Timeline: ImageVector = Icons.Filled.
        val Calendar: ImageVector = Icons.Filled.DateRange
        //        val Analytics: ImageVector = Icons.Default.
        val Add: ImageVector = Icons.Filled.Add
        val Settings: ImageVector = Icons.Filled.Settings
        val Edit: ImageVector = Icons.Filled.Edit
        val Play: ImageVector = Icons.Filled.PlayArrow
        //        val Pause: ImageVector = Icons.Filled.Pause
        val Done: ImageVector = Icons.Filled.CheckCircle
        val Delete: ImageVector = Icons.Filled.Delete
    }

}

// Spacing & Radii

object QCSpacing {
    val xs = 4.dp
    val s = 8.dp
    val m = 16.dp
    val l = 24.dp
    val xl = 32.dp
    // For extra-wide screens or modals
    val xxl = 48.dp

    // For rounded corners
    val radius = 14.dp // main card/button radius
    val radiusXL = 22.dp // for modals, dialogs
}


// Animation

object QCAnimations {
    val fast = 100      // ms, e.g. for quick feedback (ripple, button)
    val normal = 250    // ms, e.g. for screen fade, dialogs
    val slow = 400      // ms, for modals or “deliberate” motion

    // Easing (how the animation accelerates/decelerates)
    val standardEasing: Easing = FastOutSlowInEasing
}


// Main Theme Wrapper

@Composable
fun QuietCraftTheme(content: @Composable () -> Unit){

    MaterialTheme(
        colorScheme = lightColorScheme(
            primary = QCColors.primary,
            onPrimary = QCColors.onPrimary,
            background = QCColors.background,
            onBackground = QCColors.onBackground,
            surface = QCColors.surface,
            onSurface = QCColors.onSurface,
            error = QCColors.error,
            // add others as needed!
        ),
        typography = Typography(
            headlineLarge = QCTypography.headlineLarge,
            headlineMedium = QCTypography.headlineMedium,
            titleLarge = QCTypography.titleLarge,
            titleMedium = QCTypography.titleMedium,
            bodyLarge = QCTypography.bodyLarge,
            bodyMedium = QCTypography.body,
            bodySmall = QCTypography.bodySmall,
            labelLarge = QCTypography.labelLarge,
            labelSmall = QCTypography.labelSmall
        ),
        // shapes, etc. can be added if you want
        content = content
    )
}


