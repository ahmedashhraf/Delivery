package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4312d0;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.util.C4476d0;

@C4056a
@C4312d0
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    @C4056a
    /* renamed from: O0 */
    public byte[] mo18519O0() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @C4476d0
    /* renamed from: a */
    public Object mo18472a(String str) {
        return null;
    }

    @C4476d0
    /* renamed from: b */
    public boolean mo18492b(String str) {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (Field field : mo17325N0().values()) {
            if (mo17329b(field)) {
                if (!fastJsonResponse.mo17329b(field) || !mo17326a(field).equals(fastJsonResponse.mo17326a(field))) {
                    return false;
                }
            } else if (fastJsonResponse.mo17329b(field)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (Field field : mo17325N0().values()) {
            if (mo17329b(field)) {
                i = (i * 31) + mo17326a(field).hashCode();
            }
        }
        return i;
    }
}
