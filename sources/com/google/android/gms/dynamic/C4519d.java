package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import p076c.p112d.p113a.p114a.p118d.p122d.C2613a;
import p076c.p112d.p113a.p114a.p118d.p122d.C2614b;

/* renamed from: com.google.android.gms.dynamic.d */
public interface C4519d extends IInterface {

    /* renamed from: com.google.android.gms.dynamic.d$a */
    public static abstract class C4520a extends C2614b implements C4519d {

        /* renamed from: com.google.android.gms.dynamic.d$a$a */
        public static class C4521a extends C2613a implements C4519d {
            C4521a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public C4520a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: a */
        public static C4519d m19510a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof C4519d) {
                return (C4519d) queryLocalInterface;
            }
            return new C4521a(iBinder);
        }
    }
}
