package com.instabug.bug.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.transition.TransitionInflater;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.C0195i0;
import androidx.annotation.C0213q;
import androidx.core.p034l.C0962e0;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.instabug.bug.C9231R;
import com.instabug.bug.settings.C9291a;
import com.instabug.library.C9700R;
import com.instabug.library.Instabug;
import com.instabug.library.annotation.AnnotationLayout;
import com.instabug.library.core.p382ui.BaseContract;
import com.instabug.library.core.p382ui.BaseContract.Presenter;
import com.instabug.library.core.p382ui.BasePresenter;
import com.instabug.library.core.p382ui.C9792a;
import com.instabug.library.model.Attachment;
import com.instabug.library.model.Attachment.Type;
import com.instabug.library.util.AttrResolver;
import com.instabug.library.util.BitmapUtils;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.VideoManipulationUtils;
import com.instabug.library.view.IconView;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.bug.view.b */
/* compiled from: AttachmentsAdapter */
public class C9303b extends C1638g<C1635d0> {

    /* renamed from: l */
    private static transient /* synthetic */ boolean[] f24640l;

    /* renamed from: c */
    int[] f24641c = {C9231R.C9234drawable.ib_bug_ic_edit, C9231R.C9234drawable.ib_bug_ic_magnify, C9231R.C9234drawable.ib_bug_ic_blur};

    /* renamed from: d */
    private List<Attachment> f24642d;

    /* renamed from: e */
    private ColorFilter f24643e;

    /* renamed from: f */
    private C9309e f24644f;

    /* renamed from: g */
    private ProgressBar f24645g;

    /* renamed from: h */
    private ImageView f24646h;

    /* renamed from: i */
    private Context f24647i;

    /* renamed from: j */
    private int f24648j;

    /* renamed from: k */
    private int f24649k = -1;

    /* renamed from: com.instabug.bug.view.b$a */
    /* compiled from: AttachmentsAdapter */
    class C9304a implements Runnable {

        /* renamed from: P */
        private static transient /* synthetic */ boolean[] f24650P;

        /* renamed from: N */
        final /* synthetic */ Handler f24651N;

        /* renamed from: O */
        final /* synthetic */ C9303b f24652O;

        /* renamed from: a */
        final /* synthetic */ C9310f f24653a;

        /* renamed from: b */
        final /* synthetic */ int[] f24654b;

        C9304a(C9303b bVar, C9310f fVar, int[] iArr, Handler handler) {
            boolean[] a = m43623a();
            this.f24652O = bVar;
            this.f24653a = fVar;
            this.f24654b = iArr;
            this.f24651N = handler;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43623a() {
            boolean[] zArr = f24650P;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-919600840992431724L, "com/instabug/bug/view/AttachmentsAdapter$1", 9);
            f24650P = a;
            return a;
        }

        public void run() {
            boolean[] a = m43623a();
            int a2 = C9303b.m43598a(this.f24652O);
            C9303b bVar = this.f24652O;
            int[] iArr = bVar.f24641c;
            if (a2 < iArr.length - 1) {
                a[1] = true;
                this.f24653a.f24671v0.setImageResource(iArr[C9303b.m43598a(bVar)]);
                a[2] = true;
                C9303b.m43603b(this.f24652O);
                a[3] = true;
            } else {
                C9303b.m43599a(bVar, 0);
                int[] iArr2 = this.f24654b;
                iArr2[0] = iArr2[0] + 1;
                a[4] = true;
            }
            C9303b bVar2 = this.f24652O;
            Context c = C9303b.m43604c(bVar2);
            ImageView imageView = this.f24653a.f24671v0;
            C9303b bVar3 = this.f24652O;
            bVar2.mo33695a(c, imageView, bVar3.f24641c[C9303b.m43598a(bVar3)]);
            if (this.f24654b[0] >= 2) {
                a[5] = true;
            } else {
                a[6] = true;
                this.f24651N.postDelayed(this, 1500);
                a[7] = true;
            }
            a[8] = true;
        }
    }

