package com.cleveroad.audiovisualization;

import android.content.Context;
import android.content.res.TypedArray;
import android.opengl.GLSurfaceView;
import android.opengl.GLSurfaceView.Renderer;
import android.util.AttributeSet;
import androidx.annotation.C0186e;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0202m;
import androidx.annotation.C0209o;
import androidx.core.content.C0841b;
import com.cleveroad.audiovisualization.C3020l.C3021a;

/* renamed from: com.cleveroad.audiovisualization.e */
/* compiled from: GLAudioVisualizationView */
public class C3005e extends GLSurfaceView implements C2998a, C3020l {

    /* renamed from: P */
    private static final int f10643P = 2;

    /* renamed from: N */
    private final C3010e f10644N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public C3021a f10645O;

    /* renamed from: a */
    private final C3016h f10646a;

    /* renamed from: b */
    private C3001d<?> f10647b;

    /* renamed from: com.cleveroad.audiovisualization.e$a */
    /* compiled from: GLAudioVisualizationView */
    class C3006a implements C3021a {
        C3006a() {
        }

        /* renamed from: a */
        public void mo11838a() {
            C3005e.this.mo11839a();
            if (C3005e.this.f10645O != null) {
                C3005e.this.f10645O.mo11838a();
            }
        }
    }

    /* renamed from: com.cleveroad.audiovisualization.e$b */
    /* compiled from: GLAudioVisualizationView */
    public interface C3007b extends Renderer {
        /* renamed from: a */
        void mo11843a(@C0193h0 C3009d dVar);
    }

    /* renamed from: com.cleveroad.audiovisualization.e$c */
    /* compiled from: GLAudioVisualizationView */
    public static class C3008c extends C3009d<C3008c> {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Context f10649d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f10650e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f10651f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public float f10652g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public float f10653h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public float f10654i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public boolean f10655j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f10656k;

        public C3008c(@C0193h0 Context context) {
            super(context);
            this.f10649d = context;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public C3008c m14364b() {
            return this;
        }

        /* renamed from: i */
        public C3008c mo11855i(@C0209o int i) {
            return mo11848c((float) this.f10649d.getResources().getDimensionPixelSize(i));
        }

        /* renamed from: a */
        public C3008c mo11844a(float f) {
            this.f10652g = f;
            return this;
        }

        /* renamed from: c */
        public C3008c mo11848c(float f) {
            this.f10653h = f;
            return this;
        }

        /* renamed from: d */
        public C3008c mo11849d(int i) {
            this.f10656k = i;
            return this;
        }

        /* renamed from: e */
        public C3008c mo11851e(@C0209o int i) {
            return mo11844a((float) this.f10649d.getResources().getDimensionPixelSize(i));
        }

        /* renamed from: f */
        public C3008c mo11852f(int i) {
            this.f10651f = i;
            return this;
        }

        /* renamed from: g */
        public C3008c mo11853g(int i) {
            this.f10650e = i;
            return this;
        }

        /* renamed from: h */
        public C3008c mo11854h(@C0209o int i) {
            return mo11847b((float) this.f10649d.getResources().getDimensionPixelSize(i));
        }

        /* renamed from: a */
        public C3008c mo11845a(boolean z) {
            this.f10655j = z;
            return this;
        }

        /* renamed from: b */
        public C3008c mo11847b(float f) {
            this.f10654i = f;
            return this;
        }

        /* renamed from: d */
        public C3005e mo11850d() {
            return new C3005e(this, (C3006a) null);
        }
    }

    /* renamed from: com.cleveroad.audiovisualization.e$d */
    /* compiled from: GLAudioVisualizationView */
    public static class C3009d<T extends C3009d> {

        /* renamed from: a */
        private float[] f10657a;

        /* renamed from: b */
        private float[][] f10658b;

        /* renamed from: c */
        private final Context f10659c;

