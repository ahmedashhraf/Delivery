package com.instabug.bug.p356h.p357b;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import com.instabug.bug.C9254f;
import com.instabug.bug.model.Bug;
import com.instabug.bug.model.Bug.ViewHierarchyInspectionState;
import com.instabug.bug.p356h.p357b.C9270c.C9272b;
import com.instabug.bug.screenshot.viewhierarchy.utilities.C9289a;
import com.instabug.bug.screenshot.viewhierarchy.utilities.ViewHierarchyDiskUtils;
import com.instabug.bug.screenshot.viewhierarchy.utilities.ViewHierarchyInspectorEventBus;
import com.instabug.library.C9700R;
import com.instabug.library.instacapture.screenshot.FieldHelper;
import com.instabug.library.instacapture.screenshot.RootViewInfo;
import com.instabug.library.internal.storage.DiskUtils;
import com.instabug.library.model.Attachment.Type;
import com.instabug.library.util.InstabugMemoryUtils;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jivesoftware.smackx.jiveproperties.packet.JivePropertiesExtension;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p441d1.C12228b;
import p195e.p196a.p444s0.p446d.C12304a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12325a;
import p195e.p196a.p449w0.C12331g;
import p195e.p196a.p449w0.C12339o;
import p195e.p196a.p467z0.C13787e;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p212io.fabric.sdk.android.p493p.p498e.C14330v;

/* renamed from: com.instabug.bug.h.b.a */
/* compiled from: ActivityViewInspector */
public class C9260a {

    /* renamed from: a */
    private static C12314c f24491a;

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f24492b;

    /* renamed from: com.instabug.bug.h.b.a$a */
    /* compiled from: ActivityViewInspector */
    static class C9261a extends C13787e<C9269b> {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f24493N;

        /* renamed from: b */
        final /* synthetic */ C9269b f24494b;

        C9261a(C9269b bVar) {
            boolean[] c = m43295c();
            this.f24494b = bVar;
            c[0] = true;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m43295c() {
            boolean[] zArr = f24493N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-5279431350012606524L, "com/instabug/bug/screenshot/viewhierarchy/ActivityViewInspector$1", 14);
            f24493N = a;
            return a;
        }

        /* renamed from: a */
        public /* synthetic */ void mo33453a(Object obj) {
            boolean[] c = m43295c();
            mo33452a((C9269b) obj);
            c[13] = true;
        }

        public void onComplete() {
            boolean[] c = m43295c();
            StringBuilder sb = new StringBuilder();
            sb.append("activity view inspection done successfully, time in MS: ");
            sb.append(System.currentTimeMillis());
            InstabugSDKLogger.m46626v(C9260a.class, sb.toString());
            c[1] = true;
            if (C9254f.m43255h().mo33434c() == null) {
                c[2] = true;
            } else {
                c[3] = true;
                C9254f.m43255h().mo33434c().mo33516f(C9260a.m43290a(this.f24494b).toString());
                c[4] = true;
                C9254f.m43255h().mo33434c().mo33500a(ViewHierarchyInspectionState.DONE);
                c[5] = true;
            }
            ViewHierarchyInspectorEventBus.getInstance().post(C9272b.COMPLETED);
            c[6] = true;
        }

        public void onError(Throwable th) {
            boolean[] c = m43295c();
            StringBuilder sb = new StringBuilder();
            sb.append("activity view inspection got error: ");
            sb.append(th.getMessage());
            sb.append(", time in MS: ");
            sb.append(System.currentTimeMillis());
            InstabugSDKLogger.m46624e(C9260a.class, sb.toString(), th);
            c[7] = true;
            if (C9254f.m43255h().mo33434c() == null) {
                c[8] = true;
            } else {
                c[9] = true;
                C9254f.m43255h().mo33434c().mo33500a(ViewHierarchyInspectionState.FAILED);
                c[10] = true;
            }
            ViewHierarchyInspectorEventBus.getInstance().post(C9272b.FAILED);
            c[11] = true;
        }

        /* renamed from: a */
        public void mo33452a(C9269b bVar) {
            boolean[] c = m43295c();
            StringBuilder sb = new StringBuilder();
            sb.append("view hierarchy image saved successfully, uri: ");
            sb.append(bVar.mo33491l());
            InstabugSDKLogger.m46626v(C9260a.class, sb.toString());
            c[12] = true;
        }
    }

    /* renamed from: com.instabug.bug.h.b.a$b */
    /* compiled from: ActivityViewInspector */
    static class C9262b implements C12325a {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f24495N;

