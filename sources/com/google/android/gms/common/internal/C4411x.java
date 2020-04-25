package com.google.android.gms.common.internal;

import androidx.annotation.C0193h0;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.util.C4476d0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

@C4056a
/* renamed from: com.google.android.gms.common.internal.x */
public class C4411x {

    /* renamed from: b */
    private static final C4366m f13538b = new C4366m("LibraryVersion", "");

    /* renamed from: c */
    private static C4411x f13539c = new C4411x();

    /* renamed from: a */
    private ConcurrentHashMap<String, String> f13540a = new ConcurrentHashMap<>();

    @C4476d0
    protected C4411x() {
    }

    @C4056a
    /* renamed from: a */
    public static C4411x m19049a() {
        return f13539c;
    }

    @C4056a
    /* renamed from: a */
    public String mo18400a(@C0193h0 String str) {
        String str2 = "Failed to get app version for libraryName: ";
        String str3 = "LibraryVersion";
        C4300a0.m18622a(str, (Object) "Please provide a valid libraryName");
        if (this.f13540a.containsKey(str)) {
            return (String) this.f13540a.get(str);
        }
        Properties properties = new Properties();
        String str4 = null;
        try {
            InputStream resourceAsStream = C4411x.class.getResourceAsStream(String.format("/%s.properties", new Object[]{str}));
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
                str4 = properties.getProperty("version", null);
                C4366m mVar = f13538b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(str4).length());
                sb.append(str);
                sb.append(" version is ");
                sb.append(str4);
                mVar.mo18360e(str3, sb.toString());
            } else {
                C4366m mVar2 = f13538b;
                String valueOf = String.valueOf(str);
                mVar2.mo18353b(str3, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
        } catch (IOException e) {
            C4366m mVar3 = f13538b;
            String valueOf2 = String.valueOf(str);
            mVar3.mo18354b(str3, valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), (Throwable) e);
        }
        if (str4 == null) {
            f13538b.mo18348a(str3, ".properties file is dropped during release process. Failure to read app version isexpected druing Google internal testing where locally-built libraries are used");
            str4 = "UNKNOWN";
        }
        this.f13540a.put(str, str4);
        return str4;
    }
}
