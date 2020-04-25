package com.mrsool.customeview.TwitterVideoView;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View.MeasureSpec;
import com.mrsool.customeview.TwitterVideoView.VideoControlView.C10712d;

public class VideoView extends SurfaceView implements C10712d {

    /* renamed from: p0 */
    private static final int f29366p0 = -1;

    /* renamed from: q0 */
    private static final int f29367q0 = 0;

    /* renamed from: r0 */
    private static final int f29368r0 = 1;

    /* renamed from: s0 */
    private static final int f29369s0 = 2;

    /* renamed from: t0 */
    private static final int f29370t0 = 3;

    /* renamed from: u0 */
    private static final int f29371u0 = 4;

    /* renamed from: v0 */
    private static final int f29372v0 = 5;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public int f29373N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public int f29374O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public SurfaceHolder f29375P;

    /* renamed from: Q */
    public MediaPlayer f29376Q;

    /* renamed from: R */
    private int f29377R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public int f29378S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public int f29379T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public int f29380U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public int f29381V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public VideoControlView f29382W;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f29383a;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public OnCompletionListener f29384a0;

    /* renamed from: b */
    private Uri f29385b;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public OnPreparedListener f29386b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public int f29387c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public OnErrorListener f29388d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public OnInfoListener f29389e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public int f29390f0;

    /* renamed from: g0 */
    private boolean f29391g0;

    /* renamed from: h0 */
    OnVideoSizeChangedListener f29392h0;

    /* renamed from: i0 */
    OnPreparedListener f29393i0;

    /* renamed from: j0 */
    private OnCompletionListener f29394j0;

    /* renamed from: k0 */
    private OnInfoListener f29395k0;

    /* renamed from: l0 */
    private OnErrorListener f29396l0;

    /* renamed from: m0 */
    private OnBufferingUpdateListener f29397m0;

    /* renamed from: n0 */
    private GestureDetector f29398n0;

    /* renamed from: o0 */
    Callback f29399o0;

