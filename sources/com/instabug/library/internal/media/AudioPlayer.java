package com.instabug.library.internal.media;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnPreparedListener;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class AudioPlayer {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private String filePath;
    private MediaPlayer mediaPlayer;
    private OnCompletionListener onCompletionListener;
    private C9831e onGetDurationListener;
    private Map<String, OnStopListener> onStopListeners = new HashMap();

    public static abstract class OnStopListener {
        private static transient /* synthetic */ boolean[] $jacocoData;
        private String filePath;

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6770279982583955011L, "com/instabug/library/internal/media/AudioPlayer$OnStopListener", 2);
            $jacocoData = a;
            return a;
        }

        public OnStopListener(String str) {
            boolean[] $jacocoInit = $jacocoInit();
            this.filePath = str;
            $jacocoInit[1] = true;
        }

        public String getFilePath() {
            boolean[] $jacocoInit = $jacocoInit();
            String str = this.filePath;
            $jacocoInit[0] = true;
            return str;
        }

        public abstract void onStop();
    }

    /* renamed from: com.instabug.library.internal.media.AudioPlayer$a */
    class C9827a implements OnPreparedListener {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f26051N;

        /* renamed from: a */
        final /* synthetic */ C9830d f26052a;

        /* renamed from: b */
        final /* synthetic */ AudioPlayer f26053b;

        C9827a(AudioPlayer audioPlayer, C9830d dVar) {
            boolean[] a = m45828a();
            this.f26053b = audioPlayer;
            this.f26052a = dVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45828a() {
            boolean[] zArr = f26051N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(1559876621257468880L, "com/instabug/library/internal/media/AudioPlayer$1", 2);
            f26051N = a;
            return a;
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            boolean[] a = m45828a();
            AudioPlayer.access$000(this.f26053b, this.f26052a);
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.library.internal.media.AudioPlayer$b */
    class C9828b implements OnCompletionListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26054b;

        /* renamed from: a */
        final /* synthetic */ AudioPlayer f26055a;

        C9828b(AudioPlayer audioPlayer) {
            boolean[] a = m45829a();
            this.f26055a = audioPlayer;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45829a() {
            boolean[] zArr = f26054b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(5783993673915398060L, "com/instabug/library/internal/media/AudioPlayer$2", 2);
            f26054b = a;
            return a;
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            boolean[] a = m45829a();
            AudioPlayer.access$100(this.f26055a);
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.library.internal.media.AudioPlayer$c */
    static /* synthetic */ class C9829c {

        /* renamed from: a */
        static final /* synthetic */ int[] f26056a = new int[C9830d.values().length];

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26057b;

        /* JADX WARNING: Can't wrap try/catch for region: R(2:4|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r0[4] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
            r0[6] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r0[2] = true;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0020 */
        static {
            /*
                boolean[] r0 = m45830a()
                com.instabug.library.internal.media.AudioPlayer$d[] r1 = com.instabug.library.internal.media.AudioPlayer.C9830d.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f26056a = r1
                r1 = 0
                r2 = 3
                r3 = 2
                r4 = 1
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0020 }
                int[] r1 = f26056a     // Catch:{ NoSuchFieldError -> 0x0020 }
                com.instabug.library.internal.media.AudioPlayer$d r5 = com.instabug.library.internal.media.AudioPlayer.C9830d.START     // Catch:{ NoSuchFieldError -> 0x0020 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
                r1[r5] = r4     // Catch:{ NoSuchFieldError -> 0x0020 }
                r0[r4] = r4
                goto L_0x0022
            L_0x0020:
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x002f }
            L_0x0022:
                int[] r1 = f26056a     // Catch:{ NoSuchFieldError -> 0x002f }
                com.instabug.library.internal.media.AudioPlayer$d r5 = com.instabug.library.internal.media.AudioPlayer.C9830d.PAUSE     // Catch:{ NoSuchFieldError -> 0x002f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002f }
                r1[r5] = r3     // Catch:{ NoSuchFieldError -> 0x002f }
                r0[r2] = r4
                goto L_0x0032
            L_0x002f:
                r1 = 4
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0032:
                int[] r1 = f26056a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.instabug.library.internal.media.AudioPlayer$d r3 = com.instabug.library.internal.media.AudioPlayer.C9830d.GET_DURATION     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r1[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
                r1 = 5
                r0[r1] = r4
                goto L_0x0043
            L_0x0040:
                r1 = 6
                r0[r1] = r4
            L_0x0043:
                r1 = 7
                r0[r1] = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.media.AudioPlayer.C9829c.<clinit>():void");
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45830a() {
            boolean[] zArr = f26057b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(8301188552987793355L, "com/instabug/library/internal/media/AudioPlayer$3", 8);
            f26057b = a;
            return a;
        }
    }

    /* renamed from: com.instabug.library.internal.media.AudioPlayer$d */
    enum C9830d {
        START,
        PAUSE,
        GET_DURATION;

        static {
            boolean[] d;
            d[3] = true;
        }
    }

    /* renamed from: com.instabug.library.internal.media.AudioPlayer$e */
    public interface C9831e {
        /* renamed from: b */
        void mo34633b(int i);
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-3184004352272479428L, "com/instabug/library/internal/media/AudioPlayer", 56);
        $jacocoData = a;
        return a;
    }

    public AudioPlayer() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
        $jacocoInit[1] = true;
    }

    static /* synthetic */ void access$000(AudioPlayer audioPlayer, C9830d dVar) {
        boolean[] $jacocoInit = $jacocoInit();
        audioPlayer.doAction(dVar);
        $jacocoInit[54] = true;
    }

    static /* synthetic */ void access$100(AudioPlayer audioPlayer) {
        boolean[] $jacocoInit = $jacocoInit();
        audioPlayer.notifyOnStopListeners();
        $jacocoInit[55] = true;
    }

    private void doAction(C9830d dVar) {
        boolean[] $jacocoInit = $jacocoInit();
        int i = C9829c.f26056a[dVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                MediaPlayer mediaPlayer2 = this.mediaPlayer;
                if (mediaPlayer2 == null) {
                    $jacocoInit[45] = true;
                } else if (!mediaPlayer2.isPlaying()) {
                    $jacocoInit[46] = true;
                } else {
                    $jacocoInit[47] = true;
                    this.mediaPlayer.pause();
                    $jacocoInit[48] = true;
                }
            } else if (i != 3) {
                $jacocoInit[41] = true;
            } else {
                this.onGetDurationListener.mo34633b(this.mediaPlayer.getDuration());
                $jacocoInit[49] = true;
            }
        } else if (this.mediaPlayer.isPlaying()) {
            $jacocoInit[42] = true;
        } else {
            $jacocoInit[43] = true;
            this.mediaPlayer.start();
            $jacocoInit[44] = true;
        }
        $jacocoInit[50] = true;
    }

    public static String getFormattedDurationText(long j) {
        boolean[] $jacocoInit = $jacocoInit();
        int i = (int) (j / 3600000);
        int i2 = (int) ((j % 3600000) / 60000);
        int i3 = (int) ((j % 60000) / 1000);
        if (i > 0) {
            $jacocoInit[51] = true;
            String format = String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            $jacocoInit[52] = true;
            return format;
        }
        String format2 = String.format("%02d:%02d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)});
        $jacocoInit[53] = true;
        return format2;
    }

    private void notifyOnStopListeners() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[18] = true;
        for (OnStopListener onStopListener : this.onStopListeners.values()) {
            $jacocoInit[19] = true;
            onStopListener.onStop();
            $jacocoInit[20] = true;
        }
        $jacocoInit[21] = true;
    }

    private void prepare(C9830d dVar) {
        boolean[] $jacocoInit = $jacocoInit();
        try {
            this.mediaPlayer = new MediaPlayer();
            $jacocoInit[2] = true;
            this.mediaPlayer.setDataSource(this.filePath);
            $jacocoInit[3] = true;
            this.mediaPlayer.setOnPreparedListener(new C9827a(this, dVar));
            $jacocoInit[4] = true;
            this.mediaPlayer.prepareAsync();
            if (this.onCompletionListener == null) {
                $jacocoInit[5] = true;
            } else {
                $jacocoInit[6] = true;
                this.mediaPlayer.setOnCompletionListener(this.onCompletionListener);
                $jacocoInit[7] = true;
            }
            $jacocoInit[8] = true;
        } catch (IOException e) {
            $jacocoInit[9] = true;
            InstabugSDKLogger.m46624e(this, "Playing audio file failed", e);
            $jacocoInit[10] = true;
        }
        $jacocoInit[11] = true;
    }

    private void stream(String str, C9830d dVar) {
        boolean[] $jacocoInit = $jacocoInit();
        if (str == null) {
            $jacocoInit[22] = true;
            InstabugSDKLogger.m46623e(this, "Audio file path can not be null");
            $jacocoInit[23] = true;
            return;
        }
        if (str.equals(this.filePath)) {
            $jacocoInit[24] = true;
            doAction(dVar);
            $jacocoInit[25] = true;
        } else {
            this.filePath = str;
            $jacocoInit[26] = true;
            prepare(dVar);
            $jacocoInit[27] = true;
        }
        $jacocoInit[28] = true;
    }

    public void addOnStopListener(OnStopListener onStopListener) {
        boolean[] $jacocoInit = $jacocoInit();
        this.onStopListeners.put(onStopListener.getFilePath(), onStopListener);
        if (this.onCompletionListener != null) {
            $jacocoInit[12] = true;
        } else {
            $jacocoInit[13] = true;
            this.onCompletionListener = new C9828b(this);
            MediaPlayer mediaPlayer2 = this.mediaPlayer;
            if (mediaPlayer2 == null) {
                $jacocoInit[14] = true;
            } else {
                $jacocoInit[15] = true;
                mediaPlayer2.setOnCompletionListener(this.onCompletionListener);
                $jacocoInit[16] = true;
            }
        }
        $jacocoInit[17] = true;
    }

    public void getDurationAsync(String str, C9831e eVar) {
        boolean[] $jacocoInit = $jacocoInit();
        stream(str, C9830d.GET_DURATION);
        this.onGetDurationListener = eVar;
        $jacocoInit[29] = true;
    }

    public void pause() {
        boolean[] $jacocoInit = $jacocoInit();
        notifyOnStopListeners();
        $jacocoInit[32] = true;
        doAction(C9830d.PAUSE);
        $jacocoInit[33] = true;
    }

    public void release() {
        boolean[] $jacocoInit = $jacocoInit();
        this.filePath = null;
        MediaPlayer mediaPlayer2 = this.mediaPlayer;
        if (mediaPlayer2 == null) {
            $jacocoInit[34] = true;
        } else {
            $jacocoInit[35] = true;
            if (!mediaPlayer2.isPlaying()) {
                $jacocoInit[36] = true;
            } else {
                $jacocoInit[37] = true;
                this.mediaPlayer.stop();
                $jacocoInit[38] = true;
            }
            this.mediaPlayer.release();
            this.mediaPlayer = null;
            $jacocoInit[39] = true;
        }
        $jacocoInit[40] = true;
    }

    public void start(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        pause();
        $jacocoInit[30] = true;
        stream(str, C9830d.START);
        $jacocoInit[31] = true;
    }
}
