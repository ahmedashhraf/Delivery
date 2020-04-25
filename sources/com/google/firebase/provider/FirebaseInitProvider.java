package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0224v0;
import com.google.android.gms.common.internal.C4300a0;
import com.google.firebase.FirebaseApp;

/* compiled from: com.google.firebase:firebase-common@@19.0.0 */
public class FirebaseInitProvider extends ContentProvider {

    /* renamed from: a */
    private static final String f22982a = "FirebaseInitProvider";
    @C0224v0

    /* renamed from: b */
    static final String f22983b = "com.google.firebase.firebaseinitprovider";

    /* renamed from: a */
    private static void m41066a(@C0193h0 ProviderInfo providerInfo) {
        C4300a0.m18621a(providerInfo, (Object) "FirebaseInitProvider ProviderInfo cannot be null.");
        if (f22983b.equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    public void attachInfo(@C0193h0 Context context, @C0193h0 ProviderInfo providerInfo) {
        m41066a(providerInfo);
        super.attachInfo(context, providerInfo);
    }

    public int delete(@C0193h0 Uri uri, @C0195i0 String str, @C0195i0 String[] strArr) {
        return 0;
    }

    @C0195i0
    public String getType(@C0193h0 Uri uri) {
        return null;
    }

    @C0195i0
    public Uri insert(@C0193h0 Uri uri, @C0195i0 ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        FirebaseApp b = FirebaseApp.m40522b(getContext());
        return false;
    }

    @C0195i0
    public Cursor query(@C0193h0 Uri uri, @C0195i0 String[] strArr, @C0195i0 String str, @C0195i0 String[] strArr2, @C0195i0 String str2) {
        return null;
    }

    public int update(@C0193h0 Uri uri, @C0195i0 ContentValues contentValues, @C0195i0 String str, @C0195i0 String[] strArr) {
        return 0;
    }
}
