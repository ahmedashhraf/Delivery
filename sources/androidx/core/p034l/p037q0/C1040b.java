package androidx.core.p034l.p037q0;

import android.content.ClipDescription;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;

/* renamed from: androidx.core.l.q0.b */
/* compiled from: InputConnectionCompat */
public final class C1040b {

    /* renamed from: a */
    private static final String f4668a = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* renamed from: b */
    private static final String f4669b = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* renamed from: c */
    private static final String f4670c = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* renamed from: d */
    private static final String f4671d = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* renamed from: e */
    private static final String f4672e = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* renamed from: f */
    private static final String f4673f = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* renamed from: g */
    private static final String f4674g = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* renamed from: h */
    private static final String f4675h = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* renamed from: i */
    private static final String f4676i = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* renamed from: j */
    private static final String f4677j = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* renamed from: k */
    private static final String f4678k = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* renamed from: l */
    private static final String f4679l = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* renamed from: m */
    private static final String f4680m = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* renamed from: n */
    private static final String f4681n = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* renamed from: o */
    public static final int f4682o = 1;

    /* renamed from: androidx.core.l.q0.b$a */
    /* compiled from: InputConnectionCompat */
    static class C1041a extends InputConnectionWrapper {

        /* renamed from: a */
        final /* synthetic */ C1043c f4683a;

