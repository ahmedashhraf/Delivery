package com.oppwa.mobile.connect.payment;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0193h0;
import com.facebook.appevents.AppEventsConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p212io.fabric.sdk.android.p493p.p498e.C14330v;

public class ImagesRequest implements Parcelable {
    public static final Creator<ImagesRequest> CREATOR = new C11948a();
    @C0193h0

    /* renamed from: a */
    private Map<String, ImageDetail> f34488a;

    /* renamed from: com.oppwa.mobile.connect.payment.ImagesRequest$a */
    static class C11948a implements Creator<ImagesRequest> {
        C11948a() {
        }

        /* renamed from: a */
        public ImagesRequest createFromParcel(Parcel parcel) {
            return new ImagesRequest(parcel, null);
        }

        /* renamed from: a */
        public ImagesRequest[] newArray(int i) {
            return new ImagesRequest[i];
        }
    }

    private ImagesRequest(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt > 0) {
            this.f34488a = new LinkedHashMap();
            for (int i = 0; i < readInt; i++) {
                this.f34488a.put(parcel.readString(), (ImageDetail) parcel.readParcelable(ImageDetail.class.getClassLoader()));
            }
        }
    }

    /* synthetic */ ImagesRequest(Parcel parcel, C11948a aVar) {
        this(parcel);
    }

    public ImagesRequest(@C0193h0 Map<String, ImageDetail> map) {
        this.f34488a = map;
    }

    /* renamed from: a */
    private static ImageDetail m53867a(JSONArray jSONArray) throws JSONException {
        String str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        String str2 = "";
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject.getString("type").equals("PNG")) {
                int parseInt = Integer.parseInt(str);
                String str3 = C14330v.f42318d0;
                if (parseInt < Integer.parseInt(jSONObject.getString(str3))) {
                    str = jSONObject.getString(str3);
                    str2 = jSONObject.getString("url");
                }
            }
        }
        ImageDetail imageDetail = new ImageDetail();
        imageDetail.mo40864e(str2);
        return imageDetail;
    }

    /* renamed from: a */
    public static ImagesRequest m53868a(JSONObject jSONObject) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ImagesRequest imagesRequest = new ImagesRequest((Map<String, ImageDetail>) linkedHashMap);
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            linkedHashMap.put(str, m53867a(jSONObject.getJSONArray(str)));
        }
        return imagesRequest;
    }

    @C0193h0
    /* renamed from: a */
    public Map<String, ImageDetail> mo40875a() {
        return this.f34488a;
    }

    /* renamed from: a */
    public void mo40876a(ImagesRequest imagesRequest) {
        if (imagesRequest != null) {
            this.f34488a.putAll(imagesRequest.mo40875a());
        }
    }

    /* renamed from: a */
    public boolean mo40877a(@C0193h0 String str) {
        return this.f34488a.containsKey(str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ImagesRequest.class != obj.getClass()) {
            return false;
        }
        return this.f34488a.equals(((ImagesRequest) obj).f34488a);
    }

    public int hashCode() {
        return this.f34488a.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int size = this.f34488a.size();
        parcel.writeInt(size);
        if (size > 0) {
            for (Entry entry : this.f34488a.entrySet()) {
                parcel.writeString((String) entry.getKey());
                parcel.writeParcelable((Parcelable) entry.getValue(), 0);
            }
        }
    }
}
