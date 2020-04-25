package com.instabug.library;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import com.instabug.library.C9794d.C9796b;
import com.instabug.library.Feature.State;
import com.instabug.library.InstabugCustomTextPlaceHolder.Key;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent.Feature;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventPublisher;
import com.instabug.library.internal.module.InstabugLocale;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.BugEntry;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.invocation.InvocationSettings;
import com.instabug.library.network.Request.Callbacks;
import com.instabug.library.network.p394a.C9958a;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.c */
/* compiled from: InstabugFeaturesManager */
public class C9780c {

    /* renamed from: c */
    private static final Object f25948c = new Object();

    /* renamed from: d */
    private static volatile C9780c f25949d;

    /* renamed from: e */
    static final State f25950e = State.ENABLED;

    /* renamed from: f */
    private static transient /* synthetic */ boolean[] f25951f;

    /* renamed from: a */
    private ConcurrentHashMap<Feature, State> f25952a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private ConcurrentHashMap<Feature, Boolean> f25953b;

    /* renamed from: com.instabug.library.c$a */
    /* compiled from: InstabugFeaturesManager */
    class C9781a implements Runnable {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f25954N;

        /* renamed from: a */
        final /* synthetic */ Context f25955a;

        /* renamed from: b */
        final /* synthetic */ C9780c f25956b;

        C9781a(C9780c cVar, Context context) {
            boolean[] a = m45643a();
            this.f25956b = cVar;
            this.f25955a = context;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45643a() {
            boolean[] zArr = f25954N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(1649867715450668913L, "com/instabug/library/InstabugFeaturesManager$1", 21);
            f25954N = a;
            return a;
        }

        public void run() {
            String str;
            String str2;
            boolean[] a = m45643a();
            Context context = this.f25955a;
            a[1] = true;
            SharedPreferences sharedPreferences = context.getSharedPreferences(SettingsManager.INSTABUG_SHARED_PREF_NAME, 0);
            a[2] = true;
            Editor edit = sharedPreferences.edit();
            a[3] = true;
            Iterator it = C9780c.m45628a(this.f25956b).keySet().iterator();
            a[4] = true;
            while (true) {
                str = " to shared preferences";
                str2 = "Saved feature ";
                if (!it.hasNext()) {
                    break;
                }
                Feature feature = (Feature) it.next();
                a[5] = true;
                StringBuilder sb = new StringBuilder();
                sb.append(feature.name());
                sb.append("AVAIL");
                String sb2 = sb.toString();
                ConcurrentHashMap a2 = C9780c.m45628a(this.f25956b);
                a[6] = true;
                boolean booleanValue = ((Boolean) a2.get(feature)).booleanValue();
                a[7] = true;
                edit.putBoolean(sb2, booleanValue);
                a[8] = true;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                sb3.append(feature);
                sb3.append(" availability ");
                C9780c cVar = this.f25956b;
                a[9] = true;
                sb3.append(C9780c.m45628a(cVar).get(feature));
                sb3.append(str);
                String sb4 = sb3.toString();
                a[10] = true;
                InstabugSDKLogger.m46622d(this, sb4);
                a[11] = true;
            }
            a[12] = true;
            for (Feature feature2 : C9780c.m45632b(this.f25956b).keySet()) {
                a[13] = true;
                StringBuilder sb5 = new StringBuilder();
                sb5.append(feature2.name());
                sb5.append("STATE");
                String sb6 = sb5.toString();
                State state = (State) C9780c.m45632b(this.f25956b).get(feature2);
                a[14] = true;
                String name = state.name();
                a[15] = true;
                edit.putString(sb6, name);
                a[16] = true;
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str2);
                sb7.append(feature2);
                sb7.append(" state ");
                C9780c cVar2 = this.f25956b;
                a[17] = true;
                sb7.append(C9780c.m45632b(cVar2).get(feature2));
                sb7.append(str);
                String sb8 = sb7.toString();
                a[18] = true;
                InstabugSDKLogger.m46622d(this, sb8);
                a[19] = true;
            }
            edit.apply();
            a[20] = true;
        }
    }

