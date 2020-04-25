package com.clevertap.android.sdk;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.C0193h0;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import java.util.ArrayList;

/* renamed from: com.clevertap.android.sdk.i0 */
/* compiled from: CTInboxMessageAdapter */
class C3113i0 extends C1638g {

    /* renamed from: e */
    private static final int f11154e = 0;

    /* renamed from: f */
    private static final int f11155f = 1;

    /* renamed from: g */
    private static final int f11156g = 2;

    /* renamed from: h */
    private static final int f11157h = 3;

    /* renamed from: c */
    private ArrayList<CTInboxMessage> f11158c;

    /* renamed from: d */
    private C3100g0 f11159d;

    /* renamed from: com.clevertap.android.sdk.i0$a */
    /* compiled from: CTInboxMessageAdapter */
    static /* synthetic */ class C3114a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11160a = new int[C3119j0.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.clevertap.android.sdk.j0[] r0 = com.clevertap.android.sdk.C3119j0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11160a = r0
                int[] r0 = f11160a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.clevertap.android.sdk.j0 r1 = com.clevertap.android.sdk.C3119j0.SimpleMessage     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f11160a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.clevertap.android.sdk.j0 r1 = com.clevertap.android.sdk.C3119j0.IconMessage     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f11160a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.clevertap.android.sdk.j0 r1 = com.clevertap.android.sdk.C3119j0.CarouselMessage     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f11160a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.clevertap.android.sdk.j0 r1 = com.clevertap.android.sdk.C3119j0.CarouselImageMessage     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3113i0.C3114a.<clinit>():void");
        }
    }

    C3113i0(ArrayList<CTInboxMessage> arrayList, C3100g0 g0Var) {
        this.f11158c = arrayList;
        this.f11159d = g0Var;
    }

    /* renamed from: c */
    public int mo7333c(int i) {
        int i2 = C3114a.f11160a[((CTInboxMessage) this.f11158c.get(i)).mo12027u().ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 != 3) {
            return i2 != 4 ? -1 : 3;
        }
        return 2;
    }

    @C0193h0
    /* renamed from: b */
    public C3080d0 m14959b(@C0193h0 ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C3142n0(LayoutInflater.from(viewGroup.getContext()).inflate(C3058R.layout.inbox_simple_message_layout, viewGroup, false));
        }
        if (i == 1) {
            return new C3097g(LayoutInflater.from(viewGroup.getContext()).inflate(C3058R.layout.inbox_icon_message_layout, viewGroup, false));
        }
        if (i == 2) {
            return new C3083e(LayoutInflater.from(viewGroup.getContext()).inflate(C3058R.layout.inbox_carousel_text_layout, viewGroup, false));
        }
        if (i != 3) {
            return null;
        }
        return new C3076d(LayoutInflater.from(viewGroup.getContext()).inflate(C3058R.layout.inbox_carousel_layout, viewGroup, false));
    }

    /* renamed from: b */
    public void mo7330b(@C0193h0 C1635d0 d0Var, int i) {
        ((C3080d0) d0Var).mo12219a((CTInboxMessage) this.f11158c.get(i), this.f11159d, i);
    }

    /* renamed from: b */
    public int mo7325b() {
        return this.f11158c.size();
    }
}
