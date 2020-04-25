package com.mrsool.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.Html;
import androidx.appcompat.app.C0295d;
import androidx.core.content.C0841b;
import com.google.android.material.p296f.C6845b;
import com.mrsool.C10232R;
import java.util.ArrayList;

@SuppressLint({"Registered"})
/* renamed from: com.mrsool.utils.t */
/* compiled from: RunTimePermission */
public class C11669t extends C0295d {

    /* renamed from: N */
    private String[] f33577N;

    /* renamed from: O */
    private C11673d f33578O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public boolean f33579P;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Activity f33580a;

    /* renamed from: b */
    private ArrayList<C11672c> f33581b;

    /* renamed from: com.mrsool.utils.t$a */
    /* compiled from: RunTimePermission */
    class C11670a implements OnClickListener {
        C11670a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C11669t.this.m52570E();
            if (C11669t.this.f33579P) {
                C11669t.this.f33580a.finish();
            } else {
                dialogInterface.dismiss();
            }
        }
    }

    /* renamed from: com.mrsool.utils.t$b */
    /* compiled from: RunTimePermission */
    class C11671b implements OnClickListener {
        C11671b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (C11669t.this.f33579P) {
                C11669t.this.f33580a.finish();
            } else {
                dialogInterface.dismiss();
            }
        }
    }

    /* renamed from: com.mrsool.utils.t$c */
    /* compiled from: RunTimePermission */
    public class C11672c {

        /* renamed from: a */
        String f33584a;

        /* renamed from: b */
        boolean f33585b;

        public C11672c() {
        }
    }

    /* renamed from: com.mrsool.utils.t$d */
    /* compiled from: RunTimePermission */
    public interface C11673d {
        /* renamed from: a */
        void mo36513a();

        /* renamed from: b */
        void mo36514b();
    }

    public C11669t(Activity activity) {
        this.f33580a = activity;
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public void m52570E() {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", this.f33580a.getPackageName(), null));
        this.f33580a.startActivity(intent);
    }

    /* renamed from: G */
    private void m52571G() {
        if (this.f33581b != null) {
            boolean z = true;
            for (int i = 0; i < this.f33581b.size(); i++) {
                if (!((C11672c) this.f33581b.get(i)).f33585b) {
                    z = false;
                }
            }
            if (z) {
                C11673d dVar = this.f33578O;
                if (dVar != null) {
                    dVar.mo36514b();
                }
            } else if (this.f33578O != null) {
                this.f33581b.size();
                this.f33578O.mo36513a();
            }
        } else {
            C11673d dVar2 = this.f33578O;
            if (dVar2 != null) {
                dVar2.mo36513a();
            }
        }
    }

    /* renamed from: C */
    public C11673d mo40033C() {
        return this.f33578O;
    }

    /* renamed from: D */
    public void mo40034D() {
        C6845b bVar = new C6845b(this.f33580a, C10232R.style.AlertDialogTheme);
        bVar.mo770b((CharSequence) this.f33580a.getResources().getString(C10232R.string.app_name));
        StringBuilder sb = new StringBuilder();
        sb.append("<playerController>Dear User, </playerController><playerController>Seems like you have <b>\"Denied\"</b> the minimum requirement permission to access more features of application.</playerController><playerController>You must have to <b>\"Allow\"</b> all permission. We will not share your data with anyone else.</playerController><playerController>Do you want to enable all requirement permission ?</playerController><playerController>Go To : Settings >> App > ");
        sb.append(this.f33580a.getResources().getString(C10232R.string.app_name));
        sb.append(" Permission : Allow ALL</playerController>");
        String sb2 = sb.toString();
        bVar.mo758a((CharSequence) Html.fromHtml(sb2));
        bVar.mo776c((CharSequence) "Allow All", (OnClickListener) new C11670a());
        bVar.mo759a((CharSequence) "Remind Me Later", (OnClickListener) new C11671b());
        if (this.f33580a.isFinishing() || sb2.length() <= 0) {
            C5880q.m25753d("either activity finish or message length is 0");
        } else {
            bVar.mo778c();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            m52573a(strArr[i2], iArr[i2]);
        }
        m52571G();
    }

    /* renamed from: a */
    public boolean mo40037a(String[] strArr) {
        this.f33581b = new ArrayList<>();
        if (VERSION.SDK_INT < 23) {
            return true;
        }
        for (int i = 0; i < strArr.length; i++) {
            C11672c cVar = new C11672c();
            if (C0841b.m4916a((Context) this.f33580a, strArr[i]) == 0) {
                cVar.f33585b = true;
            } else {
                cVar.f33585b = false;
                cVar.f33584a = strArr[i];
                this.f33581b.add(cVar);
            }
        }
        return this.f33581b.size() <= 0;
    }

    /* renamed from: c */
    public void mo40038c(boolean z) {
        this.f33579P = z;
    }

    /* renamed from: a */
    public void mo40036a(String[] strArr, C11673d dVar) {
        this.f33578O = dVar;
        this.f33581b = new ArrayList<>();
        if (VERSION.SDK_INT >= 23) {
            for (int i = 0; i < strArr.length; i++) {
                C11672c cVar = new C11672c();
                if (C0841b.m4916a((Context) this.f33580a, strArr[i]) == 0) {
                    cVar.f33585b = true;
                } else {
                    cVar.f33585b = false;
                    cVar.f33584a = strArr[i];
                    this.f33581b.add(cVar);
                }
            }
            if (this.f33581b.size() <= 0) {
                dVar.mo36514b();
                return;
            }
            this.f33577N = new String[this.f33581b.size()];
            for (int i2 = 0; i2 < this.f33581b.size(); i2++) {
                this.f33577N[i2] = ((C11672c) this.f33581b.get(i2)).f33584a;
            }
            this.f33580a.requestPermissions(this.f33577N, 10);
        } else if (dVar != null) {
            dVar.mo36514b();
        }
    }

    /* renamed from: a */
    private void m52573a(String str, int i) {
        int i2 = 0;
        while (i2 < this.f33581b.size()) {
            try {
                if (!((C11672c) this.f33581b.get(i2)).f33584a.equals(str)) {
                    i2++;
                } else if (i == 0) {
                    ((C11672c) this.f33581b.get(i2)).f33585b = true;
                    return;
                } else {
                    ((C11672c) this.f33581b.get(i2)).f33585b = false;
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo40035a(C11673d dVar) {
        this.f33578O = dVar;
    }
}