    /* renamed from: com.instabug.bug.view.b$b */
    /* compiled from: AttachmentsAdapter */
    class C9305b implements AnimationListener {

        /* renamed from: P */
        private static transient /* synthetic */ boolean[] f24655P;

        /* renamed from: N */
        final /* synthetic */ Animation f24656N;

        /* renamed from: O */
        final /* synthetic */ C9303b f24657O;

        /* renamed from: a */
        final /* synthetic */ ImageView f24658a;

        /* renamed from: b */
        final /* synthetic */ int f24659b;

        /* renamed from: com.instabug.bug.view.b$b$a */
        /* compiled from: AttachmentsAdapter */
        class C9306a implements AnimationListener {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f24660b;

            /* renamed from: a */
            final /* synthetic */ C9305b f24661a;

            C9306a(C9305b bVar) {
                boolean[] a = m43625a();
                this.f24661a = bVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m43625a() {
                boolean[] zArr = f24660b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(4135705930319669644L, "com/instabug/bug/view/AttachmentsAdapter$2$1", 4);
                f24660b = a;
                return a;
            }

            public void onAnimationEnd(Animation animation) {
                m43625a()[3] = true;
            }

            public void onAnimationRepeat(Animation animation) {
                m43625a()[2] = true;
            }

            public void onAnimationStart(Animation animation) {
                m43625a()[1] = true;
            }
        }

        C9305b(C9303b bVar, ImageView imageView, int i, Animation animation) {
            boolean[] a = m43624a();
            this.f24657O = bVar;
            this.f24658a = imageView;
            this.f24659b = i;
            this.f24656N = animation;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43624a() {
            boolean[] zArr = f24655P;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(5471401621727921681L, "com/instabug/bug/view/AttachmentsAdapter$2", 6);
            f24655P = a;
            return a;
        }

        public void onAnimationEnd(Animation animation) {
            boolean[] a = m43624a();
            this.f24658a.setImageResource(this.f24659b);
            a[3] = true;
            this.f24656N.setAnimationListener(new C9306a(this));
            a[4] = true;
            this.f24658a.startAnimation(this.f24656N);
            a[5] = true;
        }

        public void onAnimationRepeat(Animation animation) {
            m43624a()[2] = true;
        }

        public void onAnimationStart(Animation animation) {
            m43624a()[1] = true;
        }
    }

    /* renamed from: com.instabug.bug.view.b$c */
    /* compiled from: AttachmentsAdapter */
    class C9307c implements OnClickListener {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f24662N;

        /* renamed from: a */
        final /* synthetic */ Attachment f24663a;

        /* renamed from: b */
        final /* synthetic */ C9303b f24664b;

        C9307c(C9303b bVar, Attachment attachment) {
            boolean[] a = m43626a();
            this.f24664b = bVar;
            this.f24663a = attachment;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43626a() {
            boolean[] zArr = f24662N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-659756882371525824L, "com/instabug/bug/view/AttachmentsAdapter$3", 2);
            f24662N = a;
            return a;
        }