    /* renamed from: com.instabug.library.c$b */
    /* compiled from: InstabugFeaturesManager */
    class C9782b implements Runnable {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f25957N;

        /* renamed from: a */
        final /* synthetic */ Context f25958a;

        /* renamed from: b */
        final /* synthetic */ C9780c f25959b;

        C9782b(C9780c cVar, Context context) {
            boolean[] a = m45644a();
            this.f25959b = cVar;
            this.f25958a = context;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45644a() {
            boolean[] zArr = f25957N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7736054620100335078L, "com/instabug/library/InstabugFeaturesManager$2", 35);
            f25957N = a;
            return a;
        }

        public void run() {
            boolean[] a = m45644a();
            Context context = this.f25958a;
            a[1] = true;
            int i = 0;
            SharedPreferences sharedPreferences = context.getSharedPreferences(SettingsManager.INSTABUG_SHARED_PREF_NAME, 0);
            a[2] = true;
            StringBuilder sb = new StringBuilder();
            sb.append(Feature.VP_CUSTOMIZATION.name());
            String str = "AVAIL";
            sb.append(str);
            if (!sharedPreferences.contains(sb.toString())) {
                a[3] = true;
                C9780c.m45630a(this.f25959b, 0, this.f25958a);
                a[4] = true;
                this.f25959b.mo34871c(this.f25958a);
                a[5] = true;
                return;
            }
            Feature[] values = Feature.values();
            int length = values.length;
            a[6] = true;
            while (i < length) {
                Feature feature = values[i];
                a[7] = true;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(feature.name());
                sb2.append(str);
                String sb3 = sb2.toString();
                a[8] = true;
                StringBuilder sb4 = new StringBuilder();
                a[9] = true;
                sb4.append(feature.name());
                sb4.append(str);
                String sb5 = sb4.toString();
                a[10] = true;
                boolean z = sharedPreferences.getBoolean(sb5, true);
                a[11] = true;
                String str2 = " from shared preferences";
                String str3 = "Restored feature ";
                String str4 = "Not restoring feature ";
                if (sharedPreferences.contains(sb3)) {
                    a[12] = true;
                    C9780c.m45628a(this.f25959b).put(feature, Boolean.valueOf(z));
                    a[13] = true;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Feature ");
                    sb6.append(feature);
                    sb6.append(" saved availability ");
                    sb6.append(z);
                    sb6.append(" restored from shared preferences");
                    InstabugSDKLogger.m46622d(this, sb6.toString());
                    a[14] = true;
                } else if (!C9780c.m45628a(this.f25959b).containsKey(feature)) {
                    a[15] = true;
                    C9780c.m45628a(this.f25959b).putIfAbsent(feature, Boolean.valueOf(z));
                    a[16] = true;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(str3);
                    sb7.append(feature);
                    sb7.append(" availability ");
                    sb7.append(z);
                    sb7.append(str2);
                    InstabugSDKLogger.m46622d(this, sb7.toString());
                    a[17] = true;
                } else {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(str4);
                    sb8.append(feature);
                    sb8.append(" availability as it's already set to ");
                    C9780c cVar = this.f25959b;
                    a[18] = true;
                    ConcurrentHashMap a2 = C9780c.m45628a(cVar);
                    a[19] = true;
                    sb8.append(a2.get(feature));
                    String sb9 = sb8.toString();
                    a[20] = true;
                    InstabugSDKLogger.m46622d(this, sb9);
                    a[21] = true;
                }
                if (!C9780c.m45632b(this.f25959b).containsKey(feature)) {
                    a[22] = true;
                    StringBuilder sb10 = new StringBuilder();
                    a[23] = true;
                    sb10.append(feature.name());
                    sb10.append("STATE");
                    String sb11 = sb10.toString();
                    State state = C9780c.f25950e;
                    a[24] = true;
                    String name = state.name();
                    a[25] = true;
                    String string = sharedPreferences.getString(sb11, name);
                    a[26] = true;
                    State valueOf = State.valueOf(string);
                    a[27] = true;
                    C9780c.m45632b(this.f25959b).putIfAbsent(feature, valueOf);
                    a[28] = true;
                    StringBuilder sb12 = new StringBuilder();
                    sb12.append(str3);
                    sb12.append(feature);
                    sb12.append(" state ");
                    sb12.append(valueOf);
                    sb12.append(str2);
                    InstabugSDKLogger.m46622d(this, sb12.toString());
                    a[29] = true;
                } else {
                    StringBuilder sb13 = new StringBuilder();
                    sb13.append(str4);
                    sb13.append(feature);
                    sb13.append(" state as it's already set to ");
                    C9780c cVar2 = this.f25959b;
                    a[30] = true;
                    sb13.append(C9780c.m45632b(cVar2).get(feature));
                    String sb14 = sb13.toString();
                    a[31] = true;
                    InstabugSDKLogger.m46622d(this, sb14);
                    a[32] = true;
                }
                i++;
                a[33] = true;
            }
            a[34] = true;
        }
    }