        /* renamed from: a */
        final /* synthetic */ C9268h f24496a;

        /* renamed from: b */
        final /* synthetic */ Activity f24497b;

        C9262b(C9268h hVar, Activity activity) {
            boolean[] a = m43298a();
            this.f24496a = hVar;
            this.f24497b = activity;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43298a() {
            boolean[] zArr = f24495N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-912482825463029217L, "com/instabug/bug/screenshot/viewhierarchy/ActivityViewInspector$2", 9);
            f24495N = a;
            return a;
        }

        public void run() {
            boolean[] a = m43298a();
            StringBuilder sb = new StringBuilder();
            sb.append("un-subscribe called, time in MS: ");
            a[1] = true;
            sb.append(System.currentTimeMillis());
            String sb2 = sb.toString();
            a[2] = true;
            InstabugSDKLogger.m46626v(C9260a.class, sb2);
            a[3] = true;
            this.f24496a.mo33463b();
            a[4] = true;
            if (this.f24496a.mo33464c()) {
                a[5] = true;
            } else {
                a[6] = true;
                DiskUtils.cleanDirectory(ViewHierarchyDiskUtils.getViewHierarchyImagesDirectory(this.f24497b));
                a[7] = true;
            }
            a[8] = true;
        }
    }

    /* renamed from: com.instabug.bug.h.b.a$c */
    /* compiled from: ActivityViewInspector */
    static class C9263c implements C12331g<C12314c> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24498b;

        /* renamed from: a */
        final /* synthetic */ C9268h f24499a;

        C9263c(C9268h hVar) {
            boolean[] a = m43299a();
            this.f24499a = hVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43299a() {
            boolean[] zArr = f24498b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-7854612701945972174L, "com/instabug/bug/screenshot/viewhierarchy/ActivityViewInspector$3", 6);
            f24498b = a;
            return a;
        }

