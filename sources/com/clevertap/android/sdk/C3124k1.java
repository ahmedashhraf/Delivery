package com.clevertap.android.sdk;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0193h0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1657q;
import androidx.recyclerview.widget.RecyclerView.C1660t;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player.EventListener;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.Factory;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;

/* renamed from: com.clevertap.android.sdk.k1 */
/* compiled from: MediaPlayerRecyclerView */
public class C3124k1 extends RecyclerView {

    /* renamed from: N */
    private Context f11181N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public C3080d0 f11182O;

    /* renamed from: a */
    SimpleExoPlayer f11183a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public PlayerView f11184b;

    /* renamed from: com.clevertap.android.sdk.k1$a */
    /* compiled from: MediaPlayerRecyclerView */
    class C3125a extends C1660t {
        C3125a() {
        }

        /* renamed from: a */
        public void mo7531a(@C0193h0 RecyclerView recyclerView, int i) {
            super.mo7531a(recyclerView, i);
            if (i == 0) {
                C3124k1.this.mo12342c();
            }
        }

        /* renamed from: a */
        public void mo7532a(@C0193h0 RecyclerView recyclerView, int i, int i2) {
            super.mo7532a(recyclerView, i, i2);
        }
    }

    /* renamed from: com.clevertap.android.sdk.k1$b */
    /* compiled from: MediaPlayerRecyclerView */
    class C3126b implements C1657q {
        C3126b() {
        }

        /* renamed from: a */
        public void mo7525a(@C0193h0 View view) {
            if (C3124k1.this.f11182O != null && C3124k1.this.f11182O.f6294a.equals(view)) {
                C3124k1.this.mo12345f();
            }
        }

        /* renamed from: b */
        public void mo7526b(@C0193h0 View view) {
        }
    }

    /* renamed from: com.clevertap.android.sdk.k1$c */
    /* compiled from: MediaPlayerRecyclerView */
    class C3127c implements EventListener {
        C3127c() {
        }

        /* renamed from: a */
        public void mo12346a() {
        }

        /* renamed from: a */
        public void mo12347a(int i) {
        }

        /* renamed from: a */
        public void mo12348a(ExoPlaybackException exoPlaybackException) {
        }

        /* renamed from: a */
        public void mo12349a(PlaybackParameters playbackParameters) {
        }

        /* renamed from: a */
        public void mo12350a(Timeline timeline, Object obj, int i) {
        }

        /* renamed from: a */
        public void mo12351a(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        }

        /* renamed from: a */
        public void mo12352a(boolean z) {
        }

