package com.instabug.bug.settings;

import android.content.Context;
import androidx.annotation.C0195i0;
import com.instabug.bug.OnSdkDismissedCallback;
import com.instabug.bug.extendedbugreport.ExtendedBugReport.State;
import com.instabug.bug.model.C9277a;
import com.instabug.bug.model.ReportCategory;
import com.instabug.library.OnSdkDismissCallback;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.bug.settings.a */
/* compiled from: BugSettings */
public class C9291a {

    /* renamed from: a */
    private static C9291a f24592a;

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f24593b;

    private C9291a() {
        m43477s()[0] = true;
    }

    /* renamed from: a */
    public static void m43475a(Context context) {
        boolean[] s = m43477s();
        f24592a = new C9291a();
        s[1] = true;
        C9293c.m43535a(context);
        s[2] = true;
        C9292b.m43511l();
        s[3] = true;
    }

    /* renamed from: r */
    public static C9291a m43476r() {
        boolean[] s = m43477s();
        if (f24592a != null) {
            s[4] = true;
        } else {
            s[5] = true;
            f24592a = new C9291a();
            s[6] = true;
        }
        C9291a aVar = f24592a;
        s[7] = true;
        return aVar;
    }

    /* renamed from: s */
    private static /* synthetic */ boolean[] m43477s() {
        boolean[] zArr = f24593b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(5856843300114231292L, "com/instabug/bug/settings/BugSettings", 52);
        f24593b = a;
        return a;
    }

    @C0195i0
    /* renamed from: b */
    public String mo33603b() {
        boolean[] s = m43477s();
        String e = C9293c.m43536g().mo33656e();
        s[10] = true;
        return e;
    }

    /* renamed from: c */
    public AttachmentsTypesParams mo33607c() {
        boolean[] s = m43477s();
        AttachmentsTypesParams b = C9292b.m43512m().mo33635b();
        s[12] = true;
        return b;
    }

    /* renamed from: d */
    public boolean mo33610d() {
        boolean z;
        boolean[] s = m43477s();
        AttachmentsTypesParams b = C9292b.m43512m().mo33635b();
        s[14] = true;
        if (b.isAllowTakeExtraScreenshot()) {
            s[15] = true;
        } else {
            s[16] = true;
            AttachmentsTypesParams b2 = C9292b.m43512m().mo33635b();
            s[17] = true;
            if (b2.isAllowAttachImageFromGallery()) {
                s[18] = true;
            } else {
                s[19] = true;
                AttachmentsTypesParams b3 = C9292b.m43512m().mo33635b();
                s[20] = true;
                if (b3.isAllowScreenRecording()) {
                    s[21] = true;
                } else {
                    z = false;
                    s[23] = true;
                    s[24] = true;
                    return z;
                }
            }
        }
        s[22] = true;
        z = true;
        s[24] = true;
        return z;
    }

    /* renamed from: e */
    public boolean mo33612e() {
        boolean[] s = m43477s();
        boolean a = C9293c.m43536g().mo33649a();
        s[25] = true;
        return a;
    }

    @Deprecated
    /* renamed from: f */
    public OnSdkDismissedCallback mo33613f() {
        boolean[] s = m43477s();
        OnSdkDismissedCallback c = C9292b.m43512m().mo33637c();
        s[29] = true;
        return c;
    }

    /* renamed from: g */
    public boolean mo33614g() {
        boolean[] s = m43477s();
        boolean b = C9293c.m43536g().mo33652b();
        s[30] = true;
        return b;
    }

    /* renamed from: h */
    public OnSdkDismissCallback mo33615h() {
        boolean[] s = m43477s();
        OnSdkDismissCallback d = C9292b.m43512m().mo33638d();
        s[32] = true;
        return d;
    }

    /* renamed from: i */
    public boolean mo33616i() {
        boolean[] s = m43477s();
        boolean e = C9292b.m43512m().mo33639e();
        s[36] = true;
        return e;
    }

    /* renamed from: j */
    public long mo33617j() {
        boolean[] s = m43477s();
        long c = C9293c.m43536g().mo33653c();
        s[37] = true;
        return c;
    }

    /* renamed from: k */
    public boolean mo33618k() {
        boolean[] s = m43477s();
        boolean d = C9293c.m43536g().mo33655d();
        s[39] = true;
        return d;
    }

    /* renamed from: l */
    public String mo33619l() {
        boolean[] s = m43477s();
        String g = C9292b.m43512m().mo33641g();
        s[42] = true;
        return g;
    }