    /* renamed from: com.instabug.library.c$c */
    /* compiled from: InstabugFeaturesManager */
    class C9783c implements Callbacks<String, Throwable> {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f25960c;

        /* renamed from: a */
        final /* synthetic */ Context f25961a;

        /* renamed from: b */
        final /* synthetic */ C9780c f25962b;

        C9783c(C9780c cVar, Context context) {
            boolean[] a = m45645a();
            this.f25962b = cVar;
            this.f25961a = context;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45645a() {
            boolean[] zArr = f25960c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(2688257373702092441L, "com/instabug/library/InstabugFeaturesManager$3", 45);
            f25960c = a;
            return a;
        }

        /* renamed from: a */
        public void mo34874a(String str) {
            Class<C9780c> cls = C9780c.class;
            boolean[] a = m45645a();
            try {
                C9780c.m45630a(this.f25962b, System.currentTimeMillis(), this.f25961a);
                a[1] = true;
                InstabugSDKLogger.m46622d(cls, "Features fetched successfully");
                a[2] = true;
                JSONObject jSONObject = new JSONObject(str);
                a[3] = true;
                boolean optBoolean = jSONObject.optBoolean("crash_reporting", true);
                a[4] = true;
                this.f25962b.mo34866a(Feature.CRASH_REPORTING, optBoolean);
                a[5] = true;
                boolean optBoolean2 = jSONObject.optBoolean("push_notifications", true);
                a[6] = true;
                this.f25962b.mo34866a(Feature.PUSH_NOTIFICATION, optBoolean2);
                a[7] = true;
                boolean optBoolean3 = jSONObject.optBoolean("white_label", true);
                a[8] = true;
                this.f25962b.mo34866a(Feature.WHITE_LABELING, optBoolean3);
                a[9] = true;
                boolean optBoolean4 = jSONObject.optBoolean("in_app_messaging", true);
                a[10] = true;
                this.f25962b.mo34866a(Feature.IN_APP_MESSAGING, optBoolean4);
                a[11] = true;
                boolean optBoolean5 = jSONObject.optBoolean("multiple_attachments", true);
                a[12] = true;
                this.f25962b.mo34866a(Feature.MULTIPLE_ATTACHMENTS, optBoolean5);
                String str2 = com.instabug.library.model.State.KEY_USER_STEPS;
                a[13] = true;
                boolean optBoolean6 = jSONObject.optBoolean(str2, true);
                a[14] = true;
                this.f25962b.mo34866a(Feature.TRACK_USER_STEPS, optBoolean6);
                a[15] = true;
                boolean optBoolean7 = jSONObject.optBoolean("repro_steps", true);
                a[16] = true;
                this.f25962b.mo34866a(Feature.REPRO_STEPS, optBoolean7);
                String str3 = com.instabug.library.model.State.KEY_CONSOLE_LOG;
                a[17] = true;
                boolean optBoolean8 = jSONObject.optBoolean(str3, true);
                a[18] = true;
                this.f25962b.mo34866a(Feature.CONSOLE_LOGS, optBoolean8);
                a[19] = true;
                boolean optBoolean9 = jSONObject.optBoolean("ibg_log", true);
                a[20] = true;
                this.f25962b.mo34866a(Feature.INSTABUG_LOGS, optBoolean9);
                a[21] = true;
                boolean optBoolean10 = jSONObject.optBoolean(com.instabug.library.model.State.KEY_USER_DATA, true);
                a[22] = true;
                this.f25962b.mo34866a(Feature.USER_DATA, optBoolean10);
                a[23] = true;
                boolean optBoolean11 = jSONObject.optBoolean("surveys", true);
                a[24] = true;
                this.f25962b.mo34866a(Feature.SURVEYS, optBoolean11);
                String str4 = BugEntry.COLUMN_VIEW_HIERARCHY;
                a[25] = true;
                boolean optBoolean12 = jSONObject.optBoolean(str4, true);
                a[26] = true;
                this.f25962b.mo34866a(Feature.VIEW_HIERARCHY, optBoolean12);
                a[27] = true;
                boolean optBoolean13 = jSONObject.optBoolean("user_events", true);
                a[28] = true;
                this.f25962b.mo34866a(Feature.USER_EVENTS, optBoolean13);
                a[29] = true;
                boolean optBoolean14 = jSONObject.optBoolean("disclaimer_text", false);
                a[30] = true;
                this.f25962b.mo34866a(Feature.DISCLAIMER, optBoolean14);
                a[31] = true;
                boolean optBoolean15 = jSONObject.optBoolean(com.instabug.library.model.State.KEY_SESSIONS_PROFILER, true);
                a[32] = true;
                this.f25962b.mo34866a(Feature.SESSION_PROFILER, optBoolean15);
                a[33] = true;
                boolean optBoolean16 = jSONObject.optBoolean("feature_requests", true);
                a[34] = true;
                this.f25962b.mo34866a(Feature.FEATURE_REQUESTS, optBoolean16);
                a[35] = true;
                boolean optBoolean17 = jSONObject.optBoolean("vp_customizations", false);
                a[36] = true;
                this.f25962b.mo34866a(Feature.VP_CUSTOMIZATION, optBoolean17);
                a[37] = true;
                SDKCoreEventPublisher.post(new SDKCoreEvent("features", Feature.VALUE_FETCHED));
                a[38] = true;
            } catch (JSONException e) {
                a[39] = true;
                InstabugSDKLogger.m46624e(cls, "Something went wrong while parsing fetching features request's response", e);
                a[40] = true;
            }
            a[41] = true;
        }

        public /* synthetic */ void onFailed(Object obj) {
            boolean[] a = m45645a();
            mo34875a((Throwable) obj);
            a[43] = true;
        }

        public /* synthetic */ void onSucceeded(Object obj) {
            boolean[] a = m45645a();
            mo34874a((String) obj);
            a[44] = true;
        }

        /* renamed from: a */
        public void mo34875a(Throwable th) {
            boolean[] a = m45645a();
            InstabugSDKLogger.m46624e(C9780c.class, "Something went wrong while do fetching features request", th);
            a[42] = true;
        }
    }

