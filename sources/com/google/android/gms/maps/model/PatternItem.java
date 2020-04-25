package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;
import java.util.ArrayList;
import java.util.List;

@C4392a(creator = "PatternItemCreator")
@C4397f({1})
public class PatternItem extends AbstractSafeParcelable {
    public static final Creator<PatternItem> CREATOR = new zzi();
    private static final String TAG = PatternItem.class.getSimpleName();
    @C4394c(getter = "getType", mo18384id = 2)
    private final int type;
    @C0195i0
    @C4394c(getter = "getLength", mo18384id = 3)
    private final Float zzdu;

    @C4393b
    public PatternItem(@C4396e(mo18387id = 2) int i, @C4396e(mo18387id = 3) @C0195i0 Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < 0.0f)) {
            z = false;
        }
        String valueOf = String.valueOf(f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
        sb.append("Invalid PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(valueOf);
        C4300a0.m18628a(z, (Object) sb.toString());
        this.type = i;
        this.zzdu = f;
    }

    @C0195i0
    static List<PatternItem> zza(@C0195i0 List<PatternItem> list) {
        PatternItem patternItem;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (PatternItem patternItem2 : list) {
            if (patternItem2 == null) {
                patternItem2 = null;
            } else {
                int i = patternItem2.type;
                if (i == 0) {
                    patternItem = new Dash(patternItem2.zzdu.floatValue());
                } else if (i == 1) {
                    patternItem2 = new Dot();
                } else if (i != 2) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Unknown PatternItem type: ");
                    sb.append(i);
                    sb.toString();
                } else {
                    patternItem = new Gap(patternItem2.zzdu.floatValue());
                }
                patternItem2 = patternItem;
            }
            arrayList.add(patternItem2);
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        return this.type == patternItem.type && C4413y.m19053a(this.zzdu, patternItem.zzdu);
    }

    public int hashCode() {
        return C4413y.m19051a(Integer.valueOf(this.type), this.zzdu);
    }

    public String toString() {
        int i = this.type;
        String valueOf = String.valueOf(this.zzdu);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("[PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 2, this.type);
        C4399a.m18976a(parcel, 3, this.zzdu, false);
        C4399a.m18959a(parcel, a);
    }
}
