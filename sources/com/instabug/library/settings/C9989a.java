package com.instabug.library.settings;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import androidx.annotation.C0198k;
import com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher;
import com.instabug.library.InstabugCustomTextPlaceHolder;
import com.instabug.library.OnSdkDismissedCallback;
import com.instabug.library.OnSdkInvokedCallback;
import com.instabug.library.invocation.OnInvokeCallback;
import com.instabug.library.model.Report.OnReportCreatedListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.settings.a */
/* compiled from: PerSessionSettings */
public class C9989a {

    /* renamed from: w */
    private static C9989a f26560w;

    /* renamed from: x */
    private static transient /* synthetic */ boolean[] f26561x;

    /* renamed from: a */
    private Locale f26562a = null;

    /* renamed from: b */
    private ArrayList<String> f26563b;

    /* renamed from: c */
    private InstabugCustomTextPlaceHolder f26564c;

    /* renamed from: d */
    private int f26565d;

    /* renamed from: e */
    private int f26566e;

    /* renamed from: f */
    private LinkedHashMap<Uri, String> f26567f;

    /* renamed from: g */
    private long f26568g;

    /* renamed from: h */
    private OnInvokeCallback f26569h;
    @Deprecated

    /* renamed from: i */
    private Runnable f26570i;

    /* renamed from: j */
    private boolean f26571j;

    /* renamed from: k */
    private OnSdkDismissedCallback f26572k;

    /* renamed from: l */
    private OnSdkInvokedCallback f26573l;

    /* renamed from: m */
    private boolean f26574m = false;

    /* renamed from: n */
    private int f26575n = -2;

    /* renamed from: o */
    private boolean f26576o = false;

    /* renamed from: p */
    private boolean f26577p = false;

    /* renamed from: q */
    private boolean f26578q = false;

    /* renamed from: r */
    private boolean f26579r = false;

    /* renamed from: s */
    private int f26580s = HttpUrlConnectionNetworkFetcher.HTTP_DEFAULT_TIMEOUT;

    /* renamed from: t */
    private boolean f26581t = true;

    /* renamed from: u */
    private boolean f26582u = false;

    /* renamed from: v */
    private OnReportCreatedListener f26583v;

    private C9989a() {
        boolean[] y = m46429y();
        y[0] = true;
        this.f26563b = new ArrayList<>();
        y[1] = true;
        this.f26567f = new LinkedHashMap<>(10);
        y[2] = true;
    }

    /* renamed from: A */
    public static C9989a m46428A() {
        boolean[] y = m46429y();
        C9989a aVar = f26560w;
        if (aVar != null) {
            y[4] = true;
        } else {
            aVar = new C9989a();
            f26560w = aVar;
            y[5] = true;
        }
        y[6] = true;
        return aVar;
    }

