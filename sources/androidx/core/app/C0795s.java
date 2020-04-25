package androidx.core.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.RequiresApi;
import androidx.core.app.C0770p.C0771a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@RequiresApi(16)
/* renamed from: androidx.core.app.s */
/* compiled from: NotificationCompatJellybean */
class C0795s {

    /* renamed from: a */
    public static final String f3765a = "NotificationCompat";

    /* renamed from: b */
    static final String f3766b = "android.support.dataRemoteInputs";

    /* renamed from: c */
    static final String f3767c = "android.support.allowGeneratedReplies";

    /* renamed from: d */
    private static final String f3768d = "icon";

    /* renamed from: e */
    private static final String f3769e = "title";

    /* renamed from: f */
    private static final String f3770f = "actionIntent";

    /* renamed from: g */
    private static final String f3771g = "extras";

    /* renamed from: h */
    private static final String f3772h = "remoteInputs";

    /* renamed from: i */
    private static final String f3773i = "dataOnlyRemoteInputs";

    /* renamed from: j */
    private static final String f3774j = "resultKey";

    /* renamed from: k */
    private static final String f3775k = "label";

    /* renamed from: l */
    private static final String f3776l = "choices";

    /* renamed from: m */
    private static final String f3777m = "allowFreeFormInput";

    /* renamed from: n */
    private static final String f3778n = "allowedDataTypes";

    /* renamed from: o */
    private static final String f3779o = "semanticAction";

    /* renamed from: p */
    private static final String f3780p = "showsUserInterface";

    /* renamed from: q */
    private static final Object f3781q = new Object();

    /* renamed from: r */
    private static Field f3782r;

    /* renamed from: s */
    private static boolean f3783s;

    /* renamed from: t */
    private static final Object f3784t = new Object();

    /* renamed from: u */
    private static Field f3785u;

    /* renamed from: v */
    private static Field f3786v;

    /* renamed from: w */
    private static Field f3787w;

    /* renamed from: x */
    private static Field f3788x;

    /* renamed from: y */
    private static boolean f3789y;

    private C0795s() {
    }

    /* renamed from: a */
    public static SparseArray<Bundle> m4623a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = (Bundle) list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: b */
    private static Object[] m4632b(Notification notification) {
        synchronized (f3784t) {
            if (!m4627a()) {
                return null;
            }
            try {
                Object[] objArr = (Object[]) f3785u.get(notification);
                return objArr;
            } catch (IllegalAccessException unused) {
                f3789y = true;
                return null;
            }
        }
    }

    /* renamed from: c */
    public static Bundle m4633c(Notification notification) {
        synchronized (f3781q) {
            if (f3783s) {
                return null;
            }
            try {
                if (f3782r == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        f3783s = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f3782r = declaredField;
                }
                Bundle bundle = (Bundle) f3782r.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f3782r.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException | NoSuchFieldException unused) {
                f3783s = true;
                return null;
            }
        }
    }

