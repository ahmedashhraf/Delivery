package com.clevertap.android.sdk;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import androidx.viewpager.widget.ViewPager;
import org.json.JSONObject;

/* renamed from: com.clevertap.android.sdk.e0 */
/* compiled from: CTInboxButtonClickListener */
class C3087e0 implements OnClickListener {

    /* renamed from: N */
    private String f11067N;

    /* renamed from: O */
    private C3100g0 f11068O;

    /* renamed from: P */
    private ViewPager f11069P;

    /* renamed from: Q */
    private JSONObject f11070Q;

    /* renamed from: a */
    private int f11071a;

    /* renamed from: b */
    private CTInboxMessage f11072b;

    C3087e0(int i, CTInboxMessage cTInboxMessage, String str, JSONObject jSONObject, C3100g0 g0Var) {
        this.f11071a = i;
        this.f11072b = cTInboxMessage;
        this.f11067N = str;
        this.f11068O = g0Var;
        this.f11070Q = jSONObject;
    }

    /* renamed from: a */
    private void m14803a(Context context) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        ClipData newPlainText = ClipData.newPlainText(this.f11067N, ((CTInboxMessageContent) this.f11072b.mo12022p().get(0)).mo12040c(this.f11070Q));
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(newPlainText);
            Toast.makeText(context, "Text Copied to Clipboard", 0).show();
        }
    }

    public void onClick(View view) {
        ViewPager viewPager = this.f11069P;
        if (viewPager != null) {
            C3100g0 g0Var = this.f11068O;
            if (g0Var != null) {
                g0Var.mo12266a(this.f11071a, viewPager.getCurrentItem());
            }
        } else if (this.f11067N == null || this.f11070Q == null) {
            C3100g0 g0Var2 = this.f11068O;
            if (g0Var2 != null) {
                g0Var2.mo12267a(this.f11071a, null, null);
            }
        } else if (this.f11068O != null) {
            if (((CTInboxMessageContent) this.f11072b.mo12022p().get(0)).mo12047f(this.f11070Q).equalsIgnoreCase("copy") && this.f11068O.getActivity() != null) {
                m14803a(this.f11068O.getActivity());
            }
            this.f11068O.mo12267a(this.f11071a, this.f11067N, this.f11070Q);
        }
    }

    C3087e0(int i, CTInboxMessage cTInboxMessage, String str, C3100g0 g0Var, ViewPager viewPager) {
        this.f11071a = i;
        this.f11072b = cTInboxMessage;
        this.f11067N = str;
        this.f11068O = g0Var;
        this.f11069P = viewPager;
    }
}
