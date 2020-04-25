package com.google.android.material.p296f;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;
import androidx.annotation.C0186e;
import androidx.annotation.C0188f;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0199k0;
import androidx.annotation.C0211p;
import androidx.annotation.C0213q;
import androidx.annotation.C0214q0;
import androidx.annotation.C0216r0;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AlertDialog.C0257a;
import androidx.appcompat.p011d.C0341d;
import androidx.core.p034l.C0962e0;
import com.google.android.material.C5582R;
import com.google.android.material.p185e.C5713a;
import com.google.android.material.p187p.C6978j;
import com.google.android.material.p302m.C6951b;
import com.google.android.material.theme.p307a.C7109a;

/* renamed from: com.google.android.material.f.b */
/* compiled from: MaterialAlertDialogBuilder */
public class C6845b extends C0257a {
    @C0188f

    /* renamed from: e */
    private static final int f19058e = C5582R.attr.alertDialogStyle;
    @C0216r0

    /* renamed from: f */
    private static final int f19059f = C5582R.style.MaterialAlertDialog_MaterialComponents;
    @C0188f

    /* renamed from: g */
    private static final int f19060g = C5582R.attr.materialAlertDialogTheme;
    @C0195i0

    /* renamed from: c */
    private Drawable f19061c;
    @C0193h0
    @C0211p

    /* renamed from: d */
    private final Rect f19062d;

    public C6845b(Context context) {
        this(context, 0);
    }

    @C0193h0
    /* renamed from: f */
    public C6845b mo27221f(@C0199k0 int i) {
        this.f19062d.bottom = i;
        return this;
    }

    @C0193h0
    /* renamed from: g */
    public C6845b mo27222g(@C0199k0 int i) {
        if (VERSION.SDK_INT < 17 || mo765b().getResources().getConfiguration().getLayoutDirection() != 1) {
            this.f19062d.right = i;
        } else {
            this.f19062d.left = i;
        }
        return this;
    }

    @C0193h0
    /* renamed from: h */
    public C6845b mo27223h(@C0199k0 int i) {
        if (VERSION.SDK_INT < 17 || mo765b().getResources().getConfiguration().getLayoutDirection() != 1) {
            this.f19062d.left = i;
        } else {
            this.f19062d.right = i;
        }
        return this;
    }

    @C0193h0
    /* renamed from: i */
    public C6845b mo27224i(@C0199k0 int i) {
        this.f19062d.top = i;
        return this;
    }

    public C6845b(Context context, int i) {
        super(m32715a(context), m32714a(context, i));
        Context b = mo765b();
        Theme theme = b.getTheme();
        this.f19062d = C6846c.m32794a(b, f19058e, f19059f);
        int a = C5713a.m25189a(b, C5582R.attr.colorSurface, C6845b.class.getCanonicalName());
        C6978j jVar = new C6978j(b, null, f19058e, f19059f);
        jVar.mo27789a(b);
        jVar.mo27790a(ColorStateList.valueOf(a));
        if (VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(16844145, typedValue, true);
            float dimension = typedValue.getDimension(mo765b().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                jVar.mo27783a(dimension);
            }
        }
        this.f19061c = jVar;
    }

    @C0193h0
    /* renamed from: e */
    public C6845b mo27220e(Drawable drawable) {
        this.f19061c = drawable;
        return this;
    }

    @C0193h0
    /* renamed from: e */
    public C6845b m32788e(int i) {
        return (C6845b) super.mo782e(i);
    }

    @C0195i0
    /* renamed from: d */
    public Drawable mo27219d() {
        return this.f19061c;
    }

    @C0193h0
    /* renamed from: c */
    public C6845b m32776c(@C0214q0 int i) {
        return (C6845b) super.mo773c(i);
    }

    @C0193h0
    /* renamed from: d */
    public C6845b m32784d(@C0214q0 int i) {
        return (C6845b) super.mo779d(i);
    }

    @C0193h0
    /* renamed from: c */
    public C6845b m32779c(CharSequence charSequence, OnClickListener onClickListener) {
        return (C6845b) super.mo776c(charSequence, onClickListener);
    }

    @C0193h0
    /* renamed from: d */
    public C6845b m32785d(@C0214q0 int i, OnClickListener onClickListener) {
        return (C6845b) super.mo780d(i, onClickListener);
    }

    /* renamed from: b */
    private static int m32716b(@C0193h0 Context context) {
        TypedValue a = C6951b.m33326a(context, f19060g);
        if (a == null) {
            return 0;
        }
        return a.data;
    }

    @C0193h0
    /* renamed from: c */
    public C6845b m32777c(@C0214q0 int i, OnClickListener onClickListener) {
        return (C6845b) super.mo774c(i, onClickListener);
    }

    @C0193h0
    /* renamed from: d */
    public C6845b m32786d(Drawable drawable) {
        return (C6845b) super.mo781d(drawable);
    }

    @C0193h0
    /* renamed from: c */
    public C6845b m32778c(Drawable drawable) {
        return (C6845b) super.mo775c(drawable);
    }

    @C0193h0
    /* renamed from: b */
    public C6845b m32770b(@C0195i0 CharSequence charSequence) {
        return (C6845b) super.mo770b(charSequence);
    }

    @C0193h0
    /* renamed from: b */
    public C6845b m32766b(@C0188f int i) {
        return (C6845b) super.mo766b(i);
    }

    @C0193h0
    /* renamed from: b */
    public C6845b m32767b(@C0214q0 int i, OnClickListener onClickListener) {
        return (C6845b) super.mo767b(i, onClickListener);
    }

