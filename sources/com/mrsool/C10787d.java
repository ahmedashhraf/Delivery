package com.mrsool;

import android.app.Dialog;
import android.app.NotificationManager;
import android.app.ProgressDialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.C0295d;
import androidx.appcompat.widget.Toolbar;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5887x;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* renamed from: com.mrsool.d */
/* compiled from: BaseActivity */
public class C10787d extends C0295d {

    /* renamed from: N */
    public LinearLayout f29637N;

    /* renamed from: O */
    public ImageView f29638O;

    /* renamed from: P */
    public ImageView f29639P;

    /* renamed from: Q */
    public TextView f29640Q;

    /* renamed from: R */
    public Toolbar f29641R;

    /* renamed from: a */
    public C5887x f29642a;

    /* renamed from: b */
    public ProgressDialog f29643b;

    /* renamed from: com.mrsool.d$a */
    /* compiled from: BaseActivity */
    class C10788a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11757x f29644a;

        C10788a(C11757x xVar) {
            this.f29644a = xVar;
        }

        public void onClick(View view) {
            this.f29644a.mo40265a();
        }
    }

    /* renamed from: com.mrsool.d$b */
    /* compiled from: BaseActivity */
    class C10789b implements OnClickListener {
        C10789b() {
        }

        public void onClick(View view) {
            C10787d.this.onBackPressed();
        }
    }

    /* renamed from: com.mrsool.d$c */
    /* compiled from: BaseActivity */
    class C10790c implements OnClickListener {
        C10790c() {
        }

        public void onClick(View view) {
            C10787d.this.onBackPressed();
        }
    }

    /* renamed from: com.mrsool.d$d */
    /* compiled from: BaseActivity */
    class C10791d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11072p f29649a;

        /* renamed from: b */
        final /* synthetic */ Dialog f29650b;

        C10791d(C11072p pVar, Dialog dialog) {
            this.f29649a = pVar;
            this.f29650b = dialog;
        }

        public void onClick(View view) {
            this.f29649a.mo36571a();
            this.f29650b.dismiss();
        }
    }

    /* renamed from: com.mrsool.d$e */
    /* compiled from: BaseActivity */
    class C10792e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f29651a;

        C10792e(Dialog dialog) {
            this.f29651a = dialog;
        }

        public void onClick(View view) {
            this.f29651a.dismiss();
        }
    }

    /* renamed from: com.mrsool.d$f */
    /* compiled from: BaseActivity */
    class C10793f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f29654a;

        /* renamed from: b */
        final /* synthetic */ C11137q f29655b;

        C10793f(Dialog dialog, C11137q qVar) {
            this.f29654a = dialog;
            this.f29655b = qVar;
        }

        public void onClick(View view) {
            this.f29654a.dismiss();
            C11137q qVar = this.f29655b;
            if (qVar != null) {
                qVar.mo38481b();
            }
        }
    }

    /* renamed from: com.mrsool.d$g */
    /* compiled from: BaseActivity */
    class C10794g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f29657a;

        /* renamed from: b */
        final /* synthetic */ C11137q f29658b;

        C10794g(Dialog dialog, C11137q qVar) {
            this.f29657a = dialog;
            this.f29658b = qVar;
        }

        public void onClick(View view) {
            this.f29657a.dismiss();
            C11137q qVar = this.f29658b;
            if (qVar != null) {
                qVar.mo38480a();
            }
        }
    }

    /* renamed from: C */
    public void mo38396C() {
    }

    /* renamed from: D */
    public void mo38397D() {
        try {
            if (this.f29643b != null && this.f29643b.isShowing()) {
                this.f29643b.dismiss();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: E */
    public void mo38398E() {
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    /* renamed from: G */
    public void mo38399G() {
        setTextRtl(findViewById(C10232R.C10236id.llContainerMain));
        mo38405a((ImageView) findViewById(C10232R.C10236id.ivBack));
    }

    /* renamed from: H */
    public void mo38400H() {
        if (this.f29643b == null) {
            this.f29643b = new ProgressDialog(this);
            this.f29643b.setMessage("Please Wait...");
            this.f29643b.setCancelable(false);
        }
        if (!this.f29643b.isShowing()) {
            this.f29643b.show();
        }
    }

    /* renamed from: I */
    public void mo38401I() {
    }

    /* renamed from: a */
    public void mo38406a(String str, C11757x xVar) {
        this.f29641R = (Toolbar) findViewById(C10232R.C10236id.tbTXT);
        if (this.f29641R != null) {
            this.f29637N = (LinearLayout) findViewById(C10232R.C10236id.llLeft);
            this.f29637N.setOnClickListener(new C10788a(xVar));
            this.f29638O = (ImageView) this.f29641R.findViewById(C10232R.C10236id.ivLeft);
            this.f29638O.setImageResource(C10232R.C10235drawable.back_white);
            this.f29640Q = (TextView) findViewById(C10232R.C10236id.txtTitle);
            this.f29640Q.setText(str);
        }
    }

    /* renamed from: a */
    public void mo38410a(String str, boolean z) {
    }

    /* renamed from: e */
    public void mo38412e(String str) {
        this.f29641R = (Toolbar) findViewById(C10232R.C10236id.tbTXT);
        if (this.f29641R != null) {
            this.f29637N = (LinearLayout) findViewById(C10232R.C10236id.llLeft);
            this.f29637N.setOnClickListener(new C10789b());
            this.f29638O = (ImageView) this.f29641R.findViewById(C10232R.C10236id.ivLeft);
            this.f29638O.setImageResource(C10232R.C10235drawable.back_white);
            this.f29640Q = (TextView) findViewById(C10232R.C10236id.txtTitle);
            this.f29640Q.setText(str);
        }
    }

    /* renamed from: g */
    public void mo38413g(String str) {
        this.f29641R = (Toolbar) findViewById(C10232R.C10236id.toolbar_top);
        Toolbar toolbar = this.f29641R;
        if (toolbar != null) {
            this.f29640Q = (TextView) toolbar.findViewById(C10232R.C10236id.txtTitle);
            this.f29640Q.setText(getResources().getString(C10232R.string.lbl_title_profile));
            this.f29639P = (ImageView) this.f29641R.findViewById(C10232R.C10236id.imgClose);
            if (this.f29642a.mo23496R()) {
                this.f29639P.setScaleX(-1.0f);
            }
            this.f29640Q.setText(str);
            this.f29639P.setOnClickListener(new C10790c());
        }
    }

    /* renamed from: h */
    public void mo38414h(int i) {
        Configuration configuration = getResources().getConfiguration();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        ((WindowManager) getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        float f = (float) displayMetrics.widthPixels;
        float f2 = displayMetrics.density;
        configuration.fontScale = (f / f2) / ((float) i);
        displayMetrics.scaledDensity = configuration.fontScale * f2;
        getResources().updateConfiguration(configuration, displayMetrics);
    }

    /* renamed from: h */
    public void mo38415h(String str) {
    }

    /* renamed from: i */
    public void mo38416i(int i) {
        ((NotificationManager) getSystemService("notification")).cancel(i);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f29642a = new C5887x(this);
        C5887x xVar = this.f29642a;
        xVar.mo23477G(xVar.mo23470D().mo23460g("language"));
    }

    public void setRtl(View view) {
        if (view != null) {
            view.setLayoutDirection(1);
        }
    }

    public void setTextRtl(View view) {
        if (view != null) {
            view.setTextDirection(4);
        }
    }

    /* renamed from: a */
    public String mo38402a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append(10);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo38408a(String str, String str2, C11072p pVar) {
        try {
            Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
            dialog.setContentView(C10232R.layout.dialog_show_ok);
            TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdOk);
            TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
            ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(str2);
            textView2.setText(str);
            textView.setOnClickListener(new C10791d(pVar, dialog));
            if (!isFinishing()) {
                dialog.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo38407a(String str, String str2) {
        try {
            Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
            dialog.setContentView(C10232R.layout.dialog_show_ok);
            TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdOk);
            TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
            ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(str2);
            textView2.setText(str);
            textView.setOnClickListener(new C10792e(dialog));
            if (!isFinishing()) {
                dialog.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo38404a(View view, int i) {
        if (view != null && (view instanceof TextView)) {
            ((TextView) view).setGravity(i);
        }
    }

    /* renamed from: a */
    public void mo38405a(ImageView imageView) {
        if (imageView != null) {
            imageView.setScaleX(-1.0f);
        }
    }

    /* renamed from: a */
    public void mo38411a(View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.setScaleX(-1.0f);
            }
        }
    }

    /* renamed from: a */
    public void mo38409a(String str, String str2, C11137q qVar) {
        try {
            Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
            dialog.setContentView(C10232R.layout.dialog_pos_neg);
            dialog.setCancelable(true);
            TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
            TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtPositive);
            TextView textView3 = (TextView) dialog.findViewById(C10232R.C10236id.txtNegetive);
            ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(str2);
            textView.setText(str);
            textView2.setOnClickListener(new C10793f(dialog, qVar));
            textView3.setOnClickListener(new C10794g(dialog, qVar));
            if (!isFinishing()) {
                dialog.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo38403a(Configuration configuration) {
        if (this.f29642a.mo23468C().mo23451b().contains(C11644i.f33220W2) || this.f29642a.mo23468C().mo23451b().contains(C11644i.f33236Y2) || this.f29642a.mo23468C().mo23451b().contains(C11644i.f33228X2)) {
            boolean z = false;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (configuration.fontScale != this.f29642a.mo23468C().mo23456c(C11644i.f33220W2)) {
                configuration.fontScale = this.f29642a.mo23468C().mo23456c(C11644i.f33220W2);
                z = true;
            }
            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            if (!(configuration.densityDpi == this.f29642a.mo23468C().mo23457d(C11644i.f33228X2) && displayMetrics.scaledDensity == this.f29642a.mo23468C().mo23456c(C11644i.f33236Y2))) {
                displayMetrics.scaledDensity = this.f29642a.mo23468C().mo23456c(C11644i.f33236Y2);
                configuration.densityDpi = this.f29642a.mo23468C().mo23457d(C11644i.f33228X2);
                z = true;
            }
            if (z) {
                getBaseContext().getResources().updateConfiguration(configuration, displayMetrics);
            }
        }
    }
}
