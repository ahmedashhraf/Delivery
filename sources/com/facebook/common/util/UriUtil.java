package com.facebook.common.util;

import android.net.Uri;
import android.net.Uri.Builder;
import android.provider.ContactsContract;
import android.provider.MediaStore.Images.Media;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import p201f.p202a.C5952h;

public class UriUtil {
    public static final String DATA_SCHEME = "data";
    public static final String HTTPS_SCHEME = "https";
    public static final String HTTP_SCHEME = "http";
    public static final String LOCAL_ASSET_SCHEME = "asset";
    private static final Uri LOCAL_CONTACT_IMAGE_URI = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo");
    public static final String LOCAL_CONTENT_SCHEME = "content";
    public static final String LOCAL_FILE_SCHEME = "file";
    public static final String LOCAL_RESOURCE_SCHEME = "res";
    public static final String QUALIFIED_RESOURCE_SCHEME = "android.resource";

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034  */
    @p201f.p202a.C5952h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getRealPathFromUri(android.content.ContentResolver r8, android.net.Uri r9) {
        /*
            boolean r0 = isLocalContentUri(r9)
            r1 = 0
            if (r0 == 0) goto L_0x0038
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0030 }
            if (r8 == 0) goto L_0x002a
            boolean r9 = r8.moveToFirst()     // Catch:{ all -> 0x0028 }
            if (r9 == 0) goto L_0x002a
            java.lang.String r9 = "_data"
            int r9 = r8.getColumnIndex(r9)     // Catch:{ all -> 0x0028 }
            r0 = -1
            if (r9 == r0) goto L_0x002a
            java.lang.String r9 = r8.getString(r9)     // Catch:{ all -> 0x0028 }
            r1 = r9
            goto L_0x002a
        L_0x0028:
            r9 = move-exception
            goto L_0x0032
        L_0x002a:
            if (r8 == 0) goto L_0x0042
            r8.close()
            goto L_0x0042
        L_0x0030:
            r9 = move-exception
            r8 = r1
        L_0x0032:
            if (r8 == 0) goto L_0x0037
            r8.close()
        L_0x0037:
            throw r9
        L_0x0038:
            boolean r8 = isLocalFileUri(r9)
            if (r8 == 0) goto L_0x0042
            java.lang.String r1 = r9.getPath()
        L_0x0042:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.util.UriUtil.getRealPathFromUri(android.content.ContentResolver, android.net.Uri):java.lang.String");
    }

    @C5952h
    public static String getSchemeOrNull(@C5952h Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    public static Uri getUriForFile(File file) {
        return Uri.fromFile(file);
    }

    public static Uri getUriForQualifiedResource(String str, int i) {
        return new Builder().scheme(QUALIFIED_RESOURCE_SCHEME).authority(str).path(String.valueOf(i)).build();
    }

    public static Uri getUriForResourceId(int i) {
        return new Builder().scheme(LOCAL_RESOURCE_SCHEME).path(String.valueOf(i)).build();
    }

    public static boolean isDataUri(@C5952h Uri uri) {
        return "data".equals(getSchemeOrNull(uri));
    }

    public static boolean isLocalAssetUri(@C5952h Uri uri) {
        return LOCAL_ASSET_SCHEME.equals(getSchemeOrNull(uri));
    }

    public static boolean isLocalCameraUri(Uri uri) {
        String uri2 = uri.toString();
        return uri2.startsWith(Media.EXTERNAL_CONTENT_URI.toString()) || uri2.startsWith(Media.INTERNAL_CONTENT_URI.toString());
    }

    public static boolean isLocalContactUri(Uri uri) {
        if (isLocalContentUri(uri)) {
            if ("com.android.contacts".equals(uri.getAuthority()) && !uri.getPath().startsWith(LOCAL_CONTACT_IMAGE_URI.getPath())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isLocalContentUri(@C5952h Uri uri) {
        return "content".equals(getSchemeOrNull(uri));
    }

    public static boolean isLocalFileUri(@C5952h Uri uri) {
        return LOCAL_FILE_SCHEME.equals(getSchemeOrNull(uri));
    }

    public static boolean isLocalResourceUri(@C5952h Uri uri) {
        return LOCAL_RESOURCE_SCHEME.equals(getSchemeOrNull(uri));
    }

    public static boolean isNetworkUri(@C5952h Uri uri) {
        String schemeOrNull = getSchemeOrNull(uri);
        return HTTPS_SCHEME.equals(schemeOrNull) || "http".equals(schemeOrNull);
    }

    public static boolean isQualifiedResourceUri(@C5952h Uri uri) {
        return QUALIFIED_RESOURCE_SCHEME.equals(getSchemeOrNull(uri));
    }

    public static Uri parseUriOrNull(@C5952h String str) {
        if (str != null) {
            return Uri.parse(str);
        }
        return null;
    }

    @C5952h
    public static URL uriToUrl(@C5952h Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}