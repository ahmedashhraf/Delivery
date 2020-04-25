package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.C5560k;
import com.mrsool.chat.C10526n.C10527a;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSecurityPolicyMode;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.exception.ErrorCode;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.p427b.C11780c;
import com.oppwa.mobile.connect.payment.BrandsValidation;
import com.oppwa.mobile.connect.payment.CheckoutInfo;
import com.oppwa.mobile.connect.payment.token.Token;
import com.oppwa.mobile.connect.provider.C11977a.C11978a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.z */
class C11921z implements Parcelable {
    public static final Creator<C11921z> CREATOR = new C11922a();
    @C0193h0

    /* renamed from: a */
    private Set<String> f34397a;
    @C0195i0

    /* renamed from: b */
    private Token[] f34398b;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.z$a */
    static class C11922a implements Creator<C11921z> {
        C11922a() {
        }

        /* renamed from: a */
        public C11921z createFromParcel(Parcel parcel) {
            return new C11921z(parcel, (C11922a) null);
        }

        /* renamed from: a */
        public C11921z[] newArray(int i) {
            return new C11921z[i];
        }
    }

    private C11921z(Parcel parcel) {
        this.f34397a = new LinkedHashSet(Arrays.asList(parcel.createStringArray()));
        this.f34398b = (Token[]) parcel.createTypedArray(Token.CREATOR);
    }

    /* synthetic */ C11921z(Parcel parcel, C11922a aVar) {
        this(parcel);
    }

    C11921z(@C0193h0 Set<String> set, @C0195i0 Token[] tokenArr) {
        this.f34397a = set;
        this.f34398b = tokenArr;
    }

    /* renamed from: b */
    private void m53596b(CheckoutSettings checkoutSettings, boolean z) {
        CheckoutSecurityPolicyMode z2 = checkoutSettings.mo40736z();
        if (!z && z2 == CheckoutSecurityPolicyMode.DEVICE_AUTH_REQUIRED) {
            this.f34398b = null;
        }
    }

    /* renamed from: b */
    private boolean m53597b(BrandsValidation brandsValidation) {
        for (String d : this.f34397a) {
            if (!brandsValidation.mo40798d(d)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private void m53598i() {
        String str = "PAYWITHGOOGLE";
        boolean contains = this.f34397a.contains(str);
        String str2 = C10527a.f28541b;
        if (contains) {
            this.f34397a.remove(str);
            this.f34397a.add(str2);
        }
        if (!C11825d1.f34192c) {
            this.f34397a.remove(str2);
        }
        this.f34397a.remove("APPLEPAY");
        this.f34397a.remove("CARD");
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    /* renamed from: a */
    public Set<String> mo40616a() {
        return this.f34397a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo40617a(@C0193h0 C5560k<Boolean> kVar, C11978a aVar) throws PaymentException {
        String str = C10527a.f28541b;
        try {
            if (!((Boolean) kVar.mo22003a(ApiException.class)).booleanValue()) {
                this.f34397a.remove(str);
            }
        } catch (ApiException e) {
            if (aVar == C11978a.LIVE) {
                this.f34397a.remove(str);
                return;
            }
            throw new PaymentException(new PaymentError(ErrorCode.ERROR_CODE_GOOGLEPAY, e.getMessage()));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo40618a(CheckoutSettings checkoutSettings, boolean z) {
        m53598i();
        Token[] tokenArr = this.f34398b;
        if (tokenArr != null && tokenArr.length > 0) {
            m53596b(checkoutSettings, z);
        }
        Iterator it = this.f34397a.iterator();
        while (it.hasNext()) {
            if (checkoutSettings.mo40675a((String) it.next()) == CheckoutSecurityPolicyMode.DEVICE_AUTH_REQUIRED && !z) {
                it.remove();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo40619a(CheckoutInfo checkoutInfo) {
        if (checkoutInfo.mo40849m() && checkoutInfo.mo40839b() != null) {
            List asList = Arrays.asList(checkoutInfo.mo40839b());
            if (checkoutInfo.mo40851o()) {
                this.f34397a = new LinkedHashSet(asList);
            } else {
                this.f34397a.retainAll(asList);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo40620a(String str, C11978a aVar) throws PaymentException {
        String str2 = "KLARNA_INVOICE";
        String str3 = "KLARNA_INSTALLMENTS";
        if ((this.f34397a.contains(str2) || this.f34397a.contains(str3)) && !C11802b1.m53074a(str)) {
            if (aVar == null || aVar != C11978a.TEST) {
                this.f34397a.remove(str2);
                this.f34397a.remove(str3);
                return;
            }
            throw new PaymentException(new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_METHOD_NOT_AVAILABLE, "Klarna country is not supported."));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo40621a(BrandsValidation brandsValidation) {
        Token[] tokenArr = this.f34398b;
        return (tokenArr == null || tokenArr.length == 0) && !m53597b(brandsValidation);
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: b */
    public Token[] mo40622b() {
        return this.f34398b;
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    /* renamed from: c */
    public String[] mo40623c() {
        return (String[]) this.f34397a.toArray(new String[0]);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C11921z.class != obj.getClass()) {
            return false;
        }
        C11921z zVar = (C11921z) obj;
        if (!C11780c.m52958a((Object) this.f34397a, (Object) zVar.f34397a) || !Arrays.equals(this.f34398b, zVar.mo40622b())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = this.f34397a.hashCode();
        return hashCode + (hashCode * 31) + Arrays.hashCode(this.f34398b);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(mo40623c());
        parcel.writeTypedArray(this.f34398b, i);
    }
}