        C1041a(InputConnection inputConnection, boolean z, C1043c cVar) {
            this.f4683a = cVar;
            super(inputConnection, z);
        }

        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.f4683a.mo5150a(C1044c.m6078a(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* renamed from: androidx.core.l.q0.b$b */
    /* compiled from: InputConnectionCompat */
    static class C1042b extends InputConnectionWrapper {

        /* renamed from: a */
        final /* synthetic */ C1043c f4684a;

        C1042b(InputConnection inputConnection, boolean z, C1043c cVar) {
            this.f4684a = cVar;
            super(inputConnection, z);
        }

        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (C1040b.m6076a(str, bundle, this.f4684a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* renamed from: androidx.core.l.q0.b$c */
    /* compiled from: InputConnectionCompat */
    public interface C1043c {
        /* renamed from: a */
        boolean mo5150a(C1044c cVar, int i, Bundle bundle);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x007d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m6076a(@androidx.annotation.C0195i0 java.lang.String r7, @androidx.annotation.C0193h0 android.os.Bundle r8, @androidx.annotation.C0193h0 androidx.core.p034l.p037q0.C1040b.C1043c r9) {
        /*
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r1 = android.text.TextUtils.equals(r1, r7)
            if (r1 == 0) goto L_0x000e
            r7 = 0
            goto L_0x0017
        L_0x000e:
            java.lang.String r1 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r7 = android.text.TextUtils.equals(r1, r7)
            if (r7 == 0) goto L_0x0081
            r7 = 1
        L_0x0017:
            r1 = 0
            if (r7 == 0) goto L_0x001d
            java.lang.String r2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
            goto L_0x001f
        L_0x001d:
            java.lang.String r2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
        L_0x001f:
            android.os.Parcelable r2 = r8.getParcelable(r2)     // Catch:{ all -> 0x0079 }
            android.os.ResultReceiver r2 = (android.os.ResultReceiver) r2     // Catch:{ all -> 0x0079 }
            if (r7 == 0) goto L_0x002a
            java.lang.String r3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI"
            goto L_0x002c
        L_0x002a:
            java.lang.String r3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"
        L_0x002c:
            android.os.Parcelable r3 = r8.getParcelable(r3)     // Catch:{ all -> 0x0077 }
            android.net.Uri r3 = (android.net.Uri) r3     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0037
            java.lang.String r4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
            goto L_0x0039
        L_0x0037:
            java.lang.String r4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
        L_0x0039:
            android.os.Parcelable r4 = r8.getParcelable(r4)     // Catch:{ all -> 0x0077 }
            android.content.ClipDescription r4 = (android.content.ClipDescription) r4     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0044
            java.lang.String r5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
            goto L_0x0046
        L_0x0044:
            java.lang.String r5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
        L_0x0046:
            android.os.Parcelable r5 = r8.getParcelable(r5)     // Catch:{ all -> 0x0077 }
            android.net.Uri r5 = (android.net.Uri) r5     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0051
            java.lang.String r6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
            goto L_0x0053
        L_0x0051:
            java.lang.String r6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
        L_0x0053:
            int r6 = r8.getInt(r6)     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x005c
            java.lang.String r7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
            goto L_0x005e
        L_0x005c:
            java.lang.String r7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
        L_0x005e:
            android.os.Parcelable r7 = r8.getParcelable(r7)     // Catch:{ all -> 0x0077 }
            android.os.Bundle r7 = (android.os.Bundle) r7     // Catch:{ all -> 0x0077 }
            if (r3 == 0) goto L_0x0071
            if (r4 == 0) goto L_0x0071
            androidx.core.l.q0.c r8 = new androidx.core.l.q0.c     // Catch:{ all -> 0x0077 }
            r8.<init>(r3, r4, r5)     // Catch:{ all -> 0x0077 }
            boolean r0 = r9.mo5150a(r8, r6, r7)     // Catch:{ all -> 0x0077 }
        L_0x0071:
            if (r2 == 0) goto L_0x0076
            r2.send(r0, r1)
        L_0x0076:
            return r0
        L_0x0077:
            r7 = move-exception
            goto L_0x007b
        L_0x0079:
            r7 = move-exception
            r2 = r1
        L_0x007b:
            if (r2 == 0) goto L_0x0080
            r2.send(r0, r1)
        L_0x0080:
            throw r7
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.p034l.p037q0.C1040b.m6076a(java.lang.String, android.os.Bundle, androidx.core.l.q0.b$c):boolean");
    }

    /* renamed from: a */
    public static boolean m6075a(@C0193h0 InputConnection inputConnection, @C0193h0 EditorInfo editorInfo, @C0193h0 C1044c cVar, int i, @C0195i0 Bundle bundle) {
        boolean z;
        ClipDescription b = cVar.mo5152b();
        String[] a = C1039a.m6072a(editorInfo);
        int length = a.length;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            } else if (b.hasMimeType(a[i2])) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (!z) {
            return false;
        }
        if (VERSION.SDK_INT >= 25) {
            return inputConnection.commitContent((InputContentInfo) cVar.mo5156f(), i, bundle);
        }
        int b2 = C1039a.m6073b(editorInfo);
        if (b2 == 2) {
            z2 = true;
        } else if (!(b2 == 3 || b2 == 4)) {
            return false;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(z2 ? f4671d : f4670c, cVar.mo5151a());
        bundle2.putParcelable(z2 ? f4673f : f4672e, cVar.mo5152b());
        bundle2.putParcelable(z2 ? f4675h : f4674g, cVar.mo5153c());
        bundle2.putInt(z2 ? f4679l : f4678k, i);
        bundle2.putParcelable(z2 ? f4677j : f4676i, bundle);
        return inputConnection.performPrivateCommand(z2 ? f4669b : f4668a, bundle2);
    }

    @C0193h0
    /* renamed from: a */
    public static InputConnection m6074a(@C0193h0 InputConnection inputConnection, @C0193h0 EditorInfo editorInfo, @C0193h0 C1043c cVar) {
        if (inputConnection == null) {
            throw new IllegalArgumentException("inputConnection must be non-null");
        } else if (editorInfo == null) {
            throw new IllegalArgumentException("editorInfo must be non-null");
        } else if (cVar == null) {
            throw new IllegalArgumentException("onCommitContentListener must be non-null");
        } else if (VERSION.SDK_INT >= 25) {
            return new C1041a(inputConnection, false, cVar);
        } else {
            if (C1039a.m6072a(editorInfo).length == 0) {
                return inputConnection;
            }
            return new C1042b(inputConnection, false, cVar);
        }
    }
}
