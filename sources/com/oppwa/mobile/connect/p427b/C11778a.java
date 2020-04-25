package com.oppwa.mobile.connect.p427b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.C0193h0;
import com.krishna.fileloader.p408i.C10186b;
import com.oppwa.mobile.connect.provider.C11977a.C11978a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: com.oppwa.mobile.connect.b.a */
public class C11778a {

    /* renamed from: a */
    private static final Integer f34041a = Integer.valueOf(4);

    /* renamed from: b */
    private static SoftReference<Pattern> f34042b;

    /* renamed from: c */
    private static File f34043c;

    /* renamed from: d */
    protected static String f34044d;

    /* renamed from: a */
    protected static File m52919a(Context context) {
        if (f34043c == null) {
            f34043c = m52933b(context);
        }
        return f34043c;
    }

    /* renamed from: a */
    private static String m52920a(C11781d dVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.mo40304a());
        String str = "\n";
        sb.append(str);
        sb.append(dVar.mo40305b());
        sb.append(str);
        sb.append(dVar.mo40306c());
        sb.append(str);
        sb.append(dVar.mo40307d());
        sb.append(str);
        sb.append("*****");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    private static String m52921a(C11978a aVar) {
        return aVar == C11978a.LIVE ? "logL" : "logT";
    }

    /* renamed from: a */
    private static String m52922a(C11978a aVar, Long l) {
        StringBuilder sb = new StringBuilder();
        sb.append(m52921a(aVar));
        sb.append(String.valueOf(l));
        return sb.toString();
    }

