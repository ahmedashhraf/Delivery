package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;

@C4392a(creator = "SignInConfigurationCreator")
@C4397f({1})
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<SignInConfiguration> CREATOR = new C4020y();
    @C4394c(getter = "getConsumerPkgName", mo18384id = 2)

    /* renamed from: a */
    private final String f12673a;
    @C4394c(getter = "getGoogleConfig", mo18384id = 5)

    /* renamed from: b */
    private GoogleSignInOptions f12674b;

    @C4393b
    public SignInConfiguration(@C4396e(mo18387id = 2) String str, @C4396e(mo18387id = 5) GoogleSignInOptions googleSignInOptions) {
        this.f12673a = C4300a0.m18630b(str);
        this.f12674b = googleSignInOptions;
    }

    /* renamed from: N */
    public final GoogleSignInOptions mo17511N() {
        return this.f12674b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f12673a.equals(signInConfiguration.f12673a)) {
            GoogleSignInOptions googleSignInOptions = this.f12674b;
            if (googleSignInOptions != null ? googleSignInOptions.equals(signInConfiguration.f12674b) : signInConfiguration.f12674b == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new C3996a().mo17517a((Object) this.f12673a).mo17517a((Object) this.f12674b).mo17516a();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18979a(parcel, 2, this.f12673a, false);
        C4399a.m18969a(parcel, 5, (Parcelable) this.f12674b, i, false);
        C4399a.m18959a(parcel, a);
    }
}
