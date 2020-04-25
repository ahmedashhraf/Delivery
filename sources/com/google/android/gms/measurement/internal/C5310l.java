package com.google.android.gms.measurement.internal;

import android.content.Context;
import androidx.annotation.C0195i0;
import com.amplitude.api.C2876e;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.common.C4282f;
import com.google.android.gms.common.C4284g;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.internal.measurement.C4890n8;
import com.google.android.gms.internal.measurement.C4909p1;
import com.google.android.gms.internal.measurement.C4962s9;
import com.google.android.gms.internal.measurement.C5068z0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@C4476d0
/* renamed from: com.google.android.gms.measurement.internal.l */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5310l {

    /* renamed from: A */
    public static C5226d3<Long> f15184A;

    /* renamed from: A0 */
    private static C5226d3<Boolean> f15185A0;

    /* renamed from: B */
    public static C5226d3<Long> f15186B;

    /* renamed from: B0 */
    public static C5226d3<Boolean> f15187B0;

    /* renamed from: C */
    public static C5226d3<Long> f15188C;

    /* renamed from: C0 */
    public static C5226d3<Boolean> f15189C0;

    /* renamed from: D */
    public static C5226d3<Long> f15190D;

    /* renamed from: D0 */
    public static C5226d3<Boolean> f15191D0;

    /* renamed from: E */
    public static C5226d3<Long> f15192E;

    /* renamed from: E0 */
    public static C5226d3<Boolean> f15193E0;

    /* renamed from: F */
    public static C5226d3<Long> f15194F;

    /* renamed from: F0 */
    public static C5226d3<Boolean> f15195F0;

    /* renamed from: G */
    public static C5226d3<Long> f15196G;

    /* renamed from: G0 */
    public static C5226d3<Boolean> f15197G0;

    /* renamed from: H */
    public static C5226d3<Long> f15198H;

    /* renamed from: H0 */
    public static C5226d3<Boolean> f15199H0;

    /* renamed from: I */
    public static C5226d3<Long> f15200I;

    /* renamed from: I0 */
    public static C5226d3<Boolean> f15201I0;

    /* renamed from: J */
    public static C5226d3<Integer> f15202J;

    /* renamed from: J0 */
    private static C5226d3<Boolean> f15203J0;

    /* renamed from: K */
    public static C5226d3<Long> f15204K;

    /* renamed from: K0 */
    public static C5226d3<Boolean> f15205K0;

    /* renamed from: L */
    public static C5226d3<Integer> f15206L;

    /* renamed from: L0 */
    public static C5226d3<Boolean> f15207L0;

    /* renamed from: M */
    public static C5226d3<Integer> f15208M;

    /* renamed from: M0 */
    public static C5226d3<Boolean> f15209M0;

    /* renamed from: N */
    public static C5226d3<Long> f15210N;

    /* renamed from: N0 */
    public static C5226d3<Boolean> f15211N0;

    /* renamed from: O */
    public static C5226d3<Boolean> f15212O;

    /* renamed from: O0 */
    public static C5226d3<Boolean> f15213O0;

    /* renamed from: P */
    public static C5226d3<String> f15214P;

    /* renamed from: P0 */
    public static C5226d3<Boolean> f15215P0;

    /* renamed from: Q */
    public static C5226d3<Long> f15216Q;

    /* renamed from: Q0 */
    public static C5226d3<Boolean> f15217Q0;

    /* renamed from: R */
    public static C5226d3<Integer> f15218R;

    /* renamed from: S */
    public static C5226d3<Double> f15219S;

    /* renamed from: T */
    public static C5226d3<Integer> f15220T;

    /* renamed from: U */
    public static C5226d3<Boolean> f15221U;

    /* renamed from: V */
    public static C5226d3<Boolean> f15222V;

    /* renamed from: W */
    public static C5226d3<Boolean> f15223W;

    /* renamed from: X */
    public static C5226d3<Boolean> f15224X;

    /* renamed from: Y */
    public static C5226d3<Boolean> f15225Y;

    /* renamed from: Z */
    public static C5226d3<Boolean> f15226Z;

    /* renamed from: a */
    static C5342n9 f15227a;

    /* renamed from: a0 */
    public static C5226d3<Boolean> f15228a0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static List<C5226d3<?>> f15229b = Collections.synchronizedList(new ArrayList());

    /* renamed from: b0 */
    public static C5226d3<Boolean> f15230b0;

    /* renamed from: c */
    private static Set<C5226d3<?>> f15231c = Collections.synchronizedSet(new HashSet());

    /* renamed from: c0 */
    public static C5226d3<Boolean> f15232c0;

    /* renamed from: d */
    private static volatile C5359p4 f15233d;

    /* renamed from: d0 */
    public static C5226d3<Boolean> f15234d0;
    @C4476d0

    /* renamed from: e */
    private static Boolean f15235e;

    /* renamed from: e0 */
    public static C5226d3<Boolean> f15236e0;

    /* renamed from: f */
    public static C5226d3<Boolean> f15237f;

    /* renamed from: f0 */
    public static C5226d3<Boolean> f15238f0;

    /* renamed from: g */
    public static C5226d3<Boolean> f15239g;

    /* renamed from: g0 */
    public static C5226d3<Boolean> f15240g0;

    /* renamed from: h */
    public static C5226d3<String> f15241h = m23125a("measurement.log_tag", "FA", "FA-SVC", C5431w.f15541a);

    /* renamed from: h0 */
    public static C5226d3<Boolean> f15242h0;

    /* renamed from: i */
    public static C5226d3<Long> f15243i;

    /* renamed from: i0 */
    public static C5226d3<Boolean> f15244i0;

    /* renamed from: j */
    public static C5226d3<Long> f15245j;

    /* renamed from: j0 */
    public static C5226d3<Boolean> f15246j0;

    /* renamed from: k */
    public static C5226d3<Long> f15247k;

    /* renamed from: k0 */
    public static C5226d3<Boolean> f15248k0;

    /* renamed from: l */
    public static C5226d3<String> f15249l;

    /* renamed from: l0 */
    public static C5226d3<Boolean> f15250l0;

    /* renamed from: m */
    public static C5226d3<String> f15251m;

    /* renamed from: m0 */
    public static C5226d3<Boolean> f15252m0;

    /* renamed from: n */
    public static C5226d3<Integer> f15253n;

    /* renamed from: n0 */
    public static C5226d3<Boolean> f15254n0;

    /* renamed from: o */
    public static C5226d3<Integer> f15255o;

    /* renamed from: o0 */
    public static C5226d3<Boolean> f15256o0;

    /* renamed from: p */
    public static C5226d3<Integer> f15257p;

    /* renamed from: p0 */
    public static C5226d3<Boolean> f15258p0;

    /* renamed from: q */
    public static C5226d3<Integer> f15259q;

    /* renamed from: q0 */
    public static C5226d3<Boolean> f15260q0;

    /* renamed from: r */
    public static C5226d3<Integer> f15261r;

    /* renamed from: r0 */
    public static C5226d3<Boolean> f15262r0;

    /* renamed from: s */
    public static C5226d3<Integer> f15263s;

    /* renamed from: s0 */
    public static C5226d3<Boolean> f15264s0;

    /* renamed from: t */
    public static C5226d3<Integer> f15265t;

    /* renamed from: t0 */
    public static C5226d3<Boolean> f15266t0;

    /* renamed from: u */
    public static C5226d3<Integer> f15267u;

    /* renamed from: u0 */
    public static C5226d3<Boolean> f15268u0;

    /* renamed from: v */
    public static C5226d3<Integer> f15269v;

    /* renamed from: v0 */
    public static C5226d3<Boolean> f15270v0;

    /* renamed from: w */
    public static C5226d3<Integer> f15271w;

    /* renamed from: w0 */
    public static C5226d3<Boolean> f15272w0;

    /* renamed from: x */
    public static C5226d3<String> f15273x;

    /* renamed from: x0 */
    public static C5226d3<Boolean> f15274x0;

    /* renamed from: y */
    public static C5226d3<Long> f15275y;

    /* renamed from: y0 */
    public static C5226d3<Boolean> f15276y0;

    /* renamed from: z */
    public static C5226d3<Long> f15277z;

    /* renamed from: z0 */
    public static C5226d3<Boolean> f15278z0;

    static {
        Boolean valueOf = Boolean.valueOf(false);
        f15237f = m23125a("measurement.log_androidId_enabled", valueOf, valueOf, C5299k.f15155a);
        f15239g = m23125a("measurement.upload_dsid_enabled", valueOf, valueOf, C5332n.f15325a);
        Long valueOf2 = Long.valueOf(10000);
        f15243i = m23125a("measurement.ad_id_cache_time", valueOf2, valueOf2, C5300k0.f15156a);
        Long valueOf3 = Long.valueOf(86400000);
        f15245j = m23125a("measurement.monitoring.sample_period_millis", valueOf3, valueOf3, C5399t0.f15476a);
        Long valueOf4 = Long.valueOf(3600000);
        f15247k = m23125a("measurement.config.cache_time", valueOf3, valueOf4, C5268h1.f15076a);
        C5466z2 z2Var = C5367q1.f15413a;
        String str = UriUtil.HTTPS_SCHEME;
        f15249l = m23125a("measurement.config.url_scheme", str, str, z2Var);
        String str2 = "app-measurement.com";
        f15251m = m23125a("measurement.config.url_authority", str2, str2, C5236e2.f14969a);
        Integer valueOf5 = Integer.valueOf(100);
        f15253n = m23125a("measurement.upload.max_bundles", valueOf5, valueOf5, C5335n2.f15328a);
        Integer valueOf6 = Integer.valueOf(65536);
        f15255o = m23125a("measurement.upload.max_batch_size", valueOf6, valueOf6, C5445x2.f15565a);
        f15257p = m23125a("measurement.upload.max_bundle_size", valueOf6, valueOf6, C5321m.f15291a);
        Integer valueOf7 = Integer.valueOf(1000);
        f15259q = m23125a("measurement.upload.max_events_per_bundle", valueOf7, valueOf7, C5354p.f15365a);
        Integer valueOf8 = Integer.valueOf(100000);
        f15261r = m23125a("measurement.upload.max_events_per_day", valueOf8, valueOf8, C5343o.f15351a);
        f15263s = m23125a("measurement.upload.max_error_events_per_day", valueOf7, valueOf7, C5376r.f15425a);
        Integer valueOf9 = Integer.valueOf(50000);
        f15265t = m23125a("measurement.upload.max_public_events_per_day", valueOf9, valueOf9, C5365q.f15411a);
        Integer valueOf10 = Integer.valueOf(500);
        f15267u = m23125a("measurement.upload.max_conversions_per_day", valueOf10, valueOf10, C5398t.f15475a);
        Integer valueOf11 = Integer.valueOf(10);
        f15269v = m23125a("measurement.upload.max_realtime_events_per_day", valueOf11, valueOf11, C5387s.f15442a);
        Integer valueOf12 = Integer.valueOf(100000);
        f15271w = m23125a("measurement.store.max_stored_events_per_app", valueOf12, valueOf12, C5420v.f15517a);
        String str3 = "https://app-measurement.com/a";
        f15273x = m23125a("measurement.upload.url", str3, str3, C5409u.f15498a);
        Long valueOf13 = Long.valueOf(43200000);
        f15275y = m23125a("measurement.upload.backoff_period", valueOf13, valueOf13, C5442x.f15562a);
        f15277z = m23125a("measurement.upload.window_interval", valueOf4, valueOf4, C5190a0.f14859a);
        f15184A = m23125a("measurement.upload.interval", valueOf4, valueOf4, C5452y.f15615a);
        f15186B = m23125a("measurement.upload.realtime_upload_interval", valueOf2, valueOf2, C5212c0.f14920a);
        Long valueOf14 = Long.valueOf(1000);
        f15188C = m23125a("measurement.upload.debug_upload_interval", valueOf14, valueOf14, C5201b0.f14887a);
        Long valueOf15 = Long.valueOf(500);
        f15190D = m23125a("measurement.upload.minimum_delay", valueOf15, valueOf15, C5234e0.f14967a);
        Long valueOf16 = Long.valueOf(60000);
        f15192E = m23125a("measurement.alarm_manager.minimum_interval", valueOf16, valueOf16, C5223d0.f14937a);
        f15194F = m23125a("measurement.upload.stale_data_deletion_interval", valueOf3, valueOf3, C5256g0.f15052a);
        Long valueOf17 = Long.valueOf(604800000);
        f15196G = m23125a("measurement.upload.refresh_blacklisted_config_interval", valueOf17, valueOf17, C5245f0.f15018a);
        Long valueOf18 = Long.valueOf(15000);
        f15198H = m23125a("measurement.upload.initial_upload_delay_time", valueOf18, valueOf18, C5278i0.f15114a);
        Long valueOf19 = Long.valueOf(C2876e.f10139p);
        f15200I = m23125a("measurement.upload.retry_time", valueOf19, valueOf19, C5267h0.f15075a);
        Integer valueOf20 = Integer.valueOf(6);
        f15202J = m23125a("measurement.upload.retry_count", valueOf20, valueOf20, C5289j0.f15136a);
        Long valueOf21 = Long.valueOf(2419200000L);
        f15204K = m23125a("measurement.upload.max_queue_time", valueOf21, valueOf21, C5322m0.f15292a);
        Integer valueOf22 = Integer.valueOf(4);
        f15206L = m23125a("measurement.lifetimevalue.max_currency_tracked", valueOf22, valueOf22, C5311l0.f15279a);
        Integer valueOf23 = Integer.valueOf(200);
        f15208M = m23125a("measurement.audience.filter_result_max_count", valueOf23, valueOf23, C5344o0.f15352a);
        Long valueOf24 = Long.valueOf(5000);
        f15210N = m23125a("measurement.service_client.idle_disconnect_millis", valueOf24, valueOf24, C5333n0.f15326a);
        f15212O = m23125a("measurement.test.boolean_flag", valueOf, valueOf, C5366q0.f15412a);
        String str4 = "---";
        f15214P = m23125a("measurement.test.string_flag", str4, str4, C5355p0.f15366a);
        Long valueOf25 = Long.valueOf(-1);
        f15216Q = m23125a("measurement.test.long_flag", valueOf25, valueOf25, C5388s0.f15443a);
        Integer valueOf26 = Integer.valueOf(-2);
        f15218R = m23125a("measurement.test.int_flag", valueOf26, valueOf26, C5377r0.f15426a);
        Double valueOf27 = Double.valueOf(-3.0d);
        f15219S = m23125a("measurement.test.double_flag", valueOf27, valueOf27, C5410u0.f15499a);
        Integer valueOf28 = Integer.valueOf(50);
        f15220T = m23125a("measurement.experiment.max_ids", valueOf28, valueOf28, C5432w0.f15542a);
        f15221U = m23125a("measurement.validation.internal_limits_internal_event_params", valueOf, valueOf, C5421v0.f15518a);
        f15222V = m23125a("measurement.reset_analytics.persist_time", valueOf, valueOf, C5453y0.f15616a);
        f15223W = m23125a("measurement.sampling.time_zone_offset_enabled", valueOf, valueOf, C5443x0.f15563a);
        f15224X = m23125a("measurement.referrer.enable_logging_install_referrer_cmp_from_apk", valueOf, valueOf, C5202b1.f14888a);
        f15225Y = m23125a("measurement.client.sessions.session_id_enabled", valueOf, valueOf, C5464z0.f15664a);
        Boolean valueOf29 = Boolean.valueOf(true);
        f15226Z = m23125a("measurement.service.sessions.session_number_enabled", valueOf29, valueOf29, C5224d1.f14938a);
        f15228a0 = m23125a("measurement.client.sessions.immediate_start_enabled_foreground", valueOf, valueOf, C5213c1.f14921a);
        f15230b0 = m23125a("measurement.client.sessions.background_sessions_enabled", valueOf, valueOf, C5246f1.f15019a);
        f15232c0 = m23125a("measurement.client.sessions.remove_expired_session_properties_enabled", valueOf, valueOf, C5235e1.f14968a);
        f15234d0 = m23125a("measurement.service.sessions.session_number_backfill_enabled", valueOf29, valueOf29, C5257g1.f15053a);
        f15236e0 = m23125a("measurement.service.sessions.remove_disabled_session_number", valueOf29, valueOf29, C5290j1.f15137a);
        f15238f0 = m23125a("measurement.collection.firebase_global_collection_flag_enabled", valueOf29, valueOf29, C5279i1.f15115a);
        f15240g0 = m23125a("measurement.collection.efficient_engagement_reporting_enabled", valueOf, valueOf, C5312l1.f15280a);
        f15242h0 = m23125a("measurement.collection.redundant_engagement_removal_enabled", valueOf, valueOf, C5301k1.f15157a);
        f15244i0 = m23125a("measurement.personalized_ads_signals_collection_enabled", valueOf29, valueOf29, C5334n1.f15327a);
        f15246j0 = m23125a("measurement.personalized_ads_property_translation_enabled", valueOf29, valueOf29, C5323m1.f15293a);
        f15248k0 = m23125a("measurement.collection.init_params_control_enabled", valueOf29, valueOf29, C5356p1.f15367a);
        f15250l0 = m23125a("measurement.upload.disable_is_uploader", valueOf29, valueOf29, C5345o1.f15353a);
        f15252m0 = m23125a("measurement.experiment.enable_experiment_reporting", valueOf29, valueOf29, C5378r1.f15427a);
        f15254n0 = m23125a("measurement.collection.log_event_and_bundle_v2", valueOf29, valueOf29, C5400t1.f15477a);
        f15256o0 = m23125a("measurement.quality.checksum", valueOf, valueOf, null);
        f15258p0 = m23125a("measurement.module.collection.conditionally_omit_admob_app_id", valueOf29, valueOf29, C5389s1.f15444a);
        f15260q0 = m23125a("measurement.sdk.dynamite.use_dynamite2", valueOf, valueOf, C5422v1.f15519a);
        f15262r0 = m23125a("measurement.sdk.dynamite.allow_remote_dynamite", valueOf, valueOf, C5411u1.f15500a);
        f15264s0 = m23125a("measurement.sdk.collection.validate_param_names_alphabetical", valueOf, valueOf, C5444x1.f15564a);
        f15266t0 = m23125a("measurement.collection.event_safelist", valueOf, valueOf, C5433w1.f15543a);
        f15268u0 = m23125a("measurement.service.audience.scoped_filters_v27", valueOf, valueOf, C5465z1.f15665a);
        f15270v0 = m23125a("measurement.service.audience.session_scoped_event_aggregates", valueOf, valueOf, C5454y1.f15617a);
        f15272w0 = m23125a("measurement.service.audience.session_scoped_user_engagement", valueOf, valueOf, C5214c2.f14922a);
        f15274x0 = m23125a("measurement.service.audience.remove_disabled_session_scoped_user_engagement", valueOf, valueOf, C5192a2.f14862a);
        f15276y0 = m23125a("measurement.service.audience.use_bundle_timestamp_for_property_filters", valueOf, valueOf, C5225d2.f14939a);
        f15278z0 = m23125a("measurement.service.audience.not_prepend_timestamps_for_sequence_session_scoped_filters", valueOf, valueOf, C5258g2.f15054a);
        f15185A0 = m23125a("measurement.service.audience.invalidate_config_cache_after_app_unisntall", valueOf, valueOf, C5247f2.f15020a);
        f15187B0 = m23125a("measurement.sdk.collection.retrieve_deeplink_from_bow", valueOf, valueOf, C5280i2.f15116a);
        f15189C0 = m23125a("measurement.app_launch.event_ordering_fix", valueOf, valueOf, C5269h2.f15077a);
        f15191D0 = m23125a("measurement.sdk.collection.last_deep_link_referrer", valueOf, valueOf, C5302k2.f15158a);
        f15193E0 = m23125a("measurement.sdk.collection.last_deep_link_referrer_campaign", valueOf, valueOf, C5291j2.f15138a);
        f15195F0 = m23125a("measurement.sdk.collection.last_gclid_from_referrer", valueOf, valueOf, C5324m2.f15294a);
        f15197G0 = m23125a("measurement.sdk.collection.worker_thread_referrer", valueOf29, valueOf29, C5313l2.f15281a);
        f15199H0 = m23125a("measurement.upload.file_lock_state_check", valueOf, valueOf, C5346o2.f15354a);
        f15201I0 = m23125a("measurement.sampling.calculate_bundle_timestamp_before_sampling", valueOf29, valueOf29, C5368q2.f15414a);
        f15203J0 = m23125a("measurement.ga.ga_app_id", valueOf, Boolean.valueOf(C4962s9.m21108b()), C5357p2.f15368a);
        f15205K0 = m23125a("measurement.lifecycle.app_backgrounded_tracking", valueOf, valueOf, C5390s2.f15445a);
        f15207L0 = m23125a("measurement.lifecycle.app_in_background_parameter", valueOf, valueOf, C5379r2.f15428a);
        f15209M0 = m23125a("measurement.integration.disable_firebase_instance_id", valueOf, valueOf, C5412u2.f15501a);
        f15211N0 = m23125a("measurement.lifecycle.app_backgrounded_engagement", valueOf, valueOf, C5401t2.f15478a);
        f15213O0 = m23125a("measurement.service.fix_gmp_version", valueOf, valueOf, C5434w2.f15544a);
        f15215P0 = m23125a("measurement.collection.service.update_with_analytics_fix", valueOf, valueOf, C5423v2.f15520a);
        f15217Q0 = m23125a("measurement.service.disable_install_state_reporting", valueOf, valueOf, C5455y2.f15618a);
    }

    /* renamed from: a */
    public static Map<String, String> m23127a(Context context) {
        C5068z0 a = C5068z0.m21858a(context.getContentResolver(), C4909p1.m20916a("com.google.android.gms.measurement"));
        return a == null ? Collections.emptyMap() : a.mo19756a();
    }

    /* renamed from: i0 */
    static final /* synthetic */ Long m23147i0() {
        long j;
        if (m23161p0()) {
            j = C4890n8.m20807B();
        } else {
            j = C4890n8.m20829n();
        }
        return Long.valueOf(j);
    }

    /* renamed from: l0 */
    static final /* synthetic */ String m23153l0() {
        return m23161p0() ? C4890n8.m20809D() : C4890n8.m20830o();
    }

    /* renamed from: p0 */
    private static boolean m23161p0() {
        if (f15227a != null) {
        }
        return false;
    }

    /* renamed from: a */
    static void m23129a(C5359p4 p4Var) {
        f15233d = p4Var;
    }

    @C4476d0
    /* renamed from: a */
    static void m23130a(Exception exc) {
        if (f15233d != null) {
            Context e = f15233d.mo21206e();
            if (f15235e == null) {
                f15235e = Boolean.valueOf(C4282f.m18511a().mo18094a(e, (int) C4284g.GOOGLE_PLAY_SERVICES_VERSION_CODE) == 0);
            }
            if (f15235e.booleanValue()) {
                f15233d.mo21205d().mo21533t().mo21550a("Got Exception on PhenotypeFlag.get on Play device", exc);
            }
        }
    }

    @C4476d0
    /* renamed from: a */
    private static <V> C5226d3<V> m23125a(@C0195i0 String str, @C0195i0 V v, @C0195i0 V v2, @C0195i0 C5466z2<V> z2Var) {
        C5226d3 d3Var = new C5226d3(str, v, v2, z2Var);
        f15229b.add(d3Var);
        return d3Var;
    }

    /* renamed from: a */
    static void m23128a(C5342n9 n9Var) {
        f15227a = n9Var;
    }
}
