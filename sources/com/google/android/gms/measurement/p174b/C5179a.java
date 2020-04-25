package com.google.android.gms.measurement.p174b;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0203m0;
import androidx.annotation.C0210o0;
import androidx.annotation.C0226w0;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4312d0;
import com.google.android.gms.internal.measurement.C4746ec;
import com.google.android.gms.measurement.internal.C5415u5;
import com.google.android.gms.measurement.internal.C5426v5;
import java.util.List;
import java.util.Map;

@C4056a
/* renamed from: com.google.android.gms.measurement.b.a */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
public class C5179a {

    /* renamed from: a */
    private final C4746ec f14834a;

    @C4056a
    /* renamed from: com.google.android.gms.measurement.b.a$a */
    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
    public static final class C5180a {
        @C4056a

        /* renamed from: a */
        public static final String f14835a = "origin";
        @C4056a

        /* renamed from: b */
        public static final String f14836b = "name";
        @C4056a

        /* renamed from: c */
        public static final String f14837c = "value";
        @C4056a

        /* renamed from: d */
        public static final String f14838d = "trigger_event_name";
        @C4056a

        /* renamed from: e */
        public static final String f14839e = "trigger_timeout";
        @C4056a

        /* renamed from: f */
        public static final String f14840f = "timed_out_event_name";
        @C4056a

        /* renamed from: g */
        public static final String f14841g = "timed_out_event_params";
        @C4056a

        /* renamed from: h */
        public static final String f14842h = "triggered_event_name";
        @C4056a

        /* renamed from: i */
        public static final String f14843i = "triggered_event_params";
        @C4056a

        /* renamed from: j */
        public static final String f14844j = "time_to_live";
        @C4056a

        /* renamed from: k */
        public static final String f14845k = "expired_event_name";
        @C4056a

        /* renamed from: l */
        public static final String f14846l = "expired_event_params";
        @C4056a

        /* renamed from: m */
        public static final String f14847m = "creation_timestamp";
        @C4056a

        /* renamed from: n */
        public static final String f14848n = "active";
        @C4056a

        /* renamed from: o */
        public static final String f14849o = "triggered_timestamp";

        private C5180a() {
        }
    }

    @C4056a
    @C4312d0
    /* renamed from: com.google.android.gms.measurement.b.a$b */
    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
    public interface C5181b extends C5426v5 {
        @C4056a
        @C0226w0
        @C4312d0
        /* renamed from: a */
        void mo21089a(String str, String str2, Bundle bundle, long j);
    }

    @C4056a
    @C4312d0
    /* renamed from: com.google.android.gms.measurement.b.a$c */
    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
    public interface C5182c extends C5415u5 {
        @C4056a
        @C0226w0
        @C4312d0
        void onEvent(String str, String str2, Bundle bundle, long j);
    }

    public C5179a(C4746ec ecVar) {
        this.f14834a = ecVar;
    }

    @C4056a
    @C0203m0(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    /* renamed from: a */
    public static C5179a m22471a(@C0193h0 Context context) {
        return C4746ec.m20058a(context).mo18939a();
    }

    @C4056a
    /* renamed from: b */
    public void mo21132b(String str, String str2, Bundle bundle) {
        this.f14834a.mo18951a(str, str2, bundle);
    }

    @C4056a
    /* renamed from: c */
    public void mo21135c(@C0193h0 Bundle bundle) {
        this.f14834a.mo18945a(bundle);
    }

    @C4056a
    @C0195i0
    /* renamed from: d */
    public String mo21136d() {
        return this.f14834a.mo18968g();
    }

    @C4056a
    @C0195i0
    /* renamed from: e */
    public String mo21137e() {
        return this.f14834a.mo18967f();
    }

    @C4056a
    @C0195i0
    /* renamed from: f */
    public String mo21138f() {
        return this.f14834a.mo18962c();
    }

    @C4056a
    @C0203m0(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    /* renamed from: a */
    public static C5179a m22472a(@C0193h0 Context context, @C0193h0 String str, @C0193h0 String str2, @C0193h0 String str3, Bundle bundle) {
        return C4746ec.m20059a(context, str, str2, str3, bundle).mo18939a();
    }

    @C4056a
    /* renamed from: b */
    public void mo21131b(@C0193h0 @C0210o0(min = 1) String str) {
        this.f14834a.mo18963c(str);
    }

    @C4056a
    @C0195i0
    /* renamed from: c */
    public String mo21134c() {
        return this.f14834a.mo18965d();
    }

    @C4056a
    @C4312d0
    /* renamed from: b */
    public void mo21130b(C5182c cVar) {
        this.f14834a.mo18958b((C5415u5) cVar);
    }

    @C4056a
    @C0226w0
    /* renamed from: c */
    public int mo21133c(@C0193h0 @C0210o0(min = 1) String str) {
        return this.f14834a.mo18964d(str);
    }

    @C4056a
    /* renamed from: a */
    public void mo21127a(boolean z) {
        this.f14834a.mo18954a(z);
    }

    @C4056a
    /* renamed from: b */
    public Bundle mo21128b(Bundle bundle) {
        return this.f14834a.mo18937a(bundle, true);
    }

    @C4056a
    /* renamed from: a */
    public void mo21125a(String str, String str2, Bundle bundle, long j) {
        this.f14834a.mo18952a(str, str2, bundle, j);
    }

    @C4056a
    /* renamed from: b */
    public String mo21129b() {
        return this.f14834a.mo18970i();
    }

    @C4056a
    /* renamed from: a */
    public void mo21126a(String str, String str2, Object obj) {
        this.f14834a.mo18953a(str, str2, obj);
    }

    @C4056a
    @C0226w0
    /* renamed from: a */
    public Map<String, Object> mo21118a(@C0195i0 String str, @C0210o0(max = 24, min = 1) @C0195i0 String str2, boolean z) {
        return this.f14834a.mo18941a(str, str2, z);
    }

    @C4056a
    /* renamed from: a */
    public void mo21124a(@C0193h0 @C0210o0(max = 24, min = 1) String str, @C0195i0 String str2, @C0195i0 Bundle bundle) {
        this.f14834a.mo18960b(str, str2, bundle);
    }

    @C4056a
    @C0226w0
    /* renamed from: a */
    public List<Bundle> mo21117a(@C0195i0 String str, @C0210o0(max = 23, min = 1) @C0195i0 String str2) {
        return this.f14834a.mo18955b(str, str2);
    }

    @C4056a
    /* renamed from: a */
    public long mo21116a() {
        return this.f14834a.mo18966e();
    }

    @C4056a
    /* renamed from: a */
    public void mo21123a(@C0193h0 @C0210o0(min = 1) String str) {
        this.f14834a.mo18959b(str);
    }

    @C4056a
    @C0226w0
    @C4312d0
    /* renamed from: a */
    public void mo21121a(C5181b bVar) {
        this.f14834a.mo18947a((C5426v5) bVar);
    }

    @C4056a
    @C4312d0
    /* renamed from: a */
    public void mo21122a(C5182c cVar) {
        this.f14834a.mo18946a((C5415u5) cVar);
    }

    @C4056a
    /* renamed from: a */
    public void mo21120a(Bundle bundle) {
        this.f14834a.mo18937a(bundle, false);
    }

    @C4056a
    /* renamed from: a */
    public void mo21119a(@C0193h0 Activity activity, @C0210o0(max = 36, min = 1) @C0195i0 String str, @C0210o0(max = 36, min = 1) @C0195i0 String str2) {
        this.f14834a.mo18944a(activity, str, str2);
    }
}
