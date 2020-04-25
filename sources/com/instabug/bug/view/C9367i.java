package com.instabug.bug.view;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import androidx.annotation.C0224v0;
import androidx.core.content.C0841b;
import androidx.fragment.app.C1374b;
import androidx.vectordrawable.p051a.p052a.C1979i;
import com.instabug.bug.C9231R;
import com.instabug.library.C9700R;
import com.instabug.library.Feature;
import com.instabug.library.Feature.State;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.InstabugCustomTextPlaceHolder.Key;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.util.AttrResolver;
import com.instabug.library.util.Colorizer;
import com.instabug.library.util.DrawableUtils;
import com.instabug.library.util.InstabugAppData;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.PlaceHolderUtils;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.bug.view.i */
/* compiled from: InstabugThanksFragment */
public class C9367i extends C1374b {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f24802a;

    /* renamed from: com.instabug.bug.view.i$a */
    /* compiled from: InstabugThanksFragment */
    class C9368a implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24803b;

        /* renamed from: a */
        final /* synthetic */ C9367i f24804a;

        C9368a(C9367i iVar) {
            boolean[] a = m43859a();
            this.f24804a = iVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43859a() {
            boolean[] zArr = f24803b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(98027176752384155L, "com/instabug/bug/view/InstabugThanksFragment$1", 5);
            f24803b = a;
            return a;
        }

        public void run() {
            boolean[] a = m43859a();
            if (this.f24804a.getActivity() == null) {
                a[1] = true;
            } else {
                a[2] = true;
                this.f24804a.getActivity().finish();
                a[3] = true;
            }
            a[4] = true;
        }
    }

    /* renamed from: com.instabug.bug.view.i$b */
    /* compiled from: InstabugThanksFragment */
    class C9369b implements OnClickListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24805b;

        /* renamed from: a */
        final /* synthetic */ C9367i f24806a;

        C9369b(C9367i iVar) {
            boolean[] a = m43860a();
            this.f24806a = iVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43860a() {
            boolean[] zArr = f24805b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7653175408570335624L, "com/instabug/bug/view/InstabugThanksFragment$2", 5);
            f24805b = a;
            return a;
        }

