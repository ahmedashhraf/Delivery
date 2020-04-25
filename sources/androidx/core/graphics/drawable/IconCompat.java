package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0213q;
import androidx.annotation.C0224v0;
import androidx.annotation.C0225w;
import androidx.annotation.RequiresApi;
import androidx.core.content.C0841b;
import androidx.core.p033k.C0944i;
import androidx.core.p034l.C0962e0;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import org.apache.http.p549j0.C15430e;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: j */
    private static final String f4068j = "IconCompat";

    /* renamed from: k */
    public static final int f4069k = -1;

    /* renamed from: l */
    private static final float f4070l = 0.25f;

    /* renamed from: m */
    private static final float f4071m = 0.6666667f;

    /* renamed from: n */
    private static final float f4072n = 0.9166667f;

    /* renamed from: o */
    private static final float f4073o = 0.010416667f;

    /* renamed from: p */
    private static final float f4074p = 0.020833334f;

    /* renamed from: q */
    private static final int f4075q = 61;

    /* renamed from: r */
    private static final int f4076r = 30;

    /* renamed from: s */
    private static final String f4077s = "type";

    /* renamed from: t */
    private static final String f4078t = "obj";

    /* renamed from: u */
    private static final String f4079u = "int1";

    /* renamed from: v */
    private static final String f4080v = "int2";

    /* renamed from: w */
    private static final String f4081w = "tint_list";

    /* renamed from: x */
    private static final String f4082x = "tint_mode";

    /* renamed from: y */
    static final Mode f4083y = Mode.SRC_IN;
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})

    /* renamed from: a */
    public int f4084a = -1;

    /* renamed from: b */
    Object f4085b;
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: c */
    public byte[] f4086c = null;
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: d */
    public Parcelable f4087d = null;
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: e */
    public int f4088e = 0;
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: f */
    public int f4089f = 0;
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: g */
    public ColorStateList f4090g = null;

    /* renamed from: h */
    Mode f4091h = f4083y;
    @C0207n0({C0208a.LIBRARY})

    /* renamed from: i */
    public String f4092i = null;

    @C0207n0({C0208a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.graphics.drawable.IconCompat$a */
    public @interface C0891a {
    }

    @C0207n0({C0208a.LIBRARY})
    public IconCompat() {
    }

    /* renamed from: a */
    public static IconCompat m5113a(Context context, @C0213q int i) {
        if (context != null) {
            return m5115a(context.getResources(), context.getPackageName(), i);
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    /* renamed from: b */
    public static IconCompat m5123b(Bitmap bitmap) {
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.f4085b = bitmap;
            return iconCompat;
        }
        throw new IllegalArgumentException("Bitmap must not be null.");
    }

    /* renamed from: b */
    private static String m5124b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN" : "BITMAP_MASKABLE" : "URI" : "DATA" : "RESOURCE" : "BITMAP";
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0081  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m5125c(android.content.Context r7) {
        /*
            r6 = this;
            int r0 = r6.f4084a
            r1 = 1
            if (r0 == r1) goto L_0x00d6
            r2 = 0
            r3 = 0
            r4 = 2
            if (r0 == r4) goto L_0x00a5
            r1 = 3
            if (r0 == r1) goto L_0x008f
            r1 = 4
            if (r0 == r1) goto L_0x0027
            r1 = 5
            if (r0 == r1) goto L_0x0015
            goto L_0x00d5
        L_0x0015:
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r7 = r7.getResources()
            java.lang.Object r1 = r6.f4085b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            android.graphics.Bitmap r1 = m5112a(r1, r2)
            r0.<init>(r7, r1)
            return r0
        L_0x0027:
            java.lang.Object r0 = r6.f4085b
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "content"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x0065
            java.lang.String r2 = "file"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0044
            goto L_0x0065
        L_0x0044:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0054 }
            java.io.File r2 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0054 }
            java.lang.Object r4 = r6.f4085b     // Catch:{ FileNotFoundException -> 0x0054 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ FileNotFoundException -> 0x0054 }
            r2.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0054 }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0054 }
            r0 = r1
            goto L_0x007f
        L_0x0054:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to load image from path: "
            r1.append(r2)
            r1.append(r0)
            r1.toString()
            goto L_0x007e
        L_0x0065:
            android.content.ContentResolver r1 = r7.getContentResolver()     // Catch:{ Exception -> 0x006e }
            java.io.InputStream r0 = r1.openInputStream(r0)     // Catch:{ Exception -> 0x006e }
            goto L_0x007f
        L_0x006e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to load image from URI: "
            r1.append(r2)
            r1.append(r0)
            r1.toString()
        L_0x007e:
            r0 = r3
        L_0x007f:
            if (r0 == 0) goto L_0x00d5
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r7 = r7.getResources()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r0)
            r1.<init>(r7, r0)
            return r1
        L_0x008f:
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r7 = r7.getResources()
            java.lang.Object r1 = r6.f4085b
            byte[] r1 = (byte[]) r1
            int r2 = r6.f4088e
            int r3 = r6.f4089f
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r1, r2, r3)
            r0.<init>(r7, r1)
            return r0
        L_0x00a5:
            java.lang.String r0 = r6.mo4584j()
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 == 0) goto L_0x00b3
            java.lang.String r0 = r7.getPackageName()
        L_0x00b3:
            android.content.res.Resources r0 = m5111a(r7, r0)
            int r5 = r6.f4088e     // Catch:{ RuntimeException -> 0x00c2 }
            android.content.res.Resources$Theme r7 = r7.getTheme()     // Catch:{ RuntimeException -> 0x00c2 }
            android.graphics.drawable.Drawable r7 = androidx.core.content.p020h.C0874g.m5058c(r0, r5, r7)     // Catch:{ RuntimeException -> 0x00c2 }
            return r7
        L_0x00c2:
            java.lang.Object[] r7 = new java.lang.Object[r4]
            int r0 = r6.f4088e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7[r2] = r0
            java.lang.Object r0 = r6.f4085b
            r7[r1] = r0
            java.lang.String r0 = "Unable to load resource 0x%08x from pkg=%s"
            java.lang.String.format(r0, r7)
        L_0x00d5:
            return r3
        L_0x00d6:
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r7 = r7.getResources()
            java.lang.Object r1 = r6.f4085b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r0.<init>(r7, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.m5125c(android.content.Context):android.graphics.drawable.Drawable");
    }

    @RequiresApi(23)
    /* renamed from: d */
    private static int m5127d(@C0193h0 Icon icon) {
        String str = "Unable to get icon type ";
        if (VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(icon);
            sb.toString();
            return -1;
        } catch (InvocationTargetException unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(icon);
            sb2.toString();
            return -1;
        } catch (NoSuchMethodException unused3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(icon);
            sb3.toString();
            return -1;
        }
    }

    @RequiresApi(23)
    @C0195i0
    /* renamed from: e */
    private static Uri m5128e(@C0193h0 Icon icon) {
        if (VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public void mo4581g() {
        this.f4091h = Mode.valueOf(this.f4092i);
        int i = this.f4084a;
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.f4085b = this.f4086c;
                        return;
                    } else if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                    }
                }
                this.f4085b = new String(this.f4086c, Charset.forName(C15430e.f44594u));
                return;
            }
            Parcelable parcelable = this.f4087d;
            if (parcelable != null) {
                this.f4085b = parcelable;
                return;
            }
            byte[] bArr = this.f4086c;
            this.f4085b = bArr;
            this.f4084a = 3;
            this.f4088e = 0;
            this.f4089f = bArr.length;
            return;
        }
        Parcelable parcelable2 = this.f4087d;
        if (parcelable2 != null) {
            this.f4085b = parcelable2;
            return;
        }
        throw new IllegalArgumentException("Invalid icon");
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    /* renamed from: h */
    public Bitmap mo4582h() {
        if (this.f4084a != -1 || VERSION.SDK_INT < 23) {
            int i = this.f4084a;
            if (i == 1) {
                return (Bitmap) this.f4085b;
            }
            if (i == 5) {
                return m5112a((Bitmap) this.f4085b, true);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("called getBitmap() on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
        Object obj = this.f4085b;
        if (obj instanceof Bitmap) {
            return (Bitmap) obj;
        }
        return null;
    }

    @C0225w
    /* renamed from: i */
    public int mo4583i() {
        if (this.f4084a == -1 && VERSION.SDK_INT >= 23) {
            return m5122b((Icon) this.f4085b);
        }
        if (this.f4084a == 2) {
            return this.f4088e;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("called getResId() on ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    @C0193h0
    /* renamed from: j */
    public String mo4584j() {
        if (this.f4084a == -1 && VERSION.SDK_INT >= 23) {
            return m5126c((Icon) this.f4085b);
        }
        if (this.f4084a == 2) {
            return ((String) this.f4085b).split(":", -1)[0];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("called getResPackage() on ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: l */
    public int mo4585l() {
        if (this.f4084a != -1 || VERSION.SDK_INT < 23) {
            return this.f4084a;
        }
        return m5127d((Icon) this.f4085b);
    }

    @C0193h0
    /* renamed from: m */
    public Uri mo4586m() {
        if (this.f4084a != -1 || VERSION.SDK_INT < 23) {
            return Uri.parse((String) this.f4085b);
        }
        return m5128e((Icon) this.f4085b);
    }

    @RequiresApi(23)
    /* renamed from: n */
    public Icon mo4587n() {
        Icon icon;
        int i = this.f4084a;
        if (i == -1) {
            return (Icon) this.f4085b;
        }
        if (i == 1) {
            icon = Icon.createWithBitmap((Bitmap) this.f4085b);
        } else if (i == 2) {
            icon = Icon.createWithResource(mo4584j(), this.f4088e);
        } else if (i == 3) {
            icon = Icon.createWithData((byte[]) this.f4085b, this.f4088e, this.f4089f);
        } else if (i == 4) {
            icon = Icon.createWithContentUri((String) this.f4085b);
        } else if (i != 5) {
            throw new IllegalArgumentException("Unknown type");
        } else if (VERSION.SDK_INT >= 26) {
            icon = Icon.createWithAdaptiveBitmap((Bitmap) this.f4085b);
        } else {
            icon = Icon.createWithBitmap(m5112a((Bitmap) this.f4085b, false));
        }
        ColorStateList colorStateList = this.f4090g;
        if (colorStateList != null) {
            icon.setTintList(colorStateList);
        }
        Mode mode = this.f4091h;
        if (mode != f4083y) {
            icon.setTintMode(mode);
        }
        return icon;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != 5) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.f4084a
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r0 = r4.f4085b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.f4084a
            java.lang.String r1 = m5124b(r1)
            r0.append(r1)
            int r1 = r4.f4084a
            r2 = 1
            if (r1 == r2) goto L_0x007a
            r3 = 2
            if (r1 == r3) goto L_0x0052
            r2 = 3
            if (r1 == r2) goto L_0x0039
            r2 = 4
            if (r1 == r2) goto L_0x002e
            r2 = 5
            if (r1 == r2) goto L_0x007a
            goto L_0x009a
        L_0x002e:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.f4085b
            r0.append(r1)
            goto L_0x009a
        L_0x0039:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.f4088e
            r0.append(r1)
            int r1 = r4.f4089f
            if (r1 == 0) goto L_0x009a
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.f4089f
            r0.append(r1)
            goto L_0x009a
        L_0x0052:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.mo4584j()
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            int r3 = r4.mo4583i()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L_0x009a
        L_0x007a:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.f4085b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.f4085b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
            r0.append(r1)
        L_0x009a:
            android.content.res.ColorStateList r1 = r4.f4090g
            if (r1 == 0) goto L_0x00a8
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.f4090g
            r0.append(r1)
        L_0x00a8:
            android.graphics.PorterDuff$Mode r1 = r4.f4091h
            android.graphics.PorterDuff$Mode r2 = f4083y
            if (r1 == r2) goto L_0x00b8
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r4.f4091h
            r0.append(r1)
        L_0x00b8:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public static IconCompat m5115a(Resources resources, String str, @C0213q int i) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f4088e = i;
            if (resources != null) {
                try {
                    iconCompat.f4085b = resources.getResourceName(i);
                } catch (NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f4085b = str;
            }
            return iconCompat;
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }

    /* renamed from: b */
    public Drawable mo4580b(Context context) {
        mo4577a(context);
        if (VERSION.SDK_INT >= 23) {
            return mo4587n().loadDrawable(context);
        }
        Drawable c = m5125c(context);
        if (!(c == null || (this.f4090g == null && this.f4091h == f4083y))) {
            c.mutate();
            C0892a.m5146a(c, this.f4090g);
            C0892a.m5149a(c, this.f4091h);
        }
        return c;
    }

    private IconCompat(int i) {
        this.f4084a = i;
    }

    /* renamed from: a */
    public static IconCompat m5116a(Bitmap bitmap) {
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(5);
            iconCompat.f4085b = bitmap;
            return iconCompat;
        }
        throw new IllegalArgumentException("Bitmap must not be null.");
    }

    @RequiresApi(23)
    @C0225w
    @C0213q
    /* renamed from: b */
    private static int m5122b(@C0193h0 Icon icon) {
        if (VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static IconCompat m5121a(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            IconCompat iconCompat = new IconCompat(3);
            iconCompat.f4085b = bArr;
            iconCompat.f4088e = i;
            iconCompat.f4089f = i2;
            return iconCompat;
        }
        throw new IllegalArgumentException("Data must not be null.");
    }

    /* renamed from: a */
    public static IconCompat m5120a(String str) {
        if (str != null) {
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.f4085b = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Uri must not be null.");
    }

    /* renamed from: a */
    public static IconCompat m5118a(Uri uri) {
        if (uri != null) {
            return m5120a(uri.toString());
        }
        throw new IllegalArgumentException("Uri must not be null.");
    }

    /* renamed from: a */
    public IconCompat mo4574a(@C0198k int i) {
        return mo4575a(ColorStateList.valueOf(i));
    }

    /* renamed from: a */
    public IconCompat mo4575a(ColorStateList colorStateList) {
        this.f4090g = colorStateList;
        return this;
    }

    @RequiresApi(23)
    @C0195i0
    /* renamed from: c */
    private static String m5126c(@C0193h0 Icon icon) {
        if (VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public IconCompat mo4576a(Mode mode) {
        this.f4091h = mode;
        return this;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public void mo4577a(Context context) {
        if (this.f4084a == 2) {
            String str = (String) this.f4085b;
            String str2 = ":";
            if (str.contains(str2)) {
                String str3 = str.split(str2, -1)[1];
                String str4 = "/";
                String str5 = str3.split(str4, -1)[0];
                String str6 = str3.split(str4, -1)[1];
                String str7 = str.split(str2, -1)[0];
                int identifier = m5111a(context, str7).getIdentifier(str6, str5, str7);
                if (this.f4088e != identifier) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Id has changed for ");
                    sb.append(str7);
                    sb.append(str4);
                    sb.append(str6);
                    sb.toString();
                    this.f4088e = identifier;
                }
            }
        }
    }

    /* renamed from: a */
    private static Resources m5111a(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (NameNotFoundException unused) {
            String.format("Unable to find pkg=%s for icon", new Object[]{str});
            return null;
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public void mo4578a(@C0193h0 Intent intent, @C0195i0 Drawable drawable, @C0193h0 Context context) {
        Bitmap bitmap;
        mo4577a(context);
        int i = this.f4084a;
        if (i == 1) {
            bitmap = (Bitmap) this.f4085b;
            if (drawable != null) {
                bitmap = bitmap.copy(bitmap.getConfig(), true);
            }
        } else if (i == 2) {
            try {
                Context createPackageContext = context.createPackageContext(mo4584j(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", ShortcutIconResource.fromContext(createPackageContext, this.f4088e));
                    return;
                }
                Drawable c = C0841b.m4928c(createPackageContext, this.f4088e);
                if (c.getIntrinsicWidth() > 0) {
                    if (c.getIntrinsicHeight() > 0) {
                        bitmap = Bitmap.createBitmap(c.getIntrinsicWidth(), c.getIntrinsicHeight(), Config.ARGB_8888);
                        c.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        c.draw(new Canvas(bitmap));
                    }
                }
                int launcherLargeIconSize = ((ActivityManager) createPackageContext.getSystemService("activity")).getLauncherLargeIconSize();
                bitmap = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Config.ARGB_8888);
                c.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                c.draw(new Canvas(bitmap));
            } catch (NameNotFoundException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't find package ");
                sb.append(this.f4085b);
                throw new IllegalArgumentException(sb.toString(), e);
            }
        } else if (i == 5) {
            bitmap = m5112a((Bitmap) this.f4085b, true);
        } else {
            throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
        }
        if (drawable != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmap));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
    }

    /* renamed from: a */
    public Bundle mo4573a() {
        Bundle bundle = new Bundle();
        int i = this.f4084a;
        String str = f4078t;
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        bundle.putByteArray(str, (byte[]) this.f4085b);
                    } else if (i != 4) {
                        if (i != 5) {
                            throw new IllegalArgumentException("Invalid icon");
                        }
                    }
                }
                bundle.putString(str, (String) this.f4085b);
            }
            bundle.putParcelable(str, (Bitmap) this.f4085b);
        } else {
            bundle.putParcelable(str, (Parcelable) this.f4085b);
        }
        bundle.putInt("type", this.f4084a);
        bundle.putInt(f4079u, this.f4088e);
        bundle.putInt(f4080v, this.f4089f);
        ColorStateList colorStateList = this.f4090g;
        if (colorStateList != null) {
            bundle.putParcelable(f4081w, colorStateList);
        }
        Mode mode = this.f4091h;
        if (mode != f4083y) {
            bundle.putString(f4082x, mode.name());
        }
        return bundle;
    }

    /* renamed from: a */
    public void mo4579a(boolean z) {
        this.f4092i = this.f4091h.name();
        int i = this.f4084a;
        if (i != -1) {
            if (i != 1) {
                String str = C15430e.f44594u;
                if (i == 2) {
                    this.f4086c = ((String) this.f4085b).getBytes(Charset.forName(str));
                    return;
                } else if (i == 3) {
                    this.f4086c = (byte[]) this.f4085b;
                    return;
                } else if (i == 4) {
                    this.f4086c = this.f4085b.toString().getBytes(Charset.forName(str));
                    return;
                } else if (i != 5) {
                    return;
                }
            }
            if (z) {
                Bitmap bitmap = (Bitmap) this.f4085b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f4086c = byteArrayOutputStream.toByteArray();
                return;
            }
            this.f4087d = (Parcelable) this.f4085b;
        } else if (!z) {
            this.f4087d = (Parcelable) this.f4085b;
        } else {
            throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
        }
    }

    @C0195i0
    /* renamed from: a */
    public static IconCompat m5119a(@C0193h0 Bundle bundle) {
        int i = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i);
        iconCompat.f4088e = bundle.getInt(f4079u);
        iconCompat.f4089f = bundle.getInt(f4080v);
        String str = f4081w;
        if (bundle.containsKey(str)) {
            iconCompat.f4090g = (ColorStateList) bundle.getParcelable(str);
        }
        String str2 = f4082x;
        if (bundle.containsKey(str2)) {
            iconCompat.f4091h = Mode.valueOf(bundle.getString(str2));
        }
        String str3 = f4078t;
        if (!(i == -1 || i == 1)) {
            if (i != 2) {
                if (i == 3) {
                    iconCompat.f4085b = bundle.getByteArray(str3);
                    return iconCompat;
                } else if (i != 4) {
                    if (i != 5) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unknown type ");
                        sb.append(i);
                        sb.toString();
                        return null;
                    }
                }
            }
            iconCompat.f4085b = bundle.getString(str3);
            return iconCompat;
        }
        iconCompat.f4085b = bundle.getParcelable(str3);
        return iconCompat;
    }

    @RequiresApi(23)
    @C0195i0
    /* renamed from: a */
    public static IconCompat m5114a(@C0193h0 Context context, @C0193h0 Icon icon) {
        C0944i.m5337a(icon);
        int d = m5127d(icon);
        if (d == 2) {
            String c = m5126c(icon);
            try {
                return m5115a(m5111a(context, c), c, m5122b(icon));
            } catch (NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else if (d == 4) {
            return m5118a(m5128e(icon));
        } else {
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f4085b = icon;
            return iconCompat;
        }
    }

    @RequiresApi(23)
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    /* renamed from: a */
    public static IconCompat m5117a(@C0193h0 Icon icon) {
        C0944i.m5337a(icon);
        int d = m5127d(icon);
        if (d == 2) {
            return m5115a((Resources) null, m5126c(icon), m5122b(icon));
        }
        if (d == 4) {
            return m5118a(m5128e(icon));
        }
        IconCompat iconCompat = new IconCompat(-1);
        iconCompat.f4085b = icon;
        return iconCompat;
    }

    @C0224v0
    /* renamed from: a */
    static Bitmap m5112a(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = (float) min;
        float f2 = 0.5f * f;
        float f3 = f4072n * f2;
        if (z) {
            float f4 = f4073o * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * f4074p, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(C0962e0.f4343t);
        TileMode tileMode = TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }
}
