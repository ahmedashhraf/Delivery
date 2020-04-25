package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.api.C4059a.C4063d.C4067d;
import com.google.android.gms.common.api.C4083h;
import com.google.android.gms.common.api.internal.C4097b;
import com.google.android.gms.common.api.internal.C4221x;
import com.google.android.gms.common.internal.C4416z;
import com.google.android.gms.tasks.C5560k;

/* renamed from: com.google.android.gms.location.s */
public class C5156s extends C4083h<C4067d> {
    public C5156s(@C0193h0 Activity activity) {
        super(activity, C5142m.f14784c, null, (C4221x) new C4097b());
    }

    public C5156s(@C0193h0 Context context) {
        super(context, C5142m.f14784c, null, (C4221x) new C4097b());
    }

    /* renamed from: a */
    public C5560k<C5145n> mo20128a(LocationSettingsRequest locationSettingsRequest) {
        return C4416z.m19056a(C5142m.f14787f.mo18734a(mo17679c(), locationSettingsRequest), new C5145n());
    }
}