    /* renamed from: a */
    public static C0771a m4624a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        boolean z;
        C0807w[] wVarArr;
        C0807w[] wVarArr2;
        if (bundle != null) {
            C0807w[] a = m4630a(m4628a(bundle, C0794r.f3764f));
            wVarArr2 = a;
            wVarArr = m4630a(m4628a(bundle, f3766b));
            z = bundle.getBoolean(f3767c);
        } else {
            wVarArr2 = null;
            wVarArr = null;
            z = false;
        }
        C0771a aVar = new C0771a(i, charSequence, pendingIntent, bundle, wVarArr2, wVarArr, z, 0, true);
        return aVar;
    }

    /* renamed from: b */
    static C0771a m4631b(Bundle bundle) {
        String str = "extras";
        Bundle bundle2 = bundle.getBundle(str);
        C0771a aVar = new C0771a(bundle.getInt("icon"), bundle.getCharSequence("title"), (PendingIntent) bundle.getParcelable(f3770f), bundle.getBundle(str), m4630a(m4628a(bundle, f3772h)), m4630a(m4628a(bundle, f3773i)), bundle2 != null ? bundle2.getBoolean(f3767c, false) : false, bundle.getInt(f3779o), bundle.getBoolean(f3780p));
        return aVar;
    }

    /* renamed from: a */
    public static Bundle m4620a(Builder builder, C0771a aVar) {
        builder.addAction(aVar.mo4161e(), aVar.mo4165i(), aVar.mo4157a());
        Bundle bundle = new Bundle(aVar.mo4160d());
        if (aVar.mo4162f() != null) {
            bundle.putParcelableArray(C0794r.f3764f, m4629a(aVar.mo4162f()));
        }
        if (aVar.mo4159c() != null) {
            bundle.putParcelableArray(f3766b, m4629a(aVar.mo4159c()));
        }
        bundle.putBoolean(f3767c, aVar.mo4158b());
        return bundle;
    }

    /* renamed from: a */
    public static int m4619a(Notification notification) {
        int length;
        synchronized (f3784t) {
            Object[] b = m4632b(notification);
            length = b != null ? b.length : 0;
        }
        return length;
    }

    /* renamed from: a */
    public static C0771a m4625a(Notification notification, int i) {
        Bundle bundle;
        synchronized (f3784t) {
            try {
                Object[] b = m4632b(notification);
                if (b != null) {
                    Object obj = b[i];
                    Bundle c = m4633c(notification);
                    if (c != null) {
                        SparseArray sparseParcelableArray = c.getSparseParcelableArray(C0794r.f3763e);
                        if (sparseParcelableArray != null) {
                            bundle = (Bundle) sparseParcelableArray.get(i);
                            C0771a a = m4624a(f3786v.getInt(obj), (CharSequence) f3787w.get(obj), (PendingIntent) f3788x.get(obj), bundle);
                            return a;
                        }
                    }
                    bundle = null;
                    C0771a a2 = m4624a(f3786v.getInt(obj), (CharSequence) f3787w.get(obj), (PendingIntent) f3788x.get(obj), bundle);
                    return a2;
                }
            } catch (IllegalAccessException unused) {
                f3789y = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m4627a() {
        if (f3789y) {
            return false;
        }
        try {
            if (f3785u == null) {
                Class cls = Class.forName("android.app.Notification$Action");
                f3786v = cls.getDeclaredField("icon");
                f3787w = cls.getDeclaredField("title");
                f3788x = cls.getDeclaredField(f3770f);
                f3785u = Notification.class.getDeclaredField("actions");
                f3785u.setAccessible(true);
            }
        } catch (ClassNotFoundException unused) {
            f3789y = true;
        } catch (NoSuchFieldException unused2) {
            f3789y = true;
        }
        return true ^ f3789y;
    }

    /* renamed from: a */
    static Bundle m4621a(C0771a aVar) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("icon", aVar.mo4161e());
        bundle2.putCharSequence("title", aVar.mo4165i());
        bundle2.putParcelable(f3770f, aVar.mo4157a());
        if (aVar.mo4160d() != null) {
            bundle = new Bundle(aVar.mo4160d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean(f3767c, aVar.mo4158b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray(f3772h, m4629a(aVar.mo4162f()));
        bundle2.putBoolean(f3780p, aVar.mo4164h());
        bundle2.putInt(f3779o, aVar.mo4163g());
        return bundle2;
    }

    /* renamed from: a */
    private static C0807w m4626a(Bundle bundle) {
        ArrayList stringArrayList = bundle.getStringArrayList(f3778n);
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            Iterator it = stringArrayList.iterator();
            while (it.hasNext()) {
                hashSet.add((String) it.next());
            }
        }
        C0807w wVar = new C0807w(bundle.getString(f3774j), bundle.getCharSequence("label"), bundle.getCharSequenceArray(f3776l), bundle.getBoolean(f3777m), bundle.getBundle("extras"), hashSet);
        return wVar;
    }

    /* renamed from: a */
    private static Bundle m4622a(C0807w wVar) {
        Bundle bundle = new Bundle();
        bundle.putString(f3774j, wVar.mo4407f());
        bundle.putCharSequence("label", wVar.mo4406e());
        bundle.putCharSequenceArray(f3776l, wVar.mo4404c());
        bundle.putBoolean(f3777m, wVar.mo4402a());
        bundle.putBundle("extras", wVar.mo4405d());
        Set<String> b = wVar.mo4403b();
        if (b != null && !b.isEmpty()) {
            ArrayList arrayList = new ArrayList(b.size());
            for (String add : b) {
                arrayList.add(add);
            }
            bundle.putStringArrayList(f3778n, arrayList);
        }
        return bundle;
    }

    /* renamed from: a */
    private static C0807w[] m4630a(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        C0807w[] wVarArr = new C0807w[bundleArr.length];
        for (int i = 0; i < bundleArr.length; i++) {
            wVarArr[i] = m4626a(bundleArr[i]);
        }
        return wVarArr;
    }

    /* renamed from: a */
    private static Bundle[] m4629a(C0807w[] wVarArr) {
        if (wVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[wVarArr.length];
        for (int i = 0; i < wVarArr.length; i++) {
            bundleArr[i] = m4622a(wVarArr[i]);
        }
        return bundleArr;
    }

    /* renamed from: a */
    private static Bundle[] m4628a(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }
}
