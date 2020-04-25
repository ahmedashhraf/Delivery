package com.theartofdev.edmodo.cropper;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.provider.MediaStore.Images.Media;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0213q;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import com.theartofdev.edmodo.cropper.CropImageView.C12061b;
import com.theartofdev.edmodo.cropper.CropImageView.C12062c;
import com.theartofdev.edmodo.cropper.CropImageView.C12063d;
import com.theartofdev.edmodo.cropper.CropImageView.C12069j;
import com.theartofdev.edmodo.cropper.CropImageView.C12070k;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14030b;

public final class CropImage {

    /* renamed from: a */
    public static final String f34767a = "CROP_IMAGE_EXTRA_SOURCE";

    /* renamed from: b */
    public static final String f34768b = "CROP_IMAGE_EXTRA_OPTIONS";

    /* renamed from: c */
    public static final String f34769c = "CROP_IMAGE_EXTRA_BUNDLE";

    /* renamed from: d */
    public static final String f34770d = "CROP_IMAGE_EXTRA_RESULT";

    /* renamed from: e */
    public static final int f34771e = 200;

    /* renamed from: f */
    public static final int f34772f = 201;

    /* renamed from: g */
    public static final int f34773g = 2011;

    /* renamed from: h */
    public static final int f34774h = 203;

    /* renamed from: i */
    public static final int f34775i = 204;

    public static final class ActivityResult extends C12061b implements Parcelable {
        public static final Creator<ActivityResult> CREATOR = new C12056a();

        /* renamed from: com.theartofdev.edmodo.cropper.CropImage$ActivityResult$a */
        static class C12056a implements Creator<ActivityResult> {
            C12056a() {
            }

            public ActivityResult createFromParcel(Parcel parcel) {
                return new ActivityResult(parcel);
            }

            public ActivityResult[] newArray(int i) {
                return new ActivityResult[i];
            }
        }

        public ActivityResult(Uri uri, Uri uri2, Exception exc, float[] fArr, Rect rect, int i, Rect rect2, int i2) {
            super(null, uri, null, uri2, exc, fArr, rect, rect2, i, i2);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(mo41366k(), i);
            parcel.writeParcelable(mo41369n(), i);
            parcel.writeSerializable(mo41364i());
            parcel.writeFloatArray(mo41362b());
            parcel.writeParcelable(mo41363c(), i);
            parcel.writeParcelable(mo41370o(), i);
            parcel.writeInt(mo41367l());
            parcel.writeInt(mo41368m());
        }

