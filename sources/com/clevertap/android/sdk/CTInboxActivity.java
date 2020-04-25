package com.clevertap.android.sdk;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.fragment.app.C1376c;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.C7051h;
import com.google.android.material.tabs.TabLayout.C7056k;
import java.lang.ref.WeakReference;

public class CTInboxActivity extends C1376c implements C3102b {

    /* renamed from: R */
    static int f10825R;

    /* renamed from: N */
    ViewPager f10826N;

    /* renamed from: O */
    CTInboxStyleConfig f10827O;

    /* renamed from: P */
    private CleverTapInstanceConfig f10828P;

    /* renamed from: Q */
    private WeakReference<C3040c> f10829Q;

    /* renamed from: a */
    C3123k0 f10830a;

    /* renamed from: b */
    TabLayout f10831b;

    /* renamed from: com.clevertap.android.sdk.CTInboxActivity$a */
    class C3038a implements OnClickListener {
        C3038a() {
        }

        public void onClick(View view) {
            CTInboxActivity.this.finish();
        }
    }

    /* renamed from: com.clevertap.android.sdk.CTInboxActivity$b */
    class C3039b implements C7051h {
        C3039b() {
        }

        /* renamed from: a */
        public void mo12005a(C7056k kVar) {
        }

        /* renamed from: b */
        public void mo12006b(C7056k kVar) {
            C3100g0 g0Var = (C3100g0) CTInboxActivity.this.f10830a.mo6388c(kVar.mo28203f());
            if (g0Var != null && g0Var.mo12274x() != null) {
                g0Var.mo12274x().mo12341b();
            }
        }

