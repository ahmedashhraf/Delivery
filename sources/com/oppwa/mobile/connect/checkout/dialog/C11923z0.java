package com.oppwa.mobile.connect.checkout.dialog;

import android.text.TextUtils;
import androidx.annotation.C0193h0;
import com.oppwa.mobile.connect.C11771R;
import com.oppwa.mobile.connect.checkout.meta.C11939a;
import com.oppwa.mobile.connect.p427b.C11779b;
import com.oppwa.mobile.connect.payment.card.CardPaymentParams;
import com.oppwa.mobile.connect.payment.ikanooi.IkanoOiPaymentParams;
import java.util.regex.Pattern;
import p205i.p489f.C14069f;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.z0 */
class C11923z0 {

    /* renamed from: a */
    private static Pattern f34399a;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.z0$a */
    static class C11924a implements C11791d {
        C11924a() {
        }

        /* renamed from: a */
        public int mo40357a(@C0193h0 CharSequence charSequence) {
            if (!CardPaymentParams.m53961m(charSequence.toString())) {
                return C11771R.string.checkout_error_card_holder_invalid;
            }
            return -1;
        }

        /* renamed from: a */
        public C11939a mo40358a(String str, IPaymentFormListener iPaymentFormListener) {
            return iPaymentFormListener != null ? iPaymentFormListener.mo40329b(str) : C11939a.DEFAULT;
        }

