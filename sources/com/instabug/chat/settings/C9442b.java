package com.instabug.chat.settings;

import com.instabug.library.OnSdkDismissCallback;
import com.instabug.library.OnSdkDismissedCallback;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.chat.settings.b */
/* compiled from: PerSessionSettings */
public class C9442b {

    /* renamed from: g */
    private static C9442b f25009g;

    /* renamed from: h */
    private static transient /* synthetic */ boolean[] f25010h;

    /* renamed from: a */
    private AttachmentTypesState f25011a;

    /* renamed from: b */
    private Runnable f25012b;

    /* renamed from: c */
    private boolean f25013c = false;
    @Deprecated

    /* renamed from: d */
    private OnSdkDismissedCallback f25014d;

    /* renamed from: e */
    private String f25015e;

    /* renamed from: f */
    private OnSdkDismissCallback f25016f;

    private C9442b() {
        boolean[] i = m44216i();
        i[0] = true;
        this.f25011a = new AttachmentTypesState();
        i[1] = true;
    }

    /* renamed from: g */
    static void m44214g() {
        boolean[] i = m44216i();
        f25009g = new C9442b();
        i[2] = true;
    }

    /* renamed from: h */
    static C9442b m44215h() {
        boolean[] i = m44216i();
        C9442b bVar = f25009g;
        i[3] = true;
        return bVar;
    }

    /* renamed from: i */
    private static /* synthetic */ boolean[] m44216i() {
        boolean[] zArr = f25010h;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(7942337582458406042L, "com/instabug/chat/settings/PerSessionSettings", 20);
        f25010h = a;
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Runnable mo34012a() {
        boolean[] i = m44216i();
        Runnable runnable = this.f25012b;
        i[4] = true;
        return runnable;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public AttachmentTypesState mo34018b() {
        boolean[] i = m44216i();
        AttachmentTypesState attachmentTypesState = this.f25011a;
        i[11] = true;
        return attachmentTypesState;
    }

    /* renamed from: c */
    public boolean mo34019c() {
        boolean[] i = m44216i();
        boolean z = this.f25013c;
        i[12] = true;
        return z;
    }

    @Deprecated
    /* renamed from: d */
    public OnSdkDismissedCallback mo34020d() {
        boolean[] i = m44216i();
        OnSdkDismissedCallback onSdkDismissedCallback = this.f25014d;
        i[14] = true;
        return onSdkDismissedCallback;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public String mo34021e() {
        boolean[] i = m44216i();
        String str = this.f25015e;
        i[17] = true;
        return str;
    }

    /* renamed from: f */
    public OnSdkDismissCallback mo34022f() {
        boolean[] i = m44216i();
        OnSdkDismissCallback onSdkDismissCallback = this.f25016f;
        i[18] = true;
        return onSdkDismissCallback;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34015a(Runnable runnable) {
        boolean[] i = m44216i();
        this.f25012b = runnable;
        i[5] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C9442b mo34011a(AttachmentTypesState attachmentTypesState) {
        boolean[] i = m44216i();
        this.f25011a = attachmentTypesState;
        i[10] = true;
        return this;
    }

    /* renamed from: a */
    public void mo34017a(boolean z) {
        boolean[] i = m44216i();
        this.f25013c = z;
        i[13] = true;
    }

    @Deprecated
    /* renamed from: a */
    public void mo34014a(OnSdkDismissedCallback onSdkDismissedCallback) {
        boolean[] i = m44216i();
        this.f25014d = onSdkDismissedCallback;
        i[15] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34016a(String str) {
        boolean[] i = m44216i();
        this.f25015e = str;
        i[16] = true;
    }

    /* renamed from: a */
    public void mo34013a(OnSdkDismissCallback onSdkDismissCallback) {
        boolean[] i = m44216i();
        this.f25016f = onSdkDismissCallback;
        i[19] = true;
    }
}