    /* renamed from: com.instabug.library.c$d */
    /* compiled from: Customizations */
    public class C9784d {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f25963a;

        /* renamed from: com.instabug.library.c$d$a */
        /* compiled from: Customizations */
        static class C9785a implements Runnable {

            /* renamed from: a */
            private static transient /* synthetic */ boolean[] f25964a;

            C9785a() {
                m45650a()[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m45650a() {
                boolean[] zArr = f25964a;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-6194013583393867621L, "com/instabug/library/customizations/Customizations$1", 22);
                f25964a = a;
                return a;
            }

            public void run() {
                boolean[] a = m45650a();
                String code = InstabugLocale.FRENCH.getCode();
                InstabugLocale instabugLocale = InstabugLocale.FRENCH;
                a[1] = true;
                Locale locale = new Locale(code, instabugLocale.getCountry());
                a[2] = true;
                Instabug.setLocale(locale);
                a[3] = true;
                InstabugCustomTextPlaceHolder instabugCustomTextPlaceHolder = new InstabugCustomTextPlaceHolder();
                a[4] = true;
                instabugCustomTextPlaceHolder.set(Key.INVALID_COMMENT_MESSAGE, "Hey, écrivez-nous un message pour nous aider.");
                a[5] = true;
                instabugCustomTextPlaceHolder.set(Key.INVALID_EMAIL_MESSAGE, "Oups ! L’email est invalide !, Retentez votre chance.");
                a[6] = true;
                instabugCustomTextPlaceHolder.set(Key.REPORT_SUCCESSFULLY_SENT, "C’est dans la boîte !\nGrâce à vous, notre application s’améliore !");
                a[7] = true;
                instabugCustomTextPlaceHolder.set(Key.INVOCATION_HEADER, "Bonjour ! Que souhaitez-vous faire?");
                a[8] = true;
                instabugCustomTextPlaceHolder.set(Key.FEEDBACK_REPORT_HEADER, "J’ai une super idée !");
                a[9] = true;
                instabugCustomTextPlaceHolder.set(Key.BUG_REPORT_HEADER, "J’ai trouvé un bug !");
                a[10] = true;
                instabugCustomTextPlaceHolder.set(Key.EMAIL_FIELD_HINT, "Saisissez votre adresse e-mail");
                a[11] = true;
                instabugCustomTextPlaceHolder.set(Key.COMMENT_FIELD_HINT_FOR_BUG_REPORT, "Décrivez le bug rencontré en quelques mots. On met les débuggers sur le coup !");
                a[12] = true;
                instabugCustomTextPlaceHolder.set(Key.COMMENT_FIELD_HINT_FOR_FEEDBACK, "Décrivez votre super idée en quelques mots. On met les développeurs sur le coup !");
                a[13] = true;
                SettingsManager.getInstance().setCustomPlaceHolders(instabugCustomTextPlaceHolder);
                a[14] = true;
                C9796b.m45692e(true);
                a[15] = true;
                InvocationSettings currentInvocationSettings = InvocationManager.getInstance().getCurrentInvocationSettings();
                a[16] = true;
                currentInvocationSettings.enabledPromptOption(1);
                a[17] = true;
                currentInvocationSettings.enabledPromptOption(2);
                a[18] = true;
                currentInvocationSettings.disabledPromptOption(4);
                a[19] = true;
                int parseColor = Color.parseColor("#DB2B6E");
                a[20] = true;
                Instabug.setPrimaryColor(parseColor);
                a[21] = true;
            }
        }