        /* renamed from: d */
        public int mo40359d() {
            return C11771R.string.checkout_error_card_holder_invalid;
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.z0$b */
    static class C11925b implements C11791d {

        /* renamed from: a */
        final /* synthetic */ C11836f1 f34400a;

        /* renamed from: b */
        final /* synthetic */ Pattern f34401b;

        /* renamed from: c */
        final /* synthetic */ boolean f34402c;

        C11925b(C11836f1 f1Var, Pattern pattern, boolean z) {
            this.f34400a = f1Var;
            this.f34401b = pattern;
            this.f34402c = z;
        }

        /* renamed from: a */
        public int mo40357a(@C0193h0 CharSequence charSequence) {
            StringBuilder sb = new StringBuilder(charSequence);
            C11779b.m52949a(sb, this.f34400a.mo40459a());
            C11779b.m52948a(sb);
            String sb2 = sb.toString();
            Pattern pattern = this.f34401b;
            int i = (pattern == null || !pattern.matcher(sb2).find() || !CardPaymentParams.m53963o(sb2) || (this.f34402c && !CardPaymentParams.m53956h(sb2))) ? C11771R.string.checkout_error_card_number_invalid : -1;
            C11779b.m52954b(sb);
            return i;
        }

        /* renamed from: a */
        public C11939a mo40358a(String str, IPaymentFormListener iPaymentFormListener) {
            return C11939a.DEFAULT;
        }

        /* renamed from: d */
        public int mo40359d() {
            return C11771R.string.checkout_error_card_number_invalid;
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.z0$c */
    static class C11926c implements C11791d {

        /* renamed from: a */
        final /* synthetic */ C11911v0 f34403a;

        C11926c(C11911v0 v0Var) {
            this.f34403a = v0Var;
        }

        /* renamed from: a */
        public int mo40357a(@C0193h0 CharSequence charSequence) {
            String a = C11779b.m52947a(charSequence.toString());
            if (a == null || !C11923z0.m53618f().matcher(a).matches()) {
                return C11771R.string.checkout_error_expiration_date_invalid;
            }
            String a2 = C11779b.m52947a(this.f34403a.mo40595a());
            String a3 = C11779b.m52947a(this.f34403a.mo40596b());
            if (!CardPaymentParams.m53959k(a2) || !CardPaymentParams.m53960l(a3)) {
                return C11771R.string.checkout_error_expiration_date_invalid;
            }
            if (CardPaymentParams.m53953c(a2, a3)) {
                return C11771R.string.checkout_error_expiration_date;
            }
            return -1;
        }

        /* renamed from: a */
        public C11939a mo40358a(String str, IPaymentFormListener iPaymentFormListener) {
            return C11939a.DEFAULT;
        }

        /* renamed from: d */
        public int mo40359d() {
            return C11771R.string.checkout_error_expiration_date_invalid;
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.z0$d */
    static class C11927d implements C11791d {

        /* renamed from: a */
        final /* synthetic */ int f34404a;

        C11927d(int i) {
            this.f34404a = i;
        }

        /* renamed from: a */
        public int mo40357a(@C0193h0 CharSequence charSequence) {
            int length = charSequence.length();
            int i = this.f34404a;
            if (length != i) {
                return i == 4 ? C11771R.string.checkout_error_security_code_invalid_amex : C11771R.string.checkout_error_security_code_invalid;
            }
            return -1;
        }

        /* renamed from: a */
        public C11939a mo40358a(String str, IPaymentFormListener iPaymentFormListener) {
            return C11939a.DEFAULT;
        }

        /* renamed from: d */
        public int mo40359d() {
            return C11771R.string.checkout_error_security_code_invalid;
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.z0$e */
    static class C11928e implements C11791d {
        C11928e() {
        }

        /* renamed from: a */
        public int mo40357a(@C0193h0 CharSequence charSequence) {
            StringBuilder sb = new StringBuilder(charSequence);
            C11779b.m52949a(sb, C14069f.f41344H);
            int i = !CardPaymentParams.m53957i(sb.toString()) ? C11771R.string.checkout_helper_country_code : -1;
            C11779b.m52954b(sb);
            return i;
        }

        /* renamed from: a */
        public C11939a mo40358a(String str, IPaymentFormListener iPaymentFormListener) {
            return C11939a.DEFAULT;
        }

        /* renamed from: d */
        public int mo40359d() {
            return C11771R.string.checkout_helper_country_code;
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.z0$f */
    static class C11929f implements C11791d {
        C11929f() {
        }

        /* renamed from: a */
        public int mo40357a(@C0193h0 CharSequence charSequence) {
            if (!CardPaymentParams.m53962n(charSequence.toString())) {
                return C11771R.string.checkout_error_mobile_phone_number_invalid;
            }
            return -1;
        }

        /* renamed from: a */
        public C11939a mo40358a(String str, IPaymentFormListener iPaymentFormListener) {
            return C11939a.DEFAULT;
        }

        /* renamed from: d */
        public int mo40359d() {
            return C11771R.string.checkout_error_mobile_phone_number_invalid;
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.z0$g */
    static class C11930g implements C11791d {
        C11930g() {
        }

        /* renamed from: a */
        public int mo40357a(@C0193h0 CharSequence charSequence) {
            if (TextUtils.isEmpty(charSequence)) {
                return C11771R.string.checkout_error_email_invalid;
            }
            return -1;
        }

        /* renamed from: a */
        public C11939a mo40358a(String str, IPaymentFormListener iPaymentFormListener) {
            return C11939a.DEFAULT;
        }

        /* renamed from: d */
        public int mo40359d() {
            return C11771R.string.checkout_error_email_invalid;
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.z0$h */
    static class C11931h implements C11791d {

        /* renamed from: a */
        final /* synthetic */ String f34405a;

        C11931h(String str) {
            this.f34405a = str;
        }

        /* renamed from: a */
        public int mo40357a(@C0193h0 CharSequence charSequence) {
            if (!IkanoOiPaymentParams.m54000e(charSequence.toString(), this.f34405a)) {
                return mo40359d();
            }
            return -1;
        }

        /* renamed from: a */
        public C11939a mo40358a(String str, IPaymentFormListener iPaymentFormListener) {
            return C11939a.DEFAULT;
        }

        /* renamed from: d */
        public int mo40359d() {
            return C11771R.string.checkout_error_national_identifier_invalid;
        }
    }

    /* renamed from: a */
    static C11791d m53609a() {
        return new C11924a();
    }

    /* renamed from: a */
    static C11791d m53610a(int i) {
        return new C11927d(i);
    }

    /* renamed from: a */
    static C11791d m53611a(C11911v0 v0Var) {
        return new C11926c(v0Var);
    }

    /* renamed from: a */
    static C11791d m53612a(String str) {
        return new C11931h(str);
    }

    /* renamed from: a */
    static C11791d m53613a(Pattern pattern, C11836f1 f1Var, boolean z) {
        return new C11925b(f1Var, pattern, z);
    }

    /* renamed from: b */
    static C11791d m53614b() {
        return new C11928e();
    }

    /* renamed from: c */
    static C11791d m53615c() {
        return new C11929f();
    }

    /* renamed from: d */
    static C11791d m53616d() {
        return new C11930g();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static Pattern m53618f() {
        if (f34399a == null) {
            f34399a = Pattern.compile("[0-9]{2}/[0-9]{2,4}");
        }
        return f34399a;
    }
}
