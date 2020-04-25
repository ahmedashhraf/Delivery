package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.C0187e0;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.C4056a;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@C4056a
public class LifecycleCallback {
    @C4056a

    /* renamed from: a */
    protected final C4162m f12884a;

    @C4056a
    protected LifecycleCallback(C4162m mVar) {
        this.f12884a = mVar;
    }

    @C4056a
    /* renamed from: a */
    protected static C4162m m17698a(C4157l lVar) {
        if (lVar.mo17916e()) {
            return C4220w3.m18264a(lVar.mo17913b());
        }
        if (lVar.mo17917f()) {
            return C4210u3.m18228a(lVar.mo17912a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static C4162m getChimeraLifecycleFragmentImpl(C4157l lVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    @C4056a
    @C0187e0
    /* renamed from: a */
    public void mo17758a(int i, int i2, Intent intent) {
    }

    @C4056a
    @C0187e0
    /* renamed from: a */
    public void mo17759a(Bundle bundle) {
    }

    @C4056a
    @C0187e0
    /* renamed from: a */
    public void mo17760a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @C4056a
    @C0187e0
    /* renamed from: b */
    public void mo17761b() {
    }

    @C4056a
    @C0187e0
    /* renamed from: b */
    public void mo17762b(Bundle bundle) {
    }

    @C4056a
    @C0187e0
    /* renamed from: c */
    public void mo17763c() {
    }

    @C4056a
    @C0187e0
    /* renamed from: d */
    public void mo17764d() {
    }

    @C4056a
    @C0187e0
    /* renamed from: e */
    public void mo17765e() {
    }

    @C4056a
    /* renamed from: a */
    public static C4162m m17696a(Activity activity) {
        return m17698a(new C4157l(activity));
    }

    @C4056a
    /* renamed from: a */
    public static C4162m m17697a(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    @C4056a
    /* renamed from: a */
    public Activity mo17757a() {
        return this.f12884a.mo17922s();
    }
}
