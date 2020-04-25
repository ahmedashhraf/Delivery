package androidx.vectordrawable.p051a.p052a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import androidx.annotation.C0193h0;
import androidx.annotation.C0198k;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.RequiresApi;
import androidx.collection.C0635a;
import androidx.core.content.p020h.C0863b;
import androidx.core.content.p020h.C0878h;
import androidx.core.graphics.drawable.C0892a;
import androidx.core.p018c.C0823d;
import androidx.core.p018c.C0823d.C0825b;
import androidx.core.p034l.C0962e0;
import com.bogdwellers.pinchtozoom.p153g.C2949b;
import com.fasterxml.jackson.core.p162w.C3868i;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.vectordrawable.a.a.i */
/* compiled from: VectorDrawableCompat */
public class C1979i extends C1978h {

    /* renamed from: V */
    static final String f7606V = "VectorDrawableCompat";

    /* renamed from: W */
    static final Mode f7607W = Mode.SRC_IN;

    /* renamed from: X */
    private static final String f7608X = "clip-path";

    /* renamed from: Y */
    private static final String f7609Y = "group";

    /* renamed from: Z */
    private static final String f7610Z = "path";

    /* renamed from: a0 */
    private static final String f7611a0 = "vector";

    /* renamed from: b0 */
    private static final int f7612b0 = 0;

    /* renamed from: c0 */
    private static final int f7613c0 = 1;

    /* renamed from: d0 */
    private static final int f7614d0 = 2;

    /* renamed from: e0 */
    private static final int f7615e0 = 0;

    /* renamed from: f0 */
    private static final int f7616f0 = 1;

    /* renamed from: g0 */
    private static final int f7617g0 = 2;

    /* renamed from: h0 */
    private static final int f7618h0 = 2048;

    /* renamed from: i0 */
    private static final boolean f7619i0 = false;

    /* renamed from: N */
    private PorterDuffColorFilter f7620N;

    /* renamed from: O */
    private ColorFilter f7621O;

    /* renamed from: P */
    private boolean f7622P;

    /* renamed from: Q */
    private boolean f7623Q;

    /* renamed from: R */
    private ConstantState f7624R;

    /* renamed from: S */
    private final float[] f7625S;

    /* renamed from: T */
    private final Matrix f7626T;

    /* renamed from: U */
    private final Rect f7627U;

    /* renamed from: b */
    private C1987h f7628b;

    /* renamed from: androidx.vectordrawable.a.a.i$b */
    /* compiled from: VectorDrawableCompat */
    private static class C1981b extends C1985f {
        C1981b() {
        }

        /* renamed from: a */
        public void mo8604a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            if (C0878h.m5075a(xmlPullParser, "pathData")) {
                TypedArray a = C0878h.m5069a(resources, theme, attributeSet, C1964a.f7498I);
                m10347a(a, xmlPullParser);
                a.recycle();
            }
        }

        /* renamed from: c */
        public boolean mo8605c() {
            return true;
        }

        C1981b(C1981b bVar) {
            super(bVar);
        }