        public void onClick(View view) {
            boolean[] a = m43626a();
            C9303b.m43606d(this.f24664b).mo33713a(view, this.f24663a);
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.bug.view.b$d */
    /* compiled from: AttachmentsAdapter */
    static /* synthetic */ class C9308d {

        /* renamed from: a */
        static final /* synthetic */ int[] f24665a = new int[Type.values().length];

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24666b;

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
                boolean[] r0 = m43627a()
                com.instabug.library.model.Attachment$Type[] r1 = com.instabug.library.model.Attachment.Type.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f24665a = r1
                r1 = 0
                r2 = 3
                r3 = 2
                r4 = 1
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0020 }
                int[] r1 = f24665a     // Catch:{ NoSuchFieldError -> 0x0020 }
                com.instabug.library.model.Attachment$Type r5 = com.instabug.library.model.Attachment.Type.IMAGE     // Catch:{ NoSuchFieldError -> 0x0020 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
                r1[r5] = r4     // Catch:{ NoSuchFieldError -> 0x0020 }
                r0[r4] = r4
                goto L_0x0022
            L_0x0020:
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x002f }
            L_0x0022:
                int[] r1 = f24665a     // Catch:{ NoSuchFieldError -> 0x002f }
                com.instabug.library.model.Attachment$Type r5 = com.instabug.library.model.Attachment.Type.MAIN_SCREENSHOT     // Catch:{ NoSuchFieldError -> 0x002f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002f }
                r1[r5] = r3     // Catch:{ NoSuchFieldError -> 0x002f }
                r0[r2] = r4
                goto L_0x0032
            L_0x002f:
                r1 = 4
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0032:
                int[] r1 = f24665a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.instabug.library.model.Attachment$Type r3 = com.instabug.library.model.Attachment.Type.VIDEO     // Catch:{ NoSuchFieldError -> 0x0040 }
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
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.bug.view.C9303b.C9308d.<clinit>():void");
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43627a() {
            boolean[] zArr = f24666b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(1036216764835851254L, "com/instabug/bug/view/AttachmentsAdapter$4", 8);
            f24666b = a;
            return a;
        }
    }

    /* renamed from: com.instabug.bug.view.b$e */
    /* compiled from: AttachmentsAdapter */
    public interface C9309e {
        /* renamed from: a */
        void mo33713a(View view, Attachment attachment);
    }

    /* renamed from: com.instabug.bug.view.b$f */
    /* compiled from: AttachmentsAdapter */
    public static class C9310f extends C1635d0 {

        /* renamed from: x0 */
        private static transient /* synthetic */ boolean[] f24667x0;

        /* renamed from: s0 */
        RelativeLayout f24668s0;

        /* renamed from: t0 */
        RelativeLayout f24669t0;

        /* renamed from: u0 */
        ImageView f24670u0;

        /* renamed from: v0 */
        ImageView f24671v0;

        /* renamed from: w0 */
        IconView f24672w0;

        public C9310f(View view) {
            boolean[] D = m43629D();
            super(view);
            D[0] = true;
            this.f24670u0 = (ImageView) view.findViewById(C9231R.C9235id.instabug_img_attachment);
            D[1] = true;
            this.f24671v0 = (ImageView) view.findViewById(C9231R.C9235id.instabug_btn_image_edit_attachment);
            D[2] = true;
            this.f24668s0 = (RelativeLayout) view.findViewById(C9231R.C9235id.instabug_attachment_img_item);
            D[3] = true;
            this.f24672w0 = (IconView) view.findViewById(C9231R.C9235id.instabug_btn_remove_attachment);
            D[4] = true;
            this.f24669t0 = (RelativeLayout) view.findViewById(C9231R.C9235id.instabug_attachemnt_thumb_background);
            D[5] = true;
        }

        /* renamed from: D */
        private static /* synthetic */ boolean[] m43629D() {
            boolean[] zArr = f24667x0;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-1032113584243893052L, "com/instabug/bug/view/AttachmentsAdapter$ImgViewHolder", 6);
            f24667x0 = a;
            return a;
        }
    }

    /* renamed from: com.instabug.bug.view.b$g */
    /* compiled from: AttachmentsAdapter */
    public static class C9311g extends C1635d0 {

        /* renamed from: y0 */
        private static transient /* synthetic */ boolean[] f24673y0;

        /* renamed from: s0 */
        RelativeLayout f24674s0;

        /* renamed from: t0 */
        RelativeLayout f24675t0;

        /* renamed from: u0 */
        ProgressBar f24676u0;

        /* renamed from: v0 */
        IconView f24677v0;

        /* renamed from: w0 */
        ImageView f24678w0;

        /* renamed from: x0 */
        ImageView f24679x0;

