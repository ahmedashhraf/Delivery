package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0203m0;
import androidx.annotation.C0210o0;
import androidx.annotation.C0226w0;
import androidx.annotation.Keep;
import androidx.collection.C0635a;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4312d0;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.measurement.internal.C5219c7;
import com.google.android.gms.measurement.internal.C5359p4;
import com.google.android.gms.measurement.internal.C5371q5;
import com.google.android.gms.measurement.internal.C5382r5;
import com.google.android.gms.measurement.internal.C5393s5;
import com.google.android.gms.measurement.internal.C5404t5;
import com.google.android.gms.measurement.internal.C5415u5;
import com.google.android.gms.measurement.internal.C5426v5;
import com.google.android.gms.measurement.internal.C5438w6;
import com.google.android.gms.measurement.internal.zzjx;
import com.google.android.gms.measurement.p174b.C5179a.C5180a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@C4056a
@C4312d0
@Deprecated
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public class AppMeasurement {
    @C4056a
    @C4312d0

    /* renamed from: d */
    public static final String f14817d = "crash";
    @C4056a
    @C4312d0

    /* renamed from: e */
    public static final String f14818e = "fcm";
    @C4056a
    @C4312d0

    /* renamed from: f */
    public static final String f14819f = "fiam";

    /* renamed from: g */
    private static volatile AppMeasurement f14820g;

    /* renamed from: a */
    private final C5359p4 f14821a;

    /* renamed from: b */
    private final C5438w6 f14822b;

    /* renamed from: c */
    private final boolean f14823c;

    @C4056a
    @C4312d0
    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
    public static class ConditionalUserProperty {
        @C4056a
        @C4312d0
        @Keep
        public boolean mActive;
        @C4056a
        @C4312d0
        @Keep
        public String mAppId;
        @C4056a
        @C4312d0
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @C4056a
        @C4312d0
        @Keep
        public String mName;
        @C4056a
        @C4312d0
        @Keep
        public String mOrigin;
        @C4056a
        @C4312d0
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @C4056a
        @C4312d0
        @Keep
        public String mTriggerEventName;
        @C4056a
        @C4312d0
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @C4056a
        @C4312d0
        @Keep
        public long mTriggeredTimestamp;
        @C4056a
        @C4312d0
        @Keep
        public Object mValue;

        @C4056a
        public ConditionalUserProperty() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final Bundle m22456a() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString("name", str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                C5382r5.m23401a(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString(C5180a.f14838d, str4);
            }
            bundle.putLong(C5180a.f14839e, this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString(C5180a.f14840f, str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle(C5180a.f14841g, bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString(C5180a.f14842h, str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle(C5180a.f14843i, bundle3);
            }
            bundle.putLong(C5180a.f14844j, this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString(C5180a.f14845k, str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle(C5180a.f14846l, bundle4);
            }
            bundle.putLong(C5180a.f14847m, this.mCreationTimestamp);
            bundle.putBoolean("active", this.mActive);
            bundle.putLong(C5180a.f14849o, this.mTriggeredTimestamp);
            return bundle;
        }

        @C4056a
        public ConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
            C4300a0.m18620a(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            Object obj = conditionalUserProperty.mValue;
            if (obj != null) {
                this.mValue = C5219c7.m22537a(obj);
                if (this.mValue == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            Bundle bundle = conditionalUserProperty.mTimedOutEventParams;
            if (bundle != null) {
                this.mTimedOutEventParams = new Bundle(bundle);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            Bundle bundle2 = conditionalUserProperty.mTriggeredEventParams;
            if (bundle2 != null) {
                this.mTriggeredEventParams = new Bundle(bundle2);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            Bundle bundle3 = conditionalUserProperty.mExpiredEventParams;
            if (bundle3 != null) {
                this.mExpiredEventParams = new Bundle(bundle3);
            }
        }

        private ConditionalUserProperty(@C0193h0 Bundle bundle) {
            C4300a0.m18620a(bundle);
            this.mAppId = (String) C5382r5.m23400a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) C5382r5.m23400a(bundle, "origin", String.class, null);
            this.mName = (String) C5382r5.m23400a(bundle, "name", String.class, null);
            this.mValue = C5382r5.m23400a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) C5382r5.m23400a(bundle, C5180a.f14838d, String.class, null);
            Long valueOf = Long.valueOf(0);
            this.mTriggerTimeout = ((Long) C5382r5.m23400a(bundle, C5180a.f14839e, Long.class, valueOf)).longValue();
            this.mTimedOutEventName = (String) C5382r5.m23400a(bundle, C5180a.f14840f, String.class, null);
            this.mTimedOutEventParams = (Bundle) C5382r5.m23400a(bundle, C5180a.f14841g, Bundle.class, null);
            this.mTriggeredEventName = (String) C5382r5.m23400a(bundle, C5180a.f14842h, String.class, null);
            this.mTriggeredEventParams = (Bundle) C5382r5.m23400a(bundle, C5180a.f14843i, Bundle.class, null);
            this.mTimeToLive = ((Long) C5382r5.m23400a(bundle, C5180a.f14844j, Long.class, valueOf)).longValue();
            this.mExpiredEventName = (String) C5382r5.m23400a(bundle, C5180a.f14845k, String.class, null);
            this.mExpiredEventParams = (Bundle) C5382r5.m23400a(bundle, C5180a.f14846l, Bundle.class, null);
        }
    }

    @C4056a
    @C4312d0
    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
    public interface OnEventListener extends C5415u5 {
        @C4056a
        @C0226w0
        @C4312d0
        void onEvent(String str, String str2, Bundle bundle, long j);
    }

    @C4056a
    @C4312d0
    /* renamed from: com.google.android.gms.measurement.AppMeasurement$a */
    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
    public static final class C5174a extends C5371q5 {
        @C4056a
        @C4312d0

        /* renamed from: c */
        public static final String f14824c = "_ae";
        @C4056a
        @C4312d0

        /* renamed from: d */
        public static final String f14825d = "_ar";

        private C5174a() {
        }
    }

    @C4056a
    @C4312d0
    /* renamed from: com.google.android.gms.measurement.AppMeasurement$b */
    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
    public interface C5175b extends C5426v5 {
        @C4056a
        @C0226w0
        @C4312d0
        /* renamed from: a */
        void mo21089a(String str, String str2, Bundle bundle, long j);
    }

    @C4056a
    @C4312d0
    /* renamed from: com.google.android.gms.measurement.AppMeasurement$c */
    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
    public static final class C5176c extends C5404t5 {
        @C4056a
        @C4312d0

        /* renamed from: c */
        public static final String f14826c = "fatal";
        @C4056a
        @C4312d0

        /* renamed from: d */
        public static final String f14827d = "timestamp";
        @C4056a
        @C4312d0

        /* renamed from: e */
        public static final String f14828e = "type";

        private C5176c() {
        }
    }

    @C4056a
    @C4312d0
    /* renamed from: com.google.android.gms.measurement.AppMeasurement$d */
    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
    public static final class C5177d extends C5393s5 {
        @C4056a
        @C4312d0

        /* renamed from: c */
        public static final String f14829c = "_ln";

        private C5177d() {
        }
    }

    private AppMeasurement(C5359p4 p4Var) {
        C4300a0.m18620a(p4Var);
        this.f14821a = p4Var;
        this.f14822b = null;
        this.f14823c = false;
    }

    @C4476d0
    /* renamed from: a */
    private static AppMeasurement m22442a(Context context, String str, String str2) {
        if (f14820g == null) {
            synchronized (AppMeasurement.class) {
                if (f14820g == null) {
                    C5438w6 b = m22443b(context, null);
                    if (b != null) {
                        f14820g = new AppMeasurement(b);
                    } else {
                        f14820g = new AppMeasurement(C5359p4.m23335a(context, null, null, null));
                    }
                }
            }
        }
        return f14820g;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.measurement.internal.C5438w6 m22443b(android.content.Context r8, android.os.Bundle r9) {
        /*
            java.lang.String r0 = "com.google.firebase.analytics.FirebaseAnalytics"
            r1 = 0
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0027 }
            java.lang.String r2 = "getScionFrontendApiImplementation"
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{  }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch:{  }
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r7 = 1
            r4[r7] = r5     // Catch:{  }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r4)     // Catch:{  }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{  }
            r2[r6] = r8     // Catch:{  }
            r2[r7] = r9     // Catch:{  }
            java.lang.Object r8 = r0.invoke(r1, r2)     // Catch:{  }
            com.google.android.gms.measurement.internal.w6 r8 = (com.google.android.gms.measurement.internal.C5438w6) r8     // Catch:{  }
            return r8
        L_0x0027:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.m22443b(android.content.Context, android.os.Bundle):com.google.android.gms.measurement.internal.w6");
    }

    @Keep
    @C4056a
    @C4312d0
    @Deprecated
    @C0203m0(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    public static AppMeasurement getInstance(Context context) {
        return m22442a(context, (String) null, (String) null);
    }

    @Keep
    public void beginAdUnitExposure(@C0193h0 @C0210o0(min = 1) String str) {
        if (this.f14823c) {
            this.f14822b.mo21787a(str);
        } else {
            this.f14821a.mo21586H().mo21867a(str, this.f14821a.mo21208g().mo18572d());
        }
    }

    /* renamed from: c */
    public final void mo21068c(boolean z) {
        if (this.f14823c) {
            this.f14822b.mo21794b(z);
        } else {
            this.f14821a.mo21606t().mo21776b(z);
        }
    }

    @C4056a
    @C4312d0
    @Keep
    public void clearConditionalUserProperty(@C0193h0 @C0210o0(max = 24, min = 1) String str, @C0195i0 String str2, @C0195i0 Bundle bundle) {
        if (this.f14823c) {
            this.f14822b.mo21788a(str, str2, bundle);
        } else {
            this.f14821a.mo21606t().mo21779c(str, str2, bundle);
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    @C4476d0
    public void clearConditionalUserPropertyAs(@C0193h0 @C0210o0(min = 1) String str, @C0193h0 @C0210o0(max = 24, min = 1) String str2, @C0195i0 String str3, @C0195i0 Bundle bundle) {
        if (!this.f14823c) {
            this.f14821a.mo21606t().mo21770a(str, str2, str3, bundle);
            return;
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    @C4056a
    /* renamed from: d */
    public Long mo21071d() {
        if (this.f14823c) {
            return (Long) this.f14822b.mo21781a(1);
        }
        return this.f14821a.mo21606t().mo21745E();
    }

    @C4056a
    /* renamed from: e */
    public String mo21072e() {
        if (this.f14823c) {
            return (String) this.f14822b.mo21781a(0);
        }
        return this.f14821a.mo21606t().mo21744D();
    }

    @Keep
    public void endAdUnitExposure(@C0193h0 @C0210o0(min = 1) String str) {
        if (this.f14823c) {
            this.f14822b.mo21792b(str);
        } else {
            this.f14821a.mo21586H().mo21868b(str, this.f14821a.mo21208g().mo18572d());
        }
    }

    @Keep
    public long generateEventId() {
        if (this.f14823c) {
            return this.f14822b.zze();
        }
        return this.f14821a.mo21607u().mo21389t();
    }

    @Keep
    @C0195i0
    public String getAppInstanceId() {
        if (this.f14823c) {
            return this.f14822b.mo21799l();
        }
        return this.f14821a.mo21606t().mo21748H();
    }

    @C0226w0
    @Keep
    @C4056a
    @C4312d0
    public List<ConditionalUserProperty> getConditionalUserProperties(@C0195i0 String str, @C0210o0(max = 23, min = 1) @C0195i0 String str2) {
        List<Bundle> list;
        int i;
        if (this.f14823c) {
            list = this.f14822b.mo21783a(str, str2);
        } else {
            list = this.f14821a.mo21606t().mo21753a(str, str2);
        }
        if (list == null) {
            i = 0;
        } else {
            i = list.size();
        }
        ArrayList arrayList = new ArrayList(i);
        for (Bundle conditionalUserProperty : list) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @C0226w0
    @Keep
    @C4476d0
    public List<ConditionalUserProperty> getConditionalUserPropertiesAs(@C0193h0 @C0210o0(min = 1) String str, @C0195i0 String str2, @C0210o0(max = 23, min = 1) @C0195i0 String str3) {
        int i;
        if (!this.f14823c) {
            ArrayList a = this.f14821a.mo21606t().mo21754a(str, str2, str3);
            int i2 = 0;
            if (a == null) {
                i = 0;
            } else {
                i = a.size();
            }
            ArrayList arrayList = new ArrayList(i);
            int size = a.size();
            while (i2 < size) {
                Object obj = a.get(i2);
                i2++;
                arrayList.add(new ConditionalUserProperty((Bundle) obj));
            }
            return arrayList;
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    @Keep
    @C0195i0
    public String getCurrentScreenClass() {
        if (this.f14823c) {
            return this.f14822b.mo21798i();
        }
        return this.f14821a.mo21606t().mo21751K();
    }

    @Keep
    @C0195i0
    public String getCurrentScreenName() {
        if (this.f14823c) {
            return this.f14822b.mo21782a();
        }
        return this.f14821a.mo21606t().mo21750J();
    }

    @Keep
    @C0195i0
    public String getGmpAppId() {
        if (this.f14823c) {
            return this.f14822b.zzd();
        }
        return this.f14821a.mo21606t().mo21752L();
    }

    @C0226w0
    @Keep
    @C4056a
    @C4312d0
    public int getMaxUserProperties(@C0193h0 @C0210o0(min = 1) String str) {
        if (this.f14823c) {
            return this.f14822b.mo21795c(str);
        }
        this.f14821a.mo21606t();
        C4300a0.m18630b(str);
        return 25;
    }

    /* access modifiers changed from: protected */
    @C0226w0
    @Keep
    @C4476d0
    public Map<String, Object> getUserProperties(@C0195i0 String str, @C0210o0(max = 24, min = 1) @C0195i0 String str2, boolean z) {
        if (this.f14823c) {
            return this.f14822b.mo21784a(str, str2, z);
        }
        return this.f14821a.mo21606t().mo21756a(str, str2, z);
    }

    /* access modifiers changed from: protected */
    @C0226w0
    @Keep
    @C4476d0
    public Map<String, Object> getUserPropertiesAs(@C0193h0 @C0210o0(min = 1) String str, @C0195i0 String str2, @C0210o0(max = 23, min = 1) @C0195i0 String str3, boolean z) {
        if (!this.f14823c) {
            return this.f14821a.mo21606t().mo21755a(str, str2, str3, z);
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    @C4312d0
    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (this.f14823c) {
            this.f14822b.mo21793b(str, str2, bundle);
        } else {
            this.f14821a.mo21606t().mo21764a(str, str2, bundle);
        }
    }

    @C4056a
    @C4312d0
    public void registerOnMeasurementEventListener(OnEventListener onEventListener) {
        if (this.f14823c) {
            this.f14822b.mo21791b((C5415u5) onEventListener);
        } else {
            this.f14821a.mo21606t().mo21760a((C5415u5) onEventListener);
        }
    }

    @C4056a
    @C4312d0
    @Keep
    public void setConditionalUserProperty(@C0193h0 ConditionalUserProperty conditionalUserProperty) {
        C4300a0.m18620a(conditionalUserProperty);
        if (this.f14823c) {
            this.f14822b.mo21796c(conditionalUserProperty.m22456a());
        } else {
            this.f14821a.mo21606t().mo21758a(conditionalUserProperty.m22456a());
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    @C4476d0
    public void setConditionalUserPropertyAs(@C0193h0 ConditionalUserProperty conditionalUserProperty) {
        C4300a0.m18620a(conditionalUserProperty);
        if (!this.f14823c) {
            this.f14821a.mo21606t().mo21773b(conditionalUserProperty.m22456a());
            return;
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    @C4056a
    /* renamed from: c */
    public Integer mo21067c() {
        if (this.f14823c) {
            return (Integer) this.f14822b.mo21781a(3);
        }
        return this.f14821a.mo21606t().mo21746F();
    }

    private AppMeasurement(C5438w6 w6Var) {
        C4300a0.m18620a(w6Var);
        this.f14822b = w6Var;
        this.f14821a = null;
        this.f14823c = true;
    }

    @C4056a
    @Deprecated
    /* renamed from: b */
    public void mo21065b(boolean z) {
        if (this.f14823c) {
            this.f14822b.mo21797d(z);
        } else {
            this.f14821a.mo21606t().mo21771a(z);
        }
    }

    @C4056a
    /* renamed from: b */
    public Double mo21064b() {
        if (this.f14823c) {
            return (Double) this.f14822b.mo21781a(2);
        }
        return this.f14821a.mo21606t().mo21747G();
    }

    /* renamed from: a */
    public static AppMeasurement m22441a(Context context, Bundle bundle) {
        if (f14820g == null) {
            synchronized (AppMeasurement.class) {
                if (f14820g == null) {
                    C5438w6 b = m22443b(context, bundle);
                    if (b != null) {
                        f14820g = new AppMeasurement(b);
                    } else {
                        f14820g = new AppMeasurement(C5359p4.m23335a(context, null, null, bundle));
                    }
                }
            }
        }
        return f14820g;
    }

    @C4056a
    @C4312d0
    /* renamed from: a */
    public void mo21062a(String str, String str2, Bundle bundle, long j) {
        if (this.f14823c) {
            this.f14822b.mo21789a(str, str2, bundle, j);
        } else {
            this.f14821a.mo21606t().mo21766a(str, str2, bundle, true, false, j);
        }
    }

    @C4056a
    @C4312d0
    /* renamed from: a */
    public void mo21063a(String str, String str2, Object obj) {
        C4300a0.m18630b(str);
        if (this.f14823c) {
            this.f14822b.mo21790a(str, str2, obj);
        } else {
            this.f14821a.mo21606t().mo21768a(str, str2, obj, true);
        }
    }

    @C0226w0
    @C4056a
    @C4312d0
    /* renamed from: a */
    public Map<String, Object> mo21059a(boolean z) {
        if (this.f14823c) {
            return this.f14822b.mo21784a((String) null, (String) null, z);
        }
        List<zzjx> c = this.f14821a.mo21606t().mo21778c(z);
        C0635a aVar = new C0635a(c.size());
        for (zzjx zzjx : c) {
            aVar.put(zzjx.f15695b, zzjx.mo21886a());
        }
        return aVar;
    }

    @C4056a
    @C0226w0
    @C4312d0
    /* renamed from: a */
    public void mo21061a(C5175b bVar) {
        if (this.f14823c) {
            this.f14822b.mo21786a((C5426v5) bVar);
        } else {
            this.f14821a.mo21606t().mo21761a((C5426v5) bVar);
        }
    }

    @C4056a
    @C4312d0
    /* renamed from: a */
    public void mo21060a(OnEventListener onEventListener) {
        if (this.f14823c) {
            this.f14822b.mo21785a((C5415u5) onEventListener);
        } else {
            this.f14821a.mo21606t().mo21774b((C5415u5) onEventListener);
        }
    }

    @C4056a
    /* renamed from: a */
    public Boolean mo21058a() {
        if (this.f14823c) {
            return (Boolean) this.f14822b.mo21781a(4);
        }
        return this.f14821a.mo21606t().mo21743C();
    }
}