    /* renamed from: a */
    private static HashMap<String, List<C11781d>> m52923a(List<C11781d> list) {
        HashMap<String, List<C11781d>> hashMap = new HashMap<>();
        for (C11781d dVar : list) {
            String a = dVar.mo40304a();
            if (hashMap.containsKey(a)) {
                ((List) hashMap.get(a)).add(dVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(dVar);
                hashMap.put(a, arrayList);
            }
        }
        return hashMap;
    }

    @C0193h0
    /* renamed from: a */
    protected static List<C11781d> m52924a(Context context, String str) {
        BufferedReader bufferedReader;
        String str2 = "\n";
        StringBuilder sb = new StringBuilder();
        try {
            bufferedReader = new BufferedReader(new FileReader(m52934b(context, str)));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                        sb.append(str2);
                    }
                } catch (Exception e) {
                    m52931a(e);
                }
                break;
            }
            bufferedReader.close();
        } catch (Exception e2) {
            m52931a(e2);
        } catch (Throwable th) {
            bufferedReader.close();
            throw th;
        }
        return m52925a(sb.toString().split(str2));
    }

    @C0193h0
    /* renamed from: a */
    private static List<C11781d> m52925a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = sb;
        String str = "";
        String str2 = str;
        String str3 = str2;
        int i = 0;
        for (String str4 : strArr) {
            if (str4.equals("*****")) {
                arrayList.add(new C11781d(str, str2, str3, sb2.toString()));
                sb2 = new StringBuilder();
                i = 0;
            } else {
                if (i == 0) {
                    str = str4;
                } else if (i == 1) {
                    str2 = str4;
                } else if (i != 2) {
                    if (sb2.length() > 0) {
                        sb2.append("\n");
                    }
                    sb2.append(str4);
                } else {
                    str3 = str4;
                }
                i++;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static Pattern m52926a() {
        SoftReference<Pattern> softReference = f34042b;
        if (softReference == null || softReference.get() == null) {
            f34042b = new SoftReference<>(Pattern.compile("[a-zA-Z]{4}[0-9]{10,}$"));
        }
        return (Pattern) f34042b.get();
    }

    /* renamed from: a */
    public static void m52927a(Context context, String str, String str2, C11978a aVar) {
        m52928a(context, str, "ERROR", str2, aVar);
    }

    /* renamed from: a */
    private static void m52928a(Context context, String str, String str2, String str3, C11978a aVar) {
        if (f34044d == null) {
            f34044d = m52922a(aVar, Long.valueOf(System.currentTimeMillis()));
        }
        m52930a(m52934b(context, f34044d), m52920a(new C11781d(str, str2, String.valueOf(System.currentTimeMillis()), str3)));
    }

    /* renamed from: a */
    private static void m52929a(Context context, List<C11781d> list, String str) {
        if (m52941c(context)) {
            if (str.equals(f34044d)) {
                f34044d = null;
            }
            new C11782e(list, m52938c(str), m52934b(context, str)).execute(new Void[0]);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0020 A[SYNTHETIC, Splitter:B:16:0x0020] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b A[SYNTHETIC, Splitter:B:21:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m52930a(java.io.File r3, java.lang.String r4) {
        /*
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x001a }
            r2 = 1
            r1.<init>(r3, r2)     // Catch:{ Exception -> 0x001a }
            byte[] r3 = r4.getBytes()     // Catch:{ Exception -> 0x0015, all -> 0x0012 }
            r1.write(r3)     // Catch:{ Exception -> 0x0015, all -> 0x0012 }
            r1.close()     // Catch:{ IOException -> 0x0024 }
            goto L_0x0028
        L_0x0012:
            r3 = move-exception
            r0 = r1
            goto L_0x0029
        L_0x0015:
            r3 = move-exception
            r0 = r1
            goto L_0x001b
        L_0x0018:
            r3 = move-exception
            goto L_0x0029
        L_0x001a:
            r3 = move-exception
        L_0x001b:
            m52931a(r3)     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0028
            r0.close()     // Catch:{ IOException -> 0x0024 }
            goto L_0x0028
        L_0x0024:
            r3 = move-exception
            m52931a(r3)
        L_0x0028:
            return
        L_0x0029:
            if (r0 == 0) goto L_0x0033
            r0.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0033
        L_0x002f:
            r4 = move-exception
            m52931a(r4)
        L_0x0033:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.p427b.C11778a.m52930a(java.io.File, java.lang.String):void");
    }

    /* renamed from: a */
    private static void m52931a(Exception exc) {
    }

    /* renamed from: a */
    private static boolean m52932a(String str) {
        return System.currentTimeMillis() - m52942d(str).longValue() > TimeUnit.SECONDS.toMillis(1800);
    }

    /* renamed from: b */
    private static File m52933b(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().getPath());
        sb.append("/logs");
        File file = new File(sb.toString());
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    /* renamed from: b */
    private static File m52934b(Context context, String str) {
        if (m52919a(context) == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m52919a(context).getPath());
        sb.append("/");
        sb.append(str);
        sb.append(C10186b.f27192e);
        return new File(sb.toString());
    }

    /* renamed from: b */
    public static void m52935b(Context context, String str, String str2, C11978a aVar) {
        m52928a(context, str, "INFO", str2, aVar);
    }

    /* renamed from: b */
    private static void m52936b(Context context, List<C11781d> list, String str) {
        m52944d(context, str);
        C11978a c = m52938c(str);
        long longValue = m52942d(str).longValue();
        for (Entry entry : m52923a(list).entrySet()) {
            String a = m52922a(c, Long.valueOf(longValue));
            List<C11781d> list2 = (List) entry.getValue();
            for (C11781d a2 : list2) {
                m52930a(m52934b(context, a), m52920a(a2));
            }
            m52929a(context, list2, a);
            longValue++;
        }
    }

    /* renamed from: b */
    private static boolean m52937b(String str) {
        return m52926a().matcher(str).matches();
    }

    /* renamed from: c */
    private static C11978a m52938c(String str) {
        return str.substring(0, Math.min(str.length(), f34041a.intValue())).equals("logL") ? C11978a.LIVE : C11978a.TEST;
    }

    /* renamed from: c */
    private static void m52939c(Context context, String str) {
        List<C11781d> a = m52924a(context, str);
        if (!a.isEmpty()) {
            String a2 = ((C11781d) a.get(0)).mo40304a();
            for (C11781d a3 : a) {
                if (!a2.equals(a3.mo40304a())) {
                    m52936b(context, a, str);
                    return;
                }
            }
            m52929a(context, a, str);
        }
    }

    /* renamed from: c */
    public static void m52940c(Context context, String str, String str2, C11978a aVar) {
        m52928a(context, str, "WARNING", str2, aVar);
    }

    /* renamed from: c */
    private static boolean m52941c(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    /* renamed from: d */
    private static Long m52942d(String str) {
        return Long.valueOf(Long.parseLong(str.substring(f34041a.intValue())));
    }

    /* renamed from: d */
    public static void m52943d(Context context) {
        m52945e(context);
        File a = m52919a(context);
        if (a != null) {
            for (File name : a.listFiles()) {
                String replace = name.getName().replace(C10186b.f27192e, "");
                if (m52937b(replace)) {
                    if (!m52932a(replace)) {
                        m52939c(context, replace);
                    } else {
                        m52944d(context, replace);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private static void m52944d(Context context, String str) {
        File b = m52934b(context, str);
        if (b != null && !b.delete()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot delete the log file: ");
            sb.append(b);
            sb.toString();
        }
    }

    /* renamed from: e */
    public static void m52945e(Context context) {
        String str = f34044d;
        if (str != null) {
            m52939c(context, str);
        }
    }
}
