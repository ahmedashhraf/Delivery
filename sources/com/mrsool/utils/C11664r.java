package com.mrsool.utils;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.os.AsyncTask;
import android.widget.ProgressBar;

/* renamed from: com.mrsool.utils.r */
/* compiled from: NetworkTask */
public abstract class C11664r extends AsyncTask<String, Void, Boolean> {

    /* renamed from: a */
    protected Context f33559a;

    /* renamed from: b */
    protected C11667c f33560b;

    /* renamed from: c */
    protected ProgressDialog f33561c;

    /* renamed from: d */
    protected String f33562d;

    /* renamed from: e */
    protected String f33563e;

    /* renamed from: f */
    protected boolean f33564f;

    /* renamed from: g */
    protected boolean f33565g;

    /* renamed from: h */
    protected ProgressBar f33566h;

    /* renamed from: com.mrsool.utils.r$a */
    /* compiled from: NetworkTask */
    class C11665a implements OnClickListener {
        C11665a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C11664r rVar = C11664r.this;
            rVar.f33564f = true;
            C11667c cVar = rVar.f33560b;
            if (cVar != null) {
                cVar.mo38061a(false, rVar.f33564f);
            }
            C11664r.this.cancel(true);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.mrsool.utils.r$b */
    /* compiled from: NetworkTask */
    class C11666b implements OnCancelListener {
        C11666b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C11664r rVar = C11664r.this;
            rVar.f33564f = true;
            rVar.cancel(true);
        }
    }

    /* renamed from: com.mrsool.utils.r$c */
    /* compiled from: NetworkTask */
    public interface C11667c {
        /* renamed from: a */
        void mo38061a(boolean z, boolean z2);
    }

    public C11664r(Context context, String str, String str2, C11667c cVar, boolean z) {
        this.f33559a = context;
        this.f33560b = cVar;
        this.f33562d = str2;
        this.f33565g = z;
        this.f33563e = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Boolean bool) {
        ProgressBar progressBar = this.f33566h;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        } else {
            ProgressDialog progressDialog = this.f33561c;
            if (progressDialog != null) {
                try {
                    progressDialog.dismiss();
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                }
            }
        }
        C11667c cVar = this.f33560b;
        if (cVar != null) {
            cVar.mo38061a(bool.booleanValue(), this.f33564f);
        }
        super.onPostExecute(bool);
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        ProgressBar progressBar = this.f33566h;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        } else if (this.f33565g) {
            this.f33561c = new ProgressDialog(this.f33559a);
            String str = this.f33562d;
            String str2 = "";
            if (str != null && !str.equals(str2)) {
                this.f33561c.setMessage(this.f33562d);
            }
            String str3 = this.f33563e;
            if (str3 != null && !str3.equals(str2)) {
                this.f33561c.setTitle(this.f33563e);
            }
            this.f33561c.setCancelable(false);
            this.f33561c.setButton(-2, "Cancel", new C11665a());
            this.f33561c.setCanceledOnTouchOutside(false);
            this.f33561c.setOnCancelListener(new C11666b());
            try {
                if (this.f33562d != null && !this.f33562d.equals(str2)) {
                    this.f33561c.show();
                }
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
        super.onPreExecute();
    }

    public C11664r(Context context, String str, String str2, C11667c cVar, boolean z, ProgressBar progressBar) {
        this(context, str, str2, cVar, z);
        this.f33566h = progressBar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo40027a() {
        super.onPreExecute();
    }
}
