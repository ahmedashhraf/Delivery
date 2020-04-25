package androidx.core.p038os;

import android.os.Build.VERSION;
import android.os.Environment;
import androidx.annotation.C0193h0;
import java.io.File;
import java.io.IOException;

/* renamed from: androidx.core.os.d */
/* compiled from: EnvironmentCompat */
public final class C1061d {

    /* renamed from: a */
    private static final String f4728a = "EnvironmentCompat";

    /* renamed from: b */
    public static final String f4729b = "unknown";

    private C1061d() {
    }

    /* renamed from: a */
    public static String m6155a(@C0193h0 File file) {
        if (VERSION.SDK_INT >= 19) {
            return Environment.getStorageState(file);
        }
        try {
            if (file.getCanonicalPath().startsWith(Environment.getExternalStorageDirectory().getCanonicalPath())) {
                return Environment.getExternalStorageState();
            }
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to resolve canonical path: ");
            sb.append(e);
            sb.toString();
        }
        return "unknown";
    }
}
