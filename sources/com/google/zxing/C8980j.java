package com.google.zxing;

import com.google.zxing.p325a0.C8931b;
import com.google.zxing.p329s.C8992c;
import com.google.zxing.p335u.C9044b;
import com.google.zxing.p337v.C9059b;
import com.google.zxing.p346y.C9104b;
import com.google.zxing.p346y.C9105b0;
import com.google.zxing.p346y.C9137d;
import com.google.zxing.p346y.C9140f;
import com.google.zxing.p346y.C9142h;
import com.google.zxing.p346y.C9144j;
import com.google.zxing.p346y.C9146l;
import com.google.zxing.p346y.C9149o;
import com.google.zxing.p346y.C9155u;
import com.google.zxing.p350z.C9164d;
import java.util.Map;

/* renamed from: com.google.zxing.j */
/* compiled from: MultiFormatWriter */
public final class C8980j implements C8989r {

    /* renamed from: com.google.zxing.j$a */
    /* compiled from: MultiFormatWriter */
    static /* synthetic */ class C8981a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23481a = new int[C8929a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|(3:25|26|28)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0086 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0092 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.google.zxing.a[] r0 = com.google.zxing.C8929a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23481a = r0
                int[] r0 = f23481a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.google.zxing.a r1 = com.google.zxing.C8929a.EAN_8     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f23481a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.zxing.a r1 = com.google.zxing.C8929a.UPC_E     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f23481a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.google.zxing.a r1 = com.google.zxing.C8929a.EAN_13     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f23481a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.google.zxing.a r1 = com.google.zxing.C8929a.UPC_A     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f23481a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.google.zxing.a r1 = com.google.zxing.C8929a.QR_CODE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f23481a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.google.zxing.a r1 = com.google.zxing.C8929a.CODE_39     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f23481a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.google.zxing.a r1 = com.google.zxing.C8929a.CODE_93     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f23481a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.google.zxing.a r1 = com.google.zxing.C8929a.CODE_128     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f23481a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.google.zxing.a r1 = com.google.zxing.C8929a.ITF     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f23481a     // Catch:{ NoSuchFieldError -> 0x007a }
                com.google.zxing.a r1 = com.google.zxing.C8929a.PDF_417     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r0 = f23481a     // Catch:{ NoSuchFieldError -> 0x0086 }
                com.google.zxing.a r1 = com.google.zxing.C8929a.CODABAR     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                int[] r0 = f23481a     // Catch:{ NoSuchFieldError -> 0x0092 }
                com.google.zxing.a r1 = com.google.zxing.C8929a.DATA_MATRIX     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                int[] r0 = f23481a     // Catch:{ NoSuchFieldError -> 0x009e }
                com.google.zxing.a r1 = com.google.zxing.C8929a.AZTEC     // Catch:{ NoSuchFieldError -> 0x009e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009e }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009e }
            L_0x009e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.C8980j.C8981a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public C9044b mo32673a(String str, C8929a aVar, int i, int i2) throws WriterException {
        return mo32674a(str, aVar, i, i2, null);
    }

    /* renamed from: a */
    public C9044b mo32674a(String str, C8929a aVar, int i, int i2, Map<C8976f, ?> map) throws WriterException {
        C8989r rVar;
        switch (C8981a.f23481a[aVar.ordinal()]) {
            case 1:
                rVar = new C9146l();
                break;
            case 2:
                rVar = new C9105b0();
                break;
            case 3:
                rVar = new C9144j();
                break;
            case 4:
                rVar = new C9155u();
                break;
            case 5:
                rVar = new C8931b();
                break;
            case 6:
                rVar = new C9140f();
                break;
            case 7:
                rVar = new C9142h();
                break;
            case 8:
                rVar = new C9137d();
                break;
            case 9:
                rVar = new C9149o();
                break;
            case 10:
                rVar = new C9164d();
                break;
            case 11:
                rVar = new C9104b();
                break;
            case 12:
                rVar = new C9059b();
                break;
            case 13:
                rVar = new C8992c();
                break;
            default:
                StringBuilder sb = new StringBuilder("No encoder available for format ");
                sb.append(aVar);
                throw new IllegalArgumentException(sb.toString());
        }
        return rVar.mo32674a(str, aVar, i, i2, map);
    }
}
