package com.instabug.library.internal.view.floatingactionbutton;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import androidx.core.p024e.p025b.C0886a;
import androidx.core.p034l.C0962e0;
import com.instabug.library.C9700R;
import com.instabug.library.view.C10030a;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.internal.view.floatingactionbutton.b */
/* compiled from: MuteFloatingActionButton */
public class C9874b extends C9871a {

    /* renamed from: c0 */
    private static transient /* synthetic */ boolean[] f26202c0;

    /* renamed from: b0 */
    private boolean f26203b0;

    /* renamed from: com.instabug.library.internal.view.floatingactionbutton.b$a */
    /* compiled from: MuteFloatingActionButton */
    class C9875a extends Shape {

        /* renamed from: Q */
        private static transient /* synthetic */ boolean[] f26204Q;

        /* renamed from: N */
        final /* synthetic */ float f26205N;

        /* renamed from: O */
        final /* synthetic */ float f26206O;

        /* renamed from: P */
        final /* synthetic */ C9874b f26207P;

        /* renamed from: a */
        final /* synthetic */ float f26208a;

        /* renamed from: b */
        final /* synthetic */ float f26209b;

        C9875a(C9874b bVar, float f, float f2, float f3, float f4) {
            boolean[] b = m45980b();
            this.f26207P = bVar;
            this.f26208a = f;
            this.f26209b = f2;
            this.f26205N = f3;
            this.f26206O = f4;
            b[0] = true;
        }

        /* renamed from: b */
        private static /* synthetic */ boolean[] m45980b() {
            boolean[] zArr = f26204Q;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-4660326957784138606L, "com/instabug/library/internal/view/floatingactionbutton/MuteFloatingActionButton$1", 14);
            f26204Q = a;
            return a;
        }

        public void draw(Canvas canvas, Paint paint) {
            boolean[] b = m45980b();
            if (C9874b.m45974a(this.f26207P)) {
                b[1] = true;
                paint.setColor(C0886a.f4059c);
                b[2] = true;
                paint.setStyle(Style.FILL_AND_STROKE);
                b[3] = true;
                paint.setStrokeWidth(this.f26208a);
                b[4] = true;
                float f = this.f26209b;
                canvas.drawCircle(f, f, this.f26205N / 2.0f, paint);
                b[5] = true;
            } else {
                paint.setColor(C0962e0.f4343t);
                b[6] = true;
                paint.setStrokeWidth(this.f26208a);
                b[7] = true;
                paint.setStyle(Style.STROKE);
                b[8] = true;
                float f2 = this.f26209b;
                canvas.drawCircle(f2, f2, this.f26205N / 2.0f, paint);
                b[9] = true;
                paint.setColor(C0962e0.f4343t);
                b[10] = true;
                paint.setStrokeWidth(this.f26208a);
                b[11] = true;
                float f3 = this.f26208a;
                float f4 = this.f26206O;
                canvas.drawLine(0.0f, f3, f4, f4 + f3, paint);
                b[12] = true;
            }
            b[13] = true;
        }
    }

    public C9874b(Context context) {
        boolean[] e = m45975e();
        this(context, null);
        e[0] = true;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m45974a(C9874b bVar) {
        boolean[] e = m45975e();
        boolean z = bVar.f26203b0;
        e[26] = true;
        return z;
    }

    /* renamed from: e */
    private static /* synthetic */ boolean[] m45975e() {
        boolean[] zArr = f26202c0;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(7193239490685312880L, "com/instabug/library/internal/view/floatingactionbutton/MuteFloatingActionButton", 27);
        f26202c0 = a;
        return a;
    }

    /* renamed from: b */
    public boolean mo35149b() {
        boolean[] e = m45975e();
        if (this.f26203b0) {
            e[16] = true;
            mo35151d();
            e[17] = true;
        } else {
            mo35150c();
            e[18] = true;
        }
        boolean z = this.f26203b0;
        e[19] = true;
        return z;
    }

    /* renamed from: c */
    public void mo35150c() {
        boolean[] e = m45975e();
        this.f26203b0 = true;
        e[20] = true;
        mo35126a();
        e[21] = true;
        setTextColor(-1);
        e[22] = true;
    }

    /* renamed from: d */
    public void mo35151d() {
        boolean[] e = m45975e();
        this.f26203b0 = false;
        e[23] = true;
        mo35126a();
        e[24] = true;
        setTextColor(C0962e0.f4343t);
        e[25] = true;
    }

    /* access modifiers changed from: 0000 */
    public Drawable getIconDrawable() {
        boolean[] e = m45975e();
        float b = mo35127b(C9700R.dimen.instabug_fab_icon_size_mini);
        e[9] = true;
        float b2 = mo35127b(C9700R.dimen.instabug_fab_size_mini);
        float f = b / 2.0f;
        e[10] = true;
        float b3 = mo35127b(C9700R.dimen.instabug_fab_circle_icon_stroke);
        e[11] = true;
        C9875a aVar = new C9875a(this, b3, f, b2, b);
        e[12] = true;
        ShapeDrawable shapeDrawable = new ShapeDrawable(aVar);
        e[13] = true;
        Paint paint = shapeDrawable.getPaint();
        e[14] = true;
        paint.setAntiAlias(true);
        e[15] = true;
        return shapeDrawable;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35119a(Context context, AttributeSet attributeSet) {
        boolean[] e = m45975e();
        super.mo35119a(context, attributeSet);
        e[3] = true;
        setSize(1);
        e[4] = true;
        setId(C9700R.C9704id.instabug_video_mute_button);
        e[5] = true;
        setText(C10030a.m46656a(1));
        e[6] = true;
        setGravity(17);
        e[7] = true;
        mo35151d();
        e[8] = true;
    }

    public C9874b(Context context, AttributeSet attributeSet) {
        boolean[] e = m45975e();
        super(context, attributeSet);
        e[1] = true;
    }
}