        /* renamed from: a */
        public void mo33457a(C12314c cVar) {
            boolean[] a = m43299a();
            StringBuilder sb = new StringBuilder();
            sb.append("subscribe called, time in MS: ");
            a[1] = true;
            sb.append(System.currentTimeMillis());
            String sb2 = sb.toString();
            a[2] = true;
            InstabugSDKLogger.m46626v(C9260a.class, sb2);
            a[3] = true;
            this.f24499a.mo33462a();
            a[4] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m43299a();
            mo33457a((C12314c) obj);
            a[5] = true;
        }
    }

    /* renamed from: com.instabug.bug.h.b.a$d */
    /* compiled from: ActivityViewInspector */
    static class C9264d implements C12325a {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f24500N;

        /* renamed from: a */
        final /* synthetic */ C9268h f24501a;

        /* renamed from: b */
        final /* synthetic */ C9269b f24502b;

        C9264d(C9268h hVar, C9269b bVar) {
            boolean[] a = m43302a();
            this.f24501a = hVar;
            this.f24502b = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43302a() {
            boolean[] zArr = f24500N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-2323781194782003518L, "com/instabug/bug/screenshot/viewhierarchy/ActivityViewInspector$4", 19);
            f24500N = a;
            return a;
        }

        public void run() {
            Class<C9260a> cls = C9260a.class;
            boolean[] a = m43302a();
            StringBuilder sb = new StringBuilder();
            sb.append("doOnCompleted called, time in MS: ");
            a[1] = true;
            sb.append(System.currentTimeMillis());
            String sb2 = sb.toString();
            a[2] = true;
            InstabugSDKLogger.m46626v(cls, sb2);
            a[3] = true;
            if (!this.f24501a.mo33464c()) {
                a[4] = true;
            } else {
                a[5] = true;
                Uri zipViewHierarchyImages = ViewHierarchyDiskUtils.zipViewHierarchyImages(this.f24502b);
                if (zipViewHierarchyImages == null) {
                    a[6] = true;
                } else {
                    a[7] = true;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("viewHierarchy images zipped successfully, zip file uri: ");
                    a[8] = true;
                    sb3.append(zipViewHierarchyImages.toString());
                    sb3.append(", time in MS: ");
                    a[9] = true;
                    sb3.append(System.currentTimeMillis());
                    String sb4 = sb3.toString();
                    a[10] = true;
                    InstabugSDKLogger.m46626v(cls, sb4);
                    a[11] = true;
                }
                if (C9254f.m43255h().mo33434c() == null) {
                    a[12] = true;
                } else if (zipViewHierarchyImages == null) {
                    a[13] = true;
                } else {
                    a[14] = true;
                    C9254f h = C9254f.m43255h();
                    a[15] = true;
                    Bug c = h.mo33434c();
                    Type type = Type.VIEW_HIERARCHY;
                    a[16] = true;
                    c.mo33498a(zipViewHierarchyImages, type);
                    a[17] = true;
                }
            }
            a[18] = true;
        }
    }

    /* renamed from: com.instabug.bug.h.b.a$e */
    /* compiled from: ActivityViewInspector */
    static class C9265e implements C12331g<C9269b> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24503b;

        /* renamed from: a */
        final /* synthetic */ C9268h f24504a;

        C9265e(C9268h hVar) {
            boolean[] a = m43303a();
            this.f24504a = hVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43303a() {
            boolean[] zArr = f24503b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(3212184351320820931L, "com/instabug/bug/screenshot/viewhierarchy/ActivityViewInspector$5", 10);
            f24503b = a;
            return a;
        }

        /* renamed from: a */
        public void mo33458a(C9269b bVar) {
            Class<C9260a> cls = C9260a.class;
            boolean[] a = m43303a();
            StringBuilder sb = new StringBuilder();
            sb.append("doOnNext called, time in MS: ");
            sb.append(System.currentTimeMillis());
            InstabugSDKLogger.m46626v(cls, sb.toString());
            a[1] = true;
            if (!this.f24504a.mo33464c()) {
                a[2] = true;
            } else if (bVar.mo33489j() == null) {
                a[3] = true;
            } else {
                a[4] = true;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("viewHierarchy image not equal null, starting save image on disk, viewHierarchyId: ");
                sb2.append(bVar.mo33465a());
                sb2.append(", time in MS: ");
                sb2.append(System.currentTimeMillis());
                InstabugSDKLogger.m46626v(cls, sb2.toString());
                a[5] = true;
                ViewHierarchyDiskUtils.saveViewHierarchyImage(bVar);
                a[6] = true;
                bVar.mo33490k();
                a[7] = true;
            }
            a[8] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m43303a();
            mo33458a((C9269b) obj);
            a[9] = true;
        }
    }

    /* renamed from: com.instabug.bug.h.b.a$f */
    /* compiled from: ActivityViewInspector */
    static class C9266f implements C12339o<C9269b, C5923b0<C9269b>> {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f24505a;

        C9266f() {
            m43306a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43306a() {
            boolean[] zArr = f24505a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(8082530397386548820L, "com/instabug/bug/screenshot/viewhierarchy/ActivityViewInspector$6", 7);
            f24505a = a;
            return a;
        }

        /* renamed from: a */
        public C5923b0<C9269b> mo33459a(C9269b bVar) {
            boolean[] a = m43306a();
            if (!InstabugMemoryUtils.isLowMemory()) {
                a[1] = true;
                C5923b0 a2 = C9289a.m43466a(bVar);
                a[2] = true;
                C5923b0 c = a2.mo23950c(C12304a.m55390a());
                a[3] = true;
                C5923b0<C9269b> a3 = c.mo23825a(C12228b.m55094b());
                a[4] = true;
                return a3;
            }
            a[5] = true;
            return null;
        }

        public /* synthetic */ Object apply(Object obj) throws Exception {
            boolean[] a = m43306a();
            C5923b0 a2 = mo33459a((C9269b) obj);
            a[6] = true;
            return a2;
        }
    }

    /* renamed from: com.instabug.bug.h.b.a$g */
    /* compiled from: ActivityViewInspector */
    static class C9267g implements C12339o<C9269b, C5923b0<C9269b>> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24506b;

        /* renamed from: a */
        final /* synthetic */ C9269b f24507a;

        C9267g(C9269b bVar) {
            boolean[] a = m43308a();
            this.f24507a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43308a() {
            boolean[] zArr = f24506b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-2775819180700773125L, "com/instabug/bug/screenshot/viewhierarchy/ActivityViewInspector$7", 7);
            f24506b = a;
            return a;
        }

        /* renamed from: a */
        public C5923b0<C9269b> mo33461a(C9269b bVar) {
            boolean[] a = m43308a();
            this.f24507a.mo33477b(bVar);
            a[1] = true;
            if (!InstabugMemoryUtils.isLowMemory()) {
                a[2] = true;
                List b = C9270c.m43356b(bVar);
                a[3] = true;
                C5923b0<C9269b> f = C5923b0.m26193f((Iterable<? extends T>) b);
                a[4] = true;
                return f;
            }
            a[5] = true;
            return null;
        }

        public /* synthetic */ Object apply(Object obj) throws Exception {
            boolean[] a = m43308a();
            C5923b0 a2 = mo33461a((C9269b) obj);
            a[6] = true;
            return a2;
        }
    }

    /* renamed from: com.instabug.bug.h.b.a$h */
    /* compiled from: ActivityViewInspector */
    private static class C9268h {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24508b;

        /* renamed from: a */
        private int f24509a;

        /* synthetic */ C9268h(C9261a aVar) {
            boolean[] d = m43310d();
            this();
            d[6] = true;
        }

        /* renamed from: d */
        private static /* synthetic */ boolean[] m43310d() {
            boolean[] zArr = f24508b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-6682892319139001040L, "com/instabug/bug/screenshot/viewhierarchy/ActivityViewInspector$disposableState", 7);
            f24508b = a;
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo33462a() {
            boolean[] d = m43310d();
            this.f24509a++;
            d[1] = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo33463b() {
            boolean[] d = m43310d();
            this.f24509a--;
            d[2] = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo33464c() {
            boolean z;
            boolean[] d = m43310d();
            if (this.f24509a > 0) {
                d[3] = true;
                z = true;
            } else {
                z = false;
                d[4] = true;
            }
            d[5] = true;
            return z;
        }

        private C9268h() {
            boolean[] d = m43310d();
            this.f24509a = 0;
            d[0] = true;
        }
    }

    public C9260a() {
        m43292a()[0] = true;
    }

    /* renamed from: a */
    static /* synthetic */ JSONObject m43290a(C9269b bVar) {
        boolean[] a = m43292a();
        JSONObject b = m43294b(bVar);
        a[77] = true;
        return b;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m43292a() {
        boolean[] zArr = f24492b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-9164272705942598235L, "com/instabug/bug/screenshot/viewhierarchy/ActivityViewInspector", 78);
        f24492b = a;
        return a;
    }

    /* renamed from: b */
    private static JSONObject m43294b(C9269b bVar) {
        boolean[] a = m43292a();
        JSONObject jSONObject = new JSONObject();
        try {
            a[44] = true;
            if (bVar.mo33465a() == null) {
                a[45] = true;
            } else {
                a[46] = true;
                jSONObject.put("id", bVar.mo33465a());
                a[47] = true;
            }
            if (bVar.mo33475b() == null) {
                a[48] = true;
            } else {
                a[49] = true;
                jSONObject.put(C14330v.f42312a0, bVar.mo33475b());
                a[50] = true;
            }
            if (bVar.mo33481c() == null) {
                a[51] = true;
            } else {
                a[52] = true;
                jSONObject.put("type", bVar.mo33481c());
                a[53] = true;
            }
            if (bVar.mo33483d() == null) {
                a[54] = true;
            } else {
                a[55] = true;
                jSONObject.put(JivePropertiesExtension.ELEMENT, bVar.mo33483d());
                a[56] = true;
            }
            if (bVar.mo33484e() == null) {
                a[57] = true;
            } else {
                a[58] = true;
                jSONObject.put("frame", bVar.mo33484e());
                a[59] = true;
            }
            if (bVar.mo33486g() == null) {
                a[60] = true;
            } else if (!bVar.mo33487h()) {
                a[61] = true;
            } else {
                a[62] = true;
                JSONArray jSONArray = new JSONArray();
                a[63] = true;
                Iterator it = bVar.mo33486g().iterator();
                a[64] = true;
                while (it.hasNext()) {
                    C9269b bVar2 = (C9269b) it.next();
                    a[65] = true;
                    jSONArray.put(m43294b(bVar2));
                    a[66] = true;
                }
                jSONObject.put("nodes", jSONArray);
                a[67] = true;
            }
            a[68] = true;
        } catch (JSONException e) {
            a[69] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("convert seed view hierarchy to json got json exception: ");
            sb.append(e.getMessage());
            sb.append(", time in MS: ");
            sb.append(System.currentTimeMillis());
            InstabugSDKLogger.m46624e(C9260a.class, sb.toString(), e);
            a[70] = true;
        }
        a[71] = true;
        return jSONObject;
    }

    /* renamed from: a */
    public static synchronized void m43291a(Activity activity) {
        Class<C9260a> cls = C9260a.class;
        synchronized (cls) {
            boolean[] a = m43292a();
            if (C9254f.m43255h().mo33434c() == null) {
                a[1] = true;
            } else {
                a[2] = true;
                C9254f.m43255h().mo33434c().mo33500a(ViewHierarchyInspectionState.IN_PROGRESS);
                a[3] = true;
            }
            C9268h hVar = new C9268h(null);
            a[4] = true;
            ViewHierarchyInspectorEventBus.getInstance().post(C9272b.STARTED);
            a[5] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("inspect activity view start, time in MS: ");
            sb.append(System.currentTimeMillis());
            InstabugSDKLogger.m46626v(cls, sb.toString());
            a[6] = true;
            C9269b bVar = new C9269b();
            a[7] = true;
            bVar.mo33470a(activity.getWindow().getDecorView());
            try {
                a[8] = true;
                bVar.mo33479b(C9270c.m43350a(activity, m43293b(activity)));
                a[9] = true;
            } catch (JSONException e) {
                a[10] = true;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("inspect activity frame got error");
                sb2.append(e.getMessage());
                sb2.append(", time in MS: ");
                sb2.append(System.currentTimeMillis());
                InstabugSDKLogger.m46624e(cls, sb2.toString(), e);
                a[11] = true;
            }
            int i = 0;
            int[] iArr = {C9700R.C9704id.instabug_decor_view, C9700R.C9704id.instabug_in_app_notification, C9700R.C9704id.instabug_intro_dialog};
            a[12] = true;
            List rootViews = FieldHelper.getRootViews(activity, iArr);
            a[13] = true;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("root views size: ");
            sb3.append(rootViews.size());
            InstabugSDKLogger.m46626v(cls, sb3.toString());
            a[14] = true;
            if (rootViews.size() <= 0) {
                a[15] = true;
            } else {
                a[16] = true;
                bVar.mo33474a(true);
                a[17] = true;
            }
            a[18] = true;
            ArrayList arrayList = new ArrayList(rootViews.size());
            a[19] = true;
            a[20] = true;
            while (i < rootViews.size()) {
                a[21] = true;
                C9269b bVar2 = new C9269b();
                a[22] = true;
                bVar2.mo33472a(String.valueOf(i));
                a[23] = true;
                bVar2.mo33470a(((RootViewInfo) rootViews.get(i)).getView());
                a[24] = true;
                bVar2.mo33480b(true);
                a[25] = true;
                bVar2.mo33466a(m43293b(activity));
                a[26] = true;
                C5923b0 a2 = C9270c.m43346a(bVar2);
                a[27] = true;
                arrayList.add(a2);
                i++;
                a[28] = true;
            }
            if (f24491a == null) {
                a[29] = true;
            } else {
                C12314c cVar = f24491a;
                a[30] = true;
                if (cVar.mo41878d()) {
                    a[31] = true;
                } else {
                    a[32] = true;
                    f24491a.dispose();
                    a[33] = true;
                }
            }
            C5923b0 g = C5923b0.m26197g((Iterable<? extends C5926g0<? extends T>>) arrayList);
            C9267g gVar = new C9267g(bVar);
            a[34] = true;
            C5923b0 a3 = g.mo23833a((C12339o<? super T, ? extends C5926g0<? extends R>>) gVar);
            C9266f fVar = new C9266f();
            a[35] = true;
            C5923b0 a4 = a3.mo23833a((C12339o<? super T, ? extends C5926g0<? extends R>>) fVar);
            C9265e eVar = new C9265e(hVar);
            a[36] = true;
            C5923b0 f = a4.mo24002f((C12331g<? super T>) eVar);
            C9264d dVar = new C9264d(hVar, bVar);
            a[37] = true;
            C5923b0 c = f.mo23951c((C12325a) dVar);
            C9263c cVar2 = new C9263c(hVar);
            a[38] = true;
            C5923b0 g2 = c.mo24014g((C12331g<? super C12314c>) cVar2);
            C9262b bVar3 = new C9262b(hVar, activity);
            a[39] = true;
            C5923b0 d = g2.mo23971d((C12325a) bVar3);
            a[40] = true;
            C5923b0 c2 = d.mo23950c(C12304a.m55390a());
            a[41] = true;
            C5923b0 a5 = c2.mo23825a(C12228b.m55094b());
            C9261a aVar = new C9261a(bVar);
            a[42] = true;
            f24491a = (C12314c) a5.mo24007f(aVar);
            a[43] = true;
        }
    }

    /* renamed from: b */
    private static int m43293b(Activity activity) {
        int i;
        boolean[] a = m43292a();
        View decorView = activity.getWindow().getDecorView();
        a[72] = true;
        if (decorView.getHeight() > decorView.getWidth()) {
            i = decorView.getHeight();
            a[73] = true;
        } else {
            i = decorView.getWidth();
            a[74] = true;
        }
        if (i > 640) {
            int i2 = i / 640;
            a[75] = true;
            return i2;
        }
        a[76] = true;
        return 1;
    }
}
