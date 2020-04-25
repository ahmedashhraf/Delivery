package androidx.core.content;

import android.content.Intent;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;

/* renamed from: androidx.core.content.c */
/* compiled from: IntentCompat */
public final class C0844c {

    /* renamed from: a */
    public static final String f3986a = "android.intent.extra.HTML_TEXT";

    /* renamed from: b */
    public static final String f3987b = "android.intent.extra.START_PLAYBACK";

    /* renamed from: c */
    public static final String f3988c = "android.intent.category.LEANBACK_LAUNCHER";

    private C0844c() {
    }

    @C0193h0
    /* renamed from: a */
    public static Intent m4935a(@C0193h0 String str, @C0193h0 String str2) {
        if (VERSION.SDK_INT >= 15) {
            return Intent.makeMainSelectorActivity(str, str2);
        }
        Intent intent = new Intent(str);
        intent.addCategory(str2);
        return intent;
    }
}
