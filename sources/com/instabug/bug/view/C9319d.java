package com.instabug.bug.view;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import androidx.annotation.C0224v0;
import androidx.appcompat.app.C0295d;
import androidx.core.p034l.C0962e0;
import com.instabug.bug.C9254f;
import com.instabug.bug.model.Bug;
import com.instabug.library.C9700R;
import com.instabug.library.Feature;
import com.instabug.library.Feature.State;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.p382ui.BaseContract.Presenter;
import com.instabug.library.core.p382ui.BaseContract.View;
import com.instabug.library.core.p382ui.C9792a;
import com.instabug.library.util.SystemServiceUtils;
import java.io.Serializable;
import java.util.ArrayList;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.bug.view.d */
/* compiled from: BugReportingContract */
public interface C9319d {

    /* renamed from: com.instabug.bug.view.d$a */
    public interface C9320a extends Presenter {
    }

    /* renamed from: com.instabug.bug.view.d$b */
    /* compiled from: BugReportingContract */
    public interface C9321b extends View<C0295d> {
        /* renamed from: a */
        void mo33661a(boolean z);

        /* renamed from: c */
        void mo33663c();

        /* renamed from: e */
        void mo33665e();

        /* renamed from: f */
        void mo33666f();
    }

    /* renamed from: com.instabug.bug.view.d$c */
    /* compiled from: Disclaimer */
    public class C9322c implements Serializable {

        /* renamed from: O */
        private static transient /* synthetic */ boolean[] f24691O;

        /* renamed from: N */
        private boolean f24692N = false;

        /* renamed from: a */
        private String f24693a;

        /* renamed from: b */
        private String f24694b;

        public C9322c() {
            boolean[] f = m43651f();
            f[0] = true;
        }

        /* renamed from: f */
        private static /* synthetic */ boolean[] m43651f() {
            boolean[] zArr = f24691O;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6906697860701845676L, "com/instabug/bug/view/disclaimer/Disclaimer", 12);
            f24691O = a;
            return a;
        }

        /* renamed from: a */
        public C9322c mo33723a(boolean z) {
            boolean[] f = m43651f();
            this.f24692N = z;
            f[1] = true;
            return this;
        }

        /* renamed from: b */
        public C9322c mo33725b(String str) {
            boolean[] f = m43651f();
            this.f24693a = str;
            f[2] = true;
            return this;
        }

        /* renamed from: c */
        public C9322c mo33726c(String str) {
            boolean[] f = m43651f();
            this.f24694b = str;
            f[3] = true;
            return this;
        }

        /* renamed from: d */
        public String mo33727d() {
            boolean[] f = m43651f();
            String str = this.f24694b;
            f[5] = true;
            return str;
        }

        /* renamed from: e */
        public boolean mo33728e() {
            boolean[] f = m43651f();
            boolean z = this.f24692N;
            f[6] = true;
            return z;
        }

        /* renamed from: d */
        public static String m43650d(String str) {
            boolean[] f = m43651f();
            String replace = str.replace("#metadata-screen", "instabug-bug://instabug-disclaimer.com/disclaimer");
            f[11] = true;
            return replace;
        }

        /* renamed from: a */
        public String mo33724a() {
            boolean[] f = m43651f();
            String str = this.f24693a;
            f[4] = true;
            return str;
        }

