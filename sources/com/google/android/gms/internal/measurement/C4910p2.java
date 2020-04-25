package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4910p2;
import com.google.android.gms.internal.measurement.C4942r2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.p2 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public abstract class C4910p2<MessageType extends C4910p2<MessageType, BuilderType>, BuilderType extends C4942r2<MessageType, BuilderType>> implements C4945r5 {
    protected int zza = 0;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo19043a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final C5070z2 mo19358e() {
        try {
            C4800i3 f = C5070z2.m21873f(mo19045b());
            mo19044a(f.mo19041b());
            return f.mo19040a();
        } catch (IOException e) {
            String str = "ByteString";
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + str.length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append(str);
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: f */
    public final byte[] mo19359f() {
        try {
            byte[] bArr = new byte[mo19045b()];
            zzek a = zzek.m21923a(bArr);
            mo19044a(a);
            a.mo19795b();
            return bArr;
        } catch (IOException e) {
            String str = "byte array";
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + str.length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append(str);
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo19049g() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    protected static <T> void m20917a(Iterable<T> iterable, List<? super T> list) {
        C4819j4.m20394a(iterable);
        String str = " is null.";
        String str2 = "Element at index ";
        if (iterable instanceof C5046x4) {
            List i = ((C5046x4) iterable).mo18924i();
            C5046x4 x4Var = (C5046x4) list;
            int size = list.size();
            for (Object next : i) {
                if (next == null) {
                    int size2 = x4Var.size() - size;
                    StringBuilder sb = new StringBuilder(37);
                    sb.append(str2);
                    sb.append(size2);
                    sb.append(str);
                    String sb2 = sb.toString();
                    for (int size3 = x4Var.size() - 1; size3 >= size; size3--) {
                        x4Var.remove(size3);
                    }
                    throw new NullPointerException(sb2);
                } else if (next instanceof C5070z2) {
                    x4Var.mo18920a((C5070z2) next);
                } else {
                    x4Var.add((String) next);
                }
            }
        } else if (iterable instanceof C4726d6) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size4 = list.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    int size5 = list.size() - size4;
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append(str2);
                    sb3.append(size5);
                    sb3.append(str);
                    String sb4 = sb3.toString();
                    for (int size6 = list.size() - 1; size6 >= size4; size6--) {
                        list.remove(size6);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(next2);
            }
        }
    }
}
