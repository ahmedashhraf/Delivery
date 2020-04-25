package com.theartofdev.edmodo.cropper;

import android.graphics.RectF;
import com.theartofdev.edmodo.cropper.C12089g.C12091b;
import com.theartofdev.edmodo.cropper.CropImageView.C12062c;

/* renamed from: com.theartofdev.edmodo.cropper.f */
/* compiled from: CropWindowHandler */
final class C12088f {

    /* renamed from: a */
    private final RectF f34973a = new RectF();

    /* renamed from: b */
    private final RectF f34974b = new RectF();

    /* renamed from: c */
    private float f34975c;

    /* renamed from: d */
    private float f34976d;

    /* renamed from: e */
    private float f34977e;

    /* renamed from: f */
    private float f34978f;

    /* renamed from: g */
    private float f34979g;

    /* renamed from: h */
    private float f34980h;

    /* renamed from: i */
    private float f34981i;

    /* renamed from: j */
    private float f34982j;

    /* renamed from: k */
    private float f34983k = 1.0f;

    /* renamed from: l */
    private float f34984l = 1.0f;

    C12088f() {
    }

    /* renamed from: a */
    private static boolean m54631a(float f, float f2, float f3, float f4, float f5, float f6) {
        return f > f3 && f < f5 && f2 > f4 && f2 < f6;
    }

    /* renamed from: i */
    private boolean m54634i() {
        return !mo41432h();
    }

    /* renamed from: a */
    public float mo41419a() {
        return Math.min(this.f34978f, this.f34982j / this.f34984l);
    }

    /* renamed from: b */
    public float mo41425b() {
        return Math.min(this.f34977e, this.f34981i / this.f34983k);
    }

    /* renamed from: c */
    public float mo41427c() {
        return Math.max(this.f34976d, this.f34980h / this.f34984l);
    }

    /* renamed from: d */
    public float mo41428d() {
        return Math.max(this.f34975c, this.f34979g / this.f34983k);
    }

    /* renamed from: e */
    public RectF mo41429e() {
        this.f34974b.set(this.f34973a);
        return this.f34974b;
    }

    /* renamed from: f */
    public float mo41430f() {
        return this.f34984l;
    }

    /* renamed from: g */
    public float mo41431g() {
        return this.f34983k;
    }

    /* renamed from: h */
    public boolean mo41432h() {
        return this.f34973a.width() >= 100.0f && this.f34973a.height() >= 100.0f;
    }

    /* renamed from: c */
    private static boolean m54633c(float f, float f2, float f3, float f4, float f5, float f6) {
        return Math.abs(f - f3) <= f6 && f2 > f4 && f2 < f5;
    }

    /* renamed from: a */
    public void mo41422a(int i, int i2) {
        this.f34981i = (float) i;
        this.f34982j = (float) i2;
    }

    /* renamed from: b */
    public void mo41426b(int i, int i2) {
        this.f34979g = (float) i;
        this.f34980h = (float) i2;
    }

    /* renamed from: b */
    private static boolean m54632b(float f, float f2, float f3, float f4, float f5, float f6) {
        return f > f3 && f < f4 && Math.abs(f2 - f5) <= f6;
    }

    /* renamed from: a */
    public void mo41421a(float f, float f2, float f3, float f4) {
        this.f34977e = f;
        this.f34978f = f2;
        this.f34983k = f3;
        this.f34984l = f4;
    }

    /* renamed from: a */
    public void mo41424a(CropImageOptions cropImageOptions) {
        this.f34975c = (float) cropImageOptions.f34811i0;
        this.f34976d = (float) cropImageOptions.f34812j0;
        this.f34979g = (float) cropImageOptions.f34813k0;
        this.f34980h = (float) cropImageOptions.f34814l0;
        this.f34981i = (float) cropImageOptions.f34815m0;
        this.f34982j = (float) cropImageOptions.f34816n0;
    }