    @C0193h0
    /* renamed from: b */
    public C6845b m32768b(Drawable drawable) {
        return (C6845b) super.mo768b(drawable);
    }

    @C0193h0
    /* renamed from: b */
    public C6845b m32771b(CharSequence charSequence, OnClickListener onClickListener) {
        return (C6845b) super.mo771b(charSequence, onClickListener);
    }

    @C0193h0
    /* renamed from: b */
    public C6845b m32769b(View view) {
        return (C6845b) super.mo769b(view);
    }

    /* renamed from: a */
    private static Context m32715a(@C0193h0 Context context) {
        int b = m32716b(context);
        Context b2 = C7109a.m34252b(context, null, f19058e, f19059f);
        if (b == 0) {
            return b2;
        }
        return new C0341d(b2, b);
    }

    /* renamed from: a */
    private static int m32714a(@C0193h0 Context context, int i) {
        return i == 0 ? m32716b(context) : i;
    }

    /* renamed from: a */
    public AlertDialog mo764a() {
        AlertDialog a = super.mo764a();
        Window window = a.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f19061c;
        if (drawable instanceof C6978j) {
            ((C6978j) drawable).mo27799b(C0962e0.m5551r(decorView));
        }
        window.setBackgroundDrawable(C6846c.m32795a(this.f19061c, this.f19062d));
        decorView.setOnTouchListener(new C6844a(a, this.f19062d));
        return a;
    }

    @C0193h0
    /* renamed from: a */
    public C6845b m32750a(@C0195i0 View view) {
        return (C6845b) super.mo753a(view);
    }

    @C0193h0
    /* renamed from: a */
    public C6845b m32754a(@C0195i0 CharSequence charSequence) {
        return (C6845b) super.mo758a(charSequence);
    }

    @C0193h0
    /* renamed from: a */
    public C6845b m32739a(@C0213q int i) {
        return (C6845b) super.mo742a(i);
    }

    @C0193h0
    /* renamed from: a */
    public C6845b m32749a(@C0195i0 Drawable drawable) {
        return (C6845b) super.mo752a(drawable);
    }

    @C0193h0
    /* renamed from: a */
    public C6845b m32755a(CharSequence charSequence, OnClickListener onClickListener) {
        return (C6845b) super.mo759a(charSequence, onClickListener);
    }

    @C0193h0
    /* renamed from: a */
    public C6845b m32756a(boolean z) {
        return (C6845b) super.mo760a(z);
    }

    @C0193h0
    /* renamed from: a */
    public C6845b m32743a(OnCancelListener onCancelListener) {
        return (C6845b) super.mo746a(onCancelListener);
    }

    @C0193h0
    /* renamed from: a */
    public C6845b m32744a(OnDismissListener onDismissListener) {
        return (C6845b) super.mo747a(onDismissListener);
    }

    @C0193h0
    /* renamed from: a */
    public C6845b m32745a(OnKeyListener onKeyListener) {
        return (C6845b) super.mo748a(onKeyListener);
    }

    @C0193h0
    /* renamed from: a */
    public C6845b m32741a(@C0186e int i, OnClickListener onClickListener) {
        return (C6845b) super.mo744a(i, onClickListener);
    }

    @C0193h0
    /* renamed from: a */
    public C6845b m32758a(CharSequence[] charSequenceArr, OnClickListener onClickListener) {
        return (C6845b) super.mo762a(charSequenceArr, onClickListener);
    }

    @C0193h0
    /* renamed from: a */
    public C6845b m32753a(ListAdapter listAdapter, OnClickListener onClickListener) {
        return (C6845b) super.mo757a(listAdapter, onClickListener);
    }

    @C0193h0
    /* renamed from: a */
    public C6845b m32747a(Cursor cursor, OnClickListener onClickListener, String str) {
        return (C6845b) super.mo750a(cursor, onClickListener, str);
    }

    @C0193h0
    /* renamed from: a */
    public C6845b m32742a(@C0186e int i, boolean[] zArr, OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (C6845b) super.mo745a(i, zArr, onMultiChoiceClickListener);
    }

    @C0193h0
    /* renamed from: a */
    public C6845b m32759a(CharSequence[] charSequenceArr, boolean[] zArr, OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (C6845b) super.mo763a(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @C0193h0
    /* renamed from: a */
    public C6845b m32748a(Cursor cursor, String str, String str2, OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (C6845b) super.mo751a(cursor, str, str2, onMultiChoiceClickListener);
    }

    @C0193h0
    /* renamed from: a */
    public C6845b m32740a(@C0186e int i, int i2, OnClickListener onClickListener) {
        return (C6845b) super.mo743a(i, i2, onClickListener);
    }

    @C0193h0
    /* renamed from: a */
    public C6845b m32746a(Cursor cursor, int i, String str, OnClickListener onClickListener) {
        return (C6845b) super.mo749a(cursor, i, str, onClickListener);
    }

    @C0193h0
    /* renamed from: a */
    public C6845b m32757a(CharSequence[] charSequenceArr, int i, OnClickListener onClickListener) {
        return (C6845b) super.mo761a(charSequenceArr, i, onClickListener);
    }

    @C0193h0
    /* renamed from: a */
    public C6845b m32752a(ListAdapter listAdapter, int i, OnClickListener onClickListener) {
        return (C6845b) super.mo756a(listAdapter, i, onClickListener);
    }

    @C0193h0
    /* renamed from: a */
    public C6845b m32751a(OnItemSelectedListener onItemSelectedListener) {
        return (C6845b) super.mo755a(onItemSelectedListener);
    }
}
