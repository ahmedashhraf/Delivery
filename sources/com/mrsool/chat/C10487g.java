package com.mrsool.chat;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import androidx.core.p034l.C0984g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.krishna.fileloader.C10171b;
import com.krishna.fileloader.p194h.C10183b;
import com.krishna.fileloader.p404d.C10175b;
import com.krishna.fileloader.p405e.C10177a;
import com.krishna.fileloader.p407g.C10181b;
import com.mrsool.C10232R;
import com.mrsool.bean.ChatInitModel;
import com.mrsool.bean.ImageBean;
import com.mrsool.bean.MessageImagesBean;
import com.mrsool.bean.messages;
import com.mrsool.bean.messages.AUDIO_STATE;
import com.mrsool.customeview.RoundedCornerLayout;
import com.mrsool.p423v.C11718b;
import com.mrsool.p423v.C11720d;
import com.mrsool.p423v.C11720d.C11723c;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C11669t;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p088u.p098k.p100g.C2449b;
import p076c.p082c.p083a.p108y.C2529f;
import p076c.p082c.p083a.p108y.p110j.C2561m;
import p438de.hdodenhof.circleimageview.CircleImageView;
import p560rm.com.audiowave.AudioWaveView;
import p560rm.com.audiowave.C15782c;

/* renamed from: com.mrsool.chat.g */
/* compiled from: ChatAdapterNew */
public class C10487g extends C1638g<C1635d0> {

    /* renamed from: A */
    private static final int f28345A = 1845;

    /* renamed from: c */
    private final int f28346c = 1;

    /* renamed from: d */
    private final int f28347d = 2;

    /* renamed from: e */
    private final int f28348e = 3;

    /* renamed from: f */
    private final int f28349f = 4;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Context f28350g;

    /* renamed from: h */
    public ArrayList<messages> f28351h = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C5887x f28352i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C10511r f28353j;

    /* renamed from: k */
    private boolean f28354k;

    /* renamed from: l */
    private boolean f28355l;

    /* renamed from: m */
    private ChatInitModel f28356m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public MediaPlayer f28357n;

    /* renamed from: o */
    private final int f28358o = 0;

    /* renamed from: p */
    private final int f28359p = 1;

    /* renamed from: q */
    private final int f28360q = 2;

    /* renamed from: r */
    private LinearLayoutManager f28361r;

    /* renamed from: s */
    private int f28362s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public Handler f28363t;

    /* renamed from: u */
    private String f28364u;

    /* renamed from: v */
    private String f28365v;

    /* renamed from: w */
    private C11669t f28366w;

    /* renamed from: x */
    private View f28367x;

    /* renamed from: y */
    private Handler f28368y;

    /* renamed from: z */
    C11723c f28369z;

    /* renamed from: com.mrsool.chat.g$a */
    /* compiled from: ChatAdapterNew */
    class C10488a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f28370a;

        C10488a(int i) {
            this.f28370a = i;
        }

