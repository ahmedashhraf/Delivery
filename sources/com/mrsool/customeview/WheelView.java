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
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.mrsool.utils.C5880q;
import java.util.ArrayList;
import java.util.List;

public class WheelView extends ScrollView {

    /* renamed from: d0 */
    public static final String f29428d0 = WheelView.class.getSimpleName();

    /* renamed from: e0 */
    public static final int f29429e0 = 1;

    /* renamed from: f0 */
    private static final int f29430f0 = 0;

    /* renamed from: g0 */
    private static final int f29431g0 = 1;

    /* renamed from: N */
    List<String> f29432N;

    /* renamed from: O */
    int f29433O = 1;

    /* renamed from: P */
    int f29434P;

    /* renamed from: Q */
    int f29435Q = 1;

    /* renamed from: R */
    int f29436R;

    /* renamed from: S */
    Runnable f29437S;

    /* renamed from: T */
    int f29438T = 50;

    /* renamed from: U */
    int f29439U = 0;

    /* renamed from: V */
    int[] f29440V;

    /* renamed from: W */
    private int f29441W = -1;

    /* renamed from: a */
    private Context f29442a;

    /* renamed from: a0 */
    Paint f29443a0;

    /* renamed from: b */
    private LinearLayout f29444b;

    /* renamed from: b0 */
    int f29445b0;

    /* renamed from: c0 */
    private C10735d f29446c0;

    /* renamed from: com.mrsool.customeview.WheelView$a */
    class C10730a implements Runnable {

        /* renamed from: com.mrsool.customeview.WheelView$a$a */
        class C10731a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f29449a;

            /* renamed from: b */
            final /* synthetic */ int f29450b;

            C10731a(int i, int i2) {
                this.f29449a = i;
                this.f29450b = i2;
            }

            public void run() {
                WheelView wheelView = WheelView.this;
                wheelView.smoothScrollTo(0, (wheelView.f29436R - this.f29449a) + wheelView.f29439U);
                WheelView wheelView2 = WheelView.this;
                wheelView2.f29435Q = this.f29450b + wheelView2.f29433O + 1;
                wheelView2.m49407d();
            }
        }

        /* renamed from: com.mrsool.customeview.WheelView$a$b */
        class C10732b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f29452a;

            /* renamed from: b */
            final /* synthetic */ int f29453b;

            C10732b(int i, int i2) {
                this.f29452a = i;
                this.f29453b = i2;
            }