        public C9311g(View view) {
            boolean[] D = m43630D();
            super(view);
            D[0] = true;
            this.f24674s0 = (RelativeLayout) view.findViewById(C9231R.C9235id.instabug_attachment_video_item);
            D[1] = true;
            this.f24679x0 = (ImageView) view.findViewById(C9231R.C9235id.instabug_img_video_attachment);
            D[2] = true;
            this.f24677v0 = (IconView) view.findViewById(C9231R.C9235id.instabug_btn_remove_attachment);
            D[3] = true;
            this.f24676u0 = (ProgressBar) view.findViewById(C9231R.C9235id.instabug_attachment_progress_bar);
            D[4] = true;
            this.f24678w0 = (ImageView) view.findViewById(C9231R.C9235id.instabug_btn_video_play_attachment);
            D[5] = true;
            this.f24675t0 = (RelativeLayout) view.findViewById(C9231R.C9235id.instabug_attachemnt_thumb_background);
            ProgressBar progressBar = this.f24676u0;
            if (progressBar == null) {
                D[6] = true;
            } else {
                D[7] = true;
                Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
                D[8] = true;
                indeterminateDrawable.setColorFilter(Instabug.getPrimaryColor(), Mode.MULTIPLY);
                D[9] = true;
            }
            D[10] = true;
        }

        /* renamed from: D */
        private static /* synthetic */ boolean[] m43630D() {
            boolean[] zArr = f24673y0;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-9061464200867484637L, "com/instabug/bug/view/AttachmentsAdapter$VideoViewHolder", 11);
            f24673y0 = a;
            return a;
        }
    }

    /* renamed from: com.instabug.bug.view.b$h */
    /* compiled from: AnnotationContract */
    class C9312h {

        /* renamed from: com.instabug.bug.view.b$h$a */
        interface C9313a extends Presenter {
        }

        /* renamed from: com.instabug.bug.view.b$h$b */
        /* compiled from: AnnotationContract */
        interface C9314b extends BaseContract.View<Fragment> {
            /* renamed from: a */
            void mo33714a(Bitmap bitmap);

            /* renamed from: d */
            void mo33715d();
        }
    }

    /* renamed from: com.instabug.bug.view.b$i */
    /* compiled from: AnnotationFragment */
    public class C9315i extends C9792a<C9317j> implements C9314b {

        /* renamed from: Q */
        private static transient /* synthetic */ boolean[] f24680Q;

        /* renamed from: N */
        private AnnotationLayout f24681N;

        /* renamed from: O */
        private C9316a f24682O;

        /* renamed from: P */
        private Bitmap f24683P;

        /* renamed from: a */
        private String f24684a;

        /* renamed from: b */
        private Uri f24685b;

        /* renamed from: com.instabug.bug.view.b$i$a */
        /* compiled from: AnnotationFragment */
        public interface C9316a extends Serializable {
            /* renamed from: a */
            void mo33659a(@C0195i0 Bitmap bitmap, Uri uri);
        }

        public C9315i() {
            m43634e()[0] = true;
        }

        /* renamed from: a */
        public static C9315i m43633a(String str, Uri uri, String str2) {
            boolean[] e = m43634e();
            C9315i iVar = new C9315i();
            e[1] = true;
            Bundle bundle = new Bundle();
            e[2] = true;
            bundle.putString("title", str);
            e[3] = true;
            bundle.putParcelable("image_uri", uri);
            e[4] = true;
            bundle.putString("name", str2);
            e[5] = true;
            iVar.setArguments(bundle);
            e[6] = true;
            return iVar;
        }

        /* renamed from: e */
        private static /* synthetic */ boolean[] m43634e() {
            boolean[] zArr = f24680Q;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-2857747430177795310L, "com/instabug/bug/view/annotation/AnnotationFragment", 44);
            f24680Q = a;
            return a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo33716c() {
            boolean[] e = m43634e();
            this.f24682O.mo33659a(this.f24681N.getAnnotatedBitmap(), this.f24685b);
            e[26] = true;
            getActivity().getSupportFragmentManager().mo6224a().mo6094d((Fragment) this).mo6097e();
            e[27] = true;
            getActivity().getSupportFragmentManager().mo6231a("annotation_fragment_for_bug", 1);
            e[28] = true;
        }

