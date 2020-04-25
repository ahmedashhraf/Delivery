package com.instabug.library.annotation;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;
import androidx.annotation.C0198k;
import androidx.core.p024e.p025b.C0886a;
import com.instabug.library.Instabug;
import com.instabug.library.annotation.p381d.C9760b;
import com.instabug.library.annotation.p381d.C9761c;
import java.io.Serializable;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.annotation.b */
/* compiled from: DirectionRectF */
public class C9747b extends RectF implements Serializable {

    /* renamed from: V */
    private static transient /* synthetic */ boolean[] f25849V;

    /* renamed from: N */
    public C9748a f25850N;

    /* renamed from: O */
    public C9749b f25851O;

    /* renamed from: P */
    public PointF f25852P = new PointF();

    /* renamed from: Q */
    public PointF f25853Q;

    /* renamed from: R */
    public PointF f25854R;

    /* renamed from: S */
    public PointF f25855S;

    /* renamed from: T */
    public boolean f25856T;

    /* renamed from: U */
    private boolean f25857U;

    /* renamed from: a */
    public C9748a f25858a;

    /* renamed from: b */
    public C9749b f25859b;

    /* renamed from: com.instabug.library.annotation.b$a */
    /* compiled from: DirectionRectF */
    public enum C9748a {
        LEFT,
        RIGHT;

        static {
            boolean[] d;
            d[3] = true;
        }
    }

    /* renamed from: com.instabug.library.annotation.b$b */
    /* compiled from: DirectionRectF */
    public enum C9749b {
        TOP,
        BOTTOM;

        static {
            boolean[] d;
            d[3] = true;
        }
    }

    /* renamed from: com.instabug.library.annotation.b$c */
    /* compiled from: ArrowShape */
    public class C9750c extends C9756i {

        /* renamed from: U */
        private static transient /* synthetic */ boolean[] f25860U;

        /* renamed from: P */
        private final Paint f25861P = new Paint(1);

        /* renamed from: Q */
        private PointF f25862Q;

        /* renamed from: R */
        private PointF f25863R;

        /* renamed from: S */
        private float f25864S;

        /* renamed from: T */
        private String f25865T;

        public C9750c(PointF pointF, PointF pointF2, @C0198k int i, float f) {
            boolean[] e = m45422e();
            super(i, f);
            e[0] = true;
            e[1] = true;
            this.f25861P.setColor(i);
            e[2] = true;
            this.f25861P.setStyle(Style.STROKE);
            e[3] = true;
            this.f25861P.setStrokeWidth(f);
            this.f25862Q = pointF;
            this.f25863R = pointF2;
            e[4] = true;
        }

        /* renamed from: c */
        private void m45421c(C9747b bVar) {
            boolean[] e = m45422e();
            float f = this.f25862Q.x;
            float f2 = this.f25863R.x;
            if (f < f2) {
                bVar.left = f;
                bVar.right = f2;
                bVar.f25858a = C9748a.LEFT;
                bVar.f25850N = C9748a.RIGHT;
                e[41] = true;
            } else {
                bVar.right = f;
                bVar.left = f2;
                bVar.f25858a = C9748a.RIGHT;
                bVar.f25850N = C9748a.LEFT;
                e[42] = true;
            }
            float f3 = this.f25862Q.y;
            float f4 = this.f25863R.y;
            if (f3 < f4) {
                bVar.top = f3;
                bVar.bottom = f4;
                bVar.f25859b = C9749b.TOP;
                bVar.f25851O = C9749b.BOTTOM;
                e[43] = true;
            } else {
                bVar.bottom = f3;
                bVar.top = f4;
                bVar.f25859b = C9749b.BOTTOM;
                bVar.f25851O = C9749b.TOP;
                e[44] = true;
            }
            e[45] = true;
        }

        /* renamed from: e */
        private static /* synthetic */ boolean[] m45422e() {
            boolean[] zArr = f25860U;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(4491938396414510858L, "com/instabug/library/annotation/shape/ArrowShape", 77);
            f25860U = a;
            return a;
        }

        /* renamed from: a */
        public void mo34775a(Canvas canvas, C9747b bVar, C9747b bVar2) {
            boolean[] e = m45422e();
            C9748a aVar = bVar.f25858a;
            if (aVar == C9748a.RIGHT) {
                this.f25862Q.x = bVar.right;
                e[6] = true;
            } else if (aVar != C9748a.LEFT) {
                e[7] = true;
            } else {
                this.f25862Q.x = bVar.left;
                e[8] = true;
            }
            C9749b bVar3 = bVar.f25859b;
            if (bVar3 == C9749b.TOP) {
                this.f25862Q.y = bVar.top;
                e[9] = true;
            } else if (bVar3 != C9749b.BOTTOM) {
                e[10] = true;
            } else {
                this.f25862Q.y = bVar.bottom;
                e[11] = true;
            }
            C9748a aVar2 = bVar.f25850N;
            if (aVar2 == C9748a.RIGHT) {
                this.f25863R.x = bVar.right;
                e[12] = true;
            } else if (aVar2 != C9748a.LEFT) {
                e[13] = true;
            } else {
                this.f25863R.x = bVar.left;
                e[14] = true;
            }
            C9749b bVar4 = bVar.f25851O;
            if (bVar4 == C9749b.TOP) {
                this.f25863R.y = bVar.top;
                e[15] = true;
            } else if (bVar4 != C9749b.BOTTOM) {
                e[16] = true;
            } else {
                this.f25863R.y = bVar.bottom;
                e[17] = true;
            }
            canvas.drawPath(mo34771a(bVar), this.f25861P);
            e[18] = true;
        }

        /* renamed from: b */
        public void mo34782b(String str) {
            boolean[] e = m45422e();
            this.f25865T = str;
            e[5] = true;
        }

        /* renamed from: b */
        public void mo34780b(float f, float f2, C9747b bVar) {
            boolean[] e = m45422e();
            this.f25863R.set(f, f2);
            e[39] = true;
            m45421c(bVar);
            e[40] = true;
        }

        /* renamed from: b */
        public void mo34781b(C9747b bVar) {
            boolean[] e = m45422e();
            float max = Math.max(bVar.width(), bVar.height());
            e[69] = true;
            float f = max / 2.0f;
            float centerX = bVar.centerX() - f;
            e[70] = true;
            float centerX2 = bVar.centerX() + f;
            e[71] = true;
            PointF pointF = new PointF(centerX, bVar.centerY());
            e[72] = true;
            PointF pointF2 = new PointF(centerX2, bVar.centerY());
            e[73] = true;
            this.f25862Q = C9761c.m45518a(bVar.centerX(), bVar.centerY(), this.f25864S, pointF);
            e[74] = true;
            this.f25863R = C9761c.m45518a(bVar.centerX(), bVar.centerY(), this.f25864S, pointF2);
            e[75] = true;
        }