    /* renamed from: m */
    public void mo33620m() {
        boolean[] s = m43477s();
        C9292b.m43512m().mo33643i();
        s[44] = true;
    }

    /* renamed from: n */
    public List<C9277a> mo33621n() {
        boolean[] s = m43477s();
        List<C9277a> h = C9292b.m43512m().mo33642h();
        s[45] = true;
        return h;
    }

    /* renamed from: o */
    public boolean mo33622o() {
        boolean[] s = m43477s();
        boolean k = C9292b.m43512m().mo33645k();
        s[46] = true;
        return k;
    }

    /* renamed from: p */
    public State mo33623p() {
        boolean[] s = m43477s();
        State j = C9292b.m43512m().mo33644j();
        s[49] = true;
        return j;
    }

    /* renamed from: q */
    public long mo33624q() {
        boolean[] s = m43477s();
        long f = C9293c.m43536g().mo33657f();
        s[50] = true;
        return f;
    }

    /* renamed from: b */
    public void mo33606b(boolean z) {
        boolean[] s = m43477s();
        C9293c.m43536g().mo33651b(z);
        s[34] = true;
    }

    /* renamed from: c */
    public void mo33608c(boolean z) {
        boolean[] s = m43477s();
        C9292b.m43512m().mo33634a(z);
        s[35] = true;
    }

    /* renamed from: e */
    public void mo33611e(boolean z) {
        boolean[] s = m43477s();
        C9292b.m43512m().mo33636b(z);
        s[47] = true;
    }

    /* renamed from: b */
    public void mo33605b(String str) {
        boolean[] s = m43477s();
        C9292b.m43512m().mo33632a(str);
        s[41] = true;
    }

    /* renamed from: a */
    public List<ReportCategory> mo33592a() {
        boolean[] s = m43477s();
        List<ReportCategory> a = C9292b.m43512m().mo33626a();
        s[8] = true;
        return a;
    }

    /* renamed from: a */
    public void mo33601a(List<ReportCategory> list) {
        boolean[] s = m43477s();
        C9292b.m43512m().mo33633a(list);
        s[9] = true;
    }

    /* renamed from: b */
    public void mo33604b(long j) {
        boolean[] s = m43477s();
        C9293c.m43536g().mo33650b(j);
        s[51] = true;
    }

    /* renamed from: a */
    public void mo33600a(String str) {
        boolean[] s = m43477s();
        C9293c.m43536g().mo33647a(str);
        s[11] = true;
    }

    /* renamed from: d */
    public void mo33609d(boolean z) {
        boolean[] s = m43477s();
        C9293c.m43536g().mo33654c(z);
        s[40] = true;
    }

    /* renamed from: a */
    public void mo33596a(AttachmentsTypesParams attachmentsTypesParams) {
        boolean[] s = m43477s();
        C9292b.m43512m().mo33625a(attachmentsTypesParams);
        s[13] = true;
    }

    /* renamed from: a */
    public void mo33602a(boolean z) {
        boolean[] s = m43477s();
        C9293c.m43536g().mo33648a(z);
        s[26] = true;
    }

    /* renamed from: a */
    public void mo33599a(Runnable runnable) {
        boolean[] s = m43477s();
        C9292b.m43512m().mo33631a(runnable);
        s[28] = true;
    }

    @Deprecated
    /* renamed from: a */
    public void mo33594a(OnSdkDismissedCallback onSdkDismissedCallback) {
        boolean[] s = m43477s();
        C9292b.m43512m().mo33627a(onSdkDismissedCallback);
        s[31] = true;
    }

    /* renamed from: a */
    public void mo33597a(OnSdkDismissCallback onSdkDismissCallback) {
        boolean[] s = m43477s();
        C9292b.m43512m().mo33629a(onSdkDismissCallback);
        s[33] = true;
    }

    /* renamed from: a */
    public void mo33593a(long j) {
        boolean[] s = m43477s();
        C9293c.m43536g().mo33646a(j);
        s[38] = true;
    }

    /* renamed from: a */
    public void mo33598a(CharSequence charSequence, boolean z) {
        boolean[] s = m43477s();
        C9292b.m43512m().mo33630a(charSequence, z);
        s[43] = true;
    }

    /* renamed from: a */
    public void mo33595a(State state) {
        boolean[] s = m43477s();
        C9292b.m43512m().mo33628a(state);
        s[48] = true;
    }
}
