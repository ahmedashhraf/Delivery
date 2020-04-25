package com.krishna.fileloader.p408i;

import android.text.TextUtils;
import com.google.gson.C8775f;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: com.krishna.fileloader.i.d */
/* compiled from: Utils */
public class C10188d {
    /* renamed from: a */
    private static Object m47380a(File file, Class cls) {
        return new C8775f().mo32314a(C10185a.m47373b(file), cls);
    }

    /* renamed from: b */
    private static Object m47385b(File file, Class cls) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        Object readObject = objectInputStream.readObject();
        objectInputStream.close();
        return readObject;
    }

    /* renamed from: c */
    public static Object m47386c(File file, Class cls) {
        try {
            return m47385b(file, cls);
        } catch (IOException | ClassNotFoundException unused) {
            return m47380a(file, cls);
        }
    }

    /* renamed from: a */
    public static ThreadPoolExecutor m47382a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(60, 80, (long) 30, TimeUnit.SECONDS, new LinkedBlockingQueue(80));
        return threadPoolExecutor;
    }

    /* renamed from: b */
    public static long m47384b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z").parse(str).getTime();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static boolean m47383a(String str) {
        return Pattern.compile(".*\\..*").matcher(str).matches();
    }

    /* renamed from: a */
    public static String m47381a(long j) {
        if (j <= 0) {
            return null;
        }
        try {
            return new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z").format(Long.valueOf(j));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
