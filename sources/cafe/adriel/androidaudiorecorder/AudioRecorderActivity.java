package cafe.adriel.androidaudiorecorder;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.C0295d;
import androidx.core.content.C0841b;
import androidx.core.p034l.C0962e0;
import cafe.adriel.androidaudiorecorder.p151e.C2796a;
import cafe.adriel.androidaudiorecorder.p151e.C2798b;
import cafe.adriel.androidaudiorecorder.p151e.C2799c;
import com.cleveroad.audiovisualization.C3001d;
import com.cleveroad.audiovisualization.C3001d.C3004c;
import com.cleveroad.audiovisualization.C3005e;
import com.cleveroad.audiovisualization.C3005e.C3008c;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import omrecorder.C15035b;
import omrecorder.C15042f;
import omrecorder.C15044h.C15048b;
import omrecorder.C15044h.C15050d;
import omrecorder.C15056j;

public class AudioRecorderActivity extends C0295d implements C15050d, OnCompletionListener {

    /* renamed from: N */
    private C2796a f9925N;

    /* renamed from: O */
    private C2798b f9926O;

    /* renamed from: P */
    private int f9927P;

    /* renamed from: Q */
    private boolean f9928Q;

    /* renamed from: R */
    private boolean f9929R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public MediaPlayer f9930S;

    /* renamed from: T */
    private C15056j f9931T;

    /* renamed from: U */
    private C2795d f9932U;

    /* renamed from: V */
    private Timer f9933V;

    /* renamed from: W */
    private MenuItem f9934W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public int f9935X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public int f9936Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public boolean f9937Z;

    /* renamed from: a */
    private String f9938a;

    /* renamed from: a0 */
    private RelativeLayout f9939a0;

    /* renamed from: b */
    private C2799c f9940b;

    /* renamed from: b0 */
    private C3005e f9941b0;

    /* renamed from: c0 */
    private TextView f9942c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public TextView f9943d0;

    /* renamed from: e0 */
    private ImageButton f9944e0;

    /* renamed from: f0 */
    private ImageButton f9945f0;

    /* renamed from: g0 */
    private ImageButton f9946g0;

    /* renamed from: cafe.adriel.androidaudiorecorder.AudioRecorderActivity$a */
    class C2781a implements Runnable {
        C2781a() {
        }

        public void run() {
            if (AudioRecorderActivity.this.f9937Z) {
                AudioRecorderActivity.this.m13371D();
            } else {
                AudioRecorderActivity.this.m13372E();
            }
        }
    }

    /* renamed from: cafe.adriel.androidaudiorecorder.AudioRecorderActivity$b */
    class C2782b implements Runnable {
        C2782b() {
        }

        public void run() {
            if (AudioRecorderActivity.this.m13370C()) {
                AudioRecorderActivity.this.m13376J();
            } else {
                AudioRecorderActivity.this.m13374H();
            }
        }
    }

    /* renamed from: cafe.adriel.androidaudiorecorder.AudioRecorderActivity$c */
    class C2783c implements Runnable {
        C2783c() {
        }

        public void run() {
            AudioRecorderActivity.this.f9930S.setOnCompletionListener(AudioRecorderActivity.this);
        }
    }

    /* renamed from: cafe.adriel.androidaudiorecorder.AudioRecorderActivity$d */
    class C2784d extends TimerTask {
        C2784d() {
        }

        public void run() {
            AudioRecorderActivity.this.m13379M();
        }
    }

    /* renamed from: cafe.adriel.androidaudiorecorder.AudioRecorderActivity$e */
    class C2785e implements Runnable {
        C2785e() {
        }