        /* renamed from: a */
        public boolean mo34779a(PointF pointF, C9747b bVar) {
            boolean[] e = m45422e();
            m45421c(bVar);
            PointF pointF2 = this.f25863R;
            float f = pointF2.x;
            float f2 = pointF2.y;
            PointF pointF3 = this.f25862Q;
            float f3 = pointF3.x;
            float f4 = pointF3.y;
            e[19] = true;
            float a = C9761c.m45517a(f, f2, f3, f4);
            e[20] = true;
            float f5 = 90.0f + a;
            PointF a2 = C9761c.m45519a(60.0f, f5, this.f25862Q);
            e[21] = true;
            float f6 = a + 270.0f;
            PointF a3 = C9761c.m45519a(60.0f, f6, this.f25862Q);
            e[22] = true;
            PointF a4 = C9761c.m45519a(60.0f, f6, this.f25863R);
            e[23] = true;
            PointF a5 = C9761c.m45519a(60.0f, f5, this.f25863R);
            e[24] = true;
            Region region = new Region();
            e[25] = true;
            RectF rectF = new RectF();
            e[26] = true;
            Path path = new Path();
            e[27] = true;
            path.moveTo(a2.x, a2.y);
            e[28] = true;
            path.lineTo(a3.x, a3.y);
            e[29] = true;
            path.lineTo(a4.x, a4.y);
            e[30] = true;
            path.lineTo(a5.x, a5.y);
            e[31] = true;
            path.close();
            e[32] = true;
            path.computeBounds(rectF, true);
            e[33] = true;
            region.setPath(path, new Region((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
            e[34] = true;
            boolean contains = region.contains((int) pointF.x, (int) pointF.y);
            e[35] = true;
            return contains;
        }

        /* renamed from: a */
        public void mo34778a(C9747b bVar, C9747b bVar2, boolean z) {
            boolean[] e = m45422e();
            bVar2.mo34764a(bVar);
            e[36] = true;
        }

        /* renamed from: a */
        public void mo34772a(float f, float f2, C9747b bVar) {
            boolean[] e = m45422e();
            this.f25862Q.set(f, f2);
            e[37] = true;
            m45421c(bVar);
            e[38] = true;
        }

        /* renamed from: a */
        public void mo34776a(Canvas canvas, C9747b bVar, C9758c[] cVarArr) {
            boolean[] e = m45422e();
            int color = this.f25861P.getColor();
            e[48] = true;
            int i = 0;
            cVarArr[0].mo34798a(this.f25862Q);
            e[49] = true;
            cVarArr[1].mo34798a(this.f25863R);
            e[50] = true;
            while (i < 2) {
                e[51] = true;
                cVarArr[i].mo34796a(color);
                e[52] = true;
                cVarArr[i].mo34797a(canvas);
                i++;
                e[53] = true;
            }
            e[54] = true;
        }

        /* renamed from: a */
        public void mo34774a(Canvas canvas, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
            m45422e()[55] = true;
        }

        /* renamed from: a */
        public void mo34777a(C9747b bVar, C9747b bVar2, int i, int i2) {
            boolean[] e = m45422e();
            float f = (float) i;
            bVar.left = bVar2.left + f;
            float f2 = (float) i2;
            bVar.top = bVar2.top + f2;
            bVar.right = bVar2.right + f;
            bVar.bottom = bVar2.bottom + f2;
            e[56] = true;
        }

        /* renamed from: a */
        public Path mo34771a(C9747b bVar) {
            boolean[] e = m45422e();
            Path path = new Path();
            PointF pointF = this.f25863R;
            float f = pointF.x;
            float f2 = pointF.y;
            PointF pointF2 = this.f25862Q;
            float f3 = pointF2.x;
            float f4 = pointF2.y;
            e[57] = true;
            float a = C9761c.m45517a(f, f2, f3, f4);
            e[58] = true;
            PointF a2 = C9761c.m45519a(60.0f, 225.0f + a, this.f25863R);
            e[59] = true;
            PointF a3 = C9761c.m45519a(60.0f, a + 135.0f, this.f25863R);
            e[60] = true;
            PointF pointF3 = this.f25862Q;
            path.moveTo(pointF3.x, pointF3.y);
            e[61] = true;
            PointF pointF4 = this.f25863R;
            path.lineTo(pointF4.x + 1.0f, pointF4.y + 1.0f);
            e[62] = true;
            if (!"arrow".equals(this.f25865T)) {
                e[63] = true;
            } else {
                e[64] = true;
                path.moveTo(a2.x, a2.y);
                e[65] = true;
                PointF pointF5 = this.f25863R;
                path.lineTo(pointF5.x, pointF5.y);
                e[66] = true;
                path.lineTo(a3.x, a3.y);
                e[67] = true;
            }
            e[68] = true;
            return path;
        }

        /* renamed from: a */
        public void mo34773a(int i) {
            boolean[] e = m45422e();
            this.f25864S = (float) i;
            e[76] = true;
        }
    }

    /* renamed from: com.instabug.library.annotation.b$d */
    /* compiled from: BlurredRectShape */
    public class C9751d extends C9752e {

        /* renamed from: S */
        private static transient /* synthetic */ boolean[] f25866S;

        /* renamed from: R */
        private final Context f25867R;

        public C9751d(Bitmap bitmap, Context context) {
            boolean[] e = m45435e();
            super(C0886a.f4059c);
            this.f25867R = context;
            e[0] = true;
            this.f25869P = C9760b.m45512a(bitmap, 18, context);
            e[1] = true;
            mo34792a(true);
            e[2] = true;
        }

        /* renamed from: e */
        private static /* synthetic */ boolean[] m45435e() {
            boolean[] zArr = f25866S;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-7388056980810348305L, "com/instabug/library/annotation/shape/BlurredRectShape", 17);
            f25866S = a;
            return a;
        }

        /* renamed from: a */
        public void mo34783a(Bitmap bitmap) {
            boolean[] e = m45435e();
            this.f25869P = C9760b.m45512a(bitmap, 18, this.f25867R);
            e[3] = true;
        }

        /* renamed from: a */
        public void mo34784a(Canvas canvas, Bitmap bitmap, float f, float f2) {
            boolean[] e = m45435e();
            canvas.drawBitmap(bitmap, f, f2, null);
            e[4] = true;
        }

        /* renamed from: a */
        public void mo34778a(C9747b bVar, C9747b bVar2, boolean z) {
            boolean[] e = m45435e();
            bVar2.mo34764a(bVar);
            e[5] = true;
        }

        /* renamed from: a */
        public void mo34776a(Canvas canvas, C9747b bVar, C9758c[] cVarArr) {
            boolean[] e = m45435e();
            PointF[] l = bVar.mo34769l();
            e[6] = true;
            int i = 0;
            while (i < cVarArr.length) {
                e[7] = true;
                cVarArr[i].mo34798a(l[i]);
                e[8] = true;
                cVarArr[i].mo34796a(Instabug.getPrimaryColor());
                e[9] = true;
                cVarArr[i].mo34797a(canvas);
                i++;
                e[10] = true;
            }
            e[11] = true;
        }

        /* renamed from: a */
        public void mo34774a(Canvas canvas, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
            boolean[] e = m45435e();
            C9761c.m45523a(canvas, pointF, pointF2, this.f25882a);
            e[12] = true;
            C9761c.m45523a(canvas, pointF, pointF4, this.f25882a);
            e[13] = true;
            C9761c.m45523a(canvas, pointF2, pointF3, this.f25882a);
            e[14] = true;
            C9761c.m45523a(canvas, pointF3, pointF4, this.f25882a);
            e[15] = true;
        }

        /* renamed from: a */
        public Path mo34771a(C9747b bVar) {
            m45435e()[16] = true;
            return null;
        }
    }

    /* renamed from: com.instabug.library.annotation.b$e */
    /* compiled from: CroppedRectShape */
    public abstract class C9752e extends C9756i {

        /* renamed from: Q */
        private static transient /* synthetic */ boolean[] f25868Q;

        /* renamed from: P */
        protected Bitmap f25869P;

        public C9752e(@C0198k int i) {
            boolean[] e = m45442e();
            super(i, 0.0f);
            e[0] = true;
        }

        /* renamed from: e */
        private static /* synthetic */ boolean[] m45442e() {
            boolean[] zArr = f25868Q;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(845433547034970722L, "com/instabug/library/annotation/shape/CroppedRectShape", 31);
            f25868Q = a;
            return a;
        }

        /* renamed from: a */
        public abstract void mo34784a(Canvas canvas, Bitmap bitmap, float f, float f2);

        /* renamed from: a */
        public void mo34775a(Canvas canvas, C9747b bVar, C9747b bVar2) {
            boolean[] e = m45442e();
            if (this.f25869P == null) {
                e[1] = true;
            } else {
                float f = bVar.left;
                float f2 = bVar.top;
                e[2] = true;
                float width = bVar.width();
                e[3] = true;
                float height = bVar.height();
                if (f < 0.0f) {
                    width += f;
                    e[4] = true;
                    f = 0.0f;
                } else {
                    e[5] = true;
                }
                if (f2 < 0.0f) {
                    height += f2;
                    e[6] = true;
                    f2 = 0.0f;
                } else {
                    e[7] = true;
                }
                if (f + width <= ((float) this.f25869P.getWidth())) {
                    e[8] = true;
                } else {
                    e[9] = true;
                    width = ((float) this.f25869P.getWidth()) - f;
                    e[10] = true;
                }
                if (f2 + height <= ((float) this.f25869P.getHeight())) {
                    e[11] = true;
                } else {
                    e[12] = true;
                    height = ((float) this.f25869P.getHeight()) - f2;
                    e[13] = true;
                }
                if (width <= 0.0f) {
                    e[14] = true;
                } else if (height <= 0.0f) {
                    e[15] = true;
                } else {
                    Bitmap bitmap = this.f25869P;
                    int i = (int) f;
                    int i2 = (int) f2;
                    int i3 = (int) width;
                    int i4 = (int) height;
                    e[16] = true;
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, i, i2, i3, i4);
                    float f3 = bVar.left;
                    float f4 = bVar.top;
                    if (f3 >= 0.0f) {
                        e[17] = true;
                    } else {
                        e[18] = true;
                        f3 = bVar.right - ((float) createBitmap.getWidth());
                        e[19] = true;
                    }
                    if (bVar.top >= 0.0f) {
                        e[20] = true;
                    } else {
                        e[21] = true;
                        f4 = bVar.bottom - ((float) createBitmap.getHeight());
                        e[22] = true;
                    }
                    mo34784a(canvas, createBitmap, f3, f4);
                    e[23] = true;
                }
            }
            e[24] = true;
        }

        /* renamed from: a */
        public boolean mo34779a(PointF pointF, C9747b bVar) {
            boolean[] e = m45442e();
            e[25] = true;
            float a = mo34791a() + 20.0f;
            e[26] = true;
            RectF rectF = new RectF(bVar);
            e[27] = true;
            float f = -a;
            rectF.inset(f, f);
            e[28] = true;
            boolean contains = rectF.contains((float) ((int) pointF.x), (float) ((int) pointF.y));
            e[29] = true;
            return contains;
        }

        /* renamed from: a */
        public void mo34777a(C9747b bVar, C9747b bVar2, int i, int i2) {
            boolean[] e = m45442e();
            float f = (float) i;
            bVar.left = bVar2.left + f;
            float f2 = (float) i2;
            bVar.top = bVar2.top + f2;
            bVar.right = bVar2.right + f;
            bVar.bottom = bVar2.bottom + f2;
            e[30] = true;
        }
    }

