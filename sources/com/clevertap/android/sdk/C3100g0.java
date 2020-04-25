package com.clevertap.android.sdk;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.C1712h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.clevertap.android.sdk.g0 */
/* compiled from: CTInboxListViewFragment */
public class C3100g0 extends Fragment {

    /* renamed from: N */
    boolean f11118N = C3150p0.f11245g1;

    /* renamed from: O */
    CTInboxStyleConfig f11119O;

    /* renamed from: P */
    private WeakReference<C3102b> f11120P;

    /* renamed from: Q */
    LinearLayout f11121Q;

    /* renamed from: R */
    private boolean f11122R = true;

    /* renamed from: S */
    private int f11123S;

    /* renamed from: T */
    C3124k1 f11124T;

    /* renamed from: U */
    RecyclerView f11125U;

    /* renamed from: a */
    ArrayList<CTInboxMessage> f11126a = new ArrayList<>();

    /* renamed from: b */
    CleverTapInstanceConfig f11127b;

    /* renamed from: com.clevertap.android.sdk.g0$a */
    /* compiled from: CTInboxListViewFragment */
    class C3101a implements Runnable {
        C3101a() {
        }

        public void run() {
            C3100g0.this.f11124T.mo12342c();
        }
    }

    /* renamed from: com.clevertap.android.sdk.g0$b */
    /* compiled from: CTInboxListViewFragment */
    interface C3102b {
        /* renamed from: a */
        void mo11999a(Context context, CTInboxMessage cTInboxMessage, Bundle bundle);

        /* renamed from: b */
        void mo12002b(Context context, CTInboxMessage cTInboxMessage, Bundle bundle);
    }

