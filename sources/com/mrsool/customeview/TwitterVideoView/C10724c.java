package com.mrsool.customeview.TwitterVideoView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.mrsool.C10232R;
import com.mrsool.chat.C10526n;
import com.mrsool.utils.C11668s;
import com.mrsool.utils.C5880q;

/* renamed from: com.mrsool.customeview.TwitterVideoView.c */
/* compiled from: PlayerController */
public class C10724c {

    /* renamed from: j */
    private static final String f29411j = "PlayerController";

    /* renamed from: a */
    public VideoView f29412a;

    /* renamed from: b */
    public VideoControlView f29413b;

    /* renamed from: c */
    final ProgressBar f29414c;

    /* renamed from: d */
    final TextView f29415d;

    /* renamed from: e */
    final View f29416e;

    /* renamed from: f */
    int f29417f;

    /* renamed from: g */
    boolean f29418g = true;

    /* renamed from: h */
    boolean f29419h;

    /* renamed from: i */
    public C10729d f29420i;

    /* renamed from: com.mrsool.customeview.TwitterVideoView.c$a */
    /* compiled from: PlayerController */
    class C10725a implements OnPreparedListener {

        /* renamed from: a */
        final /* synthetic */ C11668s f29422a;

        /* renamed from: b */
        final /* synthetic */ int f29423b;

        C10725a(C11668s sVar, int i) {
            this.f29422a = sVar;
            this.f29423b = i;
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            C10724c.this.f29414c.setVisibility(8);
            if (this.f29422a.f33573R) {
                mediaPlayer.setVolume(0.0f, 0.0f);
            }
            C10724c.this.f29412a.start();
            int i = this.f29423b;
            if (i > 0) {
                C10724c.this.f29412a.mo38169a(i);
            }
            C10729d dVar = C10724c.this.f29420i;
            if (dVar != null) {
                dVar.start();
            }
        }
    }

    /* renamed from: com.mrsool.customeview.TwitterVideoView.c$b */
    /* compiled from: PlayerController */
    class C10726b implements OnInfoListener {
        C10726b() {
        }

        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (i == 702) {
                C10724c.this.f29414c.setVisibility(8);
                C10729d dVar = C10724c.this.f29420i;
                if (dVar != null) {
                    dVar.start();
                }
                return true;
            } else if (i != 701) {
                return false;
            } else {
                C10724c.this.f29414c.setVisibility(0);
                C10729d dVar2 = C10724c.this.f29420i;
                if (dVar2 != null) {
                    dVar2.mo38223b();
                }
                return true;
            }
        }
    }

    /* renamed from: com.mrsool.customeview.TwitterVideoView.c$c */
    /* compiled from: PlayerController */
    class C10727c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f29425a;

        C10727c(String str) {
            this.f29425a = str;
        }

        public void onClick(View view) {
            C10724c.this.f29415d.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f29425a)));
        }
    }

    /* renamed from: com.mrsool.customeview.TwitterVideoView.c$d */
    /* compiled from: PlayerController */
    class C10728d implements OnClickListener {
        C10728d() {
        }

        public void onClick(View view) {
            if (C10724c.this.f29415d.getVisibility() == 0) {
                C10724c.this.f29415d.setVisibility(8);
            } else {
                C10724c.this.f29415d.setVisibility(0);
            }
        }
    }

    public C10724c(View view) {
        this.f29416e = view;
        this.f29412a = (VideoView) view.findViewById(C10232R.C10236id.video_view);
        this.f29413b = (VideoControlView) view.findViewById(C10232R.C10236id.video_control_view);
        this.f29414c = (ProgressBar) view.findViewById(C10232R.C10236id.video_progress_view);
        this.f29415d = (TextView) view.findViewById(C10232R.C10236id.call_to_action_view);
    }

    /* renamed from: a */
    public void mo38201a(VideoView videoView) {
        this.f29412a = videoView;
    }

    /* renamed from: b */
    public int mo38208b() {
        return this.f29417f;
    }

    /* renamed from: c */
    public VideoView mo38209c() {
        return this.f29412a;
    }

    /* renamed from: d */
    public C10729d mo38210d() {
        return this.f29420i;
    }

    /* renamed from: e */
    public boolean mo38211e() {
        return this.f29419h;
    }

    /* renamed from: f */
    public void mo38212f() {
        this.f29412a.mo38177b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo38213g() {
        this.f29418g = this.f29412a.mo38170a();
        this.f29417f = this.f29412a.getCurrentPosition();
        this.f29412a.mo38174o();
    }

    /* renamed from: h */
    public void mo38214h() {
        int i = this.f29417f;
        if (i != 0) {
            this.f29412a.mo38169a(i);
        }
        if (this.f29418g) {
            this.f29412a.start();
            this.f29413b.mo38157i();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo38215i() {
        this.f29413b.setVisibility(4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo38216j() {
        this.f29412a.setMediaController(this.f29413b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo38217k() {
        this.f29416e.setOnClickListener(new C10728d());
    }

    /* renamed from: l */
    public void mo38218l() {
        this.f29412a.mo38169a((int) C10526n.f28536a);
        if (this.f29418g) {
            this.f29412a.start();
            this.f29413b.mo38157i();
        }
    }

    /* renamed from: a */
    public void mo38204a(C11668s sVar, int i) {
        try {
            mo38203a(sVar);
            mo38207a(sVar.f33576b, sVar.f33569N);
            if (!sVar.f33573R) {
                mo38216j();
            }
            this.f29412a.setOnPreparedListener(new C10725a(sVar, i));
            this.f29412a.setOnInfoListener(new C10726b());
            this.f29412a.mo38176a(Uri.parse(sVar.f33575a), sVar.f33576b);
            this.f29412a.requestFocus();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("PlayerControllerError occurred during video playback ");
            sb.append(e);
            C5880q.m25751b(sb.toString());
        }
    }

    public C10724c(View view, VideoView videoView, VideoControlView videoControlView, ProgressBar progressBar, TextView textView) {
        this.f29416e = view;
        this.f29412a = videoView;
        this.f29413b = videoControlView;
        this.f29414c = progressBar;
        this.f29415d = textView;
    }

    /* renamed from: a */
    public void mo38206a(boolean z) {
        this.f29419h = z;
    }

    /* renamed from: a */
    public void mo38200a(int i) {
        this.f29417f = i;
    }

    /* renamed from: a */
    public int mo38199a() {
        return this.f29412a.getCurrentPosition();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38207a(boolean z, boolean z2) {
        if (!z || z2) {
            mo38216j();
        } else {
            mo38215i();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38203a(C11668s sVar) {
        if (sVar.f33571P != null && sVar.f33570O != null) {
            this.f29415d.setVisibility(0);
            this.f29415d.setText(sVar.f33571P);
            mo38205a(sVar.f33570O);
            mo38217k();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38205a(String str) {
        this.f29415d.setOnClickListener(new C10727c(str));
    }

    /* renamed from: a */
    public void mo38202a(C10729d dVar) {
        this.f29420i = dVar;
    }
}
