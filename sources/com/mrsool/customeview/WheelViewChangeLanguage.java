package com.mrsool.customeview;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.mrsool.C10232R;
import java.util.ArrayList;
import java.util.List;

public class WheelViewChangeLanguage extends ScrollView {

    /* renamed from: e0 */
    public static final String f29457e0 = WheelViewChangeLanguage.class.getSimpleName();

    /* renamed from: f0 */
    public static final int f29458f0 = 1;

    /* renamed from: g0 */
    private static final int f29459g0 = 0;

    /* renamed from: h0 */
    private static final int f29460h0 = 1;

    /* renamed from: N */
    private LinearLayout f29461N;

    /* renamed from: O */
    List<String> f29462O;

    /* renamed from: P */
    int f29463P = 1;

    /* renamed from: Q */
    int f29464Q;

    /* renamed from: R */
    int f29465R = 1;

    /* renamed from: S */
    int f29466S;

    /* renamed from: T */
    Runnable f29467T;

    /* renamed from: U */
    int f29468U = 50;

    /* renamed from: V */
    int f29469V = 0;

    /* renamed from: W */
    int[] f29470W;

    /* renamed from: a */
    public C10743f f29471a;

    /* renamed from: a0 */
    private int f29472a0 = -1;

    /* renamed from: b */
    private Context f29473b;

    /* renamed from: b0 */
    Paint f29474b0;

    /* renamed from: c0 */
    int f29475c0;

    /* renamed from: d0 */
    private C10742e f29476d0;

    /* renamed from: com.mrsool.customeview.WheelViewChangeLanguage$a */
    class C10736a implements Runnable {

        /* renamed from: com.mrsool.customeview.WheelViewChangeLanguage$a$a */
        class C10737a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f29479a;

            /* renamed from: b */
            final /* synthetic */ int f29480b;

            C10737a(int i, int i2) {
                this.f29479a = i;
                this.f29480b = i2;
            }

            public void run() {
                WheelViewChangeLanguage wheelViewChangeLanguage = WheelViewChangeLanguage.this;
                wheelViewChangeLanguage.smoothScrollTo(0, (wheelViewChangeLanguage.f29466S - this.f29479a) + wheelViewChangeLanguage.f29469V);
                WheelViewChangeLanguage wheelViewChangeLanguage2 = WheelViewChangeLanguage.this;
                wheelViewChangeLanguage2.f29465R = this.f29480b + wheelViewChangeLanguage2.f29463P + 1;
                wheelViewChangeLanguage2.m49420d();
            }
        }

        /* renamed from: com.mrsool.customeview.WheelViewChangeLanguage$a$b */
        class C10738b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f29482a;

            /* renamed from: b */
            final /* synthetic */ int f29483b;

            C10738b(int i, int i2) {
                this.f29482a = i;
                this.f29483b = i2;
            }

