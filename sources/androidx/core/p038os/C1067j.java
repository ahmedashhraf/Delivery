package androidx.core.p038os;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.Message;
import androidx.annotation.C0193h0;

/* renamed from: androidx.core.os.j */
/* compiled from: MessageCompat */
public final class C1067j {

    /* renamed from: a */
    private static boolean f4740a = true;

    /* renamed from: b */
    private static boolean f4741b = true;

    private C1067j() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m6193a(@C0193h0 Message message, boolean z) {
        int i = VERSION.SDK_INT;
        if (i >= 22) {
            message.setAsynchronous(z);
            return;
        }
        if (f4740a && i >= 16) {
            try {
                message.setAsynchronous(z);
            } catch (NoSuchMethodError unused) {
                f4740a = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static boolean m6194a(@C0193h0 Message message) {
        int i = VERSION.SDK_INT;
        if (i >= 22) {
            return message.isAsynchronous();
        }
        if (f4741b && i >= 16) {
            try {
                return message.isAsynchronous();
            } catch (NoSuchMethodError unused) {
                f4741b = false;
            }
        }
        return false;
    }
}
