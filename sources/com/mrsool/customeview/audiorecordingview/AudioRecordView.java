package com.mrsool.customeview.audiorecordingview;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.content.C0841b;
import com.mrsool.C10232R;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C11669t;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;

public class AudioRecordView extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: A0 */
    public float f29544A0;
    /* access modifiers changed from: private */

    /* renamed from: B0 */
    public float f29545B0;
    /* access modifiers changed from: private */

    /* renamed from: C0 */
    public float f29546C0;
    /* access modifiers changed from: private */

    /* renamed from: D0 */
    public float f29547D0;

    /* renamed from: E0 */
    private float f29548E0;
    /* access modifiers changed from: private */

    /* renamed from: F0 */
    public float f29549F0 = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: G0 */
    public boolean f29550G0 = false;
    /* access modifiers changed from: private */

    /* renamed from: H0 */
    public C10774o f29551H0 = C10774o.NONE;
    /* access modifiers changed from: private */

    /* renamed from: I0 */
    public C10773n f29552I0;
    /* access modifiers changed from: private */

    /* renamed from: J0 */
    public ImageView f29553J0;

    /* renamed from: K0 */
    private ImageView f29554K0;

    /* renamed from: L0 */
    private ImageView f29555L0;

    /* renamed from: M0 */
    private SeekBar f29556M0;

    /* renamed from: N */
    private View f29557N;
    /* access modifiers changed from: private */

    /* renamed from: N0 */
    public boolean f29558N0 = true;

    /* renamed from: O */
    private View f29559O;

    /* renamed from: O0 */
    private boolean f29560O0 = true;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public View f29561P;

    /* renamed from: P0 */
    private ProgressBar f29562P0;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public View f29563Q;

    /* renamed from: Q0 */
    private int f29564Q0 = 120;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public View f29565R;
    /* access modifiers changed from: private */

    /* renamed from: R0 */
    public int f29566R0;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public View f29567S;
    /* access modifiers changed from: private */

    /* renamed from: S0 */
    public boolean f29568S0;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public View f29569T;

    /* renamed from: T0 */
    private C5887x f29570T0;

    /* renamed from: U */
    private View f29571U;

    /* renamed from: U0 */
    private boolean f29572U0 = true;

    /* renamed from: V */
    private View f29573V;

    /* renamed from: W */
    private View f29574W;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C11669t f29575a;

    /* renamed from: a0 */
    private View f29576a0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public View f29577b;

    /* renamed from: b0 */
    private View f29578b0;

    /* renamed from: c0 */
    private View f29579c0;

    /* renamed from: d0 */
    private EditText f29580d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public TextView f29581e0;

    /* renamed from: f0 */
    private TextView f29582f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public TextView f29583g0;

    /* renamed from: h0 */
    private LinearLayout f29584h0;

    /* renamed from: i0 */
    private LinearLayout f29585i0;

    /* renamed from: j0 */
    private ImageView f29586j0;

    /* renamed from: k0 */
    private ImageView f29587k0;

    /* renamed from: l0 */
    private ImageView f29588l0;

    /* renamed from: m0 */
    private ImageView f29589m0;

    /* renamed from: n0 */
    private ImageView f29590n0;

    /* renamed from: o0 */
    private Animation f29591o0;

    /* renamed from: p0 */
    private Animation f29592p0;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public boolean f29593q0;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public boolean f29594r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public Handler f29595s0;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public int f29596t0;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public TimerTask f29597u0;

    /* renamed from: v0 */
    private Timer f29598v0;
    /* access modifiers changed from: private */

    /* renamed from: w0 */
    public SimpleDateFormat f29599w0 = new SimpleDateFormat("m:ss", Locale.US);
    /* access modifiers changed from: private */

    /* renamed from: x0 */
    public float f29600x0;
    /* access modifiers changed from: private */

    /* renamed from: y0 */
    public float f29601y0;
    /* access modifiers changed from: private */

    /* renamed from: z0 */
    public float f29602z0;

    /* renamed from: com.mrsool.customeview.audiorecordingview.AudioRecordView$a */
    class C10753a implements AnimatorListener {

        /* renamed from: com.mrsool.customeview.audiorecordingview.AudioRecordView$a$a */
        class C10754a implements AnimatorListener {
            C10754a() {
            }

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                AudioRecordView.this.f29563Q.setVisibility(0);
                AudioRecordView.this.f29565R.setVisibility(0);
            }
        }

        /* renamed from: com.mrsool.customeview.audiorecordingview.AudioRecordView$a$b */
        class C10755b implements AnimatorListener {

            /* renamed from: com.mrsool.customeview.audiorecordingview.AudioRecordView$a$b$a */
            class C10756a implements AnimatorListener {
                C10756a() {
                }

                public void onAnimationCancel(Animator animator) {
                }

                public void onAnimationEnd(Animator animator) {
                }

                public void onAnimationRepeat(Animator animator) {
                }

                public void onAnimationStart(Animator animator) {
                }
            }

            C10755b() {
            }

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                AudioRecordView.this.f29561P.setVisibility(4);
                AudioRecordView.this.f29561P.setRotation(0.0f);
                AudioRecordView.this.f29565R.animate().rotation(0.0f).setDuration(150).setStartDelay(50).start();
                AudioRecordView.this.f29563Q.animate().translationX((-AudioRecordView.this.f29549F0) * 40.0f).setDuration(200).setStartDelay(250).setInterpolator(new DecelerateInterpolator()).start();
                AudioRecordView.this.f29565R.animate().translationX((-AudioRecordView.this.f29549F0) * 40.0f).setDuration(200).setStartDelay(250).setInterpolator(new DecelerateInterpolator()).setListener(new C10756a()).start();
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }
        }

        C10753a() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            AudioRecordView.this.f29561P.animate().translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(350).setInterpolator(new LinearInterpolator()).setListener(new C10755b()).start();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            AudioRecordView.this.f29563Q.setTranslationX((-AudioRecordView.this.f29549F0) * 40.0f);
            AudioRecordView.this.f29565R.setTranslationX((-AudioRecordView.this.f29549F0) * 40.0f);
            AudioRecordView.this.f29565R.animate().translationX(0.0f).rotation(-120.0f).setDuration(350).setInterpolator(new DecelerateInterpolator()).start();
            AudioRecordView.this.f29563Q.animate().translationX(0.0f).setDuration(350).setInterpolator(new DecelerateInterpolator()).setListener(new C10754a()).start();
        }
    }

    /* renamed from: com.mrsool.customeview.audiorecordingview.AudioRecordView$b */
    class C10757b implements Runnable {
        C10757b() {
        }

        public void run() {
            AudioRecordView.this.f29593q0 = false;
            AudioRecordView.this.f29577b.setEnabled(true);
            AudioRecordView.this.mo38321a();
        }
    }

    /* renamed from: com.mrsool.customeview.audiorecordingview.AudioRecordView$c */
    class C10758c implements AnimatorListener {

        /* renamed from: com.mrsool.customeview.audiorecordingview.AudioRecordView$c$a */
        class C10759a implements AnimatorListener {
            C10759a() {
            }

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                AudioRecordView.this.f29563Q.setVisibility(0);
                AudioRecordView.this.f29565R.setVisibility(0);
            }
        }

        /* renamed from: com.mrsool.customeview.audiorecordingview.AudioRecordView$c$b */
        class C10760b implements AnimatorListener {

            /* renamed from: com.mrsool.customeview.audiorecordingview.AudioRecordView$c$b$a */
            class C10761a implements AnimatorListener {
                C10761a() {
                }

                public void onAnimationCancel(Animator animator) {
                }

                public void onAnimationEnd(Animator animator) {
                }

                public void onAnimationRepeat(Animator animator) {
                }

                public void onAnimationStart(Animator animator) {
                }
            }

            C10760b() {
            }

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                AudioRecordView.this.f29561P.setVisibility(4);
                AudioRecordView.this.f29561P.setRotation(0.0f);
                AudioRecordView.this.f29565R.animate().rotation(0.0f).setDuration(150).setStartDelay(50).start();
                AudioRecordView.this.f29563Q.animate().translationX(AudioRecordView.this.f29549F0 * 40.0f).setDuration(200).setStartDelay(250).setInterpolator(new DecelerateInterpolator()).start();
                AudioRecordView.this.f29565R.animate().translationX(AudioRecordView.this.f29549F0 * 40.0f).setDuration(200).setStartDelay(250).setInterpolator(new DecelerateInterpolator()).setListener(new C10761a()).start();
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }
        }

        C10758c() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            AudioRecordView.this.f29561P.animate().translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(350).setInterpolator(new LinearInterpolator()).setListener(new C10760b()).start();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            AudioRecordView.this.f29563Q.setTranslationX(AudioRecordView.this.f29549F0 * 40.0f);
            AudioRecordView.this.f29565R.setTranslationX(AudioRecordView.this.f29549F0 * 40.0f);
            AudioRecordView.this.f29565R.animate().translationX(0.0f).rotation(120.0f).setDuration(350).setInterpolator(new DecelerateInterpolator()).start();
            AudioRecordView.this.f29563Q.animate().translationX(0.0f).setDuration(350).setInterpolator(new DecelerateInterpolator()).setListener(new C10759a()).start();
        }
    }

    /* renamed from: com.mrsool.customeview.audiorecordingview.AudioRecordView$d */
    class C10762d implements OnClickListener {
        C10762d() {
        }

        public void onClick(View view) {
            if (Integer.parseInt(AudioRecordView.this.f29553J0.getTag().toString()) == 0) {
                AudioRecordView.this.f29553J0.setTag(Integer.valueOf(1));
                AudioRecordView.this.f29553J0.setImageResource(C10232R.C10235drawable.img_pasue_new);
                if (AudioRecordView.this.f29552I0 != null) {
                    AudioRecordView.this.f29552I0.mo37824a(true);
                    return;
                }
                return;
            }
            AudioRecordView.this.f29553J0.setTag(Integer.valueOf(0));
            AudioRecordView.this.f29553J0.setImageResource(C10232R.C10235drawable.img_play_new);
            if (AudioRecordView.this.f29552I0 != null) {
                AudioRecordView.this.f29552I0.mo37824a(false);
            }
        }
    }

    /* renamed from: com.mrsool.customeview.audiorecordingview.AudioRecordView$e */
    class C10763e implements OnClickListener {
        C10763e() {
        }

        public void onClick(View view) {
            AudioRecordView.this.f29581e0.setVisibility(8);
            AudioRecordView.this.f29561P.setVisibility(4);
            AudioRecordView.this.f29567S.setVisibility(8);
            AudioRecordView.this.f29583g0.setVisibility(8);
            AudioRecordView.this.f29597u0.cancel();
            AudioRecordView.this.f29561P.setVisibility(0);
            AudioRecordView.this.f29561P.setRotation(0.0f);
            AudioRecordView.this.f29593q0 = false;
            AudioRecordView.this.f29577b.setEnabled(true);
            AudioRecordView.this.mo38321a();
            AudioRecordView.this.f29550G0 = false;
            if (AudioRecordView.this.f29552I0 != null) {
                AudioRecordView.this.f29552I0.mo37827d();
            }
        }
    }

    /* renamed from: com.mrsool.customeview.audiorecordingview.AudioRecordView$f */
    class C10764f implements OnClickListener {
        C10764f() {
        }

        public void onClick(View view) {
            if (AudioRecordView.this.f29552I0 != null) {
                AudioRecordView.this.f29552I0.mo37825b();
            }
        }
    }

    /* renamed from: com.mrsool.customeview.audiorecordingview.AudioRecordView$g */
    class C10765g implements TextWatcher {
        C10765g() {
        }

        public void afterTextChanged(Editable editable) {
            if (editable.toString().trim().isEmpty()) {
                AudioRecordView.this.f29577b.setVisibility(0);
                AudioRecordView.this.m49482e(true);
                AudioRecordView.this.m49497k();
                return;
            }
            if (AudioRecordView.this.f29558N0 && AudioRecordView.this.f29569T.getVisibility() != 0 && !AudioRecordView.this.f29550G0) {
                AudioRecordView.this.f29577b.setVisibility(8);
                AudioRecordView.this.f29577b.animate().scaleX(0.0f).scaleY(0.0f).setDuration(1).setInterpolator(new LinearInterpolator()).start();
            }
            AudioRecordView.this.m49482e(false);
            AudioRecordView.this.m49497k();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.mrsool.customeview.audiorecordingview.AudioRecordView$h */
    class C10766h implements OnTouchListener {
        C10766h() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            float f;
            float f2;
            if (AudioRecordView.this.f29593q0) {
                return true;
            }
            if (motionEvent.getAction() != 0) {
                boolean z = false;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && AudioRecordView.this.f29575a.mo40037a(C11644i.f33373o)) {
                        AudioRecordView.this.mo38330d(false);
                        AudioRecordView.this.m49467a(C10772m.RELEASED);
                    }
                } else if (motionEvent.getAction() == 2) {
                    if (AudioRecordView.this.f29594r0) {
                        return true;
                    }
                    C10774o oVar = C10774o.NONE;
                    if (AudioRecordView.this.f29568S0) {
                        f2 = motionEvent.getRawX();
                        f = AudioRecordView.this.f29602z0;
                    } else {
                        f2 = AudioRecordView.this.f29602z0;
                        f = motionEvent.getRawX();
                    }
                    float abs = Math.abs(f2 - f);
                    float abs2 = Math.abs(AudioRecordView.this.f29544A0 - motionEvent.getRawY());
                    if (!AudioRecordView.this.f29568S0 ? AudioRecordView.this.f29600x0 < AudioRecordView.this.f29602z0 : AudioRecordView.this.f29600x0 > AudioRecordView.this.f29602z0) {
                        z = true;
                    }
                    if (abs <= AudioRecordView.this.f29545B0 || abs <= AudioRecordView.this.f29545B0 || !z || AudioRecordView.this.f29601y0 >= AudioRecordView.this.f29544A0) {
                        if (abs > abs2 && abs > AudioRecordView.this.f29545B0 && z) {
                            oVar = C10774o.CANCELING;
                        } else if (abs2 > abs && abs2 > AudioRecordView.this.f29545B0 && AudioRecordView.this.f29601y0 < AudioRecordView.this.f29544A0) {
                            oVar = C10774o.LOCKING;
                        }
                    } else if (abs > abs2 && z) {
                        oVar = C10774o.CANCELING;
                    } else if (abs2 > abs && AudioRecordView.this.f29601y0 < AudioRecordView.this.f29544A0) {
                        oVar = C10774o.LOCKING;
                    }
                    if (oVar == C10774o.CANCELING) {
                        if (AudioRecordView.this.f29551H0 == C10774o.NONE || motionEvent.getRawY() + ((float) (AudioRecordView.this.f29577b.getWidth() / 2)) > AudioRecordView.this.f29544A0) {
                            AudioRecordView.this.f29551H0 = C10774o.CANCELING;
                        }
                        if (AudioRecordView.this.f29551H0 == C10774o.CANCELING) {
                            AudioRecordView audioRecordView = AudioRecordView.this;
                            audioRecordView.m49465a(-(audioRecordView.f29602z0 - motionEvent.getRawX()));
                        }
                    } else if (oVar == C10774o.LOCKING) {
                        if (AudioRecordView.this.f29551H0 == C10774o.NONE || motionEvent.getRawX() + ((float) (AudioRecordView.this.f29577b.getWidth() / 2)) > AudioRecordView.this.f29602z0) {
                            AudioRecordView.this.f29551H0 = C10774o.LOCKING;
                        }
                        if (AudioRecordView.this.f29551H0 == C10774o.LOCKING) {
                            AudioRecordView audioRecordView2 = AudioRecordView.this;
                            audioRecordView2.m49472b(-(audioRecordView2.f29544A0 - motionEvent.getRawY()));
                        }
                    }
                    AudioRecordView.this.f29600x0 = motionEvent.getRawX();
                    AudioRecordView.this.f29601y0 = motionEvent.getRawY();
                }
            } else if (AudioRecordView.this.f29575a.mo40037a(C11644i.f33373o)) {
                AudioRecordView.this.mo38330d(true);
                if (AudioRecordView.this.f29568S0) {
                    AudioRecordView audioRecordView3 = AudioRecordView.this;
                    audioRecordView3.f29546C0 = (((float) audioRecordView3.f29566R0) - AudioRecordView.this.f29577b.getX()) / 3.0f;
                    AudioRecordView audioRecordView4 = AudioRecordView.this;
                    double h = (double) (((float) audioRecordView4.f29566R0) - AudioRecordView.this.f29577b.getX());
                    Double.isNaN(h);
                    audioRecordView4.f29547D0 = (float) (h / 2.5d);
                } else {
                    AudioRecordView audioRecordView5 = AudioRecordView.this;
                    double x = (double) audioRecordView5.f29577b.getX();
                    Double.isNaN(x);
                    audioRecordView5.f29546C0 = (float) (x / 2.8d);
                    AudioRecordView audioRecordView6 = AudioRecordView.this;
                    double x2 = (double) audioRecordView6.f29577b.getX();
                    Double.isNaN(x2);
                    audioRecordView6.f29547D0 = (float) (x2 / 2.5d);
                }
                if (AudioRecordView.this.f29602z0 == 0.0f) {
                    AudioRecordView.this.f29602z0 = motionEvent.getRawX();
                }
                if (AudioRecordView.this.f29544A0 == 0.0f) {
                    AudioRecordView.this.f29544A0 = motionEvent.getRawY();
                }
                AudioRecordView.this.m49498l();
            } else if (AudioRecordView.this.f29552I0 != null) {
                AudioRecordView.this.f29552I0.mo37829f();
            }
            view.onTouchEvent(motionEvent);
            return true;
        }
    }

    /* renamed from: com.mrsool.customeview.audiorecordingview.AudioRecordView$i */
    class C10767i implements OnClickListener {
        C10767i() {
        }

        public void onClick(View view) {
            AudioRecordView.this.f29550G0 = false;
            AudioRecordView.this.m49467a(C10772m.LOCK_DONE);
        }
    }

    /* renamed from: com.mrsool.customeview.audiorecordingview.AudioRecordView$j */
    class C10768j implements OnClickListener {
        C10768j() {
        }

        public void onClick(View view) {
            AudioRecordView.this.mo38321a();
            if (AudioRecordView.this.f29552I0 != null) {
                AudioRecordView.this.f29552I0.mo37827d();
            }
            AudioRecordView.this.m49497k();
        }
    }

    /* renamed from: com.mrsool.customeview.audiorecordingview.AudioRecordView$k */
    class C10769k extends TimerTask {

        /* renamed from: com.mrsool.customeview.audiorecordingview.AudioRecordView$k$a */
        class C10770a implements Runnable {
            C10770a() {
            }

            public void run() {
                AudioRecordView.this.f29581e0.setText(AudioRecordView.this.f29599w0.format(new Date((long) (AudioRecordView.this.f29596t0 * 1000))));
                if (AudioRecordView.this.f29596t0 == AudioRecordView.this.getMaxRecordingTime()) {
                    AudioRecordView.this.f29550G0 = false;
                    AudioRecordView.this.m49467a(C10772m.LOCK_DONE);
                    AudioRecordView.this.f29596t0 = 0;
                    return;
                }
                AudioRecordView.this.f29596t0 = AudioRecordView.this.f29596t0 + 1;
            }
        }

        C10769k() {
        }

        public void run() {
            AudioRecordView.this.f29595s0.post(new C10770a());
        }
    }

    /* renamed from: com.mrsool.customeview.audiorecordingview.AudioRecordView$l */
    class C10771l implements Runnable {
        C10771l() {
        }

        public void run() {
            AudioRecordView.this.f29593q0 = false;
            AudioRecordView.this.f29577b.setEnabled(true);
            AudioRecordView.this.mo38321a();
        }
    }

    /* renamed from: com.mrsool.customeview.audiorecordingview.AudioRecordView$m */
    public enum C10772m {
        CANCELED,
        LOCKED,
        LOCK_DONE,
        RELEASED
    }

    /* renamed from: com.mrsool.customeview.audiorecordingview.AudioRecordView$n */
    public interface C10773n {
        /* renamed from: a */
        void mo37823a();

        /* renamed from: a */
        void mo37824a(boolean z);

        /* renamed from: b */
        void mo37825b();

        /* renamed from: c */
        void mo37826c();

        /* renamed from: d */
        void mo37827d();

        /* renamed from: e */
        void mo37828e();

        /* renamed from: f */
        void mo37829f();
    }

    /* renamed from: com.mrsool.customeview.audiorecordingview.AudioRecordView$o */
    public enum C10774o {
        CANCELING,
        LOCKING,
        NONE
    }

    public AudioRecordView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m49466a(context);
    }

    public View getAttachmentView() {
        return this.f29574W;
    }

    public View getFlAudio() {
        return this.f29577b;
    }

    public int getMaxRecordingTime() {
        return this.f29564Q0 * 60;
    }

    public EditText getMessageView() {
        return this.f29580d0;
    }

    public View getMoreActionView() {
        return this.f29590n0;
    }

    public ImageView getPlayPauseImageView() {
        return this.f29553J0;
    }

    public C10773n getRecordingListener() {
        return this.f29552I0;
    }

    public SeekBar getSeekBar() {
        return this.f29556M0;
    }

    public View getSendView() {
        return this.f29569T;
    }

    public View getSendViewAudio() {
        return this.f29576a0;
    }

    public TextView getTimerTextView() {
        return this.f29582f0;
    }

    public void setDeviceWidth(int i) {
        this.f29566R0 = i;
    }

    public void setFlAudio(View view) {
        this.f29577b = view;
    }

    public void setImageRtl(ImageView imageView) {
        if (imageView != null) {
            imageView.setScaleX(-1.0f);
        }
    }

    public void setMaxRecordingTime(int i) {
        this.f29564Q0 = i;
    }

    public void setRecordingListener(C10773n nVar) {
        this.f29552I0 = nVar;
    }

    /* renamed from: i */
    private void m49493i() {
        this.f29569T.animate().scaleX(0.0f).scaleY(0.0f).setDuration(100).setInterpolator(new LinearInterpolator()).start();
        this.f29580d0.addTextChangedListener(new C10765g());
        this.f29577b.setOnTouchListener(new C10766h());
        this.f29567S.setOnClickListener(new C10767i());
        this.f29554K0.setOnClickListener(new C10768j());
    }

    /* renamed from: j */
    private void m49495j() {
        float f = -1.0f;
        if (!this.f29560O0) {
            this.f29577b.setVisibility(8);
            this.f29569T.setVisibility(0);
            ViewPropertyAnimator animate = this.f29569T.animate();
            if (!this.f29570T0.mo23496R()) {
                f = 1.0f;
            }
            animate.scaleX(f).scaleY(1.0f).setDuration(10).setInterpolator(new LinearInterpolator()).start();
            return;
        }
        if (this.f29580d0.getText().length() == 0) {
            this.f29577b.setVisibility(0);
        }
        ViewPropertyAnimator animate2 = this.f29569T.animate();
        if (!this.f29570T0.mo23496R()) {
            f = 1.0f;
        }
        animate2.scaleX(f).scaleY(1.0f).setDuration(10).setInterpolator(new LinearInterpolator()).start();
        this.f29577b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(10).setInterpolator(new LinearInterpolator()).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m49497k() {
        this.f29562P0.setVisibility(8);
        float f = -1.0f;
        if (this.f29560O0) {
            if (this.f29567S.getVisibility() != 0) {
                this.f29577b.setVisibility(0);
            } else {
                this.f29577b.setVisibility(8);
            }
            if (this.f29554K0.getVisibility() == 0 || !this.f29580d0.getText().toString().trim().equals("")) {
                this.f29577b.setVisibility(8);
                this.f29569T.setVisibility(0);
                this.f29577b.animate().scaleX(this.f29570T0.mo23496R() ? -1.0f : 1.0f).scaleY(1.0f).setDuration(100).setInterpolator(new LinearInterpolator()).start();
                ViewPropertyAnimator animate = this.f29569T.animate();
                if (!this.f29570T0.mo23496R()) {
                    f = 1.0f;
                }
                animate.scaleX(f).scaleY(1.0f).setDuration(100).setInterpolator(new LinearInterpolator()).start();
                return;
            }
            return;
        }
        this.f29577b.setVisibility(8);
        this.f29569T.setVisibility(0);
        this.f29569T.animate().scaleX(this.f29570T0.mo23496R() ? -1.0f : 1.0f).scaleY(1.0f).setDuration(100).setInterpolator(new LinearInterpolator()).start();
        ViewPropertyAnimator animate2 = this.f29577b.animate();
        if (!this.f29570T0.mo23496R()) {
            f = 1.0f;
        }
        animate2.scaleX(f).scaleY(1.0f).setDuration(100).setInterpolator(new LinearInterpolator()).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m49498l() {
        C10773n nVar = this.f29552I0;
        if (nVar != null) {
            nVar.mo37823a();
        }
        this.f29584h0.setVisibility(8);
        this.f29554K0.setVisibility(8);
        this.f29585i0.setVisibility(0);
        this.f29594r0 = false;
        this.f29573V.setVisibility(8);
        this.f29574W.setVisibility(8);
        this.f29577b.animate().scaleXBy(1.0f).scaleYBy(1.0f).setDuration(200).setInterpolator(new OvershootInterpolator()).start();
        this.f29581e0.setVisibility(0);
        this.f29579c0.setVisibility(0);
        this.f29578b0.setVisibility(0);
        this.f29561P.setVisibility(0);
        this.f29557N.clearAnimation();
        this.f29559O.clearAnimation();
        this.f29557N.startAnimation(this.f29592p0);
        this.f29559O.startAnimation(this.f29591o0);
        if (this.f29598v0 == null) {
            this.f29598v0 = new Timer();
            this.f29599w0.setTimeZone(TimeZone.getTimeZone("UTC"));
        }
        this.f29597u0 = new C10769k();
        this.f29596t0 = 0;
        this.f29598v0.schedule(this.f29597u0, 0, 1000);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m49482e(boolean z) {
        LayoutParams layoutParams = (LayoutParams) this.f29573V.getLayoutParams();
        if (z) {
            this.f29574W.setVisibility(0);
            layoutParams.setMarginEnd((int) getResources().getDimension(C10232R.dimen.chat_edit_text_margin_right_1));
            this.f29589m0.setImageResource(C10232R.C10235drawable.ic_chat_send);
        } else {
            this.f29574W.setVisibility(8);
            layoutParams.setMarginEnd((int) getResources().getDimension(C10232R.dimen.dp_8));
            this.f29589m0.setImageResource(C10232R.C10235drawable.ic_chat_send_act);
        }
        this.f29573V.setLayoutParams(layoutParams);
    }

    /* renamed from: f */
    private void m49485f() {
        this.f29561P.setVisibility(0);
        this.f29561P.setRotation(0.0f);
        this.f29593q0 = true;
        this.f29577b.setEnabled(false);
        this.f29595s0.postDelayed(new C10771l(), 1250);
        this.f29561P.animate().translationY((-this.f29549F0) * 150.0f).rotation(180.0f).scaleXBy(0.6f).scaleYBy(0.6f).setDuration(500).setInterpolator(new DecelerateInterpolator()).setListener(new C10753a()).start();
    }

    /* renamed from: g */
    private void m49486g() {
        this.f29561P.setVisibility(0);
        this.f29561P.setRotation(0.0f);
        this.f29593q0 = true;
        this.f29577b.setEnabled(false);
        this.f29595s0.postDelayed(new C10757b(), 1250);
        this.f29561P.animate().translationY((-this.f29549F0) * 150.0f).rotation(180.0f).scaleXBy(0.6f).scaleYBy(0.6f).setDuration(500).setInterpolator(new DecelerateInterpolator()).setListener(new C10758c()).start();
    }

    /* renamed from: h */
    private void m49490h() {
        this.f29594r0 = true;
        m49467a(C10772m.LOCKED);
        this.f29550G0 = true;
    }

    /* renamed from: d */
    public void mo38329d() {
        this.f29550G0 = false;
        m49467a(C10772m.LOCK_DONE);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m49472b(float f) {
        if (f < (-this.f29547D0)) {
            m49490h();
            this.f29577b.setTranslationY(0.0f);
            return;
        }
        if (this.f29579c0.getVisibility() != 0) {
            this.f29579c0.setVisibility(0);
        }
        this.f29577b.setTranslationY(f);
        this.f29579c0.setTranslationY(f / 2.0f);
        this.f29577b.setTranslationX(0.0f);
    }

    /* renamed from: c */
    public void mo38327c(boolean z) {
        this.f29558N0 = z;
        m49497k();
    }

    /* renamed from: d */
    public void mo38330d(boolean z) {
        this.f29586j0.setImageResource(z ? C10232R.C10235drawable.ic_mic_white : C10232R.C10235drawable.ic_chat_audio);
        this.f29588l0.setVisibility(z ? 0 : 8);
    }

    /* renamed from: c */
    public boolean mo38328c() {
        return this.f29585i0.getVisibility() == 0;
    }

    /* renamed from: a */
    private void m49466a(Context context) {
        View inflate = FrameLayout.inflate(getContext(), C10232R.layout.recording_layout_new, null);
        addView(inflate);
        this.f29570T0 = new C5887x(context);
        this.f29568S0 = this.f29570T0.mo23496R();
        this.f29574W = inflate.findViewById(C10232R.C10236id.imageViewAttachment);
        this.f29580d0 = (EditText) inflate.findViewById(C10232R.C10236id.editTextMessage);
        this.f29587k0 = (ImageView) inflate.findViewById(C10232R.C10236id.ivSendAudio);
        this.f29586j0 = (ImageView) inflate.findViewById(C10232R.C10236id.imageAudio);
        this.f29589m0 = (ImageView) inflate.findViewById(C10232R.C10236id.ivSend);
        this.f29590n0 = (ImageView) inflate.findViewById(C10232R.C10236id.ivActionMore);
        this.f29562P0 = (ProgressBar) inflate.findViewById(C10232R.C10236id.progressBar);
        this.f29553J0 = (ImageView) inflate.findViewById(C10232R.C10236id.ivPlayPause);
        this.f29582f0 = (TextView) inflate.findViewById(C10232R.C10236id.tvTime);
        this.f29583g0 = (TextView) inflate.findViewById(C10232R.C10236id.tvCancel);
        this.f29556M0 = (SeekBar) inflate.findViewById(C10232R.C10236id.sbAudioPlay);
        this.f29584h0 = (LinearLayout) inflate.findViewById(C10232R.C10236id.llPlayRecord);
        this.f29576a0 = inflate.findViewById(C10232R.C10236id.flSendAudio);
        this.f29585i0 = (LinearLayout) inflate.findViewById(C10232R.C10236id.llrecording);
        this.f29554K0 = (ImageView) inflate.findViewById(C10232R.C10236id.ivDelete);
        this.f29555L0 = (ImageView) inflate.findViewById(C10232R.C10236id.ivSlideArrow);
        this.f29577b = inflate.findViewById(C10232R.C10236id.flAudio);
        this.f29567S = inflate.findViewById(C10232R.C10236id.flStop);
        this.f29569T = inflate.findViewById(C10232R.C10236id.flSend);
        this.f29559O = inflate.findViewById(C10232R.C10236id.imageViewLock);
        this.f29557N = inflate.findViewById(C10232R.C10236id.imageViewLockArrow);
        this.f29571U = inflate.findViewById(C10232R.C10236id.layoutDustin);
        this.f29573V = inflate.findViewById(C10232R.C10236id.llMessage);
        this.f29581e0 = (TextView) inflate.findViewById(C10232R.C10236id.textViewTime);
        this.f29578b0 = inflate.findViewById(C10232R.C10236id.layoutSlideCancel);
        this.f29579c0 = inflate.findViewById(C10232R.C10236id.layoutLock);
        this.f29561P = inflate.findViewById(C10232R.C10236id.imageViewMic);
        this.f29563Q = inflate.findViewById(C10232R.C10236id.dustin);
        this.f29565R = inflate.findViewById(C10232R.C10236id.dustin_cover);
        this.f29588l0 = (ImageView) inflate.findViewById(C10232R.C10236id.ivMicBg);
        this.f29595s0 = new Handler(Looper.getMainLooper());
        this.f29549F0 = TypedValue.applyDimension(1, 1.0f, getContext().getResources().getDisplayMetrics());
        this.f29591o0 = AnimationUtils.loadAnimation(getContext(), C10232R.anim.jump);
        this.f29592p0 = AnimationUtils.loadAnimation(getContext(), C10232R.anim.jump_fast);
        m49493i();
        this.f29553J0.setOnClickListener(new C10762d());
        this.f29583g0.setOnClickListener(new C10763e());
        this.f29574W.setOnClickListener(new C10764f());
        if (this.f29570T0.mo23496R()) {
            this.f29555L0.setRotation(-270.0f);
            setImageRtl(this.f29589m0);
        }
    }

    public AudioRecordView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49466a(context);
    }

    /* renamed from: e */
    private void m49481e() {
        this.f29594r0 = true;
        m49467a(C10772m.CANCELED);
    }

    /* renamed from: b */
    public boolean mo38326b() {
        return this.f29554K0.getVisibility() == 0;
    }

    /* renamed from: b */
    public void mo38325b(boolean z) {
        this.f29577b.setEnabled(z);
        this.f29569T.setEnabled(z);
    }

    public AudioRecordView(Context context) {
        super(context);
        m49466a(context);
    }

    /* renamed from: a */
    public void mo38324a(boolean z) {
        this.f29560O0 = z;
        m49495j();
    }

    /* renamed from: a */
    public void mo38322a(Activity activity) {
        this.f29575a = new C11669t(activity);
    }

    /* renamed from: a */
    public void mo38321a() {
        this.f29574W.setVisibility(0);
        this.f29573V.setVisibility(0);
        this.f29585i0.setVisibility(8);
        this.f29584h0.setVisibility(8);
        this.f29554K0.setVisibility(8);
        this.f29581e0.setVisibility(8);
        this.f29561P.setVisibility(4);
        this.f29567S.setVisibility(8);
        this.f29583g0.setVisibility(8);
        this.f29577b.setVisibility(0);
        this.f29569T.setVisibility(0);
        mo38330d(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m49465a(float f) {
        if (!this.f29568S0 ? f >= (-this.f29546C0) : f <= this.f29546C0) {
            this.f29577b.setTranslationX(f);
            this.f29578b0.setTranslationX(f);
            this.f29579c0.setTranslationY(0.0f);
            this.f29577b.setTranslationY(0.0f);
            if (Math.abs(f) < ((float) (this.f29561P.getWidth() / 2))) {
                if (this.f29579c0.getVisibility() != 0) {
                    this.f29579c0.setVisibility(0);
                }
            } else if (this.f29579c0.getVisibility() != 8) {
                this.f29579c0.setVisibility(8);
            }
            return;
        }
        m49481e();
        this.f29577b.setTranslationX(0.0f);
        this.f29578b0.setTranslationX(0.0f);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m49467a(C10772m mVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Recording... stopRecording call recordingBehaviour = ");
        sb.append(mVar.toString());
        C5880q.m25754e(sb.toString());
        this.f29594r0 = true;
        this.f29602z0 = 0.0f;
        this.f29544A0 = 0.0f;
        this.f29600x0 = 0.0f;
        this.f29601y0 = 0.0f;
        this.f29551H0 = C10774o.NONE;
        this.f29577b.animate().scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setDuration(100).setInterpolator(new LinearInterpolator()).start();
        this.f29578b0.setTranslationX(0.0f);
        this.f29578b0.setVisibility(8);
        this.f29579c0.setVisibility(8);
        this.f29579c0.setTranslationY(0.0f);
        this.f29557N.clearAnimation();
        this.f29559O.clearAnimation();
        if (!this.f29550G0) {
            if (mVar == C10772m.LOCKED) {
                this.f29567S.setVisibility(0);
                this.f29583g0.setVisibility(0);
                this.f29577b.setVisibility(8);
                C10773n nVar = this.f29552I0;
                if (nVar != null) {
                    nVar.mo37826c();
                }
            } else if (mVar == C10772m.CANCELED) {
                this.f29581e0.setVisibility(8);
                this.f29561P.setVisibility(4);
                this.f29567S.setVisibility(8);
                this.f29583g0.setVisibility(8);
                TimerTask timerTask = this.f29597u0;
                if (timerTask != null) {
                    timerTask.cancel();
                }
                if (this.f29568S0) {
                    m49486g();
                } else {
                    m49485f();
                }
                C10773n nVar2 = this.f29552I0;
                if (nVar2 != null) {
                    nVar2.mo37827d();
                }
            } else if (mVar == C10772m.RELEASED || mVar == C10772m.LOCK_DONE) {
                this.f29581e0.setVisibility(8);
                this.f29561P.setVisibility(4);
                this.f29567S.setVisibility(8);
                this.f29583g0.setVisibility(8);
                this.f29597u0.cancel();
                if (this.f29596t0 <= 1) {
                    mo38321a();
                    C10773n nVar3 = this.f29552I0;
                    if (nVar3 != null) {
                        nVar3.mo37827d();
                    }
                } else {
                    this.f29584h0.setVisibility(0);
                    this.f29573V.setVisibility(8);
                    this.f29574W.setVisibility(8);
                    this.f29585i0.setVisibility(8);
                    this.f29554K0.setVisibility(0);
                    if (this.f29558N0) {
                        this.f29569T.setVisibility(0);
                        this.f29569T.animate().scaleX(this.f29570T0.mo23496R() ? -1.0f : 1.0f).scaleY(1.0f).setDuration(100).setInterpolator(new LinearInterpolator()).start();
                        this.f29577b.setVisibility(8);
                        this.f29577b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).setInterpolator(new LinearInterpolator()).start();
                    }
                    C10773n nVar4 = this.f29552I0;
                    if (nVar4 != null) {
                        nVar4.mo37828e();
                    }
                }
            }
            m49497k();
        }
    }

    /* renamed from: a */
    public void mo38323a(Boolean bool) {
        this.f29577b.setEnabled(bool.booleanValue());
        this.f29569T.setEnabled(bool.booleanValue());
        this.f29580d0.setEnabled(bool.booleanValue());
        this.f29574W.setEnabled(bool.booleanValue());
        if (bool.booleanValue()) {
            this.f29586j0.setColorFilter(C0841b.m4915a(getContext(), (int) C10232R.C10234color.colorAccent));
        } else {
            this.f29586j0.setColorFilter(C0841b.m4915a(getContext(), (int) C10232R.C10234color.dark_gray3));
        }
    }
}