        public void run() {
            if (AudioRecorderActivity.this.f9937Z) {
                AudioRecorderActivity.this.f9935X = AudioRecorderActivity.this.f9935X + 1;
                AudioRecorderActivity.this.f9943d0.setText(C2794c.m13406a(AudioRecorderActivity.this.f9935X));
            } else if (AudioRecorderActivity.this.m13370C()) {
                AudioRecorderActivity.this.f9936Y = AudioRecorderActivity.this.f9936Y + 1;
                AudioRecorderActivity.this.f9943d0.setText(C2794c.m13406a(AudioRecorderActivity.this.f9936Y));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public boolean m13370C() {
        try {
            return this.f9930S != null && this.f9930S.isPlaying() && !this.f9937Z;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public void m13371D() {
        this.f9937Z = false;
        if (!isFinishing()) {
            this.f9934W.setVisible(true);
        }
        this.f9942c0.setText(C2786R.string.aar_paused);
        this.f9942c0.setVisibility(0);
        this.f9944e0.setVisibility(0);
        this.f9946g0.setVisibility(0);
        this.f9945f0.setImageResource(C2786R.C2788drawable.aar_ic_rec);
        this.f9946g0.setImageResource(C2786R.C2788drawable.aar_ic_play);
        this.f9941b0.release();
        C2795d dVar = this.f9932U;
        if (dVar != null) {
            dVar.mo10544g();
        }
        C15056j jVar = this.f9931T;
        if (jVar != null) {
            jVar.mo46687d();
        }
        m13378L();
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public void m13372E() {
        this.f9937Z = true;
        this.f9934W.setVisible(false);
        this.f9942c0.setText(C2786R.string.aar_recording);
        this.f9942c0.setVisibility(0);
        this.f9944e0.setVisibility(4);
        this.f9946g0.setVisibility(4);
        this.f9945f0.setImageResource(C2786R.C2788drawable.aar_ic_pause);
        this.f9946g0.setImageResource(C2786R.C2788drawable.aar_ic_play);
        this.f9932U = new C2795d();
        this.f9941b0.mo11825a((C3001d<T>) this.f9932U);
        if (this.f9931T == null) {
            this.f9943d0.setText("00:00:00");
            this.f9931T = C15042f.m66698b(new C15048b(C2794c.m13407a(this.f9940b, this.f9925N, this.f9926O), (C15050d) this), new File(this.f9938a));
        }
        this.f9931T.mo46685b();
        m13375I();
    }

    /* renamed from: G */
    private void m13373G() {
        m13377K();
        setResult(-1);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public void m13374H() {
        try {
            m13377K();
            this.f9930S = new MediaPlayer();
            this.f9930S.setDataSource(this.f9938a);
            this.f9930S.prepare();
            this.f9930S.start();
            this.f9941b0.mo11825a((C3001d<T>) C3004c.m14342a((Context) this, this.f9930S));
            this.f9941b0.post(new C2783c());
            this.f9943d0.setText("00:00:00");
            this.f9942c0.setText(C2786R.string.aar_playing);
            this.f9942c0.setVisibility(0);
            this.f9946g0.setImageResource(C2786R.C2788drawable.aar_ic_stop);
            this.f9936Y = 0;
            m13375I();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: I */
    private void m13375I() {
        m13378L();
        this.f9933V = new Timer();
        this.f9933V.scheduleAtFixedRate(new C2784d(), 0, 1000);
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public void m13376J() {
        this.f9942c0.setText("");
        this.f9942c0.setVisibility(4);
        this.f9946g0.setImageResource(C2786R.C2788drawable.aar_ic_play);
        this.f9941b0.release();
        C2795d dVar = this.f9932U;
        if (dVar != null) {
            dVar.mo10544g();
        }
        MediaPlayer mediaPlayer = this.f9930S;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.stop();
                this.f9930S.reset();
            } catch (Exception unused) {
            }
        }
        m13378L();
    }

    /* renamed from: K */
    private void m13377K() {
        this.f9941b0.release();
        C2795d dVar = this.f9932U;
        if (dVar != null) {
            dVar.mo10544g();
        }
        this.f9935X = 0;
        C15056j jVar = this.f9931T;
        if (jVar != null) {
            try {
                jVar.mo46684a();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.f9931T = null;
        }
        m13378L();
    }

    /* renamed from: L */
    private void m13378L() {
        Timer timer = this.f9933V;
        if (timer != null) {
            timer.cancel();
            this.f9933V.purge();
            this.f9933V = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public void m13379M() {
        runOnUiThread(new C2785e());
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        m13376J();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C2786R.layout.aar_activity_audio_recorder);
        String str = "keepDisplayOn";
        String str2 = "autoStart";
        String str3 = "color";
        String str4 = "sampleRate";
        String str5 = "channel";
        String str6 = "source";
        String str7 = "filePath";
        if (bundle != null) {
            this.f9938a = bundle.getString(str7);
            this.f9940b = (C2799c) bundle.getSerializable(str6);
            this.f9925N = (C2796a) bundle.getSerializable(str5);
            this.f9926O = (C2798b) bundle.getSerializable(str4);
            this.f9927P = bundle.getInt(str3);
            this.f9928Q = bundle.getBoolean(str2);
            this.f9929R = bundle.getBoolean(str);
        } else {
            this.f9938a = getIntent().getStringExtra(str7);
            this.f9940b = (C2799c) getIntent().getSerializableExtra(str6);
            this.f9925N = (C2796a) getIntent().getSerializableExtra(str5);
            this.f9926O = (C2798b) getIntent().getSerializableExtra(str4);
            this.f9927P = getIntent().getIntExtra(str3, C0962e0.f4343t);
            this.f9928Q = getIntent().getBooleanExtra(str2, false);
            this.f9929R = getIntent().getBooleanExtra(str, false);
        }
        if (this.f9929R) {
            getWindow().addFlags(128);
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo970j(true);
            getSupportActionBar().mo950d(true);
            getSupportActionBar().mo961g(false);
            getSupportActionBar().mo921a(0.0f);
            getSupportActionBar().mo924a((Drawable) new ColorDrawable(C2794c.m13409b(this.f9927P)));
            getSupportActionBar().mo937b(C0841b.m4928c(this, C2786R.C2788drawable.aar_ic_clear));
        }
        this.f9941b0 = ((C3008c) ((C3008c) new C3008c(this).mo11852f(1).mo11853g(6).mo11855i(C2786R.dimen.aar_wave_height).mo11854h(C2786R.dimen.aar_footer_height).mo11849d(20).mo11851e(C2786R.dimen.aar_bubble_size).mo11845a(true).mo11856a(C2794c.m13409b(this.f9927P))).mo11857a(new int[]{this.f9927P})).mo11850d();
        this.f9939a0 = (RelativeLayout) findViewById(C2786R.C2789id.content);
        this.f9942c0 = (TextView) findViewById(C2786R.C2789id.status);
        this.f9943d0 = (TextView) findViewById(C2786R.C2789id.timer);
        this.f9944e0 = (ImageButton) findViewById(C2786R.C2789id.restart);
        this.f9945f0 = (ImageButton) findViewById(C2786R.C2789id.record);
        this.f9946g0 = (ImageButton) findViewById(C2786R.C2789id.play);
        this.f9939a0.setBackgroundColor(C2794c.m13409b(this.f9927P));
        this.f9939a0.addView(this.f9941b0, 0);
        this.f9944e0.setVisibility(4);
        this.f9946g0.setVisibility(4);
        if (C2794c.m13411d(this.f9927P)) {
            C0841b.m4928c(this, C2786R.C2788drawable.aar_ic_clear).setColorFilter(C0962e0.f4343t, Mode.SRC_ATOP);
            C0841b.m4928c(this, C2786R.C2788drawable.aar_ic_check).setColorFilter(C0962e0.f4343t, Mode.SRC_ATOP);
            this.f9942c0.setTextColor(C0962e0.f4343t);
            this.f9943d0.setTextColor(C0962e0.f4343t);
            this.f9944e0.setColorFilter(C0962e0.f4343t);
            this.f9945f0.setColorFilter(C0962e0.f4343t);
            this.f9946g0.setColorFilter(C0962e0.f4343t);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C2786R.C2790menu.aar_audio_recorder, menu);
        this.f9934W = menu.findItem(C2786R.C2789id.action_save);
        this.f9934W.setIcon(C0841b.m4928c(this, C2786R.C2788drawable.aar_ic_check));
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        restartRecording(null);
        setResult(0);
        try {
            this.f9941b0.release();
        } catch (Exception unused) {
        }
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
        } else if (itemId == C2786R.C2789id.action_save) {
            m13373G();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        restartRecording(null);
        try {
            this.f9941b0.onPause();
        } catch (Exception unused) {
        }
        super.onPause();
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (this.f9928Q && !this.f9937Z) {
            toggleRecording(null);
        }
    }

    public void onResume() {
        super.onResume();
        try {
            this.f9941b0.onResume();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString("filePath", this.f9938a);
        bundle.putInt("color", this.f9927P);
        super.onSaveInstanceState(bundle);
    }

    public void restartRecording(View view) {
        if (this.f9937Z) {
            m13377K();
        } else if (m13370C()) {
            m13376J();
        } else {
            this.f9932U = new C2795d();
            this.f9941b0.mo11825a((C3001d<T>) this.f9932U);
            this.f9941b0.release();
            C2795d dVar = this.f9932U;
            if (dVar != null) {
                dVar.mo10544g();
            }
        }
        this.f9934W.setVisible(false);
        this.f9942c0.setVisibility(4);
        this.f9944e0.setVisibility(4);
        this.f9946g0.setVisibility(4);
        this.f9945f0.setImageResource(C2786R.C2788drawable.aar_ic_rec);
        this.f9943d0.setText("00:00:00");
        this.f9935X = 0;
        this.f9936Y = 0;
    }

    public void togglePlaying(View view) {
        m13371D();
        C2794c.m13408a(100, new C2782b());
    }

    public void toggleRecording(View view) {
        m13376J();
        C2794c.m13408a(100, new C2781a());
    }

    /* renamed from: a */
    public void mo10520a(C15035b bVar) {
        this.f9932U.mo11831a(Float.valueOf(this.f9937Z ? (float) bVar.mo46693d() : 0.0f));
    }
}
