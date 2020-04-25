package com.mrsool.customeview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnTouchListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0198k;
import androidx.annotation.C0213q;
import androidx.core.content.C0841b;
import com.mrsool.C10232R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.p217i1.C14662d0;

public class Pinview extends LinearLayout implements TextWatcher, OnFocusChangeListener, OnKeyListener {
    /* access modifiers changed from: private */

    /* renamed from: N */
    public List<EditText> f29315N;

    /* renamed from: O */
    private List<FrameLayout> f29316O;

    /* renamed from: P */
    private List<ImageView> f29317P;

    /* renamed from: Q */
    private int f29318Q;

    /* renamed from: R */
    private int f29319R;

    /* renamed from: S */
    private int f29320S;

    /* renamed from: T */
    private int f29321T;

    /* renamed from: U */
    private boolean f29322U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public boolean f29323V;
    @C0213q

    /* renamed from: W */
    private int f29324W;

    /* renamed from: a */
    private final float f29325a;

    /* renamed from: a0 */
    private boolean f29326a0;

    /* renamed from: b */
    private int f29327b;

    /* renamed from: b0 */
    private String f29328b0;

    /* renamed from: c0 */
    private C10705f f29329c0;

    /* renamed from: d0 */
    private boolean f29330d0;

    /* renamed from: e0 */
    private C10708h f29331e0;

    /* renamed from: f0 */
    private boolean f29332f0;

    /* renamed from: g0 */
    private boolean f29333g0;

    /* renamed from: h0 */
    private Typeface f29334h0;

    /* renamed from: i0 */
    OnClickListener f29335i0;

    /* renamed from: j0 */
    View f29336j0;

    /* renamed from: k0 */
    InputFilter[] f29337k0;

    /* renamed from: l0 */
    LayoutParams f29338l0;

    /* renamed from: com.mrsool.customeview.Pinview$a */
    class C10700a implements OnClickListener {
        C10700a() {
        }