        /* renamed from: c */
        public void mo12007c(C7056k kVar) {
            C3100g0 g0Var = (C3100g0) CTInboxActivity.this.f10830a.mo6388c(kVar.mo28203f());
            if (g0Var != null && g0Var.mo12274x() != null) {
                g0Var.mo12274x().mo12340a();
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.CTInboxActivity$c */
    interface C3040c {
        /* renamed from: a */
        void mo12008a(CTInboxActivity cTInboxActivity, CTInboxMessage cTInboxMessage, Bundle bundle);

        /* renamed from: b */
        void mo12009b(CTInboxActivity cTInboxActivity, CTInboxMessage cTInboxMessage, Bundle bundle);
    }

    /* renamed from: D */
    private String m14549D() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10828P.mo12093a());
        sb.append(":CT_INBOX_LIST_VIEW_FRAGMENT");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C */
    public C3040c mo11998C() {
        C3040c cVar;
        try {
            cVar = (C3040c) this.f10829Q.get();
        } catch (Throwable unused) {
            cVar = null;
        }
        if (cVar == null) {
            this.f10828P.mo12108l().mo12315c(this.f10828P.mo12093a(), "InboxActivityListener is null for notification inbox ");
        }
        return cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12001a(C3040c cVar) {
        this.f10829Q = new WeakReference<>(cVar);
    }

    /* renamed from: b */
    public void mo12002b(Context context, CTInboxMessage cTInboxMessage, Bundle bundle) {
        mo12000a(bundle, cTInboxMessage);
    }

    /* JADX WARNING: type inference failed for: r0v18, types: [com.google.android.material.tabs.TabLayout$e, com.clevertap.android.sdk.CTInboxActivity$b] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v18, types: [com.google.android.material.tabs.TabLayout$e, com.clevertap.android.sdk.CTInboxActivity$b]
      assigns: [com.clevertap.android.sdk.CTInboxActivity$b]
      uses: [com.google.android.material.tabs.TabLayout$e]
      mth insns count: 195
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            java.lang.String r0 = "config"
            java.lang.String r1 = "styleConfig"
            super.onCreate(r7)
            android.content.Intent r7 = r6.getIntent()     // Catch:{ all -> 0x0237 }
            android.os.Bundle r7 = r7.getExtras()     // Catch:{ all -> 0x0237 }
            if (r7 == 0) goto L_0x0231
            android.os.Parcelable r2 = r7.getParcelable(r1)     // Catch:{ all -> 0x0237 }
            com.clevertap.android.sdk.CTInboxStyleConfig r2 = (com.clevertap.android.sdk.CTInboxStyleConfig) r2     // Catch:{ all -> 0x0237 }
            r6.f10827O = r2     // Catch:{ all -> 0x0237 }
            android.os.Parcelable r7 = r7.getParcelable(r0)     // Catch:{ all -> 0x0237 }
            com.clevertap.android.sdk.CleverTapInstanceConfig r7 = (com.clevertap.android.sdk.CleverTapInstanceConfig) r7     // Catch:{ all -> 0x0237 }
            r6.f10828P = r7     // Catch:{ all -> 0x0237 }
            android.content.Context r7 = r6.getApplicationContext()     // Catch:{ all -> 0x0237 }
            com.clevertap.android.sdk.CleverTapInstanceConfig r2 = r6.f10828P     // Catch:{ all -> 0x0237 }
            com.clevertap.android.sdk.p0 r7 = com.clevertap.android.sdk.C3150p0.m15209b(r7, r2)     // Catch:{ all -> 0x0237 }
            if (r7 == 0) goto L_0x0030
            r6.mo12001a(r7)     // Catch:{ all -> 0x0237 }
        L_0x0030:
            android.content.res.Resources r2 = r6.getResources()     // Catch:{ all -> 0x0237 }
            android.content.res.Configuration r2 = r2.getConfiguration()     // Catch:{ all -> 0x0237 }
            int r2 = r2.orientation     // Catch:{ all -> 0x0237 }
            f10825R = r2     // Catch:{ all -> 0x0237 }
            int r2 = com.clevertap.android.sdk.C3058R.layout.inbox_activity
            r6.setContentView(r2)
            int r2 = com.clevertap.android.sdk.C3058R.C3061id.toolbar
            android.view.View r2 = r6.findViewById(r2)
            androidx.appcompat.widget.Toolbar r2 = (androidx.appcompat.widget.Toolbar) r2
            com.clevertap.android.sdk.CTInboxStyleConfig r3 = r6.f10827O
            java.lang.String r3 = r3.mo12079i()
            r2.setTitle(r3)
            com.clevertap.android.sdk.CTInboxStyleConfig r3 = r6.f10827O
            java.lang.String r3 = r3.mo12081j()
            int r3 = android.graphics.Color.parseColor(r3)
            r2.setTitleTextColor(r3)
            com.clevertap.android.sdk.CTInboxStyleConfig r3 = r6.f10827O
            java.lang.String r3 = r3.mo12071c()
            int r3 = android.graphics.Color.parseColor(r3)
            r2.setBackgroundColor(r3)
            android.content.res.Resources r3 = r6.getResources()
            int r4 = com.clevertap.android.sdk.C3058R.C3060drawable.ct_ic_arrow_back_white_24dp
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r4)
            com.clevertap.android.sdk.CTInboxStyleConfig r4 = r6.f10827O
            java.lang.String r4 = r4.mo12067a()
            int r4 = android.graphics.Color.parseColor(r4)
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.SRC_IN
            r3.setColorFilter(r4, r5)
            r2.setNavigationIcon(r3)
            com.clevertap.android.sdk.CTInboxActivity$a r3 = new com.clevertap.android.sdk.CTInboxActivity$a
            r3.<init>()
            r2.setNavigationOnClickListener(r3)
            int r2 = com.clevertap.android.sdk.C3058R.C3061id.inbox_linear_layout
            android.view.View r2 = r6.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            com.clevertap.android.sdk.CTInboxStyleConfig r3 = r6.f10827O
            java.lang.String r3 = r3.mo12070b()
            int r3 = android.graphics.Color.parseColor(r3)
            r2.setBackgroundColor(r3)
            int r3 = com.clevertap.android.sdk.C3058R.C3061id.tab_layout
            android.view.View r3 = r2.findViewById(r3)
            com.google.android.material.tabs.TabLayout r3 = (com.google.android.material.tabs.TabLayout) r3
            r6.f10831b = r3
            int r3 = com.clevertap.android.sdk.C3058R.C3061id.view_pager
            android.view.View r2 = r2.findViewById(r3)
            androidx.viewpager.widget.ViewPager r2 = (androidx.viewpager.widget.ViewPager) r2
            r6.f10826N = r2
            int r2 = com.clevertap.android.sdk.C3058R.C3061id.no_message_view
            android.view.View r2 = r6.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            com.clevertap.android.sdk.CleverTapInstanceConfig r4 = r6.f10828P
            r3.putParcelable(r0, r4)
            com.clevertap.android.sdk.CTInboxStyleConfig r0 = r6.f10827O
            r3.putParcelable(r1, r0)
            com.clevertap.android.sdk.CTInboxStyleConfig r0 = r6.f10827O
            boolean r0 = r0.mo12088p()
            r1 = 1
            r4 = 0
            if (r0 != 0) goto L_0x015d
            androidx.viewpager.widget.ViewPager r0 = r6.f10826N
            r5 = 8
            r0.setVisibility(r5)
            com.google.android.material.tabs.TabLayout r0 = r6.f10831b
            r0.setVisibility(r5)
            int r0 = com.clevertap.android.sdk.C3058R.C3061id.list_view_fragment
            android.view.View r0 = r6.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r0.setVisibility(r4)
            if (r7 == 0) goto L_0x010b
            int r7 = r7.mo12486k()
            if (r7 != 0) goto L_0x010b
            com.clevertap.android.sdk.CTInboxStyleConfig r7 = r6.f10827O
            java.lang.String r7 = r7.mo12070b()
            int r7 = android.graphics.Color.parseColor(r7)
            r2.setBackgroundColor(r7)
            r2.setVisibility(r4)
            goto L_0x0230
        L_0x010b:
            r2.setVisibility(r5)
            androidx.fragment.app.h r7 = r6.getSupportFragmentManager()
            java.util.List r7 = r7.mo6240e()
            java.util.Iterator r7 = r7.iterator()
        L_0x011a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x013c
            java.lang.Object r0 = r7.next()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            java.lang.String r2 = r0.getTag()
            if (r2 == 0) goto L_0x011a
            java.lang.String r0 = r0.getTag()
            java.lang.String r2 = r6.m14549D()
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L_0x011a
            r4 = 1
            goto L_0x011a
        L_0x013c:
            if (r4 != 0) goto L_0x0230
            com.clevertap.android.sdk.g0 r7 = new com.clevertap.android.sdk.g0
            r7.<init>()
            r7.setArguments(r3)
            androidx.fragment.app.h r0 = r6.getSupportFragmentManager()
            androidx.fragment.app.n r0 = r0.mo6224a()
            int r1 = com.clevertap.android.sdk.C3058R.C3061id.list_view_fragment
            java.lang.String r2 = r6.m14549D()
            androidx.fragment.app.n r7 = r0.mo6395a(r1, r7, r2)
            r7.mo6097e()
            goto L_0x0230
        L_0x015d:
            androidx.viewpager.widget.ViewPager r7 = r6.f10826N
            r7.setVisibility(r4)
            com.clevertap.android.sdk.CTInboxStyleConfig r7 = r6.f10827O
            java.util.ArrayList r7 = r7.mo12086n()
            com.clevertap.android.sdk.k0 r0 = new com.clevertap.android.sdk.k0
            androidx.fragment.app.h r2 = r6.getSupportFragmentManager()
            int r5 = r7.size()
            int r5 = r5 + r1
            r0.<init>(r2, r5)
            r6.f10830a = r0
            com.google.android.material.tabs.TabLayout r0 = r6.f10831b
            r0.setVisibility(r4)
            com.google.android.material.tabs.TabLayout r0 = r6.f10831b
            r0.setTabGravity(r4)
            com.google.android.material.tabs.TabLayout r0 = r6.f10831b
            r0.setTabMode(r1)
            com.google.android.material.tabs.TabLayout r0 = r6.f10831b
            com.clevertap.android.sdk.CTInboxStyleConfig r1 = r6.f10827O
            java.lang.String r1 = r1.mo12084l()
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setSelectedTabIndicatorColor(r1)
            com.google.android.material.tabs.TabLayout r0 = r6.f10831b
            com.clevertap.android.sdk.CTInboxStyleConfig r1 = r6.f10827O
            java.lang.String r1 = r1.mo12087o()
            int r1 = android.graphics.Color.parseColor(r1)
            com.clevertap.android.sdk.CTInboxStyleConfig r2 = r6.f10827O
            java.lang.String r2 = r2.mo12083k()
            int r2 = android.graphics.Color.parseColor(r2)
            r0.mo28100a(r1, r2)
            com.google.android.material.tabs.TabLayout r0 = r6.f10831b
            com.clevertap.android.sdk.CTInboxStyleConfig r1 = r6.f10827O
            java.lang.String r1 = r1.mo12085m()
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setBackgroundColor(r1)
            java.lang.Object r0 = r3.clone()
            android.os.Bundle r0 = (android.os.Bundle) r0
            java.lang.String r1 = "position"
            r0.putInt(r1, r4)
            com.clevertap.android.sdk.g0 r2 = new com.clevertap.android.sdk.g0
            r2.<init>()
            r2.setArguments(r0)
            com.clevertap.android.sdk.k0 r0 = r6.f10830a
            java.lang.String r5 = "ALL"
            r0.mo12339a(r2, r5, r4)
        L_0x01d8:
            int r0 = r7.size()
            if (r4 >= r0) goto L_0x0207
            java.lang.Object r0 = r7.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            int r4 = r4 + 1
            java.lang.Object r2 = r3.clone()
            android.os.Bundle r2 = (android.os.Bundle) r2
            r2.putInt(r1, r4)
            java.lang.String r5 = "filter"
            r2.putString(r5, r0)
            com.clevertap.android.sdk.g0 r5 = new com.clevertap.android.sdk.g0
            r5.<init>()
            r5.setArguments(r2)
            com.clevertap.android.sdk.k0 r2 = r6.f10830a
            r2.mo12339a(r5, r0, r4)
            androidx.viewpager.widget.ViewPager r0 = r6.f10826N
            r0.setOffscreenPageLimit(r4)
            goto L_0x01d8
        L_0x0207:
            androidx.viewpager.widget.ViewPager r7 = r6.f10826N
            com.clevertap.android.sdk.k0 r0 = r6.f10830a
            r7.setAdapter(r0)
            com.clevertap.android.sdk.k0 r7 = r6.f10830a
            r7.mo8894b()
            androidx.viewpager.widget.ViewPager r7 = r6.f10826N
            com.google.android.material.tabs.TabLayout$n r0 = new com.google.android.material.tabs.TabLayout$n
            com.google.android.material.tabs.TabLayout r1 = r6.f10831b
            r0.<init>(r1)
            r7.addOnPageChangeListener(r0)
            com.google.android.material.tabs.TabLayout r7 = r6.f10831b
            com.clevertap.android.sdk.CTInboxActivity$b r0 = new com.clevertap.android.sdk.CTInboxActivity$b
            r0.<init>()
            r7.mo28103a(r0)
            com.google.android.material.tabs.TabLayout r7 = r6.f10831b
            androidx.viewpager.widget.ViewPager r0 = r6.f10826N
            r7.setupWithViewPager(r0)
        L_0x0230:
            return
        L_0x0231:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0237 }
            r7.<init>()     // Catch:{ all -> 0x0237 }
            throw r7     // Catch:{ all -> 0x0237 }
        L_0x0237:
            r7 = move-exception
            java.lang.String r0 = "Cannot find a valid notification inbox bundle to show!"
            com.clevertap.android.sdk.C3111h1.m14941f(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.CTInboxActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        if (this.f10827O.mo12088p()) {
            for (Fragment fragment : getSupportFragmentManager().mo6240e()) {
                if (fragment instanceof C3100g0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Removing fragment - ");
                    sb.append(fragment.toString());
                    C3111h1.m14938f(sb.toString());
                    getSupportFragmentManager().mo6240e().remove(fragment);
                }
            }
        }
        super.onDestroy();
    }

    /* renamed from: a */
    public void mo11999a(Context context, CTInboxMessage cTInboxMessage, Bundle bundle) {
        mo12003b(bundle, cTInboxMessage);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo12003b(Bundle bundle, CTInboxMessage cTInboxMessage) {
        C3040c C = mo11998C();
        if (C != null) {
            C.mo12008a(this, cTInboxMessage, bundle);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12000a(Bundle bundle, CTInboxMessage cTInboxMessage) {
        C3040c C = mo11998C();
        if (C != null) {
            C.mo12009b(this, cTInboxMessage, bundle);
        }
    }
}
