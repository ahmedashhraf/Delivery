package com.instabug.featuresrequest.p373ui.custom;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import androidx.fragment.app.C1374b;
import com.instabug.featuresrequest.C9525R;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugCustomTextPlaceHolder.Key;
import com.instabug.library.util.PlaceHolderUtils;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.ui.custom.e */
/* compiled from: ThanksDialog */
public class C9657e extends C1374b {

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f25597b;

    /* renamed from: a */
    private TextView f25598a;

    /* renamed from: com.instabug.featuresrequest.ui.custom.e$a */
    /* compiled from: ThanksDialog */
    class C9658a implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25599b;

        /* renamed from: a */
        final /* synthetic */ C9657e f25600a;

        C9658a(C9657e eVar) {
            boolean[] a = m45150a();
            this.f25600a = eVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45150a() {
            boolean[] zArr = f25599b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-7416591326757237325L, "com/instabug/featuresrequest/ui/custom/ThanksDialog$1", 6);
            f25599b = a;
            return a;
        }

        public void run() {
            boolean[] a = m45150a();
            if (!this.f25600a.isResumed()) {
                a[1] = true;
            } else if (!this.f25600a.isAdded()) {
                a[2] = true;
            } else {
                a[3] = true;
                this.f25600a.dismiss();
                a[4] = true;
            }
            a[5] = true;
        }
    }

    public C9657e() {
        m45148c()[0] = true;
    }

    /* renamed from: c */
    private static /* synthetic */ boolean[] m45148c() {
        boolean[] zArr = f25597b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-2823891246361155664L, "com/instabug/featuresrequest/ui/custom/ThanksDialog", 15);
        f25597b = a;
        return a;
    }

    /* renamed from: d */
    public static C9657e m45149d() {
        boolean[] c = m45148c();
        C9657e eVar = new C9657e();
        c[1] = true;
        return eVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean[] c = m45148c();
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
        View inflate = layoutInflater.inflate(C9525R.layout.ib_fr_thanks_dialog, viewGroup);
        c[7] = true;
        return inflate;
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        boolean[] c = m45148c();
        super.onViewCreated(view, bundle);
        c[8] = true;
        this.f25598a = (TextView) view.findViewById(C9525R.C9529id.feature_request_add_feature_thanks_msg);
        TextView textView = this.f25598a;
        Key key = Key.FEATURES_REQUEST_ADD_FEATURE_THANKS_MESSAGE;
        int i = C9525R.string.feature_request_str_thanks_msg;
        c[9] = true;
        String string = getString(i);
        c[10] = true;
        textView.setText(PlaceHolderUtils.getPlaceHolder(key, string));
        c[11] = true;
        ImageView imageView = (ImageView) view.findViewById(C9525R.C9529id.instabug_img_thanks);
        c[12] = true;
        imageView.setColorFilter(Instabug.getPrimaryColor());
        c[13] = true;
        new Handler().postDelayed(new C9658a(this), 3000);
        c[14] = true;
    }
}
