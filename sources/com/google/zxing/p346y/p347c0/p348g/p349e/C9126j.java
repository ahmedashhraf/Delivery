package com.google.zxing.p346y.p347c0.p348g.p349e;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.p335u.C9043a;

/* renamed from: com.google.zxing.y.c0.g.e.j */
/* compiled from: AbstractExpandedDecoder */
public abstract class C9126j {

    /* renamed from: a */
    private final C9043a f23939a;

    /* renamed from: b */
    private final C9136s f23940b;

    C9126j(C9043a aVar) {
        this.f23939a = aVar;
        this.f23940b = new C9136s(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C9136s mo33164a() {
        return this.f23940b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C9043a mo33165b() {
        return this.f23939a;
    }

    /* renamed from: c */
    public abstract String mo33160c() throws NotFoundException, FormatException;

    /* renamed from: a */
    public static C9126j m42666a(C9043a aVar) {
        if (aVar.mo32974b(1)) {
            return new C9123g(aVar);
        }
        if (!aVar.mo32974b(2)) {
            return new C9127k(aVar);
        }
        int a = C9136s.m42697a(aVar, 1, 4);
        if (a == 4) {
            return new C9117a(aVar);
        }
        if (a == 5) {
            return new C9118b(aVar);
        }
        int a2 = C9136s.m42697a(aVar, 1, 5);
        if (a2 == 12) {
            return new C9119c(aVar);
        }
        if (a2 == 13) {
            return new C9120d(aVar);
        }
        String str = "17";
        String str2 = "15";
        String str3 = "13";
        String str4 = "11";
        String str5 = "320";
        String str6 = "310";
        switch (C9136s.m42697a(aVar, 1, 7)) {
            case 56:
                return new C9121e(aVar, str6, str4);
            case 57:
                return new C9121e(aVar, str5, str4);
            case 58:
                return new C9121e(aVar, str6, str3);
            case 59:
                return new C9121e(aVar, str5, str3);
            case 60:
                return new C9121e(aVar, str6, str2);
            case 61:
                return new C9121e(aVar, str5, str2);
            case 62:
                return new C9121e(aVar, str6, str);
            case 63:
                return new C9121e(aVar, str5, str);
            default:
                StringBuilder sb = new StringBuilder("unknown decoder: ");
                sb.append(aVar);
                throw new IllegalStateException(sb.toString());
        }
    }
}