        /* renamed from: a */
        public static void m45648a() {
            boolean[] b = m45649b();
            Handler handler = new Handler(Looper.getMainLooper());
            b[1] = true;
            handler.post(new C9785a());
            b[2] = true;
        }

        /* renamed from: b */
        private static /* synthetic */ boolean[] m45649b() {
            boolean[] zArr = f25963a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(2224053620664772076L, "com/instabug/library/customizations/Customizations", 3);
            f25963a = a;
            return a;
        }
    }

    static {
        boolean[] c = m45633c();
        c[66] = true;
    }

    private C9780c() {
        boolean[] c = m45633c();
        c[8] = true;
        c[9] = true;
        this.f25953b = new ConcurrentHashMap<>();
        c[10] = true;
    }

    /* renamed from: a */
    static /* synthetic */ ConcurrentHashMap m45628a(C9780c cVar) {
        boolean[] c = m45633c();
        ConcurrentHashMap<Feature, Boolean> concurrentHashMap = cVar.f25953b;
        c[63] = true;
        return concurrentHashMap;
    }

    /* renamed from: b */
    static /* synthetic */ ConcurrentHashMap m45632b(C9780c cVar) {
        boolean[] c = m45633c();
        ConcurrentHashMap<Feature, State> concurrentHashMap = cVar.f25952a;
        c[64] = true;
        return concurrentHashMap;
    }

    /* renamed from: c */
    private static /* synthetic */ boolean[] m45633c() {
        boolean[] zArr = f25951f;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1400814017463733918L, "com/instabug/library/InstabugFeaturesManager", 67);
        f25951f = a;
        return a;
    }

    /* renamed from: d */
    private long m45634d(Context context) {
        boolean[] c = m45633c();
        SharedPreferences sharedPreferences = context.getSharedPreferences(SettingsManager.INSTABUG_SHARED_PREF_NAME, 0);
        c[59] = true;
        long j = sharedPreferences.getLong("LAST_FETCHED_AT", 0);
        c[60] = true;
        return j;
    }

