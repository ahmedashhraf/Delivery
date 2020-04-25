package com.google.android.gms.internal.measurement;

import android.support.p003v4.media.session.PlaybackStateCompat;
import com.amplitude.api.C2876e;
import com.facebook.common.util.UriUtil;

/* renamed from: com.google.android.gms.internal.measurement.p8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C4916p8 implements C4877m8 {

    /* renamed from: A */
    private static final C4896o1<Long> f14332A;

    /* renamed from: B */
    private static final C4896o1<Long> f14333B;

    /* renamed from: C */
    private static final C4896o1<Long> f14334C;

    /* renamed from: D */
    private static final C4896o1<Long> f14335D;

    /* renamed from: E */
    private static final C4896o1<Long> f14336E;

    /* renamed from: F */
    private static final C4896o1<Long> f14337F;

    /* renamed from: G */
    private static final C4896o1<Long> f14338G;

    /* renamed from: H */
    private static final C4896o1<Long> f14339H;

    /* renamed from: I */
    private static final C4896o1<String> f14340I;

    /* renamed from: J */
    private static final C4896o1<Long> f14341J;

    /* renamed from: a */
    private static final C4896o1<Long> f14342a;

    /* renamed from: b */
    private static final C4896o1<Long> f14343b;

    /* renamed from: c */
    private static final C4896o1<String> f14344c;

    /* renamed from: d */
    private static final C4896o1<String> f14345d;

    /* renamed from: e */
    private static final C4896o1<String> f14346e;

    /* renamed from: f */
    private static final C4896o1<Long> f14347f;

    /* renamed from: g */
    private static final C4896o1<Long> f14348g;

    /* renamed from: h */
    private static final C4896o1<Long> f14349h;

    /* renamed from: i */
    private static final C4896o1<Long> f14350i;

    /* renamed from: j */
    private static final C4896o1<Long> f14351j;

    /* renamed from: k */
    private static final C4896o1<Long> f14352k;

    /* renamed from: l */
    private static final C4896o1<Long> f14353l;

    /* renamed from: m */
    private static final C4896o1<Long> f14354m;

    /* renamed from: n */
    private static final C4896o1<Long> f14355n;

    /* renamed from: o */
    private static final C4896o1<Long> f14356o;

    /* renamed from: p */
    private static final C4896o1<Long> f14357p;

    /* renamed from: q */
    private static final C4896o1<Long> f14358q;

    /* renamed from: r */
    private static final C4896o1<String> f14359r;

    /* renamed from: s */
    private static final C4896o1<Long> f14360s;

    /* renamed from: t */
    private static final C4896o1<Long> f14361t;

    /* renamed from: u */
    private static final C4896o1<Long> f14362u;

    /* renamed from: v */
    private static final C4896o1<Long> f14363v;

    /* renamed from: w */
    private static final C4896o1<Long> f14364w;

    /* renamed from: x */
    private static final C4896o1<Long> f14365x;

    /* renamed from: y */
    private static final C4896o1<Long> f14366y;

    /* renamed from: z */
    private static final C4896o1<Long> f14367z;

    static {
        C5003u1 u1Var = new C5003u1(C4909p1.m20916a("com.google.android.gms.measurement"));
        f14342a = u1Var.mo19700a("measurement.ad_id_cache_time", 10000);
        f14343b = u1Var.mo19700a("measurement.config.cache_time", 86400000);
        f14344c = u1Var.mo19701a("measurement.log_tag", "FA");
        f14345d = u1Var.mo19701a("measurement.config.url_authority", "app-measurement.com");
        f14346e = u1Var.mo19701a("measurement.config.url_scheme", UriUtil.HTTPS_SCHEME);
        f14347f = u1Var.mo19700a("measurement.upload.debug_upload_interval", 1000);
        f14348g = u1Var.mo19700a("measurement.lifetimevalue.max_currency_tracked", 4);
        f14349h = u1Var.mo19700a("measurement.store.max_stored_events_per_app", 100000);
        f14350i = u1Var.mo19700a("measurement.experiment.max_ids", 50);
        f14351j = u1Var.mo19700a("measurement.audience.filter_result_max_count", 200);
        f14352k = u1Var.mo19700a("measurement.alarm_manager.minimum_interval", 60000);
        f14353l = u1Var.mo19700a("measurement.upload.minimum_delay", 500);
        f14354m = u1Var.mo19700a("measurement.monitoring.sample_period_millis", 86400000);
        f14355n = u1Var.mo19700a("measurement.upload.realtime_upload_interval", 10000);
        f14356o = u1Var.mo19700a("measurement.upload.refresh_blacklisted_config_interval", 604800000);
        f14357p = u1Var.mo19700a("measurement.config.cache_time.service", 3600000);
        f14358q = u1Var.mo19700a("measurement.service_client.idle_disconnect_millis", 5000);
        f14359r = u1Var.mo19701a("measurement.log_tag.service", "FA-SVC");
        f14360s = u1Var.mo19700a("measurement.upload.stale_data_deletion_interval", 86400000);
        f14361t = u1Var.mo19700a("measurement.upload.backoff_period", 43200000);
        f14362u = u1Var.mo19700a("measurement.upload.initial_upload_delay_time", 15000);
        f14363v = u1Var.mo19700a("measurement.upload.interval", 3600000);
        f14364w = u1Var.mo19700a("measurement.upload.max_bundle_size", (long) PlaybackStateCompat.f479n0);
        f14365x = u1Var.mo19700a("measurement.upload.max_bundles", 100);
        f14366y = u1Var.mo19700a("measurement.upload.max_conversions_per_day", 500);
        f14367z = u1Var.mo19700a("measurement.upload.max_error_events_per_day", 1000);
        f14332A = u1Var.mo19700a("measurement.upload.max_events_per_bundle", 1000);
        f14333B = u1Var.mo19700a("measurement.upload.max_events_per_day", 100000);
        f14334C = u1Var.mo19700a("measurement.upload.max_public_events_per_day", 50000);
        f14335D = u1Var.mo19700a("measurement.upload.max_queue_time", 2419200000L);
        f14336E = u1Var.mo19700a("measurement.upload.max_realtime_events_per_day", 10);
        f14337F = u1Var.mo19700a("measurement.upload.max_batch_size", (long) PlaybackStateCompat.f479n0);
        f14338G = u1Var.mo19700a("measurement.upload.retry_count", 6);
        f14339H = u1Var.mo19700a("measurement.upload.retry_time", (long) C2876e.f10139p);
        f14340I = u1Var.mo19701a("measurement.upload.url", "https://app-measurement.com/a");
        f14341J = u1Var.mo19700a("measurement.upload.window_interval", 3600000);
    }

    /* renamed from: A */
    public final long mo19312A() {
        return ((Long) f14338G.mo19353b()).longValue();
    }

    /* renamed from: B */
    public final long mo19313B() {
        return ((Long) f14362u.mo19353b()).longValue();
    }

    /* renamed from: C */
    public final long mo19314C() {
        return ((Long) f14333B.mo19353b()).longValue();
    }

    /* renamed from: F */
    public final long mo19315F() {
        return ((Long) f14361t.mo19353b()).longValue();
    }

    /* renamed from: G */
    public final long mo19316G() {
        return ((Long) f14339H.mo19353b()).longValue();
    }

    /* renamed from: H */
    public final long mo19317H() {
        return ((Long) f14336E.mo19353b()).longValue();
    }

    /* renamed from: I */
    public final long mo19318I() {
        return ((Long) f14337F.mo19353b()).longValue();
    }

    /* renamed from: N */
    public final String mo19319N() {
        return (String) f14340I.mo19353b();
    }

    /* renamed from: a */
    public final long mo19320a() {
        return ((Long) f14342a.mo19353b()).longValue();
    }

    /* renamed from: b */
    public final long mo19321b() {
        return ((Long) f14350i.mo19353b()).longValue();
    }

    /* renamed from: c */
    public final long mo19322c() {
        return ((Long) f14358q.mo19353b()).longValue();
    }

    /* renamed from: d */
    public final String mo19323d() {
        return (String) f14359r.mo19353b();
    }

    /* renamed from: e */
    public final long mo19324e() {
        return ((Long) f14355n.mo19353b()).longValue();
    }

    /* renamed from: f */
    public final long mo19325f() {
        return ((Long) f14351j.mo19353b()).longValue();
    }

    /* renamed from: g */
    public final long mo19326g() {
        return ((Long) f14354m.mo19353b()).longValue();
    }

    /* renamed from: h */
    public final long mo19327h() {
        return ((Long) f14349h.mo19353b()).longValue();
    }

    /* renamed from: i */
    public final long mo19328i() {
        return ((Long) f14343b.mo19353b()).longValue();
    }

    /* renamed from: j */
    public final long mo19329j() {
        return ((Long) f14363v.mo19353b()).longValue();
    }

    /* renamed from: k */
    public final long mo19330k() {
        return ((Long) f14347f.mo19353b()).longValue();
    }

    /* renamed from: l */
    public final String mo19331l() {
        return (String) f14344c.mo19353b();
    }

    /* renamed from: m */
    public final long mo19332m() {
        return ((Long) f14357p.mo19353b()).longValue();
    }

    /* renamed from: n */
    public final long mo19333n() {
        return ((Long) f14356o.mo19353b()).longValue();
    }

    /* renamed from: o */
    public final long mo19334o() {
        return ((Long) f14348g.mo19353b()).longValue();
    }

    /* renamed from: p */
    public final long mo19335p() {
        return ((Long) f14353l.mo19353b()).longValue();
    }

    /* renamed from: q */
    public final long mo19336q() {
        return ((Long) f14360s.mo19353b()).longValue();
    }

    /* renamed from: r */
    public final long mo19337r() {
        return ((Long) f14366y.mo19353b()).longValue();
    }

    /* renamed from: s */
    public final long mo19338s() {
        return ((Long) f14367z.mo19353b()).longValue();
    }

    /* renamed from: t */
    public final long mo19339t() {
        return ((Long) f14364w.mo19353b()).longValue();
    }

    /* renamed from: u */
    public final long mo19340u() {
        return ((Long) f14365x.mo19353b()).longValue();
    }

    /* renamed from: v */
    public final long mo19341v() {
        return ((Long) f14334C.mo19353b()).longValue();
    }

    /* renamed from: w */
    public final long mo19342w() {
        return ((Long) f14352k.mo19353b()).longValue();
    }

    /* renamed from: x */
    public final long mo19343x() {
        return ((Long) f14335D.mo19353b()).longValue();
    }

    /* renamed from: y */
    public final long mo19344y() {
        return ((Long) f14341J.mo19353b()).longValue();
    }

    /* renamed from: z */
    public final long mo19345z() {
        return ((Long) f14332A.mo19353b()).longValue();
    }

    public final String zzd() {
        return (String) f14345d.mo19353b();
    }

    public final String zze() {
        return (String) f14346e.mo19353b();
    }
}
