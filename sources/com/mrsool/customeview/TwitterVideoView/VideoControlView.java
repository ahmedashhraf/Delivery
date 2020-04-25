package com.mrsool.customeview.TwitterVideoView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.mrsool.C10232R;

public class VideoControlView extends FrameLayout {

    /* renamed from: R */
    static final long f29354R = 1000;

    /* renamed from: S */
    static final int f29355S = 150;

    /* renamed from: T */
    private static final int f29356T = 1001;

    /* renamed from: N */
    TextView f29357N;

    /* renamed from: O */
    TextView f29358O;

    /* renamed from: P */
    SeekBar f29359P;
    /* access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})

    /* renamed from: Q */
    public final Handler f29360Q = new C10709a();

    /* renamed from: a */
    C10712d f29361a;

    /* renamed from: b */
    ImageButton f29362b;

    /* renamed from: com.mrsool.customeview.TwitterVideoView.VideoControlView$a */
    class C10709a extends Handler {
        C10709a() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1001) {
                VideoControlView videoControlView = VideoControlView.this;
                if (videoControlView.f29361a != null) {
                    videoControlView.mo38158j();
                    VideoControlView.this.mo38159k();
                    if (VideoControlView.this.mo38152d() && VideoControlView.this.f29361a.mo38170a()) {
                        sendMessageDelayed(obtainMessage(1001), 500);
                    }
                }
            }
        }
    }

    /* renamed from: com.mrsool.customeview.TwitterVideoView.VideoControlView$b */
    class C10710b implements OnClickListener {
        C10710b() {
        }

        public void onClick(View view) {
            if (VideoControlView.this.f29361a.mo38170a()) {
                VideoControlView.this.f29361a.mo38174o();
            } else {
                VideoControlView.this.f29361a.start();
            }
            VideoControlView.this.mo38156h();
        }
    }

    /* renamed from: com.mrsool.customeview.TwitterVideoView.VideoControlView$c */
    class C10711c implements OnSeekBarChangeListener {
        C10711c() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                int duration = (int) (((long) (VideoControlView.this.f29361a.getDuration() * i)) / VideoControlView.f29354R);
                VideoControlView.this.f29361a.mo38169a(duration);
                VideoControlView.this.setCurrentTime(duration);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            VideoControlView.this.f29360Q.removeMessages(1001);
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            VideoControlView.this.f29360Q.sendEmptyMessage(1001);
        }
    }

    /* renamed from: com.mrsool.customeview.TwitterVideoView.VideoControlView$d */
    public interface C10712d {
        /* renamed from: a */
        void mo38169a(int i);

        /* renamed from: a */
        boolean mo38170a();

        int getBufferPercentage();

        int getCurrentPosition();

        int getDuration();

        /* renamed from: o */
        void mo38174o();

        void start();
    }

    public VideoControlView(Context context) {
        super(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo38150b() {
        this.f29360Q.removeMessages(1001);
        C10721a.m49375b(this, 150);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo38151c() {
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C10232R.layout.tw__video_control, this);
        this.f29362b = (ImageButton) findViewById(C10232R.C10236id.tw__state_control);
        this.f29357N = (TextView) findViewById(C10232R.C10236id.tw__current_time);
        this.f29358O = (TextView) findViewById(C10232R.C10236id.tw__duration);
        this.f29359P = (SeekBar) findViewById(C10232R.C10236id.tw__progress);
        this.f29359P.setMax(1000);
        this.f29359P.setOnSeekBarChangeListener(mo38148a());
        this.f29362b.setOnClickListener(new C10710b());
        setDuration(0);
        setCurrentTime(0);
        mo38149a(0, 0, 0);
    }

    /* renamed from: d */
    public boolean mo38152d() {
        return getVisibility() == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo38153e() {
        this.f29362b.setImageResource(C10232R.C10235drawable.tw__video_pause_btn);
        this.f29362b.setContentDescription("Pause");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo38154f() {
        this.f29362b.setImageResource(C10232R.C10235drawable.tw__video_play_btn);
        this.f29362b.setContentDescription("Play");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo38155g() {
        this.f29362b.setImageResource(C10232R.C10235drawable.tw__video_replay_btn);
        this.f29362b.setContentDescription("Replay");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo38156h() {
        this.f29360Q.sendEmptyMessage(1001);
        C10721a.m49374a(this, 150);
    }

    /* renamed from: i */
    public void mo38157i() {
        this.f29360Q.sendEmptyMessage(1001);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo38158j() {
        int duration = this.f29361a.getDuration();
        int currentPosition = this.f29361a.getCurrentPosition();
        int bufferPercentage = this.f29361a.getBufferPercentage();
        setDuration(duration);
        setCurrentTime(currentPosition);
        mo38149a(currentPosition, duration, bufferPercentage);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo38159k() {
        if (this.f29361a.mo38170a()) {
            mo38153e();
        } else if (this.f29361a.getCurrentPosition() > Math.max(this.f29361a.getDuration() - 500, 0)) {
            mo38155g();
        } else {
            mo38154f();
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        mo38151c();
    }

    /* access modifiers changed from: 0000 */
    public void setCurrentTime(int i) {
        this.f29357N.setText(C10723b.m49376a((long) i));
    }

    /* access modifiers changed from: 0000 */
    public void setDuration(int i) {
        this.f29358O.setText(C10723b.m49376a((long) i));
    }

    public void setMediaPlayer(C10712d dVar) {
        this.f29361a = dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public OnSeekBarChangeListener mo38148a() {
        return new C10711c();
    }

    public VideoControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38149a(int i, int i2, int i3) {
        this.f29359P.setProgress((int) (i2 > 0 ? (((long) i) * f29354R) / ((long) i2) : 0));
        this.f29359P.setSecondaryProgress(i3 * 10);
    }

    public VideoControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