        protected ActivityResult(Parcel parcel) {
            super(null, (Uri) parcel.readParcelable(Uri.class.getClassLoader()), null, (Uri) parcel.readParcelable(Uri.class.getClassLoader()), (Exception) parcel.readSerializable(), parcel.createFloatArray(), (Rect) parcel.readParcelable(Rect.class.getClassLoader()), (Rect) parcel.readParcelable(Rect.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImage$b */
    public static final class C12058b {
        @C0195i0

        /* renamed from: a */
        private final Uri f34776a;

        /* renamed from: b */
        private final CropImageOptions f34777b;

        /* renamed from: a */
        public Intent mo41225a(@C0193h0 Context context) {
            return mo41226a(context, CropImageActivity.class);
        }

        /* renamed from: b */
        public C12058b mo41245b(float f) {
            this.f34777b.f34805c0 = f;
            return this;
        }

        /* renamed from: c */
        public C12058b mo41250c(float f) {
            this.f34777b.f34804b0 = f;
            return this;
        }

        /* renamed from: d */
        public C12058b mo41257d(boolean z) {
            this.f34777b.f34793S = z;
            return this;
        }

        /* renamed from: e */
        public C12058b mo41261e(boolean z) {
            this.f34777b.f34797W = z;
            return this;
        }

        /* renamed from: f */
        public C12058b mo41262f(float f) {
            this.f34777b.f34796V = f;
            return this;
        }

        /* renamed from: g */
        public C12058b mo41265g(float f) {
            this.f34777b.f34803b = f;
            return this;
        }

        /* renamed from: h */
        public C12058b mo41268h(float f) {
            this.f34777b.f34788N = f;
            return this;
        }

        /* renamed from: i */
        public C12058b mo41271i(int i) {
            this.f34777b.f34821s0 = i;
            return this;
        }

        /* renamed from: j */
        public C12058b mo41274j(boolean z) {
            this.f34777b.f34791Q = z;
            return this;
        }

        private C12058b(@C0195i0 Uri uri) {
            this.f34776a = uri;
            this.f34777b = new CropImageOptions();
        }

        /* renamed from: a */
        public Intent mo41226a(@C0193h0 Context context, @C0195i0 Class<?> cls) {
            this.f34777b.mo41285a();
            Intent intent = new Intent();
            intent.setClass(context, cls);
            Bundle bundle = new Bundle();
            bundle.putParcelable(CropImage.f34767a, this.f34776a);
            bundle.putParcelable(CropImage.f34768b, this.f34777b);
            intent.putExtra(CropImage.f34769c, bundle);
            return intent;
        }

        /* renamed from: b */
        public C12058b mo41246b(int i) {
            this.f34777b.f34810h0 = i;
            return this;
        }

        /* renamed from: c */
        public C12058b mo41251c(int i) {
            this.f34777b.f34807e0 = i;
            return this;
        }

        /* renamed from: d */
        public C12058b mo41254d(float f) {
            this.f34777b.f34800Z = f;
            return this;
        }

        /* renamed from: e */
        public C12058b mo41258e(float f) {
            this.f34777b.f34808f0 = f;
            return this;
        }

        /* renamed from: f */
        public C12058b mo41263f(int i) {
            this.f34777b.f34809g0 = i;
            return this;
        }

        /* renamed from: g */
        public C12058b mo41266g(int i) {
            this.f34777b.f34827y0 = (i + 360) % 360;
            return this;
        }

        /* renamed from: h */
        public C12058b mo41270h(boolean z) {
            this.f34777b.f34794T = z;
            return this;
        }

        /* renamed from: i */
        public C12058b mo41272i(boolean z) {
            this.f34777b.f34825w0 = z;
            return this;
        }

        /* renamed from: j */
        public C12058b mo41273j(int i) {
            this.f34777b.f34783C0 = (i + 360) % 360;
            return this;
        }

        /* renamed from: b */
        public C12058b mo41247b(int i, int i2) {
            CropImageOptions cropImageOptions = this.f34777b;
            cropImageOptions.f34815m0 = i;
            cropImageOptions.f34816n0 = i2;
            return this;
        }

        /* renamed from: c */
        public C12058b mo41252c(int i, int i2) {
            CropImageOptions cropImageOptions = this.f34777b;
            cropImageOptions.f34813k0 = i;
            cropImageOptions.f34814l0 = i2;
            return this;
        }

        /* renamed from: d */
        public C12058b mo41255d(int i) {
            this.f34777b.f34802a0 = i;
            return this;
        }

        /* renamed from: e */
        public C12058b mo41260e(int i, int i2) {
            return mo41230a(i, i2, C12069j.RESIZE_INSIDE);
        }

        /* renamed from: f */
        public C12058b mo41264f(boolean z) {
            this.f34777b.f34784D0 = z;
            return this;
        }

        /* renamed from: g */
        public C12058b mo41267g(boolean z) {
            this.f34777b.f34785E0 = z;
            return this;
        }

        /* renamed from: h */
        public C12058b mo41269h(int i) {
            this.f34777b.f34795U = i;
            return this;
        }

        /* renamed from: d */
        public C12058b mo41256d(int i, int i2) {
            CropImageOptions cropImageOptions = this.f34777b;
            cropImageOptions.f34811i0 = i;
            cropImageOptions.f34812j0 = i2;
            return this;
        }

        /* renamed from: e */
        public C12058b mo41259e(@C0213q int i) {
            this.f34777b.f34787G0 = i;
            return this;
        }

        /* renamed from: b */
        public C12058b mo41249b(boolean z) {
            this.f34777b.f34781A0 = z;
            return this;
        }

        /* renamed from: c */
        public C12058b mo41253c(boolean z) {
            this.f34777b.f34828z0 = z;
            return this;
        }

        /* renamed from: b */
        public C12058b mo41248b(CharSequence charSequence) {
            this.f34777b.f34786F0 = charSequence;
            return this;
        }

        /* renamed from: a */
        public void mo41239a(@C0193h0 Activity activity) {
            this.f34777b.mo41285a();
            activity.startActivityForResult(mo41225a((Context) activity), 203);
        }

        /* renamed from: a */
        public void mo41240a(@C0193h0 Activity activity, @C0195i0 Class<?> cls) {
            this.f34777b.mo41285a();
            activity.startActivityForResult(mo41226a((Context) activity, cls), 203);
        }

        /* renamed from: a */
        public void mo41243a(@C0193h0 Context context, @C0193h0 Fragment fragment) {
            fragment.startActivityForResult(mo41225a(context), 203);
        }

        @RequiresApi(api = 11)
        /* renamed from: a */
        public void mo41241a(@C0193h0 Context context, @C0193h0 android.app.Fragment fragment) {
            fragment.startActivityForResult(mo41225a(context), 203);
        }

        /* renamed from: a */
        public void mo41244a(@C0193h0 Context context, @C0193h0 Fragment fragment, @C0195i0 Class<?> cls) {
            fragment.startActivityForResult(mo41226a(context, cls), 203);
        }

        @RequiresApi(api = 11)
        /* renamed from: a */
        public void mo41242a(@C0193h0 Context context, @C0193h0 android.app.Fragment fragment, @C0195i0 Class<?> cls) {
            fragment.startActivityForResult(mo41226a(context, cls), 203);
        }

        /* renamed from: a */
        public C12058b mo41234a(@C0193h0 C12062c cVar) {
            this.f34777b.f34801a = cVar;
            return this;
        }

        /* renamed from: a */
        public C12058b mo41235a(@C0193h0 C12063d dVar) {
            this.f34777b.f34789O = dVar;
            return this;
        }

        /* renamed from: a */
        public C12058b mo41236a(@C0193h0 C12070k kVar) {
            this.f34777b.f34790P = kVar;
            return this;
        }

        /* renamed from: a */
        public C12058b mo41229a(int i, int i2) {
            CropImageOptions cropImageOptions = this.f34777b;
            cropImageOptions.f34798X = i;
            cropImageOptions.f34799Y = i2;
            cropImageOptions.f34797W = true;
            return this;
        }

        /* renamed from: a */
        public C12058b mo41227a(float f) {
            this.f34777b.f34806d0 = f;
            return this;
        }

        /* renamed from: a */
        public C12058b mo41237a(CharSequence charSequence) {
            this.f34777b.f34817o0 = charSequence;
            return this;
        }

        /* renamed from: a */
        public C12058b mo41228a(int i) {
            this.f34777b.f34818p0 = i;
            return this;
        }

        /* renamed from: a */
        public C12058b mo41233a(Uri uri) {
            this.f34777b.f34819q0 = uri;
            return this;
        }

        /* renamed from: a */
        public C12058b mo41231a(CompressFormat compressFormat) {
            this.f34777b.f34820r0 = compressFormat;
            return this;
        }

        /* renamed from: a */
        public C12058b mo41230a(int i, int i2, C12069j jVar) {
            CropImageOptions cropImageOptions = this.f34777b;
            cropImageOptions.f34822t0 = i;
            cropImageOptions.f34823u0 = i2;
            cropImageOptions.f34824v0 = jVar;
            return this;
        }

        /* renamed from: a */
        public C12058b mo41232a(Rect rect) {
            this.f34777b.f34826x0 = rect;
            return this;
        }

        /* renamed from: a */
        public C12058b mo41238a(boolean z) {
            this.f34777b.f34782B0 = z;
            return this;
        }
    }

    private CropImage() {
    }

    /* renamed from: a */
    public static Bitmap m54433a(@C0193h0 Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawOval(new RectF(0.0f, 0.0f, (float) width, (float) height), paint);
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        bitmap.recycle();
        return createBitmap;
    }

    /* renamed from: b */
    public static Intent m54444b(@C0193h0 Context context) {
        return m54432a(context, context.getString(C12074R.string.pick_image_intent_chooser_title), false, true);
    }

    /* renamed from: c */
    public static boolean m54446c(@C0193h0 Context context) {
        if (VERSION.SDK_INT >= 23) {
            String str = "android.permission.CAMERA";
            if (m54443a(context, str) && context.checkSelfPermission(str) != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m54445b(@C0193h0 Context context, @C0193h0 Uri uri) {
        return VERSION.SDK_INT >= 23 && context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0 && m54447c(context, uri);
    }

    /* renamed from: c */
    public static boolean m54447c(@C0193h0 Context context, @C0193h0 Uri uri) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                openInputStream.close();
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: a */
    public static void m54441a(@C0193h0 Activity activity) {
        activity.startActivityForResult(m54444b(activity), 200);
    }

    /* renamed from: a */
    public static void m54442a(@C0193h0 Context context, @C0193h0 Fragment fragment) {
        fragment.startActivityForResult(m54444b(context), 200);
    }

    /* renamed from: a */
    public static Intent m54432a(@C0193h0 Context context, CharSequence charSequence, boolean z, boolean z2) {
        Intent intent;
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        if (!m54446c(context) && z2) {
            arrayList.addAll(m54439a(context, packageManager));
        }
        List a = m54440a(packageManager, "android.intent.action.GET_CONTENT", z);
        if (a.size() == 0) {
            a = m54440a(packageManager, "android.intent.action.PICK", z);
        }
        arrayList.addAll(a);
        if (arrayList.isEmpty()) {
            intent = new Intent();
        } else {
            intent = (Intent) arrayList.get(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
        }
        Intent createChooser = Intent.createChooser(intent, charSequence);
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
        return createChooser;
    }

    /* renamed from: a */
    public static Intent m54431a(@C0193h0 Context context, Uri uri) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (uri == null) {
            uri = m54434a(context);
        }
        intent.putExtra(C14030b.f41237l, uri);
        return intent;
    }

    /* renamed from: a */
    public static List<Intent> m54439a(@C0193h0 Context context, @C0193h0 PackageManager packageManager) {
        ArrayList arrayList = new ArrayList();
        Uri a = m54434a(context);
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 0)) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (a != null) {
                intent2.putExtra(C14030b.f41237l, a);
            }
            arrayList.add(intent2);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<Intent> m54440a(@C0193h0 PackageManager packageManager, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        Intent intent = str == "android.intent.action.GET_CONTENT" ? new Intent(str) : new Intent(str, Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/*");
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 0)) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            arrayList.add(intent2);
        }
        if (!z) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Intent intent3 = (Intent) it.next();
                if (intent3.getComponent().getClassName().equals("com.android.documentsui.DocumentsActivity")) {
                    arrayList.remove(intent3);
                    break;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m54443a(@C0193h0 Context context, @C0193h0 String str) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null && strArr.length > 0) {
                for (String equalsIgnoreCase : strArr) {
                    if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                        return true;
                    }
                }
            }
        } catch (NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: a */
    public static Uri m54434a(@C0193h0 Context context) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir != null) {
            return Uri.fromFile(new File(externalCacheDir.getPath(), "pickImageResult.jpeg"));
        }
        return null;
    }

    /* renamed from: a */
    public static Uri m54435a(@C0193h0 Context context, @C0195i0 Intent intent) {
        boolean z = true;
        if (!(intent == null || intent.getData() == null)) {
            String action = intent.getAction();
            if (action == null || !action.equals("android.media.action.IMAGE_CAPTURE")) {
                z = false;
            }
        }
        return (z || intent.getData() == null) ? m54434a(context) : intent.getData();
    }

    /* renamed from: a */
    public static C12058b m54437a() {
        return new C12058b(null);
    }

    /* renamed from: a */
    public static C12058b m54438a(@C0195i0 Uri uri) {
        return new C12058b(uri);
    }

    /* renamed from: a */
    public static ActivityResult m54436a(@C0195i0 Intent intent) {
        if (intent != null) {
            return (ActivityResult) intent.getParcelableExtra(f34770d);
        }
        return null;
    }
}
