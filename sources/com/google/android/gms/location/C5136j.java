package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import com.google.android.gms.common.internal.C4337h;
import com.google.android.gms.internal.location.zzbh;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.location.j */
public class C5136j {

    /* renamed from: a */
    private final int f14778a;

    /* renamed from: b */
    private final int f14779b;

    /* renamed from: c */
    private final List<C5127f> f14780c;

    /* renamed from: d */
    private final Location f14781d;

    private C5136j(int i, int i2, List<C5127f> list, Location location) {
        this.f14778a = i;
        this.f14779b = i2;
        this.f14780c = list;
        this.f14781d = location;
    }

    /* renamed from: a */
    public static C5136j m22402a(Intent intent) {
        ArrayList arrayList = null;
        if (intent == null) {
            return null;
        }
        int i = -1;
        int intExtra = intent.getIntExtra(C4337h.f13483a, -1);
        int intExtra2 = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
        if (intExtra2 != -1 && (intExtra2 == 1 || intExtra2 == 2 || intExtra2 == 4)) {
            i = intExtra2;
        }
        ArrayList arrayList2 = (ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
        if (arrayList2 != null) {
            arrayList = new ArrayList(arrayList2.size());
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                arrayList.add(zzbh.m19894a((byte[]) obj));
            }
        }
        return new C5136j(intExtra, i, arrayList, (Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location"));
    }

    /* renamed from: a */
    public int mo20104a() {
        return this.f14778a;
    }

    /* renamed from: b */
    public int mo20105b() {
        return this.f14779b;
    }

    /* renamed from: c */
    public List<C5127f> mo20106c() {
        return this.f14780c;
    }

    /* renamed from: d */
    public Location mo20107d() {
        return this.f14781d;
    }

    /* renamed from: e */
    public boolean mo20108e() {
        return this.f14778a != -1;
    }
}
