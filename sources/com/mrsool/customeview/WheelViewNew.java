package com.mrsool.customeview;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.mrsool.utils.C5880q;
import java.util.ArrayList;
import java.util.List;

public class WheelViewNew extends ScrollView {

    /* renamed from: f0 */
    public static final String f29489f0 = WheelViewNew.class.getSimpleName();

    /* renamed from: g0 */
    public static final int f29490g0 = 1;

    /* renamed from: h0 */
    private static final int f29491h0 = 0;

    /* renamed from: i0 */
    private static final int f29492i0 = 1;

    /* renamed from: N */
    private LinearLayout f29493N;

    /* renamed from: O */
    private View f29494O;

    /* renamed from: P */
    List<String> f29495P;

    /* renamed from: Q */
    int f29496Q = 1;

    /* renamed from: R */
    int f29497R;

    /* renamed from: S */
    int f29498S = 1;

    /* renamed from: T */
    int f29499T;

    /* renamed from: U */
    Runnable f29500U;

    /* renamed from: V */
    int f29501V = 50;

    /* renamed from: W */
    int f29502W = 0;

    /* renamed from: a */
    public C10751f f29503a;

    /* renamed from: a0 */
    int[] f29504a0;

    /* renamed from: b */
    private Context f29505b;

    /* renamed from: b0 */
    private int f29506b0 = -1;

    /* renamed from: c0 */
    Paint f29507c0;

    /* renamed from: d0 */
    int f29508d0;

    /* renamed from: e0 */
    private C10750e f29509e0;

    /* renamed from: com.mrsool.customeview.WheelViewNew$a */
    class C10744a implements Runnable {

        /* renamed from: com.mrsool.customeview.WheelViewNew$a$a */
        class C10745a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f29512a;

            /* renamed from: b */
            final /* synthetic */ int f29513b;

            C10745a(int i, int i2) {
                this.f29512a = i;
                this.f29513b = i2;
            }

            public void run() {
                WheelViewNew wheelViewNew = WheelViewNew.this;
                wheelViewNew.smoothScrollTo(0, (wheelViewNew.f29499T - this.f29512a) + wheelViewNew.f29502W);
                WheelViewNew wheelViewNew2 = WheelViewNew.this;
                wheelViewNew2.f29498S = this.f29513b + wheelViewNew2.f29496Q + 1;
                wheelViewNew2.m49433d();
            }
        }

        /* renamed from: com.mrsool.customeview.WheelViewNew$a$b */
        class C10746b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f29515a;

            /* renamed from: b */
            final /* synthetic */ int f29516b;

            C10746b(int i, int i2) {
                this.f29515a = i;
                this.f29516b = i2;
            }

