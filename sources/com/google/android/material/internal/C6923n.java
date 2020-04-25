package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import com.google.android.material.p302m.C6953d;
import com.google.android.material.p302m.C6957f;
import java.lang.ref.WeakReference;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.n */
/* compiled from: TextDrawableHelper */
public class C6923n {

    /* renamed from: a */
    private final TextPaint f19383a = new TextPaint(1);

    /* renamed from: b */
    private final C6957f f19384b = new C6924a();

    /* renamed from: c */
    private float f19385c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f19386d = true;
    /* access modifiers changed from: private */
    @C0195i0

    /* renamed from: e */
    public WeakReference<C6925b> f19387e = new WeakReference<>(null);
    @C0195i0

    /* renamed from: f */
    private C6953d f19388f;

    /* renamed from: com.google.android.material.internal.n$a */
    /* compiled from: TextDrawableHelper */
    class C6924a extends C6957f {
        C6924a() {
        }

        /* renamed from: a */
        public void mo22819a(@C0193h0 Typeface typeface, boolean z) {
            if (!z) {
                C6923n.this.f19386d = true;
                C6925b bVar = (C6925b) C6923n.this.f19387e.get();
                if (bVar != null) {
                    bVar.mo22249a();
                }
            }
        }

        /* renamed from: a */
        public void mo22818a(int i) {
            C6923n.this.f19386d = true;
            C6925b bVar = (C6925b) C6923n.this.f19387e.get();
            if (bVar != null) {
                bVar.mo22249a();
            }
        }
    }

    /* renamed from: com.google.android.material.internal.n$b */
    /* compiled from: TextDrawableHelper */
    public interface C6925b {
        /* renamed from: a */
        void mo22249a();

        @C0193h0
        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C6923n(@C0195i0 C6925b bVar) {
        mo27650a(bVar);
    }

    @C0193h0
    /* renamed from: b */
    public TextPaint mo27653b() {
        return this.f19383a;
    }

    /* renamed from: c */
    public boolean mo27654c() {
        return this.f19386d;
    }

    /* renamed from: a */
    public void mo27650a(@C0195i0 C6925b bVar) {
        this.f19387e = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public void mo27652a(boolean z) {
        this.f19386d = z;
    }

    /* renamed from: a */
    public float mo27647a(String str) {
        if (!this.f19386d) {
            return this.f19385c;
        }
        this.f19385c = m33239a((CharSequence) str);
        this.f19386d = false;
        return this.f19385c;
    }

    /* renamed from: a */
    private float m33239a(@C0195i0 CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f19383a.measureText(charSequence, 0, charSequence.length());
    }

    @C0195i0
    /* renamed from: a */
    public C6953d mo27648a() {
        return this.f19388f;
    }

    /* renamed from: a */
    public void mo27651a(@C0195i0 C6953d dVar, Context context) {
        if (this.f19388f != dVar) {
            this.f19388f = dVar;
            if (dVar != null) {
                dVar.mo27697c(context, this.f19383a, this.f19384b);
                C6925b bVar = (C6925b) this.f19387e.get();
                if (bVar != null) {
                    this.f19383a.drawableState = bVar.getState();
                }
                dVar.mo27696b(context, this.f19383a, this.f19384b);
                this.f19386d = true;
            }
            C6925b bVar2 = (C6925b) this.f19387e.get();
            if (bVar2 != null) {
                bVar2.mo22249a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    /* renamed from: a */
    public void mo27649a(Context context) {
        this.f19388f.mo27696b(context, this.f19383a, this.f19384b);
    }
}