        public void onClick(View view) {
            C10487g.this.f28353j.mo37783d(this.f28370a);
        }
    }

    /* renamed from: com.mrsool.chat.g$b */
    /* compiled from: ChatAdapterNew */
    class C10489b implements C10177a<File> {

        /* renamed from: a */
        final /* synthetic */ int f28372a;

        /* renamed from: b */
        final /* synthetic */ boolean f28373b;

        C10489b(int i, boolean z) {
            this.f28372a = i;
            this.f28373b = z;
        }

        /* renamed from: a */
        public void mo36448a(C10183b bVar, C10181b<File> bVar2) {
            ((messages) C10487g.this.f28351h.get(this.f28372a)).setAudioState(AUDIO_STATE.IDLE.ordinal());
            C10487g.this.m48526a(this.f28372a, false, this.f28373b);
            C10487g gVar = C10487g.this;
            View a = gVar.m48517a(gVar.m48551i(this.f28372a), (int) C10232R.C10236id.ivAudioPlay);
            C10487g gVar2 = C10487g.this;
            View a2 = gVar2.m48517a(gVar2.m48551i(this.f28372a), (int) C10232R.C10236id.sbAudioPlayWave);
            if (a != null) {
                if (((messages) C10487g.this.f28351h.get(this.f28372a)).getAudioState() == AUDIO_STATE.IDLE.ordinal()) {
                    C10487g.this.f28369z.mo37869a();
                }
                C10487g.this.m48538a(((File) bVar2.mo36458a()).getAbsolutePath(), this.f28372a, (ImageView) a, (AudioWaveView) a2);
            }
        }

        /* renamed from: a */
        public void mo36449a(C10183b bVar, Throwable th) {
        }
    }

    /* renamed from: com.mrsool.chat.g$c */
    /* compiled from: ChatAdapterNew */
    class C10490c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SeekBar f28375a;

        C10490c(SeekBar seekBar) {
            this.f28375a = seekBar;
        }

        public void run() {
            if (C10487g.this.f28357n != null) {
                this.f28375a.setProgress(C10487g.this.f28357n.getCurrentPosition() / 1000);
            }
            C10487g.this.f28363t.postDelayed(this, 1000);
        }
    }

    /* renamed from: com.mrsool.chat.g$d */
    /* compiled from: ChatAdapterNew */
    class C10491d implements C11723c {
        C10491d() {
        }

        /* renamed from: a */
        public void mo37869a() {
            boolean z;
            int i = 0;
            while (true) {
                if (i >= C10487g.this.f28351h.size()) {
                    i = -1;
                    z = false;
                    break;
                } else if (((messages) C10487g.this.f28351h.get(i)).getAudioState() == AUDIO_STATE.PLAYING.ordinal() || ((messages) C10487g.this.f28351h.get(i)).getAudioState() == AUDIO_STATE.PAUSED.ordinal()) {
                    ((messages) C10487g.this.f28351h.get(i)).setCurrentValue(0);
                    ((messages) C10487g.this.f28351h.get(i)).setAudioState(AUDIO_STATE.IDLE.ordinal());
                    z = !String.valueOf(((messages) C10487g.this.f28351h.get(i)).getiFromUserId()).equalsIgnoreCase(C10487g.this.f28352i.mo23476G());
                } else {
                    i++;
                }
            }
            if (i > -1) {
                C10487g gVar = C10487g.this;
                View a = gVar.m48517a(gVar.m48551i(i), (int) C10232R.C10236id.sbAudioPlayWave);
                if (a != null) {
                    ((AudioWaveView) a).setProgress(0.0f);
                    a.setEnabled(false);
                }
                C10487g gVar2 = C10487g.this;
                View a2 = gVar2.m48517a(gVar2.m48551i(i), (int) C10232R.C10236id.ivAudioPlay);
                if (a2 != null) {
                    ((ImageView) a2).setImageResource(C10232R.C10235drawable.ic_chat_audio_play);
                }
                C10487g gVar3 = C10487g.this;
                if (gVar3.m48517a(gVar3.m48551i(i), (int) C10232R.C10236id.ivAudioPlay) != null) {
                    C10487g gVar4 = C10487g.this;
                    gVar4.m48525a(i, z, ((messages) gVar4.f28351h.get(i)).getTotalDuration() * 1000.0d);
                }
            }
        }

        /* renamed from: a */
        public void mo37870a(int i) {
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= C10487g.this.f28351h.size()) {
                    i2 = -1;
                    break;
                } else if (((messages) C10487g.this.f28351h.get(i2)).getAudioState() == AUDIO_STATE.PLAYING.ordinal() || ((messages) C10487g.this.f28351h.get(i2)).getAudioState() == AUDIO_STATE.PAUSED.ordinal()) {
                    z = !String.valueOf(((messages) C10487g.this.f28351h.get(i2)).getiFromUserId()).equalsIgnoreCase(C10487g.this.f28352i.mo23476G());
                } else {
                    i2++;
                }
            }
            C10487g gVar = C10487g.this;
            View a = gVar.m48517a(gVar.m48551i(i2), (int) C10232R.C10236id.sbAudioPlayWave);
            if (a != null) {
                a.setEnabled(true);
                ((AudioWaveView) a).setProgress(((float) (i * 100)) / ((float) (((messages) C10487g.this.f28351h.get(i2)).getTotalDuration() * 1000.0d)));
                C10487g.this.m48525a(i2, z, (double) i);
            }
        }
    }

    /* renamed from: com.mrsool.chat.g$e */
    /* compiled from: ChatAdapterNew */
    class C10492e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f28378a;

        C10492e(int i) {
            this.f28378a = i;
        }

        public void onClick(View view) {
            C10487g.this.f28353j.mo37783d(this.f28378a);
        }
    }

    /* renamed from: com.mrsool.chat.g$f */
    /* compiled from: ChatAdapterNew */
    class C10493f implements C2529f<String, C2449b> {

        /* renamed from: a */
        final /* synthetic */ C10501n f28380a;

        C10493f(C10501n nVar) {
            this.f28380a = nVar;
        }

        /* renamed from: a */
        public boolean mo10010a(Exception exc, String str, C2561m<C2449b> mVar, boolean z) {
            this.f28380a.f28399D0.setVisibility(8);
            this.f28380a.f28398C0.setVisibility(4);
            return false;
        }

        /* renamed from: a */
        public boolean mo10011a(C2449b bVar, String str, C2561m<C2449b> mVar, boolean z, boolean z2) {
            this.f28380a.f28399D0.setVisibility(8);
            this.f28380a.f28398C0.setVisibility(0);
            return false;
        }
    }

    /* renamed from: com.mrsool.chat.g$g */
    /* compiled from: ChatAdapterNew */
    class C10494g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f28382a;

        C10494g(int i) {
            this.f28382a = i;
        }

        public void onClick(View view) {
            C10487g.this.f28353j.mo37782c(this.f28382a);
        }
    }

    /* renamed from: com.mrsool.chat.g$h */
    /* compiled from: ChatAdapterNew */
    class C10495h implements C2529f<String, C2449b> {

        /* renamed from: a */
        final /* synthetic */ C10507q f28384a;

        C10495h(C10507q qVar) {
            this.f28384a = qVar;
        }

        /* renamed from: a */
        public boolean mo10010a(Exception exc, String str, C2561m<C2449b> mVar, boolean z) {
            this.f28384a.f28452F0.setVisibility(8);
            this.f28384a.f28448B0.setVisibility(4);
            return false;
        }

        /* renamed from: a */
        public boolean mo10011a(C2449b bVar, String str, C2561m<C2449b> mVar, boolean z, boolean z2) {
            this.f28384a.f28452F0.setVisibility(8);
            this.f28384a.f28448B0.setVisibility(0);
            return false;
        }
    }

    /* renamed from: com.mrsool.chat.g$i */
    /* compiled from: ChatAdapterNew */
    class C10496i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f28386a;

        C10496i(int i) {
            this.f28386a = i;
        }

        public void onClick(View view) {
            C10487g.this.f28353j.mo37782c(this.f28386a);
        }
    }

    /* renamed from: com.mrsool.chat.g$j */
    /* compiled from: ChatAdapterNew */
    class C10497j implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f28388a;

        C10497j(int i) {
            this.f28388a = i;
        }

        public void onClick(View view) {
            C10487g.this.f28353j.mo37783d(this.f28388a);
        }
    }

    /* renamed from: com.mrsool.chat.g$k */
    /* compiled from: ChatAdapterNew */
    class C10498k implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f28390a;

        C10498k(int i) {
            this.f28390a = i;
        }

        public void onClick(View view) {
            C10487g.this.f28353j.mo37780a(this.f28390a);
        }
    }

    /* renamed from: com.mrsool.chat.g$l */
    /* compiled from: ChatAdapterNew */
    class C10499l implements C2529f<String, C2449b> {

        /* renamed from: a */
        final /* synthetic */ C10503p f28392a;

        C10499l(C10503p pVar) {
            this.f28392a = pVar;
        }

        /* renamed from: a */
        public boolean mo10010a(Exception exc, String str, C2561m<C2449b> mVar, boolean z) {
            this.f28392a.f28423F0.setVisibility(8);
            this.f28392a.f28419B0.setVisibility(4);
            return false;
        }

        /* renamed from: a */
        public boolean mo10011a(C2449b bVar, String str, C2561m<C2449b> mVar, boolean z, boolean z2) {
            this.f28392a.f28423F0.setVisibility(8);
            this.f28392a.f28419B0.setVisibility(0);
            return false;
        }
    }

    /* renamed from: com.mrsool.chat.g$m */
    /* compiled from: ChatAdapterNew */
    class C10500m implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f28394a;

        C10500m(int i) {
            this.f28394a = i;
        }

        public void onClick(View view) {
            C10487g.this.f28353j.mo37782c(this.f28394a);
        }
    }

    /* renamed from: com.mrsool.chat.g$n */
    /* compiled from: ChatAdapterNew */
    class C10501n extends C1635d0 {

        /* renamed from: A0 */
        RelativeLayout f28396A0;

        /* renamed from: B0 */
        RelativeLayout f28397B0;

        /* renamed from: C0 */
        RoundedCornerLayout f28398C0;

        /* renamed from: D0 */
        ProgressBar f28399D0;

        /* renamed from: E0 */
        ProgressBar f28400E0;

        /* renamed from: F0 */
        ImageView f28401F0;

        /* renamed from: G0 */
        ImageView f28402G0;

        /* renamed from: s0 */
        LinearLayout f28404s0;

        /* renamed from: t0 */
        LinearLayout f28405t0;

        /* renamed from: u0 */
        LinearLayout f28406u0;

        /* renamed from: v0 */
        TextView f28407v0;

        /* renamed from: w0 */
        TextView f28408w0;

        /* renamed from: x0 */
        TextView f28409x0;

        /* renamed from: y0 */
        TextView f28410y0;

        /* renamed from: z0 */
        TextView f28411z0;

        public C10501n(View view) {
            super(view);
            this.f28404s0 = (LinearLayout) view.findViewById(C10232R.C10236id.llChatMessageRoot);
            this.f28405t0 = (LinearLayout) view.findViewById(C10232R.C10236id.llMessage);
            this.f28406u0 = (LinearLayout) view.findViewById(C10232R.C10236id.llTime);
            this.f28396A0 = (RelativeLayout) view.findViewById(C10232R.C10236id.rlImage);
            this.f28397B0 = (RelativeLayout) view.findViewById(C10232R.C10236id.rlLocation);
            this.f28407v0 = (TextView) view.findViewById(C10232R.C10236id.tvDate);
            this.f28408w0 = (TextView) view.findViewById(C10232R.C10236id.tvMsg);
            this.f28409x0 = (TextView) view.findViewById(C10232R.C10236id.tvLocationTitle);
            this.f28410y0 = (TextView) view.findViewById(C10232R.C10236id.tvLocationAddress);
            this.f28411z0 = (TextView) view.findViewById(C10232R.C10236id.tvTime);
            this.f28399D0 = (ProgressBar) view.findViewById(C10232R.C10236id.pgBar);
            this.f28400E0 = (ProgressBar) view.findViewById(C10232R.C10236id.pgBarLocation);
            this.f28401F0 = (ImageView) view.findViewById(C10232R.C10236id.ivImage);
            this.f28398C0 = (RoundedCornerLayout) view.findViewById(C10232R.C10236id.rclImage);
            this.f28402G0 = (ImageView) view.findViewById(C10232R.C10236id.ivLocation);
        }
    }

    /* renamed from: com.mrsool.chat.g$o */
    /* compiled from: ChatAdapterNew */
    class C10502o extends C1635d0 {

        /* renamed from: s0 */
        LinearLayout f28412s0;

        /* renamed from: t0 */
        LinearLayout f28413t0;

        /* renamed from: u0 */
        TextView f28414u0;

        /* renamed from: v0 */
        TextView f28415v0;

        /* renamed from: w0 */
        TextView f28416w0;

        public C10502o(View view) {
            super(view);
            this.f28412s0 = (LinearLayout) view.findViewById(C10232R.C10236id.llComplaintMessage);
            this.f28413t0 = (LinearLayout) view.findViewById(C10232R.C10236id.llChatMessageRoot);
            this.f28414u0 = (TextView) view.findViewById(C10232R.C10236id.tvDate);
            this.f28415v0 = (TextView) view.findViewById(C10232R.C10236id.tvComplaintTime);
            this.f28416w0 = (TextView) view.findViewById(C10232R.C10236id.tvComplaintText);
        }
    }

    /* renamed from: com.mrsool.chat.g$p */
    /* compiled from: ChatAdapterNew */
    class C10503p extends C1635d0 {

        /* renamed from: A0 */
        TextView f28418A0;

        /* renamed from: B0 */
        RoundedCornerLayout f28419B0;

        /* renamed from: C0 */
        RelativeLayout f28420C0;

        /* renamed from: D0 */
        RelativeLayout f28421D0;

        /* renamed from: E0 */
        RelativeLayout f28422E0;

        /* renamed from: F0 */
        ProgressBar f28423F0;

        /* renamed from: G0 */
        ProgressBar f28424G0;

        /* renamed from: H0 */
        ProgressBar f28425H0;

        /* renamed from: I0 */
        ImageView f28426I0;

        /* renamed from: J0 */
        ImageView f28427J0;

        /* renamed from: K0 */
        ImageView f28428K0;

        /* renamed from: L0 */
        CircleImageView f28429L0;

        /* renamed from: M0 */
        SeekBar f28430M0;

        /* renamed from: N0 */
        AudioWaveView f28431N0;

        /* renamed from: s0 */
        LinearLayout f28433s0;

        /* renamed from: t0 */
        LinearLayout f28434t0;

        /* renamed from: u0 */
        LinearLayout f28435u0;

        /* renamed from: v0 */
        TextView f28436v0;

        /* renamed from: w0 */
        TextView f28437w0;

        /* renamed from: x0 */
        TextView f28438x0;

        /* renamed from: y0 */
        TextView f28439y0;

        /* renamed from: z0 */
        TextView f28440z0;

        /* renamed from: com.mrsool.chat.g$p$a */
        /* compiled from: ChatAdapterNew */
        class C10504a implements C15782c {

            /* renamed from: a */
            final /* synthetic */ C10487g f28441a;

            C10504a(C10487g gVar) {
                this.f28441a = gVar;
            }

            /* renamed from: a */
            public void mo37883a(float f) {
            }

            /* renamed from: a */
            public void mo37884a(float f, boolean z) {
                if (z) {
                    C10503p pVar = C10503p.this;
                    double totalDuration = ((messages) C10487g.this.f28351h.get(pVar.mo7273f())).getTotalDuration();
                    double d = (double) f;
                    Double.isNaN(d);
                    C11720d.m52761a((int) ((((float) (totalDuration * d)) / 100.0f) * 1000.0f));
                    if (C11720d.m52770h()) {
                        C10503p pVar2 = C10503p.this;
                        C10487g gVar = C10487g.this;
                        double totalDuration2 = ((messages) gVar.f28351h.get(pVar2.mo7273f())).getTotalDuration();
                        Double.isNaN(d);
                        gVar.m48553k((int) ((((float) (totalDuration2 * d)) / 100.0f) * 1000.0f));
                    }
                }
            }

            /* renamed from: b */
            public void mo37885b(float f) {
            }
        }

        /* renamed from: com.mrsool.chat.g$p$b */
        /* compiled from: ChatAdapterNew */
        class C10505b implements OnSeekBarChangeListener {

            /* renamed from: a */
            final /* synthetic */ C10487g f28443a;

            C10505b(C10487g gVar) {
                this.f28443a = gVar;
            }

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (z) {
                    C11720d.m52761a(i);
                    if (C11720d.m52770h()) {
                        C10487g.this.f28369z.mo37870a(i * 1000);
                    }
                }
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        }

        /* renamed from: com.mrsool.chat.g$p$c */
        /* compiled from: ChatAdapterNew */
        class C10506c implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C10487g f28445a;

            C10506c(C10487g gVar) {
                this.f28445a = gVar;
            }

            public void onClick(View view) {
                if (C10487g.this.f28352i.mo23663u("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                    int f = C10503p.this.mo7273f();
                    if (((messages) C10487g.this.f28351h.get(f)).getAudioState() == AUDIO_STATE.IDLE.ordinal()) {
                        C10487g.this.f28369z.mo37869a();
                    }
                    File a = C10487g.this.m48541b(f, true);
                    if (a.exists()) {
                        String absolutePath = a.getAbsolutePath();
                        C10503p pVar = C10503p.this;
                        C10487g.this.m48538a(absolutePath, f, pVar.f28428K0, pVar.f28431N0);
                        return;
                    }
                    C11720d.m52774l();
                    C10487g.this.m48524a(f, true);
                    return;
                }
                ((ChatActivityNew) C10487g.this.f28350g).mo37656W();
            }
        }

        public C10503p(View view) {
            super(view);
            this.f28433s0 = (LinearLayout) view.findViewById(C10232R.C10236id.llChatMessageRoot);
            this.f28434t0 = (LinearLayout) view.findViewById(C10232R.C10236id.llMessage);
            this.f28435u0 = (LinearLayout) view.findViewById(C10232R.C10236id.llTime);
            this.f28420C0 = (RelativeLayout) view.findViewById(C10232R.C10236id.rlImage);
            this.f28421D0 = (RelativeLayout) view.findViewById(C10232R.C10236id.rlLocation);
            this.f28422E0 = (RelativeLayout) view.findViewById(C10232R.C10236id.rlAudio);
            this.f28419B0 = (RoundedCornerLayout) view.findViewById(C10232R.C10236id.rclImage);
            this.f28436v0 = (TextView) view.findViewById(C10232R.C10236id.tvDate);
            this.f28437w0 = (TextView) view.findViewById(C10232R.C10236id.tvMsg);
            this.f28438x0 = (TextView) view.findViewById(C10232R.C10236id.tvLocationTitle);
            this.f28439y0 = (TextView) view.findViewById(C10232R.C10236id.tvLocationAddress);
            this.f28440z0 = (TextView) view.findViewById(C10232R.C10236id.tvTime);
            this.f28418A0 = (TextView) view.findViewById(C10232R.C10236id.tvAudioPlayDuration);
            this.f28423F0 = (ProgressBar) view.findViewById(C10232R.C10236id.pgBar);
            this.f28424G0 = (ProgressBar) view.findViewById(C10232R.C10236id.pgBarLocation);
            this.f28425H0 = (ProgressBar) view.findViewById(C10232R.C10236id.pgAudioPlayer);
            this.f28430M0 = (SeekBar) view.findViewById(C10232R.C10236id.sbAudioPlay);
            this.f28431N0 = (AudioWaveView) view.findViewById(C10232R.C10236id.sbAudioPlayWave);
            this.f28426I0 = (ImageView) view.findViewById(C10232R.C10236id.ivImage);
            this.f28427J0 = (ImageView) view.findViewById(C10232R.C10236id.ivLocation);
            this.f28428K0 = (ImageView) view.findViewById(C10232R.C10236id.ivAudioPlay);
            this.f28429L0 = (CircleImageView) view.findViewById(C10232R.C10236id.ivProfilePic);
            this.f28431N0.setOnProgressListener(new C10504a(C10487g.this));
            this.f28430M0.setOnSeekBarChangeListener(new C10505b(C10487g.this));
            this.f28428K0.setOnClickListener(new C10506c(C10487g.this));
        }
    }

    /* renamed from: com.mrsool.chat.g$q */
    /* compiled from: ChatAdapterNew */
    class C10507q extends C1635d0 {

        /* renamed from: A0 */
        TextView f28447A0;

        /* renamed from: B0 */
        RoundedCornerLayout f28448B0;

        /* renamed from: C0 */
        RelativeLayout f28449C0;

        /* renamed from: D0 */
        RelativeLayout f28450D0;

        /* renamed from: E0 */
        RelativeLayout f28451E0;

        /* renamed from: F0 */
        ProgressBar f28452F0;

        /* renamed from: G0 */
        ProgressBar f28453G0;

        /* renamed from: H0 */
        ProgressBar f28454H0;

        /* renamed from: I0 */
        ProgressBar f28455I0;

        /* renamed from: J0 */
        ImageView f28456J0;

        /* renamed from: K0 */
        ImageView f28457K0;

        /* renamed from: L0 */
        ImageView f28458L0;

        /* renamed from: M0 */
        ImageView f28459M0;

        /* renamed from: N0 */
        ImageView f28460N0;

        /* renamed from: O0 */
        SeekBar f28461O0;

        /* renamed from: P0 */
        AudioWaveView f28462P0;

        /* renamed from: s0 */
        LinearLayout f28464s0;

        /* renamed from: t0 */
        LinearLayout f28465t0;

        /* renamed from: u0 */
        LinearLayout f28466u0;

        /* renamed from: v0 */
        TextView f28467v0;

        /* renamed from: w0 */
        TextView f28468w0;

        /* renamed from: x0 */
        TextView f28469x0;

        /* renamed from: y0 */
        TextView f28470y0;

        /* renamed from: z0 */
        TextView f28471z0;

        /* renamed from: com.mrsool.chat.g$q$a */
        /* compiled from: ChatAdapterNew */
        class C10508a implements C15782c {

            /* renamed from: a */
            final /* synthetic */ C10487g f28472a;

            C10508a(C10487g gVar) {
                this.f28472a = gVar;
            }

            /* renamed from: a */
            public void mo37883a(float f) {
            }

            /* renamed from: a */
            public void mo37884a(float f, boolean z) {
                if (z) {
                    C10507q qVar = C10507q.this;
                    double totalDuration = ((messages) C10487g.this.f28351h.get(qVar.mo7273f())).getTotalDuration();
                    double d = (double) f;
                    Double.isNaN(d);
                    C11720d.m52761a((int) ((((float) (totalDuration * d)) / 100.0f) * 1000.0f));
                    if (C11720d.m52770h()) {
                        C10507q qVar2 = C10507q.this;
                        C10487g gVar = C10487g.this;
                        double totalDuration2 = ((messages) gVar.f28351h.get(qVar2.mo7273f())).getTotalDuration();
                        Double.isNaN(d);
                        gVar.m48553k((int) ((((float) (totalDuration2 * d)) / 100.0f) * 1000.0f));
                    }
                }
            }

            /* renamed from: b */
            public void mo37885b(float f) {
            }
        }

        /* renamed from: com.mrsool.chat.g$q$b */
        /* compiled from: ChatAdapterNew */
        class C10509b implements OnSeekBarChangeListener {

            /* renamed from: a */
            final /* synthetic */ C10487g f28474a;

            C10509b(C10487g gVar) {
                this.f28474a = gVar;
            }

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        }

        /* renamed from: com.mrsool.chat.g$q$c */
        /* compiled from: ChatAdapterNew */
        class C10510c implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C10487g f28476a;

            C10510c(C10487g gVar) {
                this.f28476a = gVar;
            }

            public void onClick(View view) {
                if (C10487g.this.f28352i.mo23663u("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                    int f = C10507q.this.mo7273f();
                    if (((messages) C10487g.this.f28351h.get(f)).getAudioState() == AUDIO_STATE.IDLE.ordinal()) {
                        C10487g.this.f28369z.mo37869a();
                    }
                    File a = C10487g.this.m48541b(f, false);
                    if (a.exists()) {
                        String absolutePath = a.getAbsolutePath();
                        C10507q qVar = C10507q.this;
                        C10487g.this.m48538a(absolutePath, f, qVar.f28458L0, qVar.f28462P0);
                        return;
                    }
                    C11720d.m52774l();
                    C10487g.this.m48524a(f, false);
                    return;
                }
                ((ChatActivityNew) C10487g.this.f28350g).mo37656W();
            }
        }

        public C10507q(View view) {
            super(view);
            this.f28464s0 = (LinearLayout) view.findViewById(C10232R.C10236id.llChatMessageRoot);
            this.f28465t0 = (LinearLayout) view.findViewById(C10232R.C10236id.llMessage);
            this.f28466u0 = (LinearLayout) view.findViewById(C10232R.C10236id.llTime);
            this.f28449C0 = (RelativeLayout) view.findViewById(C10232R.C10236id.rlImage);
            this.f28450D0 = (RelativeLayout) view.findViewById(C10232R.C10236id.rlLocation);
            this.f28451E0 = (RelativeLayout) view.findViewById(C10232R.C10236id.rlAudio);
            this.f28448B0 = (RoundedCornerLayout) view.findViewById(C10232R.C10236id.rclImage);
            this.f28467v0 = (TextView) view.findViewById(C10232R.C10236id.tvDate);
            this.f28468w0 = (TextView) view.findViewById(C10232R.C10236id.tvMsg);
            this.f28469x0 = (TextView) view.findViewById(C10232R.C10236id.tvLocationTitle);
            this.f28470y0 = (TextView) view.findViewById(C10232R.C10236id.tvLocationAddress);
            this.f28471z0 = (TextView) view.findViewById(C10232R.C10236id.tvTime);
            this.f28447A0 = (TextView) view.findViewById(C10232R.C10236id.tvAudioPlayDuration);
            this.f28452F0 = (ProgressBar) view.findViewById(C10232R.C10236id.pgBar);
            this.f28453G0 = (ProgressBar) view.findViewById(C10232R.C10236id.pgBarUpload);
            this.f28454H0 = (ProgressBar) view.findViewById(C10232R.C10236id.pgBarLocation);
            this.f28455I0 = (ProgressBar) view.findViewById(C10232R.C10236id.pgAudioPlayer);
            this.f28461O0 = (SeekBar) view.findViewById(C10232R.C10236id.sbAudioPlay);
            this.f28462P0 = (AudioWaveView) view.findViewById(C10232R.C10236id.sbAudioPlayWave);
            this.f28456J0 = (ImageView) view.findViewById(C10232R.C10236id.ivImage);
            this.f28457K0 = (ImageView) view.findViewById(C10232R.C10236id.ivLocation);
            this.f28458L0 = (ImageView) view.findViewById(C10232R.C10236id.ivAudioPlay);
            this.f28459M0 = (ImageView) view.findViewById(C10232R.C10236id.ivProfilePic);
            this.f28460N0 = (ImageView) view.findViewById(C10232R.C10236id.ivTick);
            this.f28462P0.setOnProgressListener(new C10508a(C10487g.this));
            this.f28461O0.setOnSeekBarChangeListener(new C10509b(C10487g.this));
            this.f28458L0.setOnClickListener(new C10510c(C10487g.this));
        }
    }

    /* renamed from: com.mrsool.chat.g$r */
    /* compiled from: ChatAdapterNew */
    public interface C10511r {
        /* renamed from: a */
        void mo37780a(int i);

        /* renamed from: b */
        void mo37781b(int i);

        /* renamed from: c */
        void mo37782c(int i);

        /* renamed from: d */
        void mo37783d(int i);
    }

    public C10487g(ArrayList<messages> arrayList, Context context) {
        String str = "";
        this.f28364u = str;
        this.f28365v = str;
        this.f28369z = new C10491d();
        this.f28350g = context;
        this.f28351h = arrayList;
        this.f28352i = new C5887x(context);
        this.f28361r = ((ChatActivityNew) this.f28350g).f27675C1;
        this.f28362s = -1;
        this.f28368y = new Handler();
    }

    /* renamed from: c */
    private int m48544c(int i, boolean z) {
        if (i != 1) {
            return z ? C10232R.C10235drawable.bg_chat_other_last : C10232R.C10235drawable.bg_chat_other_first;
        }
        return z ? C10232R.C10235drawable.bg_chat_admin_last : C10232R.C10235drawable.bg_chat_admin_first;
    }

    /* renamed from: h */
    private int m48550h(int i) {
        messages messages = (messages) this.f28351h.get(i);
        boolean equalsIgnoreCase = messages.getiFromUserId().equalsIgnoreCase(this.f28352i.mo23468C().mo23459f("user_id"));
        if (messages.getvType().equalsIgnoreCase("complaint")) {
            return 4;
        }
        if (messages.isbIsAdmin()) {
            return 1;
        }
        return equalsIgnoreCase ? 3 : 2;
    }

    /* renamed from: j */
    private boolean m48552j(int i) {
        return ((messages) this.f28351h.get(i)).getAudioProgressState() == 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m48553k(int i) {
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f28351h.size()) {
                i2 = -1;
                break;
            } else if (((messages) this.f28351h.get(i2)).getAudioState() == AUDIO_STATE.PLAYING.ordinal() || ((messages) this.f28351h.get(i2)).getAudioState() == AUDIO_STATE.PAUSED.ordinal()) {
                z = !String.valueOf(((messages) this.f28351h.get(i2)).getiFromUserId()).equalsIgnoreCase(this.f28352i.mo23476G());
            } else {
                i2++;
            }
        }
        z = !String.valueOf(((messages) this.f28351h.get(i2)).getiFromUserId()).equalsIgnoreCase(this.f28352i.mo23476G());
        View a = m48517a(m48551i(i2), (int) C10232R.C10236id.sbAudioPlayWave);
        if (a != null) {
            a.setEnabled(true);
            m48525a(i2, z, (double) i);
        }
    }

    /* renamed from: f */
    public C10511r mo37861f() {
        return this.f28353j;
    }

    /* renamed from: g */
    public ChatInitModel mo37862g() {
        return this.f28356m;
    }

    /* renamed from: i */
    public boolean mo37864i() {
        return this.f28354k;
    }

    /* renamed from: d */
    private int m48546d(boolean z) {
        for (int i = 0; i < this.f28351h.size(); i++) {
            if (((messages) this.f28351h.get(i)).getvMessageId().equalsIgnoreCase(z ? this.f28364u : this.f28365v)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: g */
    private SeekBar m48549g(int i) {
        View c = this.f28361r.mo6989c(i);
        if (c != null) {
            return (SeekBar) c.findViewById(C10232R.C10236id.sbAudioPlay);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public View m48551i(int i) {
        return this.f28361r.mo6989c(i);
    }

    /* renamed from: c */
    public int mo7333c(int i) {
        return m48550h(i);
    }

    /* renamed from: j */
    public void mo37865j() {
        for (int i = 0; i < this.f28351h.size(); i++) {
            if (((messages) this.f28351h.get(i)).getAudioState() == AUDIO_STATE.PLAYING.ordinal()) {
                ((messages) this.f28351h.get(i)).setAudioState(AUDIO_STATE.PAUSED.ordinal());
                C11720d.m52772j();
                ((messages) this.f28351h.get(i)).setCurrentValue(C11720d.m52768f().getCurrentPosition());
                mo7337d(i);
                return;
            }
        }
    }

    /* renamed from: c */
    public void mo37860c(boolean z) {
        this.f28354k = z;
    }

    /* renamed from: b */
    public C1635d0 mo7327b(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            return new C10501n(from.inflate(C10232R.layout.row_chat_admin, viewGroup, false));
        }
        if (i == 3) {
            return new C10507q(from.inflate(C10232R.layout.row_chat_own, viewGroup, false));
        }
        if (i != 4) {
            return new C10503p(from.inflate(C10232R.layout.row_chat_other, viewGroup, false));
        }
        return new C10502o(from.inflate(C10232R.layout.row_chat_complaint, viewGroup, false));
    }

    /* renamed from: h */
    public boolean mo37863h() {
        return this.f28355l;
    }

    /* renamed from: a */
    private void m48530a(C10501n nVar, int i) {
        View view;
        messages messages = (messages) this.f28351h.get(i);
        if (messages.isDateVisible()) {
            nVar.f28407v0.setVisibility(0);
            nVar.f28407v0.setText(messages.getMessageDate());
        } else {
            nVar.f28407v0.setVisibility(8);
        }
        TextView textView = nVar.f28411z0;
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(str);
        sb.append(messages.getMessageTime());
        textView.setText(sb.toString());
        if (messages.getvType().equalsIgnoreCase("text")) {
            view = nVar.f28405t0;
            this.f28352i.mo23533a(8, nVar.f28396A0, nVar.f28397B0);
            this.f28352i.mo23533a(0, nVar.f28405t0);
            TextView textView2 = nVar.f28408w0;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(messages.getTxContent());
            textView2.setText(sb2.toString());
            m48528a(nVar.f28408w0, messages.getTxContent());
        } else if (messages.getvType().equalsIgnoreCase("location")) {
            view = nVar.f28397B0;
            this.f28352i.mo23533a(8, nVar.f28405t0, nVar.f28396A0);
            this.f28352i.mo23533a(0, nVar.f28397B0);
            nVar.f28404s0.setVisibility(mo37864i() ? 8 : 0);
            if (TextUtils.isEmpty(messages.getVtxTitle())) {
                nVar.f28409x0.setVisibility(8);
            } else {
                nVar.f28409x0.setVisibility(0);
                nVar.f28409x0.setText(messages.getVtxTitle());
            }
            nVar.f28410y0.setText(messages.getiAddress());
            m48528a(nVar.f28410y0, messages.getiAddress());
            nVar.f28400E0.setVisibility(0);
            nVar.f28402G0.setImageResource(C10232R.C10235drawable.ic_map_chat_holder);
            nVar.f28397B0.setOnClickListener(new C10492e(i));
        } else {
            view = nVar.f28396A0;
            this.f28352i.mo23533a(8, nVar.f28405t0, nVar.f28397B0);
            this.f28352i.mo23533a(0, nVar.f28396A0);
            try {
                if (!((Activity) this.f28350g).isFinishing() || !((Activity) this.f28350g).isDestroyed()) {
                    nVar.f28399D0.setVisibility(0);
                    C2232l.m11649c(this.f28350g).mo9515a(messages.getTxContent()).m11468a((C2529f<? super ModelType, C2449b>) new C10493f<Object,C2449b>(nVar)).mo9424a(nVar.f28401F0);
                }
            } catch (Exception unused) {
            }
            nVar.f28401F0.setOnClickListener(new C10494g(i));
        }
        View view2 = view;
        if (view2 != null) {
            m48523a(1, view2, nVar.f28406u0, nVar.f28411z0, messages, i);
        }
    }

    /* renamed from: k */
    public void mo37866k() {
        for (int i = 0; i < this.f28351h.size(); i++) {
            if (((messages) this.f28351h.get(i)).getAudioState() == AUDIO_STATE.PLAYING.ordinal() || ((messages) this.f28351h.get(i)).getAudioState() == AUDIO_STATE.PAUSED.ordinal()) {
                ((messages) this.f28351h.get(i)).setAudioState(AUDIO_STATE.IDLE.ordinal());
                mo7337d(i);
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo7330b(C1635d0 d0Var, int i) {
        int h = d0Var.mo7275h();
        if (h == 1) {
            m48530a((C10501n) d0Var, i);
        } else if (h == 3) {
            m48533a((C10507q) d0Var, i);
        } else if (h != 4) {
            m48532a((C10503p) d0Var, i);
        } else {
            m48531a((C10502o) d0Var, i);
        }
    }

    /* renamed from: b */
    private void m48542b(messages messages, C10507q qVar) {
        if (!messages.isSent2Server()) {
            try {
                if (messages.getvType().equalsIgnoreCase("audio")) {
                    qVar.f28460N0.setAlpha(1.0f);
                }
                qVar.f28460N0.setImageResource(messages.isSent2Server() ? C10232R.C10235drawable.ic_tick_message_sent : C10232R.C10235drawable.ic_waiting_grey);
            } catch (Exception unused) {
            }
        } else {
            m48529a(messages, qVar);
        }
    }

    /* renamed from: b */
    public int mo7325b() {
        return this.f28351h.size();
    }

    /* renamed from: b */
    public void mo37859b(boolean z) {
        this.f28355l = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public File m48541b(int i, boolean z) {
        Context context = this.f28350g;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.f28356m.getOrder().getiOrderId());
        String a = C11718b.m52720a(context, z, sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((messages) this.f28351h.get(i)).getvMessageId());
        sb2.append(C11718b.f33921m);
        return C11718b.m52714a(a, sb2.toString());
    }

    /* renamed from: a */
    private void m48533a(C10507q qVar, int i) {
        messages messages = (messages) this.f28351h.get(i);
        int i2 = 8;
        if (messages.isDateVisible()) {
            qVar.f28467v0.setVisibility(0);
            qVar.f28467v0.setText(messages.getMessageDate());
        } else {
            qVar.f28467v0.setVisibility(8);
        }
        m48529a(messages, qVar);
        qVar.f28471z0.setText(messages.getMessageTime());
        m48542b(messages, qVar);
        String str = "";
        if (messages.getvType().equalsIgnoreCase("text")) {
            qVar.f28450D0.setVisibility(8);
            qVar.f28465t0.setVisibility(0);
            qVar.f28449C0.setVisibility(8);
            qVar.f28451E0.setVisibility(8);
            TextView textView = qVar.f28468w0;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(messages.getTxContent());
            textView.setText(sb.toString());
            m48528a(qVar.f28468w0, messages.getTxContent());
        } else if (messages.getvType().equalsIgnoreCase("image")) {
            qVar.f28450D0.setVisibility(8);
            qVar.f28451E0.setVisibility(8);
            qVar.f28465t0.setVisibility(8);
            qVar.f28449C0.setVisibility(0);
            if (messages.isImageLoaded()) {
                qVar.f28453G0.setVisibility(8);
            } else {
                qVar.f28453G0.setVisibility(0);
            }
            if (messages != null && messages.getTxContent() != null && messages.getTxContent().contains("http")) {
                str = messages.getTxContent();
            } else if (!(messages == null || messages.getTxContent() == null)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("file://");
                sb2.append(messages.getTxContent());
                str = sb2.toString();
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    if (!((Activity) this.f28350g).isFinishing() || !((Activity) this.f28350g).isDestroyed()) {
                        qVar.f28452F0.setVisibility(0);
                        C2232l.m11649c(this.f28350g).mo9515a(messages.getTxContent()).m11468a((C2529f<? super ModelType, C2449b>) new C10495h<Object,C2449b>(qVar)).mo9424a(qVar.f28456J0);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                qVar.f28449C0.setOnClickListener(new C10496i(i));
            }
        } else if (messages.getvType().equalsIgnoreCase("location")) {
            qVar.f28465t0.setVisibility(8);
            qVar.f28450D0.setVisibility(0);
            qVar.f28451E0.setVisibility(8);
            qVar.f28449C0.setVisibility(8);
            if (TextUtils.isEmpty(messages.getVtxTitle())) {
                qVar.f28469x0.setVisibility(8);
            } else {
                qVar.f28469x0.setVisibility(0);
                qVar.f28469x0.setText(messages.getVtxTitle());
            }
            qVar.f28470y0.setText(messages.getiAddress());
            m48528a(qVar.f28470y0, messages.getiAddress());
            LinearLayout linearLayout = qVar.f28464s0;
            if (!mo37864i()) {
                i2 = 0;
            }
            linearLayout.setVisibility(i2);
            qVar.f28454H0.setVisibility(0);
            qVar.f28457K0.setImageResource(C10232R.C10235drawable.ic_map_chat_holder);
            qVar.f28450D0.setOnClickListener(new C10497j(i));
        } else if (messages.getvType().equalsIgnoreCase("audio")) {
            this.f28352i.mo23533a(8, qVar.f28465t0, qVar.f28449C0, qVar.f28450D0);
            this.f28352i.mo23533a(0, qVar.f28451E0);
            qVar.f28460N0.setVisibility(0);
            if (messages.getAudioState() == AUDIO_STATE.PLAYING.ordinal()) {
                qVar.f28447A0.setText(this.f28352i.mo23587c((double) messages.getCurrentValue()));
                qVar.f28462P0.setProgress(((float) (messages.getCurrentValue() * 100)) / ((float) (messages.getTotalDuration() * 1000.0d)));
                qVar.f28462P0.setEnabled(true);
                qVar.f28458L0.setVisibility(0);
                qVar.f28455I0.setVisibility(4);
                qVar.f28458L0.setImageResource(C10232R.C10235drawable.ic_chat_audio_pause);
                qVar.f28462P0.setEnabled(true);
            } else if (messages.getAudioState() == AUDIO_STATE.PAUSED.ordinal()) {
                qVar.f28447A0.setText(this.f28352i.mo23587c((double) messages.getCurrentValue()));
                qVar.f28462P0.setProgress(((float) (messages.getCurrentValue() * 100)) / ((float) (messages.getTotalDuration() * 1000.0d)));
                qVar.f28462P0.setEnabled(true);
                qVar.f28458L0.setVisibility(0);
                qVar.f28455I0.setVisibility(4);
                qVar.f28458L0.setImageResource(C10232R.C10235drawable.ic_chat_audio_play);
                qVar.f28462P0.setEnabled(true);
            } else if (messages.getAudioState() == AUDIO_STATE.IDLE.ordinal()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("position:");
                sb3.append(i);
                sb3.append(" duration:");
                sb3.append(messages.getTotalDuration());
                C5880q.m25751b(sb3.toString());
                qVar.f28447A0.setText(this.f28352i.mo23587c(messages.getTotalDuration() * 1000.0d));
                qVar.f28458L0.setVisibility(0);
                qVar.f28455I0.setVisibility(4);
                qVar.f28458L0.setImageResource(C10232R.C10235drawable.ic_chat_audio_play);
                qVar.f28462P0.setProgress(0.0f);
                qVar.f28462P0.setEnabled(false);
            } else if (messages.getAudioState() == AUDIO_STATE.DOWNLOADING.ordinal()) {
                qVar.f28447A0.setText(this.f28352i.mo23587c(messages.getTotalDuration() * 1000.0d));
                qVar.f28458L0.setVisibility(4);
                qVar.f28455I0.setVisibility(0);
                qVar.f28462P0.setProgress(0.0f);
                qVar.f28462P0.setEnabled(false);
                qVar.f28460N0.setVisibility(4);
            }
        }
    }

    /* renamed from: a */
    private void m48531a(C10502o oVar, int i) {
        messages messages = (messages) this.f28351h.get(i);
        if (messages.getiFromUserId().equalsIgnoreCase(this.f28352i.mo23468C().mo23459f("user_id"))) {
            oVar.f28413t0.setVisibility(0);
            if (messages.isDateVisible()) {
                oVar.f28414u0.setVisibility(0);
                oVar.f28414u0.setText(messages.getMessageDate());
            } else {
                oVar.f28414u0.setVisibility(8);
            }
            oVar.f28412s0.setVisibility(0);
            oVar.f28416w0.setText(messages.getTxContent());
            oVar.f28415v0.setText(messages.getMessageTime());
            oVar.f28416w0.setOnClickListener(new C10498k(i));
            return;
        }
        oVar.f28413t0.setVisibility(8);
    }

    /* renamed from: a */
    private void m48532a(C10503p pVar, int i) {
        String str;
        View view;
        messages messages = (messages) this.f28351h.get(i);
        int i2 = 8;
        if (messages.isDateVisible()) {
            pVar.f28436v0.setVisibility(0);
            pVar.f28436v0.setText(messages.getMessageDate());
        } else {
            pVar.f28436v0.setVisibility(8);
        }
        String str2 = "";
        if (TextUtils.isEmpty(messages.getImageType())) {
            str = ChatActivityNew.f27654B6;
        } else if (messages.getImageType().equalsIgnoreCase(C11644i.f33247Z5)) {
            str = this.f28356m.getOrder().getvShopPic();
        } else {
            String imageType = messages.getImageType();
            String str3 = C11644i.f33256a6;
            if (imageType.equalsIgnoreCase(str3)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(messages.getiFromUserId());
                str = m48521a(str3, sb.toString());
            } else {
                String str4 = "buyer";
                if (messages.getImageType().equalsIgnoreCase(str4)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(messages.getiFromUserId());
                    str = m48521a(str4, sb2.toString());
                } else {
                    str = str2;
                }
            }
        }
        try {
            if (!((Activity) this.f28350g).isFinishing() || !((Activity) this.f28350g).isDestroyed()) {
                C2232l.m11649c(this.f28350g.getApplicationContext()).mo9515a(str).m11496d().m11500e((int) C10232R.C10235drawable.hint_userpic).mo9424a((ImageView) pVar.f28429L0);
            }
        } catch (Exception unused) {
        }
        if (messages.getvType().equalsIgnoreCase("text")) {
            view = pVar.f28434t0;
            this.f28352i.mo23533a(8, pVar.f28420C0, pVar.f28421D0, pVar.f28422E0);
            this.f28352i.mo23533a(0, pVar.f28434t0);
            TextView textView = pVar.f28437w0;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append(messages.getTxContent());
            textView.setText(sb3.toString());
            pVar.f28421D0.setVisibility(8);
            m48528a(pVar.f28437w0, messages.getTxContent());
        } else if (messages.getvType().equalsIgnoreCase("image")) {
            view = pVar.f28420C0;
            this.f28352i.mo23533a(8, pVar.f28434t0, pVar.f28421D0, pVar.f28422E0);
            this.f28352i.mo23533a(0, pVar.f28420C0);
            if (messages != null && messages.getTxContent() != null && messages.getTxContent().contains("http")) {
                str2 = messages.getTxContent();
            } else if (!(messages == null || messages.getTxContent() == null)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("file://");
                sb4.append(messages.getTxContent());
                str2 = sb4.toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                try {
                    if (!((Activity) this.f28350g).isFinishing() || !((Activity) this.f28350g).isDestroyed()) {
                        pVar.f28423F0.setVisibility(0);
                        C2232l.m11649c(this.f28350g).mo9515a(messages.getTxContent()).m11468a((C2529f<? super ModelType, C2449b>) new C10499l<Object,C2449b>(pVar)).mo9424a(pVar.f28426I0);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                pVar.f28420C0.setOnClickListener(new C10500m(i));
            }
        } else if (messages.getvType().equalsIgnoreCase("location")) {
            view = pVar.f28421D0;
            this.f28352i.mo23533a(8, pVar.f28434t0, pVar.f28420C0, pVar.f28422E0);
            this.f28352i.mo23533a(0, pVar.f28421D0);
            pVar.f28433s0.setVisibility(mo37864i() ? 8 : 0);
            if (TextUtils.isEmpty(messages.getVtxTitle())) {
                pVar.f28438x0.setText("Shared Location");
                pVar.f28438x0.setVisibility(8);
            } else {
                pVar.f28438x0.setVisibility(0);
                pVar.f28438x0.setText(messages.getVtxTitle());
            }
            pVar.f28439y0.setText(messages.getiAddress());
            m48528a(pVar.f28439y0, messages.getiAddress());
            LinearLayout linearLayout = pVar.f28433s0;
            if (!mo37864i()) {
                i2 = 0;
            }
            linearLayout.setVisibility(i2);
            if (!(messages == null || messages.getTxContent() == null)) {
                String str5 = ",";
                if (messages.getTxContent().contains(str5)) {
                    String[] split = messages.getTxContent().split(str5);
                    if (split.length > 0) {
                        this.f28352i.mo23603d(split[0], split[1]);
                    }
                }
            }
            pVar.f28424G0.setVisibility(0);
            pVar.f28427J0.setImageResource(C10232R.C10235drawable.ic_map_chat_holder);
            pVar.f28421D0.setOnClickListener(new C10488a(i));
        } else if (messages.getvType().equalsIgnoreCase("audio")) {
            this.f28352i.mo23533a(8, pVar.f28434t0, pVar.f28420C0, pVar.f28421D0);
            this.f28352i.mo23533a(0, pVar.f28422E0);
            view = pVar.f28422E0;
            if (messages.getAudioState() == AUDIO_STATE.PLAYING.ordinal()) {
                pVar.f28418A0.setText(this.f28352i.mo23587c((double) messages.getCurrentValue()));
                pVar.f28431N0.setProgress(((float) (messages.getCurrentValue() * 100)) / ((float) (messages.getTotalDuration() * 1000.0d)));
                pVar.f28431N0.setEnabled(true);
                pVar.f28428K0.setVisibility(0);
                pVar.f28425H0.setVisibility(4);
                pVar.f28428K0.setImageResource(C10232R.C10235drawable.ic_chat_audio_pause);
                pVar.f28431N0.setEnabled(true);
            } else if (messages.getAudioState() == AUDIO_STATE.PAUSED.ordinal()) {
                pVar.f28418A0.setText(this.f28352i.mo23587c((double) messages.getCurrentValue()));
                pVar.f28431N0.setProgress(((float) (messages.getCurrentValue() * 100)) / ((float) (messages.getTotalDuration() * 1000.0d)));
                pVar.f28431N0.setEnabled(true);
                pVar.f28428K0.setVisibility(0);
                pVar.f28425H0.setVisibility(4);
                pVar.f28428K0.setImageResource(C10232R.C10235drawable.ic_chat_audio_play);
                pVar.f28431N0.setEnabled(true);
            } else if (messages.getAudioState() == AUDIO_STATE.IDLE.ordinal()) {
                pVar.f28418A0.setText(this.f28352i.mo23587c(messages.getTotalDuration() * 1000.0d));
                pVar.f28428K0.setVisibility(0);
                pVar.f28425H0.setVisibility(4);
                pVar.f28428K0.setImageResource(C10232R.C10235drawable.ic_chat_audio_play);
                pVar.f28431N0.setProgress(0.0f);
                pVar.f28431N0.setEnabled(false);
            } else if (messages.getAudioState() == AUDIO_STATE.DOWNLOADING.ordinal()) {
                pVar.f28418A0.setText(this.f28352i.mo23587c(messages.getTotalDuration() * 1000.0d));
                pVar.f28428K0.setVisibility(4);
                pVar.f28425H0.setVisibility(0);
                pVar.f28431N0.setProgress(0.0f);
                pVar.f28431N0.setEnabled(false);
            }
        } else {
            view = null;
        }
        View view2 = view;
        if (view2 != null) {
            m48523a(2, view2, pVar.f28435u0, pVar.f28440z0, messages, i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0063  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m48523a(int r5, android.view.View r6, android.widget.LinearLayout r7, android.widget.TextView r8, com.mrsool.bean.messages r9, int r10) {
        /*
            r4 = this;
            java.util.ArrayList<com.mrsool.bean.messages> r0 = r4.f28351h
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            if (r10 != r0) goto L_0x000d
        L_0x000b:
            r10 = 1
            goto L_0x0049
        L_0x000d:
            int r10 = r10 + r1
            java.util.ArrayList<com.mrsool.bean.messages> r0 = r4.f28351h
            int r0 = r0.size()
            if (r10 >= r0) goto L_0x001d
            int r0 = r4.m48550h(r10)
            if (r5 == r0) goto L_0x001d
            goto L_0x000b
        L_0x001d:
            java.util.ArrayList<com.mrsool.bean.messages> r0 = r4.f28351h
            int r0 = r0.size()
            if (r10 >= r0) goto L_0x0048
            int r0 = r4.m48550h(r10)
            if (r5 != r0) goto L_0x0048
            java.lang.String r0 = r9.getMessageTime()
            java.util.ArrayList<com.mrsool.bean.messages> r3 = r4.f28351h
            java.lang.Object r10 = r3.get(r10)
            com.mrsool.bean.messages r10 = (com.mrsool.bean.messages) r10
            java.lang.String r10 = r10.getMessageTime()
            boolean r10 = r0.equalsIgnoreCase(r10)
            if (r10 == 0) goto L_0x000b
            boolean r10 = r9.isDateVisible()
            if (r10 == 0) goto L_0x0048
            goto L_0x000b
        L_0x0048:
            r10 = 0
        L_0x0049:
            if (r10 == 0) goto L_0x0063
            android.content.Context r10 = r4.f28350g
            int r5 = r4.m48544c(r5, r1)
            android.graphics.drawable.Drawable r5 = androidx.core.content.C0841b.m4928c(r10, r5)
            r6.setBackground(r5)
            r7.setVisibility(r2)
            java.lang.String r5 = r9.getMessageTime()
            r8.setText(r5)
            goto L_0x0075
        L_0x0063:
            android.content.Context r8 = r4.f28350g
            int r5 = r4.m48544c(r5, r2)
            android.graphics.drawable.Drawable r5 = androidx.core.content.C0841b.m4928c(r8, r5)
            r6.setBackground(r5)
            r5 = 8
            r7.setVisibility(r5)
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrsool.chat.C10487g.m48523a(int, android.view.View, android.widget.LinearLayout, android.widget.TextView, com.mrsool.bean.messages, int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48525a(int i, boolean z, double d) {
        View a = m48517a(m48551i(i), (int) C10232R.C10236id.tvAudioPlayDuration);
        if (a != null) {
            ((TextView) a).setText(this.f28352i.mo23587c(d));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48538a(String str, int i, ImageView imageView, AudioWaveView audioWaveView) {
        if (!((ChatActivityNew) this.f28350g).mo37649P()) {
            messages messages = (messages) this.f28351h.get(i);
            int audioState = messages.getAudioState();
            if (audioState == AUDIO_STATE.PLAYING.ordinal()) {
                imageView.setImageResource(C10232R.C10235drawable.ic_chat_audio_play);
                C11720d.m52772j();
                messages.setCurrentValue(C11720d.m52768f().getCurrentPosition());
                messages.setAudioState(AUDIO_STATE.PAUSED.ordinal());
                mo7337d(i);
                this.f28351h.set(i, messages);
            } else if (audioState == AUDIO_STATE.PAUSED.ordinal()) {
                imageView.setImageResource(C10232R.C10235drawable.ic_chat_audio_pause);
                C11720d.m52773k();
                messages.setAudioState(AUDIO_STATE.PLAYING.ordinal());
                this.f28351h.set(i, messages);
            } else if (audioState == AUDIO_STATE.IDLE.ordinal()) {
                try {
                    audioWaveView.setRawData(C11718b.m52742d(new File(str)));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                imageView.setImageResource(C10232R.C10235drawable.ic_chat_audio_pause);
                messages.setAudioState(AUDIO_STATE.PLAYING.ordinal());
                this.f28351h.set(i, messages);
                try {
                    ((ChatActivityNew) this.f28350g).mo36519N();
                    C11720d.m52763a(str, this.f28369z);
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48526a(int i, boolean z, boolean z2) {
        View a = m48517a(m48551i(i), (int) C10232R.C10236id.ivAudioPlay);
        int i2 = 4;
        if (a != null) {
            a.setVisibility(z ? 4 : 0);
        }
        View a2 = m48517a(m48551i(i), (int) C10232R.C10236id.pgAudioPlayer);
        if (a2 != null) {
            if (z) {
                i2 = 0;
            }
            a2.setVisibility(i2);
        }
        ((messages) this.f28351h.get(i)).setAudioState((z ? AUDIO_STATE.DOWNLOADING : AUDIO_STATE.IDLE).ordinal());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48524a(int i, boolean z) {
        m48526a(i, true, z);
        C10175b c = C10171b.m47256c(this.f28350g);
        String txContent = ((messages) this.f28351h.get(i)).getTxContent();
        StringBuilder sb = new StringBuilder();
        sb.append(((messages) this.f28351h.get(i)).getvMessageId());
        sb.append(C11718b.f33921m);
        C10175b a = c.mo36429a(txContent, false, sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C11718b.m52722a(z));
        sb2.append(this.f28356m.getOrder().getiOrderId());
        a.mo36427a(sb2.toString(), 4).mo36436b((C10177a<File>) new C10489b<File>(i, z));
    }

    /* renamed from: a */
    public void mo37858a(C10511r rVar) {
        this.f28353j = rVar;
    }

    /* renamed from: a */
    private void m48529a(messages messages, C10507q qVar) {
        try {
            qVar.f28460N0.setImageResource(messages.isRead() ? C10232R.C10235drawable.ic_tick_message_read : C10232R.C10235drawable.ic_tick_message_sent);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m48528a(TextView textView, String str) {
        if (!this.f28352i.mo23645o().equalsIgnoreCase(C11644i.f33191S5)) {
            if (C5887x.m25789Q(str)) {
                textView.setGravity(C0984g.f4395c);
            } else {
                textView.setGravity(C0984g.f4394b);
            }
        }
    }

    /* renamed from: a */
    public void mo37857a(ChatInitModel chatInitModel) {
        this.f28356m = chatInitModel;
    }

    /* renamed from: a */
    private String m48521a(String str, String str2) {
        int i = 0;
        while (i < this.f28356m.getMsgImages().size()) {
            try {
                if (((MessageImagesBean) this.f28356m.getMsgImages().get(i)).getImgFor().equalsIgnoreCase(str)) {
                    for (int i2 = 0; i2 < ((MessageImagesBean) this.f28356m.getMsgImages().get(i)).getImages().size(); i2++) {
                        if (((ImageBean) ((MessageImagesBean) this.f28356m.getMsgImages().get(i)).getImages().get(i2)).getId().equalsIgnoreCase(str2)) {
                            return ((ImageBean) ((MessageImagesBean) this.f28356m.getMsgImages().get(i)).getImages().get(i2)).getUrl();
                        }
                    }
                    continue;
                }
                i++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return this.f28356m.getOrder().getvShopPic();
    }

    /* renamed from: a */
    private void m48527a(SeekBar seekBar) {
        this.f28363t = new Handler();
        this.f28363t.post(new C10490c(seekBar));
    }

    /* renamed from: a */
    private void m48522a(int i, int i2, boolean z) {
        try {
            ((messages) this.f28351h.get(i)).setAudioProgressState(i2);
            if (z) {
                mo7337d(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public View m48517a(View view, int i) {
        if (view != null) {
            return view.findViewById(i);
        }
        return null;
    }
}