            public void run() {
                WheelViewChangeLanguage wheelViewChangeLanguage = WheelViewChangeLanguage.this;
                wheelViewChangeLanguage.smoothScrollTo(0, wheelViewChangeLanguage.f29466S - this.f29482a);
                WheelViewChangeLanguage wheelViewChangeLanguage2 = WheelViewChangeLanguage.this;
                wheelViewChangeLanguage2.f29465R = this.f29483b + wheelViewChangeLanguage2.f29463P;
                wheelViewChangeLanguage2.m49420d();
            }
        }

        C10736a() {
        }

        public void run() {
            int scrollY = WheelViewChangeLanguage.this.getScrollY();
            WheelViewChangeLanguage wheelViewChangeLanguage = WheelViewChangeLanguage.this;
            int i = wheelViewChangeLanguage.f29466S;
            if (i - scrollY == 0) {
                int i2 = wheelViewChangeLanguage.f29469V;
                int i3 = i % i2;
                int i4 = i / i2;
                if (i3 == 0) {
                    wheelViewChangeLanguage.f29465R = i4 + wheelViewChangeLanguage.f29463P;
                    wheelViewChangeLanguage.m49420d();
                } else if (i3 > i2 / 2) {
                    wheelViewChangeLanguage.post(new C10737a(i3, i4));
                } else {
                    wheelViewChangeLanguage.post(new C10738b(i3, i4));
                }
            } else {
                wheelViewChangeLanguage.f29466S = wheelViewChangeLanguage.getScrollY();
                WheelViewChangeLanguage wheelViewChangeLanguage2 = WheelViewChangeLanguage.this;
                wheelViewChangeLanguage2.postDelayed(wheelViewChangeLanguage2.f29467T, (long) wheelViewChangeLanguage2.f29468U);
            }
        }
    }

    /* renamed from: com.mrsool.customeview.WheelViewChangeLanguage$b */
    class C10739b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f29484a;

        C10739b(String str) {
            this.f29484a = str;
        }

        public void onClick(View view) {
            WheelViewChangeLanguage.this.f29471a.mo38274a(this.f29484a);
        }
    }

    /* renamed from: com.mrsool.customeview.WheelViewChangeLanguage$c */
    class C10740c extends Drawable {
        C10740c() {
        }

        public void draw(Canvas canvas) {
            WheelViewChangeLanguage wheelViewChangeLanguage = WheelViewChangeLanguage.this;
            float f = (float) ((wheelViewChangeLanguage.f29475c0 * 1) / 6);
            float f2 = (float) wheelViewChangeLanguage.m49419c()[0];
            WheelViewChangeLanguage wheelViewChangeLanguage2 = WheelViewChangeLanguage.this;
            Canvas canvas2 = canvas;
            canvas2.drawLine(f, f2, (float) ((wheelViewChangeLanguage2.f29475c0 * 5) / 6), (float) wheelViewChangeLanguage2.m49419c()[0], WheelViewChangeLanguage.this.f29474b0);
            WheelViewChangeLanguage wheelViewChangeLanguage3 = WheelViewChangeLanguage.this;
            float f3 = (float) ((wheelViewChangeLanguage3.f29475c0 * 1) / 6);
            float f4 = (float) wheelViewChangeLanguage3.m49419c()[1];
            WheelViewChangeLanguage wheelViewChangeLanguage4 = WheelViewChangeLanguage.this;
            canvas2.drawLine(f3, f4, (float) ((wheelViewChangeLanguage4.f29475c0 * 5) / 6), (float) wheelViewChangeLanguage4.m49419c()[1], WheelViewChangeLanguage.this.f29474b0);
        }

        public int getOpacity() {
            return 0;
        }

        public void setAlpha(int i) {
        }

        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    /* renamed from: com.mrsool.customeview.WheelViewChangeLanguage$d */
    class C10741d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f29487a;

        C10741d(int i) {
            this.f29487a = i;
        }

        public void run() {
            WheelViewChangeLanguage wheelViewChangeLanguage = WheelViewChangeLanguage.this;
            wheelViewChangeLanguage.smoothScrollTo(0, this.f29487a * wheelViewChangeLanguage.f29469V);
        }
    }

    /* renamed from: com.mrsool.customeview.WheelViewChangeLanguage$e */
    public static class C10742e {
        /* renamed from: a */
        public void mo38273a(int i, String str) {
        }
    }

    /* renamed from: com.mrsool.customeview.WheelViewChangeLanguage$f */
    public interface C10743f {
        /* renamed from: a */
        void mo38274a(String str);
    }

    public WheelViewChangeLanguage(Context context) {
        super(context);
        m49414a(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public int[] m49419c() {
        if (this.f29470W == null) {
            this.f29470W = new int[2];
            int[] iArr = this.f29470W;
            int i = this.f29469V;
            int i2 = this.f29463P;
            iArr[0] = i * i2;
            iArr[1] = i * (i2 + 1);
        }
        return this.f29470W;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m49420d() {
        C10742e eVar = this.f29476d0;
        if (eVar != null) {
            int i = this.f29465R;
            eVar.mo38273a(i, (String) this.f29462O.get(i));
        }
    }

    private List<String> getItems() {
        return this.f29462O;
    }

    public void fling(int i) {
        super.fling(i / 3);
    }

    public LinearLayout getChildView() {
        return this.f29461N;
    }

    public int getOffset() {
        return this.f29463P;
    }

    public C10742e getOnWheelViewListener() {
        return this.f29476d0;
    }

    public int getSeletedIndex() {
        return this.f29465R - this.f29463P;
    }

    public String getSeletedItem() {
        return (String) this.f29462O.get(this.f29465R);
    }

    public C10743f getmOnLanguageClick() {
        return this.f29471a;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        m49413a(i2);
        if (i2 > i4) {
            this.f29472a0 = 1;
        } else {
            this.f29472a0 = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        StringBuilder sb = new StringBuilder();
        sb.append("w: ");
        sb.append(i);
        sb.append(", h: ");
        sb.append(i2);
        sb.append(", oldw: ");
        sb.append(i3);
        sb.append(", oldh: ");
        sb.append(i4);
        sb.toString();
        this.f29475c0 = i;
        setBackground(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            mo38247a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackground(Drawable drawable) {
        if (this.f29475c0 == 0) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) this.f29473b).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            this.f29475c0 = displayMetrics.widthPixels;
            StringBuilder sb = new StringBuilder();
            sb.append("viewWidth: ");
            sb.append(this.f29475c0);
            sb.toString();
        }
        if (this.f29474b0 == null) {
            this.f29474b0 = new Paint();
            this.f29474b0.setColor(Color.parseColor("#808080"));
            this.f29474b0.setStrokeWidth((float) m49410a(0.3f));
        }
        super.setBackground(new C10740c());
    }

    public void setItems(List<String> list) {
        if (this.f29462O == null) {
            this.f29462O = new ArrayList();
        }
        this.f29462O.clear();
        this.f29462O.addAll(list);
        for (int i = 0; i < this.f29463P; i++) {
            String str = "";
            this.f29462O.add(0, str);
            this.f29462O.add(str);
        }
        m49417b();
    }

    public void setOffset(int i) {
        this.f29463P = i;
    }

    public void setOnWheelViewListener(C10742e eVar) {
        this.f29476d0 = eVar;
    }

    public void setSeletion(int i) {
        this.f29465R = this.f29463P + i;
        post(new C10741d(i));
    }

    public void setmOnLanguageClick(C10743f fVar) {
        this.f29471a = fVar;
    }

    /* renamed from: a */
    private void m49414a(Context context) {
        this.f29473b = context;
        StringBuilder sb = new StringBuilder();
        sb.append("parent: ");
        sb.append(getParent());
        sb.toString();
        setVerticalScrollBarEnabled(false);
        this.f29461N = new LinearLayout(context);
        this.f29461N.setOrientation(1);
        addView(this.f29461N);
        this.f29467T = new C10736a();
    }

    /* renamed from: b */
    private void m49417b() {
        this.f29464Q = (this.f29463P * 2) + 1;
        for (String b : this.f29462O) {
            this.f29461N.addView(m49416b(b));
        }
        m49413a(0);
    }

    /* renamed from: b */
    private View m49416b(String str) {
        View inflate = ((Activity) this.f29473b).getLayoutInflater().inflate(C10232R.layout.row_choose_language, null);
        TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.tvLanguage);
        ImageView imageView = (ImageView) inflate.findViewById(C10232R.C10236id.ivTick);
        boolean isEmpty = TextUtils.isEmpty(str);
        imageView.setVisibility(4);
        ((RelativeLayout) inflate.findViewById(C10232R.C10236id.rlLanguage)).setOnClickListener(new C10739b(str));
        textView.setText(str);
        if (this.f29469V == 0) {
            this.f29469V = m49411a((View) textView);
            StringBuilder sb = new StringBuilder();
            sb.append("itemHeight: ");
            sb.append(this.f29469V);
            sb.toString();
            LayoutParams layoutParams = this.f29461N.getLayoutParams();
            int i = this.f29469V;
            int i2 = this.f29464Q;
            layoutParams.height = i * i2;
            this.f29461N.setLayoutParams(new FrameLayout.LayoutParams(-1, i * i2));
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) getLayoutParams();
            setLayoutParams(new RelativeLayout.LayoutParams(getLayoutParams().width, this.f29469V * this.f29464Q));
        }
        return inflate;
    }

    public WheelViewChangeLanguage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49414a(context);
    }

    /* renamed from: a */
    public void mo38247a() {
        this.f29466S = getScrollY();
        postDelayed(this.f29467T, (long) this.f29468U);
    }

    /* renamed from: a */
    private TextView m49412a(String str) {
        CustomeTextViewRobotoRegular customeTextViewRobotoRegular = new CustomeTextViewRobotoRegular(this.f29473b);
        customeTextViewRobotoRegular.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        customeTextViewRobotoRegular.setSingleLine(true);
        customeTextViewRobotoRegular.setTextSize(2, 18.0f);
        customeTextViewRobotoRegular.setText(str);
        customeTextViewRobotoRegular.setGravity(17);
        int a = m49410a(10.0f);
        customeTextViewRobotoRegular.setPadding(a, a, a, a);
        if (this.f29469V == 0) {
            this.f29469V = m49411a((View) customeTextViewRobotoRegular);
            StringBuilder sb = new StringBuilder();
            sb.append("itemHeight: ");
            sb.append(this.f29469V);
            sb.toString();
            this.f29461N.setLayoutParams(new FrameLayout.LayoutParams(-1, this.f29469V * this.f29464Q));
            setLayoutParams(new LinearLayout.LayoutParams(((LinearLayout.LayoutParams) getLayoutParams()).width, this.f29469V * this.f29464Q));
        }
        return customeTextViewRobotoRegular;
    }

    public WheelViewChangeLanguage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m49414a(context);
    }

    /* renamed from: a */
    private void m49413a(int i) {
        int i2 = this.f29469V;
        int i3 = i / i2;
        int i4 = this.f29463P;
        int i5 = i3 + i4;
        int i6 = i % i2;
        int i7 = i / i2;
        if (i6 == 0) {
            i5 = i7 + i4;
        } else if (i6 > i2 / 2) {
            i5 = i7 + i4 + 1;
        }
        int childCount = this.f29461N.getChildCount();
        int i8 = 0;
        while (i8 < childCount) {
            TextView textView = (TextView) this.f29461N.getChildAt(i8).findViewById(C10232R.C10236id.tvLanguage);
            if (textView != null) {
                String str = "#000000";
                if (i5 == i8) {
                    textView.setTextColor(Color.parseColor(str));
                    textView.setAlpha(1.0f);
                } else {
                    textView.setTextColor(Color.parseColor(str));
                    textView.setAlpha(0.5f);
                }
                i8++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private int m49410a(float f) {
        return (int) ((f * this.f29473b.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: a */
    private int m49411a(View view) {
        view.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
        return view.getMeasuredHeight();
    }
}
