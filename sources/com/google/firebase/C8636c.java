package com.google.firebase;

import android.content.Context;
import com.google.firebase.p317l.C8738a;

/* renamed from: com.google.firebase.c */
/* compiled from: com.google.firebase:firebase-common@@19.0.0 */
final /* synthetic */ class C8636c implements C8738a {

    /* renamed from: a */
    private final FirebaseApp f22663a;

    /* renamed from: b */
    private final Context f22664b;

    private C8636c(FirebaseApp firebaseApp, Context context) {
        this.f22663a = firebaseApp;
        this.f22664b = context;
    }

    /* renamed from: a */
    public static C8738a m40621a(FirebaseApp firebaseApp, Context context) {
        return new C8636c(firebaseApp, context);
    }

    public Object get() {
        return FirebaseApp.m40517a(this.f22663a, this.f22664b);
    }
}
