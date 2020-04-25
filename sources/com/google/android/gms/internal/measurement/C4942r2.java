package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4910p2;
import com.google.android.gms.internal.measurement.C4942r2;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.r2 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public abstract class C4942r2<MessageType extends C4910p2<MessageType, BuilderType>, BuilderType extends C4942r2<MessageType, BuilderType>> implements C4932q5 {
    /* renamed from: a */
    public abstract BuilderType mo19059a(C4872m3 m3Var, C5005u3 u3Var) throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract BuilderType mo19060a(MessageType messagetype);

    /* renamed from: a */
    public BuilderType mo19061a(byte[] bArr, int i, int i2) throws zzfn {
        try {
            C4872m3 a = C4872m3.m20650a(bArr, 0, i2, false);
            mo19059a(a, C5005u3.m21602a());
            a.mo19273a(0);
            return this;
        } catch (zzfn e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(mo19214a("byte array"), e2);
        }
    }

    /* renamed from: f */
    public abstract BuilderType clone();

    /* renamed from: a */
    public BuilderType mo19062a(byte[] bArr, int i, int i2, C5005u3 u3Var) throws zzfn {
        try {
            C4872m3 a = C4872m3.m20650a(bArr, 0, i2, false);
            mo19059a(a, u3Var);
            a.mo19273a(0);
            return this;
        } catch (zzfn e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(mo19214a("byte array"), e2);
        }
    }

    /* renamed from: a */
    private final String mo19214a(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 60 + String.valueOf(str).length());
        sb.append("Reading ");
        sb.append(name);
        sb.append(" from a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ C4932q5 mo19393a(C4945r5 r5Var) {
        if (mo19053j().getClass().isInstance(r5Var)) {
            return mo19060a((MessageType) (C4910p2) r5Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* renamed from: a */
    public final /* synthetic */ C4932q5 mo19395a(byte[] bArr, C5005u3 u3Var) throws zzfn {
        return mo19062a(bArr, 0, bArr.length, u3Var);
    }

    /* renamed from: a */
    public final /* synthetic */ C4932q5 mo19394a(byte[] bArr) throws zzfn {
        return mo19061a(bArr, 0, bArr.length);
    }
}
