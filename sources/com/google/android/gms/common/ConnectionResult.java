package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender.SendIntentException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;

@C4392a(creator = "ConnectionResultCreator")
public final class ConnectionResult extends AbstractSafeParcelable {
    public static final Creator<ConnectionResult> CREATOR = new C4467t();
    @C4056a

    /* renamed from: P */
    public static final int f12741P = -1;

    /* renamed from: Q */
    public static final int f12742Q = 0;

    /* renamed from: R */
    public static final int f12743R = 1;

    /* renamed from: S */
    public static final int f12744S = 2;

    /* renamed from: T */
    public static final int f12745T = 3;

    /* renamed from: U */
    public static final int f12746U = 4;

    /* renamed from: V */
    public static final int f12747V = 5;

    /* renamed from: W */
    public static final int f12748W = 6;

    /* renamed from: X */
    public static final int f12749X = 7;

    /* renamed from: Y */
    public static final int f12750Y = 8;

    /* renamed from: Z */
    public static final int f12751Z = 9;

    /* renamed from: a0 */
    public static final int f12752a0 = 10;

    /* renamed from: b0 */
    public static final int f12753b0 = 11;

    /* renamed from: c0 */
    public static final int f12754c0 = 13;

    /* renamed from: d0 */
    public static final int f12755d0 = 14;

    /* renamed from: e0 */
    public static final int f12756e0 = 15;

    /* renamed from: f0 */
    public static final int f12757f0 = 16;

    /* renamed from: g0 */
    public static final int f12758g0 = 17;

    /* renamed from: h0 */
    public static final int f12759h0 = 18;

    /* renamed from: i0 */
    public static final int f12760i0 = 19;

    /* renamed from: j0 */
    public static final int f12761j0 = 20;
    @Deprecated

    /* renamed from: k0 */
    public static final int f12762k0 = 1500;
    @C4056a

    /* renamed from: l0 */
    public static final ConnectionResult f12763l0 = new ConnectionResult(0);
    @C4394c(getter = "getResolution", mo18384id = 3)

    /* renamed from: N */
    private final PendingIntent f12764N;
    @C4394c(getter = "getErrorMessage", mo18384id = 4)

    /* renamed from: O */
    private final String f12765O;
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f12766a;
    @C4394c(getter = "getErrorCode", mo18384id = 2)

    /* renamed from: b */
    private final int f12767b;

    @C4393b
    ConnectionResult(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) int i2, @C4396e(mo18387id = 3) PendingIntent pendingIntent, @C4396e(mo18387id = 4) String str) {
        this.f12766a = i;
        this.f12767b = i2;
        this.f12764N = pendingIntent;
        this.f12765O = str;
    }

    /* renamed from: N */
    public final int mo17576N() {
        return this.f12767b;
    }

    @C0195i0
    /* renamed from: O */
    public final String mo17577O() {
        return this.f12765O;
    }

    @C0195i0
    /* renamed from: P */
    public final PendingIntent mo17578P() {
        return this.f12764N;
    }

    /* renamed from: Q */
    public final boolean mo17579Q() {
        return (this.f12767b == 0 || this.f12764N == null) ? false : true;
    }

    /* renamed from: R */
    public final boolean mo17580R() {
        return this.f12767b == 0;
    }

    /* renamed from: a */
    public final void mo17581a(Activity activity, int i) throws SendIntentException {
        if (mo17579Q()) {
            activity.startIntentSenderForResult(this.f12764N.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f12767b == connectionResult.f12767b && C4413y.m19053a(this.f12764N, connectionResult.f12764N) && C4413y.m19053a(this.f12765O, connectionResult.f12765O);
    }

    public final int hashCode() {
        return C4413y.m19051a(Integer.valueOf(this.f12767b), this.f12764N, this.f12765O);
    }

    public final String toString() {
        return C4413y.m19052a((Object) this).mo18403a("statusCode", m17511a(this.f12767b)).mo18403a("resolution", this.f12764N).mo18403a("message", this.f12765O).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f12766a);
        C4399a.m18964a(parcel, 2, mo17576N());
        C4399a.m18969a(parcel, 3, (Parcelable) mo17578P(), i, false);
        C4399a.m18979a(parcel, 4, mo17577O(), false);
        C4399a.m18959a(parcel, a);
    }

    /* renamed from: a */
    static String m17511a(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public ConnectionResult(int i) {
        this(i, null, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }
}
