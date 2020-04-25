package p212io.branch.indexing;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.appindexing.Action.Builder;
import com.google.firebase.appindexing.Action.Metadata;
import com.google.firebase.appindexing.FirebaseAppIndex;
import com.google.firebase.appindexing.FirebaseUserActions;
import com.google.firebase.appindexing.Indexable;
import com.google.firebase.appindexing.builders.Indexables;
import com.mrsool.utils.C11644i;
import java.lang.reflect.Method;
import p212io.branch.referral.C14204x;
import p212io.branch.referral.util.LinkProperties;

/* renamed from: io.branch.indexing.a */
/* compiled from: AppIndexingHelper */
class C14091a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static FirebaseUserActions f41385a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final LinkProperties f41386b = new LinkProperties().mo44826e("google_search");

    /* renamed from: io.branch.indexing.a$a */
    /* compiled from: AppIndexingHelper */
    static class C14092a implements Runnable {

        /* renamed from: N */
        final /* synthetic */ Context f41387N;

        /* renamed from: a */
        final /* synthetic */ LinkProperties f41388a;

        /* renamed from: b */
        final /* synthetic */ BranchUniversalObject f41389b;

        C14092a(LinkProperties linkProperties, BranchUniversalObject branchUniversalObject, Context context) {
            this.f41388a = linkProperties;
            this.f41389b = branchUniversalObject;
            this.f41387N = context;
        }

        public void run() {
            String str;
            String str2 = "BranchSDK";
            try {
                C14091a.f41385a = FirebaseUserActions.getInstance();
            } catch (NoClassDefFoundError unused) {
                C14204x.m61509d(str2, "Firebase app indexing is not available. Please consider enabling Firebase app indexing for your app for better indexing experience with Google.");
            } catch (Throwable unused2) {
                C14204x.m61509d(str2, "Failed to index your contents using Firebase. Please make sure Firebase  is enabled and initialised in your app");
            }
            LinkProperties linkProperties = this.f41388a;
            if (linkProperties == null) {
                str = this.f41389b.mo44522a(this.f41387N, C14091a.f41386b);
            } else {
                str = this.f41389b.mo44522a(this.f41387N, linkProperties);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Indexing BranchUniversalObject with Google using URL ");
            sb.append(str);
            C14204x.m61509d(str2, sb.toString());
            if (!TextUtils.isEmpty(str)) {
                try {
                    if (C14091a.f41385a != null) {
                        C14091a.m60935b(str, this.f41389b);
                    } else {
                        C14091a.m60934b(str, this.f41387N, this.f41389b);
                    }
                } catch (Throwable unused3) {
                    C14204x.m61509d(str2, "Branch Warning: Unable to list your content in Google search. Please make sure you have added latest Firebase app indexing SDK to your project dependencies.");
                }
            }
        }
    }

    /* renamed from: io.branch.indexing.a$b */
    /* compiled from: AppIndexingHelper */
    static class C14093b implements Runnable {

        /* renamed from: N */
        final /* synthetic */ Context f41390N;

        /* renamed from: a */
        final /* synthetic */ LinkProperties f41391a;

        /* renamed from: b */
        final /* synthetic */ BranchUniversalObject f41392b;

        C14093b(LinkProperties linkProperties, BranchUniversalObject branchUniversalObject, Context context) {
            this.f41391a = linkProperties;
            this.f41392b = branchUniversalObject;
            this.f41390N = context;
        }

        public void run() {
            String str;
            String str2 = "BranchSDK";
            try {
                if (this.f41391a == null) {
                    str = this.f41392b.mo44522a(this.f41390N, C14091a.f41386b);
                } else {
                    str = this.f41392b.mo44522a(this.f41390N, this.f41391a);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Removing indexed BranchUniversalObject with link ");
                sb.append(str);
                C14204x.m61509d(str2, sb.toString());
                FirebaseAppIndex.getInstance().remove(new String[]{str});
            } catch (NoClassDefFoundError unused) {
                C14204x.m61509d(str2, "Failed to remove the BranchUniversalObject from Firebase local indexing. Please make sure Firebase is enabled and initialised in your app");
            } catch (Throwable unused2) {
                C14204x.m61509d(str2, "Failed to index your contents using Firebase. Please make sure Firebase is enabled and initialised in your app");
            }
        }
    }

    C14091a() {
    }

    /* renamed from: b */
    static void m60933b(Context context, BranchUniversalObject branchUniversalObject, LinkProperties linkProperties) {
        new Thread(new C14093b(linkProperties, branchUniversalObject, context)).run();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m60935b(String str, BranchUniversalObject branchUniversalObject) {
        StringBuilder sb = new StringBuilder();
        sb.append(branchUniversalObject.mo44557r());
        sb.append("\n");
        sb.append(branchUniversalObject.mo44550k());
        String sb2 = sb.toString();
        if (branchUniversalObject.mo44559t()) {
            Indexable newSimple = Indexables.newSimple(sb2, str);
            FirebaseAppIndex.getInstance().update(new Indexable[]{newSimple});
        }
        f41385a.end(new Builder("ViewAction").setObject(sb2, str).setMetadata(new Metadata.Builder().setUpload(branchUniversalObject.mo44560u())).build());
    }

    /* renamed from: a */
    static void m60929a(Context context, BranchUniversalObject branchUniversalObject, LinkProperties linkProperties) {
        new Thread(new C14092a(linkProperties, branchUniversalObject, context)).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m60934b(String str, Context context, BranchUniversalObject branchUniversalObject) throws Exception {
        Class cls = Class.forName("com.google.android.gms.appindexing.Thing");
        Class cls2 = Class.forName("com.google.android.gms.appindexing.Thing$Builder");
        Object newInstance = cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
        Method method = cls2.getMethod("setName", new Class[]{String.class});
        Method method2 = cls2.getMethod("setDescription", new Class[]{String.class});
        Method method3 = cls2.getMethod("setUrl", new Class[]{Uri.class});
        String str2 = "build";
        Method method4 = cls2.getMethod(str2, new Class[0]);
        method.invoke(newInstance, new Object[]{branchUniversalObject.mo44557r()});
        method2.invoke(newInstance, new Object[]{branchUniversalObject.mo44550k()});
        method3.invoke(newInstance, new Object[]{Uri.parse(str)});
        Object invoke = method4.invoke(newInstance, new Object[0]);
        Class cls3 = Class.forName("com.google.android.gms.appindexing.Action");
        Class cls4 = Class.forName("com.google.android.gms.appindexing.Action$Builder");
        Object newInstance2 = cls4.getConstructor(new Class[]{String.class}).newInstance(new Object[]{(String) cls3.getDeclaredField("TYPE_VIEW").get(null)});
        Method method5 = cls4.getMethod("setObject", new Class[]{cls});
        Method method6 = cls4.getMethod("setActionStatus", new Class[]{String.class});
        Method method7 = cls4.getMethod(str2, new Class[0]);
        method5.invoke(newInstance2, new Object[]{invoke});
        method6.invoke(newInstance2, new Object[]{(String) cls3.getDeclaredField("STATUS_TYPE_COMPLETED").get(null)});
        Object invoke2 = method7.invoke(newInstance2, new Object[0]);
        Class cls5 = Class.forName("com.google.android.gms.appindexing.AppIndex");
        Class cls6 = Class.forName("com.google.android.gms.common.api.a");
        Class cls7 = Class.forName("com.google.android.gms.common.api.i");
        Class cls8 = Class.forName("com.google.android.gms.common.api.i$a");
        Object newInstance3 = cls8.getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
        Method method8 = cls8.getMethod("addApi", new Class[]{cls6});
        Method method9 = cls8.getMethod(str2, new Class[0]);
        Method method10 = cls7.getMethod("connect", new Class[0]);
        Method method11 = cls7.getMethod("disconnect", new Class[0]);
        method8.invoke(newInstance3, new Object[]{cls6.cast(cls5.getDeclaredField("API").get(null))});
        Object invoke3 = method9.invoke(newInstance3, new Object[0]);
        method10.invoke(invoke3, new Object[0]);
        Class cls9 = Class.forName("com.google.android.gms.appindexing.AppIndexApi");
        Object obj = cls5.getDeclaredField("AppIndexApi").get(null);
        cls9.getMethod(C11644i.f33457y3, new Class[]{cls7, cls3}).invoke(obj, new Object[]{invoke3, invoke2});
        method11.invoke(invoke3, new Object[0]);
    }
}
