package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import androidx.annotation.C0193h0;
import androidx.appcompat.p006a.p007a.C0242a;
import com.google.android.material.C5582R;
import com.google.android.material.textfield.TextInputLayout.C7074h;
import com.google.android.material.textfield.TextInputLayout.C7075i;

/* renamed from: com.google.android.material.textfield.h */
/* compiled from: PasswordToggleEndIconDelegate */
class C7102h extends C7098e {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TextWatcher f20161d = new C7103a();

    /* renamed from: e */
    private final C7074h f20162e = new C7104b();

    /* renamed from: f */
    private final C7075i f20163f = new C7105c();

    /* renamed from: com.google.android.material.textfield.h$a */
    /* compiled from: PasswordToggleEndIconDelegate */
    class C7103a implements TextWatcher {
        C7103a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C7102h hVar = C7102h.this;
            hVar.f20125c.setChecked(!hVar.m34231c());
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.h$b */
    /* compiled from: PasswordToggleEndIconDelegate */
    class C7104b implements C7074h {
        C7104b() {
        }

        /* renamed from: a */
        public void mo28400a(@C0193h0 TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            C7102h hVar = C7102h.this;
            hVar.f20125c.setChecked(!hVar.m34231c());
            editText.removeTextChangedListener(C7102h.this.f20161d);
            editText.addTextChangedListener(C7102h.this.f20161d);
        }
    }

    /* renamed from: com.google.android.material.textfield.h$c */
    /* compiled from: PasswordToggleEndIconDelegate */
    class C7105c implements C7075i {
        C7105c() {
        }

        /* renamed from: a */
        public void mo28401a(@C0193h0 TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.h$d */
    /* compiled from: PasswordToggleEndIconDelegate */
    class C7106d implements OnClickListener {
        C7106d() {
        }

        public void onClick(View view) {
            EditText editText = C7102h.this.f20123a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                if (C7102h.this.m34231c()) {
                    editText.setTransformationMethod(null);
                } else {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                editText.setSelection(selectionEnd);
            }
        }
    }

    C7102h(@C0193h0 TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m34231c() {
        EditText editText = this.f20123a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo28402a() {
        this.f20123a.setEndIconDrawable(C0242a.m1109c(this.f20124b, C5582R.C5585drawable.design_password_eye));
        TextInputLayout textInputLayout = this.f20123a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C5582R.string.password_toggle_content_description));
        this.f20123a.setEndIconOnClickListener(new C7106d());
        this.f20123a.mo28241a(this.f20162e);
        this.f20123a.mo28242a(this.f20163f);
    }
}
