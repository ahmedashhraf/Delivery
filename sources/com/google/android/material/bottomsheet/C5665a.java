package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.C0183c0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0216r0;
import androidx.appcompat.app.C0299g;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p034l.C0947a;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.p035o0.C1016d;
import com.google.android.material.C5582R;
import com.google.android.material.bottomsheet.BottomSheetBehavior.C5662e;

/* renamed from: com.google.android.material.bottomsheet.a */
/* compiled from: BottomSheetDialog */
public class C5665a extends C0299g {

    /* renamed from: N */
    boolean f16322N;

    /* renamed from: O */
    boolean f16323O;

    /* renamed from: P */
    private boolean f16324P;

    /* renamed from: Q */
    private boolean f16325Q;
    @C0193h0

    /* renamed from: R */
    private C5662e f16326R;

    /* renamed from: a */
    private BottomSheetBehavior<FrameLayout> f16327a;

    /* renamed from: b */
    private FrameLayout f16328b;

    /* renamed from: com.google.android.material.bottomsheet.a$a */
    /* compiled from: BottomSheetDialog */
    class C5666a implements OnClickListener {
        C5666a() {
        }

        public void onClick(View view) {
            C5665a aVar = C5665a.this;
            if (aVar.f16323O && aVar.isShowing() && C5665a.this.mo22494d()) {
                C5665a.this.cancel();
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$b */
    /* compiled from: BottomSheetDialog */
    class C5667b extends C0947a {
        C5667b() {
        }

        /* renamed from: a */
        public void mo4749a(View view, @C0193h0 C1016d dVar) {
            super.mo4749a(view, dVar);
            if (C5665a.this.f16323O) {
                dVar.mo4930a(1048576);
                dVar.mo4998h(true);
                return;
            }
            dVar.mo4998h(false);
        }

        /* renamed from: a */
        public boolean mo4750a(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                C5665a aVar = C5665a.this;
                if (aVar.f16323O) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.mo4750a(view, i, bundle);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$c */
    /* compiled from: BottomSheetDialog */
    class C5668c implements OnTouchListener {
        C5668c() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$d */
    /* compiled from: BottomSheetDialog */
    class C5669d extends C5662e {
        C5669d() {
        }

        /* renamed from: a */
        public void mo22486a(@C0193h0 View view, float f) {
        }

        /* renamed from: a */
        public void mo22487a(@C0193h0 View view, int i) {
            if (i == 5) {
                C5665a.this.cancel();
            }
        }
    }

    public C5665a(@C0193h0 Context context) {
        this(context, 0);
    }

    /* renamed from: e */
    private FrameLayout m24769e() {
        if (this.f16328b == null) {
            this.f16328b = (FrameLayout) View.inflate(getContext(), C5582R.layout.design_bottom_sheet_dialog, null);
            this.f16327a = BottomSheetBehavior.m24700c((FrameLayout) this.f16328b.findViewById(C5582R.C5586id.design_bottom_sheet));
            this.f16327a.mo22458a(this.f16326R);
            this.f16327a.mo22465b(this.f16323O);
        }
        return this.f16328b;
    }

    private static int getThemeResId(@C0193h0 Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C5582R.attr.bottomSheetDialogTheme, typedValue, true)) {
            return typedValue.resourceId;
        }
        return C5582R.style.Theme_Design_Light_BottomSheetDialog;
    }

    @C0193h0
    /* renamed from: a */
    public BottomSheetBehavior<FrameLayout> mo22489a() {
        if (this.f16327a == null) {
            m24769e();
        }
        return this.f16327a;
    }

    /* renamed from: b */
    public boolean mo22491b() {
        return this.f16322N;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo22492c() {
        this.f16327a.mo22464b(this.f16326R);
    }

    public void cancel() {
        BottomSheetBehavior a = mo22489a();
        if (!this.f16322N || a.mo22478h() == 5) {
            super.cancel();
        } else {
            a.mo22474e(5);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo22494d() {
        if (!this.f16325Q) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.f16324P = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f16325Q = true;
        }
        return this.f16324P;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f16327a;
        if (bottomSheetBehavior != null && bottomSheetBehavior.mo22478h() == 5) {
            this.f16327a.mo22474e(4);
        }
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f16323O != z) {
            this.f16323O = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f16327a;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.mo22465b(z);
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f16323O) {
            this.f16323O = true;
        }
        this.f16324P = z;
        this.f16325Q = true;
    }

    public void setContentView(@C0183c0 int i) {
        super.setContentView(m24768a(i, null, null));
    }

    public C5665a(@C0193h0 Context context, @C0216r0 int i) {
        super(context, getThemeResId(context, i));
        this.f16323O = true;
        this.f16324P = true;
        this.f16326R = new C5669d();
        supportRequestWindowFeature(1);
    }

    public void setContentView(View view) {
        super.setContentView(m24768a(0, view, null));
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(m24768a(0, view, layoutParams));
    }

    /* renamed from: a */
    public void mo22490a(boolean z) {
        this.f16322N = z;
    }

    /* renamed from: a */
    private View m24768a(int i, @C0195i0 View view, @C0195i0 LayoutParams layoutParams) {
        m24769e();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f16328b.findViewById(C5582R.C5586id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        FrameLayout frameLayout = (FrameLayout) this.f16328b.findViewById(C5582R.C5586id.design_bottom_sheet);
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C5582R.C5586id.touch_outside).setOnClickListener(new C5666a());
        C0962e0.m5443a((View) frameLayout, (C0947a) new C5667b());
        frameLayout.setOnTouchListener(new C5668c());
        return this.f16328b;
    }

    protected C5665a(@C0193h0 Context context, boolean z, OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.f16323O = true;
        this.f16324P = true;
        this.f16326R = new C5669d();
        supportRequestWindowFeature(1);
        this.f16323O = z;
    }
}
