package com.google.android.gms.plus;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C4059a.C4060a;
import com.google.android.gms.common.api.C4059a.C4071f;
import com.google.android.gms.common.api.C4086i.C4088b;
import com.google.android.gms.common.api.C4086i.C4089c;
import com.google.android.gms.common.internal.C4329f;
import com.google.android.gms.common.util.C4507z;
import com.google.android.gms.plus.C5481c.C5482a;
import com.google.android.gms.plus.internal.C5521h;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.internal.zzn;

/* renamed from: com.google.android.gms.plus.j */
final class C5528j extends C4060a<C5521h, C5482a> {
    C5528j() {
    }

    /* renamed from: a */
    public final int mo17632a() {
        return 2;
    }

    /* renamed from: a */
    public final /* synthetic */ C4071f mo10343a(Context context, Looper looper, C4329f fVar, Object obj, C4088b bVar, C4089c cVar) {
        C5482a aVar = (C5482a) obj;
        if (aVar == null) {
            aVar = new C5482a((C5528j) null);
        }
        zzn zzn = new zzn(fVar.mo18296c().name, C4507z.m19428a(fVar.mo18297d()), (String[]) aVar.f15750b.toArray(new String[0]), new String[0], context.getPackageName(), context.getPackageName(), null, new PlusCommonExtras());
        C5521h hVar = new C5521h(context, looper, fVar, zzn, bVar, cVar);
        return hVar;
    }
}
