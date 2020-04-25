package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.C4053R;
import com.google.android.gms.common.annotation.C4056a;
import p201f.p202a.C5952h;

@C4056a
/* renamed from: com.google.android.gms.common.internal.h0 */
public class C4338h0 {

    /* renamed from: a */
    private final Resources f13489a;

    /* renamed from: b */
    private final String f13490b = this.f13489a.getResourcePackageName(C4053R.string.common_google_play_services_unknown_issue);

    public C4338h0(Context context) {
        C4300a0.m18620a(context);
        this.f13489a = context.getResources();
    }

    @C4056a
    @C5952h
    /* renamed from: a */
    public String mo18323a(String str) {
        int identifier = this.f13489a.getIdentifier(str, "string", this.f13490b);
        if (identifier == 0) {
            return null;
        }
        return this.f13489a.getString(identifier);
    }
}
