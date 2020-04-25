package com.mrsool.customeview.TwitterVideoView;

import java.util.Locale;

/* renamed from: com.mrsool.customeview.TwitterVideoView.b */
/* compiled from: MediaTimeUtils */
final class C10723b {

    /* renamed from: a */
    private static final String f29409a = "%1$d:%2$02d:%3$02d";

    /* renamed from: b */
    private static final String f29410b = "%1$d:%2$02d";

    private C10723b() {
    }

    /* renamed from: a */
    static String m49376a(long j) {
        int i = (int) (j / 1000);
        int i2 = i % 60;
        int i3 = (i / 60) % 60;
        int i4 = i / 3600;
        if (i4 > 0) {
            return String.format(Locale.getDefault(), f29409a, new Object[]{Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(i2)});
        }
        return String.format(Locale.getDefault(), f29410b, new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)});
    }
}
