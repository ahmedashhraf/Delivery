package com.instabug.library.annotation.p381d;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import androidx.core.p034l.C0962e0;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.annotation.d.b */
/* compiled from: BitmapUtility */
public class C9760b {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f25898a;

    /* JADX WARNING: type inference failed for: r2v0, types: [boolean[]] */
    /* JADX WARNING: type inference failed for: r21v1 */
    /* JADX WARNING: type inference failed for: r21v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r21v3, types: [boolean] */
    /* JADX WARNING: type inference failed for: r21v4, types: [boolean] */
    /* JADX WARNING: type inference failed for: r21v6 */
    /* JADX WARNING: type inference failed for: r21v9, types: [boolean] */
    /* JADX WARNING: type inference failed for: r21v10 */
    /* JADX WARNING: type inference failed for: r21v11 */
    /* JADX WARNING: type inference failed for: r21v12, types: [boolean] */
    /* JADX WARNING: type inference failed for: r21v13 */
    /* JADX WARNING: type inference failed for: r21v16 */
    /* JADX WARNING: type inference failed for: r21v17 */
    /* JADX WARNING: type inference failed for: r21v18 */
    /* JADX WARNING: type inference failed for: r21v19 */
    /* JADX WARNING: type inference failed for: r21v20 */
    /* JADX WARNING: type inference failed for: r21v21 */
    /* JADX WARNING: type inference failed for: r21v22 */
    /* JADX WARNING: type inference failed for: r21v23 */
    /* JADX WARNING: type inference failed for: r21v24 */
    /* JADX WARNING: type inference failed for: r21v25 */
    /* JADX WARNING: type inference failed for: r21v26 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=boolean[], code=null, for r2v0, types: [boolean[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r21v20
      assigns: []
      uses: [boolean, ?[int, short, byte, char]]
      mth insns count: 404
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 12 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m45512a(android.graphics.Bitmap r39, int r40, android.content.Context r41) {
        /*
            r0 = r39
            r1 = r40
            boolean[] r2 = m45513a()
            android.graphics.Bitmap$Config r3 = r39.getConfig()
            r4 = 1
            android.graphics.Bitmap r3 = r0.copy(r3, r4)
            int r5 = android.os.Build.VERSION.SDK_INT
            r13 = 3
            r14 = 8
            r15 = 16
            r16 = 2
            if (r5 <= r15) goto L_0x005c
            r2[r4] = r4
            android.renderscript.RenderScript r5 = android.renderscript.RenderScript.create(r41)
            android.renderscript.Allocation$MipmapControl r6 = android.renderscript.Allocation.MipmapControl.MIPMAP_NONE
            r2[r16] = r4
            android.renderscript.Allocation r0 = android.renderscript.Allocation.createFromBitmap(r5, r0, r6, r4)
            r2[r13] = r4
            android.renderscript.Type r6 = r0.getType()
            android.renderscript.Allocation r6 = android.renderscript.Allocation.createTyped(r5, r6)
            r7 = 4
            r2[r7] = r4
            android.renderscript.Element r7 = android.renderscript.Element.U8_4(r5)
            android.renderscript.ScriptIntrinsicBlur r5 = android.renderscript.ScriptIntrinsicBlur.create(r5, r7)
            r7 = 5
            r2[r7] = r4
            float r1 = (float) r1
            r5.setRadius(r1)
            r1 = 6
            r2[r1] = r4
            r5.setInput(r0)
            r0 = 7
            r2[r0] = r4
            r5.forEach(r6)
            r2[r14] = r4
            r6.copyTo(r3)
            r0 = 9
            r2[r0] = r4
            return r3
        L_0x005c:
            if (r1 >= r4) goto L_0x0064
            r0 = 0
            r1 = 10
            r2[r1] = r4
            return r0
        L_0x0064:
            int r0 = r3.getWidth()
            r5 = 11
            r2[r5] = r4
            int r12 = r3.getHeight()
            int r11 = r0 * r12
            int[] r10 = new int[r11]
            r5 = 12
            r2[r5] = r4
            r7 = 0
            r9 = 0
            r17 = 0
            r5 = r3
            r6 = r10
            r8 = r0
            r18 = r10
            r10 = r17
            r14 = r11
            r11 = r0
            r39 = r12
            r5.getPixels(r6, r7, r8, r9, r10, r11, r12)
            int r5 = r0 + -1
            int r6 = r12 + -1
            int r7 = r1 + r1
            int r7 = r7 + r4
            int[] r8 = new int[r14]
            int[] r9 = new int[r14]
            int[] r10 = new int[r14]
            r11 = 13
            r2[r11] = r4
            int r11 = java.lang.Math.max(r0, r12)
            int[] r11 = new int[r11]
            int r14 = r7 + 1
            int r14 = r14 >> r4
            int r14 = r14 * r14
            int r15 = r14 * 256
            int[] r13 = new int[r15]
            r21 = 14
            r2[r21] = r4
            r4 = 0
        L_0x00af:
            if (r4 >= r15) goto L_0x00be
            int r22 = r4 / r14
            r13[r4] = r22
            int r4 = r4 + 1
            r22 = 15
            r21 = 1
            r2[r22] = r21
            goto L_0x00af
        L_0x00be:
            r4 = 3
            r21 = 1
            int[] r4 = new int[]{r7, r4}
            java.lang.Class<int> r14 = int.class
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r14, r4)
            int[][] r4 = (int[][]) r4
            int r14 = r1 + 1
            r15 = 16
            r2[r15] = r21
            r15 = 0
            r20 = 0
            r22 = 0
        L_0x00d8:
            if (r15 >= r12) goto L_0x0234
            r23 = r3
            int r3 = -r1
            r24 = 17
            r2[r24] = r21
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
        L_0x00f3:
            r33 = 65280(0xff00, float:9.1477E-41)
            r34 = 16711680(0xff0000, float:2.3418052E-38)
            if (r3 > r1) goto L_0x0173
            r35 = 18
            r2[r35] = r21
            r35 = r6
            r41 = r12
            r12 = 0
            int r6 = java.lang.Math.max(r3, r12)
            int r6 = java.lang.Math.min(r5, r6)
            int r6 = r20 + r6
            r6 = r18[r6]
            int r36 = r3 + r1
            r36 = r4[r36]
            r34 = r6 & r34
            r19 = 16
            int r34 = r34 >> 16
            r36[r12] = r34
            r33 = r6 & r33
            r17 = 8
            int r33 = r33 >> 8
            r21 = 1
            r36[r21] = r33
            r6 = r6 & 255(0xff, float:3.57E-43)
            r36[r16] = r6
            r6 = 19
            r2[r6] = r21
            int r6 = java.lang.Math.abs(r3)
            int r6 = r14 - r6
            r33 = r36[r12]
            int r33 = r33 * r6
            int r24 = r24 + r33
            r33 = r36[r21]
            int r33 = r33 * r6
            int r25 = r25 + r33
            r33 = r36[r16]
            int r33 = r33 * r6
            int r26 = r26 + r33
            if (r3 <= 0) goto L_0x0158
            r6 = r36[r12]
            int r30 = r30 + r6
            r6 = r36[r21]
            int r31 = r31 + r6
            r6 = r36[r16]
            int r32 = r32 + r6
            r6 = 20
            r2[r6] = r21
            goto L_0x0168
        L_0x0158:
            r6 = r36[r12]
            int r27 = r27 + r6
            r6 = r36[r21]
            int r28 = r28 + r6
            r6 = r36[r16]
            int r29 = r29 + r6
            r6 = 21
            r2[r6] = r21
        L_0x0168:
            int r3 = r3 + 1
            r6 = 22
            r2[r6] = r21
            r12 = r41
            r6 = r35
            goto L_0x00f3
        L_0x0173:
            r35 = r6
            r41 = r12
            r3 = 23
            r2[r3] = r21
            r6 = r1
            r3 = 0
        L_0x017d:
            if (r3 >= r0) goto L_0x0220
            r12 = r13[r24]
            r8[r20] = r12
            r12 = r13[r25]
            r9[r20] = r12
            r12 = r13[r26]
            r10[r20] = r12
            int r24 = r24 - r27
            int r25 = r25 - r28
            int r26 = r26 - r29
            int r12 = r6 - r1
            int r12 = r12 + r7
            int r12 = r12 % r7
            r12 = r4[r12]
            r36 = 0
            r37 = r12[r36]
            int r27 = r27 - r37
            r21 = 1
            r36 = r12[r21]
            int r28 = r28 - r36
            r36 = r12[r16]
            int r29 = r29 - r36
            if (r15 == 0) goto L_0x01b0
            r36 = 24
            r2[r36] = r21
            r37 = r13
            goto L_0x01c4
        L_0x01b0:
            r36 = 25
            r2[r36] = r21
            int r36 = r3 + r1
            r37 = r13
            int r13 = r36 + 1
            int r13 = java.lang.Math.min(r13, r5)
            r11[r3] = r13
            r13 = 26
            r2[r13] = r21
        L_0x01c4:
            r13 = r11[r3]
            int r13 = r22 + r13
            r13 = r18[r13]
            r36 = r13 & r34
            r19 = 16
            int r36 = r36 >> 16
            r38 = 0
            r12[r38] = r36
            r36 = r13 & r33
            r17 = 8
            int r36 = r36 >> 8
            r12[r21] = r36
            r13 = r13 & 255(0xff, float:3.57E-43)
            r12[r16] = r13
            r13 = r12[r38]
            int r30 = r30 + r13
            r13 = r12[r21]
            int r31 = r31 + r13
            r12 = r12[r16]
            int r32 = r32 + r12
            int r24 = r24 + r30
            int r25 = r25 + r31
            int r26 = r26 + r32
            int r6 = r6 + 1
            int r6 = r6 % r7
            int r12 = r6 % r7
            r12 = r4[r12]
            r13 = 0
            r36 = r12[r13]
            int r27 = r27 + r36
            r21 = 1
            r36 = r12[r21]
            int r28 = r28 + r36
            r36 = r12[r16]
            int r29 = r29 + r36
            r36 = r12[r13]
            int r30 = r30 - r36
            r13 = r12[r21]
            int r31 = r31 - r13
            r12 = r12[r16]
            int r32 = r32 - r12
            int r20 = r20 + 1
            int r3 = r3 + 1
            r12 = 27
            r2[r12] = r21
            r13 = r37
            goto L_0x017d
        L_0x0220:
            r37 = r13
            r21 = 1
            int r22 = r22 + r0
            int r15 = r15 + 1
            r3 = 28
            r2[r3] = r21
            r12 = r41
            r3 = r23
            r6 = r35
            goto L_0x00d8
        L_0x0234:
            r23 = r3
            r35 = r6
            r41 = r12
            r37 = r13
            r3 = 29
            r2[r3] = r21
            r3 = 0
        L_0x0241:
            if (r3 >= r0) goto L_0x03b3
            int r5 = -r1
            int r6 = r5 * r0
            r12 = 30
            r2[r12] = r21
            r12 = 0
            r13 = 0
            r15 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
        L_0x0259:
            if (r5 > r1) goto L_0x02d6
            r28 = 31
            r2[r28] = r21
            r28 = r11
            r11 = 0
            int r29 = java.lang.Math.max(r11, r6)
            int r29 = r29 + r3
            int r30 = r5 + r1
            r30 = r4[r30]
            r31 = r8[r29]
            r30[r11] = r31
            r11 = r9[r29]
            r30[r21] = r11
            r11 = r10[r29]
            r30[r16] = r11
            r11 = 32
            r2[r11] = r21
            int r11 = java.lang.Math.abs(r5)
            int r11 = r14 - r11
            r31 = r8[r29]
            int r31 = r31 * r11
            int r12 = r12 + r31
            r31 = r9[r29]
            int r31 = r31 * r11
            int r13 = r13 + r31
            r29 = r10[r29]
            int r29 = r29 * r11
            int r15 = r15 + r29
            if (r5 <= 0) goto L_0x02aa
            r11 = 0
            r29 = r30[r11]
            int r25 = r25 + r29
            r21 = 1
            r29 = r30[r21]
            int r26 = r26 + r29
            r29 = r30[r16]
            int r27 = r27 + r29
            r29 = 33
            r2[r29] = r21
            goto L_0x02bd
        L_0x02aa:
            r11 = 0
            r21 = 1
            r29 = r30[r11]
            int r20 = r20 + r29
            r11 = r30[r21]
            int r22 = r22 + r11
            r11 = r30[r16]
            int r24 = r24 + r11
            r11 = 34
            r2[r11] = r21
        L_0x02bd:
            r11 = r35
            if (r5 < r11) goto L_0x02c6
            r29 = 35
            r2[r29] = r21
            goto L_0x02cb
        L_0x02c6:
            int r6 = r6 + r0
            r29 = 36
            r2[r29] = r21
        L_0x02cb:
            int r5 = r5 + 1
            r29 = 37
            r2[r29] = r21
            r35 = r11
            r11 = r28
            goto L_0x0259
        L_0x02d6:
            r28 = r11
            r11 = r35
            r5 = 38
            r2[r5] = r21
            r6 = r3
            r29 = r26
            r30 = r27
            r5 = 0
            r26 = r1
            r27 = r25
            r25 = r24
            r24 = r22
            r22 = r20
            r20 = r15
            r15 = r13
            r13 = r12
            r12 = r41
        L_0x02f4:
            if (r5 >= r12) goto L_0x0399
            r31 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r32 = r18[r6]
            r31 = r32 & r31
            r32 = r37[r13]
            r19 = 16
            int r32 = r32 << 16
            r31 = r31 | r32
            r32 = r37[r15]
            r17 = 8
            int r32 = r32 << 8
            r31 = r31 | r32
            r32 = r37[r20]
            r31 = r31 | r32
            r18[r6] = r31
            int r13 = r13 - r22
            int r15 = r15 - r24
            int r20 = r20 - r25
            int r31 = r26 - r1
            int r31 = r31 + r7
            int r31 = r31 % r7
            r31 = r4[r31]
            r32 = 0
            r33 = r31[r32]
            int r22 = r22 - r33
            r21 = 1
            r32 = r31[r21]
            int r24 = r24 - r32
            r32 = r31[r16]
            int r25 = r25 - r32
            if (r3 == 0) goto L_0x0337
            r32 = 39
            r2[r32] = r21
            goto L_0x0349
        L_0x0337:
            r32 = 40
            r2[r32] = r21
            int r1 = r5 + r14
            int r1 = java.lang.Math.min(r1, r11)
            int r1 = r1 * r0
            r28[r5] = r1
            r1 = 41
            r2[r1] = r21
        L_0x0349:
            r1 = r28[r5]
            int r1 = r1 + r3
            r32 = r8[r1]
            r33 = 0
            r31[r33] = r32
            r32 = r9[r1]
            r31[r21] = r32
            r1 = r10[r1]
            r31[r16] = r1
            r1 = r31[r33]
            int r27 = r27 + r1
            r1 = r31[r21]
            int r29 = r29 + r1
            r1 = r31[r16]
            int r30 = r30 + r1
            int r13 = r13 + r27
            int r15 = r15 + r29
            int r20 = r20 + r30
            int r26 = r26 + 1
            int r26 = r26 % r7
            r1 = r4[r26]
            r31 = 0
            r32 = r1[r31]
            int r22 = r22 + r32
            r21 = 1
            r32 = r1[r21]
            int r24 = r24 + r32
            r32 = r1[r16]
            int r25 = r25 + r32
            r32 = r1[r31]
            int r27 = r27 - r32
            r32 = r1[r21]
            int r29 = r29 - r32
            r1 = r1[r16]
            int r30 = r30 - r1
            int r6 = r6 + r0
            int r5 = r5 + 1
            r1 = 42
            r2[r1] = r21
            r1 = r40
            goto L_0x02f4
        L_0x0399:
            r17 = 8
            r19 = 16
            r21 = 1
            r31 = 0
            int r3 = r3 + 1
            r1 = 43
            r2[r1] = r21
            r1 = r40
            r35 = r11
            r41 = r12
            r11 = r28
            r21 = 1
            goto L_0x0241
        L_0x03b3:
            r12 = r41
            r7 = 0
            r9 = 0
            r10 = 0
            r5 = r23
            r6 = r18
            r8 = r0
            r11 = r0
            r5.setPixels(r6, r7, r8, r9, r10, r11, r12)
            r0 = 44
            r1 = 1
            r2[r0] = r1
            return r23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.annotation.p381d.C9760b.m45512a(android.graphics.Bitmap, int, android.content.Context):android.graphics.Bitmap");
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m45513a() {
        boolean[] zArr = f25898a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-5233635733935384023L, "com/instabug/library/annotation/utility/BitmapUtility", 81);
        f25898a = a;
        return a;
    }

    /* renamed from: a */
    public static Bitmap m45511a(Bitmap bitmap, int i) {
        boolean[] a = m45513a();
        int width = bitmap.getWidth();
        a[45] = true;
        int height = bitmap.getHeight();
        int i2 = (width * i) / 100;
        int i3 = (i * height) / 100;
        a[46] = true;
        int abs = Math.abs(i2 - width) / 2;
        a[47] = true;
        int abs2 = Math.abs(i3 - height) / 2;
        a[48] = true;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, i3, true);
        a[49] = true;
        Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap, abs, abs2, width, height);
        a[50] = true;
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m45510a(Bitmap bitmap) {
        boolean[] a = m45513a();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        a[51] = true;
        rect.inset(-6, -6);
        a[52] = true;
        Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Config.ARGB_8888);
        a[53] = true;
        Canvas canvas = new Canvas(createBitmap);
        a[54] = true;
        Paint paint = new Paint(1);
        a[55] = true;
        canvas.drawARGB(0, 0, 0, 0);
        a[56] = true;
        paint.setColor(-12434878);
        a[57] = true;
        float centerX = (float) rect.centerX();
        a[58] = true;
        float centerY = (float) rect.centerY();
        a[59] = true;
        float min = Math.min(centerX, centerY);
        a[60] = true;
        canvas.drawCircle(centerX, centerY, min, paint);
        a[61] = true;
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        a[62] = true;
        canvas.drawBitmap(bitmap, null, rect, paint);
        a[63] = true;
        Paint paint2 = new Paint(1);
        a[64] = true;
        paint2.setColor(C0962e0.f4343t);
        a[65] = true;
        paint2.setStyle(Style.STROKE);
        a[66] = true;
        paint2.setStrokeWidth(2.0f);
        a[67] = true;
        canvas.drawCircle(centerX, centerY, min - 2.0f, paint2);
        a[68] = true;
        return createBitmap;
    }
}