        /* renamed from: d */
        public void mo33715d() {
            m43634e()[30] = true;
        }

        /* access modifiers changed from: protected */
        public int getLayout() {
            boolean[] e = m43634e();
            int i = C9231R.layout.ib_bug_fragment_annotation;
            e[19] = true;
            return i;
        }

        /* access modifiers changed from: protected */
        public void initViews(View view, Bundle bundle) {
            boolean[] e = m43634e();
            ((BugReportingActivity) getActivity()).mo33671i();
            e[20] = true;
            this.f24681N = (AnnotationLayout) findViewById(C9700R.C9704id.annotationLayout);
            e[21] = true;
            C0962e0.m5453a(this.f24681N.findViewById(C9231R.C9235id.instabug_annotation_image), getArguments().getString("name"));
            e[22] = true;
            ((C9317j) this.presenter).mo33719a(this.f24683P);
            e[23] = true;
            startPostponedEnterTransition();
            e[24] = true;
        }

        public void onCreate(Bundle bundle) {
            boolean[] e = m43634e();
            postponeEnterTransition();
            e[7] = true;
            super.onCreate(bundle);
            e[8] = true;
            setHasOptionsMenu(true);
            if (VERSION.SDK_INT < 21) {
                e[9] = true;
            } else {
                e[10] = true;
                setSharedElementEnterTransition(TransitionInflater.from(getContext()).inflateTransition(17760257));
                e[11] = true;
                setSharedElementReturnTransition(TransitionInflater.from(getContext()).inflateTransition(17760257));
                e[12] = true;
            }
            this.f24684a = getArguments().getString("title");
            e[13] = true;
            getActivity().setTitle(this.f24684a);
            e[14] = true;
            this.f24685b = (Uri) getArguments().getParcelable("image_uri");
            e[15] = true;
            this.presenter = new C9317j(this);
            e[16] = true;
            this.f24682O = (C9316a) getActivity();
            e[17] = true;
            this.f24683P = BitmapUtils.getBitmapFromUri(this.f24685b);
            e[18] = true;
        }

        public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
            boolean[] e = m43634e();
            menu.clear();
            e[31] = true;
            menuInflater.inflate(C9231R.C9236menu.instabug_bug_annoataion, menu);
            e[32] = true;
            super.onCreateOptionsMenu(menu, menuInflater);
            e[33] = true;
        }

        public void onDestroy() {
            boolean[] e = m43634e();
            ((BugReportingActivity) getActivity()).mo33671i();
            e[42] = true;
            super.onDestroy();
            e[43] = true;
        }

        public boolean onOptionsItemSelected(MenuItem menuItem) {
            boolean[] e = m43634e();
            if (menuItem.getItemId() == C9231R.C9235id.instabug_bugreporting_annotaion_done) {
                e[34] = true;
                mo33716c();
                e[35] = true;
                return true;
            }
            if (menuItem.getItemId() != 16908332) {
                e[36] = true;
            } else {
                e[37] = true;
                if (getActivity() == null) {
                    e[38] = true;
                } else {
                    e[39] = true;
                    getActivity().onBackPressed();
                    e[40] = true;
                }
            }
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            e[41] = true;
            return onOptionsItemSelected;
        }

