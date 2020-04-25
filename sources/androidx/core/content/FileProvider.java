package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0221u;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.AckRequest;
import org.xmlpull.v1.XmlPullParserException;

public class FileProvider extends ContentProvider {

    /* renamed from: N */
    private static final String f3965N = "android.support.FILE_PROVIDER_PATHS";

    /* renamed from: O */
    private static final String f3966O = "root-path";

    /* renamed from: P */
    private static final String f3967P = "files-path";

    /* renamed from: Q */
    private static final String f3968Q = "cache-path";

    /* renamed from: R */
    private static final String f3969R = "external-path";

    /* renamed from: S */
    private static final String f3970S = "external-files-path";

    /* renamed from: T */
    private static final String f3971T = "external-cache-path";

    /* renamed from: U */
    private static final String f3972U = "external-media-path";

    /* renamed from: V */
    private static final String f3973V = "name";

    /* renamed from: W */
    private static final String f3974W = "path";

    /* renamed from: X */
    private static final File f3975X = new File("/");
    @C0221u("sCache")

    /* renamed from: Y */
    private static HashMap<String, C0838a> f3976Y = new HashMap<>();

    /* renamed from: b */
    private static final String[] f3977b = {"_display_name", "_size"};

    /* renamed from: a */
    private C0838a f3978a;

    /* renamed from: androidx.core.content.FileProvider$a */
    interface C0838a {
        /* renamed from: a */
        Uri mo4498a(File file);

        /* renamed from: a */
        File mo4499a(Uri uri);
    }

    /* renamed from: androidx.core.content.FileProvider$b */
    static class C0839b implements C0838a {

        /* renamed from: a */
        private final String f3979a;

        /* renamed from: b */
        private final HashMap<String, File> f3980b = new HashMap<>();

        C0839b(String str) {
            this.f3979a = str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4500a(String str, File file) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.f3980b.put(str, file.getCanonicalFile());
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to resolve canonical path for ");
                    sb.append(file);
                    throw new IllegalArgumentException(sb.toString(), e);
                }
            } else {
                throw new IllegalArgumentException("Name must not be empty");
            }
        }

        /* renamed from: a */
        public Uri mo4498a(File file) {
            String str;
            try {
                String canonicalPath = file.getCanonicalPath();
                Entry entry = null;
                for (Entry entry2 : this.f3980b.entrySet()) {
                    String path = ((File) entry2.getValue()).getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry != null) {
                    String path2 = ((File) entry.getValue()).getPath();
                    String str2 = "/";
                    if (path2.endsWith(str2)) {
                        str = canonicalPath.substring(path2.length());
                    } else {
                        str = canonicalPath.substring(path2.length() + 1);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(Uri.encode((String) entry.getKey()));
                    sb.append('/');
                    sb.append(Uri.encode(str, str2));
                    return new Builder().scheme("content").authority(this.f3979a).encodedPath(sb.toString()).build();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to find configured root that contains ");
                sb2.append(canonicalPath);
                throw new IllegalArgumentException(sb2.toString());
            } catch (IOException unused) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Failed to resolve canonical path for ");
                sb3.append(file);
                throw new IllegalArgumentException(sb3.toString());
            }
        }

        /* renamed from: a */
        public File mo4499a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = (File) this.f3980b.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to resolve canonical path for ");
                    sb.append(file2);
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to find configured root for ");
                sb2.append(uri);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
    }

    /* renamed from: a */
    public static Uri m4903a(@C0193h0 Context context, @C0193h0 String str, @C0193h0 File file) {
        return m4904a(context, str).mo4498a(file);
    }

    /* renamed from: b */
    private static C0838a m4908b(Context context, String str) throws IOException, XmlPullParserException {
        C0839b bVar = new C0839b(str);
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (resolveContentProvider != null) {
            XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), f3965N);
            if (loadXmlMetaData != null) {
                while (true) {
                    int next = loadXmlMetaData.next();
                    if (next == 1) {
                        return bVar;
                    }
                    if (next == 2) {
                        String name = loadXmlMetaData.getName();
                        File file = null;
                        String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                        String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                        if (f3966O.equals(name)) {
                            file = f3975X;
                        } else if (f3967P.equals(name)) {
                            file = context.getFilesDir();
                        } else if (f3968Q.equals(name)) {
                            file = context.getCacheDir();
                        } else if (f3969R.equals(name)) {
                            file = Environment.getExternalStorageDirectory();
                        } else if (f3970S.equals(name)) {
                            File[] b = C0841b.m4927b(context, (String) null);
                            if (b.length > 0) {
                                file = b[0];
                            }
                        } else if (f3971T.equals(name)) {
                            File[] d = C0841b.m4930d(context);
                            if (d.length > 0) {
                                file = d[0];
                            }
                        } else if (VERSION.SDK_INT >= 21 && f3972U.equals(name)) {
                            File[] externalMediaDirs = context.getExternalMediaDirs();
                            if (externalMediaDirs.length > 0) {
                                file = externalMediaDirs[0];
                            }
                        }
                        if (file != null) {
                            bVar.mo4500a(attributeValue, m4905a(file, attributeValue2));
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Couldn't find meta-data for provider with authority ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public void attachInfo(@C0193h0 Context context, @C0193h0 ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            this.f3978a = m4904a(context, providerInfo.authority);
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public int delete(@C0193h0 Uri uri, @C0195i0 String str, @C0195i0 String[] strArr) {
        return this.f3978a.mo4499a(uri).delete() ? 1 : 0;
    }

    public String getType(@C0193h0 Uri uri) {
        File a = this.f3978a.mo4499a(uri);
        int lastIndexOf = a.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a.getName().substring(lastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        return "application/octet-stream";
    }

    public Uri insert(@C0193h0 Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public boolean onCreate() {
        return true;
    }

    public ParcelFileDescriptor openFile(@C0193h0 Uri uri, @C0193h0 String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(this.f3978a.mo4499a(uri), m4902a(str));
    }

    public Cursor query(@C0193h0 Uri uri, @C0195i0 String[] strArr, @C0195i0 String str, @C0195i0 String[] strArr2, @C0195i0 String str2) {
        int i;
        File a = this.f3978a.mo4499a(uri);
        if (strArr == null) {
            strArr = f3977b;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            String str4 = "_display_name";
            if (str4.equals(str3)) {
                strArr3[i2] = str4;
                i = i2 + 1;
                objArr[i2] = a.getName();
            } else {
                String str5 = "_size";
                if (str5.equals(str3)) {
                    strArr3[i2] = str5;
                    i = i2 + 1;
                    objArr[i2] = Long.valueOf(a.length());
                }
            }
            i2 = i;
        }
        String[] a2 = m4907a(strArr3, i2);
        Object[] a3 = m4906a(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(a2, 1);
        matrixCursor.addRow(a3);
        return matrixCursor;
    }

    public int update(@C0193h0 Uri uri, ContentValues contentValues, @C0195i0 String str, @C0195i0 String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    /* renamed from: a */
    private static C0838a m4904a(Context context, String str) {
        C0838a aVar;
        synchronized (f3976Y) {
            aVar = (C0838a) f3976Y.get(str);
            if (aVar == null) {
                try {
                    aVar = m4908b(context, str);
                    f3976Y.put(str, aVar);
                } catch (IOException e) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                } catch (XmlPullParserException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return aVar;
    }

    /* renamed from: a */
    private static int m4902a(String str) {
        if (AckRequest.ELEMENT.equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid mode: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private static File m4905a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    /* renamed from: a */
    private static String[] m4907a(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    /* renamed from: a */
    private static Object[] m4906a(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }
}
