package com.airbnb.lottie;

import androidx.annotation.C0195i0;
import androidx.annotation.C0224v0;
import java.util.HashMap;
import java.util.Map;

public class TextDelegate {
    @C0195i0
    private final LottieAnimationView animationView;
    private boolean cacheText;
    @C0195i0
    private final LottieDrawable drawable;
    private final Map<String, String> stringMap;

    @C0224v0
    TextDelegate() {
        this.stringMap = new HashMap();
        this.cacheText = true;
        this.animationView = null;
        this.drawable = null;
    }

    private String getText(String str) {
        return str;
    }

    private void invalidate() {
        LottieAnimationView lottieAnimationView = this.animationView;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        LottieDrawable lottieDrawable = this.drawable;
        if (lottieDrawable != null) {
            lottieDrawable.invalidateSelf();
        }
    }

    public final String getTextInternal(String str) {
        if (this.cacheText && this.stringMap.containsKey(str)) {
            return (String) this.stringMap.get(str);
        }
        String text = getText(str);
        if (this.cacheText) {
            this.stringMap.put(str, text);
        }
        return text;
    }

    public void invalidateAllText() {
        this.stringMap.clear();
        invalidate();
    }

    public void invalidateText(String str) {
        this.stringMap.remove(str);
        invalidate();
    }

    public void setCacheText(boolean z) {
        this.cacheText = z;
    }

    public void setText(String str, String str2) {
        this.stringMap.put(str, str2);
        invalidate();
    }

    public TextDelegate(LottieAnimationView lottieAnimationView) {
        this.stringMap = new HashMap();
        this.cacheText = true;
        this.animationView = lottieAnimationView;
        this.drawable = null;
    }

    public TextDelegate(LottieDrawable lottieDrawable) {
        this.stringMap = new HashMap();
        this.cacheText = true;
        this.drawable = lottieDrawable;
        this.animationView = null;
    }
}