    /* renamed from: com.instabug.library.annotation.b$f */
    /* compiled from: OvalShape */
    public class C9753f extends C9755h {

        /* renamed from: S */
        private static transient /* synthetic */ boolean[] f25870S;

        public C9753f(@C0198k int i, float f, int i2) {
            boolean[] e = m45448e();
            super(i, f, i2);
            e[0] = true;
        }

        /* renamed from: b */
        private void m45447b(Canvas canvas, C9747b bVar) {
            boolean[] e = m45448e();
            canvas.drawPath(mo34771a(bVar), this.f25883b);
            e[2] = true;
        }

        /* renamed from: e */
        private static /* synthetic */ boolean[] m45448e() {
            boolean[] zArr = f25870S;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6328343798132841351L, "com/instabug/library/annotation/shape/OvalShape", 29);
            f25870S = a;
            return a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo34785a(Canvas canvas, C9747b bVar) {
            boolean[] e = m45448e();
            m45447b(canvas, bVar);
            e[1] = true;
        }

        /* renamed from: a */
        public void mo34774a(Canvas canvas, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
            boolean[] e = m45448e();
            C9761c.m45523a(canvas, pointF, pointF2, this.f25882a);
            e[3] = true;
            C9761c.m45523a(canvas, pointF, pointF4, this.f25882a);
            e[4] = true;
            C9761c.m45523a(canvas, pointF2, pointF3, this.f25882a);
            e[5] = true;
            C9761c.m45523a(canvas, pointF3, pointF4, this.f25882a);
            e[6] = true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo34786b(C9747b bVar) {
            boolean z;
            C9747b bVar2 = bVar;
            boolean[] e = m45448e();
            this.f25879Q.reset();
            int i = this.f25878P;
            if (i == 0) {
                e[7] = true;
            } else if (i == 180) {
                e[8] = true;
            } else {
                PointF a = C9761c.m45520a(bVar2.f25852P, bVar2.f25853Q);
                e[10] = true;
                PointF a2 = C9761c.m45520a(bVar2.f25852P, a);
                e[11] = true;
                PointF a3 = C9761c.m45520a(bVar2.f25853Q, a);
                e[12] = true;
                PointF a4 = C9761c.m45520a(bVar2.f25853Q, bVar2.f25854R);
                e[13] = true;
                PointF a5 = C9761c.m45520a(bVar2.f25853Q, a4);
                e[14] = true;
                PointF a6 = C9761c.m45520a(bVar2.f25854R, a4);
                e[15] = true;
                PointF a7 = C9761c.m45520a(bVar2.f25854R, bVar2.f25855S);
                e[16] = true;
                PointF a8 = C9761c.m45520a(bVar2.f25854R, a7);
                e[17] = true;
                PointF a9 = C9761c.m45520a(bVar2.f25855S, a7);
                e[18] = true;
                PointF a10 = C9761c.m45520a(bVar2.f25855S, bVar2.f25852P);
                e[19] = true;
                PointF a11 = C9761c.m45520a(bVar2.f25855S, a10);
                e[20] = true;
                PointF a12 = C9761c.m45520a(bVar2.f25852P, a10);
                e[21] = true;
                PointF pointF = a2;
                this.f25879Q.moveTo(a.x, a.y);
                e[22] = true;
                PointF pointF2 = a;
                this.f25879Q.cubicTo(a3.x, a3.y, a5.x, a5.y, a4.x, a4.y);
                e[23] = true;
                this.f25879Q.cubicTo(a6.x, a6.y, a8.x, a8.y, a7.x, a7.y);
                e[24] = true;
                this.f25879Q.cubicTo(a9.x, a9.y, a11.x, a11.y, a10.x, a10.y);
                e[25] = true;
                Path path = this.f25879Q;
                float f = a12.x;
                float f2 = a12.y;
                PointF pointF3 = pointF;
                float f3 = pointF3.x;
                float f4 = pointF3.y;
                PointF pointF4 = pointF2;
                path.cubicTo(f, f2, f3, f4, pointF4.x, pointF4.y);
                z = true;
                e[26] = true;
                this.f25879Q.close();
                e[27] = true;
                e[28] = z;
            }
            this.f25879Q.addOval(bVar2, Direction.CW);
            e[9] = true;
            z = true;
            e[28] = z;
        }
    }

    /* renamed from: com.instabug.library.annotation.b$g */
    /* compiled from: PathShape */
    public class C9754g extends C9755h {

        /* renamed from: X */
        private static transient /* synthetic */ boolean[] f25871X;

        /* renamed from: S */
        private final RectF f25872S = new RectF();

        /* renamed from: T */
        private final Paint f25873T;

        /* renamed from: U */
        private Path f25874U;

        /* renamed from: V */
        private Matrix f25875V;

        /* renamed from: W */
        private List<PointF> f25876W;

        public C9754g(Path path, float f, Paint paint, List<PointF> list) {
            boolean[] e = m45452e();
            super(paint.getColor(), f, 0);
            this.f25874U = path;
            e[0] = true;
            this.f25873T = new Paint(paint);
            this.f25876W = list;
            e[1] = true;
            e[2] = true;
            path.computeBounds(this.f25872S, true);
            e[3] = true;
            this.f25875V = new Matrix();
            e[4] = true;
        }

        /* renamed from: e */
        private static /* synthetic */ boolean[] m45452e() {
            boolean[] zArr = f25871X;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-8369752924706223341L, "com/instabug/library/annotation/shape/PathShape", 33);
            f25871X = a;
            return a;
        }

        /* renamed from: a */
        public void mo34775a(Canvas canvas, C9747b bVar, C9747b bVar2) {
            boolean[] e = m45452e();
            this.f25875V.reset();
            e[5] = true;
            Path path = new Path(this.f25874U);
            e[6] = true;
            this.f25875V.setRectToRect(this.f25872S, new RectF(bVar), ScaleToFit.FILL);
            e[7] = true;
            path.transform(this.f25875V);
            e[8] = true;
            canvas.drawPath(path, this.f25873T);
            e[9] = true;
        }

        /* renamed from: a */
        public boolean mo34779a(PointF pointF, C9747b bVar) {
            boolean[] e = m45452e();
            float f = pointF.x;
            float f2 = f - 50.0f;
            float f3 = pointF.y;
            RectF rectF = new RectF(f2, f3 - 50.0f, f + 50.0f, f3 + 50.0f);
            e[10] = true;
            e[11] = true;
            for (PointF pointF2 : this.f25876W) {
                float[] fArr = {pointF2.x, pointF2.y};
                float[] fArr2 = new float[2];
                e[12] = true;
                this.f25875V.mapPoints(fArr2, fArr);
                e[13] = true;
                if (rectF.contains(fArr2[0], fArr2[1])) {
                    e[14] = true;
                    return true;
                }
                e[15] = true;
            }
            e[16] = true;
            return false;
        }

        /* renamed from: a */
        public void mo34778a(C9747b bVar, C9747b bVar2, boolean z) {
            boolean[] e = m45452e();
            if (Math.abs(bVar2.width() - bVar.width()) >= 1.0f) {
                e[17] = true;
            } else {
                e[18] = true;
                if (Math.abs(bVar2.height() - bVar.height()) >= 1.0f) {
                    e[19] = true;
                } else {
                    e[20] = true;
                    bVar2.mo34764a(bVar);
                    e[21] = true;
                    e[28] = true;
                }
            }
            float width = bVar.width() / bVar2.width();
            e[22] = true;
            float height = bVar.height() / bVar2.height();
            e[23] = true;
            float max = Math.max(width, height);
            e[24] = true;
            Matrix matrix = new Matrix();
            e[25] = true;
            matrix.postScale(max, max, bVar2.centerX(), bVar2.centerY());
            e[26] = true;
            matrix.mapRect(bVar2);
            e[27] = true;
            e[28] = true;
        }

        /* renamed from: a */
        public void mo34774a(Canvas canvas, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
            boolean[] e = m45452e();
            C9761c.m45523a(canvas, pointF, pointF2, this.f25882a);
            e[29] = true;
            C9761c.m45523a(canvas, pointF, pointF4, this.f25882a);
            e[30] = true;
            C9761c.m45523a(canvas, pointF2, pointF3, this.f25882a);
            e[31] = true;
            C9761c.m45523a(canvas, pointF3, pointF4, this.f25882a);
            e[32] = true;
        }
    }

    /* renamed from: com.instabug.library.annotation.b$h */
    /* compiled from: RectShape */
    public class C9755h extends C9756i {

        /* renamed from: R */
        private static transient /* synthetic */ boolean[] f25877R;

        /* renamed from: P */
        protected int f25878P;

        /* renamed from: Q */
        protected Path f25879Q = new Path();

        public C9755h(@C0198k int i, float f, int i2) {
            boolean[] f2 = m45464f();
            super(i, f);
            f2[0] = true;
            this.f25878P = i2;
            f2[1] = true;
        }

