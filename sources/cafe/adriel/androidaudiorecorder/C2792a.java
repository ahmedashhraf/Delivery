package cafe.adriel.androidaudiorecorder;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Environment;
import androidx.fragment.app.Fragment;
import cafe.adriel.androidaudiorecorder.p151e.C2796a;
import cafe.adriel.androidaudiorecorder.p151e.C2798b;
import cafe.adriel.androidaudiorecorder.p151e.C2799c;

/* renamed from: cafe.adriel.androidaudiorecorder.a */
/* compiled from: AndroidAudioRecorder */
public class C2792a {

    /* renamed from: k */
    protected static final String f9953k = "filePath";

    /* renamed from: l */
    protected static final String f9954l = "color";

    /* renamed from: m */
    protected static final String f9955m = "source";

    /* renamed from: n */
    protected static final String f9956n = "channel";

    /* renamed from: o */
    protected static final String f9957o = "sampleRate";

    /* renamed from: p */
    protected static final String f9958p = "autoStart";

    /* renamed from: q */
    protected static final String f9959q = "keepDisplayOn";

    /* renamed from: a */
    private Activity f9960a;

    /* renamed from: b */
    private Fragment f9961b;

    /* renamed from: c */
    private String f9962c;

    /* renamed from: d */
    private C2799c f9963d = C2799c.MIC;

    /* renamed from: e */
    private C2796a f9964e = C2796a.STEREO;

    /* renamed from: f */
    private C2798b f9965f = C2798b.HZ_44100;

    /* renamed from: g */
    private int f9966g = Color.parseColor("#546E7A");

    /* renamed from: h */
    private int f9967h = 0;

    /* renamed from: i */
    private boolean f9968i = false;

    /* renamed from: j */
    private boolean f9969j = false;

    private C2792a(Activity activity) {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        sb.append("/recorded_audio.wav");
        this.f9962c = sb.toString();
        this.f9960a = activity;
    }

    /* renamed from: a */
    public static C2792a m13394a(Activity activity) {
        return new C2792a(activity);
    }

    /* renamed from: b */
    public C2792a mo10539b(int i) {
        this.f9967h = i;
        return this;
    }

    /* renamed from: a */
    public static C2792a m13395a(Fragment fragment) {
        return new C2792a(fragment);
    }

    /* renamed from: b */
    public C2792a mo10540b(boolean z) {
        this.f9969j = z;
        return this;
    }

    /* renamed from: a */
    public C2792a mo10536a(String str) {
        this.f9962c = str;
        return this;
    }

    /* renamed from: b */
    public void mo10541b() {
        Intent intent = new Intent(this.f9961b.getActivity(), AudioRecorderActivity.class);
        intent.putExtra(f9953k, this.f9962c);
        intent.putExtra(f9954l, this.f9966g);
        intent.putExtra("source", this.f9963d);
        intent.putExtra(f9956n, this.f9964e);
        intent.putExtra(f9957o, this.f9965f);
        intent.putExtra(f9958p, this.f9968i);
        intent.putExtra(f9959q, this.f9969j);
        this.f9961b.startActivityForResult(intent, this.f9967h);
    }

    /* renamed from: a */
    public C2792a mo10532a(int i) {
        this.f9966g = i;
        return this;
    }

    /* renamed from: a */
    public C2792a mo10535a(C2799c cVar) {
        this.f9963d = cVar;
        return this;
    }

    /* renamed from: a */
    public C2792a mo10533a(C2796a aVar) {
        this.f9964e = aVar;
        return this;
    }

    /* renamed from: a */
    public C2792a mo10534a(C2798b bVar) {
        this.f9965f = bVar;
        return this;
    }

    /* renamed from: a */
    public C2792a mo10537a(boolean z) {
        this.f9968i = z;
        return this;
    }

    /* renamed from: a */
    public void mo10538a() {
        Intent intent = new Intent(this.f9960a, AudioRecorderActivity.class);
        intent.putExtra(f9953k, this.f9962c);
        intent.putExtra(f9954l, this.f9966g);
        intent.putExtra("source", this.f9963d);
        intent.putExtra(f9956n, this.f9964e);
        intent.putExtra(f9957o, this.f9965f);
        intent.putExtra(f9958p, this.f9968i);
        intent.putExtra(f9959q, this.f9969j);
        this.f9960a.startActivityForResult(intent, this.f9967h);
    }

    private C2792a(Fragment fragment) {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        sb.append("/recorded_audio.wav");
        this.f9962c = sb.toString();
        this.f9961b = fragment;
    }
}
