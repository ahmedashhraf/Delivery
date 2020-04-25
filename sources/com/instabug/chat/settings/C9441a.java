package com.instabug.chat.settings;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.C0213q;
import com.instabug.library.OnSdkDismissCallback;
import com.instabug.library.OnSdkDismissedCallback;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.chat.settings.a */
/* compiled from: ChatSettings */
public class C9441a {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f25008a;

    /* renamed from: a */
    public static void m44184a(Context context) {
        boolean[] p = m44213p();
        C9442b.m44214g();
        p[1] = true;
        C9443c.m44229a(m44191b(context));
        p[2] = true;
    }

    /* renamed from: b */
    private static SharedPreferences m44191b(Context context) {
        boolean[] p = m44213p();
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.instabug.chat", 0);
        p[3] = true;
        return sharedPreferences;
    }

    /* renamed from: c */
    public static boolean m44197c() {
        boolean z;
        boolean[] p = m44213p();
        AttachmentTypesState b = m44192b();
        p[12] = true;
        if (b.isScreenshotEnabled()) {
            p[13] = true;
        } else {
            p[14] = true;
            if (b.isImageFromGalleryEnabled()) {
                p[15] = true;
            } else {
                p[16] = true;
                if (b.isScreenRecordingEnabled()) {
                    p[17] = true;
                } else {
                    z = false;
                    p[19] = true;
                    p[20] = true;
                    return z;
                }
            }
        }
        p[18] = true;
        z = true;
        p[20] = true;
        return z;
    }

    /* renamed from: d */
    public static long m44198d() {
        boolean[] p = m44213p();
        long a = C9443c.m44230i().mo34023a();
        p[21] = true;
        return a;
    }

    /* renamed from: e */
    public static long m44200e() {
        boolean[] p = m44213p();
        long b = C9443c.m44230i().mo34028b();
        p[23] = true;
        return b;
    }

    /* renamed from: f */
    public static boolean m44203f() {
        boolean[] p = m44213p();
        boolean f = C9443c.m44230i().mo34037f();
        p[25] = true;
        return f;
    }

    /* renamed from: g */
    public static boolean m44204g() {
        boolean[] p = m44213p();
        boolean c = C9443c.m44230i().mo34032c();
        p[27] = true;
        return c;
    }

    /* renamed from: h */
    public static boolean m44205h() {
        boolean[] p = m44213p();
        boolean d = C9443c.m44230i().mo34034d();
        p[29] = true;
        return d;
    }

    @C0213q
    /* renamed from: i */
    public static int m44206i() {
        boolean[] p = m44213p();
        int e = C9443c.m44230i().mo34035e();
        p[33] = true;
        return e;
    }

    /* renamed from: j */
    public static boolean m44207j() {
        boolean[] p = m44213p();
        boolean c = C9442b.m44215h().mo34019c();
        p[35] = true;
        return c;
    }

    @Deprecated
    /* renamed from: k */
    public static OnSdkDismissedCallback m44208k() {
        boolean[] p = m44213p();
        OnSdkDismissedCallback d = C9442b.m44215h().mo34020d();
        p[38] = true;
        return d;
    }

    /* renamed from: l */
    public static OnSdkDismissCallback m44209l() {
        boolean[] p = m44213p();
        OnSdkDismissCallback f = C9442b.m44215h().mo34022f();
        p[40] = true;
        return f;
    }

    /* renamed from: m */
    public static String m44210m() {
        boolean[] p = m44213p();
        String g = C9443c.m44230i().mo34038g();
        p[43] = true;
        return g;
    }

    /* renamed from: n */
    public static boolean m44211n() {
        boolean[] p = m44213p();
        boolean h = C9443c.m44230i().mo34039h();
        p[45] = true;
        return h;
    }

    /* renamed from: o */
    public static String m44212o() {
        boolean[] p = m44213p();
        String e = C9442b.m44215h().mo34021e();
        p[47] = true;
        return e;
    }

    /* renamed from: p */
    private static /* synthetic */ boolean[] m44213p() {
        boolean[] zArr = f25008a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(8786289063927319002L, "com/instabug/chat/settings/ChatSettings", 48);
        f25008a = a;
        return a;
    }

    /* renamed from: b */
    public static AttachmentTypesState m44192b() {
        boolean[] p = m44213p();
        AttachmentTypesState b = C9442b.m44215h().mo34018b();
        p[10] = true;
        return b;
    }

    /* renamed from: d */
    public static void m44199d(boolean z) {
        boolean[] p = m44213p();
        C9443c.m44230i().mo34027a(z);
        p[32] = true;
    }

    /* renamed from: e */
    public static void m44201e(boolean z) {
        boolean[] p = m44213p();
        C9442b h = C9442b.m44215h();
        p[36] = true;
        h.mo34017a(z);
        p[37] = true;
    }

    /* renamed from: f */
    public static void m44202f(boolean z) {
        boolean[] p = m44213p();
        C9443c.m44230i().mo34036e(z);
        p[44] = true;
    }

    /* renamed from: b */
    public static void m44193b(long j) {
        boolean[] p = m44213p();
        C9443c.m44230i().mo34029b(j);
        p[24] = true;
    }

    /* renamed from: a */
    public static Runnable m44181a() {
        boolean[] p = m44213p();
        Runnable a = C9442b.m44215h().mo34012a();
        p[4] = true;
        return a;
    }

    /* renamed from: a */
    public static void m44188a(Runnable runnable) {
        boolean[] p = m44213p();
        C9442b.m44215h().mo34015a(runnable);
        p[5] = true;
    }

    /* renamed from: b */
    public static void m44195b(boolean z) {
        boolean[] p = m44213p();
        C9443c.m44230i().mo34030b(z);
        p[28] = true;
    }

    /* renamed from: c */
    public static void m44196c(boolean z) {
        boolean[] p = m44213p();
        C9443c.m44230i().mo34031c(z);
        p[30] = true;
    }

    /* renamed from: a */
    public static void m44185a(AttachmentTypesState attachmentTypesState) {
        boolean[] p = m44213p();
        C9442b.m44215h().mo34011a(attachmentTypesState);
        p[11] = true;
    }

    /* renamed from: b */
    public static void m44194b(String str) {
        boolean[] p = m44213p();
        C9442b.m44215h().mo34016a(str);
        p[46] = true;
    }

    /* renamed from: a */
    public static void m44183a(long j) {
        boolean[] p = m44213p();
        C9443c.m44230i().mo34025a(j);
        p[22] = true;
    }

    /* renamed from: a */
    public static void m44190a(boolean z) {
        boolean[] p = m44213p();
        C9443c.m44230i().mo34033d(z);
        p[26] = true;
    }

    /* renamed from: a */
    public static void m44182a(@C0213q int i) {
        boolean[] p = m44213p();
        C9443c.m44230i().mo34024a(i);
        p[34] = true;
    }

    @Deprecated
    /* renamed from: a */
    public static void m44187a(OnSdkDismissedCallback onSdkDismissedCallback) {
        boolean[] p = m44213p();
        C9442b.m44215h().mo34014a(onSdkDismissedCallback);
        p[39] = true;
    }

    /* renamed from: a */
    public static void m44186a(OnSdkDismissCallback onSdkDismissCallback) {
        boolean[] p = m44213p();
        C9442b.m44215h().mo34013a(onSdkDismissCallback);
        p[41] = true;
    }

    /* renamed from: a */
    public static void m44189a(String str) {
        boolean[] p = m44213p();
        C9443c.m44230i().mo34026a(str);
        p[42] = true;
    }
}