        /* renamed from: a */
        public void mo33714a(Bitmap bitmap) {
            boolean[] e = m43634e();
            this.f24681N.setBitmap(bitmap);
            e[29] = true;
        }
    }

    /* renamed from: com.instabug.bug.view.b$j */
    /* compiled from: AnnotationPresenter */
    class C9317j extends BasePresenter<C9314b> implements C9313a {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f24686a;

        C9317j(C9314b bVar) {
            boolean[] d = m43639d();
            super(bVar);
            d[0] = true;
        }

        /* renamed from: d */
        private static /* synthetic */ boolean[] m43639d() {
            boolean[] zArr = f24686a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-4047724626682254479L, "com/instabug/bug/view/annotation/AnnotationPresenter", 8);
            f24686a = a;
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo33719a(Bitmap bitmap) {
            boolean[] d = m43639d();
            WeakReference<V> weakReference = this.view;
            if (weakReference == null) {
                d[1] = true;
            } else {
                d[2] = true;
                C9314b bVar = (C9314b) weakReference.get();
                if (bVar == null) {
                    d[3] = true;
                } else if (bitmap != null) {
                    d[4] = true;
                    bVar.mo33714a(bitmap);
                    d[5] = true;
                } else {
                    bVar.mo33715d();
                    d[6] = true;
                }
            }
            d[7] = true;
        }
    }

    public C9303b(Activity activity, ColorFilter colorFilter, C9309e eVar) {
        boolean[] j = m43607j();
        this.f24647i = activity;
        this.f24643e = colorFilter;
        this.f24644f = eVar;
        j[0] = true;
        this.f24642d = new ArrayList();
        j[1] = true;
    }

    /* renamed from: a */
    static /* synthetic */ int m43598a(C9303b bVar) {
        boolean[] j = m43607j();
        int i = bVar.f24648j;
        j[83] = true;
        return i;
    }

    /* renamed from: b */
    static /* synthetic */ int m43603b(C9303b bVar) {
        boolean[] j = m43607j();
        int i = bVar.f24648j;
        bVar.f24648j = i + 1;
        j[84] = true;
        return i;
    }

    /* renamed from: c */
    static /* synthetic */ Context m43604c(C9303b bVar) {
        boolean[] j = m43607j();
        Context context = bVar.f24647i;
        j[86] = true;
        return context;
    }

    /* renamed from: d */
    static /* synthetic */ C9309e m43606d(C9303b bVar) {
        boolean[] j = m43607j();
        C9309e eVar = bVar.f24644f;
        j[87] = true;
        return eVar;
    }

    /* renamed from: j */
    private static /* synthetic */ boolean[] m43607j() {
        boolean[] zArr = f24640l;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(4639369346188418353L, "com/instabug/bug/view/AttachmentsAdapter", 88);
        f24640l = a;
        return a;
    }

    /* renamed from: f */
    public ProgressBar mo33699f() {
        boolean[] j = m43607j();
        ProgressBar progressBar = this.f24645g;
        j[76] = true;
        return progressBar;
    }

    /* renamed from: g */
    public Attachment mo33701g(int i) {
        Attachment attachment = (Attachment) this.f24642d.get(i);
        m43607j()[2] = true;
        return attachment;
    }

    /* renamed from: h */
    public void mo33702h() {
        boolean[] j = m43607j();
        this.f24642d.clear();
        j[79] = true;
    }

    /* renamed from: i */
    public List<Attachment> mo33704i() {
        boolean[] j = m43607j();
        List<Attachment> list = this.f24642d;
        j[82] = true;
        return list;
    }

    /* renamed from: a */
    static /* synthetic */ int m43599a(C9303b bVar, int i) {
        boolean[] j = m43607j();
        bVar.f24648j = i;
        j[85] = true;
        return i;
    }

    /* renamed from: b */
    public long mo7326b(int i) {
        long j = (long) i;
        m43607j()[3] = true;
        return j;
    }

    /* renamed from: c */
    public int mo7333c(int i) {
        boolean[] j = m43607j();
        List<Attachment> list = this.f24642d;
        if (list == null) {
            j[18] = true;
        } else if (list.size() == 0) {
            j[19] = true;
        } else if (C9308d.f24665a[((Attachment) this.f24642d.get(i)).getType().ordinal()] != 3) {
            j[21] = true;
            return 0;
        } else {
            j[22] = true;
            return 1;
        }
        int c = super.mo7333c(i);
        j[20] = true;
        return c;
    }

    /* renamed from: g */
    public ImageView mo33700g() {
        boolean[] j = m43607j();
        ImageView imageView = this.f24646h;
        j[77] = true;
        return imageView;
    }

    /* renamed from: a */
    private void m43601a(C9310f fVar, Attachment attachment) {
        boolean[] j = m43607j();
        BitmapUtils.loadBitmap(attachment.getLocalPath(), fVar.f24670u0);
        j[23] = true;
        fVar.f24670u0.setTag(attachment);
        j[24] = true;
        fVar.f24668s0.setOnClickListener(m43605c(attachment));
        j[25] = true;
        fVar.f24672w0.setTag(attachment);
        j[26] = true;
        fVar.f24672w0.setOnClickListener(m43605c(attachment));
        j[27] = true;
        fVar.f24672w0.setTextColor(Instabug.getPrimaryColor());
        j[28] = true;
        C0962e0.m5453a((View) fVar.f24670u0, attachment.getName());
        j[29] = true;
        m43600a(fVar.f24669t0);
        j[30] = true;
        if (attachment.getType() != Type.MAIN_SCREENSHOT) {
            j[31] = true;
        } else {
            j[32] = true;
            if (!C9291a.m43476r().mo33622o()) {
                j[33] = true;
            } else {
                j[34] = true;
                fVar.f24672w0.setVisibility(8);
                j[35] = true;
            }
        }
        j[36] = true;
    }

    /* renamed from: b */
    public int mo7325b() {
        int i;
        boolean[] j = m43607j();
        List<Attachment> list = this.f24642d;
        if (list != null) {
            i = list.size();
            j[4] = true;
        } else {
            i = 0;
            j[5] = true;
        }
        j[6] = true;
        return i;
    }

    /* renamed from: h */
    public void mo33703h(int i) {
        boolean[] j = m43607j();
        this.f24649k = i;
        j[81] = true;
    }

    /* renamed from: b */
    public C1635d0 mo7327b(ViewGroup viewGroup, int i) {
        boolean[] j = m43607j();
        if (i != 1) {
            C9310f fVar = new C9310f(LayoutInflater.from(viewGroup.getContext()).inflate(C9231R.layout.ib_bug_lyt_attachment_image, viewGroup, false));
            j[7] = true;
            return fVar;
        }
        C9311g gVar = new C9311g(LayoutInflater.from(viewGroup.getContext()).inflate(C9231R.layout.ib_bug_lyt_attachment_video, viewGroup, false));
        j[8] = true;
        return gVar;
    }

    /* renamed from: b */
    public void mo7330b(C1635d0 d0Var, int i) {
        boolean[] j = m43607j();
        if (mo7333c(i) != 1) {
            C9310f fVar = (C9310f) d0Var;
            m43601a(fVar, mo33701g(i));
            j[9] = true;
            int i2 = this.f24649k;
            if (i2 == -1) {
                j[10] = true;
            } else if (i != i2) {
                j[11] = true;
            } else if (!mo33701g(i).shouldAnimate()) {
                j[12] = true;
            } else {
                j[13] = true;
                mo33696a(fVar);
                j[14] = true;
                mo33701g(i).setShouldAnimate(false);
                j[15] = true;
            }
        } else {
            m43602a((C9311g) d0Var, mo33701g(i));
            j[16] = true;
        }
        j[17] = true;
    }

    /* renamed from: c */
    private OnClickListener m43605c(Attachment attachment) {
        boolean[] j = m43607j();
        C9307c cVar = new C9307c(this, attachment);
        j[75] = true;
        return cVar;
    }

    /* renamed from: b */
    public void mo33698b(Attachment attachment) {
        boolean[] j = m43607j();
        this.f24642d.remove(attachment);
        j[80] = true;
    }

    /* renamed from: a */
    public void mo33696a(C9310f fVar) {
        boolean[] j = m43607j();
        int[] iArr = {0};
        if (iArr[0] >= 2) {
            j[37] = true;
        } else {
            j[38] = true;
            Handler handler = new Handler();
            j[39] = true;
            handler.postDelayed(new C9304a(this, fVar, iArr, handler), 1000);
            j[40] = true;
        }
        j[41] = true;
    }

    /* renamed from: a */
    public void mo33695a(Context context, ImageView imageView, @C0213q int i) {
        boolean[] j = m43607j();
        Animation loadAnimation = AnimationUtils.loadAnimation(context, C9231R.anim.instabug_fadeout);
        j[42] = true;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, C9231R.anim.instabug_fadein);
        j[43] = true;
        loadAnimation.setAnimationListener(new C9305b(this, imageView, i, loadAnimation2));
        j[44] = true;
        imageView.startAnimation(loadAnimation);
        j[45] = true;
    }

    /* renamed from: a */
    private void m43600a(RelativeLayout relativeLayout) {
        boolean[] j = m43607j();
        Drawable drawable = this.f24647i.getResources().getDrawable(C9231R.C9234drawable.ib_bug_shape_attachment_border);
        Context context = this.f24647i;
        int i = C9231R.attr.attachment_border_color;
        j[46] = true;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(AttrResolver.resolveAttributeColor(context, i), Mode.SRC_IN);
        j[47] = true;
        drawable.setColorFilter(porterDuffColorFilter);
        j[48] = true;
        relativeLayout.setBackgroundDrawable(drawable);
        j[49] = true;
    }

    /* renamed from: a */
    private void m43602a(C9311g gVar, Attachment attachment) {
        boolean[] j = m43607j();
        gVar.f24677v0.findViewById(C9231R.C9235id.instabug_btn_remove_attachment).setTag(attachment);
        j[50] = true;
        gVar.f24677v0.findViewById(C9231R.C9235id.instabug_btn_remove_attachment).setOnClickListener(m43605c(attachment));
        j[51] = true;
        gVar.f24677v0.setTextColor(Instabug.getPrimaryColor());
        j[52] = true;
        gVar.f24678w0.setColorFilter(this.f24643e);
        j[53] = true;
        gVar.f24679x0.setTag(attachment);
        j[54] = true;
        gVar.f24674s0.setOnClickListener(m43605c(attachment));
        this.f24646h = gVar.f24678w0;
        this.f24645g = gVar.f24676u0;
        j[55] = true;
        StringBuilder sb = new StringBuilder();
        sb.append("encoded: ");
        sb.append(attachment.isVideoEncoded());
        InstabugSDKLogger.m46622d(this, sb.toString());
        j[56] = true;
        if (attachment.getLocalPath() == null) {
            j[57] = true;
        } else if (!attachment.isVideoEncoded()) {
            j[58] = true;
        } else {
            try {
                j[59] = true;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Video path found, extracting it's first frame ");
                sb2.append(attachment.getLocalPath());
                InstabugSDKLogger.m46622d(this, sb2.toString());
                j[60] = true;
                Bitmap extractFirstVideoFrame = VideoManipulationUtils.extractFirstVideoFrame(attachment.getLocalPath());
                j[61] = true;
                gVar.f24679x0.setImageBitmap(extractFirstVideoFrame);
                j[62] = true;
            } catch (IllegalArgumentException unused) {
                j[63] = true;
            }
            m43600a(gVar.f24675t0);
            j[74] = true;
        }
        InstabugSDKLogger.m46622d(this, "Neither video path nor main screenshot found, using white background");
        j[64] = true;
        gVar.f24679x0.setImageResource(C9231R.C9234drawable.instabug_bg_card);
        j[65] = true;
        ProgressBar progressBar = this.f24645g;
        if (progressBar == null) {
            j[66] = true;
        } else if (progressBar.getVisibility() != 8) {
            j[67] = true;
        } else {
            j[68] = true;
            this.f24645g.setVisibility(0);
            j[69] = true;
        }
        ImageView imageView = this.f24646h;
        if (imageView == null) {
            j[70] = true;
        } else if (imageView.getVisibility() != 0) {
            j[71] = true;
        } else {
            j[72] = true;
            this.f24646h.setVisibility(8);
            j[73] = true;
        }
        m43600a(gVar.f24675t0);
        j[74] = true;
    }

    /* renamed from: a */
    public void mo33697a(Attachment attachment) {
        boolean[] j = m43607j();
        this.f24642d.add(attachment);
        j[78] = true;
    }
}
