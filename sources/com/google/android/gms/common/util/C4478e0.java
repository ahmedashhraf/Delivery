package com.google.android.gms.common.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Process;
import android.os.WorkSource;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.p172q.C4439c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@C4056a
/* renamed from: com.google.android.gms.common.util.e0 */
public class C4478e0 {

    /* renamed from: a */
    private static final int f13710a = Process.myUid();

    /* renamed from: b */
    private static final Method f13711b = m19341e();

    /* renamed from: c */
    private static final Method f13712c = m19342f();

    /* renamed from: d */
    private static final Method f13713d = m19343g();

    /* renamed from: e */
    private static final Method f13714e = m19332a();

    /* renamed from: f */
    private static final Method f13715f = m19338b();

    /* renamed from: g */
    private static final Method f13716g = m19339c();

    /* renamed from: h */
    private static final Method f13717h = m19340d();

    private C4478e0() {
    }

    /* renamed from: a */
    private static WorkSource m19328a(int i, String str) {
        WorkSource workSource = new WorkSource();
        m19334a(workSource, i, str);
        return workSource;
    }

    /* renamed from: b */
    private static int m19337b(WorkSource workSource) {
        Method method = f13713d;
        if (method != null) {
            try {
                return ((Integer) method.invoke(workSource, new Object[0])).intValue();
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    /* renamed from: c */
    private static final Method m19339c() {
        if (C4503v.m19421o()) {
            try {
                return WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: d */
    private static final Method m19340d() {
        if (C4503v.m19421o()) {
            try {
                return Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[]{Integer.TYPE, String.class});
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: e */
    private static Method m19341e() {
        try {
            return WorkSource.class.getMethod("add", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    private static Method m19342f() {
        if (C4503v.m19413g()) {
            try {
                return WorkSource.class.getMethod("add", new Class[]{Integer.TYPE, String.class});
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: g */
    private static Method m19343g() {
        try {
            return WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    @C4056a
    @C0195i0
    /* renamed from: a */
    public static WorkSource m19329a(Context context, @C0195i0 String str) {
        if (!(context == null || context.getPackageManager() == null || str == null)) {
            try {
                ApplicationInfo a = C4439c.m19110a(context).mo18446a(str, 0);
                if (a != null) {
                    return m19328a(a.uid, str);
                }
                String str2 = "Could not get applicationInfo from package: ";
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2.concat(valueOf);
                } else {
                    new String(str2);
                }
                return null;
            } catch (NameNotFoundException unused) {
                String str3 = "Could not find package: ";
                String valueOf2 = String.valueOf(str);
                if (valueOf2.length() != 0) {
                    str3.concat(valueOf2);
                } else {
                    new String(str3);
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    private static int m19336b(Context context, String str) {
        try {
            ApplicationInfo a = C4439c.m19110a(context).mo18446a(str, 0);
            if (a != null) {
                return a.uid;
            }
            String str2 = "Could not get applicationInfo from package: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            return -1;
        } catch (NameNotFoundException unused) {
            String str3 = "Could not find package: ";
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                str3.concat(valueOf2);
            } else {
                new String(str3);
            }
            return -1;
        }
    }

    /* renamed from: b */
    private static Method m19338b() {
        if (C4503v.m19413g()) {
            try {
                return WorkSource.class.getMethod("getName", new Class[]{Integer.TYPE});
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m19334a(WorkSource workSource, int i, @C0195i0 String str) {
        if (f13712c != null) {
            if (str == null) {
                str = "";
            }
            try {
                f13712c.invoke(workSource, new Object[]{Integer.valueOf(i), str});
            } catch (Exception unused) {
            }
            return;
        }
        Method method = f13711b;
        if (method != null) {
            try {
                method.invoke(workSource, new Object[]{Integer.valueOf(i)});
            } catch (Exception unused2) {
            }
        }
    }

    @C4056a
    /* renamed from: a */
    public static WorkSource m19330a(Context context, String str, String str2) {
        WorkSource workSource = null;
        if (!(context == null || context.getPackageManager() == null || str2 == null || str == null)) {
            int b = m19336b(context, str);
            if (b < 0) {
                return null;
            }
            workSource = new WorkSource();
            Method method = f13716g;
            if (method == null || f13717h == null) {
                m19334a(workSource, b, str);
            } else {
                try {
                    Object invoke = method.invoke(workSource, new Object[0]);
                    if (b != f13710a) {
                        f13717h.invoke(invoke, new Object[]{Integer.valueOf(b), str});
                    }
                    f13717h.invoke(invoke, new Object[]{Integer.valueOf(f13710a), str2});
                } catch (Exception unused) {
                }
            }
        }
        return workSource;
    }

    @C0195i0
    /* renamed from: a */
    private static String m19331a(WorkSource workSource, int i) {
        Method method = f13715f;
        if (method != null) {
            try {
                return (String) method.invoke(workSource, new Object[]{Integer.valueOf(i)});
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @C4056a
    /* renamed from: a */
    public static List<String> m19333a(@C0195i0 WorkSource workSource) {
        int b = workSource == null ? 0 : m19337b(workSource);
        if (b == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            String a = m19331a(workSource, i);
            if (!C4472b0.m19314b(a)) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    @C4056a
    /* renamed from: a */
    public static boolean m19335a(Context context) {
        if (context == null || context.getPackageManager() == null) {
            return false;
        }
        if (C4439c.m19110a(context).mo18445a("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static Method m19332a() {
        try {
            return WorkSource.class.getMethod("get", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            return null;
        }
    }
}