    /* renamed from: y */
    private static /* synthetic */ boolean[] m46429y() {
        boolean[] zArr = f26561x;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-3492396588208681958L, "com/instabug/library/settings/PerSessionSettings", 64);
        f26561x = a;
        return a;
    }

    /* renamed from: z */
    public static void m46430z() {
        boolean[] y = m46429y();
        f26560w = new C9989a();
        y[3] = true;
    }

    /* renamed from: a */
    public OnInvokeCallback mo35712a() {
        boolean[] y = m46429y();
        OnInvokeCallback onInvokeCallback = this.f26569h;
        y[7] = true;
        return onInvokeCallback;
    }

    @Deprecated
    /* renamed from: b */
    public Runnable mo35726b() {
        boolean[] y = m46429y();
        Runnable runnable = this.f26570i;
        y[9] = true;
        return runnable;
    }

    /* renamed from: c */
    public OnSdkInvokedCallback mo35729c() {
        boolean[] y = m46429y();
        OnSdkInvokedCallback onSdkInvokedCallback = this.f26573l;
        y[11] = true;
        return onSdkInvokedCallback;
    }

    /* renamed from: d */
    public LinkedHashMap<Uri, String> mo35732d() {
        boolean[] y = m46429y();
        LinkedHashMap<Uri, String> linkedHashMap = this.f26567f;
        y[19] = true;
        return linkedHashMap;
    }

    /* renamed from: e */
    public void mo35735e() {
        boolean[] y = m46429y();
        this.f26567f.clear();
        y[27] = true;
    }

    /* renamed from: f */
    public ArrayList<String> mo35737f() {
        boolean[] y = m46429y();
        ArrayList<String> arrayList = this.f26563b;
        y[28] = true;
        return arrayList;
    }

    /* renamed from: g */
    public void mo35739g() {
        boolean[] y = m46429y();
        this.f26563b = new ArrayList<>();
        y[30] = true;
    }

    /* renamed from: h */
    public long mo35741h() {
        boolean[] y = m46429y();
        long j = this.f26568g;
        y[31] = true;
        return j;
    }

    /* renamed from: i */
    public int mo35743i() {
        boolean[] y = m46429y();
        int i = this.f26565d;
        y[33] = true;
        return i;
    }

    /* renamed from: j */
    public boolean mo35744j() {
        boolean[] y = m46429y();
        boolean z = this.f26574m;
        y[35] = true;
        return z;
    }

    /* renamed from: k */
    public InstabugCustomTextPlaceHolder mo35745k() {
        boolean[] y = m46429y();
        InstabugCustomTextPlaceHolder instabugCustomTextPlaceHolder = this.f26564c;
        y[37] = true;
        return instabugCustomTextPlaceHolder;
    }

    /* renamed from: l */
    public int mo35746l() {
        boolean[] y = m46429y();
        int i = this.f26566e;
        y[39] = true;
        return i;
    }

    /* renamed from: m */
    public int mo35747m() {
        boolean[] y = m46429y();
        int i = this.f26575n;
        y[42] = true;
        return i;
    }

    /* renamed from: n */
    public void mo35748n() {
        boolean[] y = m46429y();
        this.f26575n = -2;
        y[43] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public boolean mo35749o() {
        boolean[] y = m46429y();
        boolean z = this.f26571j;
        y[44] = true;
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public boolean mo35750p() {
        boolean[] y = m46429y();
        boolean z = this.f26578q;
        y[46] = true;
        return z;
    }

    /* renamed from: q */
    public OnSdkDismissedCallback mo35751q() {
        boolean[] y = m46429y();
        OnSdkDismissedCallback onSdkDismissedCallback = this.f26572k;
        y[48] = true;
        return onSdkDismissedCallback;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public boolean mo35752r() {
        boolean[] y = m46429y();
        boolean z = this.f26581t;
        y[51] = true;
        return z;
    }

    /* renamed from: s */
    public boolean mo35753s() {
        boolean[] y = m46429y();
        boolean z = this.f26576o;
        y[52] = true;
        return z;
    }

    /* renamed from: t */
    public boolean mo35754t() {
        boolean[] y = m46429y();
        boolean z = this.f26577p;
        y[54] = true;
        return z;
    }

    /* renamed from: u */
    public boolean mo35755u() {
        boolean[] y = m46429y();
        boolean z = this.f26579r;
        y[56] = true;
        return z;
    }

    /* renamed from: v */
    public int mo35756v() {
        boolean[] y = m46429y();
        int i = this.f26580s;
        y[59] = true;
        return i;
    }

    /* renamed from: w */
    public boolean mo35757w() {
        boolean[] y = m46429y();
        boolean z = this.f26582u;
        y[61] = true;
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public OnReportCreatedListener mo35758x() {
        boolean[] y = m46429y();
        OnReportCreatedListener onReportCreatedListener = this.f26583v;
        y[62] = true;
        return onReportCreatedListener;
    }

    /* renamed from: a */
    public void mo35720a(OnInvokeCallback onInvokeCallback) {
        boolean[] y = m46429y();
        this.f26569h = onInvokeCallback;
        y[8] = true;
    }

    /* renamed from: b */
    public void mo35727b(int i) {
        boolean[] y = m46429y();
        this.f26566e = i;
        y[40] = true;
    }

    /* renamed from: c */
    public void mo35730c(int i) {
        boolean[] y = m46429y();
        this.f26575n = i;
        y[41] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo35734d(boolean z) {
        boolean[] y = m46429y();
        this.f26581t = z;
        y[50] = true;
    }

    /* renamed from: f */
    public void mo35738f(boolean z) {
        boolean[] y = m46429y();
        this.f26577p = z;
        y[55] = true;
    }

    /* renamed from: h */
    public void mo35742h(boolean z) {
        boolean[] y = m46429y();
        this.f26582u = z;
        y[60] = true;
    }

    /* renamed from: e */
    public void mo35736e(boolean z) {
        boolean[] y = m46429y();
        this.f26576o = z;
        y[53] = true;
    }

    /* renamed from: g */
    public void mo35740g(boolean z) {
        boolean[] y = m46429y();
        this.f26579r = z;
        y[57] = true;
    }

    @Deprecated
    /* renamed from: a */
    public void mo35722a(Runnable runnable) {
        boolean[] y = m46429y();
        this.f26570i = runnable;
        y[10] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo35728b(boolean z) {
        boolean[] y = m46429y();
        this.f26571j = z;
        y[45] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo35731c(boolean z) {
        boolean[] y = m46429y();
        this.f26578q = z;
        y[47] = true;
    }

    /* renamed from: d */
    public void mo35733d(int i) {
        boolean[] y = m46429y();
        this.f26580s = i;
        y[58] = true;
    }

    /* renamed from: a */
    public void mo35719a(OnSdkInvokedCallback onSdkInvokedCallback) {
        boolean[] y = m46429y();
        this.f26573l = onSdkInvokedCallback;
        y[12] = true;
    }

    /* renamed from: a */
    public Locale mo35713a(Context context) {
        boolean[] y = m46429y();
        Locale locale = this.f26562a;
        if (locale != null) {
            y[13] = true;
            return locale;
        }
        if (VERSION.SDK_INT >= 24) {
            y[14] = true;
            this.f26562a = context.getResources().getConfiguration().getLocales().get(0);
            y[15] = true;
        } else {
            this.f26562a = context.getResources().getConfiguration().locale;
            y[16] = true;
        }
        Locale locale2 = this.f26562a;
        y[17] = true;
        return locale2;
    }

    /* renamed from: a */
    public void mo35723a(Locale locale) {
        boolean[] y = m46429y();
        this.f26562a = locale;
        y[18] = true;
    }

    /* renamed from: a */
    public void mo35716a(Uri uri, String str) {
        boolean[] y = m46429y();
        if (this.f26567f.size() != 10) {
            y[20] = true;
        } else {
            LinkedHashMap<Uri, String> linkedHashMap = this.f26567f;
            y[21] = true;
            if (linkedHashMap.containsKey(uri)) {
                y[22] = true;
            } else {
                y[23] = true;
                Uri uri2 = (Uri) this.f26567f.keySet().iterator().next();
                y[24] = true;
                this.f26567f.remove(uri2);
                y[25] = true;
            }
        }
        this.f26567f.put(uri, str);
        y[26] = true;
    }

    /* renamed from: a */
    public void mo35725a(String... strArr) {
        boolean[] y = m46429y();
        Collections.addAll(this.f26563b, strArr);
        y[29] = true;
    }

    /* renamed from: a */
    public void mo35715a(long j) {
        boolean[] y = m46429y();
        this.f26568g = j;
        y[32] = true;
    }

    /* renamed from: a */
    public void mo35714a(@C0198k int i) {
        boolean[] y = m46429y();
        this.f26565d = i;
        y[34] = true;
    }

    /* renamed from: a */
    public void mo35724a(boolean z) {
        boolean[] y = m46429y();
        this.f26574m = z;
        y[36] = true;
    }

    /* renamed from: a */
    public void mo35717a(InstabugCustomTextPlaceHolder instabugCustomTextPlaceHolder) {
        boolean[] y = m46429y();
        this.f26564c = instabugCustomTextPlaceHolder;
        y[38] = true;
    }

    /* renamed from: a */
    public void mo35718a(OnSdkDismissedCallback onSdkDismissedCallback) {
        boolean[] y = m46429y();
        this.f26572k = onSdkDismissedCallback;
        y[49] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35721a(OnReportCreatedListener onReportCreatedListener) {
        boolean[] y = m46429y();
        this.f26583v = onReportCreatedListener;
        y[63] = true;
    }
}
