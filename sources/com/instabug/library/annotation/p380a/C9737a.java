package com.instabug.library.annotation.p380a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathMeasure;
import androidx.core.p024e.p025b.C0886a;
import androidx.core.p034l.C0962e0;
import com.instabug.library.annotation.p380a.C9742e.C9743a;
import com.instabug.library.annotation.p380a.C9745g.C9746a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.annotation.a.a */
/* compiled from: Matcher */
public class C9737a {

    /* renamed from: i */
    private static transient /* synthetic */ boolean[] f25814i;

    /* renamed from: a */
    private int f25815a;

    /* renamed from: b */
    private int f25816b;

    /* renamed from: c */
    private int f25817c;

    /* renamed from: d */
    private int f25818d;

    /* renamed from: e */
    private int f25819e;

    /* renamed from: f */
    private float f25820f;

    /* renamed from: g */
    private final Path f25821g;

    /* renamed from: h */
    private Paint f25822h = new Paint();

    public C9737a(Path path) {
        boolean[] b = m45391b();
        b[0] = true;
        b[1] = true;
        this.f25822h.setStyle(Style.STROKE);
        b[2] = true;
        this.f25822h.setStrokeWidth(2.0f);
        b[3] = true;
        this.f25821g = C9744f.m45402a(path);
        b[4] = true;
        m45389a(this.f25821g);
        b[5] = true;
    }

    /* renamed from: a */
    private void m45389a(Path path) {
        boolean[] b = m45391b();
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        b[6] = true;
        this.f25820f = pathMeasure.getLength();
        b[7] = true;
        Bitmap createBitmap = Bitmap.createBitmap(28, 28, Config.ARGB_8888);
        b[8] = true;
        Canvas canvas = new Canvas(createBitmap);
        b[9] = true;
        this.f25822h.setColor(C0886a.f4059c);
        b[10] = true;
        canvas.drawPath(path, this.f25822h);
        int[] iArr = new int[784];
        b[11] = true;
        createBitmap.getPixels(iArr, 0, 28, 0, 0, 28, 28);
        b[12] = true;
        while (i < iArr.length) {
            if (iArr[i] != -65536) {
                b[13] = true;
            } else {
                this.f25815a++;
                if (i < iArr.length / 2) {
                    this.f25817c++;
                    b[14] = true;
                } else {
                    this.f25819e++;
                    b[15] = true;
                }
                if (i % 28 < 14) {
                    this.f25816b++;
                    b[16] = true;
                } else {
                    this.f25818d++;
                    b[17] = true;
                }
            }
            i++;
            b[18] = true;
        }
        b[19] = true;
    }

    /* renamed from: b */
    private List<C9745g> m45390b(Path path) {
        boolean[] b = m45391b();
        ArrayList arrayList = new ArrayList();
        b[38] = true;
        Path a = C9738b.m45394a();
        b[39] = true;
        int i = 0;
        while (i < 36) {
            int i2 = i * 10;
            b[40] = true;
            C9745g a2 = m45387a(C9744f.m45403a(a, i2), path);
            a2.f25848b = i2;
            b[41] = true;
            arrayList.add(a2);
            i++;
            b[42] = true;
        }
        b[43] = true;
        return arrayList;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m45391b() {
        boolean[] zArr = f25814i;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-2496489639422906061L, "com/instabug/library/annotation/recognition/Matcher", 87);
        f25814i = a;
        return a;
    }

