package com.instabug.library.util;

import android.content.Context;
import android.media.AudioManager;
import androidx.core.content.C0841b;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.util.d */
/* compiled from: MicUtils */
public class C10023d {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26670a;

    /* renamed from: a */
    public static void m46635a(Context context) {
        boolean[] b = m46638b();
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        b[1] = true;
        audioManager.setMode(0);
        b[2] = true;
        if (audioManager.isMicrophoneMute()) {
            b[3] = true;
        } else {
            b[4] = true;
            audioManager.setMicrophoneMute(true);
            b[5] = true;
        }
        b[6] = true;
    }

    /* renamed from: b */
    public static void m46637b(Context context) {
        boolean[] b = m46638b();
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        b[7] = true;
        audioManager.setMode(0);
        b[8] = true;
        if (!audioManager.isMicrophoneMute()) {
            b[9] = true;
        } else {
            b[10] = true;
            audioManager.setMicrophoneMute(false);
            b[11] = true;
        }
        b[12] = true;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m46638b() {
        boolean[] zArr = f26670a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(2763020187427565939L, "com/instabug/library/util/MicUtils", 19);
        f26670a = a;
        return a;
    }

    /* renamed from: a */
    public static boolean m46636a() {
        boolean z;
        boolean[] b = m46638b();
        if (C0841b.m4916a((Context) InstabugInternalTrackingDelegate.getInstance().getCurrentActivity(), "android.permission.RECORD_AUDIO") == 0) {
            b[16] = true;
            z = true;
        } else {
            z = false;
            b[17] = true;
        }
        b[18] = true;
        return z;
    }
}
