package com.mrsool.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Matrix;
import android.media.ExifInterface;
import com.instabug.library.p397ui.custom.MaterialMenuDrawable;
import com.mrsool.C10232R;
import com.mrsool.utils.C11664r.C11667c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import p053b.p063d.p064b.C2108a;

/* renamed from: com.mrsool.utils.g */
/* compiled from: CameraPicRotateTask */
public class C11642g extends C11664r {

    /* renamed from: i */
    private String f33040i;

    public C11642g(Context context, C11667c cVar, String str, boolean z) {
        super(context, context.getString(C10232R.string.lbl_camera_process), context.getString(C10232R.string.lbl_processing_your_photo), cVar, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Boolean doInBackground(String... strArr) {
        Bitmap a = C11641f.m52485a(this.f33040i, (int) MaterialMenuDrawable.DEFAULT_TRANSFORM_DURATION);
        try {
            int attributeInt = new ExifInterface(this.f33040i).getAttributeInt(C2108a.f8392y, 1);
            StringBuilder sb = new StringBuilder();
            sb.append("orientation ");
            sb.append(attributeInt);
            C5880q.m25753d(sb.toString());
            Matrix matrix = new Matrix();
            if (attributeInt == 3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("orientation ORIENTATION_ROTATE_180 ");
                sb2.append(attributeInt);
                C5880q.m25753d(sb2.toString());
                matrix.postRotate(180.0f);
                a = Bitmap.createBitmap(a, 0, 0, a.getWidth(), a.getHeight(), matrix, true);
            } else {
                String str = "orientation ORIENTATION_ROTATE_90 ";
                if (attributeInt == 6) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(attributeInt);
                    C5880q.m25753d(sb3.toString());
                    matrix.postRotate(90.0f);
                    a = Bitmap.createBitmap(a, 0, 0, a.getWidth(), a.getHeight(), matrix, true);
                } else if (attributeInt == 8) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append(attributeInt);
                    C5880q.m25753d(sb4.toString());
                    matrix.postRotate(270.0f);
                    a = Bitmap.createBitmap(a, 0, 0, a.getWidth(), a.getHeight(), matrix, true);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mo39989a(a);
            return Boolean.valueOf(true);
        } catch (IOException e2) {
            e2.printStackTrace();
            return Boolean.valueOf(false);
        }
    }

    /* renamed from: b */
    public String mo39991b() {
        return this.f33040i;
    }

    /* renamed from: a */
    public String mo39989a(Bitmap bitmap) throws IOException {
        File file = new File(this.f33040i);
        if (!file.exists()) {
            file.createNewFile();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("File Path ");
        sb.append(file.getAbsolutePath());
        C5880q.m25750a(sb.toString());
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(CompressFormat.JPEG, 100, fileOutputStream);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        fileOutputStream.close();
        return file.getAbsolutePath();
    }

    /* renamed from: a */
    public void mo39990a(String str) {
        this.f33040i = str;
    }
}
