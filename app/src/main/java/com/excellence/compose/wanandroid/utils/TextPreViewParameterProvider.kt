package com.excellence.compose.wanandroid.utils

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

/**
 * <pre>
 *     author : VeiZhang
 *     blog   : http://tiimor.cn
 *     time   : 2023/3/4
 *     desc   :
 * </pre>
 */
class TextPreViewParameterProvider : PreviewParameterProvider<String> {

    override val values: Sequence<String>
        get() = sequenceOf(
            "Android",
            "Nexus",
            "Pixel"
        )
}