        /* renamed from: a */
        public static String m43649a(String str, int i) {
            boolean[] f = m43651f();
            int i2 = i & C0962e0.f4342s;
            f[7] = true;
            Object[] objArr = {Integer.valueOf(i2)};
            f[8] = true;
            String format = String.format("<font color=\"#%06X\"><a href=\"$2\">$1</a></font>", objArr);
            f[9] = true;
            String replaceAll = str.replaceAll("\\[([^\\]]+)\\]\\(([^\\]]+)\\)", format);
            f[10] = true;
            return replaceAll;
        }
    }

    /* renamed from: com.instabug.bug.view.d$d */
    /* compiled from: DisclaimerDetailsFragment */
    public class C9323d extends C9792a {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f24695N;

        /* renamed from: a */
        C9322c f24696a;

        /* renamed from: b */
        TextView f24697b;

        public C9323d() {
            m43659d()[0] = true;
        }

        /* renamed from: a */
        public static C9323d m43658a(C9322c cVar) {
            boolean[] d = m43659d();
            Bundle bundle = new Bundle();
            d[1] = true;
            bundle.putSerializable("disclaimer", cVar);
            d[2] = true;
            C9323d dVar = new C9323d();
            d[3] = true;
            dVar.setArguments(bundle);
            d[4] = true;
            return dVar;
        }

        /* renamed from: d */
        private static /* synthetic */ boolean[] m43659d() {
            boolean[] zArr = f24695N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-2313916939224588111L, "com/instabug/bug/view/disclaimer/DisclaimerDetailsFragment", 11);
            f24695N = a;
            return a;
        }

        /* access modifiers changed from: protected */
        public int getLayout() {
            boolean[] d = m43659d();
            int i = C9700R.layout.instabug_lyt_disclaimer_details;
            d[5] = true;
            return i;
        }

        /* access modifiers changed from: protected */
        public void initViews(android.view.View view, Bundle bundle) {
            boolean[] d = m43659d();
            this.f24697b = (TextView) findViewById(C9700R.C9704id.instabug_disclaimer_details);
            d[6] = true;
            this.f24696a = (C9322c) getArguments().getSerializable("disclaimer");
            C9322c cVar = this.f24696a;
            if (cVar == null) {
                d[7] = true;
            } else {
                d[8] = true;
                this.f24697b.setText(String.valueOf(cVar.mo33727d()));
                d[9] = true;
            }
            d[10] = true;
        }
    }

    /* renamed from: com.instabug.bug.view.d$e */
    /* compiled from: DisclaimerFragment */
    public class C9324e extends C9792a {

        /* renamed from: P */
        private static transient /* synthetic */ boolean[] f24698P;

        /* renamed from: N */
        ListView f24699N;

        /* renamed from: O */
        C9328g f24700O;

        /* renamed from: a */
        private C9326b f24701a;

        /* renamed from: b */
        CharSequence f24702b;

        /* renamed from: com.instabug.bug.view.d$e$a */
        /* compiled from: DisclaimerFragment */
        class C9325a implements OnItemClickListener {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f24703b;

            /* renamed from: a */
            final /* synthetic */ C9324e f24704a;

            C9325a(C9324e eVar) {
                boolean[] a = m43664a();
                this.f24704a = eVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m43664a() {
                boolean[] zArr = f24703b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-1448424421068359534L, "com/instabug/bug/view/disclaimer/DisclaimerFragment$1", 6);
                f24703b = a;
                return a;
            }

            public void onItemClick(AdapterView<?> adapterView, android.view.View view, int i, long j) {
                boolean[] a = m43664a();
                C9322c a2 = this.f24704a.f24700O.mo33730a(i);
                a[1] = true;
                if (!a2.mo33728e()) {
                    a[2] = true;
                } else {
                    a[3] = true;
                    C9324e.m43661a(this.f24704a, a2);
                    a[4] = true;
                }
                a[5] = true;
            }
        }

        /* renamed from: com.instabug.bug.view.d$e$b */
        /* compiled from: DisclaimerFragment */
        public interface C9326b {
            /* renamed from: a */
            void mo33660a(C9322c cVar);
        }

        public C9324e() {
            m43662c()[0] = true;
        }

        /* renamed from: a */
        static /* synthetic */ void m43661a(C9324e eVar, C9322c cVar) {
            boolean[] c = m43662c();
            eVar.m43660a(cVar);
            c[34] = true;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m43662c() {
            boolean[] zArr = f24698P;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-4650943944234204029L, "com/instabug/bug/view/disclaimer/DisclaimerFragment", 35);
            f24698P = a;
            return a;
        }

        /* renamed from: d */
        public static C9324e m43663d() {
            boolean[] c = m43662c();
            C9324e eVar = new C9324e();
            c[1] = true;
            return eVar;
        }

        /* access modifiers changed from: protected */
        public int getLayout() {
            boolean[] c = m43662c();
            int i = C9700R.layout.instabug_lyt_disclaimer;
            c[18] = true;
            return i;
        }

        /* access modifiers changed from: protected */
        public void initViews(android.view.View view, Bundle bundle) {
            boolean[] c = m43662c();
            SystemServiceUtils.hideInputMethod(getActivity());
            c[19] = true;
            this.f24700O = new C9328g(getContext(), C9327f.m43666a());
            c[20] = true;
            this.f24699N = (ListView) findViewById(C9700R.C9704id.instabug_disclaimer_list);
            c[21] = true;
            this.f24699N.setAdapter(this.f24700O);
            c[22] = true;
            this.f24699N.setOnItemClickListener(new C9325a(this));
            c[23] = true;
            this.f24702b = getActivity().getTitle();
            c[24] = true;
            if (getActivity() == null) {
                c[25] = true;
            } else {
                c[26] = true;
                getActivity().setTitle(C9700R.string.ib_str_report_data);
                c[27] = true;
            }
            c[28] = true;
        }

        public void onAttach(Context context) {
            boolean[] c = m43662c();
            super.onAttach(context);
            c[2] = true;
            if (!(getActivity() instanceof BugReportingActivity)) {
                c[3] = true;
            } else {
                try {
                    c[4] = true;
                    this.f24701a = (C9326b) context;
                    c[5] = true;
                } catch (ClassCastException unused) {
                    c[6] = true;
                    StringBuilder sb = new StringBuilder();
                    sb.append(context.toString());
                    sb.append(" must implement DisclaimerFragment.Callbacks");
                    ClassCastException classCastException = new ClassCastException(sb.toString());
                    c[7] = true;
                    throw classCastException;
                }
            }
            c[8] = true;
        }

        public void onCreate(Bundle bundle) {
            boolean[] c = m43662c();
            super.onCreate(bundle);
            c[9] = true;
            setHasOptionsMenu(true);
            c[10] = true;
        }

        public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
            boolean[] c = m43662c();
            menu.clear();
            c[11] = true;
            super.onCreateOptionsMenu(menu, menuInflater);
            c[12] = true;
        }

        public void onDestroy() {
            boolean[] c = m43662c();
            super.onDestroy();
            c[29] = true;
            if (getActivity() == null) {
                c[30] = true;
            } else {
                c[31] = true;
                getActivity().setTitle(this.f24702b);
                c[32] = true;
            }
            c[33] = true;
        }

        public void onDetach() {
            boolean[] c = m43662c();
            super.onDetach();
            this.f24701a = null;
            c[13] = true;
        }

        /* renamed from: a */
        private void m43660a(C9322c cVar) {
            boolean[] c = m43662c();
            C9326b bVar = this.f24701a;
            if (bVar == null) {
                c[14] = true;
            } else {
                c[15] = true;
                bVar.mo33660a(cVar);
                c[16] = true;
            }
            c[17] = true;
        }
    }

    /* renamed from: com.instabug.bug.view.d$f */
    /* compiled from: DisclaimerHelper */
    public class C9327f {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f24705a;

        /* renamed from: a */
        public static boolean m43668a(@C0195i0 Uri uri) {
            boolean z;
            boolean[] e = m43672e();
            if (uri == null) {
                e[1] = true;
            } else {
                e[2] = true;
                if (!"instabug-bug".equals(uri.getScheme())) {
                    e[3] = true;
                } else {
                    e[4] = true;
                    if (!"instabug-disclaimer.com".equals(uri.getHost())) {
                        e[5] = true;
                    } else {
                        e[6] = true;
                        if (!"/disclaimer".equals(uri.getPath())) {
                            e[7] = true;
                        } else {
                            e[8] = true;
                            z = true;
                            e[10] = true;
                            return z;
                        }
                    }
                }
            }
            z = false;
            e[9] = true;
            e[10] = true;
            return z;
        }

        /* renamed from: b */
        private static boolean m43669b() {
            boolean z;
            boolean[] e = m43672e();
            if (InstabugCore.getFeatureState(Feature.TRACK_USER_STEPS) == State.ENABLED) {
                e[110] = true;
                z = true;
            } else {
                z = false;
                e[111] = true;
            }
            e[112] = true;
            return z;
        }

        /* renamed from: c */
        private static boolean m43670c() {
            boolean z;
            boolean[] e = m43672e();
            if (InstabugCore.getFeatureState(Feature.REPRO_STEPS) == State.ENABLED) {
                e[113] = true;
                z = true;
            } else {
                z = false;
                e[114] = true;
            }
            e[115] = true;
            return z;
        }

        /* renamed from: d */
        private static boolean m43671d() {
            boolean z;
            boolean[] e = m43672e();
            if (InstabugCore.getFeatureState(Feature.CONSOLE_LOGS) == State.ENABLED) {
                e[116] = true;
                z = true;
            } else {
                z = false;
                e[117] = true;
            }
            e[118] = true;
            return z;
        }

        /* renamed from: e */
        private static /* synthetic */ boolean[] m43672e() {
            boolean[] zArr = f24705a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(5237854229316009946L, "com/instabug/bug/view/disclaimer/DisclaimerHelper", 119);
            f24705a = a;
            return a;
        }

        /* renamed from: a */
        public static ArrayList<C9322c> m43666a() {
            boolean[] e = m43672e();
            ArrayList<C9322c> arrayList = new ArrayList<>();
            e[11] = true;
            Bug c = C9254f.m43255h().mo33434c();
            e[12] = true;
            if (c == null) {
                e[13] = true;
            } else if (c.getState() == null) {
                e[14] = true;
            } else {
                e[15] = true;
                com.instabug.library.model.State state = c.getState();
                e[16] = true;
                C9322c b = new C9322c().mo33725b(com.instabug.library.model.State.KEY_APP_PACKAGE_NAME);
                e[17] = true;
                String appPackageName = state.getAppPackageName();
                e[18] = true;
                m43667a(b.mo33726c(appPackageName), arrayList);
                e[19] = true;
                m43667a(new C9322c().mo33725b(com.instabug.library.model.State.KEY_APP_VERSION).mo33726c(state.getAppVersion()), arrayList);
                e[20] = true;
                C9322c b2 = new C9322c().mo33725b("BATTERY");
                StringBuilder sb = new StringBuilder();
                e[21] = true;
                sb.append(state.getBatteryLevel());
                sb.append("%, ");
                sb.append(state.getBatteryState());
                C9322c c2 = b2.mo33726c(sb.toString());
                e[22] = true;
                m43667a(c2, arrayList);
                e[23] = true;
                m43667a(new C9322c().mo33725b("carrier").mo33726c(state.getCarrier()), arrayList);
                e[24] = true;
                if (!m43671d()) {
                    e[25] = true;
                } else {
                    e[26] = true;
                    C9322c b3 = new C9322c().mo33725b(com.instabug.library.model.State.KEY_CONSOLE_LOG);
                    e[27] = true;
                    C9322c c3 = b3.mo33726c(state.getConsoleLog().toString());
                    e[28] = true;
                    C9322c a = c3.mo33723a(true);
                    e[29] = true;
                    m43667a(a, arrayList);
                    e[30] = true;
                }
                C9322c b4 = new C9322c().mo33725b(com.instabug.library.model.State.KEY_CURRENT_VIEW);
                e[31] = true;
                String currentView = state.getCurrentView();
                e[32] = true;
                m43667a(b4.mo33726c(currentView), arrayList);
                e[33] = true;
                m43667a(new C9322c().mo33725b(com.instabug.library.model.State.KEY_DENSITY).mo33726c(state.getScreenDensity()), arrayList);
                e[34] = true;
                m43667a(new C9322c().mo33725b(com.instabug.library.model.State.KEY_DEVICE).mo33726c(state.getDevice()), arrayList);
                e[35] = true;
                C9322c b5 = new C9322c().mo33725b(com.instabug.library.model.State.KEY_DEVICE_ROOTED);
                e[36] = true;
                C9322c c4 = b5.mo33726c(String.valueOf(state.isDeviceRooted()));
                e[37] = true;
                m43667a(c4, arrayList);
                e[38] = true;
                C9322c cVar = new C9322c();
                e[39] = true;
                C9322c b6 = cVar.mo33725b("duration");
                e[40] = true;
                long duration = state.getDuration();
                e[41] = true;
                C9322c c5 = b6.mo33726c(String.valueOf(duration));
                e[42] = true;
                m43667a(c5, arrayList);
                e[43] = true;
                m43667a(new C9322c().mo33725b("email").mo33726c(state.getUserEmail()), arrayList);
                e[44] = true;
                C9322c cVar2 = new C9322c();
                e[45] = true;
                C9322c c6 = cVar2.mo33725b(com.instabug.library.model.State.KEY_INSTABUG_LOG).mo33726c(state.getInstabugLog());
                e[46] = true;
                C9322c a2 = c6.mo33723a(true);
                e[47] = true;
                m43667a(a2, arrayList);
                e[48] = true;
                m43667a(new C9322c().mo33725b(com.instabug.library.model.State.KEY_LOCALE).mo33726c(state.getLocale()), arrayList);
                e[49] = true;
                C9322c b7 = new C9322c().mo33725b("MEMORY");
                StringBuilder sb2 = new StringBuilder();
                e[50] = true;
                sb2.append(((float) state.getUsedMemory()) / 1000.0f);
                String str = "/";
                sb2.append(str);
                sb2.append(((float) state.getTotalMemory()) / 1000.0f);
                String str2 = " GB";
                sb2.append(str2);
                C9322c c7 = b7.mo33726c(sb2.toString());
                e[51] = true;
                m43667a(c7, arrayList);
                e[52] = true;
                C9322c cVar3 = new C9322c();
                e[53] = true;
                C9322c c8 = cVar3.mo33725b(com.instabug.library.model.State.KEY_NETWORK_LOGS).mo33726c(state.getNetworkLogs());
                e[54] = true;
                C9322c a3 = c8.mo33723a(true);
                e[55] = true;
                m43667a(a3, arrayList);
                e[56] = true;
                C9322c b8 = new C9322c().mo33725b(com.instabug.library.model.State.KEY_ORIENTATION);
                e[57] = true;
                String screenOrientation = state.getScreenOrientation();
                e[58] = true;
                m43667a(b8.mo33726c(screenOrientation), arrayList);
                e[59] = true;
                m43667a(new C9322c().mo33725b(com.instabug.library.model.State.KEY_OS).mo33726c(state.getOS()), arrayList);
                e[60] = true;
                C9322c cVar4 = new C9322c();
                e[61] = true;
                C9322c b9 = cVar4.mo33725b(com.instabug.library.model.State.KEY_REPORTED_AT);
                e[62] = true;
                long reportedAt = state.getReportedAt();
                e[63] = true;
                C9322c c9 = b9.mo33726c(String.valueOf(reportedAt));
                e[64] = true;
                m43667a(c9, arrayList);
                e[65] = true;
                m43667a(new C9322c().mo33725b(com.instabug.library.model.State.KEY_SCREEN_SIZE).mo33726c(state.getScreenSize()), arrayList);
                e[66] = true;
                m43667a(new C9322c().mo33725b(com.instabug.library.model.State.KEY_SDK_VERSION).mo33726c(state.getSdkVersion()), arrayList);
                e[67] = true;
                C9322c b10 = new C9322c().mo33725b("STORAGE");
                StringBuilder sb3 = new StringBuilder();
                e[68] = true;
                sb3.append(((float) state.getUsedStorage()) / 1000.0f);
                sb3.append(str);
                e[69] = true;
                sb3.append(((float) state.getTotalStorage()) / 1000.0f);
                sb3.append(str2);
                String sb4 = sb3.toString();
                e[70] = true;
                C9322c c10 = b10.mo33726c(sb4);
                e[71] = true;
                m43667a(c10, arrayList);
                e[72] = true;
                C9322c b11 = new C9322c().mo33725b("user_attributes");
                e[73] = true;
                C9322c c11 = b11.mo33726c(state.getUserAttributes());
                e[74] = true;
                C9322c a4 = c11.mo33723a(true);
                e[75] = true;
                m43667a(a4, arrayList);
                e[76] = true;
                C9322c cVar5 = new C9322c();
                e[77] = true;
                C9322c c12 = cVar5.mo33725b(com.instabug.library.model.State.KEY_USER_DATA).mo33726c(state.getUserData());
                e[78] = true;
                C9322c a5 = c12.mo33723a(true);
                e[79] = true;
                m43667a(a5, arrayList);
                e[80] = true;
                if (!m43669b()) {
                    e[81] = true;
                } else {
                    e[82] = true;
                    C9322c b12 = new C9322c().mo33725b(com.instabug.library.model.State.KEY_USER_STEPS);
                    e[83] = true;
                    C9322c c13 = b12.mo33726c(state.getUserSteps().toString());
                    e[84] = true;
                    C9322c a6 = c13.mo33723a(true);
                    e[85] = true;
                    m43667a(a6, arrayList);
                    e[86] = true;
                }
                if (!m43670c()) {
                    e[87] = true;
                } else {
                    e[88] = true;
                    C9322c b13 = new C9322c().mo33725b(com.instabug.library.model.State.KEY_VISUAL_USER_STEPS);
                    e[89] = true;
                    C9322c c14 = b13.mo33726c(state.getVisualUserSteps());
                    e[90] = true;
                    C9322c a7 = c14.mo33723a(true);
                    e[91] = true;
                    m43667a(a7, arrayList);
                    e[92] = true;
                }
                m43667a(new C9322c().mo33725b(com.instabug.library.model.State.KEY_WIFI_SSID).mo33726c(state.getWifiSSID()), arrayList);
                e[93] = true;
                C9322c cVar6 = new C9322c();
                e[94] = true;
                C9322c b14 = cVar6.mo33725b(com.instabug.library.model.State.KEY_WIFI_STATE);
                e[95] = true;
                boolean isWifiEnable = state.isWifiEnable();
                e[96] = true;
                C9322c c15 = b14.mo33726c(String.valueOf(isWifiEnable));
                e[97] = true;
                m43667a(c15, arrayList);
                e[98] = true;
            }
            e[99] = true;
            return arrayList;
        }

        @C0224v0
        /* renamed from: a */
        static void m43667a(C9322c cVar, ArrayList<C9322c> arrayList) {
            boolean[] e = m43672e();
            if (cVar.mo33727d() == null) {
                e[100] = true;
            } else if (cVar.mo33727d().isEmpty()) {
                e[101] = true;
            } else {
                e[102] = true;
                String d = cVar.mo33727d();
                e[103] = true;
                if (d.equals("{}")) {
                    e[104] = true;
                } else if (cVar.mo33727d().equals("[]")) {
                    e[105] = true;
                } else {
                    e[106] = true;
                    cVar.mo33725b(cVar.mo33724a().toUpperCase().replace('_', ' '));
                    e[107] = true;
                    arrayList.add(cVar);
                    e[108] = true;
                }
            }
            e[109] = true;
        }
    }

    /* renamed from: com.instabug.bug.view.d$g */
    /* compiled from: DisclaimerListAdapter */
    public class C9328g extends BaseAdapter {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f24706N;

        /* renamed from: a */
        private Context f24707a;

        /* renamed from: b */
        private ArrayList<C9322c> f24708b;

        /* renamed from: com.instabug.bug.view.d$g$b */
        /* compiled from: DisclaimerListAdapter */
        private static class C9330b {

            /* renamed from: c */
            private static transient /* synthetic */ boolean[] f24709c;

            /* renamed from: a */
            TextView f24710a;

            /* renamed from: b */
            TextView f24711b;

            private C9330b() {
                m43675a()[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m43675a() {
                boolean[] zArr = f24709c;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(7750361096981633547L, "com/instabug/bug/view/disclaimer/DisclaimerListAdapter$ViewHolder", 2);
                f24709c = a;
                return a;
            }

            /* synthetic */ C9330b(C9329a aVar) {
                boolean[] a = m43675a();
                this();
                a[1] = true;
            }
        }

        public C9328g(Context context, ArrayList<C9322c> arrayList) {
            boolean[] a = m43673a();
            this.f24707a = context;
            this.f24708b = arrayList;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43673a() {
            boolean[] zArr = f24706N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(1973661256925021057L, "com/instabug/bug/view/disclaimer/DisclaimerListAdapter", 20);
            f24706N = a;
            return a;
        }

        /* renamed from: a */
        public C9322c mo33730a(int i) {
            C9322c cVar = (C9322c) this.f24708b.get(i);
            m43673a()[2] = true;
            return cVar;
        }

        public int getCount() {
            boolean[] a = m43673a();
            int size = this.f24708b.size();
            a[1] = true;
            return size;
        }

        public /* synthetic */ Object getItem(int i) {
            boolean[] a = m43673a();
            C9322c a2 = mo33730a(i);
            a[19] = true;
            return a2;
        }

        public long getItemId(int i) {
            long j = (long) i;
            m43673a()[3] = true;
            return j;
        }

        public android.view.View getView(int i, android.view.View view, ViewGroup viewGroup) {
            android.view.View view2;
            C9330b bVar;
            CharSequence charSequence;
            String str;
            boolean[] a = m43673a();
            C9322c a2 = mo33730a(i);
            if (view == null) {
                a[4] = true;
                bVar = new C9330b(null);
                a[5] = true;
                LayoutInflater from = LayoutInflater.from(this.f24707a);
                a[6] = true;
                view2 = from.inflate(C9700R.layout.instabug_lyt_item_disclaimer, viewGroup, false);
                a[7] = true;
                bVar.f24710a = (TextView) view2.findViewById(C9700R.C9704id.tvKey);
                a[8] = true;
                bVar.f24711b = (TextView) view2.findViewById(C9700R.C9704id.tvValue);
                a[9] = true;
                view2.setTag(bVar);
                a[10] = true;
            } else {
                C9330b bVar2 = (C9330b) view.getTag();
                a[11] = true;
                C9330b bVar3 = bVar2;
                view2 = view;
                bVar = bVar3;
            }
            CharSequence a3 = a2.mo33724a();
            a[12] = true;
            if (a2.mo33728e()) {
                a[13] = true;
                SpannableString spannableString = new SpannableString(a3);
                a[14] = true;
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
                a[15] = true;
                str = "";
                charSequence = spannableString;
            } else {
                str = String.valueOf(a2.mo33727d());
                a[16] = true;
                charSequence = a3;
            }
            bVar.f24710a.setText(charSequence);
            a[17] = true;
            bVar.f24711b.setText(str);
            a[18] = true;
            return view2;
        }
    }
}
