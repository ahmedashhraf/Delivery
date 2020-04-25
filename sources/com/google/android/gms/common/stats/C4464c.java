package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager.WakeLock;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.annotation.C4056a;
import java.util.List;

@C4056a
/* renamed from: com.google.android.gms.common.stats.c */
public class C4464c {
    @C4056a
    /* renamed from: a */
    public static String m19280a(Context context, Intent intent) {
        return String.valueOf(((long) System.identityHashCode(intent)) | (((long) System.identityHashCode(context)) << 32));
    }

    @C4056a
    /* renamed from: a */
    public static String m19281a(WakeLock wakeLock, String str) {
        String valueOf = String.valueOf(String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(wakeLock))));
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    @C0195i0
    /* renamed from: a */
    static List<String> m19283a(@C0195i0 List<String> list) {
        if (list == null || list.size() != 1) {
            return list;
        }
        if ("com.google.android.gms".equals(list.get(0))) {
            return null;
        }
        return list;
    }

    @C0195i0
    /* renamed from: a */
    static String m19282a(String str) {
        if ("com.google.android.gms".equals(str)) {
            return null;
        }
        return str;
    }
}
