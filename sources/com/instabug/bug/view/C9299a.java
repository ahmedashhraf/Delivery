package com.instabug.bug.view;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnShowListener;
import androidx.annotation.C0193h0;
import androidx.annotation.C0214q0;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AlertDialog.C0257a;
import com.instabug.bug.C9231R;
import com.instabug.library.Instabug;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.bug.view.a */
/* compiled from: InstabugAlertDialog */
public class C9299a {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f24631a;

    /* renamed from: com.instabug.bug.view.a$a */
    /* compiled from: InstabugAlertDialog */
    static class C9300a implements OnShowListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24632b;

        /* renamed from: a */
        final /* synthetic */ AlertDialog f24633a;

        C9300a(AlertDialog alertDialog) {
            boolean[] a = m43582a();
            this.f24633a = alertDialog;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43582a() {
            boolean[] zArr = f24632b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7550597139116403893L, "com/instabug/bug/view/InstabugAlertDialog$1", 3);
            f24632b = a;
            return a;
        }

        public void onShow(DialogInterface dialogInterface) {
            boolean[] a = m43582a();
            this.f24633a.getButton(-1).setTextColor(Instabug.getPrimaryColor());
            a[1] = true;
            this.f24633a.getButton(-2).setTextColor(Instabug.getPrimaryColor());
            a[2] = true;
        }
    }

    public C9299a() {
        m43581a()[0] = true;
    }

    /* renamed from: a */
    public static final void m43580a(@C0193h0 Context context, @C0214q0 int i, @C0214q0 int i2, @C0214q0 int i3, @C0214q0 int i4, OnClickListener onClickListener, OnClickListener onClickListener2) {
        boolean[] a = m43581a();
        C0257a aVar = new C0257a(context, C9231R.style.InstabugDialogStyle);
        a[1] = true;
        C0257a d = aVar.mo779d(i);
        a[2] = true;
        C0257a c = d.mo773c(i2);
        a[3] = true;
        C0257a d2 = c.mo780d(i3, onClickListener);
        a[4] = true;
        AlertDialog a2 = d2.mo767b(i4, onClickListener2).mo764a();
        a[5] = true;
        a2.setOnShowListener(new C9300a(a2));
        a[6] = true;
        a2.show();
        a[7] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m43581a() {
        boolean[] zArr = f24631a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(7273507466027402163L, "com/instabug/bug/view/InstabugAlertDialog", 8);
        f24631a = a;
        return a;
    }
}
