package com.mrsool.stickers;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import java.io.IOException;
import java.util.List;

/* renamed from: com.mrsool.stickers.n */
/* compiled from: StickerPackValidator */
public class C11501n {

    /* renamed from: a */
    private static final int f32474a = 100;

    /* renamed from: b */
    private static final int f32475b = 3;

    /* renamed from: c */
    private static final int f32476c = 512;

    /* renamed from: d */
    private static final int f32477d = 512;

    /* renamed from: e */
    private static final int f32478e = 3;

    /* renamed from: f */
    private static final int f32479f = 30;

    /* renamed from: g */
    private static final int f32480g = 128;

    /* renamed from: h */
    private static final long f32481h = 8192;

    /* renamed from: i */
    private static final int f32482i = 50;

    /* renamed from: j */
    private static final int f32483j = 24;

    /* renamed from: k */
    private static final int f32484k = 512;

    /* renamed from: a */
    static void m51891a(@C0193h0 Context context, @C0193h0 StickerPack stickerPack) throws IllegalStateException {
        if (TextUtils.isEmpty(stickerPack.f32406a)) {
            throw new IllegalStateException("sticker pack identifier is empty");
        } else if (stickerPack.f32406a.length() <= 128) {
            m51894a(stickerPack.f32406a);
            if (TextUtils.isEmpty(stickerPack.f32395N)) {
                StringBuilder sb = new StringBuilder();
                sb.append("sticker pack publisher is empty, sticker pack identifier:");
                sb.append(stickerPack.f32406a);
                throw new IllegalStateException(sb.toString());
            } else if (stickerPack.f32395N.length() > 128) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("sticker pack publisher cannot exceed 128 characters, sticker pack identifier:");
                sb2.append(stickerPack.f32406a);
                throw new IllegalStateException(sb2.toString());
            } else if (TextUtils.isEmpty(stickerPack.f32407b)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("sticker pack name is empty, sticker pack identifier:");
                sb3.append(stickerPack.f32406a);
                throw new IllegalStateException(sb3.toString());
            } else if (stickerPack.f32407b.length() > 128) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("sticker pack name cannot exceed 128 characters, sticker pack identifier:");
                sb4.append(stickerPack.f32406a);
                throw new IllegalStateException(sb4.toString());
            } else if (!TextUtils.isEmpty(stickerPack.f32396O)) {
                try {
                    byte[] a = C11500m.m51890a(stickerPack.f32406a, stickerPack.f32396O, context.getContentResolver());
                    if (((long) a.length) <= 409600) {
                        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(a, 0, a.length);
                        String str = ", tray image file: ";
                        if (decodeByteArray.getHeight() <= 512) {
                            if (decodeByteArray.getHeight() >= 24) {
                                if (decodeByteArray.getWidth() > 512 || decodeByteArray.getWidth() < 24) {
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("tray image width should be between 24 and 512 pixels, current tray image width is ");
                                    sb5.append(decodeByteArray.getWidth());
                                    sb5.append(str);
                                    sb5.append(stickerPack.f32396O);
                                    throw new IllegalStateException(sb5.toString());
                                }
                                List<Sticker> b = stickerPack.mo39588b();
                                if (b.size() < 3 || b.size() > 30) {
                                    StringBuilder sb6 = new StringBuilder();
                                    sb6.append("sticker pack sticker count should be between 3 to 30 inclusive, it currently has ");
                                    sb6.append(b.size());
                                    sb6.append(", sticker pack identifier:");
                                    sb6.append(stickerPack.f32406a);
                                    throw new IllegalStateException(sb6.toString());
                                }
                                for (Sticker a2 : b) {
                                    m51892a(context, stickerPack.f32406a, a2);
                                }
                                return;
                            }
                        }
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("tray image height should between 24 and 512 pixels, current tray image height is ");
                        sb7.append(decodeByteArray.getHeight());
                        sb7.append(str);
                        sb7.append(stickerPack.f32396O);
                        throw new IllegalStateException(sb7.toString());
                    }
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("tray image should be less than 50 KB, tray image file: ");
                    sb8.append(stickerPack.f32396O);
                    throw new IllegalStateException(sb8.toString());
                } catch (IOException e) {
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append("Cannot open tray image, ");
                    sb9.append(stickerPack.f32396O);
                    throw new IllegalStateException(sb9.toString(), e);
                }
            } else {
                StringBuilder sb10 = new StringBuilder();
                sb10.append("sticker pack tray id is empty, sticker pack identifier:");
                sb10.append(stickerPack.f32406a);
                throw new IllegalStateException(sb10.toString());
            }
        } else {
            throw new IllegalStateException("sticker pack identifier cannot exceed 128 characters");
        }
    }

    /* renamed from: a */
    private static void m51892a(@C0193h0 Context context, @C0193h0 String str, @C0193h0 Sticker sticker) throws IllegalStateException {
        if (sticker.f32369b.size() > 3) {
            StringBuilder sb = new StringBuilder();
            sb.append("emoji count exceed limit, sticker pack identifier:");
            sb.append(str);
            sb.append(", filename:");
            sb.append(sticker.f32368a);
            throw new IllegalStateException(sb.toString());
        } else if (!TextUtils.isEmpty(sticker.f32368a)) {
            m51893a(context, str, sticker.f32368a);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("no file path for sticker, sticker pack identifier:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: a */
    private static void m51893a(@C0193h0 Context context, @C0193h0 String str, @C0193h0 String str2) throws IllegalStateException {
        String str3 = ", filename:";
        try {
            if (((long) C11500m.m51890a(str, str2, context.getContentResolver()).length) > 819200) {
                StringBuilder sb = new StringBuilder();
                sb.append("sticker should be less than 100KB, sticker pack identifier:");
                sb.append(str);
                sb.append(str3);
                sb.append(str2);
                throw new IllegalStateException(sb.toString());
            }
        } catch (IOException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("cannot open sticker file: sticker pack identifier:");
            sb2.append(str);
            sb2.append(str3);
            sb2.append(str2);
            throw new IllegalStateException(sb2.toString(), e);
        }
    }

    /* renamed from: a */
    private static void m51894a(@C0193h0 String str) {
        if (!str.matches("[\\w-.,'\\s]+")) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" contains invalid characters, allowed characters are a to z, A to Z, _ , ' - . and space character");
            throw new IllegalStateException(sb.toString());
        } else if (str.contains("..")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" cannot contain ..");
            throw new IllegalStateException(sb2.toString());
        }
    }
}
