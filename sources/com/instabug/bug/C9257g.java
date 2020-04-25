package com.instabug.bug;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.C0193h0;
import androidx.annotation.C0224v0;
import com.instabug.bug.model.C9278b;
import com.instabug.bug.model.ReportCategory;
import com.instabug.bug.view.p358c.C9318a;
import com.instabug.library.invocation.invocationdialog.InstabugDialogActivity;
import com.instabug.library.invocation.invocationdialog.InstabugDialogItem;
import com.instabug.library.invocation.invocationdialog.InstabugDialogListener;
import com.instabug.library.invocation.invocationdialog.InstabugDialogListener.InstabugDialogCallbacks;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.bug.g */
/* compiled from: ReportCategoriesLauncher */
public class C9257g implements InstabugDialogCallbacks {

    /* renamed from: b */
    private static C9257g f24479b;

    /* renamed from: c */
    private static transient /* synthetic */ boolean[] f24480c;

    /* renamed from: a */
    private ArrayList<C9318a> f24481a;

    /* renamed from: com.instabug.bug.g$a */
    /* compiled from: ReportCategoriesLauncher */
    class C9258a implements Runnable {

        /* renamed from: P */
        private static transient /* synthetic */ boolean[] f24482P;

        /* renamed from: N */
        final /* synthetic */ C9278b f24483N;

        /* renamed from: O */
        final /* synthetic */ C9257g f24484O;

        /* renamed from: a */
        final /* synthetic */ ReportCategory f24485a;

        /* renamed from: b */
        final /* synthetic */ Context f24486b;

        C9258a(C9257g gVar, ReportCategory reportCategory, Context context, C9278b bVar) {
            boolean[] a = m43285a();
            this.f24484O = gVar;
            this.f24485a = reportCategory;
            this.f24486b = context;
            this.f24483N = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43285a() {
            boolean[] zArr = f24482P;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-8521434475942139771L, "com/instabug/bug/ReportCategoriesLauncher$1", 3);
            f24482P = a;
            return a;
        }

        public void run() {
            boolean[] a = m43285a();
            C9254f.m43255h().mo33434c().mo33520g(this.f24485a.getLabel());
            a[1] = true;
            this.f24484O.mo33445a(this.f24486b, this.f24483N);
            a[2] = true;
        }
    }

    public C9257g() {
        m43278b()[0] = true;
    }

    /* renamed from: a */
    public static C9257g m43277a() {
        boolean[] b = m43278b();
        C9257g gVar = f24479b;
        if (gVar == null) {
            gVar = new C9257g();
            f24479b = gVar;
            b[1] = true;
        } else {
            b[2] = true;
        }
        b[3] = true;
        return gVar;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m43278b() {
        boolean[] zArr = f24480c;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(2119218084625795294L, "com/instabug/bug/ReportCategoriesLauncher", 33);
        f24480c = a;
        return a;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: b */
    public Intent mo33447b(Context context) {
        boolean[] b = m43278b();
        Intent a = C9249c.m43227a(context);
        b[32] = true;
        return a;
    }

    public void onClick(int i, String str, Uri uri) {
        boolean[] b = m43278b();
        ((C9318a) this.f24481a.get(i)).mo33720a().run();
        b[17] = true;
    }

    /* renamed from: a */
    public void mo33446a(Context context, String str, Uri uri, C9278b bVar) {
        boolean[] b = m43278b();
        InstabugDialogListener.getInstance().setListener(this);
        b[4] = true;
        this.f24481a = mo33443a(context, ReportCategory.getSubReportCategories(bVar), bVar);
        b[5] = true;
        ArrayList a = mo33444a(this.f24481a);
        b[6] = true;
        Intent intent = InstabugDialogActivity.getIntent(context, str, uri, a, true);
        b[7] = true;
        context.startActivity(intent);
        b[8] = true;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: a */
    public ArrayList<InstabugDialogItem> mo33444a(ArrayList<C9318a> arrayList) {
        boolean[] b = m43278b();
        ArrayList<InstabugDialogItem> arrayList2 = new ArrayList<>();
        b[9] = true;
        Iterator it = arrayList.iterator();
        b[10] = true;
        while (it.hasNext()) {
            C9318a aVar = (C9318a) it.next();
            b[11] = true;
            InstabugDialogItem instabugDialogItem = new InstabugDialogItem();
            b[12] = true;
            instabugDialogItem.setResDrawable(aVar.mo33722e());
            b[13] = true;
            instabugDialogItem.setTitle(aVar.mo33721d());
            b[14] = true;
            arrayList2.add(instabugDialogItem);
            b[15] = true;
        }
        b[16] = true;
        return arrayList2;
    }

    @C0193h0
    /* renamed from: a */
    public ArrayList<C9318a> mo33443a(Context context, List<ReportCategory> list, C9278b bVar) {
        boolean[] b = m43278b();
        ArrayList<C9318a> arrayList = new ArrayList<>();
        b[18] = true;
        b[19] = true;
        for (ReportCategory reportCategory : list) {
            b[20] = true;
            String label = reportCategory.getLabel();
            b[21] = true;
            C9318a aVar = new C9318a(label, reportCategory.getIcon(), new C9258a(this, reportCategory, context, bVar));
            b[22] = true;
            arrayList.add(aVar);
            b[23] = true;
        }
        b[24] = true;
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: a */
    public void mo33445a(Context context, C9278b bVar) {
        boolean[] b = m43278b();
        if (bVar == C9278b.FEEDBACK) {
            b[25] = true;
            context.startActivity(mo33442a(context));
            b[26] = true;
        } else if (bVar != C9278b.BUG) {
            b[27] = true;
        } else {
            b[28] = true;
            context.startActivity(mo33447b(context));
            b[29] = true;
        }
        b[30] = true;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: a */
    public Intent mo33442a(Context context) {
        boolean[] b = m43278b();
        Intent b2 = C9249c.m43230b(context);
        b[31] = true;
        return b2;
    }
}