        public C3009d(@C0193h0 Context context) {
            this.f10659c = context;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public float[] mo11858a() {
            return this.f10657a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public T mo11846b() {
            return this;
        }

        /* renamed from: b */
        public T mo11859b(@C0202m int i) {
            return mo11856a(C0841b.m4915a(this.f10659c, i));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public float[][] mo11861c() {
            return this.f10658b;
        }

        /* renamed from: a */
        public T mo11856a(@C0198k int i) {
            this.f10657a = C3023n.m14437a(i);
            return mo11846b();
        }

        /* renamed from: c */
        public T mo11860c(@C0186e int i) {
            TypedArray obtainTypedArray = this.f10659c.getResources().obtainTypedArray(i);
            int[] iArr = new int[obtainTypedArray.length()];
            for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                iArr[i2] = obtainTypedArray.getColor(i2, 0);
            }
            obtainTypedArray.recycle();
            return mo11857a(iArr);
        }

        /* renamed from: a */
        public T mo11857a(int[] iArr) {
            this.f10658b = new float[iArr.length][];
            for (int i = 0; i < iArr.length; i++) {
                this.f10658b[i] = C3023n.m14437a(iArr[i]);
            }
            return mo11846b();
        }
    }

    /* renamed from: com.cleveroad.audiovisualization.e$e */
    /* compiled from: GLAudioVisualizationView */
    static class C3010e {

        /* renamed from: a */
        int f10660a;

        /* renamed from: b */
        int f10661b;

        /* renamed from: c */
        int f10662c;

        /* renamed from: d */
        float f10663d;

        /* renamed from: e */
        float f10664e;

        /* renamed from: f */
        float f10665f;

        /* renamed from: g */
        boolean f10666g;

        /* renamed from: h */
        float[] f10667h;

        /* renamed from: i */
        float[][] f10668i;

        /* synthetic */ C3010e(C3008c cVar, C3006a aVar) {
            this(cVar);
        }

        /* JADX INFO: finally extract failed */
        public C3010e(Context context, AttributeSet attributeSet, boolean z) {
            int[] iArr;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2993R.styleable.GLAudioVisualizationView);
            try {
                this.f10661b = obtainStyledAttributes.getInt(C2993R.styleable.GLAudioVisualizationView_av_layersCount, 4);
                this.f10661b = C3023n.m14432a(this.f10661b, 1, 4);
                this.f10660a = obtainStyledAttributes.getInt(C2993R.styleable.GLAudioVisualizationView_av_wavesCount, 7);
                this.f10660a = C3023n.m14432a(this.f10660a, 1, 16);
                this.f10664e = (float) obtainStyledAttributes.getDimensionPixelSize(C2993R.styleable.GLAudioVisualizationView_av_wavesHeight, 10);
                this.f10664e = C3023n.m14428a(this.f10664e, 10.0f, 1920.0f);
                this.f10663d = (float) obtainStyledAttributes.getDimensionPixelSize(C2993R.styleable.GLAudioVisualizationView_av_bubblesSize, 20);
                this.f10663d = C3023n.m14428a(this.f10663d, 10.0f, 200.0f);
                this.f10666g = obtainStyledAttributes.getBoolean(C2993R.styleable.GLAudioVisualizationView_av_bubblesRandomizeSizes, false);
                this.f10665f = (float) obtainStyledAttributes.getDimensionPixelSize(C2993R.styleable.GLAudioVisualizationView_av_wavesFooterHeight, 640);
                this.f10665f = C3023n.m14428a(this.f10665f, 20.0f, 1080.0f);
                this.f10662c = obtainStyledAttributes.getInt(C2993R.styleable.GLAudioVisualizationView_av_bubblesPerLayer, 8);
                this.f10662c = C3023n.m14432a(this.f10662c, 1, 36);
                int color = obtainStyledAttributes.getColor(C2993R.styleable.GLAudioVisualizationView_av_backgroundColor, 0);
                if (color == 0) {
                    color = C0841b.m4915a(context, C2993R.C2994color.av_color_bg);
                }
                int resourceId = obtainStyledAttributes.getResourceId(C2993R.styleable.GLAudioVisualizationView_av_wavesColors, C2993R.array.av_colors);
                if (z) {
                    iArr = new int[this.f10661b];
                } else {
                    TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
                    int[] iArr2 = new int[obtainTypedArray.length()];
                    for (int i = 0; i < obtainTypedArray.length(); i++) {
                        iArr2[i] = obtainTypedArray.getColor(i, 0);
                    }
                    obtainTypedArray.recycle();
                    iArr = iArr2;
                }
                obtainStyledAttributes.recycle();
                if (iArr.length >= this.f10661b) {
                    this.f10668i = new float[iArr.length][];
                    for (int i2 = 0; i2 < iArr.length; i2++) {
                        this.f10668i[i2] = C3023n.m14437a(iArr[i2]);
                    }
                    this.f10667h = C3023n.m14437a(color);
                    this.f10663d /= (float) context.getResources().getDisplayMetrics().widthPixels;
                    return;
                }
                throw new IllegalArgumentException("You specified more layers than colors.");
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }

        private C3010e(@C0193h0 C3008c cVar) {
            this.f10664e = cVar.f10653h;
            this.f10664e = C3023n.m14428a(this.f10664e, 10.0f, 1920.0f);
            this.f10660a = cVar.f10650e;
            this.f10660a = C3023n.m14432a(this.f10660a, 1, 16);
            this.f10668i = cVar.mo11861c();
            this.f10663d = cVar.f10652g;
            this.f10663d = C3023n.m14428a(this.f10663d, 10.0f, 200.0f);
            this.f10663d /= (float) cVar.f10649d.getResources().getDisplayMetrics().widthPixels;
            this.f10665f = cVar.f10654i;
            this.f10665f = C3023n.m14428a(this.f10665f, 20.0f, 1080.0f);
            this.f10666g = cVar.f10655j;
            this.f10667h = cVar.mo11858a();
            this.f10661b = cVar.f10651f;
            this.f10662c = cVar.f10656k;
            C3023n.m14432a(this.f10662c, 1, 36);
            this.f10661b = C3023n.m14432a(this.f10661b, 1, 4);
            if (this.f10668i.length < this.f10661b) {
                throw new IllegalArgumentException("You specified more layers than colors.");
            }
        }
    }

    /* renamed from: com.cleveroad.audiovisualization.e$f */
    /* compiled from: GLAudioVisualizationView */
    public static class C3011f {

        /* renamed from: a */
        private final C3008c f10669a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public GLSurfaceView f10670b;

        /* renamed from: c */
        private C3001d f10671c;

        /* renamed from: com.cleveroad.audiovisualization.e$f$a */
        /* compiled from: GLAudioVisualizationView */
        class C3012a implements C3020l {

            /* renamed from: a */
            final /* synthetic */ C3016h f10672a;

            C3012a(C3016h hVar) {
                this.f10672a = hVar;
            }

            /* renamed from: a */
            public void mo11839a() {
                if (C3011f.this.f10670b.getRenderMode() != 0) {
                    C3011f.this.f10670b.setRenderMode(0);
                }
            }

            /* renamed from: a */
            public void mo11840a(@C0195i0 C3021a aVar) {
            }

            /* renamed from: b */
            public void mo11842b() {
                if (C3011f.this.f10670b.getRenderMode() != 1) {
                    C3011f.this.f10670b.setRenderMode(1);
                }
            }

            /* renamed from: a */
            public void mo11841a(float[] fArr, float[] fArr2) {
                this.f10672a.mo11871a(fArr, fArr2);
            }
        }

        /* renamed from: com.cleveroad.audiovisualization.e$f$b */
        /* compiled from: GLAudioVisualizationView */
        class C3013b implements C3021a {

            /* renamed from: a */
            final /* synthetic */ C3020l f10674a;

            C3013b(C3020l lVar) {
                this.f10674a = lVar;
            }

            /* renamed from: a */
            public void mo11838a() {
                this.f10674a.mo11839a();
            }
        }

        public C3011f(@C0193h0 C3008c cVar) {
            this.f10669a = cVar;
        }

        /* renamed from: a */
        public C3011f mo11864a(C3001d dVar) {
            this.f10671c = dVar;
            return this;
        }

        /* renamed from: a */
        public C3011f mo11863a(@C0193h0 GLSurfaceView gLSurfaceView) {
            this.f10670b = gLSurfaceView;
            return this;
        }

        /* renamed from: a */
        public C3007b mo11862a() {
            C3016h hVar = new C3016h(this.f10669a.f10649d, new C3010e(this.f10669a, null));
            C3012a aVar = new C3012a(hVar);
            hVar.mo11870a((C3021a) new C3013b(aVar));
            this.f10671c.mo11830a(aVar, this.f10669a.f10651f);
            return hVar;
        }
    }

    /* synthetic */ C3005e(C3008c cVar, C3006a aVar) {
        this(cVar);
    }

    /* renamed from: c */
    private void m14344c() {
        setEGLContextClientVersion(2);
        setRenderer(this.f10646a);
        this.f10646a.mo11870a((C3021a) new C3006a());
    }

    /* renamed from: b */
    public void mo11842b() {
        if (getRenderMode() != 1) {
            setRenderMode(1);
        }
    }

    public void onPause() {
        C3001d<?> dVar = this.f10647b;
        if (dVar != null) {
            dVar.mo11832b();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        C3001d<?> dVar = this.f10647b;
        if (dVar != null) {
            dVar.mo11833c();
        }
    }

    public void release() {
        C3001d<?> dVar = this.f10647b;
        if (dVar != null) {
            dVar.mo11834d();
            this.f10647b = null;
        }
    }

    private C3005e(@C0193h0 C3008c cVar) {
        super(cVar.f10649d);
        this.f10644N = new C3010e(cVar, null);
        this.f10646a = new C3016h(getContext(), this.f10644N);
        m14344c();
    }

    /* renamed from: a */
    public <T> void mo11825a(@C0193h0 C3001d<T> dVar) {
        C3001d<?> dVar2 = this.f10647b;
        if (dVar2 != null) {
            dVar2.mo11834d();
        }
        this.f10647b = dVar;
        this.f10647b.mo11830a(this, this.f10644N.f10661b);
    }

    public C3005e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10644N = new C3010e(context, attributeSet, isInEditMode());
        this.f10646a = new C3016h(getContext(), this.f10644N);
        m14344c();
    }

    /* renamed from: a */
    public void mo11839a() {
        if (getRenderMode() != 0) {
            setRenderMode(0);
        }
    }

    /* renamed from: a */
    public void mo11840a(@C0195i0 C3021a aVar) {
        this.f10645O = aVar;
    }

    /* renamed from: a */
    public void mo11841a(float[] fArr, float[] fArr2) {
        this.f10646a.mo11871a(fArr, fArr2);
    }
}
