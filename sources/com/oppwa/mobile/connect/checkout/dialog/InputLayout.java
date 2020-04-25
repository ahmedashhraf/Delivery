package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.RequiresApi;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.google.android.material.textfield.TextInputLayout;
import com.oppwa.mobile.connect.C11771R;
import com.oppwa.mobile.connect.checkout.meta.C11939a;

public class InputLayout extends LinearLayout {

    /* renamed from: N */
    private TextView f34082N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public C11791d f34083O;

    /* renamed from: P */
    private boolean f34084P;

    /* renamed from: Q */
    private boolean f34085Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public C11792e f34086R;

    /* renamed from: S */
    IPaymentFormListener f34087S;

    /* renamed from: a */
    private TextInputLayout f34088a;

    /* renamed from: b */
    private EditText f34089b;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.InputLayout$a */
    class C11788a implements OnFocusChangeListener {
        C11788a() {
        }

        public void onFocusChange(View view, boolean z) {
            InputLayout inputLayout = InputLayout.this;
            if (z) {
                inputLayout.mo40332b();
                InputLayout.this.m53005i();
            } else if (inputLayout.f34083O != null) {
                InputLayout.this.mo40337g();
            }
            if (InputLayout.this.f34086R != null) {
                InputLayout.this.f34086R.mo40361a(z);
            }
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.InputLayout$b */
    class C11789b implements TextWatcher {
        C11789b() {
        }

        public void afterTextChanged(Editable editable) {
            if (InputLayout.this.f34086R != null) {
                InputLayout.this.f34086R.mo40360a(editable);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.InputLayout$c */
    static /* synthetic */ class C11790c {

        /* renamed from: a */
        static final /* synthetic */ int[] f34092a = new int[C11939a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.oppwa.mobile.connect.checkout.meta.a[] r0 = com.oppwa.mobile.connect.checkout.meta.C11939a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f34092a = r0
                int[] r0 = f34092a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.oppwa.mobile.connect.checkout.meta.a r1 = com.oppwa.mobile.connect.checkout.meta.C11939a.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f34092a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.oppwa.mobile.connect.checkout.meta.a r1 = com.oppwa.mobile.connect.checkout.meta.C11939a.NOT_VALID     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.checkout.dialog.InputLayout.C11790c.<clinit>():void");
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.InputLayout$d */
    interface C11791d {
        /* renamed from: a */
        int mo40357a(@C0193h0 CharSequence charSequence);

        /* renamed from: a */
        C11939a mo40358a(String str, IPaymentFormListener iPaymentFormListener);

        /* renamed from: d */
        int mo40359d();
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.InputLayout$e */
    interface C11792e {
        /* renamed from: a */
        void mo40360a(Editable editable);

        /* renamed from: a */
        void mo40361a(boolean z);
    }

    public InputLayout(Context context) {
        this(context, null);
    }

    public InputLayout(Context context, @C0195i0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34084P = false;
        this.f34085Q = false;
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (layoutInflater != null) {
            layoutInflater.inflate(C11771R.layout.opp_layout_input, this, true);
            m53004h();
        }
    }

    public InputLayout(Context context, @C0195i0 AttributeSet attributeSet, int i) {
        this(context, attributeSet);
    }

    @RequiresApi(api = 21)
    public InputLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet);
    }

    /* renamed from: a */
    private int m53000a(CharSequence charSequence) {
        int i = C11790c.f34092a[this.f34083O.mo40358a(charSequence.toString(), this.f34087S).ordinal()];
        if (i != 1) {
            if (i != 2) {
                return -1;
            }
            return this.f34083O.mo40359d();
        } else if (!TextUtils.isEmpty(charSequence) || !this.f34085Q) {
            return this.f34083O.mo40357a(charSequence);
        } else {
            return -1;
        }
    }

    /* renamed from: h */
    private void m53004h() {
        this.f34088a = (TextInputLayout) findViewById(C11771R.C11775id.text_input_layout);
        this.f34088a.setErrorEnabled(true);
        this.f34089b = (EditText) findViewById(C11771R.C11775id.edit_text);
        this.f34089b.setOnFocusChangeListener(new C11788a());
        this.f34089b.addTextChangedListener(new C11789b());
        this.f34082N = (TextView) findViewById(C11771R.C11775id.helper_text_view);
        this.f34082N.setVisibility(4);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m53005i() {
        if (this.f34082N.getVisibility() == 4) {
            this.f34082N.startAnimation(AnimationUtils.loadAnimation(getContext(), C11771R.anim.opp_helper_in));
            this.f34082N.setVisibility(0);
        }
    }

    /* renamed from: j */
    private void m53006j() {
        this.f34082N.setVisibility(4);
    }

    /* renamed from: a */
    public void mo40330a() {
        this.f34089b.getText().clear();
        mo40332b();
        m53006j();
    }

    /* renamed from: a */
    public void mo40331a(String str) {
        this.f34088a.setError(C3868i.f12248b);
        m53005i();
        this.f34082N.setText(str);
        this.f34084P = true;
    }

    /* renamed from: b */
    public void mo40332b() {
        this.f34088a.setError(null);
        this.f34082N.setText("");
        this.f34084P = false;
    }

    /* renamed from: c */
    public boolean mo40333c() {
        return this.f34084P;
    }

    /* renamed from: d */
    public boolean mo40334d() {
        return TextUtils.isEmpty(this.f34089b.getText());
    }

    /* renamed from: e */
    public void mo40335e() {
        if (VERSION.SDK_INT >= 17) {
            this.f34089b.setTextDirection(3);
            this.f34089b.setEllipsize(TruncateAt.END);
            this.f34089b.setGravity(8388629);
        }
    }

    /* renamed from: f */
    public void mo40336f() {
        EditText editText = this.f34089b;
        editText.setSelection(editText.getText().length());
    }

    /* renamed from: g */
    public boolean mo40337g() {
        boolean z = false;
        if (this.f34083O == null) {
            return false;
        }
        int a = m53000a((CharSequence) this.f34089b.getText());
        if (a == -1) {
            mo40332b();
            m53006j();
        } else {
            mo40331a(getContext().getString(a));
        }
        if (a == -1) {
            z = true;
        }
        return z;
    }

    public EditText getEditText() {
        return this.f34089b;
    }

    public String getErrorText() {
        return this.f34082N.getText().toString();
    }

    /* access modifiers changed from: 0000 */
    public String getHelperText() {
        return this.f34082N.getHint() != null ? this.f34082N.getHint().toString() : "";
    }

    public int getPaddingStart() {
        return this.f34089b.getPaddingStart();
    }

    public String getText() {
        return this.f34089b.getText().toString();
    }

    public void setHelperText(String str) {
        this.f34082N.setHint(str);
    }

    public void setHint(String str) {
        this.f34088a.setHint(str);
    }

    public void setInputValidator(C11791d dVar) {
        this.f34083O = dVar;
    }

    public void setListener(C11792e eVar) {
        this.f34086R = eVar;
    }

    public void setNotEditableText(String str) {
        this.f34089b.setText(str);
        this.f34089b.setFocusable(false);
        this.f34089b.setBackgroundResource(0);
        m53006j();
    }

    public void setOptional(boolean z) {
        this.f34085Q = z;
    }

    public void setPaddingEnd(int i) {
        EditText editText = this.f34089b;
        editText.setPaddingRelative(editText.getPaddingStart(), this.f34089b.getPaddingTop(), i, this.f34089b.getPaddingBottom());
    }

    public void setPaddingStart(int i) {
        EditText editText = this.f34089b;
        editText.setPaddingRelative(i, editText.getPaddingTop(), this.f34089b.getPaddingEnd(), this.f34089b.getPaddingBottom());
    }

    public void setPaymentFormListener(IPaymentFormListener iPaymentFormListener) {
        this.f34087S = iPaymentFormListener;
    }

    public void setText(String str) {
        this.f34089b.setText(str);
    }
}
