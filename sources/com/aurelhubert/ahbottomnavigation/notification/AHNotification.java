package com.aurelhubert.ahbottomnavigation.notification;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import java.util.ArrayList;
import java.util.List;

public class AHNotification implements Parcelable {
    public static final Creator<AHNotification> CREATOR = new C2921a();
    /* access modifiers changed from: private */
    @C0198k

    /* renamed from: N */
    public int f10363N;
    /* access modifiers changed from: private */
    @C0195i0

    /* renamed from: a */
    public String f10364a;
    /* access modifiers changed from: private */
    @C0198k

    /* renamed from: b */
    public int f10365b;

    /* renamed from: com.aurelhubert.ahbottomnavigation.notification.AHNotification$a */
    static class C2921a implements Creator<AHNotification> {
        C2921a() {
        }

        public AHNotification createFromParcel(Parcel parcel) {
            return new AHNotification(parcel, null);
        }

        public AHNotification[] newArray(int i) {
            return new AHNotification[i];
        }
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.notification.AHNotification$b */
    public static class C2922b {
        @C0195i0

        /* renamed from: a */
        private String f10366a;
        @C0198k

        /* renamed from: b */
        private int f10367b;
        @C0198k

        /* renamed from: c */
        private int f10368c;

        /* renamed from: a */
        public C2922b mo11607a(String str) {
            this.f10366a = str;
            return this;
        }

        /* renamed from: b */
        public C2922b mo11609b(@C0198k int i) {
            this.f10367b = i;
            return this;
        }

        /* renamed from: a */
        public C2922b mo11606a(@C0198k int i) {
            this.f10368c = i;
            return this;
        }

        /* renamed from: a */
        public AHNotification mo11608a() {
            AHNotification aHNotification = new AHNotification();
            aHNotification.f10364a = this.f10366a;
            aHNotification.f10365b = this.f10367b;
            aHNotification.f10363N = this.f10368c;
            return aHNotification;
        }
    }

    /* synthetic */ AHNotification(Parcel parcel, C2921a aVar) {
        this(parcel);
    }

    /* renamed from: c */
    public int mo11600c() {
        return this.f10365b;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo11602i() {
        return TextUtils.isEmpty(this.f10364a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10364a);
        parcel.writeInt(this.f10365b);
        parcel.writeInt(this.f10363N);
    }

    public AHNotification() {
    }

    /* renamed from: b */
    public String mo11599b() {
        return this.f10364a;
    }

    private AHNotification(Parcel parcel) {
        this.f10364a = parcel.readString();
        this.f10365b = parcel.readInt();
        this.f10363N = parcel.readInt();
    }

    /* renamed from: a */
    public int mo11598a() {
        return this.f10363N;
    }

    /* renamed from: a */
    public static AHNotification m13946a(String str) {
        return new C2922b().mo11607a(str).mo11608a();
    }

    /* renamed from: a */
    public static List<AHNotification> m13948a(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new AHNotification());
        }
        return arrayList;
    }
}