        /* renamed from: a */
        public void mo12353a(boolean z, int i) {
            if (i == 1) {
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        SimpleExoPlayer simpleExoPlayer = C3124k1.this.f11183a;
                        if (simpleExoPlayer != null) {
                            simpleExoPlayer.seekTo(0);
                            C3124k1.this.f11183a.setPlayWhenReady(false);
                            if (C3124k1.this.f11184b != null) {
                                C3124k1.this.f11184b.showController();
                            }
                        }
                    }
                } else if (C3124k1.this.f11182O != null) {
                    C3124k1.this.f11182O.mo12225H();
                }
            } else if (C3124k1.this.f11182O != null) {
                C3124k1.this.f11182O.mo12224G();
            }
        }

        /* renamed from: b */
        public void mo12354b(int i) {
        }

        /* renamed from: b */
        public void mo12355b(boolean z) {
        }
    }

    public C3124k1(Context context) {
        super(context);
        m14999a(context);
    }

    /* renamed from: g */
    private C3080d0 m15001g() {
        int N = ((LinearLayoutManager) getLayoutManager()).mo6959N();
        int P = ((LinearLayoutManager) getLayoutManager()).mo6961P();
        C3080d0 d0Var = null;
        int i = 0;
        for (int i2 = N; i2 <= P; i2++) {
            View childAt = getChildAt(i2 - N);
            if (childAt != null) {
                C3080d0 d0Var2 = (C3080d0) childAt.getTag();
                if (d0Var2 != null && d0Var2.mo12223F()) {
                    Rect rect = new Rect();
                    int height = d0Var2.f6294a.getGlobalVisibleRect(rect) ? rect.height() : 0;
                    if (height > i) {
                        d0Var = d0Var2;
                        i = height;
                    }
                }
            }
        }
        return d0Var;
    }

    /* renamed from: h */
    private void m15002h() {
        PlayerView playerView = this.f11184b;
        if (playerView != null) {
            ViewGroup viewGroup = (ViewGroup) playerView.getParent();
            if (viewGroup != null) {
                int indexOfChild = viewGroup.indexOfChild(this.f11184b);
                if (indexOfChild >= 0) {
                    viewGroup.removeViewAt(indexOfChild);
                    SimpleExoPlayer simpleExoPlayer = this.f11183a;
                    if (simpleExoPlayer != null) {
                        simpleExoPlayer.stop();
                    }
                    C3080d0 d0Var = this.f11182O;
                    if (d0Var != null) {
                        d0Var.mo12226I();
                        this.f11182O = null;
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void mo12342c() {
        if (this.f11184b != null) {
            C3080d0 g = m15001g();
            if (g == null) {
                mo12345f();
                m15002h();
                return;
            }
            C3080d0 d0Var = this.f11182O;
            if (d0Var == null || !d0Var.f6294a.equals(g.f6294a)) {
                m15002h();
                if (g.mo12230a(this.f11184b)) {
                    this.f11182O = g;
                }
                return;
            }
            Rect rect = new Rect();
            int height = this.f11182O.f6294a.getGlobalVisibleRect(rect) ? rect.height() : 0;
            if (this.f11183a != null) {
                if (!(height >= 400)) {
                    this.f11183a.setPlayWhenReady(false);
                } else if (this.f11182O.mo12227J()) {
                    this.f11183a.setPlayWhenReady(true);
                }
            }
        }
    }

    /* renamed from: d */
    public void mo12343d() {
        SimpleExoPlayer simpleExoPlayer = this.f11183a;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.stop();
            this.f11183a.release();
            this.f11183a = null;
        }
        this.f11182O = null;
        this.f11184b = null;
    }

    /* renamed from: e */
    public void mo12344e() {
        if (this.f11184b != null) {
            m15002h();
            this.f11184b = null;
        }
    }

    /* renamed from: f */
    public void mo12345f() {
        SimpleExoPlayer simpleExoPlayer = this.f11183a;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.stop();
        }
        this.f11182O = null;
    }

    /* renamed from: a */
    private void m14999a(Context context) {
        this.f11181N = context.getApplicationContext();
        this.f11184b = new PlayerView(this.f11181N);
        this.f11184b.setBackgroundColor(0);
        if (CTInboxActivity.f10825R == 2) {
            this.f11184b.setResizeMode(3);
        } else {
            this.f11184b.setResizeMode(0);
        }
        this.f11184b.setUseArtwork(true);
        this.f11184b.setDefaultArtwork(C3238w1.m15658a(context.getResources().getDrawable(C3058R.C3060drawable.ct_audio)));
        this.f11183a = ExoPlayerFactory.newSimpleInstance(this.f11181N, new DefaultTrackSelector(new Factory(new DefaultBandwidthMeter())));
        this.f11183a.setVolume(0.0f);
        this.f11184b.setUseController(true);
        this.f11184b.setControllerAutoShow(false);
        this.f11184b.setPlayer(this.f11183a);
        addOnScrollListener(new C3125a());
        addOnChildAttachStateChangeListener(new C3126b());
        this.f11183a.addListener(new C3127c());
    }

    /* renamed from: b */
    public void mo12341b() {
        if (this.f11184b == null) {
            m14999a(this.f11181N);
            mo12342c();
        }
    }

    public C3124k1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m14999a(context);
    }

    public C3124k1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m14999a(context);
    }

    /* renamed from: a */
    public void mo12340a() {
        SimpleExoPlayer simpleExoPlayer = this.f11183a;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.setPlayWhenReady(false);
        }
    }
}