    /* renamed from: com.mrsool.customeview.TwitterVideoView.VideoView$a */
    class C10713a implements OnVideoSizeChangedListener {
        C10713a() {
        }

        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            VideoView.this.f29378S = mediaPlayer.getVideoWidth();
            VideoView.this.f29379T = mediaPlayer.getVideoHeight();
            if (VideoView.this.f29378S != 0 && VideoView.this.f29379T != 0) {
                VideoView.this.getHolder().setFixedSize(VideoView.this.f29378S, VideoView.this.f29379T);
                VideoView.this.requestLayout();
            }
        }
    }

    /* renamed from: com.mrsool.customeview.TwitterVideoView.VideoView$b */
    class C10714b implements OnPreparedListener {
        C10714b() {
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            VideoView.this.f29373N = 2;
            if (VideoView.this.f29386b0 != null) {
                VideoView.this.f29386b0.onPrepared(VideoView.this.f29376Q);
            }
            if (VideoView.this.f29382W != null) {
                VideoView.this.f29382W.setEnabled(true);
            }
            VideoView.this.f29378S = mediaPlayer.getVideoWidth();
            VideoView.this.f29379T = mediaPlayer.getVideoHeight();
            int k = VideoView.this.f29390f0;
            if (k != 0) {
                VideoView.this.mo38169a(k);
            }
            if (VideoView.this.f29378S != 0 && VideoView.this.f29379T != 0) {
                VideoView.this.getHolder().setFixedSize(VideoView.this.f29378S, VideoView.this.f29379T);
                if (VideoView.this.f29380U != VideoView.this.f29378S || VideoView.this.f29381V != VideoView.this.f29379T) {
                    return;
                }
                if (VideoView.this.f29374O == 3) {
                    VideoView.this.start();
                    if (VideoView.this.f29382W != null) {
                        VideoView.this.f29382W.mo38156h();
                    }
                } else if (VideoView.this.mo38170a()) {
                } else {
                    if ((k != 0 || VideoView.this.getCurrentPosition() > 0) && VideoView.this.f29382W != null) {
                        VideoView.this.f29382W.mo38156h();
                    }
                }
            } else if (VideoView.this.f29374O == 3) {
                VideoView.this.start();
            }
        }
    }

    /* renamed from: com.mrsool.customeview.TwitterVideoView.VideoView$c */
    class C10715c implements OnCompletionListener {
        C10715c() {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            VideoView.this.f29373N = 5;
            VideoView.this.f29374O = 5;
            if (VideoView.this.f29384a0 != null) {
                VideoView.this.f29384a0.onCompletion(VideoView.this.f29376Q);
            }
        }
    }

    /* renamed from: com.mrsool.customeview.TwitterVideoView.VideoView$d */
    class C10716d implements OnInfoListener {
        C10716d() {
        }

        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (VideoView.this.f29389e0 != null) {
                VideoView.this.f29389e0.onInfo(mediaPlayer, i, i2);
            }
            return true;
        }
    }

    /* renamed from: com.mrsool.customeview.TwitterVideoView.VideoView$e */
    class C10717e implements OnErrorListener {
        C10717e() {
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            VideoView.this.f29383a;
            StringBuilder sb = new StringBuilder();
            sb.append("Error: ");
            sb.append(i);
            sb.append(",");
            sb.append(i2);
            sb.toString();
            VideoView.this.f29373N = -1;
            VideoView.this.f29374O = -1;
            if (VideoView.this.f29382W != null) {
                VideoView.this.f29382W.mo38150b();
            }
            if (VideoView.this.f29388d0 == null || VideoView.this.f29388d0.onError(VideoView.this.f29376Q, i, i2)) {
            }
            return true;
        }
    }

    /* renamed from: com.mrsool.customeview.TwitterVideoView.VideoView$f */
    class C10718f implements OnBufferingUpdateListener {
        C10718f() {
        }

        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            VideoView.this.f29387c0 = i;
        }
    }

    /* renamed from: com.mrsool.customeview.TwitterVideoView.VideoView$g */
    class C10719g extends SimpleOnGestureListener {
        C10719g() {
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (VideoView.this.m49354e() && VideoView.this.f29382W != null) {
                VideoView.this.m49359g();
            }
            return false;
        }
    }

    /* renamed from: com.mrsool.customeview.TwitterVideoView.VideoView$h */
    class C10720h implements Callback {
        C10720h() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            VideoView.this.f29380U = i2;
            VideoView.this.f29381V = i3;
            boolean z = true;
            boolean z2 = VideoView.this.f29374O == 3;
            if (!(VideoView.this.f29378S == i2 && VideoView.this.f29379T == i3)) {
                z = false;
            }
            VideoView videoView = VideoView.this;
            if (videoView.f29376Q != null && z2 && z) {
                if (videoView.f29390f0 != 0) {
                    VideoView videoView2 = VideoView.this;
                    videoView2.mo38169a(videoView2.f29390f0);
                }
                VideoView.this.start();
                if (VideoView.this.f29382W != null) {
                    VideoView.this.f29382W.mo38156h();
                }
            }
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            VideoView.this.f29375P = surfaceHolder;
            VideoView.this.m49356f();
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            VideoView.this.f29375P = null;
            if (VideoView.this.f29382W != null) {
                VideoView.this.f29382W.mo38150b();
            }
            VideoView.this.m49343a(true);
        }
    }

    public VideoView(Context context) {
        super(context);
        this.f29383a = "VideoView";
        this.f29373N = 0;
        this.f29374O = 0;
        this.f29375P = null;
        this.f29392h0 = new C10713a();
        this.f29393i0 = new C10714b();
        this.f29394j0 = new C10715c();
        this.f29395k0 = new C10716d();
        this.f29396l0 = new C10717e();
        this.f29397m0 = new C10718f();
        this.f29398n0 = new GestureDetector(getContext(), new C10719g());
        this.f29399o0 = new C10720h();
        m49351d();
    }

    public int getBufferPercentage() {
        if (this.f29376Q != null) {
            return this.f29387c0;
        }
        return 0;
    }

    public int getCurrentPosition() {
        if (m49354e()) {
            return this.f29376Q.getCurrentPosition();
        }
        return 0;
    }

    public int getDuration() {
        if (m49354e()) {
            return this.f29376Q.getDuration();
        }
        return -1;
    }

    public MediaPlayer getMediaPlayer() {
        return this.f29376Q;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z = (i == 4 || i == 24 || i == 25 || i == 82 || i == 5 || i == 6) ? false : true;
        if (m49354e() && z && this.f29382W != null) {
            if (i == 79 || i == 85) {
                if (this.f29376Q.isPlaying()) {
                    mo38174o();
                    this.f29382W.mo38156h();
                } else {
                    start();
                    this.f29382W.mo38150b();
                }
                return true;
            } else if (i == 126) {
                if (!this.f29376Q.isPlaying()) {
                    start();
                    this.f29382W.mo38150b();
                }
                return true;
            } else if (i == 86 || i == 127) {
                if (this.f29376Q.isPlaying()) {
                    mo38174o();
                    this.f29382W.mo38156h();
                }
                return true;
            } else {
                m49359g();
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int defaultSize = SurfaceView.getDefaultSize(this.f29378S, i);
        int defaultSize2 = SurfaceView.getDefaultSize(this.f29379T, i2);
        if (this.f29378S > 0 && this.f29379T > 0) {
            int mode = MeasureSpec.getMode(i);
            i3 = MeasureSpec.getSize(i);
            int mode2 = MeasureSpec.getMode(i2);
            int size = MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                int i5 = this.f29378S;
                int i6 = i5 * size;
                int i7 = this.f29379T;
                if (i6 < i3 * i7) {
                    defaultSize = (i5 * size) / i7;
                    defaultSize2 = size;
                } else if (i5 * size > i3 * i7) {
                    i4 = (i7 * i3) / i5;
                    setMeasuredDimension(i3, i4);
                }
            } else if (mode == 1073741824) {
                int i8 = (this.f29379T * i3) / this.f29378S;
                if (mode2 != Integer.MIN_VALUE || i8 <= size) {
                    i4 = i8;
                    setMeasuredDimension(i3, i4);
                }
            } else if (mode2 == 1073741824) {
                int i9 = (this.f29378S * size) / this.f29379T;
                if (mode != Integer.MIN_VALUE || i9 <= i3) {
                    i3 = i9;
                }
            } else {
                int i10 = this.f29378S;
                int i11 = this.f29379T;
                if (mode2 != Integer.MIN_VALUE || i11 <= size) {
                    i4 = i11;
                } else {
                    i10 = (i10 * size) / i11;
                    i4 = size;
                }
                if (mode != Integer.MIN_VALUE || i10 <= i3) {
                    i3 = i10;
                } else {
                    i4 = (this.f29379T * i3) / this.f29378S;
                }
                setMeasuredDimension(i3, i4);
            }
            i4 = size;
            setMeasuredDimension(i3, i4);
        }
        i3 = defaultSize;
        setMeasuredDimension(i3, i4);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f29398n0.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public void setMediaController(VideoControlView videoControlView) {
        VideoControlView videoControlView2 = this.f29382W;
        if (videoControlView2 != null) {
            videoControlView2.mo38150b();
        }
        this.f29382W = videoControlView;
        m49348c();
    }

    public void setOnCompletionListener(OnCompletionListener onCompletionListener) {
        this.f29384a0 = onCompletionListener;
    }

    public void setOnErrorListener(OnErrorListener onErrorListener) {
        this.f29388d0 = onErrorListener;
    }

    public void setOnInfoListener(OnInfoListener onInfoListener) {
        this.f29389e0 = onInfoListener;
    }

    public void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        this.f29386b0 = onPreparedListener;
    }

    public void setmMediaPlayer(MediaPlayer mediaPlayer) {
        if (mediaPlayer != null) {
            this.f29376Q = mediaPlayer;
        }
        m49356f();
        m49348c();
        requestLayout();
        invalidate();
    }

    public void start() {
        if (m49354e()) {
            this.f29376Q.start();
            this.f29373N = 3;
        }
        this.f29374O = 3;
    }

    /* renamed from: o */
    public void mo38174o() {
        if (m49354e() && this.f29376Q.isPlaying()) {
            this.f29376Q.pause();
            this.f29373N = 4;
        }
        this.f29374O = 4;
    }

    /* renamed from: c */
    private void m49348c() {
        if (this.f29376Q != null) {
            VideoControlView videoControlView = this.f29382W;
            if (videoControlView != null) {
                videoControlView.setMediaPlayer(this);
                this.f29382W.setEnabled(m49354e());
            }
        }
    }

    /* renamed from: d */
    private void m49351d() {
        this.f29378S = 0;
        this.f29379T = 0;
        getHolder().addCallback(this.f29399o0);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setClickable(true);
        requestFocus();
        this.f29373N = 0;
        this.f29374O = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m49354e() {
        if (this.f29376Q != null) {
            int i = this.f29373N;
            if (!(i == -1 || i == 0 || i == 1)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m49356f() {
        if (this.f29385b != null && this.f29375P != null) {
            m49343a(false);
            try {
                this.f29376Q = new MediaPlayer();
                if (this.f29377R != 0) {
                    this.f29376Q.setAudioSessionId(this.f29377R);
                } else {
                    this.f29377R = this.f29376Q.getAudioSessionId();
                }
                this.f29376Q.setOnPreparedListener(this.f29393i0);
                this.f29376Q.setOnVideoSizeChangedListener(this.f29392h0);
                this.f29376Q.setOnCompletionListener(this.f29394j0);
                this.f29376Q.setOnErrorListener(this.f29396l0);
                this.f29376Q.setOnInfoListener(this.f29395k0);
                this.f29376Q.setOnBufferingUpdateListener(this.f29397m0);
                this.f29387c0 = 0;
                this.f29376Q.setLooping(this.f29391g0);
                this.f29376Q.setDataSource(getContext(), this.f29385b);
                this.f29376Q.setDisplay(this.f29375P);
                this.f29376Q.setAudioStreamType(3);
                this.f29376Q.setScreenOnWhilePlaying(true);
                this.f29376Q.prepareAsync();
                this.f29373N = 1;
                m49348c();
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to open content: ");
                sb.append(this.f29385b);
                sb.toString();
                this.f29373N = -1;
                this.f29374O = -1;
                this.f29396l0.onError(this.f29376Q, 1, 0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m49359g() {
        if (this.f29382W.mo38152d()) {
            this.f29382W.mo38150b();
        } else {
            this.f29382W.mo38156h();
        }
    }

    /* renamed from: b */
    public void mo38177b() {
        MediaPlayer mediaPlayer = this.f29376Q;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f29376Q.release();
            this.f29376Q = null;
            this.f29373N = 0;
            this.f29374O = 0;
        }
    }

    /* renamed from: a */
    public void mo38176a(Uri uri, boolean z) {
        this.f29385b = uri;
        this.f29391g0 = z;
        this.f29390f0 = 0;
        m49356f();
        requestLayout();
        invalidate();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m49343a(boolean z) {
        MediaPlayer mediaPlayer = this.f29376Q;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f29376Q.release();
            this.f29376Q = null;
            this.f29373N = 0;
            if (z) {
                this.f29374O = 0;
            }
        }
    }

    public VideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29383a = "VideoView";
        this.f29373N = 0;
        this.f29374O = 0;
        this.f29375P = null;
        this.f29392h0 = new C10713a();
        this.f29393i0 = new C10714b();
        this.f29394j0 = new C10715c();
        this.f29395k0 = new C10716d();
        this.f29396l0 = new C10717e();
        this.f29397m0 = new C10718f();
        this.f29398n0 = new GestureDetector(getContext(), new C10719g());
        this.f29399o0 = new C10720h();
        m49351d();
    }

    /* renamed from: a */
    public void mo38169a(int i) {
        if (m49354e()) {
            this.f29376Q.seekTo(i);
            this.f29390f0 = 0;
            return;
        }
        this.f29390f0 = i;
    }

    /* renamed from: a */
    public boolean mo38170a() {
        return m49354e() && this.f29376Q.isPlaying();
    }
}
