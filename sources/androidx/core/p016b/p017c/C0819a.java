package androidx.core.p016b.p017c;

import android.database.sqlite.SQLiteCursor;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;

/* renamed from: androidx.core.b.c.a */
/* compiled from: SQLiteCursorCompat */
public final class C0819a {
    private C0819a() {
    }

    /* renamed from: a */
    public static void m4780a(@C0193h0 SQLiteCursor sQLiteCursor, boolean z) {
        if (VERSION.SDK_INT >= 28) {
            sQLiteCursor.setFillWindowForwardOnly(z);
        }
    }
}