    /* renamed from: a */
    private C9745g m45387a(Path path, Path path2) {
        boolean[] b = m45391b();
        Bitmap createBitmap = Bitmap.createBitmap(28, 28, Config.ARGB_8888);
        b[20] = true;
        Canvas canvas = new Canvas(createBitmap);
        b[21] = true;
        this.f25822h.setColor(C0962e0.f4343t);
        b[22] = true;
        canvas.drawPath(path, this.f25822h);
        int[] iArr = new int[784];
        b[23] = true;
        int[] iArr2 = iArr;
        createBitmap.getPixels(iArr, 0, 28, 0, 0, 28, 28);
        int length = iArr2.length;
        b[24] = true;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (iArr2[i] != -16777216) {
                b[25] = true;
            } else {
                i2++;
                b[26] = true;
            }
            i++;
            b[27] = true;
        }
        this.f25822h.setColor(-2130706433);
        b[28] = true;
        canvas.drawPath(path2, this.f25822h);
        int[] iArr3 = new int[784];
        b[29] = true;
        int width = createBitmap.getWidth();
        int i3 = i2;
        createBitmap.getPixels(iArr3, 0, width, 0, 0, 28, 28);
        b[30] = true;
        C9745g gVar = new C9745g();
        int length2 = iArr3.length;
        b[31] = true;
        int i4 = 0;
        int i5 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        while (i4 < length2) {
            int i6 = iArr3[i4];
            if (i6 == -8355712) {
                i5++;
                b[32] = true;
            } else if (i6 == -2130706433) {
                f += 1.0f;
                b[33] = true;
            } else if (i6 != -16777216) {
                b[34] = true;
            } else {
                f2 += 1.0f;
                b[35] = true;
            }
            i4++;
            b[36] = true;
        }
        gVar.f25847a = i5;
        gVar.f25840Q = f / ((float) this.f25815a);
        float f3 = (float) i3;
        gVar.f25841R = f2 / f3;
        gVar.f25837N = ((((1.0f - gVar.f25841R) + 1.0f) - gVar.f25840Q) + (((float) i5) / f3)) / 3.0f;
        gVar.f25842S = this.f25816b;
        gVar.f25843T = this.f25817c;
        gVar.f25844U = this.f25818d;
        gVar.f25845V = this.f25819e;
        gVar.f25846W = this.f25820f;
        b[37] = true;
        return gVar;
    }

    /* renamed from: a */
    private List<C9745g> m45388a(C9743a aVar, int i, int i2, int i3) {
        boolean[] b = m45391b();
        ArrayList arrayList = new ArrayList();
        b[44] = true;
        List<C9741d> a = C9738b.m45395a(aVar);
        b[45] = true;
        b[46] = true;
        for (C9741d dVar : a) {
            b[47] = true;
            int i4 = i;
            while (true) {
                if (i4 >= i2) {
                    b[48] = true;
                    break;
                }
                int i5 = i4 * i3;
                b[49] = true;
                C9745g a2 = m45387a(C9744f.m45403a(dVar.f25832a, i5), this.f25821g);
                a2.f25848b = i5;
                a2.f25839P = dVar.f25833b;
                b[50] = true;
                arrayList.add(a2);
                if (aVar == C9743a.OVAL) {
                    if (dVar.f25833b == 0.0f) {
                        b[53] = true;
                        break;
                    }
                    b[52] = true;
                } else {
                    b[51] = true;
                }
                i4++;
                b[54] = true;
            }
            b[55] = true;
        }
        b[56] = true;
        return arrayList;
    }

    /* renamed from: a */
    public C9745g mo34758a(C9743a aVar) {
        boolean[] b = m45391b();
        List a = m45388a(aVar, 0, 18, 10);
        b[57] = true;
        C9745g gVar = (C9745g) Collections.max(a);
        b[58] = true;
        gVar.f25838O = m45386a(a);
        b[59] = true;
        return gVar;
    }

    /* renamed from: a */
    public C9745g mo34757a() {
        C9745g gVar;
        boolean[] b = m45391b();
        List b2 = m45390b(this.f25821g);
        b[60] = true;
        C9745g gVar2 = (C9745g) Collections.max(b2);
        int i = gVar2.f25848b;
        if (i < 0) {
            b[61] = true;
        } else if (i <= 20) {
            b[62] = true;
            b[78] = true;
            return gVar2;
        } else {
            b[63] = true;
        }
        int i2 = gVar2.f25848b;
        if (i2 > 360) {
            b[64] = true;
        } else if (i2 >= 340) {
            b[65] = true;
            b[78] = true;
            return gVar2;
        } else {
            b[66] = true;
        }
        int i3 = gVar2.f25848b;
        if (i3 < 160) {
            b[67] = true;
        } else if (i3 <= 200) {
            b[68] = true;
            b[78] = true;
            return gVar2;
        } else {
            b[69] = true;
        }
        if (gVar2.f25848b <= 180) {
            b[70] = true;
        } else {
            b[71] = true;
            if (gVar2.mo34761b() == C9746a.TOP) {
                b[72] = true;
                b[78] = true;
                return gVar2;
            }
            b[73] = true;
        }
        if (gVar2.f25848b >= 180) {
            b[74] = true;
        } else {
            b[75] = true;
            if (gVar2.mo34761b() != C9746a.BOTTOM) {
                b[76] = true;
            } else {
                b[77] = true;
                b[78] = true;
                return gVar2;
            }
        }
        int i4 = gVar2.f25848b;
        if (i4 < 180) {
            b[79] = true;
            gVar = (C9745g) b2.get((i4 + 180) / 10);
            b[80] = true;
        } else {
            gVar = (C9745g) b2.get((i4 - 180) / 10);
            b[81] = true;
        }
        gVar.f25838O = m45386a(b2);
        b[82] = true;
        return gVar;
    }

    /* renamed from: a */
    private float m45386a(List<C9745g> list) {
        boolean[] b = m45391b();
        b[83] = true;
        b[84] = true;
        float f = 0.0f;
        for (C9745g gVar : list) {
            f += gVar.f25837N;
            b[85] = true;
        }
        float size = f / ((float) list.size());
        b[86] = true;
        return size;
    }
}