    /* renamed from: a */
    public void mo41423a(RectF rectF) {
        this.f34973a.set(rectF);
    }

    /* renamed from: a */
    public C12089g mo41420a(float f, float f2, float f3, C12062c cVar) {
        C12091b bVar;
        if (cVar == C12062c.OVAL) {
            bVar = m54628a(f, f2);
        } else {
            bVar = m54629a(f, f2, f3);
        }
        if (bVar != null) {
            return new C12089g(bVar, this, f, f2);
        }
        return null;
    }

    /* renamed from: a */
    private C12091b m54629a(float f, float f2, float f3) {
        RectF rectF = this.f34973a;
        if (m54630a(f, f2, rectF.left, rectF.top, f3)) {
            return C12091b.TOP_LEFT;
        }
        RectF rectF2 = this.f34973a;
        if (m54630a(f, f2, rectF2.right, rectF2.top, f3)) {
            return C12091b.TOP_RIGHT;
        }
        RectF rectF3 = this.f34973a;
        if (m54630a(f, f2, rectF3.left, rectF3.bottom, f3)) {
            return C12091b.BOTTOM_LEFT;
        }
        RectF rectF4 = this.f34973a;
        if (m54630a(f, f2, rectF4.right, rectF4.bottom, f3)) {
            return C12091b.BOTTOM_RIGHT;
        }
        RectF rectF5 = this.f34973a;
        if (m54631a(f, f2, rectF5.left, rectF5.top, rectF5.right, rectF5.bottom) && m54634i()) {
            return C12091b.CENTER;
        }
        RectF rectF6 = this.f34973a;
        if (m54632b(f, f2, rectF6.left, rectF6.right, rectF6.top, f3)) {
            return C12091b.TOP;
        }
        RectF rectF7 = this.f34973a;
        if (m54632b(f, f2, rectF7.left, rectF7.right, rectF7.bottom, f3)) {
            return C12091b.BOTTOM;
        }
        RectF rectF8 = this.f34973a;
        if (m54633c(f, f2, rectF8.left, rectF8.top, rectF8.bottom, f3)) {
            return C12091b.LEFT;
        }
        RectF rectF9 = this.f34973a;
        if (m54633c(f, f2, rectF9.right, rectF9.top, rectF9.bottom, f3)) {
            return C12091b.RIGHT;
        }
        RectF rectF10 = this.f34973a;
        if (!m54631a(f, f2, rectF10.left, rectF10.top, rectF10.right, rectF10.bottom) || m54634i()) {
            return null;
        }
        return C12091b.CENTER;
    }

    /* renamed from: a */
    private C12091b m54628a(float f, float f2) {
        float width = this.f34973a.width() / 6.0f;
        RectF rectF = this.f34973a;
        float f3 = rectF.left;
        float f4 = f3 + width;
        float f5 = f3 + (width * 5.0f);
        float height = rectF.height() / 6.0f;
        float f6 = this.f34973a.top;
        float f7 = f6 + height;
        float f8 = f6 + (height * 5.0f);
        if (f < f4) {
            if (f2 < f7) {
                return C12091b.TOP_LEFT;
            }
            if (f2 < f8) {
                return C12091b.LEFT;
            }
            return C12091b.BOTTOM_LEFT;
        } else if (f < f5) {
            if (f2 < f7) {
                return C12091b.TOP;
            }
            if (f2 < f8) {
                return C12091b.CENTER;
            }
            return C12091b.BOTTOM;
        } else if (f2 < f7) {
            return C12091b.TOP_RIGHT;
        } else {
            if (f2 < f8) {
                return C12091b.RIGHT;
            }
            return C12091b.BOTTOM_RIGHT;
        }
    }

    /* renamed from: a */
    private static boolean m54630a(float f, float f2, float f3, float f4, float f5) {
        return Math.abs(f - f3) <= f5 && Math.abs(f2 - f4) <= f5;
    }
}
