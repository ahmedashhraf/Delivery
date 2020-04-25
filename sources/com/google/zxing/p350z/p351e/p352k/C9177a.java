package com.google.zxing.p350z.p351e.p352k;

import com.google.zxing.ChecksumException;

/* renamed from: com.google.zxing.z.e.k.a */
/* compiled from: ErrorCorrection */
public final class C9177a {

    /* renamed from: a */
    private final C9178b f24106a = C9178b.f24107f;

    /* renamed from: a */
    public int mo33254a(int[] iArr, int i, int[] iArr2) throws ChecksumException {
        C9179c cVar = new C9179c(this.f24106a, iArr);
        int[] iArr3 = new int[i];
        int i2 = 0;
        boolean z = false;
        for (int i3 = i; i3 > 0; i3--) {
            int a = cVar.mo33265a(this.f24106a.mo33255a(i3));
            iArr3[i - i3] = a;
            if (a != 0) {
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        C9179c a2 = this.f24106a.mo33257a();
        if (iArr2 != null) {
            C9179c cVar2 = a2;
            for (int length : iArr2) {
                int a3 = this.f24106a.mo33255a((iArr.length - 1) - length);
                C9178b bVar = this.f24106a;
                cVar2 = cVar2.mo33271b(new C9179c(bVar, new int[]{bVar.mo33264d(0, a3), 1}));
            }
        }
        C9179c[] a4 = m42930a(this.f24106a.mo33260b(i, 1), new C9179c(this.f24106a, iArr3), i);
        C9179c cVar3 = a4[0];
        C9179c cVar4 = a4[1];
        int[] a5 = m42928a(cVar3);
        int[] a6 = m42929a(cVar4, cVar3, a5);
        while (i2 < a5.length) {
            int length2 = (iArr.length - 1) - this.f24106a.mo33261c(a5[i2]);
            if (length2 >= 0) {
                iArr[length2] = this.f24106a.mo33264d(iArr[length2], a6[i2]);
                i2++;
            } else {
                throw ChecksumException.m41708a();
            }
        }
        return a5.length;
    }

    /* renamed from: a */
    private C9179c[] m42930a(C9179c cVar, C9179c cVar2, int i) throws ChecksumException {
        if (cVar.mo33269b() < cVar2.mo33269b()) {
            C9179c cVar3 = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        C9179c c = this.f24106a.mo33263c();
        C9179c a = this.f24106a.mo33257a();
        while (true) {
            C9179c cVar4 = r11;
            r11 = cVar;
            cVar = cVar4;
            C9179c cVar5 = a;
            C9179c cVar6 = c;
            c = cVar5;
            if (cVar.mo33269b() < i / 2) {
                int b = c.mo33270b(0);
                if (b != 0) {
                    int b2 = this.f24106a.mo33259b(b);
                    return new C9179c[]{c.mo33272c(b2), cVar.mo33272c(b2)};
                }
                throw ChecksumException.m41708a();
            } else if (!cVar.mo33274c()) {
                C9179c c2 = this.f24106a.mo33263c();
                int b3 = this.f24106a.mo33259b(cVar.mo33270b(cVar.mo33269b()));
                while (r11.mo33269b() >= cVar.mo33269b() && !r11.mo33274c()) {
                    int b4 = r11.mo33269b() - cVar.mo33269b();
                    int c3 = this.f24106a.mo33262c(r11.mo33270b(r11.mo33269b()), b3);
                    c2 = c2.mo33267a(this.f24106a.mo33260b(b4, c3));
                    r11 = r11.mo33273c(cVar.mo33266a(b4, c3));
                }
                a = c2.mo33271b(c).mo33273c(cVar6).mo33275d();
            } else {
                throw ChecksumException.m41708a();
            }
        }
    }

    /* renamed from: a */
    private int[] m42928a(C9179c cVar) throws ChecksumException {
        int b = cVar.mo33269b();
        int[] iArr = new int[b];
        int i = 0;
        for (int i2 = 1; i2 < this.f24106a.mo33258b() && i < b; i2++) {
            if (cVar.mo33265a(i2) == 0) {
                iArr[i] = this.f24106a.mo33259b(i2);
                i++;
            }
        }
        if (i == b) {
            return iArr;
        }
        throw ChecksumException.m41708a();
    }

    /* renamed from: a */
    private int[] m42929a(C9179c cVar, C9179c cVar2, int[] iArr) {
        int b = cVar2.mo33269b();
        int[] iArr2 = new int[b];
        for (int i = 1; i <= b; i++) {
            iArr2[b - i] = this.f24106a.mo33262c(i, cVar2.mo33270b(i));
        }
        C9179c cVar3 = new C9179c(this.f24106a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int b2 = this.f24106a.mo33259b(iArr[i2]);
            iArr3[i2] = this.f24106a.mo33262c(this.f24106a.mo33264d(0, cVar.mo33265a(b2)), this.f24106a.mo33259b(cVar3.mo33265a(b2)));
        }
        return iArr3;
    }
}
