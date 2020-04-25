package com.instabug.library.internal.video;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build.VERSION;
import android.widget.Toast;
import com.instabug.library.C9700R;
import com.instabug.library.core.eventbus.ScreenRecordingEventBus;
import com.instabug.library.core.eventbus.VideoProcessingServiceEventBus;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import com.krishna.fileloader.p408i.C10186b;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Picture;
import p195e.p196a.p449w0.C12331g;
import p205i.p471b.p472a.p473a.p474c.C13938g;

@SuppressFBWarnings({"RV_RETURN_VALUE_IGNORED_BAD_PRACTICE"})
public class VideoProcessingService extends IntentService {

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f26115b;

    /* renamed from: a */
    private Action f26116a;

    public enum Action {
        STOP;

        static {
            boolean[] $jacocoInit;
            $jacocoInit[3] = true;
        }
    }

    /* renamed from: com.instabug.library.internal.video.VideoProcessingService$a */
    class C9858a implements C12331g<Action> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26117b;

        /* renamed from: a */
        final /* synthetic */ VideoProcessingService f26118a;

        C9858a(VideoProcessingService videoProcessingService) {
            boolean[] a = m45906a();
            this.f26118a = videoProcessingService;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45906a() {
            boolean[] zArr = f26117b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(3847612256870597072L, "com/instabug/library/internal/video/VideoProcessingService$1", 4);
            f26117b = a;
            return a;
        }

        /* renamed from: a */
        public void mo35098a(Action action) {
            boolean[] a = m45906a();
            VideoProcessingService.m45896a(this.f26118a, action);
            a[1] = true;
            VideoProcessingService videoProcessingService = this.f26118a;
            StringBuilder sb = new StringBuilder();
            sb.append(action.name());
            sb.append(" action is received");
            InstabugSDKLogger.m46622d(videoProcessingService, sb.toString());
            a[2] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m45906a();
            mo35098a((Action) obj);
            a[3] = true;
        }
    }

    public VideoProcessingService() {
        boolean[] c = m45903c();
        super("VideoProcessingService");
        c[0] = true;
    }

    /* renamed from: a */
    static /* synthetic */ Action m45896a(VideoProcessingService videoProcessingService, Action action) {
        boolean[] c = m45903c();
        videoProcessingService.f26116a = action;
        c[81] = true;
        return action;
    }

    /* renamed from: b */
    private void m45902b() {
        boolean[] c = m45903c();
        File videoRecordingFramesDirectory = AttachmentsUtility.getVideoRecordingFramesDirectory(this);
        c[50] = true;
        File[] listFiles = videoRecordingFramesDirectory.listFiles();
        if (listFiles == null) {
            c[51] = true;
        } else {
            int length = listFiles.length;
            int i = 0;
            c[52] = true;
            while (i < length) {
                File file = listFiles[i];
                c[54] = true;
                file.delete();
                i++;
                c[55] = true;
            }
            c[53] = true;
        }
        InstabugSDKLogger.m46622d(this, "Video frames are removed");
        c[56] = true;
    }

