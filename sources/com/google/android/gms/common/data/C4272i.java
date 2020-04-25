package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.C4056a;
import java.util.ArrayList;

@C4056a
/* renamed from: com.google.android.gms.common.data.i */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class C4272i<T> extends C4263a<T> {

    /* renamed from: N */
    private ArrayList<Integer> f13270N;

    /* renamed from: b */
    private boolean f13271b = false;

    @C4056a
    protected C4272i(DataHolder dataHolder) {
        super(dataHolder);
    }

    /* renamed from: a */
    private final int m18462a(int i) {
        if (i >= 0 && i < this.f13270N.size()) {
            return ((Integer) this.f13270N.get(i)).intValue();
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("Position ");
        sb.append(i);
        sb.append(" is out of bounds for this buffer");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    private final void m18463c() {
        synchronized (this) {
            if (!this.f13271b) {
                int count = this.f13259a.getCount();
                this.f13270N = new ArrayList<>();
                if (count > 0) {
                    this.f13270N.add(Integer.valueOf(0));
                    String b = mo18087b();
                    String f = this.f13259a.mo18043f(b, 0, this.f13259a.mo18045g(0));
                    int i = 1;
                    while (i < count) {
                        int g = this.f13259a.mo18045g(i);
                        String f2 = this.f13259a.mo18043f(b, i, g);
                        if (f2 != null) {
                            if (!f2.equals(f)) {
                                this.f13270N.add(Integer.valueOf(i));
                                f = f2;
                            }
                            i++;
                        } else {
                            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 78);
                            sb.append("Missing value for markerColumn: ");
                            sb.append(b);
                            sb.append(", at row: ");
                            sb.append(i);
                            sb.append(", for window: ");
                            sb.append(g);
                            throw new NullPointerException(sb.toString());
                        }
                    }
                }
                this.f13271b = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: a */
    public abstract T mo18085a(int i, int i2);

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: a */
    public String mo18086a() {
        return null;
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: b */
    public abstract String mo18087b();

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0063, code lost:
        if (r6.f13259a.mo18043f(r4, r7, r3) == null) goto L_0x0067;
     */
    @com.google.android.gms.common.annotation.C4056a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T get(int r7) {
        /*
            r6 = this;
            r6.m18463c()
            int r0 = r6.m18462a(r7)
            r1 = 0
            if (r7 < 0) goto L_0x0067
            java.util.ArrayList<java.lang.Integer> r2 = r6.f13270N
            int r2 = r2.size()
            if (r7 != r2) goto L_0x0013
            goto L_0x0067
        L_0x0013:
            java.util.ArrayList<java.lang.Integer> r2 = r6.f13270N
            int r2 = r2.size()
            r3 = 1
            int r2 = r2 - r3
            if (r7 != r2) goto L_0x0030
            com.google.android.gms.common.data.DataHolder r2 = r6.f13259a
            int r2 = r2.getCount()
            java.util.ArrayList<java.lang.Integer> r4 = r6.f13270N
            java.lang.Object r4 = r4.get(r7)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            goto L_0x004a
        L_0x0030:
            java.util.ArrayList<java.lang.Integer> r2 = r6.f13270N
            int r4 = r7 + 1
            java.lang.Object r2 = r2.get(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.util.ArrayList<java.lang.Integer> r4 = r6.f13270N
            java.lang.Object r4 = r4.get(r7)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
        L_0x004a:
            int r2 = r2 - r4
            if (r2 != r3) goto L_0x0066
            int r7 = r6.m18462a(r7)
            com.google.android.gms.common.data.DataHolder r3 = r6.f13259a
            int r3 = r3.mo18045g(r7)
            java.lang.String r4 = r6.mo18086a()
            if (r4 == 0) goto L_0x0066
            com.google.android.gms.common.data.DataHolder r5 = r6.f13259a
            java.lang.String r7 = r5.mo18043f(r4, r7, r3)
            if (r7 != 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r1 = r2
        L_0x0067:
            java.lang.Object r7 = r6.mo18085a(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.C4272i.get(int):java.lang.Object");
    }

    @C4056a
    public int getCount() {
        m18463c();
        return this.f13270N.size();
    }
}
