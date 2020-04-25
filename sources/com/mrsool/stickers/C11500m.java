package com.mrsool.stickers;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import androidx.annotation.C0193h0;
import com.mrsool.C10830i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.mrsool.stickers.m */
/* compiled from: StickerPackLoader */
public class C11500m {
    @C0193h0
    /* renamed from: a */
    public static ArrayList<StickerPack> m51886a(Context context) throws IllegalStateException {
        Cursor query = context.getContentResolver().query(StickerContentProvider.f32383a0, null, null, null, null);
        if (query != null) {
            HashSet hashSet = new HashSet();
            ArrayList<StickerPack> a = m51887a(query);
            Iterator it = a.iterator();
            while (it.hasNext()) {
                StickerPack stickerPack = (StickerPack) it.next();
                if (!hashSet.contains(stickerPack.f32406a)) {
                    hashSet.add(stickerPack.f32406a);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("sticker pack identifiers should be unique, there are more than one pack with identifier:");
                    sb.append(stickerPack.f32406a);
                    throw new IllegalStateException(sb.toString());
                }
            }
            if (!a.isEmpty()) {
                Iterator it2 = a.iterator();
                while (it2.hasNext()) {
                    StickerPack stickerPack2 = (StickerPack) it2.next();
                    stickerPack2.mo39585a(m51888a(context, stickerPack2));
                    C11501n.m51891a(context, stickerPack2);
                }
                return a;
            }
            throw new IllegalStateException("There should be at least one sticker pack in the app");
        }
        throw new IllegalStateException("could not fetch from content provider, com.mrsool.stickercontentprovider");
    }

    @C0193h0
    /* renamed from: a */
    private static List<Sticker> m51888a(Context context, StickerPack stickerPack) {
        String str = ", sticker: ";
        List<Sticker> a = m51889a(stickerPack.f32406a, context.getContentResolver());
        for (Sticker sticker : a) {
            try {
                byte[] a2 = m51890a(stickerPack.f32406a, sticker.f32368a, context.getContentResolver());
                if (a2.length > 0) {
                    sticker.mo39571c((long) a2.length);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Asset file is empty, pack: ");
                    sb.append(stickerPack.f32407b);
                    sb.append(str);
                    sb.append(sticker.f32368a);
                    throw new IllegalStateException(sb.toString());
                }
            } catch (IOException | IllegalArgumentException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Asset file doesn't exist. pack: ");
                sb2.append(stickerPack.f32407b);
                sb2.append(str);
                sb2.append(sticker.f32368a);
                throw new IllegalStateException(sb2.toString(), e);
            }
        }
        return a;
    }