        /* renamed from: a */
        private void m10347a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f7656b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f7655a = C0823d.m4820a(string2);
            }
            this.f7657c = C0878h.m5077b(typedArray, xmlPullParser, "fillType", 2, 0);
        }
    }

    /* renamed from: androidx.vectordrawable.a.a.i$c */
    /* compiled from: VectorDrawableCompat */
    private static class C1982c extends C1985f {

        /* renamed from: f */
        private int[] f7629f;

        /* renamed from: g */
        C0863b f7630g;

        /* renamed from: h */
        float f7631h = 0.0f;

        /* renamed from: i */
        C0863b f7632i;

        /* renamed from: j */
        float f7633j = 1.0f;

        /* renamed from: k */
        float f7634k = 1.0f;

        /* renamed from: l */
        float f7635l = 0.0f;

        /* renamed from: m */
        float f7636m = 1.0f;

        /* renamed from: n */
        float f7637n = 0.0f;

        /* renamed from: o */
        Cap f7638o = Cap.BUTT;

        /* renamed from: p */
        Join f7639p = Join.MITER;

        /* renamed from: q */
        float f7640q = 4.0f;

        C1982c() {
        }

        /* renamed from: a */
        private Cap m10350a(int i, Cap cap) {
            if (i == 0) {
                return Cap.BUTT;
            }
            if (i != 1) {
                return i != 2 ? cap : Cap.SQUARE;
            }
            return Cap.ROUND;
        }

        /* renamed from: b */
        public boolean mo8610b() {
            return this.f7629f != null;
        }

        /* access modifiers changed from: 0000 */
        public float getFillAlpha() {
            return this.f7634k;
        }

        /* access modifiers changed from: 0000 */
        @C0198k
        public int getFillColor() {
            return this.f7632i.mo4534a();
        }

        /* access modifiers changed from: 0000 */
        public float getStrokeAlpha() {
            return this.f7633j;
        }

        /* access modifiers changed from: 0000 */
        @C0198k
        public int getStrokeColor() {
            return this.f7630g.mo4534a();
        }

        /* access modifiers changed from: 0000 */
        public float getStrokeWidth() {
            return this.f7631h;
        }

        /* access modifiers changed from: 0000 */
        public float getTrimPathEnd() {
            return this.f7636m;
        }

        /* access modifiers changed from: 0000 */
        public float getTrimPathOffset() {
            return this.f7637n;
        }

        /* access modifiers changed from: 0000 */
        public float getTrimPathStart() {
            return this.f7635l;
        }

        /* access modifiers changed from: 0000 */
        public void setFillAlpha(float f) {
            this.f7634k = f;
        }

        /* access modifiers changed from: 0000 */
        public void setFillColor(int i) {
            this.f7632i.mo4535a(i);
        }

        /* access modifiers changed from: 0000 */
        public void setStrokeAlpha(float f) {
            this.f7633j = f;
        }

        /* access modifiers changed from: 0000 */
        public void setStrokeColor(int i) {
            this.f7630g.mo4535a(i);
        }

        /* access modifiers changed from: 0000 */
        public void setStrokeWidth(float f) {
            this.f7631h = f;
        }

        /* access modifiers changed from: 0000 */
        public void setTrimPathEnd(float f) {
            this.f7636m = f;
        }

        /* access modifiers changed from: 0000 */
        public void setTrimPathOffset(float f) {
            this.f7637n = f;
        }

        /* access modifiers changed from: 0000 */
        public void setTrimPathStart(float f) {
            this.f7635l = f;
        }

        /* renamed from: a */
        private Join m10351a(int i, Join join) {
            if (i == 0) {
                return Join.MITER;
            }
            if (i != 1) {
                return i != 2 ? join : Join.BEVEL;
            }
            return Join.ROUND;
        }

        /* renamed from: a */
        public void mo8607a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0878h.m5069a(resources, theme, attributeSet, C1964a.f7554t);
            m10352a(a, xmlPullParser, theme);
            a.recycle();
        }

        /* renamed from: a */
        private void m10352a(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme) {
            this.f7629f = null;
            if (C0878h.m5075a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f7656b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f7655a = C0823d.m4820a(string2);
                }
                Theme theme2 = theme;
                this.f7632i = C0878h.m5071a(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f7634k = C0878h.m5063a(typedArray, xmlPullParser, "fillAlpha", 12, this.f7634k);
                this.f7638o = m10350a(C0878h.m5077b(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f7638o);
                this.f7639p = m10351a(C0878h.m5077b(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f7639p);
                this.f7640q = C0878h.m5063a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f7640q);
                this.f7630g = C0878h.m5071a(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f7633j = C0878h.m5063a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f7633j);
                this.f7631h = C0878h.m5063a(typedArray, xmlPullParser, "strokeWidth", 4, this.f7631h);
                this.f7636m = C0878h.m5063a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f7636m);
                this.f7637n = C0878h.m5063a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f7637n);
                this.f7635l = C0878h.m5063a(typedArray, xmlPullParser, "trimPathStart", 5, this.f7635l);
                this.f7657c = C0878h.m5077b(typedArray, xmlPullParser, "fillType", 13, this.f7657c);
            }
        }

        C1982c(C1982c cVar) {
            super(cVar);
            this.f7629f = cVar.f7629f;
            this.f7630g = cVar.f7630g;
            this.f7631h = cVar.f7631h;
            this.f7633j = cVar.f7633j;
            this.f7632i = cVar.f7632i;
            this.f7657c = cVar.f7657c;
            this.f7634k = cVar.f7634k;
            this.f7635l = cVar.f7635l;
            this.f7636m = cVar.f7636m;
            this.f7637n = cVar.f7637n;
            this.f7638o = cVar.f7638o;
            this.f7639p = cVar.f7639p;
            this.f7640q = cVar.f7640q;
        }

        /* renamed from: a */
        public boolean mo8608a() {
            return this.f7632i.mo4539d() || this.f7630g.mo4539d();
        }

        /* renamed from: a */
        public boolean mo8609a(int[] iArr) {
            return this.f7630g.mo4536a(iArr) | this.f7632i.mo4536a(iArr);
        }

        /* renamed from: a */
        public void mo8606a(Theme theme) {
            if (this.f7629f == null) {
            }
        }
    }

    /* renamed from: androidx.vectordrawable.a.a.i$d */
    /* compiled from: VectorDrawableCompat */
    private static class C1983d extends C1984e {

        /* renamed from: a */
        final Matrix f7641a = new Matrix();

        /* renamed from: b */
        final ArrayList<C1984e> f7642b = new ArrayList<>();

        /* renamed from: c */
        float f7643c = 0.0f;

        /* renamed from: d */
        private float f7644d = 0.0f;

        /* renamed from: e */
        private float f7645e = 0.0f;

        /* renamed from: f */
        private float f7646f = 1.0f;

        /* renamed from: g */
        private float f7647g = 1.0f;

        /* renamed from: h */
        private float f7648h = 0.0f;

        /* renamed from: i */
        private float f7649i = 0.0f;

        /* renamed from: j */
        final Matrix f7650j = new Matrix();

        /* renamed from: k */
        int f7651k;

        /* renamed from: l */
        private int[] f7652l;

        /* renamed from: m */
        private String f7653m = null;

        public C1983d(C1983d dVar, C0635a<String, Object> aVar) {
            C1985f fVar;
            super();
            this.f7643c = dVar.f7643c;
            this.f7644d = dVar.f7644d;
            this.f7645e = dVar.f7645e;
            this.f7646f = dVar.f7646f;
            this.f7647g = dVar.f7647g;
            this.f7648h = dVar.f7648h;
            this.f7649i = dVar.f7649i;
            this.f7652l = dVar.f7652l;
            this.f7653m = dVar.f7653m;
            this.f7651k = dVar.f7651k;
            String str = this.f7653m;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f7650j.set(dVar.f7650j);
            ArrayList<C1984e> arrayList = dVar.f7642b;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof C1983d) {
                    this.f7642b.add(new C1983d((C1983d) obj, aVar));
                } else {
                    if (obj instanceof C1982c) {
                        fVar = new C1982c((C1982c) obj);
                    } else if (obj instanceof C1981b) {
                        fVar = new C1981b((C1981b) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f7642b.add(fVar);
                    String str2 = fVar.f7656b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        /* renamed from: b */
        private void m10359b() {
            this.f7650j.reset();
            this.f7650j.postTranslate(-this.f7644d, -this.f7645e);
            this.f7650j.postScale(this.f7646f, this.f7647g);
            this.f7650j.postRotate(this.f7643c, 0.0f, 0.0f);
            this.f7650j.postTranslate(this.f7648h + this.f7644d, this.f7649i + this.f7645e);
        }

        /* renamed from: a */
        public void mo8627a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0878h.m5069a(resources, theme, attributeSet, C1964a.f7536k);
            m10358a(a, xmlPullParser);
            a.recycle();
        }

        public String getGroupName() {
            return this.f7653m;
        }

        public Matrix getLocalMatrix() {
            return this.f7650j;
        }

        public float getPivotX() {
            return this.f7644d;
        }

        public float getPivotY() {
            return this.f7645e;
        }

        public float getRotation() {
            return this.f7643c;
        }

        public float getScaleX() {
            return this.f7646f;
        }

        public float getScaleY() {
            return this.f7647g;
        }

        public float getTranslateX() {
            return this.f7648h;
        }

        public float getTranslateY() {
            return this.f7649i;
        }

        public void setPivotX(float f) {
            if (f != this.f7644d) {
                this.f7644d = f;
                m10359b();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f7645e) {
                this.f7645e = f;
                m10359b();
            }
        }

        public void setRotation(float f) {
            if (f != this.f7643c) {
                this.f7643c = f;
                m10359b();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f7646f) {
                this.f7646f = f;
                m10359b();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f7647g) {
                this.f7647g = f;
                m10359b();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f7648h) {
                this.f7648h = f;
                m10359b();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f7649i) {
                this.f7649i = f;
                m10359b();
            }
        }

        /* renamed from: a */
        private void m10358a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f7652l = null;
            this.f7643c = C0878h.m5063a(typedArray, xmlPullParser, "rotation", 5, this.f7643c);
            this.f7644d = typedArray.getFloat(1, this.f7644d);
            this.f7645e = typedArray.getFloat(2, this.f7645e);
            this.f7646f = C0878h.m5063a(typedArray, xmlPullParser, "scaleX", 3, this.f7646f);
            this.f7647g = C0878h.m5063a(typedArray, xmlPullParser, "scaleY", 4, this.f7647g);
            this.f7648h = C0878h.m5063a(typedArray, xmlPullParser, C2949b.f10449c, 6, this.f7648h);
            this.f7649i = C0878h.m5063a(typedArray, xmlPullParser, C2949b.f10450d, 7, this.f7649i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f7653m = string;
            }
            m10359b();
        }

        /* renamed from: a */
        public boolean mo8608a() {
            for (int i = 0; i < this.f7642b.size(); i++) {
                if (((C1984e) this.f7642b.get(i)).mo8608a()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo8609a(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f7642b.size(); i++) {
                z |= ((C1984e) this.f7642b.get(i)).mo8609a(iArr);
            }
            return z;
        }

        public C1983d() {
            super();
        }
    }

    /* renamed from: androidx.vectordrawable.a.a.i$e */
    /* compiled from: VectorDrawableCompat */
    private static abstract class C1984e {
        private C1984e() {
        }

        /* renamed from: a */
        public boolean mo8608a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo8609a(int[] iArr) {
            return false;
        }
    }

    /* renamed from: androidx.vectordrawable.a.a.i$f */
    /* compiled from: VectorDrawableCompat */
    private static abstract class C1985f extends C1984e {

        /* renamed from: e */
        protected static final int f7654e = 0;

        /* renamed from: a */
        protected C0825b[] f7655a = null;

        /* renamed from: b */
        String f7656b;

        /* renamed from: c */
        int f7657c = 0;

        /* renamed from: d */
        int f7658d;

        public C1985f() {
            super();
        }

        /* renamed from: a */
        public void mo8645a(int i) {
            String str = "";
            for (int i2 = 0; i2 < i; i2++) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("    ");
                str = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("current path is :");
            sb2.append(this.f7656b);
            sb2.append(" pathData is ");
            sb2.append(mo8644a(this.f7655a));
            sb2.toString();
        }

        /* renamed from: a */
        public void mo8606a(Theme theme) {
        }

        /* renamed from: b */
        public boolean mo8610b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo8605c() {
            return false;
        }

        public C0825b[] getPathData() {
            return this.f7655a;
        }

        public String getPathName() {
            return this.f7656b;
        }

        public void setPathData(C0825b[] bVarArr) {
            if (!C0823d.m4817a(this.f7655a, bVarArr)) {
                this.f7655a = C0823d.m4821a(bVarArr);
            } else {
                C0823d.m4823b(this.f7655a, bVarArr);
            }
        }

        public C1985f(C1985f fVar) {
            super();
            this.f7656b = fVar.f7656b;
            this.f7658d = fVar.f7658d;
            this.f7655a = C0823d.m4821a(fVar.f7655a);
        }

        /* renamed from: a */
        public String mo8644a(C0825b[] bVarArr) {
            String str = C3868i.f12248b;
            int i = 0;
            while (i < bVarArr.length) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(bVarArr[i].f3915a);
                sb.append(":");
                String sb2 = sb.toString();
                float[] fArr = bVarArr[i].f3916b;
                String str2 = sb2;
                for (float append : fArr) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str2);
                    sb3.append(append);
                    sb3.append(",");
                    str2 = sb3.toString();
                }
                i++;
                str = str2;
            }
            return str;
        }

        /* renamed from: a */
        public void mo8646a(Path path) {
            path.reset();
            C0825b[] bVarArr = this.f7655a;
            if (bVarArr != null) {
                C0825b.m4828a(bVarArr, path);
            }
        }
    }

    /* renamed from: androidx.vectordrawable.a.a.i$g */
    /* compiled from: VectorDrawableCompat */
    private static class C1986g {

        /* renamed from: q */
        private static final Matrix f7659q = new Matrix();

        /* renamed from: a */
        private final Path f7660a;

        /* renamed from: b */
        private final Path f7661b;

        /* renamed from: c */
        private final Matrix f7662c;

        /* renamed from: d */
        Paint f7663d;

        /* renamed from: e */
        Paint f7664e;

        /* renamed from: f */
        private PathMeasure f7665f;

        /* renamed from: g */
        private int f7666g;

        /* renamed from: h */
        final C1983d f7667h;

        /* renamed from: i */
        float f7668i;

        /* renamed from: j */
        float f7669j;

        /* renamed from: k */
        float f7670k;

        /* renamed from: l */
        float f7671l;

        /* renamed from: m */
        int f7672m;

        /* renamed from: n */
        String f7673n;

        /* renamed from: o */
        Boolean f7674o;

        /* renamed from: p */
        final C0635a<String, Object> f7675p;

        public C1986g() {
            this.f7662c = new Matrix();
            this.f7668i = 0.0f;
            this.f7669j = 0.0f;
            this.f7670k = 0.0f;
            this.f7671l = 0.0f;
            this.f7672m = 255;
            this.f7673n = null;
            this.f7674o = null;
            this.f7675p = new C0635a<>();
            this.f7667h = new C1983d();
            this.f7660a = new Path();
            this.f7661b = new Path();
        }

        /* renamed from: a */
        private static float m10371a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: a */
        private void m10373a(C1983d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.f7641a.set(matrix);
            dVar.f7641a.preConcat(dVar.f7650j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f7642b.size(); i3++) {
                C1984e eVar = (C1984e) dVar.f7642b.get(i3);
                if (eVar instanceof C1983d) {
                    m10373a((C1983d) eVar, dVar.f7641a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof C1985f) {
                    m10374a(dVar, (C1985f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f7672m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f7672m = i;
        }

        /* renamed from: a */
        public void mo8650a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m10373a(this.f7667h, f7659q, canvas, i, i2, colorFilter);
        }

        public C1986g(C1986g gVar) {
            this.f7662c = new Matrix();
            this.f7668i = 0.0f;
            this.f7669j = 0.0f;
            this.f7670k = 0.0f;
            this.f7671l = 0.0f;
            this.f7672m = 255;
            this.f7673n = null;
            this.f7674o = null;
            this.f7675p = new C0635a<>();
            this.f7667h = new C1983d(gVar.f7667h, this.f7675p);
            this.f7660a = new Path(gVar.f7660a);
            this.f7661b = new Path(gVar.f7661b);
            this.f7668i = gVar.f7668i;
            this.f7669j = gVar.f7669j;
            this.f7670k = gVar.f7670k;
            this.f7671l = gVar.f7671l;
            this.f7666g = gVar.f7666g;
            this.f7672m = gVar.f7672m;
            this.f7673n = gVar.f7673n;
            String str = gVar.f7673n;
            if (str != null) {
                this.f7675p.put(str, this);
            }
            this.f7674o = gVar.f7674o;
        }

        /* renamed from: a */
        private void m10374a(C1983d dVar, C1985f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.f7670k;
            float f2 = ((float) i2) / this.f7671l;
            float min = Math.min(f, f2);
            Matrix matrix = dVar.f7641a;
            this.f7662c.set(matrix);
            this.f7662c.postScale(f, f2);
            float a = m10372a(matrix);
            if (a != 0.0f) {
                fVar.mo8646a(this.f7660a);
                Path path = this.f7660a;
                this.f7661b.reset();
                if (fVar.mo8605c()) {
                    this.f7661b.setFillType(fVar.f7657c == 0 ? FillType.WINDING : FillType.EVEN_ODD);
                    this.f7661b.addPath(path, this.f7662c);
                    canvas.clipPath(this.f7661b);
                } else {
                    C1982c cVar = (C1982c) fVar;
                    if (!(cVar.f7635l == 0.0f && cVar.f7636m == 1.0f)) {
                        float f3 = cVar.f7635l;
                        float f4 = cVar.f7637n;
                        float f5 = (f3 + f4) % 1.0f;
                        float f6 = (cVar.f7636m + f4) % 1.0f;
                        if (this.f7665f == null) {
                            this.f7665f = new PathMeasure();
                        }
                        this.f7665f.setPath(this.f7660a, false);
                        float length = this.f7665f.getLength();
                        float f7 = f5 * length;
                        float f8 = f6 * length;
                        path.reset();
                        if (f7 > f8) {
                            this.f7665f.getSegment(f7, length, path, true);
                            this.f7665f.getSegment(0.0f, f8, path, true);
                        } else {
                            this.f7665f.getSegment(f7, f8, path, true);
                        }
                        path.rLineTo(0.0f, 0.0f);
                    }
                    this.f7661b.addPath(path, this.f7662c);
                    if (cVar.f7632i.mo4540e()) {
                        C0863b bVar = cVar.f7632i;
                        if (this.f7664e == null) {
                            this.f7664e = new Paint(1);
                            this.f7664e.setStyle(Style.FILL);
                        }
                        Paint paint = this.f7664e;
                        if (bVar.mo4538c()) {
                            Shader b = bVar.mo4537b();
                            b.setLocalMatrix(this.f7662c);
                            paint.setShader(b);
                            paint.setAlpha(Math.round(cVar.f7634k * 255.0f));
                        } else {
                            paint.setShader(null);
                            paint.setAlpha(255);
                            paint.setColor(C1979i.m10336a(bVar.mo4534a(), cVar.f7634k));
                        }
                        paint.setColorFilter(colorFilter);
                        this.f7661b.setFillType(cVar.f7657c == 0 ? FillType.WINDING : FillType.EVEN_ODD);
                        canvas.drawPath(this.f7661b, paint);
                    }
                    if (cVar.f7630g.mo4540e()) {
                        C0863b bVar2 = cVar.f7630g;
                        if (this.f7663d == null) {
                            this.f7663d = new Paint(1);
                            this.f7663d.setStyle(Style.STROKE);
                        }
                        Paint paint2 = this.f7663d;
                        Join join = cVar.f7639p;
                        if (join != null) {
                            paint2.setStrokeJoin(join);
                        }
                        Cap cap = cVar.f7638o;
                        if (cap != null) {
                            paint2.setStrokeCap(cap);
                        }
                        paint2.setStrokeMiter(cVar.f7640q);
                        if (bVar2.mo4538c()) {
                            Shader b2 = bVar2.mo4537b();
                            b2.setLocalMatrix(this.f7662c);
                            paint2.setShader(b2);
                            paint2.setAlpha(Math.round(cVar.f7633j * 255.0f));
                        } else {
                            paint2.setShader(null);
                            paint2.setAlpha(255);
                            paint2.setColor(C1979i.m10336a(bVar2.mo4534a(), cVar.f7633j));
                        }
                        paint2.setColorFilter(colorFilter);
                        paint2.setStrokeWidth(cVar.f7631h * min * a);
                        canvas.drawPath(this.f7661b, paint2);
                    }
                }
            }
        }

        /* renamed from: a */
        private float m10372a(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot((double) fArr[0], (double) fArr[1]);
            float hypot2 = (float) Math.hypot((double) fArr[2], (double) fArr[3]);
            float a = m10371a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        /* renamed from: a */
        public boolean mo8651a() {
            if (this.f7674o == null) {
                this.f7674o = Boolean.valueOf(this.f7667h.mo8608a());
            }
            return this.f7674o.booleanValue();
        }

        /* renamed from: a */
        public boolean mo8652a(int[] iArr) {
            return this.f7667h.mo8609a(iArr);
        }
    }

    /* renamed from: androidx.vectordrawable.a.a.i$h */
    /* compiled from: VectorDrawableCompat */
    private static class C1987h extends ConstantState {

        /* renamed from: a */
        int f7676a;

        /* renamed from: b */
        C1986g f7677b;

        /* renamed from: c */
        ColorStateList f7678c;

        /* renamed from: d */
        Mode f7679d;

        /* renamed from: e */
        boolean f7680e;

        /* renamed from: f */
        Bitmap f7681f;

        /* renamed from: g */
        int[] f7682g;

        /* renamed from: h */
        ColorStateList f7683h;

        /* renamed from: i */
        Mode f7684i;

        /* renamed from: j */
        int f7685j;

        /* renamed from: k */
        boolean f7686k;

        /* renamed from: l */
        boolean f7687l;

        /* renamed from: m */
        Paint f7688m;

        public C1987h(C1987h hVar) {
            this.f7678c = null;
            this.f7679d = C1979i.f7607W;
            if (hVar != null) {
                this.f7676a = hVar.f7676a;
                this.f7677b = new C1986g(hVar.f7677b);
                Paint paint = hVar.f7677b.f7664e;
                if (paint != null) {
                    this.f7677b.f7664e = new Paint(paint);
                }
                Paint paint2 = hVar.f7677b.f7663d;
                if (paint2 != null) {
                    this.f7677b.f7663d = new Paint(paint2);
                }
                this.f7678c = hVar.f7678c;
                this.f7679d = hVar.f7679d;
                this.f7680e = hVar.f7680e;
            }
        }

        /* renamed from: a */
        public void mo8658a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f7681f, null, rect, mo8657a(colorFilter));
        }

        /* renamed from: b */
        public boolean mo8663b() {
            return this.f7677b.getRootAlpha() < 255;
        }

        /* renamed from: c */
        public void mo8664c(int i, int i2) {
            this.f7681f.eraseColor(0);
            this.f7677b.mo8650a(new Canvas(this.f7681f), i, i2, (ColorFilter) null);
        }

        /* renamed from: d */
        public void mo8666d() {
            this.f7683h = this.f7678c;
            this.f7684i = this.f7679d;
            this.f7685j = this.f7677b.getRootAlpha();
            this.f7686k = this.f7680e;
            this.f7687l = false;
        }

        public int getChangingConfigurations() {
            return this.f7676a;
        }

        @C0193h0
        public Drawable newDrawable() {
            return new C1979i(this);
        }

        /* renamed from: b */
        public void mo8662b(int i, int i2) {
            if (this.f7681f == null || !mo8660a(i, i2)) {
                this.f7681f = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
                this.f7687l = true;
            }
        }

        @C0193h0
        public Drawable newDrawable(Resources resources) {
            return new C1979i(this);
        }

        /* renamed from: a */
        public Paint mo8657a(ColorFilter colorFilter) {
            if (!mo8663b() && colorFilter == null) {
                return null;
            }
            if (this.f7688m == null) {
                this.f7688m = new Paint();
                this.f7688m.setFilterBitmap(true);
            }
            this.f7688m.setAlpha(this.f7677b.getRootAlpha());
            this.f7688m.setColorFilter(colorFilter);
            return this.f7688m;
        }

        /* renamed from: c */
        public boolean mo8665c() {
            return this.f7677b.mo8651a();
        }

        /* renamed from: a */
        public boolean mo8660a(int i, int i2) {
            return i == this.f7681f.getWidth() && i2 == this.f7681f.getHeight();
        }

        /* renamed from: a */
        public boolean mo8659a() {
            return !this.f7687l && this.f7683h == this.f7678c && this.f7684i == this.f7679d && this.f7686k == this.f7680e && this.f7685j == this.f7677b.getRootAlpha();
        }

        public C1987h() {
            this.f7678c = null;
            this.f7679d = C1979i.f7607W;
            this.f7677b = new C1986g();
        }

        /* renamed from: a */
        public boolean mo8661a(int[] iArr) {
            boolean a = this.f7677b.mo8652a(iArr);
            this.f7687l |= a;
            return a;
        }
    }

    @RequiresApi(24)
    /* renamed from: androidx.vectordrawable.a.a.i$i */
    /* compiled from: VectorDrawableCompat */
    private static class C1988i extends ConstantState {

        /* renamed from: a */
        private final ConstantState f7689a;

        public C1988i(ConstantState constantState) {
            this.f7689a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f7689a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f7689a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C1979i iVar = new C1979i();
            iVar.f7605a = (VectorDrawable) this.f7689a.newDrawable();
            return iVar;
        }

        public Drawable newDrawable(Resources resources) {
            C1979i iVar = new C1979i();
            iVar.f7605a = (VectorDrawable) this.f7689a.newDrawable(resources);
            return iVar;
        }

        public Drawable newDrawable(Resources resources, Theme theme) {
            C1979i iVar = new C1979i();
            iVar.f7605a = (VectorDrawable) this.f7689a.newDrawable(resources, theme);
            return iVar;
        }
    }

    C1979i() {
        this.f7623Q = true;
        this.f7625S = new float[9];
        this.f7626T = new Matrix();
        this.f7627U = new Rect();
        this.f7628b = new C1987h();
    }

    /* renamed from: c */
    private boolean m10342c() {
        if (VERSION.SDK_INT < 17 || !isAutoMirrored() || C0892a.m5157e(this) != 1) {
            return false;
        }
        return true;
    }

    public static C1979i createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        C1979i iVar = new C1979i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Object mo8579a(String str) {
        return this.f7628b.f7677b.f7675p.get(str);
    }

    public /* bridge */ /* synthetic */ void applyTheme(Theme theme) {
        super.applyTheme(theme);
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: b */
    public float mo8581b() {
        C1987h hVar = this.f7628b;
        if (hVar != null) {
            C1986g gVar = hVar.f7677b;
            if (gVar != null) {
                float f = gVar.f7668i;
                if (f != 0.0f) {
                    float f2 = gVar.f7669j;
                    if (f2 != 0.0f) {
                        float f3 = gVar.f7671l;
                        if (f3 != 0.0f) {
                            float f4 = gVar.f7670k;
                            if (f4 != 0.0f) {
                                return Math.min(f4 / f, f3 / f2);
                            }
                        }
                    }
                }
            }
        }
        return 1.0f;
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            C0892a.m5151a(drawable);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f7627U);
        if (this.f7627U.width() > 0 && this.f7627U.height() > 0) {
            ColorFilter colorFilter = this.f7621O;
            if (colorFilter == null) {
                colorFilter = this.f7620N;
            }
            canvas.getMatrix(this.f7626T);
            this.f7626T.getValues(this.f7625S);
            float abs = Math.abs(this.f7625S[0]);
            float abs2 = Math.abs(this.f7625S[4]);
            float abs3 = Math.abs(this.f7625S[1]);
            float abs4 = Math.abs(this.f7625S[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int height = (int) (((float) this.f7627U.height()) * abs2);
            int min = Math.min(2048, (int) (((float) this.f7627U.width()) * abs));
            int min2 = Math.min(2048, height);
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f7627U;
                canvas.translate((float) rect.left, (float) rect.top);
                if (m10342c()) {
                    canvas.translate((float) this.f7627U.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f7627U.offsetTo(0, 0);
                this.f7628b.mo8662b(min, min2);
                if (!this.f7623Q) {
                    this.f7628b.mo8664c(min, min2);
                } else if (!this.f7628b.mo8659a()) {
                    this.f7628b.mo8664c(min, min2);
                    this.f7628b.mo8666d();
                }
                this.f7628b.mo8658a(canvas, colorFilter, this.f7627U);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            return C0892a.m5155c(drawable);
        }
        return this.f7628b.f7677b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f7628b.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            return C0892a.m5156d(drawable);
        }
        return this.f7621O;
    }

    public ConstantState getConstantState() {
        Drawable drawable = this.f7605a;
        if (drawable != null && VERSION.SDK_INT >= 24) {
            return new C1988i(drawable.getConstantState());
        }
        this.f7628b.f7676a = getChangingConfigurations();
        return this.f7628b;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f7628b.f7677b.f7669j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f7628b.f7677b.f7668i;
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            return C0892a.m5158f(drawable);
        }
        return this.f7628b.f7680e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r0.isStateful() != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f7605a
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            androidx.vectordrawable.a.a.i$h r0 = r1.f7628b
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.mo8665c()
            if (r0 != 0) goto L_0x0028
            androidx.vectordrawable.a.a.i$h r0 = r1.f7628b
            android.content.res.ColorStateList r0 = r0.f7678c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.p051a.p052a.C1979i.isStateful():boolean");
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f7622P && super.mutate() == this) {
            this.f7628b = new C1987h(this.f7628b);
            this.f7622P = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C1987h hVar = this.f7628b;
        ColorStateList colorStateList = hVar.f7678c;
        if (colorStateList != null) {
            Mode mode = hVar.f7679d;
            if (mode != null) {
                this.f7620N = mo8578a(this.f7620N, colorStateList, mode);
                invalidateSelf();
                z = true;
            }
        }
        if (hVar.mo8665c() && hVar.mo8661a(iArr)) {
            invalidateSelf();
            z = true;
        }
        return z;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            drawable.setAlpha(i);
            return;
        }
        if (this.f7628b.f7677b.getRootAlpha() != i) {
            this.f7628b.f7677b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            C0892a.m5150a(drawable, z);
        } else {
            this.f7628b.f7680e = z;
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            C0892a.m5154b(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            C0892a.m5146a(drawable, colorStateList);
            return;
        }
        C1987h hVar = this.f7628b;
        if (hVar.f7678c != colorStateList) {
            hVar.f7678c = colorStateList;
            this.f7620N = mo8578a(this.f7620N, colorStateList, hVar.f7679d);
            invalidateSelf();
        }
    }

    public void setTintMode(Mode mode) {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            C0892a.m5149a(drawable, mode);
            return;
        }
        C1987h hVar = this.f7628b;
        if (hVar.f7679d != mode) {
            hVar.f7679d = mode;
            this.f7620N = mo8578a(this.f7620N, hVar.f7678c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public PorterDuffColorFilter mo8578a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f7621O = colorFilter;
        invalidateSelf();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034 A[Catch:{ IOException | XmlPullParserException -> 0x0041 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039 A[Catch:{ IOException | XmlPullParserException -> 0x0041 }] */
    @androidx.annotation.C0195i0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.vectordrawable.p051a.p052a.C1979i m10338a(@androidx.annotation.C0193h0 android.content.res.Resources r4, @androidx.annotation.C0213q int r5, @androidx.annotation.C0195i0 android.content.res.Resources.Theme r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L_0x001f
            androidx.vectordrawable.a.a.i r0 = new androidx.vectordrawable.a.a.i
            r0.<init>()
            android.graphics.drawable.Drawable r4 = androidx.core.content.p020h.C0874g.m5058c(r4, r5, r6)
            r0.f7605a = r4
            androidx.vectordrawable.a.a.i$i r4 = new androidx.vectordrawable.a.a.i$i
            android.graphics.drawable.Drawable r5 = r0.f7605a
            android.graphics.drawable.Drawable$ConstantState r5 = r5.getConstantState()
            r4.<init>(r5)
            r0.f7624R = r4
            return r0
        L_0x001f:
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
        L_0x0027:
            int r1 = r5.next()     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            r2 = 2
            if (r1 == r2) goto L_0x0032
            r3 = 1
            if (r1 == r3) goto L_0x0032
            goto L_0x0027
        L_0x0032:
            if (r1 != r2) goto L_0x0039
            androidx.vectordrawable.a.a.i r4 = createFromXmlInner(r4, r5, r0, r6)     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            return r4
        L_0x0039:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            throw r4     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
        L_0x0041:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.p051a.p052a.C1979i.m10338a(android.content.res.Resources, int, android.content.res.Resources$Theme):androidx.vectordrawable.a.a.i");
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            C0892a.m5148a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C1987h hVar = this.f7628b;
        hVar.f7677b = new C1986g();
        TypedArray a = C0878h.m5069a(resources, theme, attributeSet, C1964a.f7516a);
        m10340a(a, xmlPullParser, theme);
        a.recycle();
        hVar.f7676a = getChangingConfigurations();
        hVar.f7687l = true;
        m10339a(resources, xmlPullParser, attributeSet, theme);
        this.f7620N = mo8578a(this.f7620N, hVar.f7678c, hVar.f7679d);
    }

    C1979i(@C0193h0 C1987h hVar) {
        this.f7623Q = true;
        this.f7625S = new float[9];
        this.f7626T = new Matrix();
        this.f7627U = new Rect();
        this.f7628b = hVar;
        this.f7620N = mo8578a(this.f7620N, hVar.f7678c, hVar.f7679d);
    }

    /* renamed from: a */
    static int m10336a(int i, float f) {
        return (i & C0962e0.f4342s) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    /* renamed from: a */
    private static Mode m10337a(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: a */
    private void m10340a(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme) throws XmlPullParserException {
        C1987h hVar = this.f7628b;
        C1986g gVar = hVar.f7677b;
        hVar.f7679d = m10337a(C0878h.m5077b(typedArray, xmlPullParser, "tintMode", 6, -1), Mode.SRC_IN);
        ColorStateList a = C0878h.m5067a(typedArray, xmlPullParser, theme, "tint", 1);
        if (a != null) {
            hVar.f7678c = a;
        }
        hVar.f7680e = C0878h.m5074a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f7680e);
        gVar.f7670k = C0878h.m5063a(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f7670k);
        gVar.f7671l = C0878h.m5063a(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f7671l);
        if (gVar.f7670k <= 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append(typedArray.getPositionDescription());
            sb.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(sb.toString());
        } else if (gVar.f7671l > 0.0f) {
            gVar.f7668i = typedArray.getDimension(3, gVar.f7668i);
            gVar.f7669j = typedArray.getDimension(2, gVar.f7669j);
            if (gVar.f7668i <= 0.0f) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(typedArray.getPositionDescription());
                sb2.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(sb2.toString());
            } else if (gVar.f7669j > 0.0f) {
                gVar.setAlpha(C0878h.m5063a(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f7673n = string;
                    gVar.f7675p.put(string, gVar);
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(typedArray.getPositionDescription());
                sb3.append("<vector> tag requires height > 0");
                throw new XmlPullParserException(sb3.toString());
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(typedArray.getPositionDescription());
            sb4.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(sb4.toString());
        }
    }

    /* renamed from: a */
    private void m10339a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        C1987h hVar = this.f7628b;
        C1986g gVar = hVar.f7677b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f7667h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            String str = "group";
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C1983d dVar = (C1983d) arrayDeque.peek();
                if ("path".equals(name)) {
                    C1982c cVar = new C1982c();
                    cVar.mo8607a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f7642b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f7675p.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    hVar.f7676a = cVar.f7658d | hVar.f7676a;
                } else if (f7608X.equals(name)) {
                    C1981b bVar = new C1981b();
                    bVar.mo8604a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f7642b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f7675p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f7676a = bVar.f7658d | hVar.f7676a;
                } else if (str.equals(name)) {
                    C1983d dVar2 = new C1983d();
                    dVar2.mo8627a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f7642b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f7675p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f7676a = dVar2.f7651k | hVar.f7676a;
                }
            } else if (eventType == 3 && str.equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: a */
    private void m10341a(C1983d dVar, int i) {
        String str = "";
        for (int i2 = 0; i2 < i; i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("    ");
            str = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("current group is :");
        sb2.append(dVar.getGroupName());
        sb2.append(" rotation is ");
        sb2.append(dVar.f7643c);
        sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("matrix is :");
        sb3.append(dVar.getLocalMatrix().toString());
        sb3.toString();
        for (int i3 = 0; i3 < dVar.f7642b.size(); i3++) {
            C1984e eVar = (C1984e) dVar.f7642b.get(i3);
            if (eVar instanceof C1983d) {
                m10341a((C1983d) eVar, i + 1);
            } else {
                ((C1985f) eVar).mo8645a(i + 1);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8580a(boolean z) {
        this.f7623Q = z;
    }
}
