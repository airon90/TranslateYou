package com.bnyro.translate.api.lt

import com.bnyro.translate.const.ApiKeyState
import com.bnyro.translate.util.TranslationEngine

class LTEngine : TranslationEngine(
    name = "LibreTranslate",
    defaultUrl = "https://libretranslate.de",
    urlModifiable = true,
    apiKeyState = ApiKeyState.OPTIONAL
) {
    override fun create(): TranslationEngine = apply {
        apiHelper = LTHelper()
    }
}
