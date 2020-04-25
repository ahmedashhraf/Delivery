package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p212io.fabric.sdk.android.p493p.p498e.C14330v;

@C4392a(creator = "WebImageCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class WebImage extends AbstractSafeParcelable {
    public static final Creator<WebImage> CREATOR = new C4298f();
    @C4394c(getter = "getWidth", mo18384id = 3)

    /* renamed from: N */
    private final int f13319N;
    @C4394c(getter = "getHeight", mo18384id = 4)

    /* renamed from: O */
    private final int f13320O;
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f13321a;
    @C4394c(getter = "getUrl", mo18384id = 2)

    /* renamed from: b */
    private final Uri f13322b;

    @C4393b
    WebImage(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) Uri uri, @C4396e(mo18387id = 3) int i2, @C4396e(mo18387id = 4) int i3) {
        this.f13321a = i;
        this.f13322b = uri;
        this.f13319N = i2;
        this.f13320O = i3;
    }

    /* renamed from: a */
    private static Uri m18561a(JSONObject jSONObject) {
        String str = "url";
        if (jSONObject.has(str)) {
            try {
                return Uri.parse(jSONObject.getString(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: N */
    public final Uri mo18143N() {
        return this.f13322b;
    }

    @C4056a
    /* renamed from: O */
    public final JSONObject mo18144O() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.f13322b.toString());
            jSONObject.put(C14330v.f42318d0, this.f13319N);
            jSONObject.put(C14330v.f42320e0, this.f13320O);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            return C4413y.m19053a(this.f13322b, webImage.f13322b) && this.f13319N == webImage.f13319N && this.f13320O == webImage.f13320O;
        }
    }

    public final int getHeight() {
        return this.f13320O;
    }

    public final int getWidth() {
        return this.f13319N;
    }

    public final int hashCode() {
        return C4413y.m19051a(this.f13322b, Integer.valueOf(this.f13319N), Integer.valueOf(this.f13320O));
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.f13319N), Integer.valueOf(this.f13320O), this.f13322b.toString()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f13321a);
        C4399a.m18969a(parcel, 2, (Parcelable) mo18143N(), i, false);
        C4399a.m18964a(parcel, 3, getWidth());
        C4399a.m18964a(parcel, 4, getHeight());
        C4399a.m18959a(parcel, a);
    }

    public WebImage(Uri uri, int i, int i2) throws IllegalArgumentException {
        this(1, uri, i, i2);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    public WebImage(Uri uri) throws IllegalArgumentException {
        this(uri, 0, 0);
    }

    @C4056a
    public WebImage(JSONObject jSONObject) throws IllegalArgumentException {
        this(m18561a(jSONObject), jSONObject.optInt(C14330v.f42318d0, 0), jSONObject.optInt(C14330v.f42320e0, 0));
    }
}
