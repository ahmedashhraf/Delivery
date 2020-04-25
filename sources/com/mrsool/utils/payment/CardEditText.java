package com.mrsool.utils.payment;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0518j;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.mrsool.C10232R;
import com.mrsool.chat.C10526n.C10527a;
import java.util.regex.Pattern;

public class CardEditText extends C0518j {

    /* renamed from: O */
    private final String f33501O = C3868i.f12248b;

    /* renamed from: P */
    private final String f33502P = "[0-9\\ ]*";

    /* renamed from: Q */
    String f33503Q = "UNKNOWN";

    /* renamed from: R */
    private int f33504R = C10232R.C10235drawable.card_unknown_gray;

    /* renamed from: S */
    private C11659c f33505S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public boolean f33506T = false;

    /* renamed from: com.mrsool.utils.payment.CardEditText$a */
    class C11657a implements TextWatcher {
        C11657a() {
        }

        public void afterTextChanged(Editable editable) {
            if (!CardEditText.this.f33506T) {
                if (editable.length() > 0 && editable.length() % 5 == 0 && Character.isWhitespace(editable.charAt(editable.length() - 1))) {
                    editable.delete(editable.length() - 1, editable.length());
                }
                if (editable.length() > 0 && editable.length() % 5 == 0 && Character.isDigit(editable.charAt(editable.length() - 1))) {
                    String obj = editable.toString();
                    String str = C3868i.f12248b;
                    if (TextUtils.split(obj, str).length <= 3) {
                        editable.insert(editable.length() - 1, str);
                    }
                }
                CardEditText.this.m52533c();
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.mrsool.utils.payment.CardEditText$b */
    class C11658b implements InputFilter {
        C11658b() {
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            while (i < i2) {
                if (!Pattern.compile("[0-9\\ ]*").matcher(String.valueOf(charSequence)).matches()) {
                    return "";
                }
                i++;
            }
            return null;
        }
    }

    /* renamed from: com.mrsool.utils.payment.CardEditText$c */
    public interface C11659c {
        /* renamed from: a */
        void mo38875a(int i);
    }

    public CardEditText(Context context) {
        super(context);
        m52530b();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m52533c() {
        String trim = getText().toString().replace(C3868i.f12248b, "").trim();
        if (trim.startsWith("4") || trim.matches(C11660a.f33509a)) {
            this.f33504R = C10232R.C10235drawable.card_visa;
            this.f33503Q = "Visa";
        } else if (trim.matches(C11660a.f33511c)) {
            this.f33504R = C10232R.C10235drawable.card_master;
            this.f33503Q = "MasterCard";
            m52532b(trim);
        } else if (trim.matches(C11660a.f33512d)) {
            this.f33504R = C10232R.C10235drawable.card_ae;
            this.f33503Q = "American_Express";
        } else if (trim.matches(C11660a.f33515g) || trim.matches(C11660a.f33514f)) {
            this.f33504R = C10232R.C10235drawable.card_unknown_gray;
            this.f33503Q = "Discover";
        } else if (trim.matches(C11660a.f33518j) || trim.matches(C11660a.f33517i)) {
            this.f33504R = C10232R.C10235drawable.card_unknown_gray;
            this.f33503Q = "JCB";
        } else if (trim.matches(C11660a.f33521m) || trim.matches("^3(?:0[0-5]|[68][0-9])[0-9]{11}$")) {
            this.f33504R = C10232R.C10235drawable.card_unknown_gray;
            this.f33503Q = "Diners_Club";
        } else {
            this.f33504R = C10232R.C10235drawable.card_unknown_gray;
            this.f33503Q = "UNKNOWN";
            m52532b(trim);
        }
        C11659c cVar = this.f33505S;
        if (cVar != null) {
            cVar.mo38875a(this.f33504R);
        }
    }

    public C11659c getCardEvent() {
        return this.f33505S;
    }

    public String getCardNumber() {
        return getText().toString().replace(C3868i.f12248b, "").trim();
    }

    public String getCardType() {
        return this.f33503Q;
    }

    public void setCardEvent(C11659c cVar) {
        this.f33505S = cVar;
    }

    /* renamed from: b */
    private void m52530b() {
        setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Roboto-Medium.ttf"));
        setImeOptions(5);
        setMaxLines(1);
        m52533c();
        addTextChangedListener(new C11657a());
        setFilters(new InputFilter[]{new C11658b(), new LengthFilter(19)});
    }

    /* renamed from: a */
    public void mo40011a(String str) {
        String str2 = "Visa";
        if (str.equalsIgnoreCase(C10527a.f28544e)) {
            this.f33504R = C10232R.C10235drawable.card_visa;
            this.f33503Q = str2;
        } else if (str.equalsIgnoreCase("master") || str.equalsIgnoreCase("master_card") || str.equalsIgnoreCase("master card")) {
            this.f33504R = C10232R.C10235drawable.card_master;
            this.f33503Q = str2;
        } else {
            String str3 = "mada";
            if (str.equalsIgnoreCase(str3)) {
                this.f33504R = C10232R.C10235drawable.card_type_mada;
                this.f33503Q = str3;
            } else {
                this.f33503Q = "UNKNOWN";
            }
        }
        C11659c cVar = this.f33505S;
        if (cVar != null) {
            cVar.mo38875a(this.f33504R);
        }
    }

    public CardEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m52530b();
    }

    /* renamed from: b */
    private void m52532b(String str) {
        if (str.length() > 6) {
            String substring = str.substring(0, 6);
            for (String equalsIgnoreCase : C11660a.f33523o) {
                if (equalsIgnoreCase.equalsIgnoreCase(substring)) {
                    this.f33504R = C10232R.C10235drawable.card_type_mada;
                    this.f33503Q = "mada";
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo40012a(String str, String str2) {
        this.f33506T = true;
        setFilters(new InputFilter[0]);
        setInputType(1);
        setText(String.format("**** **** **** %s", new Object[]{str2}));
        mo40011a(str);
    }

    public CardEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m52530b();
    }

    /* renamed from: a */
    public boolean mo40013a() {
        if (!getCardNumber().matches(C11660a.f33510b) && !getCardNumber().matches(C11660a.f33511c) && !getCardNumber().matches(C11660a.f33513e) && !getCardNumber().matches(C11660a.f33516h) && !getCardNumber().matches("^3(?:0[0-5]|[68][0-9])[0-9]{11}$") && !getCardNumber().matches(C11660a.f33519k)) {
            return false;
        }
        return true;
    }
}
