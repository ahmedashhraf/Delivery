package androidx.browser.browseractions;

import android.app.PendingIntent;
import androidx.annotation.C0193h0;
import androidx.annotation.C0213q;

/* renamed from: androidx.browser.browseractions.a */
/* compiled from: BrowserActionItem */
public class C0608a {

    /* renamed from: a */
    private final String f2403a;

    /* renamed from: b */
    private final PendingIntent f2404b;
    @C0213q

    /* renamed from: c */
    private final int f2405c;

    public C0608a(@C0193h0 String str, @C0193h0 PendingIntent pendingIntent, @C0213q int i) {
        this.f2403a = str;
        this.f2404b = pendingIntent;
        this.f2405c = i;
    }

    /* renamed from: a */
    public PendingIntent mo3084a() {
        return this.f2404b;
    }

    /* renamed from: b */
    public int mo3085b() {
        return this.f2405c;
    }

    /* renamed from: c */
    public String mo3086c() {
        return this.f2403a;
    }

    public C0608a(@C0193h0 String str, @C0193h0 PendingIntent pendingIntent) {
        this(str, pendingIntent, 0);
    }
}