            public void run() {
                WheelView wheelView = WheelView.this;
                wheelView.smoothScrollTo(0, wheelView.f29436R - this.f29452a);
                WheelView wheelView2 = WheelView.this;
                wheelView2.f29435Q = this.f29453b + wheelView2.f29433O;
                wheelView2.m49407d();
            }
        }

        C10730a() {
        }

        public void run() {
            int scrollY = WheelView.this.getScrollY();
            WheelView wheelView = WheelView.this;
            int i = wheelView.f29436R;
            if (i - scrollY == 0) {
                int i2 = wheelView.f29439U;
                int i3 = i % i2;
                int i4 = i / i2;
                if (i3 == 0) {
                    wheelView.f29435Q = i4 + wheelView.f29433O;
                    wheelView.m49407d();
                } else if (i3 > i2 / 2) {
                    wheelView.post(new C10731a(i3, i4));
                } else {
                    wheelView.post(new C10732b(i3, i4));
                }
            } else {
                wheelView.f29436R = wheelView.getScrollY();
                WheelView wheelView2 = WheelView.this;
                wheelView2.postDelayed(wheelView2.f29437S, (long) wheelView2.f29438T);
            }
        }
    }

    /* renamed from: com.mrsool.customeview.WheelView$b */
    class C10733b extends Drawable {
        C10733b() {
        }

        public void draw(Canvas canvas) {
            WheelView wheelView = WheelView.this;
            float f = (float) ((wheelView.f29445b0 * 1) / 6);
            float f2 = (float) wheelView.m49406c()[0];
            WheelView wheelView2 = WheelView.this;
            Canvas canvas2 = canvas;
            canvas2.drawLine(f, f2, (float) ((wheelView2.f29445b0 * 5) / 6), (float) wheelView2.m49406c()[0], WheelView.this.f29443a0);
            WheelView wheelView3 = WheelView.this;
            float f3 = (float) ((wheelView3.f29445b0 * 1) / 6);
            float f4 = (float) wheelView3.m49406c()[1];
            WheelView wheelView4 = WheelView.this;
            canvas2.drawLine(f3, f4, (float) ((wheelView4.f29445b0 * 5) / 6), (float) wheelView4.m49406c()[1], WheelView.this.f29443a0);
        }

        public int getOpacity() {
            return 0;
        }

        public void setAlpha(int i) {
        }

        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    /* renamed from: com.mrsool.customeview.WheelView$c */
    class C10734c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f29455a;

        C10734c(int i) {
            this.f29455a = i;
        }

        public void run() {
            WheelView wheelView = WheelView.this;
            wheelView.smoothScrollTo(0, this.f29455a * wheelView.f29439U);
        }
    }

    /* renamed from: com.mrsool.customeview.WheelView$d */
    public static class C10735d {
        /* renamed from: a */
        public void mo36632a(int i, String str) {
        }
    }

    public WheelView(Context context) {
        super(context);
        m49402a(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public int[] m49406c() {
        if (this.f29440V == null) {
            this.f29440V = new int[2];
            int[] iArr = this.f29440V;
            int i = this.f29439U;
            int i2 = this.f29433O;
            iArr[0] = i * i2;
            iArr[1] = i * (i2 + 1);
        }
        return this.f29440V;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m49407d() {
        C10735d dVar = this.f29446c0;
        if (dVar != null) {
            int i = this.f29435Q;
            dVar.mo36632a(i, (String) this.f29432N.get(i));
        }
    }

    private List<String> getItems() {
        return this.f29432N;
    }

    public void fling(int i) {
        super.fling(i / 3);
    }

    public int getOffset() {
        return this.f29433O;
    }

    public C10735d getOnWheelViewListener() {
        return this.f29446c0;
    }

    public int getSeletedIndex() {
        return this.f29435Q - this.f29433O;
    }

    public String getSeletedItem() {
        return (String) this.f29432N.get(this.f29435Q);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        m49401a(i2);
        if (i2 > i4) {
            this.f29441W = 1;
        } else {
            this.f29441W = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        StringBuilder sb = new StringBuilder();
        sb.append(f29428d0);
        sb.append("w: ");
        sb.append(i);
        sb.append(", h: ");
        sb.append(i2);
        sb.append(", oldw: ");
        sb.append(i3);
        sb.append(", oldh: ");
        sb.append(i4);
        C5880q.m25750a(sb.toString());
        this.f29445b0 = i;
        setBackground(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            mo38225a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackground(Drawable drawable) {
        if (this.f29445b0 == 0) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) this.f29442a).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            this.f29445b0 = displayMetrics.widthPixels;
            StringBuilder sb = new StringBuilder();
            sb.append(f29428d0);
            sb.append("viewWidth: ");
            sb.append(this.f29445b0);
            C5880q.m25750a(sb.toString());
        }
        if (this.f29443a0 == null) {
            this.f29443a0 = new Paint();
            this.f29443a0.setColor(Color.parseColor("#5B6769"));
            this.f29443a0.setStrokeWidth((float) m49398a(0.5f));
        }
        super.setBackground(new C10733b());
    }

    public void setItems(List<String> list) {
        if (this.f29432N == null) {
            this.f29432N = new ArrayList();
        }
        this.f29432N.clear();
        this.f29432N.addAll(list);
        for (int i = 0; i < this.f29433O; i++) {
            String str = "";
            this.f29432N.add(0, str);
            this.f29432N.add(str);
        }
        m49404b();
    }

    public void setOffset(int i) {
        this.f29433O = i;
    }

    public void setOnWheelViewListener(C10735d dVar) {
        this.f29446c0 = dVar;
    }

    public void setSeletion(int i) {
        this.f29435Q = this.f29433O + i;
        post(new C10734c(i));
    }

    /* renamed from: a */
    private void m49402a(Context context) {
        this.f29442a = context;
        StringBuilder sb = new StringBuilder();
        sb.append(f29428d0);
        sb.append("parent: ");
        sb.append(getParent());
        C5880q.m25750a(sb.toString());
        setVerticalScrollBarEnabled(false);
        this.f29444b = new LinearLayout(context);
        this.f29444b.setOrientation(1);
        addView(this.f29444b);
        this.f29437S = new C10730a();
    }

    /* renamed from: b */
    private void m49404b() {
        this.f29434P = (this.f29433O * 2) + 1;
        for (String a : this.f29432N) {
            this.f29444b.addView(m49400a(a));
        }
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49402a(context);
    }

    /* renamed from: a */
    public void mo38225a() {
        this.f29436R = getScrollY();
        postDelayed(this.f29437S, (long) this.f29438T);
    }

    /* renamed from: a */
    private TextView m49400a(String str) {
        CustomeTextViewRobotoRegular customeTextViewRobotoRegular = new CustomeTextViewRobotoRegular(this.f29442a);
        customeTextViewRobotoRegular.setLayoutParams(new LayoutParams(-1, -2));
        customeTextViewRobotoRegular.setSingleLine(true);
        customeTextViewRobotoRegular.setTextSize(2, 18.0f);
        customeTextViewRobotoRegular.setText(str);
        customeTextViewRobotoRegular.setGravity(17);
        int a = m49398a(10.0f);
        customeTextViewRobotoRegular.setPadding(a, a, a, a);
        if (this.f29439U == 0) {
            this.f29439U = m49399a((View) customeTextViewRobotoRegular);
            StringBuilder sb = new StringBuilder();
            sb.append(f29428d0);
            sb.append("itemHeight: ");
            sb.append(this.f29439U);
            C5880q.m25750a(sb.toString());
            this.f29444b.setLayoutParams(new LayoutParams(-1, this.f29439U * this.f29434P));
            setLayoutParams(new LinearLayout.LayoutParams(((LinearLayout.LayoutParams) getLayoutParams()).width, this.f29439U * this.f29434P));
        }
        return customeTextViewRobotoRegular;
    }

    public WheelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m49402a(context);
    }

    /* renamed from: a */
    private void m49401a(int i) {
        int i2 = this.f29439U;
        int i3 = i / i2;
        int i4 = this.f29433O;
        int i5 = i3 + i4;
        int i6 = i % i2;
        int i7 = i / i2;
        if (i6 == 0) {
            i5 = i7 + i4;
        } else if (i6 > i2 / 2) {
            i5 = i7 + i4 + 1;
        }
        int childCount = this.f29444b.getChildCount();
        int i8 = 0;
        while (i8 < childCount) {
            TextView textView = (TextView) this.f29444b.getChildAt(i8);
            if (textView != null) {
                if (i5 == i8) {
                    textView.setTextColor(Color.parseColor("#5B6769"));
                } else {
                    textView.setTextColor(Color.parseColor("#CC788d90"));
                }
                i8++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private int m49398a(float f) {
        return (int) ((f * this.f29442a.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: a */
    private int m49399a(View view) {
        view.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
        return view.getMeasuredHeight();
    }
}
