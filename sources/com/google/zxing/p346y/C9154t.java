package com.google.zxing.p346y;

import com.google.zxing.C8929a;
import com.google.zxing.C8969c;
import com.google.zxing.C8974d;
import com.google.zxing.C8985n;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.p335u.C9043a;
import java.util.Map;

/* renamed from: com.google.zxing.y.t */
/* compiled from: UPCAReader */
public final class C9154t extends C9159y {

    /* renamed from: k */
    private final C9159y f24010k = new C9143i();

    /* renamed from: a */
    public C8985n mo33194a(int i, C9043a aVar, int[] iArr, Map<C8974d, ?> map) throws NotFoundException, FormatException, ChecksumException {
        return m42775a(this.f24010k.mo33194a(i, aVar, iArr, map));
    }

    /* renamed from: a */
    public C8985n mo33114a(int i, C9043a aVar, Map<C8974d, ?> map) throws NotFoundException, FormatException, ChecksumException {
        return m42775a(this.f24010k.mo33114a(i, aVar, map));
    }

    /* renamed from: a */
    public C8985n mo32670a(C8969c cVar) throws NotFoundException, FormatException {
        return m42775a(this.f24010k.mo32670a(cVar));
    }

    /* renamed from: a */
    public C8985n mo32671a(C8969c cVar, Map<C8974d, ?> map) throws NotFoundException, FormatException {
        return m42775a(this.f24010k.mo32671a(cVar, map));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8929a mo33116a() {
        return C8929a.UPC_A;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo33115a(C9043a aVar, int[] iArr, StringBuilder sb) throws NotFoundException {
        return this.f24010k.mo33115a(aVar, iArr, sb);
    }

    /* renamed from: a */
    private static C8985n m42775a(C8985n nVar) throws FormatException {
        String f = nVar.mo32827f();
        if (f.charAt(0) == '0') {
            return new C8985n(f.substring(1), null, nVar.mo32826e(), C8929a.UPC_A);
        }
        throw FormatException.m41710a();
    }
}