    /* renamed from: c */
    private static /* synthetic */ boolean[] m45903c() {
        boolean[] zArr = f26115b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-4495705725547585151L, "com/instabug/library/internal/video/VideoProcessingService", 82);
        f26115b = a;
        return a;
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        boolean[] c = m45903c();
        VideoProcessingServiceEventBus.getInstance().subscribe(new C9858a(this));
        c[5] = true;
        String stringExtra = intent.getStringExtra("video.file.path");
        c[6] = true;
        String stringExtra2 = intent.getStringExtra("audio.file.path");
        try {
            c[7] = true;
            InstabugSDKLogger.m46622d(this, "making video");
            c[8] = true;
            m45901a(true);
            c[9] = true;
            m45900a(stringExtra, stringExtra2);
            c[10] = true;
        } catch (IOException e) {
            c[11] = true;
            e.printStackTrace();
            c[12] = true;
            InstabugSDKLogger.m46627w(this, "Couldn't encode video");
            c[13] = true;
            m45898a();
            c[14] = true;
        } catch (OutOfMemoryError e2) {
            c[15] = true;
            e2.printStackTrace();
            c[16] = true;
            InstabugSDKLogger.m46627w(this, "OutOfMemoryError - Couldn't encode video");
            c[17] = true;
            m45898a();
            c[18] = true;
        }
        c[19] = true;
    }

    /* renamed from: a */
    public static void m45899a(Context context, String str, String str2) {
        boolean[] c = m45903c();
        Intent intent = new Intent(context, VideoProcessingService.class);
        c[1] = true;
        intent.putExtra("video.file.path", str);
        c[2] = true;
        intent.putExtra("audio.file.path", str2);
        c[3] = true;
        context.startService(intent);
        c[4] = true;
    }

    /* renamed from: a */
    private void m45900a(String str, String str2) throws IOException, NullPointerException {
        boolean[] c = m45903c();
        File videoRecordingFramesDirectory = AttachmentsUtility.getVideoRecordingFramesDirectory(this);
        c[20] = true;
        List<File> a = m45897a(videoRecordingFramesDirectory);
        c[21] = true;
        File file = new File(str);
        c[22] = true;
        C9859a aVar = new C9859a(file);
        c[23] = true;
        c[24] = true;
        for (File file2 : a) {
            if (this.f26116a == Action.STOP) {
                c[25] = true;
                m45902b();
                c[26] = true;
                m45901a(false);
                c[27] = true;
                StringBuilder sb = new StringBuilder();
                sb.append(VideoProcessingService.class.getSimpleName());
                sb.append(" has stopped");
                InstabugSDKLogger.m46622d(this, sb.toString());
                c[28] = true;
                return;
            }
            aVar.mo35100a(mo35095a(BitmapFactory.decodeFile(file2.getPath())));
            c[29] = true;
        }
        aVar.mo35099a();
        c[30] = true;
        m45902b();
        if (VERSION.SDK_INT < 18) {
            c[31] = true;
        } else if (str2 == null) {
            c[32] = true;
        } else {
            c[33] = true;
            InstabugVideoUtils instabugVideoUtils = new InstabugVideoUtils();
            c[34] = true;
            str = instabugVideoUtils.mux(str2, str);
            c[35] = true;
            File file3 = new File(str2);
            c[36] = true;
            file.delete();
            c[37] = true;
            file3.delete();
            c[38] = true;
            InstabugSDKLogger.m46622d(this, "Video encoding is done!");
            c[40] = true;
            Uri fromFile = Uri.fromFile(new File(str));
            c[41] = true;
            ScreenRecordingEventBus instance = ScreenRecordingEventBus.getInstance();
            ScreenRecordEvent screenRecordEvent = new ScreenRecordEvent(1, fromFile);
            c[42] = true;
            instance.post(screenRecordEvent);
            c[43] = true;
            m45901a(false);
            c[44] = true;
        }
        c[39] = true;
        InstabugSDKLogger.m46622d(this, "Video encoding is done!");
        c[40] = true;
        Uri fromFile2 = Uri.fromFile(new File(str));
        c[41] = true;
        ScreenRecordingEventBus instance2 = ScreenRecordingEventBus.getInstance();
        ScreenRecordEvent screenRecordEvent2 = new ScreenRecordEvent(1, fromFile2);
        c[42] = true;
        instance2.post(screenRecordEvent2);
        c[43] = true;
        m45901a(false);
        c[44] = true;
    }

    /* renamed from: a */
    private void m45898a() {
        boolean[] c = m45903c();
        Toast.makeText(this, C9700R.string.instabug_str_video_encoding_error, 0).show();
        c[45] = true;
        ScreenRecordingEventBus instance = ScreenRecordingEventBus.getInstance();
        ScreenRecordEvent screenRecordEvent = new ScreenRecordEvent(2, null);
        c[46] = true;
        instance.post(screenRecordEvent);
        c[47] = true;
        m45901a(false);
        c[48] = true;
    }

    /* renamed from: a */
    private void m45901a(boolean z) {
        boolean[] c = m45903c();
        SettingsManager.getInstance().setVideoProcessorBusy(z);
        c[49] = true;
    }

    /* renamed from: a */
    private List<File> m45897a(File file) {
        boolean[] c = m45903c();
        ArrayList arrayList = new ArrayList();
        c[57] = true;
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            c[58] = true;
        } else {
            int length = listFiles.length;
            int i = 0;
            c[59] = true;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2 == null) {
                    c[61] = true;
                } else {
                    c[62] = true;
                    if (file2.isDirectory()) {
                        c[63] = true;
                        arrayList.addAll(m45897a(file2));
                        c[64] = true;
                    } else if (!file2.getName().endsWith(C10186b.f27189b)) {
                        c[65] = true;
                    } else {
                        c[66] = true;
                        arrayList.add(file2);
                        c[67] = true;
                    }
                }
                i++;
                c[68] = true;
            }
            c[60] = true;
        }
        c[69] = true;
        return arrayList;
    }

    /* renamed from: a */
    public Picture mo35095a(Bitmap bitmap) {
        boolean[] c = m45903c();
        Picture create = Picture.create(bitmap.getWidth(), bitmap.getHeight(), ColorSpace.RGB);
        c[70] = true;
        mo35096a(bitmap, create);
        c[71] = true;
        return create;
    }

    /* renamed from: a */
    public void mo35096a(Bitmap bitmap, Picture picture) {
        boolean[] c = m45903c();
        int[] planeData = picture.getPlaneData(0);
        c[72] = true;
        int[] iArr = new int[(bitmap.getWidth() * bitmap.getHeight())];
        c[73] = true;
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        c[74] = true;
        c[75] = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < bitmap.getHeight()) {
            c[76] = true;
            c[77] = true;
            int i4 = i3;
            int i5 = i2;
            int i6 = 0;
            while (i6 < bitmap.getWidth()) {
                int i7 = iArr[i5];
                planeData[i4] = (i7 >> 16) & 255;
                planeData[i4 + 1] = (i7 >> 8) & 255;
                planeData[i4 + 2] = i7 & 255;
                i6++;
                i5++;
                i4 += 3;
                c[78] = true;
            }
            i++;
            c[79] = true;
            i2 = i5;
            i3 = i4;
        }
        c[80] = true;
    }
}