        public void onClick(View view) {
            boolean z;
            Iterator it = Pinview.this.f29315N.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                EditText editText = (EditText) it.next();
                if (editText.length() == 0) {
                    editText.requestFocus();
                    Pinview.this.m49312f();
                    z = true;
                    break;
                }
            }
            if (!z && Pinview.this.f29315N.size() > 0) {
                ((EditText) Pinview.this.f29315N.get(Pinview.this.f29315N.size() - 1)).requestFocus();
            }
            Pinview pinview = Pinview.this;
            OnClickListener onClickListener = pinview.f29335i0;
            if (onClickListener != null) {
                onClickListener.onClick(pinview);
            }
            Pinview.this.m49311e();
        }
    }

    /* renamed from: com.mrsool.customeview.Pinview$b */
    class C10701b implements Runnable {
        C10701b() {
        }

        public void run() {
            Pinview.this.m49312f();
        }
    }

    /* renamed from: com.mrsool.customeview.Pinview$c */
    class C10702c implements OnTouchListener {
        C10702c() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            Pinview.this.f29323V = false;
            Pinview.this.m49311e();
            return false;
        }
    }

    /* renamed from: com.mrsool.customeview.Pinview$d */
    class C10703d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f29342a;

        C10703d(int i) {
            this.f29342a = i;
        }

        public void run() {
            EditText editText = (EditText) Pinview.this.f29315N.get(this.f29342a + 1);
            editText.setEnabled(true);
            editText.requestFocus();
        }
    }

    /* renamed from: com.mrsool.customeview.Pinview$e */
    static /* synthetic */ class C10704e {

        /* renamed from: a */
        static final /* synthetic */ int[] f29344a = new int[C10705f.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.mrsool.customeview.Pinview$f[] r0 = com.mrsool.customeview.Pinview.C10705f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29344a = r0
                int[] r0 = f29344a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.mrsool.customeview.Pinview$f r1 = com.mrsool.customeview.Pinview.C10705f.NUMBER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f29344a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.mrsool.customeview.Pinview$f r1 = com.mrsool.customeview.Pinview.C10705f.TEXT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrsool.customeview.Pinview.C10704e.<clinit>():void");
        }
    }

    /* renamed from: com.mrsool.customeview.Pinview$f */
    public enum C10705f {
        TEXT,
        NUMBER
    }

    /* renamed from: com.mrsool.customeview.Pinview$g */
    private class C10706g implements TransformationMethod {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public char f29345a;

        /* renamed from: com.mrsool.customeview.Pinview$g$a */
        private class C10707a implements CharSequence {

            /* renamed from: a */
            private final CharSequence f29347a;

            public C10707a(@C0193h0 CharSequence charSequence) {
                this.f29347a = charSequence;
            }

            public char charAt(int i) {
                return C10706g.this.f29345a;
            }

            public int length() {
                return this.f29347a.length();
            }

            public CharSequence subSequence(int i, int i2) {
                return new C10707a(this.f29347a.subSequence(i, i2));
            }
        }

        private C10706g() {
            this.f29345a = C14662d0.f42839D;
        }

        public CharSequence getTransformation(CharSequence charSequence, View view) {
            return new C10707a(charSequence);
        }

        public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        }

        /* synthetic */ C10706g(Pinview pinview, C10700a aVar) {
            this();
        }
    }

    /* renamed from: com.mrsool.customeview.Pinview$h */
    public interface C10708h {
        /* renamed from: a */
        void mo36599a(Pinview pinview, boolean z);
    }

    public Pinview(Context context) {
        this(context, null);
    }

    /* renamed from: d */
    private void m49310d() {
        removeAllViews();
        this.f29315N.clear();
        this.f29317P.clear();
        this.f29316O.clear();
        for (int i = 0; i < this.f29327b; i++) {
            new EditText(getContext());
            new ImageView(getContext());
            new FrameLayout(getContext());
            View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C10232R.layout.layout_edit, null);
            EditText editText = (EditText) inflate.findViewById(C10232R.C10236id.edPin);
            ImageView imageView = (ImageView) inflate.findViewById(C10232R.C10236id.bgPin);
            FrameLayout frameLayout = (FrameLayout) inflate.findViewById(C10232R.C10236id.flMain);
            editText.setId(i);
            editText.setTextSize((float) this.f29319R);
            editText.setIncludeFontPadding(false);
            editText.setMaxLines(1);
            this.f29315N.add(i, editText);
            this.f29317P.add(i, imageView);
            this.f29316O.add(i, frameLayout);
            addView(frameLayout);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(i);
            m49305a(editText, imageView, frameLayout, sb.toString());
        }
        m49313g();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m49311e() {
        for (int i = 0; i < this.f29315N.size(); i++) {
            if (!TextUtils.isEmpty(((EditText) this.f29315N.get(i)).getText())) {
                ((ImageView) this.f29317P.get(i)).setVisibility(8);
            } else {
                ((ImageView) this.f29317P.get(i)).setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m49312f() {
        if (this.f29333g0) {
            ((InputMethodManager) getContext().getSystemService("input_method")).toggleSoftInput(2, 1);
        }
    }

    /* renamed from: g */
    private void m49313g() {
        if (this.f29326a0) {
            for (EditText editText : this.f29315N) {
                editText.removeTextChangedListener(this);
                editText.setTransformationMethod(new C10706g(this, null));
                editText.addTextChangedListener(this);
            }
            return;
        }
        for (EditText editText2 : this.f29315N) {
            editText2.removeTextChangedListener(this);
            editText2.setTransformationMethod(null);
            editText2.addTextChangedListener(this);
        }
    }

    private int getIndexOfCurrentFocus() {
        return this.f29315N.indexOf(this.f29336j0);
    }

    private int getKeyboardInputType() {
        return C10704e.f29344a[this.f29329c0.ordinal()] != 1 ? 1 : 18;
    }

    /* renamed from: h */
    private void m49314h() {
        int max = Math.max(0, getIndexOfCurrentFocus());
        int i = 0;
        while (i < this.f29315N.size()) {
            ((EditText) this.f29315N.get(i)).setEnabled(i <= max);
            i++;
        }
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public String getHint() {
        return this.f29328b0;
    }

    public C10705f getInputType() {
        return this.f29329c0;
    }

    @C0213q
    public int getPinBackground() {
        return this.f29324W;
    }

    public int getPinHeight() {
        return this.f29320S;
    }

    public int getPinLength() {
        return this.f29327b;
    }

    public int getPinWidth() {
        return this.f29318Q;
    }

    public int getSplitWidth() {
        return this.f29321T;
    }

    public String getValue() {
        StringBuilder sb = new StringBuilder();
        for (EditText text : this.f29315N) {
            sb.append(text.getText().toString());
        }
        return sb.toString();
    }

    public void onFocusChange(View view, boolean z) {
        if (!z || this.f29322U) {
            if (!z || !this.f29322U) {
                view.clearFocus();
            } else {
                this.f29336j0 = view;
            }
        } else if (this.f29323V) {
            this.f29336j0 = view;
            this.f29323V = false;
            return;
        } else {
            for (EditText editText : this.f29315N) {
                if (editText.length() == 0) {
                    if (editText != view) {
                        editText.requestFocus();
                    } else {
                        this.f29336j0 = view;
                    }
                    return;
                }
            }
            List<EditText> list = this.f29315N;
            if (list.get(list.size() - 1) != view) {
                List<EditText> list2 = this.f29315N;
                ((EditText) list2.get(list2.size() - 1)).requestFocus();
            } else {
                this.f29336j0 = view;
            }
        }
        m49311e();
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 67) {
            int indexOfCurrentFocus = getIndexOfCurrentFocus();
            String str = "";
            if ((this.f29329c0 == C10705f.NUMBER && indexOfCurrentFocus == this.f29327b - 1 && this.f29330d0) || (this.f29326a0 && indexOfCurrentFocus == this.f29327b - 1 && this.f29330d0)) {
                if (((EditText) this.f29315N.get(indexOfCurrentFocus)).length() > 0) {
                    ((EditText) this.f29315N.get(indexOfCurrentFocus)).setText(str);
                }
                this.f29330d0 = false;
            } else if (indexOfCurrentFocus > 0) {
                this.f29323V = true;
                if (((EditText) this.f29315N.get(indexOfCurrentFocus)).length() == 0) {
                    ((EditText) this.f29315N.get(indexOfCurrentFocus - 1)).requestFocus();
                    ((EditText) this.f29315N.get(indexOfCurrentFocus)).setText(str);
                } else {
                    ((EditText) this.f29315N.get(indexOfCurrentFocus)).setText(str);
                }
            } else if (indexOfCurrentFocus == -1) {
                return false;
            } else {
                if (((EditText) this.f29315N.get(indexOfCurrentFocus)).getText().length() > 0) {
                    ((EditText) this.f29315N.get(indexOfCurrentFocus)).setText(str);
                }
            }
            return true;
        } else if (keyEvent.getAction() != 0 || i != 66 || view.getId() != this.f29327b - 1 || TextUtils.isEmpty(((EditText) view).getText().toString())) {
            return false;
        } else {
            this.f29331e0.mo36599a(this, true);
            return true;
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence.length() == 1 && this.f29336j0 != null) {
            int indexOfCurrentFocus = getIndexOfCurrentFocus();
            if (indexOfCurrentFocus != -1) {
                if (indexOfCurrentFocus < this.f29327b - 1) {
                    long j = 1;
                    if (this.f29326a0) {
                        j = 25;
                    }
                    postDelayed(new C10703d(indexOfCurrentFocus), j);
                }
                if ((indexOfCurrentFocus == this.f29327b - 1 && this.f29329c0 == C10705f.NUMBER) || (indexOfCurrentFocus == this.f29327b - 1 && this.f29326a0)) {
                    this.f29330d0 = true;
                }
            } else {
                return;
            }
        } else if (charSequence.length() == 0) {
            int indexOfCurrentFocus2 = getIndexOfCurrentFocus();
            if (indexOfCurrentFocus2 != -1) {
                this.f29323V = true;
                if (((EditText) this.f29315N.get(indexOfCurrentFocus2)).getText().length() > 0) {
                    ((EditText) this.f29315N.get(indexOfCurrentFocus2)).setText("");
                }
            } else {
                return;
            }
        }
        int i4 = 0;
        while (i4 < this.f29327b && ((EditText) this.f29315N.get(i4)).getText().length() >= 1) {
            if (!this.f29332f0 && i4 + 1 == this.f29327b) {
                C10708h hVar = this.f29331e0;
                if (hVar != null) {
                    hVar.mo36599a(this, true);
                }
            }
            i4++;
        }
        m49314h();
        m49311e();
    }

    public void setCursorColor(@C0198k int i) {
        List<EditText> list = this.f29315N;
        if (list != null && !list.isEmpty()) {
            for (EditText a : this.f29315N) {
                m49304a(a, i);
            }
        }
    }

    public void setCursorShape(@C0213q int i) {
        List<EditText> list = this.f29315N;
        if (list != null && !list.isEmpty()) {
            for (EditText editText : this.f29315N) {
                try {
                    Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                    declaredField.setAccessible(true);
                    declaredField.set(editText, Integer.valueOf(i));
                } catch (Exception unused) {
                }
            }
        }
    }

    public void setHint(String str) {
        this.f29328b0 = str;
        for (EditText hint : this.f29315N) {
            hint.setHint(str);
        }
    }

    public void setInputType(C10705f fVar) {
        this.f29329c0 = fVar;
        int keyboardInputType = getKeyboardInputType();
        for (EditText inputType : this.f29315N) {
            inputType.setInputType(keyboardInputType);
        }
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f29335i0 = onClickListener;
    }

    public void setPassword(boolean z) {
        this.f29326a0 = z;
        m49313g();
    }

    public void setPinBackgroundRes(@C0213q int i) {
        this.f29324W = i;
        for (EditText backgroundResource : this.f29315N) {
            backgroundResource.setBackgroundResource(i);
        }
    }

    public void setPinHeight(int i) {
        this.f29320S = i;
        this.f29338l0.height = i;
        for (EditText layoutParams : this.f29315N) {
            layoutParams.setLayoutParams(this.f29338l0);
        }
    }

    public void setPinLength(int i) {
        this.f29327b = i;
        m49310d();
    }

    public void setPinViewEventListener(C10708h hVar) {
        this.f29331e0 = hVar;
    }

    public void setPinWidth(int i) {
        this.f29318Q = i;
        this.f29338l0.width = i;
        for (EditText layoutParams : this.f29315N) {
            layoutParams.setLayoutParams(this.f29338l0);
        }
    }

    public void setSplitWidth(int i) {
        this.f29321T = i;
        int i2 = i / 2;
        this.f29338l0.setMargins(i2, i2, i2, i2);
        for (EditText layoutParams : this.f29315N) {
            layoutParams.setLayoutParams(this.f29338l0);
        }
    }

    public void setTextColor(@C0198k int i) {
        List<EditText> list = this.f29315N;
        if (list != null && !list.isEmpty()) {
            for (EditText textColor : this.f29315N) {
                textColor.setTextColor(i);
            }
        }
    }

    public void setTextSize(int i) {
        this.f29319R = i;
        List<EditText> list = this.f29315N;
        if (list != null && !list.isEmpty()) {
            for (EditText textSize : this.f29315N) {
                textSize.setTextSize((float) this.f29319R);
            }
        }
    }

    public void setValue(@C0193h0 String str) {
        this.f29332f0 = true;
        if (this.f29329c0 != C10705f.NUMBER || str.matches("[0-9]*")) {
            int i = -1;
            for (int i2 = 0; i2 < this.f29315N.size(); i2++) {
                if (str.length() > i2) {
                    ((EditText) this.f29315N.get(i2)).setText(Character.valueOf(str.charAt(i2)).toString());
                    i = i2;
                } else {
                    ((EditText) this.f29315N.get(i2)).setText("");
                }
            }
            int i3 = this.f29327b;
            if (i3 > 0) {
                if (i < i3 - 1) {
                    this.f29336j0 = (View) this.f29315N.get(i + 1);
                } else {
                    this.f29336j0 = (View) this.f29315N.get(i3 - 1);
                    if (this.f29329c0 == C10705f.NUMBER || this.f29326a0) {
                        this.f29330d0 = true;
                    }
                    C10708h hVar = this.f29331e0;
                    if (hVar != null) {
                        hVar.mo36599a(this, false);
                    }
                }
                this.f29336j0.requestFocus();
                m49311e();
            }
            this.f29332f0 = false;
            m49314h();
        }
    }

    public Pinview(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private void m49307b(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10232R.styleable.Pinview, i, 0);
            this.f29324W = obtainStyledAttributes.getResourceId(5, this.f29324W);
            this.f29327b = obtainStyledAttributes.getInt(7, this.f29327b);
            this.f29320S = (int) obtainStyledAttributes.getDimension(6, (float) this.f29320S);
            this.f29318Q = (int) obtainStyledAttributes.getDimension(8, (float) this.f29318Q);
            this.f29321T = (int) obtainStyledAttributes.getDimension(9, (float) this.f29321T);
            this.f29319R = (int) obtainStyledAttributes.getDimension(10, (float) this.f29319R);
            this.f29322U = obtainStyledAttributes.getBoolean(0, this.f29322U);
            this.f29326a0 = obtainStyledAttributes.getBoolean(4, this.f29326a0);
            this.f29333g0 = obtainStyledAttributes.getBoolean(1, this.f29333g0);
            this.f29328b0 = obtainStyledAttributes.getString(2);
            this.f29329c0 = C10705f.values()[obtainStyledAttributes.getInt(3, 0)];
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: c */
    public View mo38111c() {
        int max = Math.max(0, getIndexOfCurrentFocus());
        if (max != -1) {
            EditText editText = (EditText) this.f29315N.get(max);
            if (editText != null) {
                editText.requestFocus();
            }
            m49312f();
        }
        return null;
    }

    public Pinview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29325a = getContext().getResources().getDisplayMetrics().density;
        this.f29327b = 4;
        this.f29315N = new ArrayList();
        this.f29316O = new ArrayList();
        this.f29317P = new ArrayList();
        this.f29318Q = 50;
        this.f29319R = 12;
        this.f29320S = 50;
        this.f29321T = 20;
        this.f29322U = false;
        this.f29323V = false;
        this.f29324W = C10232R.C10235drawable.sample_background;
        this.f29326a0 = false;
        this.f29328b0 = "";
        this.f29329c0 = C10705f.NUMBER;
        this.f29330d0 = false;
        this.f29332f0 = false;
        this.f29333g0 = true;
        this.f29336j0 = null;
        this.f29337k0 = new InputFilter[1];
        setGravity(17);
        m49303a(context, attributeSet, i);
    }

    /* renamed from: a */
    private void m49303a(Context context, AttributeSet attributeSet, int i) {
        removeAllViews();
        float f = (float) this.f29320S;
        float f2 = this.f29325a;
        this.f29320S = (int) (f * f2);
        this.f29318Q = (int) (((float) this.f29318Q) * f2);
        this.f29321T = (int) (((float) this.f29321T) * f2);
        setWillNotDraw(false);
        m49307b(context, attributeSet, i);
        this.f29334h0 = Typeface.createFromAsset(context.getAssets(), "MuseoSans.otf");
        this.f29338l0 = new LayoutParams(this.f29318Q, this.f29320S);
        setOrientation(0);
        m49310d();
        super.setOnClickListener(new C10700a());
        View view = (View) this.f29315N.get(0);
        if (view != null) {
            view.postDelayed(new C10701b(), 200);
        }
        m49314h();
    }

    /* renamed from: b */
    public boolean mo38109b() {
        return this.f29326a0;
    }

    /* renamed from: a */
    private void m49305a(EditText editText, ImageView imageView, FrameLayout frameLayout, String str) {
        LayoutParams layoutParams = this.f29338l0;
        int i = this.f29321T;
        layoutParams.setMargins(i / 2, i / 2, i / 2, i / 2);
        this.f29337k0[0] = new LengthFilter(1);
        editText.setFilters(this.f29337k0);
        editText.setGravity(17);
        editText.setPadding(0, 0, 0, 0);
        editText.setCursorVisible(this.f29322U);
        Typeface typeface = this.f29334h0;
        if (typeface != null) {
            editText.setTypeface(typeface);
        }
        this.f29338l0.gravity = 17;
        if (!this.f29322U) {
            editText.setClickable(false);
            editText.setHint(this.f29328b0);
            editText.setOnTouchListener(new C10702c());
        }
        editText.setBackgroundResource(0);
        editText.setTag(str);
        editText.setInputType(getKeyboardInputType());
        editText.addTextChangedListener(this);
        editText.setOnFocusChangeListener(this);
        editText.setOnKeyListener(this);
    }

    /* renamed from: a */
    public void mo38106a() {
        setValue("");
    }

    /* renamed from: a */
    public void mo38107a(boolean z) {
        this.f29322U = z;
        List<EditText> list = this.f29315N;
        if (list != null && !list.isEmpty()) {
            for (EditText cursorVisible : this.f29315N) {
                cursorVisible.setCursorVisible(z);
            }
        }
    }

    /* renamed from: a */
    private void m49304a(EditText editText, @C0198k int i) {
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Drawable c = C0841b.m4928c(editText.getContext(), i2);
            if (c != null) {
                c.setColorFilter(i, Mode.SRC_IN);
            }
            Drawable[] drawableArr = {c, c};
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            declaredField3.set(obj, drawableArr);
        } catch (Exception unused) {
        }
    }
}