        /* renamed from: b */
        private void m45459b(Canvas canvas, C9747b bVar) {
            boolean[] f = m45464f();
            canvas.drawPath(mo34771a(bVar), this.f25883b);
            f[21] = true;
        }

        /* renamed from: e */
        private boolean m45463e() {
            boolean z;
            boolean[] f = m45464f();
            int i = this.f25878P;
            if (i == 0) {
                f[167] = true;
            } else if (i == 180) {
                f[168] = true;
            } else if (i == 90) {
                f[169] = true;
            } else {
                f[170] = true;
                z = true;
                f[172] = true;
                return z;
            }
            z = false;
            f[171] = true;
            f[172] = true;
            return z;
        }

        /* renamed from: f */
        private static /* synthetic */ boolean[] m45464f() {
            boolean[] zArr = f25877R;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-3369972752366249798L, "com/instabug/library/annotation/shape/RectShape", 200);
            f25877R = a;
            return a;
        }

        /* renamed from: a */
        public void mo34775a(Canvas canvas, C9747b bVar, C9747b bVar2) {
            boolean[] f = m45464f();
            if (!m45463e()) {
                f[2] = true;
            } else if (bVar.f25856T) {
                f[3] = true;
            } else {
                bVar2.f25856T = true;
                f[4] = true;
                float centerX = bVar.centerX();
                f[5] = true;
                float centerY = bVar.centerY();
                f[6] = true;
                float f2 = (float) this.f25878P;
                PointF pointF = new PointF(bVar.left, bVar.top);
                f[7] = true;
                PointF a = C9761c.m45518a(centerX, centerY, f2, pointF);
                f[8] = true;
                float f3 = (float) this.f25878P;
                PointF pointF2 = new PointF(bVar.right, bVar.top);
                f[9] = true;
                PointF a2 = C9761c.m45518a(centerX, centerY, f3, pointF2);
                f[10] = true;
                float f4 = (float) this.f25878P;
                PointF pointF3 = new PointF(bVar.right, bVar.bottom);
                f[11] = true;
                PointF a3 = C9761c.m45518a(centerX, centerY, f4, pointF3);
                f[12] = true;
                float f5 = (float) this.f25878P;
                PointF pointF4 = new PointF(bVar.left, bVar.bottom);
                f[13] = true;
                PointF a4 = C9761c.m45518a(centerX, centerY, f5, pointF4);
                f[14] = true;
                bVar2.f25852P.set(a);
                f[15] = true;
                bVar2.f25853Q.set(a2);
                f[16] = true;
                bVar2.f25854R.set(a3);
                f[17] = true;
                bVar2.f25855S.set(a4);
                f[18] = true;
            }
            mo34785a(canvas, bVar);
            f[19] = true;
        }

        /* renamed from: c */
        public void mo34789c(float f, float f2, C9747b bVar) {
            boolean[] f3 = m45464f();
            if (!m45463e()) {
                f3[114] = true;
            } else {
                f3[115] = true;
                m45460c(f, f2, bVar, true);
                f3[116] = true;
                m45461c(bVar);
                f3[117] = true;
            }
            f3[118] = true;
        }

        /* renamed from: d */
        public void mo34790d(float f, float f2, C9747b bVar) {
            boolean[] f3 = m45464f();
            if (!m45463e()) {
                f3[139] = true;
            } else {
                f3[140] = true;
                m45462d(f, f2, bVar, true);
                f3[141] = true;
                m45461c(bVar);
                f3[142] = true;
            }
            f3[143] = true;
        }

