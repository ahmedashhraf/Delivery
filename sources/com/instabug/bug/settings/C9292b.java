package com.instabug.bug.settings;

import com.instabug.bug.OnSdkDismissedCallback;
import com.instabug.bug.extendedbugreport.ExtendedBugReport.State;
import com.instabug.bug.model.C9277a;
import com.instabug.bug.model.ReportCategory;
import com.instabug.library.OnSdkDismissCallback;
import java.util.ArrayList;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.bug.settings.b */
/* compiled from: PerSessionSettings */
public class C9292b {

    /* renamed from: k */
    private static C9292b f24594k;

    /* renamed from: l */
    private static transient /* synthetic */ boolean[] f24595l;

    /* renamed from: a */
    private AttachmentsTypesParams f24596a;

    /* renamed from: b */
    private List<ReportCategory> f24597b;
    @Deprecated

    /* renamed from: c */
    private OnSdkDismissedCallback f24598c;

    /* renamed from: d */
    private boolean f24599d = true;

    /* renamed from: e */
    private Runnable f24600e;

    /* renamed from: f */
    private String f24601f;

    /* renamed from: g */
    private List<C9277a> f24602g;

    /* renamed from: h */
    private State f24603h;

    /* renamed from: i */
    private boolean f24604i = false;

    /* renamed from: j */
    private OnSdkDismissCallback f24605j;

    private C9292b() {
        boolean[] n = m43513n();
        n[0] = true;
        this.f24596a = new AttachmentsTypesParams();
        n[1] = true;
        this.f24602g = new ArrayList();
        n[2] = true;
    }

    /* renamed from: l */
    public static void m43511l() {
        boolean[] n = m43513n();
        f24594k = new C9292b();
        n[3] = true;
    }

    /* renamed from: m */
    public static C9292b m43512m() {
        boolean[] n = m43513n();
        C9292b bVar = f24594k;
        if (bVar == null) {
            bVar = new C9292b();
            f24594k = bVar;
            n[4] = true;
        } else {
            n[5] = true;
        }
        n[6] = true;
        return bVar;
    }

    /* renamed from: n */
    private static /* synthetic */ boolean[] m43513n() {
        boolean[] zArr = f24595l;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-8212661498273667033L, "com/instabug/bug/settings/PerSessionSettings", 30);
        f24595l = a;
        return a;
    }

    /* renamed from: a */
    public List<ReportCategory> mo33626a() {
        boolean[] n = m43513n();
        List<ReportCategory> list = this.f24597b;
        n[7] = true;
        return list;
    }

    /* renamed from: b */
    public AttachmentsTypesParams mo33635b() {
        boolean[] n = m43513n();
        AttachmentsTypesParams attachmentsTypesParams = this.f24596a;
        n[9] = true;
        return attachmentsTypesParams;
    }

    @Deprecated
    /* renamed from: c */
    public OnSdkDismissedCallback mo33637c() {
        boolean[] n = m43513n();
        OnSdkDismissedCallback onSdkDismissedCallback = this.f24598c;
        n[11] = true;
        return onSdkDismissedCallback;
    }

    /* renamed from: d */
    public OnSdkDismissCallback mo33638d() {
        boolean[] n = m43513n();
        OnSdkDismissCallback onSdkDismissCallback = this.f24605j;
        n[13] = true;
        return onSdkDismissCallback;
    }

    /* renamed from: e */
    public boolean mo33639e() {
        boolean[] n = m43513n();
        boolean z = this.f24599d;
        n[16] = true;
        return z;
    }

    /* renamed from: f */
    public Runnable mo33640f() {
        boolean[] n = m43513n();
        Runnable runnable = this.f24600e;
        n[17] = true;
        return runnable;
    }

    /* renamed from: g */
    public String mo33641g() {
        boolean[] n = m43513n();
        String str = this.f24601f;
        n[20] = true;
        return str;
    }

    /* renamed from: h */
    public List<C9277a> mo33642h() {
        boolean[] n = m43513n();
        List<C9277a> list = this.f24602g;
        n[22] = true;
        return list;
    }

    /* renamed from: i */
    public void mo33643i() {
        boolean[] n = m43513n();
        this.f24602g.clear();
        n[23] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public State mo33644j() {
        boolean[] n = m43513n();
        State state = this.f24603h;
        if (state == null) {
            state = State.DISABLED;
            n[25] = true;
        } else {
            n[26] = true;
        }
        n[27] = true;
        return state;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public boolean mo33645k() {
        boolean[] n = m43513n();
        boolean z = this.f24604i;
        n[28] = true;
        return z;
    }

    /* renamed from: a */
    public void mo33633a(List<ReportCategory> list) {
        boolean[] n = m43513n();
        this.f24597b = list;
        n[8] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo33636b(boolean z) {
        boolean[] n = m43513n();
        this.f24604i = z;
        n[29] = true;
    }

    /* renamed from: a */
    public C9292b mo33625a(AttachmentsTypesParams attachmentsTypesParams) {
        boolean[] n = m43513n();
        this.f24596a = attachmentsTypesParams;
        n[10] = true;
        return this;
    }

    @Deprecated
    /* renamed from: a */
    public void mo33627a(OnSdkDismissedCallback onSdkDismissedCallback) {
        boolean[] n = m43513n();
        this.f24598c = onSdkDismissedCallback;
        n[12] = true;
    }

    /* renamed from: a */
    public void mo33629a(OnSdkDismissCallback onSdkDismissCallback) {
        boolean[] n = m43513n();
        this.f24605j = onSdkDismissCallback;
        n[14] = true;
    }

    /* renamed from: a */
    public void mo33634a(boolean z) {
        boolean[] n = m43513n();
        this.f24599d = z;
        n[15] = true;
    }

    /* renamed from: a */
    public void mo33631a(Runnable runnable) {
        boolean[] n = m43513n();
        this.f24600e = runnable;
        n[18] = true;
    }

    /* renamed from: a */
    public void mo33632a(String str) {
        boolean[] n = m43513n();
        this.f24601f = str;
        n[19] = true;
    }

    /* renamed from: a */
    public void mo33630a(CharSequence charSequence, boolean z) {
        boolean[] n = m43513n();
        this.f24602g.add(new C9277a(charSequence, z));
        n[21] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33628a(State state) {
        boolean[] n = m43513n();
        this.f24603h = state;
        n[24] = true;
    }
}
