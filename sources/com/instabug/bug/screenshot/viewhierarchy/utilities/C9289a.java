package com.instabug.bug.screenshot.viewhierarchy.utilities;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.opengl.GLSurfaceView;
import android.os.Build.VERSION;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.C0195i0;
import com.instabug.bug.p356h.p357b.C9269b;
import com.instabug.library.instacapture.screenshot.ScreenshotTaker;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.IllegalFormatCodePointException;
import java.util.concurrent.Callable;
import p195e.p196a.C5923b0;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.bug.screenshot.viewhierarchy.utilities.a */
/* compiled from: BitmapUtils */
public class C9289a {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f24589a;

    /* renamed from: com.instabug.bug.screenshot.viewhierarchy.utilities.a$a */
    /* compiled from: BitmapUtils */
    static class C9290a implements Callable<C9269b> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24590b;

        /* renamed from: a */
        final /* synthetic */ C9269b f24591a;

        C9290a(C9269b bVar) {
            boolean[] b = m43473b();
            this.f24591a = bVar;
            b[0] = true;
        }

        /* renamed from: b */
        private static /* synthetic */ boolean[] m43473b() {
            boolean[] zArr = f24590b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-3108328564357234462L, "com/instabug/bug/screenshot/viewhierarchy/utilities/BitmapUtils$1", 3);
            f24590b = a;
            return a;
        }

        /* renamed from: a */
        public C9269b mo33581a() {
            boolean[] b = m43473b();
            C9269b b2 = C9289a.m43470b(this.f24591a);
            b[1] = true;
            return b2;
        }

        public /* synthetic */ Object call() throws Exception {
            boolean[] b = m43473b();
            C9269b a = mo33581a();
            b[2] = true;
            return a;
        }
    }

    public C9289a() {
        m43468a()[0] = true;
    }

    /* renamed from: a */
    public static C5923b0<C9269b> m43466a(C9269b bVar) {
        boolean[] a = m43468a();
        C5923b0<C9269b> f = C5923b0.m26194f((Callable<? extends T>) new C9290a<Object>(bVar));
        a[1] = true;
        return f;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m43468a() {
        boolean[] zArr = f24589a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-4710661439636915312L, "com/instabug/bug/screenshot/viewhierarchy/utilities/BitmapUtils", 83);
        f24589a = a;
        return a;
    }

    /* renamed from: b */
    static /* synthetic */ C9269b m43470b(C9269b bVar) {
        boolean[] a = m43468a();
        C9269b c = m43471c(bVar);
        a[82] = true;
        return c;
    }

    /* renamed from: c */
    private static C9269b m43471c(C9269b bVar) {
        Bitmap bitmap;
        Class<C9289a> cls = C9289a.class;
        boolean[] a = m43468a();
        StringBuilder sb = new StringBuilder();
        sb.append("staring capture viewHierarchy: ");
        sb.append(bVar.mo33465a());
        InstabugSDKLogger.m46626v(cls, sb.toString());
        a[2] = true;
        if (bVar.mo33494o() instanceof ViewGroup) {
            a[3] = true;
            boolean[] a2 = m43469a((ViewGroup) bVar.mo33494o());
            a[4] = true;
            bitmap = m43472d(bVar);
            a[5] = true;
            m43467a((ViewGroup) bVar.mo33494o(), a2);
            a[6] = true;
        } else {
            bitmap = m43472d(bVar);
            a[7] = true;
        }
        bVar.mo33467a(bitmap);
        a[8] = true;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("capture viewHierarchy done successfully: ");
        sb2.append(bVar.mo33465a());
        InstabugSDKLogger.m46626v(cls, sb2.toString());
        a[9] = true;
        return bVar;
    }

    @C0195i0
    /* renamed from: d */
    private static Bitmap m43472d(C9269b bVar) {
        boolean[] a = m43468a();
        if (bVar.mo33494o() == null) {
            a[24] = true;
        } else if (bVar.mo33492m() == null) {
            a[25] = true;
        } else {
            a[26] = true;
            if (bVar.mo33494o().getHeight() <= 0) {
                a[27] = true;
            } else {
                a[28] = true;
                if (bVar.mo33494o().getWidth() <= 0) {
                    a[29] = true;
                } else {
                    a[30] = true;
                    if (bVar.mo33492m().height() <= 0) {
                        a[31] = true;
                    } else {
                        a[32] = true;
                        if (bVar.mo33492m().width() <= 0) {
                            a[33] = true;
                        } else {
                            a[34] = true;
                            Bitmap a2 = m43465a(bVar.mo33494o());
                            a[35] = true;
                            Rect m = bVar.mo33492m();
                            Rect n = bVar.mo33493n();
                            a[36] = true;
                            Bitmap a3 = m43464a(a2, m, n);
                            a[37] = true;
                            Bitmap a4 = m43463a(a3, bVar.mo33495p());
                            a[38] = true;
                            return a4;
                        }
                    }
                }
            }
        }
        a[39] = true;
        return null;
    }

    /* renamed from: a */
    private static boolean[] m43469a(ViewGroup viewGroup) {
        boolean[] a = m43468a();
        boolean[] zArr = new boolean[viewGroup.getChildCount()];
        a[10] = true;
        a[11] = true;
        int i = 0;
        while (i < viewGroup.getChildCount()) {
            a[12] = true;
            if (viewGroup.getChildAt(i).getVisibility() == 0) {
                zArr[i] = true;
                a[13] = true;
                viewGroup.getChildAt(i).setVisibility(4);
                a[14] = true;
            } else {
                zArr[i] = false;
                a[15] = true;
            }
            i++;
            a[16] = true;
        }
        a[17] = true;
        return zArr;
    }

    /* renamed from: a */
    private static void m43467a(ViewGroup viewGroup, boolean[] zArr) {
        boolean[] a = m43468a();
        a[18] = true;
        int i = 0;
        while (i < zArr.length) {
            if (!zArr[i]) {
                a[19] = true;
            } else {
                a[20] = true;
                viewGroup.getChildAt(i).setVisibility(0);
                a[21] = true;
            }
            i++;
            a[22] = true;
        }
        a[23] = true;
    }

    /* renamed from: a */
    private static Bitmap m43465a(View view) {
        boolean[] a = m43468a();
        int width = view.getWidth();
        a[40] = true;
        int height = view.getHeight();
        Config config = Config.ARGB_8888;
        a[41] = true;
        Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
        a[42] = true;
        Canvas canvas = new Canvas(createBitmap);
        a[43] = true;
        view.draw(canvas);
        int[] iArr = {0, 0};
        if (VERSION.SDK_INT < 14) {
            a[44] = true;
        } else if (!(view instanceof TextureView)) {
            a[45] = true;
        } else {
            a[46] = true;
            ScreenshotTaker.drawTextureView((TextureView) view, iArr, canvas);
            a[47] = true;
        }
        if (!(view instanceof GLSurfaceView)) {
            a[48] = true;
        } else {
            a[49] = true;
            ScreenshotTaker.drawGLSurfaceView((GLSurfaceView) view, iArr, canvas);
            a[50] = true;
        }
        if (VERSION.SDK_INT < 11) {
            a[51] = true;
        } else if (!(view instanceof WebView)) {
            a[52] = true;
        } else {
            a[53] = true;
            ScreenshotTaker.drawWebView((WebView) view, canvas);
            a[54] = true;
        }
        a[55] = true;
        return createBitmap;
    }

    @C0195i0
    /* renamed from: a */
    private static Bitmap m43464a(Bitmap bitmap, Rect rect, Rect rect2) throws IllegalFormatCodePointException {
        Class<C9289a> cls = C9289a.class;
        boolean[] a = m43468a();
        Bitmap bitmap2 = null;
        if (bitmap == null) {
            a[56] = true;
        } else if (rect == null) {
            a[57] = true;
        } else if (rect.width() <= 0) {
            a[58] = true;
        } else if (rect.height() <= 0) {
            a[59] = true;
        } else {
            a[60] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("visible rect: ");
            sb.append(rect.toString());
            sb.append(", original rect");
            sb.append(rect2.toString());
            InstabugSDKLogger.m46626v(cls, sb.toString());
            a[61] = true;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bitmap width: ");
            sb2.append(bitmap.getWidth());
            sb2.append(", bitmap height: ");
            sb2.append(bitmap.getHeight());
            InstabugSDKLogger.m46626v(cls, sb2.toString());
            int i = rect.left - rect2.left;
            int i2 = rect.top - rect2.top;
            a[62] = true;
            if (i < 0) {
                a[63] = true;
            } else if (i2 < 0) {
                a[64] = true;
            } else if (rect.width() > bitmap.getWidth()) {
                a[65] = true;
            } else if (rect.height() > bitmap.getHeight()) {
                a[66] = true;
            } else {
                try {
                    a[67] = true;
                    bitmap2 = Bitmap.createBitmap(bitmap, i, i2, rect.width(), rect.height());
                    a[68] = true;
                } catch (OutOfMemoryError unused) {
                    a[69] = true;
                }
                a[70] = true;
                return bitmap2;
            }
            a[71] = true;
            return null;
        }
        a[72] = true;
        return null;
    }

    @C0195i0
    /* renamed from: a */
    private static Bitmap m43463a(Bitmap bitmap, int i) {
        boolean[] a = m43468a();
        if (bitmap == null) {
            a[73] = true;
        } else if (bitmap.getWidth() <= i) {
            a[74] = true;
        } else if (bitmap.getHeight() <= i) {
            a[75] = true;
        } else {
            a[76] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("scale: ");
            sb.append(i);
            sb.append(", bitmap width: ");
            sb.append(bitmap.getWidth());
            sb.append(", bitmap height: ");
            sb.append(bitmap.getHeight());
            InstabugSDKLogger.m46626v(C9289a.class, sb.toString());
            a[77] = true;
            int width = bitmap.getWidth() / i;
            a[78] = true;
            int height = bitmap.getHeight() / i;
            a[79] = true;
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, false);
            a[80] = true;
            return createScaledBitmap;
        }
        a[81] = true;
        return null;
    }
}
