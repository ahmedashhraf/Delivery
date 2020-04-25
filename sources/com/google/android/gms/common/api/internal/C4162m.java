package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.annotation.C4056a;

@C4056a
/* renamed from: com.google.android.gms.common.api.internal.m */
public interface C4162m {
    @C4056a
    /* renamed from: a */
    <T extends LifecycleCallback> T mo17919a(String str, Class<T> cls);

    @C4056a
    /* renamed from: a */
    void mo17920a(String str, @C0193h0 LifecycleCallback lifecycleCallback);

    @C4056a
    /* renamed from: q */
    boolean mo17921q();

    @C4056a
    /* renamed from: s */
    Activity mo17922s();

    @C4056a
    void startActivityForResult(Intent intent, int i);

    @C4056a
    /* renamed from: u */
    boolean mo17924u();
}
