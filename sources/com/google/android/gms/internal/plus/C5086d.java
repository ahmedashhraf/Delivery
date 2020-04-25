package com.google.android.gms.internal.plus;

import com.google.android.gms.common.data.C4269f;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.plus.zzr.zzc;
import com.google.android.gms.plus.p177g.p178a.C5495a;
import com.google.android.gms.plus.p177g.p178a.C5495a.C5496a;
import com.google.android.gms.plus.p177g.p178a.C5495a.C5497b;
import com.google.android.gms.plus.p177g.p178a.C5495a.C5502d;
import com.google.android.gms.plus.p177g.p178a.C5495a.C5503e;
import java.util.List;

/* renamed from: com.google.android.gms.internal.plus.d */
public final class C5086d extends C4269f implements C5495a {
    public C5086d(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    /* renamed from: A */
    public final boolean mo19822A() {
        return false;
    }

    /* renamed from: B */
    public final boolean mo19823B() {
        return false;
    }

    /* renamed from: C */
    public final boolean mo19824C() {
        return false;
    }

    /* renamed from: D */
    public final /* bridge */ /* synthetic */ List mo19825D() {
        return null;
    }

    /* renamed from: E */
    public final String mo19826E() {
        return null;
    }

    /* renamed from: F */
    public final boolean mo19827F() {
        return false;
    }

    /* renamed from: G */
    public final boolean mo19828G() {
        return false;
    }

    /* renamed from: H */
    public final C5502d mo19829H() {
        return new zzc(mo18080g("image"));
    }

    /* renamed from: I */
    public final /* bridge */ /* synthetic */ List mo19830I() {
        return null;
    }

    /* renamed from: J */
    public final int mo19831J() {
        return 0;
    }

    /* renamed from: K */
    public final boolean mo19832K() {
        return false;
    }

    /* renamed from: L */
    public final boolean mo19833L() {
        return false;
    }

    /* renamed from: M */
    public final C5496a mo19834M() {
        return null;
    }

    /* renamed from: N */
    public final boolean mo19835N() {
        return false;
    }

    /* renamed from: O */
    public final int mo19836O() {
        return 0;
    }

    /* renamed from: P */
    public final int mo19837P() {
        return 0;
    }

    /* renamed from: Q */
    public final boolean mo19838Q() {
        return true;
    }

    /* renamed from: R */
    public final C5497b mo19839R() {
        return null;
    }

    /* renamed from: S */
    public final String mo19840S() {
        return null;
    }

    /* renamed from: T */
    public final boolean mo19841T() {
        return false;
    }

    /* renamed from: U */
    public final boolean mo19842U() {
        return false;
    }

    /* renamed from: V */
    public final /* bridge */ /* synthetic */ List mo19843V() {
        return null;
    }

    /* renamed from: W */
    public final boolean mo19844W() {
        return true;
    }

    /* renamed from: X */
    public final boolean mo19845X() {
        return false;
    }

    /* renamed from: Y */
    public final boolean mo19846Y() {
        return false;
    }

    /* renamed from: Z */
    public final int mo19847Z() {
        return 0;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo18089b() {
        zzr zzr = new zzr(mo19862s(), getId(), (zzc) mo19829H(), mo19866w(), mo19848c());
        return zzr;
    }

    /* renamed from: c */
    public final String mo19848c() {
        return mo18080g("url");
    }

    /* renamed from: e */
    public final boolean mo19849e() {
        return true;
    }

    /* renamed from: f */
    public final boolean mo19850f() {
        return false;
    }

    public final String getId() {
        return mo18080g("personId");
    }

    public final String getLanguage() {
        return null;
    }

    public final C5503e getName() {
        return null;
    }

    /* renamed from: h */
    public final boolean mo19854h() {
        return false;
    }

    /* renamed from: i */
    public final boolean mo19855i() {
        return true;
    }

    /* renamed from: l */
    public final boolean mo19856l() {
        return false;
    }

    /* renamed from: m */
    public final String mo19857m() {
        return null;
    }

    /* renamed from: n */
    public final boolean mo19858n() {
        return false;
    }

    /* renamed from: o */
    public final boolean mo19859o() {
        return false;
    }

    /* renamed from: p */
    public final String mo19860p() {
        return null;
    }

    /* renamed from: r */
    public final boolean mo19861r() {
        return false;
    }

    /* renamed from: s */
    public final String mo19862s() {
        return mo18080g("displayName");
    }

    /* renamed from: t */
    public final String mo19863t() {
        return null;
    }

    /* renamed from: u */
    public final boolean mo19864u() {
        return false;
    }

    /* renamed from: v */
    public final String mo19865v() {
        return null;
    }

    /* renamed from: w */
    public final int mo19866w() {
        String g = mo18080g("objectType");
        if (g.equals("person")) {
            return 0;
        }
        if (g.equals("page")) {
            return 1;
        }
        String str = "Unknown objectType string: ";
        String valueOf = String.valueOf(g);
        throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: x */
    public final boolean mo19867x() {
        return true;
    }

    /* renamed from: y */
    public final boolean mo19868y() {
        return false;
    }

    /* renamed from: z */
    public final boolean mo19869z() {
        return false;
    }
}
