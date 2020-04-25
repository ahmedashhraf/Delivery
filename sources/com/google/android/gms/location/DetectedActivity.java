package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;
import java.util.Comparator;

@C4392a(creator = "DetectedActivityCreator")
@C4397f({1000})
public class DetectedActivity extends AbstractSafeParcelable {
    public static final Creator<DetectedActivity> CREATOR = new C5141l0();

    /* renamed from: N */
    private static final Comparator<DetectedActivity> f14695N = new C5139k0();

    /* renamed from: O */
    public static final int f14696O = 0;

    /* renamed from: P */
    public static final int f14697P = 1;

    /* renamed from: Q */
    public static final int f14698Q = 2;

    /* renamed from: R */
    public static final int f14699R = 3;

    /* renamed from: S */
    public static final int f14700S = 4;

    /* renamed from: T */
    public static final int f14701T = 5;

    /* renamed from: U */
    public static final int f14702U = 7;

    /* renamed from: V */
    public static final int f14703V = 8;

    /* renamed from: W */
    private static final int[] f14704W = {9, 10};

    /* renamed from: X */
    private static final int[] f14705X = {0, 1, 2, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 16, 17, 18, 19};

    /* renamed from: Y */
    private static final int[] f14706Y = {0, 1, 2, 3, 7, 8, 16, 17};
    @C4394c(mo18384id = 1)

    /* renamed from: a */
    private int f14707a;
    @C4394c(mo18384id = 2)

    /* renamed from: b */
    private int f14708b;

    @C4393b
    public DetectedActivity(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) int i2) {
        this.f14707a = i;
        this.f14708b = i2;
    }

    /* renamed from: e */
    public static void m22299e(int i) {
        boolean z = false;
        for (int i2 : f14706Y) {
            if (i2 == i) {
                z = true;
            }
        }
        if (!z) {
            StringBuilder sb = new StringBuilder(81);
            sb.append(i);
            sb.append(" is not a valid DetectedActivity supported by Activity Transition API.");
            sb.toString();
        }
    }

    /* renamed from: N */
    public int mo20002N() {
        return this.f14708b;
    }

    /* renamed from: O */
    public int mo20003O() {
        int i = this.f14707a;
        if (i > 19 || i < 0) {
            return 4;
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DetectedActivity.class == obj.getClass()) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            return this.f14707a == detectedActivity.f14707a && this.f14708b == detectedActivity.f14708b;
        }
    }

    public int hashCode() {
        return C4413y.m19051a(Integer.valueOf(this.f14707a), Integer.valueOf(this.f14708b));
    }

    public String toString() {
        String str;
        int O = mo20003O();
        if (O == 0) {
            str = "IN_VEHICLE";
        } else if (O == 1) {
            str = "ON_BICYCLE";
        } else if (O == 2) {
            str = "ON_FOOT";
        } else if (O == 3) {
            str = "STILL";
        } else if (O == 4) {
            str = "UNKNOWN";
        } else if (O == 5) {
            str = "TILTING";
        } else if (O == 7) {
            str = "WALKING";
        } else if (O != 8) {
            switch (O) {
                case 16:
                    str = "IN_ROAD_VEHICLE";
                    break;
                case 17:
                    str = "IN_RAIL_VEHICLE";
                    break;
                case 18:
                    str = "IN_TWO_WHEELER_VEHICLE";
                    break;
                case 19:
                    str = "IN_FOUR_WHEELER_VEHICLE";
                    break;
                default:
                    str = Integer.toString(O);
                    break;
            }
        } else {
            str = "RUNNING";
        }
        int i = this.f14708b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48);
        sb.append("DetectedActivity [type=");
        sb.append(str);
        sb.append(", confidence=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f14707a);
        C4399a.m18964a(parcel, 2, this.f14708b);
        C4399a.m18959a(parcel, a);
    }
}