        /* renamed from: b */
        public void mo34788b(float f, float f2, C9747b bVar) {
            boolean[] f3 = m45464f();
            if (!m45463e()) {
                f3[89] = true;
            } else {
                f3[90] = true;
                m45458b(f, f2, bVar, true);
                f3[91] = true;
                m45461c(bVar);
                f3[92] = true;
            }
            f3[93] = true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00d0  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00d5  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m45460c(float r7, float r8, com.instabug.library.annotation.C9747b r9, boolean r10) {
            /*
                r6 = this;
                boolean[] r0 = m45464f()
                android.graphics.PointF r1 = r9.f25854R
                r1.set(r7, r8)
                android.graphics.PointF r7 = r9.f25852P
                android.graphics.PointF r8 = r9.f25853Q
                android.graphics.PointF r1 = r9.f25854R
                r2 = 1
                r3 = 119(0x77, float:1.67E-43)
                r0[r3] = r2
                double r7 = com.instabug.library.annotation.p381d.C9761c.m45514a(r7, r8, r1)
                float r7 = (float) r7
                android.graphics.PointF r8 = r9.f25854R
                float r1 = r8.y
                android.graphics.PointF r3 = r9.f25853Q
                float r4 = r3.y
                int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r5 <= 0) goto L_0x002a
                r8 = 120(0x78, float:1.68E-43)
                r0[r8] = r2
                goto L_0x0036
            L_0x002a:
                float r8 = r8.x
                float r3 = r3.x
                int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r5 >= 0) goto L_0x0047
                r8 = 121(0x79, float:1.7E-43)
                r0[r8] = r2
            L_0x0036:
                int r8 = r6.f25878P
                int r8 = r8 + 270
                float r8 = (float) r8
                android.graphics.PointF r1 = r9.f25854R
                android.graphics.PointF r3 = r9.f25853Q
                com.instabug.library.annotation.p381d.C9761c.m45522a(r7, r8, r1, r3)
                r7 = 122(0x7a, float:1.71E-43)
                r0[r7] = r2
                goto L_0x006d
            L_0x0047:
                int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r1 >= 0) goto L_0x0050
                r8 = 123(0x7b, float:1.72E-43)
                r0[r8] = r2
                goto L_0x005d
            L_0x0050:
                int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r8 > 0) goto L_0x0059
                r7 = 124(0x7c, float:1.74E-43)
                r0[r7] = r2
                goto L_0x006d
            L_0x0059:
                r8 = 125(0x7d, float:1.75E-43)
                r0[r8] = r2
            L_0x005d:
                int r8 = r6.f25878P
                int r8 = r8 + 90
                float r8 = (float) r8
                android.graphics.PointF r1 = r9.f25854R
                android.graphics.PointF r3 = r9.f25853Q
                com.instabug.library.annotation.p381d.C9761c.m45522a(r7, r8, r1, r3)
                r7 = 126(0x7e, float:1.77E-43)
                r0[r7] = r2
            L_0x006d:
                android.graphics.PointF r7 = r9.f25852P
                android.graphics.PointF r8 = r9.f25855S
                android.graphics.PointF r1 = r9.f25854R
                r3 = 127(0x7f, float:1.78E-43)
                r0[r3] = r2
                double r7 = com.instabug.library.annotation.p381d.C9761c.m45514a(r7, r8, r1)
                float r7 = (float) r7
                android.graphics.PointF r8 = r9.f25854R
                float r1 = r8.x
                android.graphics.PointF r3 = r9.f25855S
                float r4 = r3.x
                int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r5 <= 0) goto L_0x008d
                r8 = 128(0x80, float:1.794E-43)
                r0[r8] = r2
                goto L_0x0099
            L_0x008d:
                float r8 = r8.y
                float r3 = r3.y
                int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r5 <= 0) goto L_0x00aa
                r8 = 129(0x81, float:1.81E-43)
                r0[r8] = r2
            L_0x0099:
                int r8 = r6.f25878P
                int r8 = r8 + 180
                float r8 = (float) r8
                android.graphics.PointF r1 = r9.f25854R
                android.graphics.PointF r3 = r9.f25855S
                com.instabug.library.annotation.p381d.C9761c.m45522a(r7, r8, r1, r3)
                r7 = 130(0x82, float:1.82E-43)
                r0[r7] = r2
                goto L_0x00ce
            L_0x00aa:
                int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r1 >= 0) goto L_0x00b3
                r8 = 131(0x83, float:1.84E-43)
                r0[r8] = r2
                goto L_0x00c0
            L_0x00b3:
                int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r8 < 0) goto L_0x00bc
                r7 = 132(0x84, float:1.85E-43)
                r0[r7] = r2
                goto L_0x00ce
            L_0x00bc:
                r8 = 133(0x85, float:1.86E-43)
                r0[r8] = r2
            L_0x00c0:
                int r8 = r6.f25878P
                float r8 = (float) r8
                android.graphics.PointF r1 = r9.f25854R
                android.graphics.PointF r3 = r9.f25855S
                com.instabug.library.annotation.p381d.C9761c.m45522a(r7, r8, r1, r3)
                r7 = 134(0x86, float:1.88E-43)
                r0[r7] = r2
            L_0x00ce:
                if (r10 != 0) goto L_0x00d5
                r7 = 135(0x87, float:1.89E-43)
                r0[r7] = r2
                goto L_0x00e7
            L_0x00d5:
                r7 = 136(0x88, float:1.9E-43)
                r0[r7] = r2
                android.graphics.PointF r7 = r9.f25852P
                float r8 = r7.x
                float r7 = r7.y
                r10 = 0
                r6.m45457a(r8, r7, r9, r10)
                r7 = 137(0x89, float:1.92E-43)
                r0[r7] = r2
            L_0x00e7:
                r7 = 138(0x8a, float:1.93E-43)
                r0[r7] = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.annotation.C9747b.C9755h.m45460c(float, float, com.instabug.library.annotation.b, boolean):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00d0  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00d5  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m45462d(float r7, float r8, com.instabug.library.annotation.C9747b r9, boolean r10) {
            /*
                r6 = this;
                boolean[] r0 = m45464f()
                android.graphics.PointF r1 = r9.f25855S
                r1.set(r7, r8)
                android.graphics.PointF r7 = r9.f25853Q
                android.graphics.PointF r8 = r9.f25852P
                android.graphics.PointF r1 = r9.f25855S
                r2 = 1
                r3 = 144(0x90, float:2.02E-43)
                r0[r3] = r2
                double r7 = com.instabug.library.annotation.p381d.C9761c.m45514a(r7, r8, r1)
                float r7 = (float) r7
                android.graphics.PointF r8 = r9.f25855S
                float r1 = r8.y
                android.graphics.PointF r3 = r9.f25852P
                float r4 = r3.y
                int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r5 <= 0) goto L_0x002a
                r8 = 145(0x91, float:2.03E-43)
                r0[r8] = r2
                goto L_0x0036
            L_0x002a:
                float r8 = r8.x
                float r3 = r3.x
                int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r5 >= 0) goto L_0x0047
                r8 = 146(0x92, float:2.05E-43)
                r0[r8] = r2
            L_0x0036:
                int r8 = r6.f25878P
                int r8 = r8 + 270
                float r8 = (float) r8
                android.graphics.PointF r1 = r9.f25855S
                android.graphics.PointF r3 = r9.f25852P
                com.instabug.library.annotation.p381d.C9761c.m45522a(r7, r8, r1, r3)
                r7 = 147(0x93, float:2.06E-43)
                r0[r7] = r2
                goto L_0x006d
            L_0x0047:
                int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r1 >= 0) goto L_0x0050
                r8 = 148(0x94, float:2.07E-43)
                r0[r8] = r2
                goto L_0x005d
            L_0x0050:
                int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r8 > 0) goto L_0x0059
                r7 = 149(0x95, float:2.09E-43)
                r0[r7] = r2
                goto L_0x006d
            L_0x0059:
                r8 = 150(0x96, float:2.1E-43)
                r0[r8] = r2
            L_0x005d:
                int r8 = r6.f25878P
                int r8 = r8 + 90
                float r8 = (float) r8
                android.graphics.PointF r1 = r9.f25855S
                android.graphics.PointF r3 = r9.f25852P
                com.instabug.library.annotation.p381d.C9761c.m45522a(r7, r8, r1, r3)
                r7 = 151(0x97, float:2.12E-43)
                r0[r7] = r2
            L_0x006d:
                android.graphics.PointF r7 = r9.f25853Q
                android.graphics.PointF r8 = r9.f25854R
                android.graphics.PointF r1 = r9.f25855S
                r3 = 152(0x98, float:2.13E-43)
                r0[r3] = r2
                double r7 = com.instabug.library.annotation.p381d.C9761c.m45514a(r7, r8, r1)
                float r7 = (float) r7
                android.graphics.PointF r8 = r9.f25855S
                float r1 = r8.x
                android.graphics.PointF r3 = r9.f25854R
                float r4 = r3.x
                int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r5 >= 0) goto L_0x008d
                r8 = 153(0x99, float:2.14E-43)
                r0[r8] = r2
                goto L_0x0099
            L_0x008d:
                float r8 = r8.y
                float r3 = r3.y
                int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r5 >= 0) goto L_0x00a8
                r8 = 154(0x9a, float:2.16E-43)
                r0[r8] = r2
            L_0x0099:
                int r8 = r6.f25878P
                float r8 = (float) r8
                android.graphics.PointF r1 = r9.f25855S
                android.graphics.PointF r3 = r9.f25854R
                com.instabug.library.annotation.p381d.C9761c.m45522a(r7, r8, r1, r3)
                r7 = 155(0x9b, float:2.17E-43)
                r0[r7] = r2
                goto L_0x00ce
            L_0x00a8:
                int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r1 <= 0) goto L_0x00b1
                r8 = 156(0x9c, float:2.19E-43)
                r0[r8] = r2
                goto L_0x00be
            L_0x00b1:
                int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r8 > 0) goto L_0x00ba
                r7 = 157(0x9d, float:2.2E-43)
                r0[r7] = r2
                goto L_0x00ce
            L_0x00ba:
                r8 = 158(0x9e, float:2.21E-43)
                r0[r8] = r2
            L_0x00be:
                int r8 = r6.f25878P
                int r8 = r8 + 180
                float r8 = (float) r8
                android.graphics.PointF r1 = r9.f25855S
                android.graphics.PointF r3 = r9.f25854R
                com.instabug.library.annotation.p381d.C9761c.m45522a(r7, r8, r1, r3)
                r7 = 159(0x9f, float:2.23E-43)
                r0[r7] = r2
            L_0x00ce:
                if (r10 != 0) goto L_0x00d5
                r7 = 160(0xa0, float:2.24E-43)
                r0[r7] = r2
                goto L_0x00e7
            L_0x00d5:
                r7 = 161(0xa1, float:2.26E-43)
                r0[r7] = r2
                android.graphics.PointF r7 = r9.f25853Q
                float r8 = r7.x
                float r7 = r7.y
                r10 = 0
                r6.m45458b(r8, r7, r9, r10)
                r7 = 162(0xa2, float:2.27E-43)
                r0[r7] = r2
            L_0x00e7:
                r7 = 163(0xa3, float:2.28E-43)
                r0[r7] = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.annotation.C9747b.C9755h.m45462d(float, float, com.instabug.library.annotation.b, boolean):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00d0  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00d5  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m45458b(float r7, float r8, com.instabug.library.annotation.C9747b r9, boolean r10) {
            /*
                r6 = this;
                boolean[] r0 = m45464f()
                android.graphics.PointF r1 = r9.f25853Q
                r1.set(r7, r8)
                android.graphics.PointF r7 = r9.f25855S
                android.graphics.PointF r8 = r9.f25852P
                android.graphics.PointF r1 = r9.f25853Q
                r2 = 1
                r3 = 94
                r0[r3] = r2
                double r7 = com.instabug.library.annotation.p381d.C9761c.m45514a(r7, r8, r1)
                float r7 = (float) r7
                android.graphics.PointF r8 = r9.f25853Q
                float r1 = r8.x
                android.graphics.PointF r3 = r9.f25852P
                float r4 = r3.x
                int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r5 <= 0) goto L_0x002a
                r8 = 95
                r0[r8] = r2
                goto L_0x0036
            L_0x002a:
                float r8 = r8.y
                float r3 = r3.y
                int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r5 <= 0) goto L_0x0047
                r8 = 96
                r0[r8] = r2
            L_0x0036:
                int r8 = r6.f25878P
                int r8 = r8 + 180
                float r8 = (float) r8
                android.graphics.PointF r1 = r9.f25853Q
                android.graphics.PointF r3 = r9.f25852P
                com.instabug.library.annotation.p381d.C9761c.m45522a(r7, r8, r1, r3)
                r7 = 97
                r0[r7] = r2
                goto L_0x006b
            L_0x0047:
                int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r1 >= 0) goto L_0x0050
                r8 = 98
                r0[r8] = r2
                goto L_0x005d
            L_0x0050:
                int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r8 < 0) goto L_0x0059
                r7 = 99
                r0[r7] = r2
                goto L_0x006b
            L_0x0059:
                r8 = 100
                r0[r8] = r2
            L_0x005d:
                int r8 = r6.f25878P
                float r8 = (float) r8
                android.graphics.PointF r1 = r9.f25853Q
                android.graphics.PointF r3 = r9.f25852P
                com.instabug.library.annotation.p381d.C9761c.m45522a(r7, r8, r1, r3)
                r7 = 101(0x65, float:1.42E-43)
                r0[r7] = r2
            L_0x006b:
                android.graphics.PointF r7 = r9.f25855S
                android.graphics.PointF r8 = r9.f25854R
                android.graphics.PointF r1 = r9.f25853Q
                r3 = 102(0x66, float:1.43E-43)
                r0[r3] = r2
                double r7 = com.instabug.library.annotation.p381d.C9761c.m45514a(r7, r8, r1)
                float r7 = (float) r7
                android.graphics.PointF r8 = r9.f25853Q
                float r1 = r8.y
                android.graphics.PointF r3 = r9.f25854R
                float r4 = r3.y
                int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r5 >= 0) goto L_0x008b
                r8 = 103(0x67, float:1.44E-43)
                r0[r8] = r2
                goto L_0x0097
            L_0x008b:
                float r8 = r8.x
                float r3 = r3.x
                int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r5 <= 0) goto L_0x00a8
                r8 = 104(0x68, float:1.46E-43)
                r0[r8] = r2
            L_0x0097:
                int r8 = r6.f25878P
                int r8 = r8 + 90
                float r8 = (float) r8
                android.graphics.PointF r1 = r9.f25853Q
                android.graphics.PointF r3 = r9.f25854R
                com.instabug.library.annotation.p381d.C9761c.m45522a(r7, r8, r1, r3)
                r7 = 105(0x69, float:1.47E-43)
                r0[r7] = r2
                goto L_0x00ce
            L_0x00a8:
                int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r1 <= 0) goto L_0x00b1
                r8 = 106(0x6a, float:1.49E-43)
                r0[r8] = r2
                goto L_0x00be
            L_0x00b1:
                int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r8 < 0) goto L_0x00ba
                r7 = 107(0x6b, float:1.5E-43)
                r0[r7] = r2
                goto L_0x00ce
            L_0x00ba:
                r8 = 108(0x6c, float:1.51E-43)
                r0[r8] = r2
            L_0x00be:
                int r8 = r6.f25878P
                int r8 = r8 + 270
                float r8 = (float) r8
                android.graphics.PointF r1 = r9.f25853Q
                android.graphics.PointF r3 = r9.f25854R
                com.instabug.library.annotation.p381d.C9761c.m45522a(r7, r8, r1, r3)
                r7 = 109(0x6d, float:1.53E-43)
                r0[r7] = r2
            L_0x00ce:
                if (r10 != 0) goto L_0x00d5
                r7 = 110(0x6e, float:1.54E-43)
                r0[r7] = r2
                goto L_0x00e7
            L_0x00d5:
                r7 = 111(0x6f, float:1.56E-43)
                r0[r7] = r2
                android.graphics.PointF r7 = r9.f25855S
                float r8 = r7.x
                float r7 = r7.y
                r10 = 0
                r6.m45462d(r8, r7, r9, r10)
                r7 = 112(0x70, float:1.57E-43)
                r0[r7] = r2
            L_0x00e7:
                r7 = 113(0x71, float:1.58E-43)
                r0[r7] = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.annotation.C9747b.C9755h.m45458b(float, float, com.instabug.library.annotation.b, boolean):void");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo34785a(Canvas canvas, C9747b bVar) {
            boolean[] f = m45464f();
            m45459b(canvas, bVar);
            f[20] = true;
        }

        /* renamed from: c */
        private void m45461c(C9747b bVar) {
            boolean[] f = m45464f();
            RectF rectF = new RectF();
            f[164] = true;
            this.f25879Q.computeBounds(rectF, true);
            f[165] = true;
            bVar.set(rectF);
            f[166] = true;
        }

        /* renamed from: a */
        public boolean mo34779a(PointF pointF, C9747b bVar) {
            boolean[] f = m45464f();
            boolean z = false;
            if (!m45463e()) {
                f[22] = true;
                RectF rectF = new RectF(bVar);
                f[23] = true;
                rectF.inset(50.0f, 50.0f);
                f[24] = true;
                RectF rectF2 = new RectF(bVar);
                f[25] = true;
                rectF2.inset(-50.0f, -50.0f);
                f[26] = true;
                if (!rectF2.contains(pointF.x, pointF.y)) {
                    f[27] = true;
                } else {
                    float f2 = pointF.x;
                    float f3 = pointF.y;
                    f[28] = true;
                    if (rectF.contains(f2, f3)) {
                        f[29] = true;
                    } else {
                        f[30] = true;
                        z = true;
                        f[32] = true;
                        return z;
                    }
                }
                f[31] = true;
                f[32] = true;
                return z;
            }
            float f4 = pointF.x;
            float f5 = f4 - 50.0f;
            float f6 = pointF.y;
            RectF rectF3 = new RectF(f5, f6 - 50.0f, f4 + 50.0f, f6 + 50.0f);
            f[33] = true;
            List<PointF> a = C9761c.m45521a(this.f25879Q);
            f[34] = true;
            f[35] = true;
            for (PointF pointF2 : a) {
                f[36] = true;
                if (rectF3.contains(pointF2.x, pointF2.y)) {
                    f[37] = true;
                    return true;
                }
                f[38] = true;
            }
            f[39] = true;
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo34786b(C9747b bVar) {
            boolean[] f = m45464f();
            this.f25879Q.reset();
            f[191] = true;
            if (!m45463e()) {
                f[192] = true;
                this.f25879Q.addRect(bVar, Direction.CW);
                f[193] = true;
            } else {
                Path path = this.f25879Q;
                PointF pointF = bVar.f25852P;
                path.moveTo(pointF.x, pointF.y);
                f[194] = true;
                Path path2 = this.f25879Q;
                PointF pointF2 = bVar.f25853Q;
                path2.lineTo(pointF2.x, pointF2.y);
                f[195] = true;
                Path path3 = this.f25879Q;
                PointF pointF3 = bVar.f25854R;
                path3.lineTo(pointF3.x, pointF3.y);
                f[196] = true;
                Path path4 = this.f25879Q;
                PointF pointF4 = bVar.f25855S;
                path4.lineTo(pointF4.x, pointF4.y);
                f[197] = true;
                this.f25879Q.close();
                f[198] = true;
            }
            f[199] = true;
        }

        /* renamed from: a */
        public void mo34778a(C9747b bVar, C9747b bVar2, boolean z) {
            boolean[] f = m45464f();
            if (!m45463e()) {
                f[40] = true;
            } else if (!z) {
                f[41] = true;
                f[44] = true;
            } else {
                f[42] = true;
            }
            bVar2.mo34764a(bVar);
            f[43] = true;
            f[44] = true;
        }

        /* renamed from: a */
        public void mo34776a(Canvas canvas, C9747b bVar, C9758c[] cVarArr) {
            boolean[] f = m45464f();
            int i = 0;
            if (!m45463e()) {
                f[45] = true;
                cVarArr[0].mo34795a(bVar.left, bVar.top);
                f[46] = true;
                cVarArr[1].mo34795a(bVar.right, bVar.top);
                f[47] = true;
                cVarArr[2].mo34795a(bVar.right, bVar.bottom);
                f[48] = true;
                cVarArr[3].mo34795a(bVar.left, bVar.bottom);
                f[49] = true;
            } else {
                C9758c cVar = cVarArr[0];
                PointF pointF = bVar.f25852P;
                cVar.mo34795a(pointF.x, pointF.y);
                f[50] = true;
                C9758c cVar2 = cVarArr[1];
                PointF pointF2 = bVar.f25853Q;
                cVar2.mo34795a(pointF2.x, pointF2.y);
                f[51] = true;
                C9758c cVar3 = cVarArr[2];
                PointF pointF3 = bVar.f25854R;
                cVar3.mo34795a(pointF3.x, pointF3.y);
                f[52] = true;
                C9758c cVar4 = cVarArr[3];
                PointF pointF4 = bVar.f25855S;
                cVar4.mo34795a(pointF4.x, pointF4.y);
                f[53] = true;
            }
            int color = this.f25883b.getColor();
            f[54] = true;
            while (i < cVarArr.length) {
                f[55] = true;
                cVarArr[i].mo34796a(color);
                f[56] = true;
                cVarArr[i].mo34797a(canvas);
                i++;
                f[57] = true;
            }
            f[58] = true;
        }

        /* renamed from: a */
        public void mo34774a(Canvas canvas, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
            m45464f()[59] = true;
        }

        /* renamed from: a */
        public void mo34777a(C9747b bVar, C9747b bVar2, int i, int i2) {
            boolean[] f = m45464f();
            PointF pointF = bVar.f25852P;
            PointF pointF2 = bVar2.f25852P;
            float f2 = (float) i;
            float f3 = (float) i2;
            pointF.set(pointF2.x + f2, pointF2.y + f3);
            f[60] = true;
            PointF pointF3 = bVar.f25853Q;
            PointF pointF4 = bVar2.f25853Q;
            pointF3.set(pointF4.x + f2, pointF4.y + f3);
            f[61] = true;
            PointF pointF5 = bVar.f25854R;
            PointF pointF6 = bVar2.f25854R;
            pointF5.set(pointF6.x + f2, pointF6.y + f3);
            f[62] = true;
            PointF pointF7 = bVar.f25855S;
            PointF pointF8 = bVar2.f25855S;
            pointF7.set(pointF8.x + f2, pointF8.y + f3);
            bVar.left = bVar2.left + f2;
            bVar.top = bVar2.top + f3;
            bVar.right = bVar2.right + f2;
            bVar.bottom = bVar2.bottom + f3;
            f[63] = true;
        }

        /* renamed from: a */
        public void mo34787a(float f, float f2, C9747b bVar) {
            boolean[] f3 = m45464f();
            if (!m45463e()) {
                f3[64] = true;
            } else {
                f3[65] = true;
                m45457a(f, f2, bVar, true);
                f3[66] = true;
                m45461c(bVar);
                f3[67] = true;
            }
            f3[68] = true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00d0  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00d5  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m45457a(float r7, float r8, com.instabug.library.annotation.C9747b r9, boolean r10) {
            /*
                r6 = this;
                boolean[] r0 = m45464f()
                android.graphics.PointF r1 = r9.f25852P
                r1.set(r7, r8)
                android.graphics.PointF r7 = r9.f25854R
                android.graphics.PointF r8 = r9.f25853Q
                android.graphics.PointF r1 = r9.f25852P
                r2 = 1
                r3 = 69
                r0[r3] = r2
                double r7 = com.instabug.library.annotation.p381d.C9761c.m45514a(r7, r8, r1)
                float r7 = (float) r7
                android.graphics.PointF r8 = r9.f25852P
                float r1 = r8.x
                android.graphics.PointF r3 = r9.f25853Q
                float r4 = r3.x
                int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r5 >= 0) goto L_0x002a
                r8 = 70
                r0[r8] = r2
                goto L_0x0036
            L_0x002a:
                float r8 = r8.y
                float r3 = r3.y
                int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r5 >= 0) goto L_0x0045
                r8 = 71
                r0[r8] = r2
            L_0x0036:
                int r8 = r6.f25878P
                float r8 = (float) r8
                android.graphics.PointF r1 = r9.f25852P
                android.graphics.PointF r3 = r9.f25853Q
                com.instabug.library.annotation.p381d.C9761c.m45522a(r7, r8, r1, r3)
                r7 = 72
                r0[r7] = r2
                goto L_0x006b
            L_0x0045:
                int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r1 <= 0) goto L_0x004e
                r8 = 73
                r0[r8] = r2
                goto L_0x005b
            L_0x004e:
                int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r8 > 0) goto L_0x0057
                r7 = 74
                r0[r7] = r2
                goto L_0x006b
            L_0x0057:
                r8 = 75
                r0[r8] = r2
            L_0x005b:
                int r8 = r6.f25878P
                int r8 = r8 + 180
                float r8 = (float) r8
                android.graphics.PointF r1 = r9.f25852P
                android.graphics.PointF r3 = r9.f25853Q
                com.instabug.library.annotation.p381d.C9761c.m45522a(r7, r8, r1, r3)
                r7 = 76
                r0[r7] = r2
            L_0x006b:
                android.graphics.PointF r7 = r9.f25854R
                android.graphics.PointF r8 = r9.f25855S
                android.graphics.PointF r1 = r9.f25852P
                r3 = 77
                r0[r3] = r2
                double r7 = com.instabug.library.annotation.p381d.C9761c.m45514a(r7, r8, r1)
                float r7 = (float) r7
                android.graphics.PointF r8 = r9.f25852P
                float r1 = r8.y
                android.graphics.PointF r3 = r9.f25855S
                float r4 = r3.y
                int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r5 >= 0) goto L_0x008b
                r8 = 78
                r0[r8] = r2
                goto L_0x0097
            L_0x008b:
                float r8 = r8.x
                float r3 = r3.x
                int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r5 <= 0) goto L_0x00a8
                r8 = 79
                r0[r8] = r2
            L_0x0097:
                int r8 = r6.f25878P
                int r8 = r8 + 90
                float r8 = (float) r8
                android.graphics.PointF r1 = r9.f25852P
                android.graphics.PointF r3 = r9.f25855S
                com.instabug.library.annotation.p381d.C9761c.m45522a(r7, r8, r1, r3)
                r7 = 80
                r0[r7] = r2
                goto L_0x00ce
            L_0x00a8:
                int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r1 <= 0) goto L_0x00b1
                r8 = 81
                r0[r8] = r2
                goto L_0x00be
            L_0x00b1:
                int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r8 < 0) goto L_0x00ba
                r7 = 82
                r0[r7] = r2
                goto L_0x00ce
            L_0x00ba:
                r8 = 83
                r0[r8] = r2
            L_0x00be:
                int r8 = r6.f25878P
                int r8 = r8 + 270
                float r8 = (float) r8
                android.graphics.PointF r1 = r9.f25852P
                android.graphics.PointF r3 = r9.f25855S
                com.instabug.library.annotation.p381d.C9761c.m45522a(r7, r8, r1, r3)
                r7 = 84
                r0[r7] = r2
            L_0x00ce:
                if (r10 != 0) goto L_0x00d5
                r7 = 85
                r0[r7] = r2
                goto L_0x00e7
            L_0x00d5:
                r7 = 86
                r0[r7] = r2
                android.graphics.PointF r7 = r9.f25854R
                float r8 = r7.x
                float r7 = r7.y
                r10 = 0
                r6.m45460c(r8, r7, r9, r10)
                r7 = 87
                r0[r7] = r2
            L_0x00e7:
                r7 = 88
                r0[r7] = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.annotation.C9747b.C9755h.m45457a(float, float, com.instabug.library.annotation.b, boolean):void");
        }

        /* renamed from: a */
        public Path mo34771a(C9747b bVar) {
            boolean[] f = m45464f();
            if (!m45463e()) {
                f[173] = true;
            } else if (bVar.f25856T) {
                f[174] = true;
            } else {
                bVar.f25856T = true;
                f[175] = true;
                float centerX = bVar.centerX();
                f[176] = true;
                float centerY = bVar.centerY();
                f[177] = true;
                float f2 = (float) this.f25878P;
                PointF pointF = new PointF(bVar.left, bVar.top);
                f[178] = true;
                PointF a = C9761c.m45518a(centerX, centerY, f2, pointF);
                f[179] = true;
                float f3 = (float) this.f25878P;
                PointF pointF2 = new PointF(bVar.right, bVar.top);
                f[180] = true;
                PointF a2 = C9761c.m45518a(centerX, centerY, f3, pointF2);
                f[181] = true;
                float f4 = (float) this.f25878P;
                PointF pointF3 = new PointF(bVar.right, bVar.bottom);
                f[182] = true;
                PointF a3 = C9761c.m45518a(centerX, centerY, f4, pointF3);
                f[183] = true;
                float f5 = (float) this.f25878P;
                PointF pointF4 = new PointF(bVar.left, bVar.bottom);
                f[184] = true;
                PointF a4 = C9761c.m45518a(centerX, centerY, f5, pointF4);
                f[185] = true;
                bVar.f25852P.set(a);
                f[186] = true;
                bVar.f25853Q.set(a2);
                f[187] = true;
                bVar.f25854R.set(a3);
                f[188] = true;
                bVar.f25855S.set(a4);
                f[189] = true;
            }
            mo34786b(bVar);
            Path path = this.f25879Q;
            f[190] = true;
            return path;
        }
    }

    /* renamed from: com.instabug.library.annotation.b$i */
    /* compiled from: Shape */
    public abstract class C9756i implements Serializable {

        /* renamed from: O */
        private static transient /* synthetic */ boolean[] f25880O;

        /* renamed from: N */
        private boolean f25881N = false;

        /* renamed from: a */
        protected final Paint f25882a;

        /* renamed from: b */
        protected Paint f25883b;

        C9756i(@C0198k int i, float f) {
            boolean[] e = m45478e();
            e[0] = true;
            this.f25883b = new Paint(1);
            e[1] = true;
            this.f25883b.setColor(i);
            e[2] = true;
            this.f25883b.setStyle(Style.STROKE);
            e[3] = true;
            this.f25883b.setStrokeWidth(f);
            e[4] = true;
            this.f25883b.setStrokeCap(Cap.ROUND);
            e[5] = true;
            this.f25882a = new Paint(1);
            e[6] = true;
            this.f25882a.setColor(Integer.MIN_VALUE);
            e[7] = true;
        }

        /* renamed from: e */
        private static /* synthetic */ boolean[] m45478e() {
            boolean[] zArr = f25880O;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(2433945012537917258L, "com/instabug/library/annotation/shape/Shape", 19);
            f25880O = a;
            return a;
        }

        /* renamed from: a */
        public float mo34791a() {
            boolean[] e = m45478e();
            float strokeWidth = this.f25883b.getStrokeWidth();
            e[8] = true;
            return strokeWidth;
        }

        /* renamed from: a */
        public abstract Path mo34771a(C9747b bVar);

        /* renamed from: a */
        public abstract void mo34774a(Canvas canvas, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4);

        /* renamed from: a */
        public abstract void mo34775a(Canvas canvas, C9747b bVar, C9747b bVar2);

        /* renamed from: a */
        public abstract void mo34777a(C9747b bVar, C9747b bVar2, int i, int i2);

        /* renamed from: a */
        public abstract void mo34778a(C9747b bVar, C9747b bVar2, boolean z);

        /* renamed from: a */
        public abstract boolean mo34779a(PointF pointF, C9747b bVar);

        /* renamed from: d */
        public boolean mo34793d() {
            boolean[] e = m45478e();
            boolean z = this.f25881N;
            e[18] = true;
            return z;
        }

        /* renamed from: a */
        public void mo34776a(Canvas canvas, C9747b bVar, C9758c[] cVarArr) {
            boolean[] e = m45478e();
            int color = this.f25883b.getColor();
            e[9] = true;
            PointF[] l = bVar.mo34769l();
            e[10] = true;
            int i = 0;
            while (i < cVarArr.length) {
                e[11] = true;
                cVarArr[i].mo34798a(l[i]);
                e[12] = true;
                cVarArr[i].mo34796a(color);
                e[13] = true;
                cVarArr[i].mo34797a(canvas);
                i++;
                e[14] = true;
            }
            e[15] = true;
        }

        /* renamed from: a */
        public void mo34792a(boolean z) {
            boolean[] e = m45478e();
            this.f25881N = z;
            e[17] = true;
        }
    }

    /* renamed from: com.instabug.library.annotation.b$j */
    /* compiled from: ZoomedShape */
    public class C9757j extends C9752e {

        /* renamed from: V */
        private static transient /* synthetic */ boolean[] f25884V;

        /* renamed from: R */
        private PointF f25885R;

        /* renamed from: S */
        private float f25886S;

        /* renamed from: T */
        private float f25887T;

        /* renamed from: U */
        private float f25888U;

        public C9757j(Bitmap bitmap) {
            boolean[] e = m45489e();
            super(C0886a.f4059c);
            this.f25869P = bitmap;
            e[0] = true;
            mo34792a(true);
            e[1] = true;
        }

        /* renamed from: e */
        private static /* synthetic */ boolean[] m45489e() {
            boolean[] zArr = f25884V;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(8173898965284455731L, "com/instabug/library/annotation/shape/ZoomedShape", 36);
            f25884V = a;
            return a;
        }

        /* renamed from: a */
        public void mo34794a(Bitmap bitmap) {
            boolean[] e = m45489e();
            this.f25869P = bitmap;
            e[2] = true;
        }

        /* renamed from: a */
        public void mo34784a(Canvas canvas, Bitmap bitmap, float f, float f2) {
            boolean[] e = m45489e();
            this.f25888U = (float) Math.min(bitmap.getWidth() / 2, bitmap.getHeight() / 2);
            e[3] = true;
            this.f25886S = (((float) bitmap.getWidth()) / 2.0f) + f;
            e[4] = true;
            this.f25887T = (((float) bitmap.getHeight()) / 2.0f) + f2;
            e[5] = true;
            this.f25885R = C9761c.m45519a(this.f25888U, 45.0f, new PointF(this.f25886S, this.f25887T));
            e[6] = true;
            Bitmap a = C9760b.m45511a(bitmap, 200);
            e[7] = true;
            canvas.drawBitmap(C9760b.m45510a(a), f, f2, null);
            e[8] = true;
        }

        /* renamed from: a */
        public boolean mo34779a(PointF pointF, C9747b bVar) {
            boolean[] e = m45489e();
            Region region = new Region();
            e[9] = true;
            RectF rectF = new RectF();
            e[10] = true;
            Path path = new Path();
            e[11] = true;
            path.addCircle(this.f25886S, this.f25887T, this.f25888U, Direction.CW);
            e[12] = true;
            path.computeBounds(rectF, true);
            e[13] = true;
            region.setPath(path, new Region((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
            e[14] = true;
            boolean contains = region.contains((int) pointF.x, (int) pointF.y);
            e[15] = true;
            return contains;
        }

        /* renamed from: a */
        public void mo34778a(C9747b bVar, C9747b bVar2, boolean z) {
            boolean[] e = m45489e();
            if (Math.abs(bVar2.width() - bVar.width()) >= 1.0f) {
                e[16] = true;
            } else {
                e[17] = true;
                if (Math.abs(bVar2.height() - bVar.height()) >= 1.0f) {
                    e[18] = true;
                } else {
                    e[19] = true;
                    bVar2.mo34764a(bVar);
                    e[20] = true;
                    e[27] = true;
                }
            }
            float width = bVar.width() / bVar2.width();
            e[21] = true;
            float height = bVar.height() / bVar2.height();
            e[22] = true;
            float max = Math.max(width, height);
            e[23] = true;
            Matrix matrix = new Matrix();
            e[24] = true;
            matrix.postScale(max, max, bVar2.centerX(), bVar2.centerY());
            e[25] = true;
            matrix.mapRect(bVar2);
            e[26] = true;
            e[27] = true;
        }

        /* renamed from: a */
        public void mo34776a(Canvas canvas, C9747b bVar, C9758c[] cVarArr) {
            boolean[] e = m45489e();
            PointF pointF = this.f25885R;
            if (pointF == null) {
                pointF = bVar.mo34767j();
                e[28] = true;
            } else {
                e[29] = true;
            }
            e[30] = true;
            cVarArr[2].mo34798a(pointF);
            e[31] = true;
            cVarArr[2].mo34796a(Instabug.getPrimaryColor());
            e[32] = true;
            cVarArr[2].mo34797a(canvas);
            e[33] = true;
        }

        /* renamed from: a */
        public void mo34774a(Canvas canvas, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
            m45489e()[34] = true;
        }

        /* renamed from: a */
        public Path mo34771a(C9747b bVar) {
            m45489e()[35] = true;
            return null;
        }
    }

    public C9747b() {
        boolean[] n = m45410n();
        n[0] = true;
        n[1] = true;
        this.f25853Q = new PointF();
        n[2] = true;
        this.f25854R = new PointF();
        n[3] = true;
        this.f25855S = new PointF();
        this.f25856T = false;
        this.f25857U = true;
        n[4] = true;
    }

    /* renamed from: b */
    private void m45409b(C9747b bVar) {
        boolean[] n = m45410n();
        if (bVar == null) {
            this.bottom = 0.0f;
            this.right = 0.0f;
            this.top = 0.0f;
            this.left = 0.0f;
            this.f25850N = null;
            this.f25858a = null;
            this.f25851O = null;
            this.f25859b = null;
            n[17] = true;
            this.f25852P.set(0.0f, 0.0f);
            n[18] = true;
            this.f25853Q.set(0.0f, 0.0f);
            n[19] = true;
            this.f25854R.set(0.0f, 0.0f);
            n[20] = true;
            this.f25855S.set(0.0f, 0.0f);
            this.f25856T = false;
            this.f25857U = true;
            n[21] = true;
        } else {
            this.left = bVar.left;
            this.top = bVar.top;
            this.right = bVar.right;
            this.bottom = bVar.bottom;
            this.f25858a = bVar.f25858a;
            this.f25859b = bVar.f25859b;
            this.f25850N = bVar.f25850N;
            this.f25851O = bVar.f25851O;
            n[22] = true;
            this.f25852P.set(bVar.f25852P);
            n[23] = true;
            this.f25853Q.set(bVar.f25853Q);
            n[24] = true;
            this.f25854R.set(bVar.f25854R);
            n[25] = true;
            this.f25855S.set(bVar.f25855S);
            this.f25856T = bVar.f25856T;
            n[26] = true;
            this.f25857U = bVar.mo34770m();
            n[27] = true;
        }
        n[28] = true;
    }

    /* renamed from: n */
    private static /* synthetic */ boolean[] m45410n() {
        boolean[] zArr = f25849V;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-2583047110810522973L, "com/instabug/library/annotation/DirectionRectF", 37);
        f25849V = a;
        return a;
    }

    /* renamed from: a */
    public void mo34764a(C9747b bVar) {
        boolean[] n = m45410n();
        m45409b(bVar);
        n[16] = true;
    }

    /* renamed from: i */
    public PointF mo34766i() {
        boolean[] n = m45410n();
        PointF pointF = new PointF(this.right, this.top);
        n[30] = true;
        return pointF;
    }

    /* renamed from: j */
    public PointF mo34767j() {
        boolean[] n = m45410n();
        PointF pointF = new PointF(this.right, this.bottom);
        n[31] = true;
        return pointF;
    }

    /* renamed from: k */
    public PointF mo34768k() {
        boolean[] n = m45410n();
        PointF pointF = new PointF(this.left, this.bottom);
        n[32] = true;
        return pointF;
    }

    /* renamed from: l */
    public PointF[] mo34769l() {
        boolean[] n = m45410n();
        n[33] = true;
        PointF[] pointFArr = {mo34763a(), mo34766i(), mo34767j(), mo34768k()};
        n[34] = true;
        return pointFArr;
    }

    /* renamed from: m */
    public boolean mo34770m() {
        boolean[] n = m45410n();
        boolean z = this.f25857U;
        n[35] = true;
        return z;
    }

    /* renamed from: a */
    public PointF mo34763a() {
        boolean[] n = m45410n();
        PointF pointF = new PointF(this.left, this.top);
        n[29] = true;
        return pointF;
    }

    /* renamed from: a */
    public void mo34765a(boolean z) {
        boolean[] n = m45410n();
        this.f25857U = z;
        n[36] = true;
    }

    public C9747b(C9747b bVar) {
        boolean[] n = m45410n();
        n[5] = true;
        n[6] = true;
        this.f25853Q = new PointF();
        n[7] = true;
        this.f25854R = new PointF();
        n[8] = true;
        this.f25855S = new PointF();
        this.f25856T = false;
        this.f25857U = true;
        n[9] = true;
        m45409b(bVar);
        n[10] = true;
    }

    public C9747b(float f, float f2, float f3, float f4) {
        boolean[] n = m45410n();
        super(f, f2, f3, f4);
        n[11] = true;
        n[12] = true;
        this.f25853Q = new PointF();
        n[13] = true;
        this.f25854R = new PointF();
        n[14] = true;
        this.f25855S = new PointF();
        this.f25856T = false;
        this.f25857U = true;
        n[15] = true;
    }
}