            public void run() {
                WheelViewNew wheelViewNew = WheelViewNew.this;
                wheelViewNew.smoothScrollTo(0, wheelViewNew.f29499T - this.f29515a);
                WheelViewNew wheelViewNew2 = WheelViewNew.this;
                wheelViewNew2.f29498S = this.f29516b + wheelViewNew2.f29496Q;
                wheelViewNew2.m49433d();
            }
        }

        C10744a() {
        }

        public void run() {
            int scrollY = WheelViewNew.this.getScrollY();
            WheelViewNew wheelViewNew = WheelViewNew.this;
            int i = wheelViewNew.f29499T;
            if (i - scrollY == 0) {
                int i2 = wheelViewNew.f29502W;
                int i3 = i % i2;
                int i4 = i / i2;
                if (i3 == 0) {
                    wheelViewNew.f29498S = i4 + wheelViewNew.f29496Q;
                    wheelViewNew.m49433d();
                } else if (i3 > i2 / 2) {
                    wheelViewNew.post(new C10745a(i3, i4));
                } else {
                    wheelViewNew.post(new C10746b(i3, i4));
                }
            } else {
                wheelViewNew.f29499T = wheelViewNew.getScrollY();
                WheelViewNew wheelViewNew2 = WheelViewNew.this;
                wheelViewNew2.postDelayed(wheelViewNew2.f29500U, (long) wheelViewNew2.f29501V);
            }
        }
    }

    /* renamed from: com.mrsool.customeview.WheelViewNew$b */
    class C10747b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f29517a;

        C10747b(String str) {
            this.f29517a = str;
        }

        public void onClick(View view) {
            C10751f fVar = WheelViewNew.this.f29503a;
            if (fVar != null) {
                fVar.mo36638a(this.f29517a);
            }
        }
    }

    /* renamed from: com.mrsool.customeview.WheelViewNew$c */
    class C10748c extends Drawable {
        C10748c() {
        }

        public void draw(Canvas canvas) {
            WheelViewNew wheelViewNew = WheelViewNew.this;
            float f = (float) ((wheelViewNew.f29508d0 * 1) / 6);
            float f2 = (float) wheelViewNew.m49432c()[0];
            WheelViewNew wheelViewNew2 = WheelViewNew.this;
            Canvas canvas2 = canvas;
            canvas2.drawLine(f, f2, (float) ((wheelViewNew2.f29508d0 * 5) / 6), (float) wheelViewNew2.m49432c()[0], WheelViewNew.this.f29507c0);
            WheelViewNew wheelViewNew3 = WheelViewNew.this;
            float f3 = (float) ((wheelViewNew3.f29508d0 * 1) / 6);
            float f4 = (float) wheelViewNew3.m49432c()[1];
            WheelViewNew wheelViewNew4 = WheelViewNew.this;
            canvas2.drawLine(f3, f4, (float) ((wheelViewNew4.f29508d0 * 5) / 6), (float) wheelViewNew4.m49432c()[1], WheelViewNew.this.f29507c0);
        }

        public int getOpacity() {
            return 0;
        }

        public void setAlpha(int i) {
        }

        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    /* renamed from: com.mrsool.customeview.WheelViewNew$d */
    class C10749d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f29520a;

        C10749d(int i) {
            this.f29520a = i;
        }

        public void run() {
            WheelViewNew wheelViewNew = WheelViewNew.this;
            wheelViewNew.smoothScrollTo(0, this.f29520a * wheelViewNew.f29502W);
        }
    }

    /* renamed from: com.mrsool.customeview.WheelViewNew$e */
    public static class C10750e {
        /* renamed from: a */
        public void mo36637a(int i, String str) {
        }
    }

    /* renamed from: com.mrsool.customeview.WheelViewNew$f */
    public interface C10751f {
        /* renamed from: a */
        void mo36638a(String str);
    }

    public WheelViewNew(Context context) {
        super(context);
        m49428a(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public int[] m49432c() {
        if (this.f29504a0 == null) {
            this.f29504a0 = new int[2];
            int[] iArr = this.f29504a0;
            int i = this.f29502W;
            int i2 = this.f29496Q;
            iArr[0] = i * i2;
            iArr[1] = i * (i2 + 1);
        }
        return this.f29504a0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m49433d() {
        C10750e eVar = this.f29509e0;
        if (eVar != null) {
            int i = this.f29498S;
            eVar.mo36637a(i, (String) this.f29495P.get(i));
        }
    }

    private List<String> getItems() {
        return this.f29495P;
    }

    public void fling(int i) {
        super.fling(i / 3);
    }

    public int getOffset() {
        return this.f29496Q;
    }

    public C10750e getOnWheelViewListener() {
        return this.f29509e0;
    }

    public int getSeletedIndex() {
        return this.f29498S - this.f29496Q;
    }

    public String getSeletedItem() {
        return (String) this.f29495P.get(this.f29498S);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        m49427a(i2);
        if (i2 > i4) {
            this.f29506b0 = 1;
        } else {
            this.f29506b0 = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        StringBuilder sb = new StringBuilder();
        sb.append(f29489f0);
        sb.append("w: ");
        sb.append(i);
        sb.append(", h: ");
        sb.append(i2);
        sb.append(", oldw: ");
        sb.append(i3);
        sb.append(", oldh: ");
        sb.append(i4);
        C5880q.m25750a(sb.toString());
        this.f29508d0 = i;
        setBackground(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            mo38275a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackground(Drawable drawable) {
        if (this.f29508d0 == 0) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) this.f29505b).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            this.f29508d0 = displayMetrics.widthPixels;
            StringBuilder sb = new StringBuilder();
            sb.append(f29489f0);
            sb.append("viewWidth: ");
            sb.append(this.f29508d0);
            C5880q.m25750a(sb.toString());
        }
        if (this.f29507c0 == null) {
            this.f29507c0 = new Paint();
            this.f29507c0.setColor(Color.parseColor("#FFFFFF"));
            this.f29507c0.setStrokeWidth((float) m49424a(0.5f));
        }
        super.setBackground(new C10748c());
    }

    public void setItems(List<String> list) {
        if (this.f29495P == null) {
            this.f29495P = new ArrayList();
        }
        this.f29495P.clear();
        this.f29495P.addAll(list);
        for (int i = 0; i < this.f29496Q; i++) {
            String str = "";
            this.f29495P.add(0, str);
            this.f29495P.add(str);
        }
        m49430b();
    }

    public void setOffset(int i) {
        this.f29496Q = i;
    }

    public void setOnWheelViewListener(C10750e eVar) {
        this.f29509e0 = eVar;
    }

    public void setSelectorCenterView(View view) {
        this.f29494O = view;
    }

    public void setSeletion(int i) {
        this.f29498S = this.f29496Q + i;
        post(new C10749d(i));
    }

    public void setmOnWheelItemClickListner(C10751f fVar) {
        this.f29503a = fVar;
    }

    /* renamed from: a */
    private void m49428a(Context context) {
        this.f29505b = context;
        StringBuilder sb = new StringBuilder();
        sb.append(f29489f0);
        sb.append("parent: ");
        sb.append(getParent());
        C5880q.m25750a(sb.toString());
        setVerticalScrollBarEnabled(false);
        this.f29493N = new LinearLayout(context);
        this.f29493N.setOrientation(1);
        addView(this.f29493N);
        this.f29500U = new C10744a();
    }

    /* renamed from: b */
    private void m49430b() {
        this.f29497R = (this.f29496Q * 2) + 1;
        for (String a : this.f29495P) {
            this.f29493N.addView(m49426a(a));
        }
        m49427a(0);
    }

    public WheelViewNew(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49428a(context);
    }

    /* renamed from: a */
    public void mo38275a() {
        this.f29499T = getScrollY();
        postDelayed(this.f29500U, (long) this.f29501V);
    }

    /* renamed from: a */
    private TextView m49426a(String str) {
        CustomeTextViewRobotoMedium customeTextViewRobotoMedium = new CustomeTextViewRobotoMedium(this.f29505b);
        customeTextViewRobotoMedium.setLayoutParams(new LayoutParams(-1, -2));
        customeTextViewRobotoMedium.setSingleLine(true);
        customeTextViewRobotoMedium.setTextSize(2, 16.0f);
        customeTextViewRobotoMedium.setText(str);
        customeTextViewRobotoMedium.setGravity(17);
        int a = m49424a(10.0f);
        customeTextViewRobotoMedium.setPadding(a, a, a, a);
        customeTextViewRobotoMedium.setOnClickListener(new C10747b(str));
        if (this.f29502W == 0) {
            this.f29502W = m49425a((View) customeTextViewRobotoMedium);
            LayoutParams layoutParams = new LayoutParams(-1, this.f29502W);
            layoutParams.gravity = 17;
            this.f29494O.setLayoutParams(layoutParams);
            StringBuilder sb = new StringBuilder();
            sb.append(f29489f0);
            sb.append("itemHeight: ");
            sb.append(this.f29502W);
            C5880q.m25750a(sb.toString());
            this.f29493N.setLayoutParams(new LayoutParams(-1, this.f29502W * this.f29497R));
            setLayoutParams(new LayoutParams(((LayoutParams) getLayoutParams()).width, this.f29502W * this.f29497R));
        }
        return customeTextViewRobotoMedium;
    }

    public WheelViewNew(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m49428a(context);
    }

    /* renamed from: a */
    private void m49427a(int i) {
        int i2 = this.f29502W;
        int i3 = i / i2;
        int i4 = this.f29496Q;
        int i5 = i3 + i4;
        int i6 = i % i2;
        int i7 = i / i2;
        if (i6 == 0) {
            i5 = i7 + i4;
        } else if (i6 > i2 / 2) {
            i5 = i7 + i4 + 1;
        }
        int childCount = this.f29493N.getChildCount();
        int i8 = 0;
        while (i8 < childCount) {
            TextView textView = (TextView) this.f29493N.getChildAt(i8);
            if (textView != null) {
                if (i5 == i8) {
                    textView.setTextColor(Color.parseColor("#5B6670"));
                } else {
                    textView.setTextColor(Color.parseColor("#807A858C"));
                }
                i8++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private int m49424a(float f) {
        return (int) ((f * this.f29505b.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: a */
    private int m49425a(View view) {
        view.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
        return view.getMeasuredHeight();
    }
}