        public void onClick(View view) {
            boolean[] a = m43860a();
            if (this.f24806a.getActivity() == null) {
                a[1] = true;
            } else {
                a[2] = true;
                this.f24806a.getActivity().finish();
                a[3] = true;
            }
            a[4] = true;
        }
    }

    public C9367i() {
        m43856e()[0] = true;
    }

    /* renamed from: d */
    public static C9367i m43855d() {
        boolean[] e = m43856e();
        C9367i iVar = new C9367i();
        e[1] = true;
        Bundle bundle = new Bundle();
        e[2] = true;
        iVar.setArguments(bundle);
        e[3] = true;
        return iVar;
    }

    /* renamed from: e */
    private static /* synthetic */ boolean[] m43856e() {
        boolean[] zArr = f24802a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-7508254159076089297L, "com/instabug/bug/view/InstabugThanksFragment", 50);
        f24802a = a;
        return a;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: a */
    public void mo33806a(View view) {
        boolean[] e = m43856e();
        if (InstabugCore.getFeatureState(Feature.WHITE_LABELING) == State.ENABLED) {
            e[31] = true;
            view.findViewById(C9231R.C9235id.instabug_pbi_container).setVisibility(8);
            e[32] = true;
        } else {
            view.findViewById(C9231R.C9235id.instabug_pbi_container).setVisibility(0);
            e[33] = true;
            ImageView imageView = (ImageView) view.findViewById(C9231R.C9235id.image_instabug_logo);
            e[34] = true;
            int a = C0841b.m4915a(getContext(), 17170443);
            e[35] = true;
            C1979i a2 = C1979i.m10338a(getContext().getResources(), C9231R.C9234drawable.ic_instabug_logo, getActivity().getTheme());
            e[36] = true;
            imageView.setBackgroundDrawable(Colorizer.getTintedDrawable(a, a2));
            e[37] = true;
        }
        e[38] = true;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: c */
    public String mo33807c() {
        boolean[] e = m43856e();
        String appName = new InstabugAppData(getActivity().getApplicationContext()).getAppName();
        if (appName != null) {
            e[44] = true;
        } else {
            e[45] = true;
            InstabugSDKLogger.m46627w(this, "It seems app:name isn't defined in your manifest. Using a generic name instead");
            e[46] = true;
        }
        int i = C9231R.string.instabug_str_success_note;
        Object[] objArr = new Object[1];
        if (appName == null) {
            e[47] = true;
            appName = "App";
        } else {
            e[48] = true;
        }
        objArr[0] = appName;
        String string = getString(i, objArr);
        e[49] = true;
        return string;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        boolean[] e = m43856e();
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        e[7] = true;
        onCreateDialog.getWindow().requestFeature(1);
        e[8] = true;
        return onCreateDialog;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean[] e = m43856e();
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        e[9] = true;
        new Handler().postDelayed(new C9368a(this), 4000);
        e[10] = true;
        View inflate = layoutInflater.inflate(C9231R.layout.ib_bug_lyt_thanks, viewGroup);
        e[11] = true;
        return inflate;
    }

    public void onDestroy() {
        boolean[] e = m43856e();
        super.onDestroy();
        e[39] = true;
        if (getActivity() == null) {
            e[40] = true;
        } else {
            e[41] = true;
            getActivity().finish();
            e[42] = true;
        }
        e[43] = true;
    }

    public void onStart() {
        boolean[] e = m43856e();
        super.onStart();
        e[4] = true;
        if (getDialog() == null) {
            e[5] = true;
            return;
        }
        getDialog().getWindow().setWindowAnimations(C9231R.style.InstabugDialogAnimation);
        e[6] = true;
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        boolean[] e = m43856e();
        super.onViewCreated(view, bundle);
        e[12] = true;
        View findViewById = view.findViewById(C9231R.C9235id.ib_success_layout);
        e[13] = true;
        int color = AttrResolver.getColor(getContext(), C9231R.attr.instabug_background_color);
        e[14] = true;
        DrawableUtils.setColor(findViewById, color);
        Key key = Key.REPORT_SUCCESSFULLY_SENT;
        e[15] = true;
        String placeHolder = PlaceHolderUtils.getPlaceHolder(key, mo33807c());
        e[16] = true;
        TextView textView = (TextView) view.findViewById(C9231R.C9235id.instabug_txt_success_note);
        e[17] = true;
        textView.setText(placeHolder);
        e[18] = true;
        mo33806a(view);
        e[19] = true;
        TextView textView2 = (TextView) view.findViewById(C9700R.C9704id.instabug_fragment_title);
        e[20] = true;
        textView2.setText(PlaceHolderUtils.getPlaceHolder(Key.SUCCESS_DIALOG_HEADER, getString(C9231R.string.instabug_str_thank_you)));
        e[21] = true;
        ImageView imageView = (ImageView) view.findViewById(C9231R.C9235id.instabug_img_thanks);
        e[22] = true;
        if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
            e[23] = true;
            textView2.setTextColor(Instabug.getPrimaryColor());
            e[24] = true;
        } else {
            textView2.setTextColor(C0841b.m4915a(getContext(), 17170443));
            e[25] = true;
        }
        imageView.setColorFilter(Instabug.getPrimaryColor());
        e[26] = true;
        Drawable c = C0841b.m4928c(getContext(), C9231R.C9234drawable.ib_bug_shape_thanks_background);
        e[27] = true;
        Drawable primaryColorTintedDrawable = Colorizer.getPrimaryColorTintedDrawable(c);
        e[28] = true;
        imageView.setBackgroundDrawable(primaryColorTintedDrawable);
        e[29] = true;
        view.setOnClickListener(new C9369b(this));
        e[30] = true;
    }
}