    /* renamed from: y */
    private boolean m14848y() {
        return this.f11123S <= 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12269a(C3102b bVar) {
        this.f11120P = new WeakReference<>(bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo12271b(Bundle bundle, int i) {
        C3102b w = mo12273w();
        if (w != null) {
            w.mo11999a(getActivity().getBaseContext(), (CTInboxMessage) this.f11126a.get(i), bundle);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo12272g(String str) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Throwable unused) {
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f11127b = (CleverTapInstanceConfig) arguments.getParcelable("config");
            this.f11119O = (CTInboxStyleConfig) arguments.getParcelable("styleConfig");
            this.f11123S = arguments.getInt("position", -1);
            String string = arguments.getString("filter", null);
            if (context instanceof CTInboxActivity) {
                mo12269a((C3102b) getActivity());
            }
            C3150p0 b = C3150p0.m15209b((Context) getActivity(), this.f11127b);
            if (b != null) {
                ArrayList<CTInboxMessage> d = b.mo12473d();
                if (string != null) {
                    d = m14847a(d, string);
                }
                this.f11126a = d;
            }
        }
    }

    @C0195i0
    public View onCreateView(@C0193h0 LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, @C0195i0 Bundle bundle) {
        View inflate = layoutInflater.inflate(C3058R.layout.inbox_list_view, viewGroup, false);
        this.f11121Q = (LinearLayout) inflate.findViewById(C3058R.C3061id.list_view_linear_layout);
        this.f11121Q.setBackgroundColor(Color.parseColor(this.f11119O.mo12070b()));
        TextView textView = (TextView) inflate.findViewById(C3058R.C3061id.list_view_no_message_view);
        if (this.f11126a.size() <= 0) {
            textView.setVisibility(0);
            return inflate;
        }
        textView.setVisibility(8);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        C3113i0 i0Var = new C3113i0(this.f11126a, this);
        if (this.f11118N) {
            this.f11124T = new C3124k1(getActivity());
            mo12270a(this.f11124T);
            this.f11124T.setVisibility(0);
            this.f11124T.setLayoutManager(linearLayoutManager);
            this.f11124T.addItemDecoration(new C3258z1(18));
            this.f11124T.setItemAnimator(new C1712h());
            this.f11124T.setAdapter(i0Var);
            i0Var.mo7341e();
            this.f11121Q.addView(this.f11124T);
            if (this.f11122R && m14848y()) {
                new Handler(Looper.getMainLooper()).postDelayed(new C3101a(), 1000);
                this.f11122R = false;
            }
        } else {
            this.f11125U = (RecyclerView) inflate.findViewById(C3058R.C3061id.list_view_recycler_view);
            this.f11125U.setVisibility(0);
            this.f11125U.setLayoutManager(linearLayoutManager);
            this.f11125U.addItemDecoration(new C3258z1(18));
            this.f11125U.setItemAnimator(new C1712h());
            this.f11125U.setAdapter(i0Var);
            i0Var.mo7341e();
        }
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        C3124k1 k1Var = this.f11124T;
        if (k1Var != null) {
            k1Var.mo12343d();
        }
    }

    public void onPause() {
        super.onPause();
        C3124k1 k1Var = this.f11124T;
        if (k1Var != null) {
            k1Var.mo12340a();
        }
    }

    public void onResume() {
        super.onResume();
        C3124k1 k1Var = this.f11124T;
        if (k1Var != null) {
            k1Var.mo12341b();
        }
    }

    public void onSaveInstanceState(@C0193h0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C3124k1 k1Var = this.f11124T;
        String str = "recyclerLayoutState";
        if (!(k1Var == null || k1Var.getLayoutManager() == null)) {
            bundle.putParcelable(str, this.f11124T.getLayoutManager().mo6954D());
        }
        RecyclerView recyclerView = this.f11125U;
        if (recyclerView != null && recyclerView.getLayoutManager() != null) {
            bundle.putParcelable(str, this.f11125U.getLayoutManager().mo6954D());
        }
    }

    public void onViewStateRestored(@C0195i0 Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("recyclerLayoutState");
            C3124k1 k1Var = this.f11124T;
            if (!(k1Var == null || k1Var.getLayoutManager() == null)) {
                this.f11124T.getLayoutManager().mo6978a(parcelable);
            }
            RecyclerView recyclerView = this.f11125U;
            if (recyclerView != null && recyclerView.getLayoutManager() != null) {
                this.f11125U.getLayoutManager().mo6978a(parcelable);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public C3102b mo12273w() {
        C3102b bVar;
        try {
            bVar = (C3102b) this.f11120P.get();
        } catch (Throwable unused) {
            bVar = null;
        }
        if (bVar == null) {
            C3111h1.m14938f("InboxListener is null for messages");
        }
        return bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public C3124k1 mo12274x() {
        return this.f11124T;
    }

    /* renamed from: a */
    private ArrayList<CTInboxMessage> m14847a(ArrayList<CTInboxMessage> arrayList, String str) {
        ArrayList<CTInboxMessage> arrayList2 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CTInboxMessage cTInboxMessage = (CTInboxMessage) it.next();
            if (cTInboxMessage.mo12025s() != null && cTInboxMessage.mo12025s().size() > 0) {
                for (String equalsIgnoreCase : cTInboxMessage.mo12025s()) {
                    if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                        arrayList2.add(cTInboxMessage);
                    }
                }
            }
        }
        return arrayList2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12268a(Bundle bundle, int i) {
        C3102b w = mo12273w();
        if (w != null) {
            w.mo12002b(getActivity().getBaseContext(), (CTInboxMessage) this.f11126a.get(i), bundle);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12267a(int i, String str, JSONObject jSONObject) {
        try {
            Bundle bundle = new Bundle();
            JSONObject v = ((CTInboxMessage) this.f11126a.get(i)).mo12028v();
            Iterator keys = v.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                if (str2.startsWith("wzrk_")) {
                    bundle.putString(str2, v.getString(str2));
                }
            }
            if (str != null && !str.isEmpty()) {
                bundle.putString("wzrk_c2a", str);
            }
            mo12268a(bundle, i);
            if (jSONObject == null) {
                String a = ((CTInboxMessageContent) ((CTInboxMessage) this.f11126a.get(i)).mo12022p().get(0)).mo12033a();
                if (a != null) {
                    mo12272g(a);
                }
            } else if (!((CTInboxMessageContent) ((CTInboxMessage) this.f11126a.get(i)).mo12022p().get(0)).mo12047f(jSONObject).equalsIgnoreCase("copy")) {
                String e = ((CTInboxMessageContent) ((CTInboxMessage) this.f11126a.get(i)).mo12022p().get(0)).mo12045e(jSONObject);
                if (e != null) {
                    mo12272g(e);
                }
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error handling notification button click: ");
            sb.append(th.getCause());
            C3111h1.m14930d(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12266a(int i, int i2) {
        try {
            Bundle bundle = new Bundle();
            JSONObject v = ((CTInboxMessage) this.f11126a.get(i)).mo12028v();
            Iterator keys = v.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                if (str.startsWith("wzrk_")) {
                    bundle.putString(str, v.getString(str));
                }
            }
            mo12268a(bundle, i);
            mo12272g(((CTInboxMessageContent) ((CTInboxMessage) this.f11126a.get(i)).mo12022p().get(i2)).mo12033a());
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error handling notification button click: ");
            sb.append(th.getCause());
            C3111h1.m14930d(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12270a(C3124k1 k1Var) {
        this.f11124T = k1Var;
    }
}
