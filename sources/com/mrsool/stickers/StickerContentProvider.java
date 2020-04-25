package com.mrsool.stickers;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MatrixCursor.RowBuilder;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.mrsool.C10830i;
import com.mrsool.utils.C5880q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StickerContentProvider extends ContentProvider {

    /* renamed from: N */
    public static final String f32370N = "sticker_pack_name";

    /* renamed from: O */
    public static final String f32371O = "sticker_pack_publisher";

    /* renamed from: P */
    public static final String f32372P = "sticker_pack_icon";

    /* renamed from: Q */
    public static final String f32373Q = "android_play_store_link";

    /* renamed from: R */
    public static final String f32374R = "ios_app_download_link";

    /* renamed from: S */
    public static final String f32375S = "sticker_pack_publisher_email";

    /* renamed from: T */
    public static final String f32376T = "sticker_pack_publisher_website";

    /* renamed from: U */
    public static final String f32377U = "sticker_pack_privacy_policy_website";

    /* renamed from: V */
    public static final String f32378V = "sticker_pack_license_agreement_website";

    /* renamed from: W */
    public static final String f32379W = "sticker_file_name";

    /* renamed from: X */
    public static final String f32380X = "sticker_emoji";

    /* renamed from: Y */
    public static final String f32381Y = "contents.json";

    /* renamed from: Z */
    public static final String f32382Z = "content";

    /* renamed from: a0 */
    public static Uri f32383a0 = new Builder().scheme("content").authority(C10830i.f29740h).appendPath("metadata").build();

    /* renamed from: b */
    public static final String f32384b = "sticker_pack_identifier";

    /* renamed from: b0 */
    private static final UriMatcher f32385b0 = new UriMatcher(-1);

    /* renamed from: c0 */
    static final String f32386c0 = "metadata";

    /* renamed from: d0 */
    private static final int f32387d0 = 1;

    /* renamed from: e0 */
    private static final int f32388e0 = 2;

    /* renamed from: f0 */
    static final String f32389f0 = "stickers";

    /* renamed from: g0 */
    private static final int f32390g0 = 3;

    /* renamed from: h0 */
    static final String f32391h0 = "stickers_asset";

    /* renamed from: i0 */
    private static final int f32392i0 = 4;

    /* renamed from: j0 */
    private static final int f32393j0 = 5;

    /* renamed from: a */
    private List<StickerPack> f32394a;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r4 != null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0020 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m51822a(@androidx.annotation.C0193h0 android.content.Context r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch:{ IOException -> 0x0025, IllegalStateException -> 0x0023 }
            java.lang.String r0 = "contents.json"
            java.io.InputStream r4 = r4.open(r0)     // Catch:{ IOException -> 0x0025, IllegalStateException -> 0x0023 }
            java.util.List r0 = com.mrsool.stickers.C11496j.m51871a(r4)     // Catch:{ all -> 0x0018 }
            r3.f32394a = r0     // Catch:{ all -> 0x0018 }
            if (r4 == 0) goto L_0x0016
            r4.close()     // Catch:{ IOException -> 0x0025, IllegalStateException -> 0x0023 }
        L_0x0016:
            monitor-exit(r3)
            return
        L_0x0018:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001a }
        L_0x001a:
            r0 = move-exception
            if (r4 == 0) goto L_0x0020
            r4.close()     // Catch:{ all -> 0x0020 }
        L_0x0020:
            throw r0     // Catch:{ IOException -> 0x0025, IllegalStateException -> 0x0023 }
        L_0x0021:
            r4 = move-exception
            goto L_0x0041
        L_0x0023:
            r4 = move-exception
            goto L_0x0026
        L_0x0025:
            r4 = move-exception
        L_0x0026:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0021 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0021 }
            r1.<init>()     // Catch:{ all -> 0x0021 }
            java.lang.String r2 = "contents.json file has some issues: "
            r1.append(r2)     // Catch:{ all -> 0x0021 }
            java.lang.String r2 = r4.getMessage()     // Catch:{ all -> 0x0021 }
            r1.append(r2)     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0021 }
            r0.<init>(r1, r4)     // Catch:{ all -> 0x0021 }
            throw r0     // Catch:{ all -> 0x0021 }
        L_0x0041:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrsool.stickers.StickerContentProvider.m51822a(android.content.Context):void");
    }

    /* renamed from: b */
    private AssetFileDescriptor m51823b(Uri uri) throws IllegalArgumentException {
        Context context = getContext();
        context.getClass();
        AssetManager assets = context.getAssets();
        List pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 3) {
            String str = (String) pathSegments.get(pathSegments.size() - 1);
            String str2 = (String) pathSegments.get(pathSegments.size() - 2);
            if (TextUtils.isEmpty(str2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("identifier is empty, uri: ");
                sb.append(uri);
                throw new IllegalArgumentException(sb.toString());
            } else if (!TextUtils.isEmpty(str)) {
                for (StickerPack stickerPack : mo39576a()) {
                    if (str2.equals(stickerPack.f32406a)) {
                        if (str.equals(stickerPack.f32396O)) {
                            return m51819a(uri, assets, str, str2);
                        }
                        for (Sticker sticker : stickerPack.mo39588b()) {
                            if (str.equals(sticker.f32368a)) {
                                return m51819a(uri, assets, str, str2);
                            }
                        }
                        continue;
                    }
                }
                return null;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("file name is empty, uri: ");
                sb2.append(uri);
                throw new IllegalArgumentException(sb2.toString());
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("path segments should be 3, uri is: ");
            sb3.append(uri);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* renamed from: c */
    private Cursor m51824c(@C0193h0 Uri uri) {
        return m51821a(uri, mo39576a());
    }

    @C0193h0
    /* renamed from: d */
    private Cursor m51825d(@C0193h0 Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{f32379W, f32380X});
        for (StickerPack stickerPack : mo39576a()) {
            if (lastPathSegment.equals(stickerPack.f32406a)) {
                for (Sticker sticker : stickerPack.mo39588b()) {
                    matrixCursor.addRow(new Object[]{sticker.f32368a, TextUtils.join(",", sticker.f32369b)});
                }
            }
        }
        Context context = getContext();
        context.getClass();
        matrixCursor.setNotificationUri(context.getContentResolver(), uri);
        return matrixCursor;
    }

    public int delete(@C0193h0 Uri uri, @C0195i0 String str, String[] strArr) {
        throw new UnsupportedOperationException("Not supported");
    }

    public String getType(@C0193h0 Uri uri) {
        int match = f32385b0.match(uri);
        if (match == 1) {
            return "vnd.android.cursor.dir/vnd.com.mrsool.stickercontentprovider.metadata";
        }
        if (match == 2) {
            return "vnd.android.cursor.item/vnd.com.mrsool.stickercontentprovider.metadata";
        }
        if (match == 3) {
            return "vnd.android.cursor.dir/vnd.com.mrsool.stickercontentprovider.stickers";
        }
        if (match == 4) {
            return "image/webp";
        }
        if (match == 5) {
            return "image/png";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown URI: ");
        sb.append(uri);
        throw new IllegalArgumentException(sb.toString());
    }

    public Uri insert(@C0193h0 Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Not supported");
    }

    public boolean onCreate() {
        Context context = getContext();
        context.getClass();
        String packageName = context.getPackageName();
        String str = C10830i.f29740h;
        if (str.startsWith(packageName)) {
            f32385b0.addURI(str, "metadata", 1);
            f32385b0.addURI(str, "metadata/*", 2);
            f32385b0.addURI(str, "stickers/*", 3);
            for (StickerPack stickerPack : mo39576a()) {
                UriMatcher uriMatcher = f32385b0;
                StringBuilder sb = new StringBuilder();
                String str2 = "stickers_asset/";
                sb.append(str2);
                sb.append(stickerPack.f32406a);
                String str3 = "/";
                sb.append(str3);
                sb.append(stickerPack.f32396O);
                uriMatcher.addURI(str, sb.toString(), 5);
                for (Sticker sticker : stickerPack.mo39588b()) {
                    UriMatcher uriMatcher2 = f32385b0;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(stickerPack.f32406a);
                    sb2.append(str3);
                    sb2.append(sticker.f32368a);
                    uriMatcher2.addURI(str, sb2.toString(), 4);
                }
            }
            return true;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("your authority (com.mrsool.stickercontentprovider) for the content provider should start with your package name: ");
        sb3.append(getContext().getPackageName());
        throw new IllegalStateException(sb3.toString());
    }

    @C0195i0
    public AssetFileDescriptor openAssetFile(@C0193h0 Uri uri, @C0193h0 String str) {
        int match = f32385b0.match(uri);
        if (match == 4 || match == 5) {
            return m51823b(uri);
        }
        return null;
    }

    public Cursor query(@C0193h0 Uri uri, @C0195i0 String[] strArr, String str, String[] strArr2, String str2) {
        int match = f32385b0.match(uri);
        if (match == 1) {
            return m51824c(uri);
        }
        if (match == 2) {
            return m51820a(uri);
        }
        if (match == 3) {
            return m51825d(uri);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown URI: ");
        sb.append(uri);
        throw new IllegalArgumentException(sb.toString());
    }

    public int update(@C0193h0 Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Not supported");
    }

    /* renamed from: a */
    public List<StickerPack> mo39576a() {
        if (this.f32394a == null) {
            Context context = getContext();
            context.getClass();
            m51822a(context);
        }
        return this.f32394a;
    }

    /* renamed from: a */
    private Cursor m51820a(@C0193h0 Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        for (StickerPack stickerPack : mo39576a()) {
            if (lastPathSegment.equals(stickerPack.f32406a)) {
                return m51821a(uri, Collections.singletonList(stickerPack));
            }
        }
        return m51821a(uri, new ArrayList());
    }

    @C0193h0
    /* renamed from: a */
    private Cursor m51821a(@C0193h0 Uri uri, @C0193h0 List<StickerPack> list) {
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{f32384b, "sticker_pack_name", f32371O, f32372P, f32373Q, f32374R, f32375S, f32376T, f32377U, f32378V});
        for (StickerPack stickerPack : list) {
            RowBuilder newRow = matrixCursor.newRow();
            newRow.add(stickerPack.f32406a);
            newRow.add(stickerPack.f32407b);
            newRow.add(stickerPack.f32395N);
            newRow.add(stickerPack.f32396O);
            newRow.add(stickerPack.f32404W);
            newRow.add(stickerPack.f32401T);
            newRow.add(stickerPack.f32397P);
            newRow.add(stickerPack.f32398Q);
            newRow.add(stickerPack.f32399R);
            newRow.add(stickerPack.f32400S);
        }
        Context context = getContext();
        context.getClass();
        matrixCursor.setNotificationUri(context.getContentResolver(), uri);
        return matrixCursor;
    }

    /* renamed from: a */
    private AssetFileDescriptor m51819a(@C0193h0 Uri uri, @C0193h0 AssetManager assetManager, @C0193h0 String str, @C0193h0 String str2) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("/");
            sb.append(str);
            return assetManager.openFd(sb.toString());
        } catch (IOException e) {
            StringBuilder sb2 = new StringBuilder();
            Context context = getContext();
            context.getClass();
            sb2.append(context.getPackageName());
            sb2.append("IOException when getting asset file, uri:");
            sb2.append(uri);
            sb2.append(e);
            C5880q.m25751b(sb2.toString());
            return null;
        }
    }
}
