package com.mrsool.stickers;

import android.text.TextUtils;
import android.util.JsonReader;
import androidx.annotation.C0193h0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p212io.fabric.sdk.android.p493p.p498e.C14330v;

/* renamed from: com.mrsool.stickers.j */
/* compiled from: ContentFileParser */
class C11496j {

    /* renamed from: a */
    private static final int f32464a = 2;

    C11496j() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r2 = move-exception;
     */
    @androidx.annotation.C0193h0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.List<com.mrsool.stickers.StickerPack> m51871a(@androidx.annotation.C0193h0 java.io.InputStream r2) throws java.io.IOException, java.lang.IllegalStateException {
        /*
            android.util.JsonReader r0 = new android.util.JsonReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r2)
            r0.<init>(r1)
            java.util.List r2 = m51872b(r0)     // Catch:{ all -> 0x0012 }
            r0.close()
            return r2
        L_0x0012:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0014 }
        L_0x0014:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x0018 }
        L_0x0018:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrsool.stickers.C11496j.m51871a(java.io.InputStream):java.util.List");
    }

    @C0193h0
    /* renamed from: b */
    private static List<StickerPack> m51872b(@C0193h0 JsonReader jsonReader) throws IOException, IllegalStateException {
        ArrayList<StickerPack> arrayList = new ArrayList<>();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (StickerContentProvider.f32373Q.equals(nextName)) {
                str = jsonReader.nextString();
            } else if ("ios_app_store_link".equals(nextName)) {
                str2 = jsonReader.nextString();
            } else if ("sticker_packs".equals(nextName)) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(m51870a(jsonReader));
                }
                jsonReader.endArray();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("unknown field in json: ");
                sb.append(nextName);
                throw new IllegalStateException(sb.toString());
            }
        }
        jsonReader.endObject();
        if (arrayList.size() != 0) {
            for (StickerPack stickerPack : arrayList) {
                stickerPack.mo39584a(str);
                stickerPack.mo39590c(str2);
            }
            return arrayList;
        }
        throw new IllegalStateException("sticker pack list cannot be empty");
    }

    @C0193h0
    /* renamed from: c */
    private static List<Sticker> m51873c(@C0193h0 JsonReader jsonReader) throws IOException, IllegalStateException {
        jsonReader.beginArray();
        ArrayList arrayList = new ArrayList();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            String str = null;
            ArrayList arrayList2 = new ArrayList(2);
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("image_file".equals(nextName)) {
                    str = jsonReader.nextString();
                } else if ("emojis".equals(nextName)) {
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList2.add(jsonReader.nextString());
                    }
                    jsonReader.endArray();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unknown field in json: ");
                    sb.append(nextName);
                    throw new IllegalStateException(sb.toString());
                }
            }
            jsonReader.endObject();
            if (TextUtils.isEmpty(str)) {
                throw new IllegalStateException("sticker image_file cannot be empty");
            } else if (!str.endsWith(".webp")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("image file for stickers should be webp files, image file is: ");
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            } else if (str.contains("..") || str.contains("/")) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("the file name should not contain .. or / to prevent directory traversal, image file is:");
                sb3.append(str);
                throw new IllegalStateException(sb3.toString());
            } else {
                arrayList.add(new Sticker(str, arrayList2));
            }
        }
        jsonReader.endArray();
        return arrayList;
    }

    @C0193h0
    /* renamed from: a */
    private static StickerPack m51870a(@C0193h0 JsonReader jsonReader) throws IOException, IllegalStateException {
        jsonReader.beginObject();
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1618432855:
                    if (nextName.equals(C14330v.f42305U)) {
                        c = 0;
                        break;
                    }
                    break;
                case -692149211:
                    if (nextName.equals("privacy_policy_website")) {
                        c = 6;
                        break;
                    }
                    break;
                case -5607704:
                    if (nextName.equals("license_agreement_website")) {
                        c = 7;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 1;
                        break;
                    }
                    break;
                case 335244632:
                    if (nextName.equals("publisher_website")) {
                        c = 5;
                        break;
                    }
                    break;
                case 967150217:
                    if (nextName.equals("tray_image_file")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1414128537:
                    if (nextName.equals("publisher_email")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1447404028:
                    if (nextName.equals("publisher")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1531715286:
                    if (nextName.equals("stickers")) {
                        c = 8;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    str2 = jsonReader.nextString();
                    break;
                case 2:
                    str3 = jsonReader.nextString();
                    break;
                case 3:
                    str4 = jsonReader.nextString();
                    break;
                case 4:
                    str5 = jsonReader.nextString();
                    break;
                case 5:
                    str6 = jsonReader.nextString();
                    break;
                case 6:
                    str7 = jsonReader.nextString();
                    break;
                case 7:
                    str8 = jsonReader.nextString();
                    break;
                case 8:
                    list = m51873c(jsonReader);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalStateException("identifier cannot be empty");
        } else if (TextUtils.isEmpty(str2)) {
            throw new IllegalStateException("name cannot be empty");
        } else if (TextUtils.isEmpty(str3)) {
            throw new IllegalStateException("publisher cannot be empty");
        } else if (TextUtils.isEmpty(str4)) {
            throw new IllegalStateException("tray_image_file cannot be empty");
        } else if (list == null || list.size() == 0) {
            throw new IllegalStateException("sticker list is empty");
        } else if (str.contains("..") || str.contains("/")) {
            throw new IllegalStateException("identifier should not contain .. or / to prevent directory traversal");
        } else {
            jsonReader.endObject();
            StickerPack stickerPack = new StickerPack(str, str2, str3, str4, str5, str6, str7, str8);
            stickerPack.mo39585a(list);
            return stickerPack;
        }
    }
}
