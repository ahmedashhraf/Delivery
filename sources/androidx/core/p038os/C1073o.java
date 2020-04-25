package androidx.core.p038os;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.UserManager;
import androidx.annotation.C0193h0;

/* renamed from: androidx.core.os.o */
/* compiled from: UserManagerCompat */
public class C1073o {
    private C1073o() {
    }

    /* renamed from: a */
    public static boolean m6200a(@C0193h0 Context context) {
        if (VERSION.SDK_INT >= 24) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
        return true;
    }
}
