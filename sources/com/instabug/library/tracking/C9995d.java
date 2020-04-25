package com.instabug.library.tracking;

import com.instabug.library.model.C9949c;
import com.instabug.library.model.C9949c.C9951b;
import com.instabug.library.model.C9949c.C9952c;
import com.instabug.library.model.C9953d;
import com.instabug.library.model.C9953d.C9954a;
import com.instabug.library.p383e.C9807b;
import com.instabug.library.util.InstabugDateFormatter;
import java.util.ArrayList;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.tracking.d */
/* compiled from: InstabugTrackingStepsProvider */
public class C9995d {

    /* renamed from: c */
    private static C9995d f26597c;

    /* renamed from: d */
    private static transient /* synthetic */ boolean[] f26598d;

    /* renamed from: a */
    private ArrayList<C9953d> f26599a;

    /* renamed from: b */
    private String f26600b = "";

    private C9995d() {
        boolean[] e = m46541e();
        e[0] = true;
        this.f26599a = new ArrayList<>(100);
        e[1] = true;
    }

    /* renamed from: c */
    public static C9995d m46539c() {
        boolean[] e = m46541e();
        if (f26597c != null) {
            e[2] = true;
        } else {
            e[3] = true;
            f26597c = new C9995d();
            e[4] = true;
        }
        C9995d dVar = f26597c;
        e[5] = true;
        return dVar;
    }

    /* renamed from: d */
    private void m46540d() {
        boolean[] e = m46541e();
        if (this.f26599a.size() < 100) {
            e[25] = true;
        } else {
            e[26] = true;
            this.f26599a.remove(0);
            e[27] = true;
        }
        e[28] = true;
    }

    /* renamed from: e */
    private static /* synthetic */ boolean[] m46541e() {
        boolean[] zArr = f26598d;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(2808416807768505999L, "com/instabug/library/tracking/InstabugTrackingStepsProvider", 56);
        f26598d = a;
        return a;
    }

    /* renamed from: a */
    public void mo35846a(String str, C9954a aVar) {
        boolean[] e = m46541e();
        this.f26600b = str;
        e[6] = true;
        C9953d a = m46538a(aVar);
        e[7] = true;
        String a2 = C9807b.m45754a(aVar, str);
        e[8] = true;
        a.mo35498a(a2);
        e[9] = true;
        a.mo35500b(str);
        e[10] = true;
        a.mo35502c(null);
        e[11] = true;
        a.mo35504d(null);
        e[12] = true;
        m46540d();
        e[13] = true;
        this.f26599a.add(a);
        e[14] = true;
    }

    /* renamed from: b */
    public ArrayList<C9949c> mo35849b() {
        boolean[] e = m46541e();
        ArrayList<C9949c> arrayList = new ArrayList<>();
        e[42] = true;
        e[43] = true;
        int i = 0;
        while (i < this.f26599a.size()) {
            e[44] = true;
            C9949c cVar = new C9949c();
            e[45] = true;
            cVar.mo35481b(((C9953d) this.f26599a.get(i)).mo35499b());
            e[46] = true;
            cVar.mo35477a(((C9953d) this.f26599a.get(i)).mo35495a());
            e[47] = true;
            cVar.mo35480a(((C9953d) this.f26599a.get(i)).mo35501c());
            e[48] = true;
            C9952c e2 = cVar.mo35483e();
            ArrayList<C9953d> arrayList2 = this.f26599a;
            e[49] = true;
            String e3 = ((C9953d) arrayList2.get(i)).mo35505e();
            ArrayList<C9953d> arrayList3 = this.f26599a;
            e[50] = true;
            String f = ((C9953d) arrayList3.get(i)).mo35506f();
            ArrayList<C9953d> arrayList4 = this.f26599a;
            e[51] = true;
            C9951b bVar = new C9951b(e2, e3, f, ((C9953d) arrayList4.get(i)).mo35503d());
            e[52] = true;
            cVar.mo35478a(bVar);
            e[53] = true;
            arrayList.add(cVar);
            i++;
            e[54] = true;
        }
        e[55] = true;
        return arrayList;
    }

    /* renamed from: a */
    public void mo35847a(String str, String str2, C9954a aVar) {
        boolean[] e = m46541e();
        mo35848a(str, str2, null, aVar);
        e[15] = true;
    }

    /* renamed from: a */
    public void mo35848a(String str, String str2, String str3, C9954a aVar) {
        boolean[] e = m46541e();
        this.f26600b = str;
        e[16] = true;
        C9953d a = m46538a(aVar);
        e[17] = true;
        String a2 = C9807b.m45755a(aVar, str, str2, str3);
        e[18] = true;
        a.mo35498a(a2);
        e[19] = true;
        a.mo35500b(str);
        e[20] = true;
        a.mo35502c(null);
        e[21] = true;
        a.mo35504d(null);
        e[22] = true;
        m46540d();
        e[23] = true;
        this.f26599a.add(a);
        e[24] = true;
    }

    /* renamed from: a */
    private C9953d m46538a(C9954a aVar) {
        boolean[] e = m46541e();
        C9953d dVar = new C9953d();
        e[29] = true;
        dVar.mo35496a(InstabugDateFormatter.getCurrentUTCTimeStampInMiliSeconds());
        e[30] = true;
        dVar.mo35497a(aVar);
        e[31] = true;
        return dVar;
    }

    /* renamed from: a */
    public void mo35845a(C9954a aVar, String str, String str2, String str3, String str4) {
        boolean[] e = m46541e();
        C9953d dVar = new C9953d();
        e[32] = true;
        dVar.mo35497a(aVar);
        e[33] = true;
        dVar.mo35498a(str);
        e[34] = true;
        dVar.mo35496a(InstabugDateFormatter.getCurrentUTCTimeStampInMiliSeconds());
        e[35] = true;
        dVar.mo35504d(str2);
        e[36] = true;
        dVar.mo35502c(str3);
        e[37] = true;
        dVar.mo35500b(str4);
        e[38] = true;
        m46540d();
        e[39] = true;
        this.f26599a.add(dVar);
        e[40] = true;
    }

    /* renamed from: a */
    public String mo35844a() {
        boolean[] e = m46541e();
        String str = this.f26600b;
        e[41] = true;
        return str;
    }
}