    @C0193h0
    /* renamed from: a */
    private static ArrayList<StickerPack> m51887a(Cursor cursor) {
        ArrayList<StickerPack> arrayList = new ArrayList<>();
        cursor.moveToFirst();
        do {
            String string = cursor.getString(cursor.getColumnIndexOrThrow(StickerContentProvider.f32384b));
            String string2 = cursor.getString(cursor.getColumnIndexOrThrow("sticker_pack_name"));
            String string3 = cursor.getString(cursor.getColumnIndexOrThrow(StickerContentProvider.f32371O));
            String string4 = cursor.getString(cursor.getColumnIndexOrThrow(StickerContentProvider.f32372P));
            String string5 = cursor.getString(cursor.getColumnIndexOrThrow(StickerContentProvider.f32373Q));
            String string6 = cursor.getString(cursor.getColumnIndexOrThrow(StickerContentProvider.f32374R));
            StickerPack stickerPack = new StickerPack(string, string2, string3, string4, cursor.getString(cursor.getColumnIndexOrThrow(StickerContentProvider.f32375S)), cursor.getString(cursor.getColumnIndexOrThrow(StickerContentProvider.f32376T)), cursor.getString(cursor.getColumnIndexOrThrow(StickerContentProvider.f32377U)), cursor.getString(cursor.getColumnIndexOrThrow(StickerContentProvider.f32378V)));
            stickerPack.mo39584a(string5);
            stickerPack.mo39590c(string6);
            arrayList.add(stickerPack);
        } while (cursor.moveToNext());
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0053  */
    @androidx.annotation.C0193h0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.mrsool.stickers.Sticker> m51889a(java.lang.String r7, android.content.ContentResolver r8) {
        /*
            android.net.Uri r1 = m51884a(r7)
            r7 = 2
            java.lang.String[] r2 = new java.lang.String[r7]
            java.lang.String r7 = "sticker_file_name"
            r0 = 0
            r2[r0] = r7
            java.lang.String r6 = "sticker_emoji"
            r0 = 1
            r2[r0] = r6
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r8
            android.database.Cursor r8 = r0.query(r1, r2, r3, r4, r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r8 == 0) goto L_0x0051
            int r1 = r8.getCount()
            if (r1 <= 0) goto L_0x0051
            r8.moveToFirst()
        L_0x0029:
            int r1 = r8.getColumnIndexOrThrow(r7)
            java.lang.String r1 = r8.getString(r1)
            int r2 = r8.getColumnIndexOrThrow(r6)
            java.lang.String r2 = r8.getString(r2)
            com.mrsool.stickers.Sticker r3 = new com.mrsool.stickers.Sticker
            java.lang.String r4 = ","
            java.lang.String[] r2 = r2.split(r4)
            java.util.List r2 = java.util.Arrays.asList(r2)
            r3.<init>(r1, r2)
            r0.add(r3)
            boolean r1 = r8.moveToNext()
            if (r1 != 0) goto L_0x0029
        L_0x0051:
            if (r8 == 0) goto L_0x0056
            r8.close()
        L_0x0056:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrsool.stickers.C11500m.m51889a(java.lang.String, android.content.ContentResolver):java.util.List");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:22|23|24|25|26) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        throw r4;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0053 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m51890a(@androidx.annotation.C0193h0 java.lang.String r4, @androidx.annotation.C0193h0 java.lang.String r5, android.content.ContentResolver r6) throws java.io.IOException {
        /*
            android.net.Uri r0 = m51885a(r4, r5)
            java.io.InputStream r6 = r6.openInputStream(r0)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0054 }
            r0.<init>()     // Catch:{ all -> 0x0054 }
            if (r6 == 0) goto L_0x002f
            r4 = 16384(0x4000, float:2.2959E-41)
            byte[] r4 = new byte[r4]     // Catch:{ all -> 0x002d }
        L_0x0013:
            int r5 = r4.length     // Catch:{ all -> 0x002d }
            r1 = 0
            int r5 = r6.read(r4, r1, r5)     // Catch:{ all -> 0x002d }
            r2 = -1
            if (r5 == r2) goto L_0x0020
            r0.write(r4, r1, r5)     // Catch:{ all -> 0x002d }
            goto L_0x0013
        L_0x0020:
            byte[] r4 = r0.toByteArray()     // Catch:{ all -> 0x002d }
            r0.close()     // Catch:{ all -> 0x0054 }
            if (r6 == 0) goto L_0x002c
            r6.close()
        L_0x002c:
            return r4
        L_0x002d:
            r4 = move-exception
            goto L_0x004e
        L_0x002f:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x002d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x002d }
            r2.<init>()     // Catch:{ all -> 0x002d }
            java.lang.String r3 = "cannot read sticker asset:"
            r2.append(r3)     // Catch:{ all -> 0x002d }
            r2.append(r4)     // Catch:{ all -> 0x002d }
            java.lang.String r4 = "/"
            r2.append(r4)     // Catch:{ all -> 0x002d }
            r2.append(r5)     // Catch:{ all -> 0x002d }
            java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x002d }
            r1.<init>(r4)     // Catch:{ all -> 0x002d }
            throw r1     // Catch:{ all -> 0x002d }
        L_0x004e:
            throw r4     // Catch:{ all -> 0x004f }
        L_0x004f:
            r4 = move-exception
            r0.close()     // Catch:{ all -> 0x0053 }
        L_0x0053:
            throw r4     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r4 = move-exception
            if (r6 == 0) goto L_0x005c
            r6.close()     // Catch:{ all -> 0x005c }
        L_0x005c:
            goto L_0x005e
        L_0x005d:
            throw r4
        L_0x005e:
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrsool.stickers.C11500m.m51890a(java.lang.String, java.lang.String, android.content.ContentResolver):byte[]");
    }

    /* renamed from: a */
    private static Uri m51884a(String str) {
        return new Builder().scheme("content").authority(C10830i.f29740h).appendPath("stickers").appendPath(str).build();
    }

    /* renamed from: a */
    public static Uri m51885a(String str, String str2) {
        return new Builder().scheme("content").authority(C10830i.f29740h).appendPath("stickers_asset").appendPath(str).appendPath(str2).build();
    }
}