    /* renamed from: c */
    public synchronized void mo34871c(Context context) {
        boolean[] c = m45633c();
        try {
            if (System.currentTimeMillis() - m45634d(context) <= 86400000) {
                c[51] = true;
            } else {
                c[52] = true;
                InstabugSDKLogger.m46622d(this, "lLast fetched at is more than 24h, retrieve it again");
                c[53] = true;
                C9958a.m46335a().mo35560a(context, new C9783c(this, context));
                c[54] = true;
            }
            c[55] = true;
        } catch (JSONException e) {
            c[56] = true;
            InstabugSDKLogger.m46624e(C9780c.class, "Something went wrong while do fetching features request", e);
            c[57] = true;
        }
        c[58] = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m45630a(C9780c cVar, long j, Context context) {
        boolean[] c = m45633c();
        cVar.m45629a(j, context);
        c[65] = true;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static C9780c m45631b() {
        boolean[] c = m45633c();
        if (f25949d != null) {
            c[0] = true;
        } else {
            synchronized (f25948c) {
                try {
                    c[1] = true;
                    if (f25949d != null) {
                        c[2] = true;
                    } else {
                        c[3] = true;
                        f25949d = new C9780c();
                        c[4] = true;
                    }
                } catch (Throwable th) {
                    while (true) {
                        c[6] = true;
                        throw th;
                    }
                }
            }
            c[5] = true;
        }
        C9780c cVar = f25949d;
        c[7] = true;
        return cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34866a(Feature feature, boolean z) {
        boolean[] c = m45633c();
        if (!this.f25953b.containsKey(feature)) {
            c[11] = true;
        } else if (((Boolean) this.f25953b.get(feature)).booleanValue() != z) {
            c[12] = true;
        } else {
            c[13] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("Feature ");
            sb.append(feature);
            sb.append(" availability is already ");
            sb.append(z);
            sb.append(", ignoring");
            InstabugSDKLogger.m46622d(this, sb.toString());
            c[14] = true;
            c[17] = true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Setting feature ");
        sb2.append(feature);
        sb2.append(" availability to ");
        sb2.append(z);
        InstabugSDKLogger.m46622d(this, sb2.toString());
        c[15] = true;
        this.f25953b.put(feature, Boolean.valueOf(z));
        c[16] = true;
        c[17] = true;
    }

    /* renamed from: a */
    public boolean mo34868a(Feature feature) {
        boolean[] c = m45633c();
        String str = "Feature ";
        if (this.f25953b.containsKey(feature)) {
            c[18] = true;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(feature);
            sb.append(" availability is ");
            ConcurrentHashMap<Feature, Boolean> concurrentHashMap = this.f25953b;
            c[19] = true;
            sb.append(concurrentHashMap.get(feature));
            String sb2 = sb.toString();
            c[20] = true;
            InstabugSDKLogger.m46622d(this, sb2);
            c[21] = true;
            boolean booleanValue = ((Boolean) this.f25953b.get(feature)).booleanValue();
            c[22] = true;
            return booleanValue;
        } else if (feature == Feature.VP_CUSTOMIZATION) {
            c[23] = true;
            return false;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(feature);
            sb3.append(" availability not found, returning ");
            sb3.append(true);
            InstabugSDKLogger.m46622d(this, sb3.toString());
            c[24] = true;
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0086  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.instabug.library.Feature.State mo34869b(com.instabug.library.Feature r8) {
        /*
            r7 = this;
            boolean[] r0 = m45633c()
            boolean r1 = r7.mo34868a(r8)
            r2 = 1
            if (r1 != 0) goto L_0x0010
            r1 = 35
            r0[r1] = r2
            goto L_0x001c
        L_0x0010:
            com.instabug.library.Feature r1 = com.instabug.library.Feature.INSTABUG
            boolean r1 = r7.mo34868a(r1)
            if (r1 != 0) goto L_0x0022
            r1 = 36
            r0[r1] = r2
        L_0x001c:
            r1 = 0
            r3 = 38
            r0[r3] = r2
            goto L_0x0027
        L_0x0022:
            r1 = 37
            r0[r1] = r2
            r1 = 1
        L_0x0027:
            r3 = 39
            r0[r3] = r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Feature "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r5 = " isAvailable = "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r5 = ", and it's state is "
            r3.append(r5)
            java.util.concurrent.ConcurrentHashMap<com.instabug.library.Feature, com.instabug.library.Feature$State> r5 = r7.f25952a
            r6 = 40
            r0[r6] = r2
            java.lang.Object r5 = r5.get(r8)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r5 = 41
            r0[r5] = r2
            com.instabug.library.util.InstabugSDKLogger.m46622d(r7, r3)
            if (r1 != 0) goto L_0x0086
            r1 = 42
            r0[r1] = r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r8)
            java.lang.String r8 = " isn't available, returning "
            r1.append(r8)
            com.instabug.library.Feature$State r8 = com.instabug.library.Feature.State.DISABLED
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            com.instabug.library.util.InstabugSDKLogger.m46622d(r7, r8)
            com.instabug.library.Feature$State r8 = com.instabug.library.Feature.State.DISABLED
            r1 = 43
            r0[r1] = r2
            return r8
        L_0x0086:
            java.util.concurrent.ConcurrentHashMap<com.instabug.library.Feature, com.instabug.library.Feature$State> r1 = r7.f25952a
            boolean r1 = r1.containsKey(r8)
            if (r1 == 0) goto L_0x009f
            r1 = 44
            r0[r1] = r2
            java.util.concurrent.ConcurrentHashMap<com.instabug.library.Feature, com.instabug.library.Feature$State> r1 = r7.f25952a
            java.lang.Object r8 = r1.get(r8)
            com.instabug.library.Feature$State r8 = (com.instabug.library.Feature.State) r8
            r1 = 45
            r0[r1] = r2
            return r8
        L_0x009f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r8)
            java.lang.String r8 = " is available, but no specific state is set. Returning "
            r1.append(r8)
            com.instabug.library.Feature$State r8 = f25950e
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            com.instabug.library.util.InstabugSDKLogger.m46622d(r7, r8)
            com.instabug.library.Feature$State r8 = f25950e
            r1 = 46
            r0[r1] = r2
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.C9780c.mo34869b(com.instabug.library.Feature):com.instabug.library.Feature$State");
    }

    /* renamed from: a */
    public boolean mo34867a() {
        boolean z;
        boolean[] c = m45633c();
        if (m45634d(Instabug.getApplicationContext()) > 0) {
            c[25] = true;
            z = true;
        } else {
            z = false;
            c[26] = true;
        }
        c[27] = true;
        return z;
    }

    /* renamed from: a */
    public void mo34865a(Feature feature, State state) {
        boolean[] c = m45633c();
        if (!this.f25952a.containsKey(feature)) {
            c[28] = true;
        } else if (this.f25952a.get(feature) != state) {
            c[29] = true;
        } else {
            c[30] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("Feature ");
            sb.append(feature);
            sb.append(" state is already ");
            sb.append(state);
            sb.append(" ignoring");
            InstabugSDKLogger.m46622d(this, sb.toString());
            c[31] = true;
            c[34] = true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Setting ");
        sb2.append(feature);
        sb2.append(" state to ");
        sb2.append(state);
        InstabugSDKLogger.m46622d(this, sb2.toString());
        c[32] = true;
        this.f25952a.put(feature, state);
        c[33] = true;
        c[34] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo34870b(Context context) {
        boolean[] c = m45633c();
        Thread thread = new Thread(new C9782b(this, context));
        c[49] = true;
        thread.start();
        c[50] = true;
    }

    /* renamed from: a */
    public void mo34864a(Context context) {
        boolean[] c = m45633c();
        Thread thread = new Thread(new C9781a(this, context));
        c[47] = true;
        thread.start();
        c[48] = true;
    }

    /* renamed from: a */
    private void m45629a(long j, Context context) {
        boolean[] c = m45633c();
        SharedPreferences sharedPreferences = context.getSharedPreferences(SettingsManager.INSTABUG_SHARED_PREF_NAME, 0);
        c[61] = true;
        sharedPreferences.edit().putLong("LAST_FETCHED_AT", j).apply();
        c[62] = true;
    }
}
