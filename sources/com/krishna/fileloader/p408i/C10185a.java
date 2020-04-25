package com.krishna.fileloader.p408i;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import com.krishna.fileloader.C10171b.C5875b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: com.krishna.fileloader.i.a */
/* compiled from: AndroidFileManager */
public class C10185a {

    /* renamed from: a */
    private String f27187a = "";

    /* renamed from: a */
    public static File m47367a(Context context, String str, String str2, int i, String str3) throws Exception {
        if (TextUtils.isEmpty(str3)) {
            str3 = m47374b(str);
        }
        return new File(m47366a(context, str2, i), str3);
    }

    /* renamed from: b */
    public static File m47371b(Context context, String str, String str2, int i) throws Exception {
        return new File(m47366a(context, str2, i), m47374b(str));
    }

    /* renamed from: c */
    public static File m47376c(Context context, String str, String str2, @C5875b int i) throws Exception {
        if (!TextUtils.isEmpty(str2)) {
            File a = m47366a(context, str2, i);
            if (a != null && a.exists()) {
                File[] listFiles = a.listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        if (!file.isDirectory() && file.getName().equals(m47374b(str))) {
                            return file;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private static String m47369a(URL url) {
        String path = url.getPath();
        if (path != null) {
            String[] split = path.split("/");
            if (split.length > 0) {
                String str = split[split.length - 1];
                if (C10188d.m47383a(str)) {
                    return str;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m47374b(String str) throws Exception {
        try {
            String a = m47369a(new URL(str));
            return a == null ? String.valueOf(str.hashCode()) : a;
        } catch (MalformedURLException unused) {
            if (!str.contains("/")) {
                return str;
            }
            throw new Exception("File name should not contain path separator \"/\"");
        }
    }

    /* renamed from: a */
    public static File m47366a(Context context, String str, int i) throws Exception {
        File file;
        if (i == 2) {
            file = new File(context.getCacheDir(), str);
        } else if (i == 3) {
            file = m47365a(context, str);
        } else if (i != 4) {
            file = new File(context.getFilesDir(), str);
        } else {
            file = m47368a(str);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: b */
    private static boolean m47375b() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* renamed from: b */
    public static String m47373b(File file) {
        StringBuilder sb = new StringBuilder();
        try {
            if (file.exists()) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    @C0193h0
    /* renamed from: a */
    private static File m47368a(String str) throws Exception {
        if (m47375b()) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return new File(Environment.getExternalStorageDirectory().getAbsolutePath(), str);
            }
            return new File(externalStorageDirectory, str);
        }
        throw new Exception("External storage is not available for write operation");
    }

    /* renamed from: b */
    public static File m47372b(Context context, String str, String str2, @C5875b int i, String str3) throws Exception {
        if (!TextUtils.isEmpty(str2)) {
            File a = m47366a(context, str2, i);
            if (a != null && a.exists()) {
                File[] listFiles = a.listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        if (!file.isDirectory() && file.getName().equals(str3)) {
                            return file;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private static File m47365a(Context context, String str) throws Exception {
        String str2;
        if (m47375b()) {
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir == null) {
                str2 = context.getFilesDir().getAbsolutePath();
            } else {
                str2 = externalFilesDir.getAbsolutePath();
            }
            return new File(str2, str);
        }
        throw new Exception("External storage is not available for write operation");
    }

    /* renamed from: a */
    public boolean mo36508a() {
        String externalStorageState = Environment.getExternalStorageState();
        return "mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState);
    }

    /* renamed from: a */
    public static Bitmap m47364a(File file) {
        return BitmapFactory.decodeFile(file.getPath());
    }

    /* renamed from: a */
    public static void m47370a(Context context, String str, String str2, @C5875b int i) throws Exception {
        File b = m47371b(context, str, str2, i);
        if (b.exists()) {
            b.delete();
        }
    }
}
