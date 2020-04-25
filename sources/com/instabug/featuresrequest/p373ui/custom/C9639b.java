package com.instabug.featuresrequest.p373ui.custom;

import android.app.Dialog;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import androidx.core.content.C0841b;
import androidx.fragment.app.C1374b;
import com.instabug.featuresrequest.C9525R;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.ui.custom.b */
/* compiled from: DialogProgress */
public class C9639b extends C1374b {

    /* renamed from: N */
    private static transient /* synthetic */ boolean[] f25550N;

    /* renamed from: a */
    private TextView f25551a;

    /* renamed from: b */
    private ProgressBar f25552b;

    public C9639b() {
        m45067c()[0] = true;
    }

    /* renamed from: c */
    private static /* synthetic */ boolean[] m45067c() {
        boolean[] zArr = f25550N;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(3929066069062762180L, "com/instabug/featuresrequest/ui/custom/DialogProgress", 23);
        f25550N = a;
        return a;
    }

    /* renamed from: d */
    public static C9639b m45068d() {
        boolean[] c = m45067c();
        C9639b bVar = new C9639b();
        c[1] = true;
        return bVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean[] c = m45067c();
        Dialog dialog = getDialog();
        c[2] = true;
        if (dialog == null) {
            c[3] = true;
        } else if (getDialog().getWindow() == null) {
            c[4] = true;
        } else {
            c[5] = true;
            getDialog().getWindow().requestFeature(1);
            c[6] = true;
        }
        View inflate = layoutInflater.inflate(C9525R.layout.ib_fr_progress_dialog_layout, viewGroup);
        c[7] = true;
        return inflate;
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        boolean[] c = m45067c();
        super.onViewCreated(view, bundle);
        c[8] = true;
        this.f25551a = (TextView) view.findViewById(C9525R.C9529id.textView);
        c[9] = true;
        this.f25552b = (ProgressBar) view.findViewById(C9525R.C9529id.progressBar);
        c[10] = true;
        Drawable indeterminateDrawable = this.f25552b.getIndeterminateDrawable();
        if (indeterminateDrawable == null) {
            c[11] = true;
        } else {
            c[12] = true;
            int primaryColor = Instabug.getPrimaryColor();
            Mode mode = Mode.SRC_IN;
            c[13] = true;
            indeterminateDrawable.setColorFilter(primaryColor, mode);
            c[14] = true;
        }
        if (Instabug.getTheme() != InstabugColorTheme.InstabugColorThemeDark) {
            c[15] = true;
        } else {
            c[16] = true;
            View findViewById = view.findViewById(C9525R.C9529id.progressDialogLayout);
            c[17] = true;
            int a = C0841b.m4915a(view.getContext(), C9525R.C9527color.instabug_dialog_dark_bg_color);
            c[18] = true;
            findViewById.setBackgroundColor(a);
            c[19] = true;
            this.f25551a.setTextColor(C0841b.m4915a(view.getContext(), 17170443));
            c[20] = true;
            this.f25551a.setBackgroundColor(C0841b.m4915a(view.getContext(), C9525R.C9527color.instabug_dialog_dark_bg_color));
            c[21] = true;
        }
        c[22] = true;
    }
}
