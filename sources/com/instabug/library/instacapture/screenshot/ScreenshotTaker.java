package com.instabug.library.instacapture.screenshot;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.opengl.GLSurfaceView;
import android.os.Build.VERSION;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.C0195i0;
import androidx.annotation.C0225w;
import com.instabug.library.p384h.p385c.C9818a;
import com.instabug.library.p384h.p385c.C9819b;
import com.instabug.library.util.InstabugSDKLogger;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.opengles.GL10;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public final class ScreenshotTaker {
    private static transient /* synthetic */ boolean[] $jacocoData;

    /* renamed from: com.instabug.library.instacapture.screenshot.ScreenshotTaker$a */
    static class C9822a implements Runnable {

        /* renamed from: P */
        private static transient /* synthetic */ boolean[] f26040P;

        /* renamed from: N */
        final /* synthetic */ IntBuffer f26041N;

        /* renamed from: O */
        final /* synthetic */ CountDownLatch f26042O;

        /* renamed from: a */
        final /* synthetic */ int f26043a;

        /* renamed from: b */
        final /* synthetic */ int f26044b;

        C9822a(int i, int i2, IntBuffer intBuffer, CountDownLatch countDownLatch) {
            boolean[] a = m45816a();
            this.f26043a = i;
            this.f26044b = i2;
            this.f26041N = intBuffer;
            this.f26042O = countDownLatch;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45816a() {
            boolean[] zArr = f26040P;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(4445453993219420787L, "com/instabug/library/instacapture/screenshot/ScreenshotTaker$1", 10);
            f26040P = a;
            return a;
        }

        public void run() {
            boolean[] a = m45816a();
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            a[1] = true;
            egl10.eglWaitGL();
            a[2] = true;
            GL10 gl10 = (GL10) egl10.eglGetCurrentContext().getGL();
            a[3] = true;
            gl10.glFinish();
            try {
                a[4] = true;
                Thread.sleep(200);
                a[5] = true;
            } catch (InterruptedException e) {
                a[6] = true;
                e.printStackTrace();
                a[7] = true;
            }
            gl10.glReadPixels(0, 0, this.f26043a, this.f26044b + 0, 6408, 5121, this.f26041N);
            a[8] = true;
            this.f26042O.countDown();
            a[9] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1974664054485497943L, "com/instabug/library/instacapture/screenshot/ScreenshotTaker", 113);
        $jacocoData = a;
        return a;
    }

    private ScreenshotTaker() {
        $jacocoInit()[0] = true;
    }

    public static void drawGLSurfaceView(GLSurfaceView gLSurfaceView, int[] iArr, Canvas canvas) {
        boolean[] $jacocoInit = $jacocoInit();
        C9818a.m45807a((CharSequence) "Drawing GLSurfaceView");
        $jacocoInit[65] = true;
        if (gLSurfaceView.getWindowToken() == null) {
            $jacocoInit[66] = true;
        } else {
            $jacocoInit[67] = true;
            int width = gLSurfaceView.getWidth();
            $jacocoInit[68] = true;
            int height = gLSurfaceView.getHeight();
            int[] iArr2 = new int[((height + 0) * width)];
            $jacocoInit[69] = true;
            IntBuffer wrap = IntBuffer.wrap(iArr2);
            $jacocoInit[70] = true;
            wrap.position(0);
            $jacocoInit[71] = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            $jacocoInit[72] = true;
            gLSurfaceView.queueEvent(new C9822a(width, height, wrap, countDownLatch));
            try {
                $jacocoInit[73] = true;
                countDownLatch.await();
                $jacocoInit[74] = true;
            } catch (InterruptedException e) {
                $jacocoInit[75] = true;
                e.printStackTrace();
                $jacocoInit[76] = true;
            }
            int[] iArr3 = new int[(width * height)];
            $jacocoInit[77] = true;
            int i = 0;
            int i2 = 0;
            while (i < height) {
                $jacocoInit[78] = true;
                int i3 = 0;
                while (i3 < width) {
                    int i4 = iArr2[(i * width) + i3];
                    iArr3[(((height - i2) - 1) * width) + i3] = (i4 & -16711936) | ((i4 << 16) & 16711680) | ((i4 >> 16) & 255);
                    i3++;
                    $jacocoInit[79] = true;
                }
                i++;
                i2++;
                $jacocoInit[80] = true;
            }
            Bitmap createBitmap = Bitmap.createBitmap(iArr3, width, height, Config.ARGB_8888);
            $jacocoInit[81] = true;
            Paint paint = new Paint();
            $jacocoInit[82] = true;
            paint.setXfermode(new PorterDuffXfermode(Mode.DST_ATOP));
            $jacocoInit[83] = true;
            canvas.drawBitmap(createBitmap, (float) iArr[0], (float) iArr[1], paint);
            $jacocoInit[84] = true;
            createBitmap.recycle();
            $jacocoInit[85] = true;
        }
        $jacocoInit[86] = true;
    }

    private static void drawRootToBitmap(RootViewInfo rootViewInfo, Bitmap bitmap, @C0225w @C0195i0 int[] iArr) {
        boolean[] $jacocoInit = $jacocoInit();
        int i = 0;
        if ((rootViewInfo.getLayoutParams().flags & 2) != 2) {
            $jacocoInit[15] = true;
        } else {
            $jacocoInit[16] = true;
            Canvas canvas = new Canvas(bitmap);
            $jacocoInit[17] = true;
            int i2 = (int) (rootViewInfo.getLayoutParams().dimAmount * 255.0f);
            $jacocoInit[18] = true;
            canvas.drawARGB(i2, 0, 0, 0);
            $jacocoInit[19] = true;
        }
        Canvas canvas2 = new Canvas(bitmap);
        $jacocoInit[20] = true;
        canvas2.translate((float) rootViewInfo.getLeft(), (float) rootViewInfo.getTop());
        int[] iArr2 = null;
        if (iArr == null) {
            $jacocoInit[21] = true;
        } else {
            iArr2 = new int[iArr.length];
            $jacocoInit[22] = true;
        }
        if (iArr == null) {
            $jacocoInit[23] = true;
        } else {
            $jacocoInit[24] = true;
            int i3 = 0;
            while (i3 < iArr.length) {
                $jacocoInit[26] = true;
                View findViewById = rootViewInfo.getView().findViewById(iArr[i3]);
                if (findViewById == null) {
                    $jacocoInit[27] = true;
                } else {
                    $jacocoInit[28] = true;
                    iArr2[i3] = findViewById.getVisibility();
                    $jacocoInit[29] = true;
                    findViewById.setVisibility(4);
                    $jacocoInit[30] = true;
                }
                i3++;
                $jacocoInit[31] = true;
            }
            $jacocoInit[25] = true;
        }
        rootViewInfo.getView().draw(canvas2);
        $jacocoInit[32] = true;
        drawUnDrawableViews(rootViewInfo.getView(), canvas2);
        if (iArr == null) {
            $jacocoInit[33] = true;
        } else {
            $jacocoInit[34] = true;
            while (i < iArr.length) {
                $jacocoInit[36] = true;
                View findViewById2 = rootViewInfo.getView().findViewById(iArr[i]);
                if (findViewById2 == null) {
                    $jacocoInit[37] = true;
                } else {
                    $jacocoInit[38] = true;
                    findViewById2.setVisibility(iArr2[i]);
                    $jacocoInit[39] = true;
                }
                i++;
                $jacocoInit[40] = true;
            }
            $jacocoInit[35] = true;
        }
        $jacocoInit[41] = true;
    }

    private static void drawRootsToBitmap(List<RootViewInfo> list, Bitmap bitmap, @C0225w @C0195i0 int[] iArr) {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[11] = true;
        for (RootViewInfo rootViewInfo : list) {
            $jacocoInit[12] = true;
            drawRootToBitmap(rootViewInfo, bitmap, iArr);
            $jacocoInit[13] = true;
        }
        $jacocoInit[14] = true;
    }

    @TargetApi(14)
    public static void drawTextureView(TextureView textureView, int[] iArr, Canvas canvas) {
        Class<ScreenshotTaker> cls = ScreenshotTaker.class;
        boolean[] $jacocoInit = $jacocoInit();
        C9818a.m45807a((CharSequence) "Drawing TextureView");
        try {
            $jacocoInit[87] = true;
            Bitmap bitmap = textureView.getBitmap();
            if (bitmap == null) {
                $jacocoInit[88] = true;
            } else {
                $jacocoInit[89] = true;
                Paint paint = new Paint();
                $jacocoInit[90] = true;
                paint.setXfermode(new PorterDuffXfermode(Mode.DST_ATOP));
                $jacocoInit[91] = true;
                canvas.drawBitmap(bitmap, (float) iArr[0], (float) iArr[1], paint);
                $jacocoInit[92] = true;
                bitmap.recycle();
                $jacocoInit[93] = true;
            }
            $jacocoInit[94] = true;
        } catch (OutOfMemoryError e) {
            $jacocoInit[95] = true;
            InstabugSDKLogger.m46624e(cls, cls.getSimpleName(), e);
            $jacocoInit[96] = true;
        }
        $jacocoInit[97] = true;
    }

    private static ArrayList<View> drawUnDrawableViews(View view, Canvas canvas) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!(view instanceof ViewGroup)) {
            $jacocoInit[42] = true;
            ArrayList<View> arrayList = new ArrayList<>();
            $jacocoInit[43] = true;
            arrayList.add(view);
            $jacocoInit[44] = true;
            return arrayList;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        ViewGroup viewGroup = (ViewGroup) view;
        $jacocoInit[45] = true;
        int i = 0;
        $jacocoInit[46] = true;
        while (i < viewGroup.getChildCount()) {
            $jacocoInit[47] = true;
            View childAt = viewGroup.getChildAt(i);
            $jacocoInit[48] = true;
            ArrayList arrayList3 = new ArrayList();
            $jacocoInit[49] = true;
            arrayList3.add(view);
            $jacocoInit[50] = true;
            arrayList3.addAll(drawUnDrawableViews(childAt, canvas));
            int[] iArr = new int[2];
            $jacocoInit[51] = true;
            childAt.getLocationOnScreen(iArr);
            if (VERSION.SDK_INT < 14) {
                $jacocoInit[52] = true;
            } else if (!(childAt instanceof TextureView)) {
                $jacocoInit[53] = true;
            } else {
                $jacocoInit[54] = true;
                drawTextureView((TextureView) childAt, iArr, canvas);
                $jacocoInit[55] = true;
            }
            if (!(childAt instanceof GLSurfaceView)) {
                $jacocoInit[56] = true;
            } else {
                $jacocoInit[57] = true;
                drawGLSurfaceView((GLSurfaceView) childAt, iArr, canvas);
                $jacocoInit[58] = true;
            }
            if (VERSION.SDK_INT < 11) {
                $jacocoInit[59] = true;
            } else if (!(childAt instanceof WebView)) {
                $jacocoInit[60] = true;
            } else {
                $jacocoInit[61] = true;
                drawWebView((WebView) childAt, canvas);
                $jacocoInit[62] = true;
            }
            arrayList2.addAll(arrayList3);
            i++;
            $jacocoInit[63] = true;
        }
        $jacocoInit[64] = true;
        return arrayList2;
    }

    @TargetApi(11)
    public static void drawWebView(WebView webView, Canvas canvas) {
        boolean[] $jacocoInit = $jacocoInit();
        int layerType = webView.getLayerType();
        if (layerType != 2) {
            $jacocoInit[98] = true;
        } else {
            $jacocoInit[99] = true;
            webView.setLayerType(0, null);
            $jacocoInit[100] = true;
            webView.setDrawingCacheEnabled(true);
            $jacocoInit[101] = true;
            webView.buildDrawingCache(true);
            $jacocoInit[102] = true;
            Bitmap drawingCache = webView.getDrawingCache();
            if (drawingCache == null) {
                $jacocoInit[103] = true;
            } else {
                $jacocoInit[104] = true;
                Paint paint = new Paint();
                $jacocoInit[105] = true;
                paint.setXfermode(new PorterDuffXfermode(Mode.DST_ATOP));
                int[] iArr = new int[2];
                $jacocoInit[106] = true;
                webView.getLocationOnScreen(iArr);
                $jacocoInit[107] = true;
                canvas.drawBitmap(drawingCache, (float) iArr[0], (float) iArr[1], paint);
                $jacocoInit[108] = true;
                drawingCache.recycle();
                $jacocoInit[109] = true;
            }
            webView.setDrawingCacheEnabled(false);
            $jacocoInit[110] = true;
            webView.setLayerType(layerType, null);
            $jacocoInit[111] = true;
        }
        $jacocoInit[112] = true;
    }

    public static Bitmap getScreenshotBitmap(Activity activity, @C0225w @C0195i0 int[] iArr) {
        Bitmap bitmap;
        boolean[] $jacocoInit = $jacocoInit();
        if (activity != null) {
            View decorView = activity.getWindow().getDecorView();
            $jacocoInit[3] = true;
            List rootViews = FieldHelper.getRootViews(activity, iArr);
            $jacocoInit[4] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("viewRoots count: ");
            sb.append(rootViews.size());
            C9818a.m45807a((CharSequence) sb.toString());
            try {
                $jacocoInit[5] = true;
                if (((long) (decorView.getWidth() * decorView.getHeight() * 4)) < C9819b.m45811a(activity)) {
                    $jacocoInit[6] = true;
                    bitmap = Bitmap.createBitmap(decorView.getWidth(), decorView.getHeight(), Config.ARGB_8888);
                    $jacocoInit[7] = true;
                } else {
                    bitmap = Bitmap.createBitmap(decorView.getWidth(), decorView.getHeight(), Config.RGB_565);
                    $jacocoInit[8] = true;
                }
                drawRootsToBitmap(rootViews, bitmap, iArr);
                $jacocoInit[10] = true;
                return bitmap;
            } catch (IllegalArgumentException | OutOfMemoryError unused) {
                $jacocoInit[9] = true;
                return null;
            }
        } else {
            $jacocoInit[1] = true;
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Parameter activity cannot be null.");
            $jacocoInit[2] = true;
            throw illegalArgumentException;
        }
    }
}
