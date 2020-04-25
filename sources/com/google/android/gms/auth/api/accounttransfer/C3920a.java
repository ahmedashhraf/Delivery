package com.google.android.gms.auth.api.accounttransfer;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.api.C4059a;
import com.google.android.gms.common.api.C4059a.C4060a;
import com.google.android.gms.common.api.C4059a.C4072g;
import com.google.android.gms.internal.auth.C4601o0;
import com.google.android.gms.internal.auth.C4603p0;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.a */
public final class C3920a {

    /* renamed from: a */
    public static final String f12432a = "com.google.android.gms.auth.START_ACCOUNT_EXPORT";

    /* renamed from: b */
    public static final String f12433b = "com.google.android.gms.auth.ACCOUNT_IMPORT_DATA_AVAILABLE";

    /* renamed from: c */
    public static final String f12434c = "com.google.android.gms.auth.ACCOUNT_EXPORT_DATA_AVAILABLE";

    /* renamed from: d */
    public static final String f12435d = "key_extra_account_type";

    /* renamed from: e */
    private static final C4072g<C4603p0> f12436e = new C4072g<>();

    /* renamed from: f */
    private static final C4060a<C4603p0, C3939q> f12437f = new C3927e();

    /* renamed from: g */
    private static final C4059a<C3939q> f12438g = new C4059a<>("AccountTransfer.ACCOUNT_TRANSFER_API", f12437f, f12436e);
    @Deprecated

    /* renamed from: h */
    private static final C3928f f12439h = new C4601o0();

    /* renamed from: i */
    private static final C3941s f12440i = new C4601o0();

    private C3920a() {
    }

    /* renamed from: a */
    public static C3921b m17107a(@C0193h0 Activity activity) {
        return new C3921b(activity);
    }

    /* renamed from: a */
    public static C3921b m17108a(@C0193h0 Context context) {
        return new C3921b(context);
    }
}
