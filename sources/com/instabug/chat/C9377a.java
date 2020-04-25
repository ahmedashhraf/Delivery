package com.instabug.chat;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.instabug.chat.cache.C9409a;
import com.instabug.chat.cache.ChatsCacheManager;
import com.instabug.chat.model.C9425c;
import com.instabug.chat.model.Message;
import com.instabug.chat.model.Message.C9418a;
import com.instabug.chat.p361ui.C9456b;
import com.instabug.chat.settings.C9441a;
import com.instabug.chat.synchronization.SynchronizationManager;
import com.instabug.library.C9700R;
import com.instabug.library.Feature;
import com.instabug.library.Feature.State;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.InstabugCustomTextPlaceHolder.Key;
import com.instabug.library.PresentationManager;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.CurrentActivityLifeCycleEventBus;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventSubscriber;
import com.instabug.library.core.plugin.PluginPromptOption;
import com.instabug.library.core.plugin.PluginPromptOption.OnInvocationListener;
import com.instabug.library.internal.device.InstabugDeviceProperties;
import com.instabug.library.internal.storage.cache.AssetsCacheManager;
import com.instabug.library.internal.storage.cache.AssetsCacheManager.OnDownloadFinished;
import com.instabug.library.invocation.invocationdialog.InstabugDialogActivity;
import com.instabug.library.model.AssetEntity;
import com.instabug.library.model.AssetEntity.AssetType;
import com.instabug.library.p397ui.custom.CircularImageView;
import com.instabug.library.tracking.ActivityLifeCycleEvent;
import com.instabug.library.util.InstabugAppData;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.LocaleUtils;
import com.instabug.library.util.PlaceHolderUtils;
import com.instabug.library.util.ScreenUtility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.instabug.chat.a */
/* compiled from: ChatPluginWrapper */
class C9377a {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f24819a;

    /* renamed from: com.instabug.chat.a$a */
    /* compiled from: ChatPluginWrapper */
    static class C9378a implements OnInvocationListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24820b;

        /* renamed from: a */
        final /* synthetic */ Context f24821a;

        C9378a(Context context) {
            boolean[] a = m43879a();
            this.f24821a = context;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43879a() {
            boolean[] zArr = f24820b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-3473161128333430393L, "com/instabug/chat/ChatPluginWrapper$1", 2);
            f24820b = a;
            return a;
        }

        public void onInvoke(Uri uri) {
            boolean[] a = m43879a();
            C9377a.m43872d(this.f24821a);
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.chat.a$b */
    /* compiled from: ChatPluginWrapper */
    static class C9379b implements C12331g<SDKCoreEvent> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24822b;

        /* renamed from: a */
        final /* synthetic */ Context f24823a;

        C9379b(Context context) {
            boolean[] a = m43880a();
            this.f24823a = context;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43880a() {
            boolean[] zArr = f24822b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-345505422005127810L, "com/instabug/chat/ChatPluginWrapper$2", 3);
            f24822b = a;
            return a;
        }

        /* renamed from: a */
        public void mo33812a(SDKCoreEvent sDKCoreEvent) {
            boolean[] a = m43880a();
            C9404c.m43984a(this.f24823a, sDKCoreEvent);
            a[1] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m43880a();
            mo33812a((SDKCoreEvent) obj);
            a[2] = true;
        }
    }

    /* renamed from: com.instabug.chat.a$c */
    /* compiled from: NotificationBarInvoker */
    public class C9380c {

        /* renamed from: g */
        private static transient /* synthetic */ boolean[] f24824g;

        /* renamed from: a */
        private View f24825a;

        /* renamed from: b */
        private boolean f24826b = false;

        /* renamed from: c */
        private boolean f24827c;

        /* renamed from: d */
        private boolean f24828d;

        /* renamed from: e */
        private C9425c f24829e;

        /* renamed from: f */
        private C9395n f24830f;

        /* renamed from: com.instabug.chat.a$c$a */
        /* compiled from: NotificationBarInvoker */
        class C9381a implements Runnable {

            /* renamed from: P */
            private static transient /* synthetic */ boolean[] f24831P;

            /* renamed from: N */
            final /* synthetic */ C9425c f24832N;

            /* renamed from: O */
            final /* synthetic */ C9380c f24833O;

            /* renamed from: a */
            final /* synthetic */ Activity f24834a;

            /* renamed from: b */
            final /* synthetic */ CircularImageView f24835b;

            C9381a(C9380c cVar, Activity activity, CircularImageView circularImageView, C9425c cVar2) {
                boolean[] a = m43911a();
                this.f24833O = cVar;
                this.f24834a = activity;
                this.f24835b = circularImageView;
                this.f24832N = cVar2;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m43911a() {
                boolean[] zArr = f24831P;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-7267587022465322753L, "com/instabug/chat/notification/NotificationBarInvoker$7", 11);
                f24831P = a;
                return a;
            }

            public void run() {
                boolean[] a = m43911a();
                C9380c.m43890a(this.f24833O, Instabug.getTheme());
                a[1] = true;
                Button button = (Button) C9380c.m43883a(this.f24833O).findViewById(C9371R.C9375id.replyButton);
                a[2] = true;
                Button button2 = (Button) C9380c.m43883a(this.f24833O).findViewById(C9371R.C9375id.dismissButton);
                a[3] = true;
                button.setText(LocaleUtils.getLocaleStringResource(Instabug.getLocale(this.f24834a), C9371R.string.instabug_str_reply, this.f24834a));
                a[4] = true;
                button2.setText(LocaleUtils.getLocaleStringResource(Instabug.getLocale(this.f24834a), C9371R.string.instabug_str_dismiss, this.f24834a));
                a[5] = true;
                this.f24835b.setBackgroundResource(C9371R.C9374drawable.instabug_ic_avatar);
                a[6] = true;
                TextView textView = (TextView) C9380c.m43883a(this.f24833O).findViewById(C9371R.C9375id.senderNameTextView);
                a[7] = true;
                TextView textView2 = (TextView) C9380c.m43883a(this.f24833O).findViewById(C9371R.C9375id.senderMessageTextView);
                a[8] = true;
                textView.setText(this.f24832N.mo33968b());
                a[9] = true;
                textView2.setText(this.f24832N.mo33966a());
                a[10] = true;
            }
        }

        /* renamed from: com.instabug.chat.a$c$b */
        /* compiled from: NotificationBarInvoker */
        class C9382b implements OnDownloadFinished {

            /* renamed from: d */
            private static transient /* synthetic */ boolean[] f24836d;

            /* renamed from: a */
            final /* synthetic */ Activity f24837a;

            /* renamed from: b */
            final /* synthetic */ CircularImageView f24838b;

            /* renamed from: c */
            final /* synthetic */ C9380c f24839c;

            /* renamed from: com.instabug.chat.a$c$b$a */
            /* compiled from: NotificationBarInvoker */
            class C9383a implements Runnable {

                /* renamed from: N */
                private static transient /* synthetic */ boolean[] f24840N;

                /* renamed from: a */
                final /* synthetic */ Bitmap f24841a;

                /* renamed from: b */
                final /* synthetic */ C9382b f24842b;

                C9383a(C9382b bVar, Bitmap bitmap) {
                    boolean[] a = m43913a();
                    this.f24842b = bVar;
                    this.f24841a = bitmap;
                    a[0] = true;
                }

                /* renamed from: a */
                private static /* synthetic */ boolean[] m43913a() {
                    boolean[] zArr = f24840N;
                    if (zArr != null) {
                        return zArr;
                    }
                    boolean[] a = C13938g.m59885a(-5087986971758288299L, "com/instabug/chat/notification/NotificationBarInvoker$8$1", 3);
                    f24840N = a;
                    return a;
                }

                public void run() {
                    boolean[] a = m43913a();
                    this.f24842b.f24838b.setBackgroundResource(0);
                    a[1] = true;
                    this.f24842b.f24838b.setImageBitmap(this.f24841a);
                    a[2] = true;
                }
            }

            C9382b(C9380c cVar, Activity activity, CircularImageView circularImageView) {
                boolean[] a = m43912a();
                this.f24839c = cVar;
                this.f24837a = activity;
                this.f24838b = circularImageView;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m43912a() {
                boolean[] zArr = f24836d;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-5627661879122583123L, "com/instabug/chat/notification/NotificationBarInvoker$8", 18);
                f24836d = a;
                return a;
            }

            public void onFailed(Throwable th) {
                boolean[] a = m43912a();
                if (C9380c.m43899c(this.f24839c)) {
                    a[14] = true;
                } else {
                    a[15] = true;
                    C9380c.m43888a(this.f24839c, this.f24837a);
                    a[16] = true;
                }
                InstabugSDKLogger.m46624e(this, "Asset Entity downloading got error", th);
                a[17] = true;
            }

            public void onSuccess(AssetEntity assetEntity) {
                boolean[] a = m43912a();
                StringBuilder sb = new StringBuilder();
                sb.append("Asset Entity downloaded: ");
                File file = assetEntity.getFile();
                a[1] = true;
                sb.append(file.getPath());
                String sb2 = sb.toString();
                a[2] = true;
                InstabugSDKLogger.m46622d(this, sb2);
                try {
                    a[3] = true;
                    a[4] = true;
                    FileInputStream fileInputStream = new FileInputStream(assetEntity.getFile());
                    a[5] = true;
                    Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream);
                    a[6] = true;
                    this.f24837a.runOnUiThread(new C9383a(this, decodeStream));
                    a[7] = true;
                } catch (FileNotFoundException e) {
                    a[8] = true;
                    InstabugSDKLogger.m46624e(this, "Asset Entity downloading got FileNotFoundException error", e);
                    a[9] = true;
                }
                if (C9380c.m43899c(this.f24839c)) {
                    a[10] = true;
                } else {
                    a[11] = true;
                    C9380c.m43888a(this.f24839c, this.f24837a);
                    a[12] = true;
                }
                a[13] = true;
            }
        }

        /* renamed from: com.instabug.chat.a$c$c */
        /* compiled from: NotificationBarInvoker */
        class C9384c extends C9394m {

            /* renamed from: d */
            private static transient /* synthetic */ boolean[] f24843d;

            /* renamed from: c */
            final /* synthetic */ C9380c f24844c;

            C9384c(C9380c cVar) {
                boolean[] a = m43914a();
                this.f24844c = cVar;
                super(cVar, null);
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m43914a() {
                boolean[] zArr = f24843d;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(2896411353562489147L, "com/instabug/chat/notification/NotificationBarInvoker$9", 2);
                f24843d = a;
                return a;
            }

            public void onAnimationEnd(Animator animator) {
                boolean[] a = m43914a();
                C9380c.m43883a(this.f24844c).setVisibility(4);
                a[1] = true;
            }
        }

        /* renamed from: com.instabug.chat.a$c$d */
        /* compiled from: NotificationBarInvoker */
        class C9385d implements OnClickListener {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f24845b;

            /* renamed from: a */
            final /* synthetic */ C9380c f24846a;

            C9385d(C9380c cVar) {
                boolean[] a = m43915a();
                this.f24846a = cVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m43915a() {
                boolean[] zArr = f24845b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(4401320036160944826L, "com/instabug/chat/notification/NotificationBarInvoker$1", 2);
                f24845b = a;
                return a;
            }

            public void onClick(View view) {
                m43915a()[1] = true;
            }
        }

        /* renamed from: com.instabug.chat.a$c$e */
        /* compiled from: NotificationBarInvoker */
        class C9386e implements Runnable {

            /* renamed from: N */
            private static transient /* synthetic */ boolean[] f24847N;

            /* renamed from: a */
            final /* synthetic */ Activity f24848a;

            /* renamed from: b */
            final /* synthetic */ C9380c f24849b;

            C9386e(C9380c cVar, Activity activity) {
                boolean[] a = m43916a();
                this.f24849b = cVar;
                this.f24848a = activity;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m43916a() {
                boolean[] zArr = f24847N;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-5144618357064686263L, "com/instabug/chat/notification/NotificationBarInvoker$10", 7);
                f24847N = a;
                return a;
            }

            public void run() {
                boolean[] a = m43916a();
                C9380c.m43883a(this.f24849b).setVisibility(0);
                a[1] = true;
                ViewPropertyAnimator animate = C9380c.m43883a(this.f24849b).animate();
                Activity activity = this.f24848a;
                a[2] = true;
                ViewPropertyAnimator y = animate.y((float) (ScreenUtility.getScreenHeight(activity) - C9380c.m43883a(this.f24849b).getHeight()));
                a[3] = true;
                ViewPropertyAnimator listener = y.setListener(null);
                a[4] = true;
                listener.start();
                a[5] = true;
                C9380c.m43900c(this.f24849b, true);
                a[6] = true;
            }
        }

        /* renamed from: com.instabug.chat.a$c$f */
        /* compiled from: NotificationBarInvoker */
        class C9387f implements C12331g<ActivityLifeCycleEvent> {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f24850b;

            /* renamed from: a */
            final /* synthetic */ C9380c f24851a;

            C9387f(C9380c cVar) {
                boolean[] a = m43917a();
                this.f24851a = cVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m43917a() {
                boolean[] zArr = f24850b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(7135809568201134495L, "com/instabug/chat/notification/NotificationBarInvoker$11", 6);
                f24850b = a;
                return a;
            }

            /* renamed from: a */
            public void mo33821a(ActivityLifeCycleEvent activityLifeCycleEvent) {
                boolean[] a = m43917a();
                int i = C9388g.f24852a[activityLifeCycleEvent.ordinal()];
                if (i == 1) {
                    C9380c.m43907g(this.f24851a);
                    a[2] = true;
                } else if (i != 2) {
                    a[1] = true;
                } else {
                    C9380c.m43909h(this.f24851a);
                    a[3] = true;
                }
                a[4] = true;
            }

            /* renamed from: c */
            public /* synthetic */ void mo33410c(Object obj) throws Exception {
                boolean[] a = m43917a();
                mo33821a((ActivityLifeCycleEvent) obj);
                a[5] = true;
            }
        }

        /* renamed from: com.instabug.chat.a$c$g */
        /* compiled from: NotificationBarInvoker */
        static /* synthetic */ class C9388g {

            /* renamed from: a */
            static final /* synthetic */ int[] f24852a = new int[ActivityLifeCycleEvent.values().length];

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f24853b;

            /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
                r0[2] = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
                r0[4] = true;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x001f */
            static {
                /*
                    boolean[] r0 = m43920a()
                    com.instabug.library.tracking.ActivityLifeCycleEvent[] r1 = com.instabug.library.tracking.ActivityLifeCycleEvent.values()
                    int r1 = r1.length
                    int[] r1 = new int[r1]
                    f24852a = r1
                    r1 = 0
                    r2 = 2
                    r3 = 1
                    r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x001f }
                    int[] r1 = f24852a     // Catch:{ NoSuchFieldError -> 0x001f }
                    com.instabug.library.tracking.ActivityLifeCycleEvent r4 = com.instabug.library.tracking.ActivityLifeCycleEvent.RESUMED     // Catch:{ NoSuchFieldError -> 0x001f }
                    int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                    r1[r4] = r3     // Catch:{ NoSuchFieldError -> 0x001f }
                    r0[r3] = r3
                    goto L_0x0021
                L_0x001f:
                    r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x002f }
                L_0x0021:
                    int[] r1 = f24852a     // Catch:{ NoSuchFieldError -> 0x002f }
                    com.instabug.library.tracking.ActivityLifeCycleEvent r4 = com.instabug.library.tracking.ActivityLifeCycleEvent.PAUSED     // Catch:{ NoSuchFieldError -> 0x002f }
                    int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002f }
                    r1[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002f }
                    r1 = 3
                    r0[r1] = r3
                    goto L_0x0032
                L_0x002f:
                    r1 = 4
                    r0[r1] = r3
                L_0x0032:
                    r1 = 5
                    r0[r1] = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.instabug.chat.C9377a.C9380c.C9388g.<clinit>():void");
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m43920a() {
                boolean[] zArr = f24853b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(887945176423522566L, "com/instabug/chat/notification/NotificationBarInvoker$12", 6);
                f24853b = a;
                return a;
            }
        }

        /* renamed from: com.instabug.chat.a$c$h */
        /* compiled from: NotificationBarInvoker */
        class C9389h implements Runnable {

            /* renamed from: P */
            private static transient /* synthetic */ boolean[] f24854P;

            /* renamed from: N */
            final /* synthetic */ C9396o f24855N;

            /* renamed from: O */
            final /* synthetic */ C9380c f24856O;

            /* renamed from: a */
            final /* synthetic */ Activity f24857a;

            /* renamed from: b */
            final /* synthetic */ LayoutParams f24858b;

            C9389h(C9380c cVar, Activity activity, LayoutParams layoutParams, C9396o oVar) {
                boolean[] a = m43921a();
                this.f24856O = cVar;
                this.f24857a = activity;
                this.f24858b = layoutParams;
                this.f24855N = oVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m43921a() {
                boolean[] zArr = f24854P;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-7430458886446691379L, "com/instabug/chat/notification/NotificationBarInvoker$2", 6);
                f24854P = a;
                return a;
            }

            public void run() {
                boolean[] a = m43921a();
                if (C9380c.m43883a(this.f24856O).getParent() == null) {
                    a[1] = true;
                } else {
                    a[2] = true;
                    ((ViewGroup) C9380c.m43883a(this.f24856O).getParent()).removeView(C9380c.m43883a(this.f24856O));
                    a[3] = true;
                }
                ((ViewGroup) this.f24857a.getWindow().getDecorView()).addView(C9380c.m43883a(this.f24856O), this.f24858b);
                a[4] = true;
                C9380c.m43883a(this.f24856O).postDelayed(this.f24855N, 100);
                a[5] = true;
            }
        }

        /* renamed from: com.instabug.chat.a$c$i */
        /* compiled from: NotificationBarInvoker */
        class C9390i implements OnGlobalLayoutListener {

            /* renamed from: N */
            private static transient /* synthetic */ boolean[] f24859N;

            /* renamed from: a */
            final /* synthetic */ Activity f24860a;

            /* renamed from: b */
            final /* synthetic */ C9380c f24861b;

            C9390i(C9380c cVar, Activity activity) {
                boolean[] a = m43922a();
                this.f24861b = cVar;
                this.f24860a = activity;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m43922a() {
                boolean[] zArr = f24859N;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-3310011144096361228L, "com/instabug/chat/notification/NotificationBarInvoker$3", 12);
                f24859N = a;
                return a;
            }

            public void onGlobalLayout() {
                boolean[] a = m43922a();
                Rect rect = new Rect();
                a[1] = true;
                this.f24860a.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                a[2] = true;
                View decorView = this.f24860a.getWindow().getDecorView();
                a[3] = true;
                int height = decorView.getRootView().getHeight();
                double d = (double) (height - rect.bottom);
                double d2 = (double) height;
                Double.isNaN(d2);
                if (d > d2 * 0.15d) {
                    a[4] = true;
                    C9380c.m43893a(this.f24861b, true);
                    a[5] = true;
                } else {
                    C9380c.m43893a(this.f24861b, false);
                    a[6] = true;
                    if (!C9380c.m43897b(this.f24861b)) {
                        a[7] = true;
                    } else if (C9380c.m43899c(this.f24861b)) {
                        a[8] = true;
                    } else {
                        a[9] = true;
                        C9380c.m43888a(this.f24861b, this.f24860a);
                        a[10] = true;
                    }
                }
                a[11] = true;
            }
        }

        /* renamed from: com.instabug.chat.a$c$j */
        /* compiled from: NotificationBarInvoker */
        class C9391j extends C9396o {

            /* renamed from: Q */
            private static transient /* synthetic */ boolean[] f24862Q;

            /* renamed from: N */
            final /* synthetic */ Activity f24863N;

            /* renamed from: O */
            final /* synthetic */ C9425c f24864O;

            /* renamed from: P */
            final /* synthetic */ C9380c f24865P;

            C9391j(C9380c cVar, Activity activity, C9425c cVar2) {
                boolean[] c = m43923c();
                this.f24865P = cVar;
                this.f24863N = activity;
                this.f24864O = cVar2;
                super(cVar);
                c[0] = true;
            }

            /* renamed from: c */
            private static /* synthetic */ boolean[] m43923c() {
                boolean[] zArr = f24862Q;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-415209472765356264L, "com/instabug/chat/notification/NotificationBarInvoker$4", 4);
                f24862Q = a;
                return a;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo33824a() {
                boolean[] c = m43923c();
                C9380c.m43883a(this.f24865P).setY((float) ScreenUtility.getScreenHeight(this.f24863N));
                c[1] = true;
                C9380c.m43889a(this.f24865P, this.f24863N, this.f24864O);
                c[2] = true;
            }

            /* renamed from: b */
            public void mo33825b() {
                boolean[] c = m43923c();
                C9380c.m43889a(this.f24865P, this.f24863N, this.f24864O);
                c[3] = true;
            }
        }

        /* renamed from: com.instabug.chat.a$c$k */
        /* compiled from: NotificationBarInvoker */
        class C9392k implements OnClickListener {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f24866b;

            /* renamed from: a */
            final /* synthetic */ C9380c f24867a;

            C9392k(C9380c cVar) {
                boolean[] a = m43926a();
                this.f24867a = cVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m43926a() {
                boolean[] zArr = f24866b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(4222828137381553109L, "com/instabug/chat/notification/NotificationBarInvoker$5", 4);
                f24866b = a;
                return a;
            }

            public void onClick(View view) {
                boolean[] a = m43926a();
                C9380c.m43902d(this.f24867a);
                a[1] = true;
                C9380c.m43896b(this.f24867a, false);
                a[2] = true;
                C9380c.m43903e(this.f24867a).mo33832d();
                a[3] = true;
            }
        }

        /* renamed from: com.instabug.chat.a$c$l */
        /* compiled from: NotificationBarInvoker */
        class C9393l implements OnClickListener {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f24868b;

            /* renamed from: a */
            final /* synthetic */ C9380c f24869a;

            C9393l(C9380c cVar) {
                boolean[] a = m43927a();
                this.f24869a = cVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m43927a() {
                boolean[] zArr = f24868b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(4228142402559293402L, "com/instabug/chat/notification/NotificationBarInvoker$6", 4);
                f24868b = a;
                return a;
            }

            public void onClick(View view) {
                boolean[] a = m43927a();
                C9380c.m43902d(this.f24869a);
                a[1] = true;
                C9380c.m43906f(this.f24869a);
                a[2] = true;
                C9380c.m43903e(this.f24869a).mo33831c();
                a[3] = true;
            }
        }

        /* renamed from: com.instabug.chat.a$c$m */
        /* compiled from: NotificationBarInvoker */
        private class C9394m implements AnimatorListener {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f24870b;

            /* renamed from: a */
            final /* synthetic */ C9380c f24871a;

            private C9394m(C9380c cVar) {
                boolean[] a = m43928a();
                this.f24871a = cVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m43928a() {
                boolean[] zArr = f24870b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(7264893792799342028L, "com/instabug/chat/notification/NotificationBarInvoker$OnAnimationEndListener", 6);
                f24870b = a;
                return a;
            }

            public void onAnimationCancel(Animator animator) {
                m43928a()[3] = true;
            }

            public void onAnimationEnd(Animator animator) {
                m43928a()[2] = true;
            }

            public void onAnimationRepeat(Animator animator) {
                m43928a()[4] = true;
            }

            public void onAnimationStart(Animator animator) {
                m43928a()[1] = true;
            }

            /* synthetic */ C9394m(C9380c cVar, C9385d dVar) {
                boolean[] a = m43928a();
                this(cVar);
                a[5] = true;
            }
        }

        /* renamed from: com.instabug.chat.a$c$n */
        /* compiled from: NotificationBarInvoker */
        public interface C9395n {
            /* renamed from: c */
            void mo33831c();

            /* renamed from: d */
            void mo33832d();
        }

        /* renamed from: com.instabug.chat.a$c$o */
        /* compiled from: NotificationBarInvoker */
        public abstract class C9396o implements Runnable {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f24872b;

            /* renamed from: a */
            final /* synthetic */ C9380c f24873a;

            public C9396o(C9380c cVar) {
                boolean[] c = m43931c();
                this.f24873a = cVar;
                c[0] = true;
            }

            /* renamed from: c */
            private static /* synthetic */ boolean[] m43931c() {
                boolean[] zArr = f24872b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(7541439393172539157L, "com/instabug/chat/notification/NotificationBarInvoker$OnViewAddedListener", 2);
                f24872b = a;
                return a;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public abstract void mo33824a();

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public abstract void mo33825b();

            public void run() {
                boolean[] c = m43931c();
                mo33824a();
                c[1] = true;
            }
        }

        public C9380c() {
            boolean[] g = m43908g();
            g[0] = true;
            m43901d();
            g[1] = true;
        }

        /* renamed from: a */
        static /* synthetic */ View m43883a(C9380c cVar) {
            boolean[] g = m43908g();
            View view = cVar.f24825a;
            g[85] = true;
            return view;
        }

        /* renamed from: b */
        static /* synthetic */ void m43896b(C9380c cVar, boolean z) {
            boolean[] g = m43908g();
            cVar.m43892a(z);
            g[92] = true;
        }

        /* renamed from: c */
        static /* synthetic */ boolean m43899c(C9380c cVar) {
            boolean[] g = m43908g();
            boolean z = cVar.f24826b;
            g[88] = true;
            return z;
        }

        /* renamed from: d */
        static /* synthetic */ void m43902d(C9380c cVar) {
            boolean[] g = m43908g();
            cVar.m43894b();
            g[91] = true;
        }

        /* renamed from: e */
        static /* synthetic */ C9395n m43903e(C9380c cVar) {
            boolean[] g = m43908g();
            C9395n nVar = cVar.f24830f;
            g[93] = true;
            return nVar;
        }

        /* renamed from: f */
        static /* synthetic */ void m43906f(C9380c cVar) {
            boolean[] g = m43908g();
            cVar.m43898c();
            g[94] = true;
        }

        /* renamed from: g */
        static /* synthetic */ void m43907g(C9380c cVar) {
            boolean[] g = m43908g();
            cVar.m43904e();
            g[97] = true;
        }

        /* renamed from: g */
        private static /* synthetic */ boolean[] m43908g() {
            boolean[] zArr = f24824g;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(8353876998287357251L, "com/instabug/chat/notification/NotificationBarInvoker", 99);
            f24824g = a;
            return a;
        }

        /* renamed from: h */
        static /* synthetic */ void m43909h(C9380c cVar) {
            boolean[] g = m43908g();
            cVar.m43905f();
            g[98] = true;
        }

        /* renamed from: a */
        static /* synthetic */ void m43888a(C9380c cVar, Activity activity) {
            boolean[] g = m43908g();
            cVar.m43885a(activity);
            g[89] = true;
        }

        /* renamed from: b */
        static /* synthetic */ boolean m43897b(C9380c cVar) {
            boolean[] g = m43908g();
            boolean z = cVar.f24828d;
            g[87] = true;
            return z;
        }

        /* renamed from: c */
        static /* synthetic */ boolean m43900c(C9380c cVar, boolean z) {
            boolean[] g = m43908g();
            cVar.f24826b = z;
            g[96] = true;
            return z;
        }

        /* renamed from: d */
        private void m43901d() {
            boolean[] g = m43908g();
            CurrentActivityLifeCycleEventBus instance = CurrentActivityLifeCycleEventBus.getInstance();
            C9387f fVar = new C9387f(this);
            g[77] = true;
            instance.subscribe(fVar);
            g[78] = true;
        }

        /* renamed from: e */
        private void m43904e() {
            boolean[] g = m43908g();
            if (this.f24829e == null) {
                g[79] = true;
            } else if (this.f24830f == null) {
                g[80] = true;
            } else {
                g[81] = true;
                mo33813a(InstabugCore.getTargetActivity(), this.f24829e, this.f24830f);
                g[82] = true;
            }
            g[83] = true;
        }

        /* renamed from: f */
        private void m43905f() {
            boolean[] g = m43908g();
            m43892a(false);
            g[84] = true;
        }

        /* renamed from: a */
        static /* synthetic */ void m43889a(C9380c cVar, Activity activity, C9425c cVar2) {
            boolean[] g = m43908g();
            cVar.m43887a(activity, cVar2);
            g[90] = true;
        }

        /* renamed from: b */
        private void m43894b() {
            boolean[] g = m43908g();
            this.f24829e = null;
            g[51] = true;
        }

        /* renamed from: c */
        private void m43898c() {
            boolean[] g = m43908g();
            m43892a(true);
            g[58] = true;
        }

        /* renamed from: a */
        static /* synthetic */ void m43890a(C9380c cVar, InstabugColorTheme instabugColorTheme) {
            boolean[] g = m43908g();
            cVar.m43891a(instabugColorTheme);
            g[95] = true;
        }

        /* renamed from: a */
        static /* synthetic */ boolean m43893a(C9380c cVar, boolean z) {
            boolean[] g = m43908g();
            cVar.f24827c = z;
            g[86] = true;
            return z;
        }

        /* renamed from: b */
        private void m43895b(Activity activity, C9425c cVar) {
            boolean[] g = m43908g();
            CircularImageView circularImageView = (CircularImageView) this.f24825a.findViewById(C9371R.C9375id.senderAvatarImageView);
            g[53] = true;
            activity.runOnUiThread(new C9381a(this, activity, circularImageView, cVar));
            g[54] = true;
            String c = cVar.mo33970c();
            AssetType assetType = AssetType.IMAGE;
            g[55] = true;
            AssetEntity createEmptyEntity = AssetsCacheManager.createEmptyEntity(activity, c, assetType);
            g[56] = true;
            AssetsCacheManager.getAssetEntity(activity, createEmptyEntity, new C9382b(this, activity, circularImageView));
            g[57] = true;
        }

        /* renamed from: a */
        private void m43886a(Activity activity, C9396o oVar) {
            boolean[] g = m43908g();
            View findViewById = activity.findViewById(C9371R.C9375id.instabug_in_app_notification);
            if (findViewById != null) {
                this.f24825a = findViewById;
                g[2] = true;
                oVar.mo33825b();
                g[3] = true;
                return;
            }
            m43892a(false);
            g[4] = true;
            LayoutInflater layoutInflater = (LayoutInflater) activity.getSystemService("layout_inflater");
            g[5] = true;
            this.f24825a = layoutInflater.inflate(C9371R.layout.instabug_lyt_notification, null);
            g[6] = true;
            this.f24825a.setVisibility(4);
            g[7] = true;
            this.f24825a.setOnClickListener(new C9385d(this));
            g[8] = true;
            LayoutParams layoutParams = new LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            g[9] = true;
            Resources resources = activity.getResources();
            if (VERSION.SDK_INT < 21) {
                g[10] = true;
            } else {
                g[11] = true;
                if (!ScreenUtility.isLandscape(activity)) {
                    g[12] = true;
                } else if (!ScreenUtility.hasNavBar(resources)) {
                    g[13] = true;
                } else {
                    g[14] = true;
                    int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
                    if (rotation == 1) {
                        g[15] = true;
                        layoutParams.rightMargin = ScreenUtility.getNavigationBarWidth(resources);
                        g[16] = true;
                    } else if (rotation != 3) {
                        g[17] = true;
                    } else if (VERSION.SDK_INT >= 24) {
                        g[18] = true;
                        layoutParams.leftMargin = ScreenUtility.getNavigationBarWidth(resources);
                        g[19] = true;
                    } else {
                        g[20] = true;
                        layoutParams.rightMargin = ScreenUtility.getNavigationBarWidth(resources);
                        g[21] = true;
                    }
                }
            }
            this.f24825a.setLayoutParams(layoutParams);
            g[22] = true;
            activity.runOnUiThread(new C9389h(this, activity, layoutParams, oVar));
            g[23] = true;
            ViewTreeObserver viewTreeObserver = activity.getWindow().getDecorView().getViewTreeObserver();
            C9390i iVar = new C9390i(this, activity);
            g[24] = true;
            viewTreeObserver.addOnGlobalLayoutListener(iVar);
            g[25] = true;
        }

        /* renamed from: a */
        private void m43891a(InstabugColorTheme instabugColorTheme) {
            boolean[] g = m43908g();
            View findViewById = this.f24825a.findViewById(C9371R.C9375id.instabug_notification_layout);
            g[26] = true;
            Button button = (Button) this.f24825a.findViewById(C9371R.C9375id.replyButton);
            g[27] = true;
            Button button2 = (Button) this.f24825a.findViewById(C9371R.C9375id.dismissButton);
            g[28] = true;
            TextView textView = (TextView) this.f24825a.findViewById(C9371R.C9375id.senderNameTextView);
            g[29] = true;
            TextView textView2 = (TextView) this.f24825a.findViewById(C9371R.C9375id.senderMessageTextView);
            g[30] = true;
            button.getBackground().setColorFilter(Instabug.getPrimaryColor(), Mode.MULTIPLY);
            g[31] = true;
            button2.getBackground().setColorFilter(-1, Mode.MULTIPLY);
            g[32] = true;
            button.setTextColor(-1);
            if (instabugColorTheme == InstabugColorTheme.InstabugColorThemeLight) {
                g[33] = true;
                findViewById.setBackgroundColor(-1);
                g[34] = true;
                textView.setTextColor(-11908534);
                g[35] = true;
                textView2.setTextColor(-7697777);
                g[36] = true;
                button2.setTextColor(-6579301);
                g[37] = true;
            } else {
                findViewById.setBackgroundColor(-12434878);
                g[38] = true;
                textView.setTextColor(-1);
                g[39] = true;
                textView2.setTextColor(-2631721);
                g[40] = true;
                button2.setTextColor(-6579301);
                g[41] = true;
            }
            g[42] = true;
        }

        /* renamed from: a */
        public void mo33813a(Activity activity, C9425c cVar, C9395n nVar) {
            boolean[] g = m43908g();
            this.f24829e = cVar;
            this.f24830f = nVar;
            g[43] = true;
            C9391j jVar = new C9391j(this, activity, cVar);
            g[44] = true;
            m43886a(activity, (C9396o) jVar);
            g[45] = true;
            m43884a();
            g[46] = true;
        }

        /* renamed from: a */
        private void m43884a() {
            boolean[] g = m43908g();
            Button button = (Button) this.f24825a.findViewById(C9371R.C9375id.replyButton);
            g[47] = true;
            Button button2 = (Button) this.f24825a.findViewById(C9371R.C9375id.dismissButton);
            g[48] = true;
            button.setOnClickListener(new C9392k(this));
            g[49] = true;
            button2.setOnClickListener(new C9393l(this));
            g[50] = true;
        }

        /* renamed from: a */
        private void m43887a(Activity activity, C9425c cVar) {
            boolean[] g = m43908g();
            m43895b(activity, cVar);
            g[52] = true;
        }

        /* renamed from: a */
        private void m43892a(boolean z) {
            boolean[] g = m43908g();
            if (!this.f24826b) {
                g[59] = true;
            } else {
                View view = this.f24825a;
                if (view == null) {
                    g[60] = true;
                } else {
                    g[61] = true;
                    int screenHeight = ScreenUtility.getScreenHeight((Activity) view.getContext());
                    if (z) {
                        g[62] = true;
                        ViewPropertyAnimator animate = this.f24825a.animate();
                        float f = (float) screenHeight;
                        g[63] = true;
                        ViewPropertyAnimator y = animate.y(f);
                        C9384c cVar = new C9384c(this);
                        g[64] = true;
                        ViewPropertyAnimator listener = y.setListener(cVar);
                        g[65] = true;
                        listener.start();
                        g[66] = true;
                    } else {
                        this.f24825a.setY((float) screenHeight);
                        g[67] = true;
                        this.f24825a.setVisibility(4);
                        g[68] = true;
                    }
                    this.f24826b = false;
                    this.f24828d = false;
                    g[69] = true;
                }
            }
            g[70] = true;
        }

        /* renamed from: a */
        private void m43885a(Activity activity) {
            boolean[] g = m43908g();
            if (this.f24827c) {
                this.f24828d = true;
                g[71] = true;
                return;
            }
            activity.runOnUiThread(new C9386e(this, activity));
            g[72] = true;
            if (!C9441a.m44205h()) {
                g[73] = true;
            } else {
                g[74] = true;
                C9397d.m43935a().mo33834a((Context) activity);
                g[75] = true;
            }
            g[76] = true;
        }
    }

    /* renamed from: com.instabug.chat.a$d */
    /* compiled from: NotificationManager */
    public class C9397d {

        /* renamed from: e */
        private static C9397d f24874e;

        /* renamed from: f */
        private static transient /* synthetic */ boolean[] f24875f;

        /* renamed from: a */
        private int f24876a;

        /* renamed from: b */
        private final C9380c f24877b = new C9380c();

        /* renamed from: c */
        private InstabugAppData f24878c;

        /* renamed from: d */
        private List<Message> f24879d;

        /* renamed from: com.instabug.chat.a$d$a */
        /* compiled from: NotificationManager */
        class C9398a implements OnCompletionListener {

            /* renamed from: N */
            private static transient /* synthetic */ boolean[] f24880N;

            /* renamed from: a */
            final /* synthetic */ MediaPlayer f24881a;

            /* renamed from: b */
            final /* synthetic */ C9397d f24882b;

            C9398a(C9397d dVar, MediaPlayer mediaPlayer) {
                boolean[] a = m43951a();
                this.f24882b = dVar;
                this.f24881a = mediaPlayer;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m43951a() {
                boolean[] zArr = f24880N;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(1976453660996421447L, "com/instabug/chat/notification/NotificationManager$1", 2);
                f24880N = a;
                return a;
            }

            public void onCompletion(MediaPlayer mediaPlayer) {
                boolean[] a = m43951a();
                this.f24881a.release();
                a[1] = true;
            }
        }

        /* renamed from: com.instabug.chat.a$d$b */
        /* compiled from: NotificationManager */
        class C9399b implements C9395n {

            /* renamed from: c */
            private static transient /* synthetic */ boolean[] f24883c;

            /* renamed from: a */
            final /* synthetic */ Activity f24884a;

            /* renamed from: b */
            final /* synthetic */ C9397d f24885b;

            C9399b(C9397d dVar, Activity activity) {
                boolean[] a = m43952a();
                this.f24885b = dVar;
                this.f24884a = activity;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m43952a() {
                boolean[] zArr = f24883c;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-5181225156196094736L, "com/instabug/chat/notification/NotificationManager$2", 4);
                f24883c = a;
                return a;
            }

            /* renamed from: c */
            public void mo33831c() {
                boolean[] a = m43952a();
                C9397d.m43941a(this.f24885b);
                a[3] = true;
            }

            /* renamed from: d */
            public void mo33832d() {
                boolean[] a = m43952a();
                C9397d.m43942a(this.f24885b, this.f24884a);
                a[1] = true;
                PresentationManager.getInstance().setNotificationShowing(false);
                a[2] = true;
            }
        }

        private C9397d() {
            boolean[] c = m43944c();
            c[0] = true;
            c[1] = true;
        }

        /* renamed from: a */
        static /* synthetic */ void m43941a(C9397d dVar) {
            boolean[] c = m43944c();
            dVar.m43943b();
            c[166] = true;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m43944c() {
            boolean[] zArr = f24875f;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(277987815567090362L, "com/instabug/chat/notification/NotificationManager", C13959t.f40780D2);
            f24875f = a;
            return a;
        }

        /* renamed from: b */
        public boolean mo33838b(Bundle bundle) {
            boolean[] c = m43944c();
            try {
                String string = bundle.getString("message");
                c[116] = true;
                JSONObject jSONObject = new JSONObject(string);
                c[117] = true;
                String string2 = jSONObject.getString("IBGHost");
                c[118] = true;
                StringBuilder sb = new StringBuilder();
                sb.append("IBGHost: ");
                sb.append(string2);
                InstabugSDKLogger.m46622d(this, sb.toString());
                c[119] = true;
                if (string2 == null) {
                    c[120] = true;
                } else if (!Boolean.parseBoolean(string2)) {
                    c[121] = true;
                } else {
                    c[122] = true;
                    return true;
                }
                c[123] = true;
            } catch (JSONException e) {
                c[124] = true;
                InstabugSDKLogger.m46624e(this, "Parsing GCM response failed", e);
                c[125] = true;
            } catch (NullPointerException e2) {
                c[126] = true;
                InstabugSDKLogger.m46624e(this, "Something went wrong while showing notification", e2);
                c[127] = true;
            }
            c[128] = true;
            return false;
        }

        /* renamed from: a */
        static /* synthetic */ void m43942a(C9397d dVar, Activity activity) {
            boolean[] c = m43944c();
            dVar.m43938a(activity);
            c[165] = true;
        }

        /* renamed from: a */
        public static C9397d m43935a() {
            boolean[] c = m43944c();
            if (f24874e != null) {
                c[2] = true;
            } else {
                c[3] = true;
                f24874e = new C9397d();
                c[4] = true;
            }
            C9397d dVar = f24874e;
            c[5] = true;
            return dVar;
        }

        /* renamed from: a */
        public void mo33835a(Context context, List<Message> list) {
            Intent intent;
            CharSequence charSequence;
            Activity activity;
            boolean[] c = m43944c();
            this.f24878c = new InstabugAppData(context);
            c[9] = true;
            this.f24876a = m43934a(list);
            this.f24879d = list;
            int i = this.f24876a;
            if (i == 0) {
                Message message = (Message) list.get(list.size() - 1);
                c[11] = true;
                String a = m43937a(context, 0, list);
                c[12] = true;
                Intent a2 = C9456b.m44298a(context, message.mo33914d());
                c[13] = true;
                CharSequence charSequence2 = a;
                intent = a2;
                charSequence = charSequence2;
            } else if (i != 1) {
                c[10] = true;
                charSequence = "";
                intent = null;
            } else {
                charSequence = m43937a(context, 1, list);
                c[14] = true;
                intent = C9456b.m44297a(context);
                c[15] = true;
            }
            if (!InstabugCore.isAppOnForeground()) {
                c[16] = true;
                m43940a(context, intent, charSequence);
                c[17] = true;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    c[18] = true;
                } else {
                    activity = InstabugCore.getTargetActivity();
                    c[19] = true;
                }
                if (InstabugCore.isForegroundBusy()) {
                    c[20] = true;
                    ChatPlugin chatPlugin = (ChatPlugin) InstabugCore.getXPlugin(ChatPlugin.class);
                    c[21] = true;
                    if (chatPlugin == null) {
                        c[22] = true;
                    } else if (chatPlugin.getState() != 1) {
                        c[23] = true;
                    } else {
                        c[24] = true;
                        m43939a(activity, list);
                        c[25] = true;
                        c[27] = true;
                    }
                    m43940a(context, intent, charSequence);
                    c[26] = true;
                    c[27] = true;
                } else {
                    m43939a(activity, list);
                    c[28] = true;
                }
            }
            c[29] = true;
        }

        /* renamed from: b */
        public boolean mo33839b(Map<String, String> map) {
            boolean[] c = m43944c();
            String str = "message";
            if (!map.containsKey(str)) {
                c[129] = true;
            } else {
                try {
                    c[130] = true;
                    String str2 = (String) map.get(str);
                    c[131] = true;
                    JSONObject jSONObject = new JSONObject(str2);
                    c[132] = true;
                    String string = jSONObject.getString("IBGHost");
                    c[133] = true;
                    if (string == null) {
                        c[134] = true;
                    } else if (!Boolean.parseBoolean(string)) {
                        c[135] = true;
                    } else {
                        c[136] = true;
                        return true;
                    }
                    c[137] = true;
                } catch (JSONException e) {
                    c[138] = true;
                    InstabugSDKLogger.m46624e(this, "Parsing GCM response failed", e);
                    c[139] = true;
                } catch (NullPointerException e2) {
                    c[140] = true;
                    InstabugSDKLogger.m46624e(this, "Something went wrong while showing notification", e2);
                    c[141] = true;
                }
            }
            c[142] = true;
            return false;
        }

        /* renamed from: b */
        private void m43943b() {
            boolean[] c = m43944c();
            PresentationManager.getInstance().setNotificationShowing(false);
            c[163] = true;
            PresentationManager.getInstance().notifyActivityChanged();
            c[164] = true;
        }

        /* renamed from: a */
        public void mo33834a(Context context) {
            boolean[] c = m43944c();
            if (!InstabugDeviceProperties.checkRingerIsOn(context)) {
                c[33] = true;
                return;
            }
            MediaPlayer create = MediaPlayer.create(context, C9700R.C9705raw.ib_core_sound_new_message);
            if (VERSION.SDK_INT >= 21) {
                c[34] = true;
                Builder builder = new Builder();
                c[35] = true;
                Builder usage = builder.setUsage(5);
                c[36] = true;
                Builder contentType = usage.setContentType(4);
                c[37] = true;
                AudioAttributes build = contentType.build();
                c[38] = true;
                create.setAudioAttributes(build);
                c[39] = true;
            } else {
                create.setAudioStreamType(5);
                c[40] = true;
            }
            create.start();
            c[41] = true;
            create.setOnCompletionListener(new C9398a(this, create));
            c[42] = true;
        }

        /* renamed from: a */
        private int m43934a(List<Message> list) {
            boolean[] c = m43944c();
            c[43] = true;
            ArrayList<Message> arrayList = new ArrayList<>(list);
            c[44] = true;
            int i = 0;
            String d = ((Message) list.get(0)).mo33914d();
            c[45] = true;
            Collections.sort(arrayList, new C9418a(1));
            c[46] = true;
            c[47] = true;
            String str = d;
            int i2 = 1;
            for (Message message : arrayList) {
                c[48] = true;
                String d2 = message.mo33914d();
                c[49] = true;
                if (d2.equals(str)) {
                    c[50] = true;
                } else {
                    i2++;
                    c[51] = true;
                    str = d2;
                }
                c[52] = true;
            }
            if (i2 == 1) {
                c[53] = true;
            } else {
                c[54] = true;
                i = 1;
            }
            c[55] = true;
            return i;
        }

        /* renamed from: a */
        private String m43937a(Context context, int i, List<Message> list) {
            boolean[] c = m43944c();
            if (i == 0) {
                String e = ((Message) list.get(list.size() - 1)).mo33916e();
                c[56] = true;
                return e;
            } else if (i != 1) {
                c[62] = true;
                return "";
            } else {
                Resources resources = context.getResources();
                c[57] = true;
                String[] split = ((Message) list.get(list.size() - 1)).mo33923i().split(C3868i.f12248b);
                c[58] = true;
                String string = resources.getString(C9700R.string.instabug_str_notifications_body);
                c[59] = true;
                Object[] objArr = {Integer.valueOf(list.size()), split[0]};
                c[60] = true;
                String format = String.format(string, objArr);
                c[61] = true;
                return format;
            }
        }

        /* renamed from: a */
        private String m43936a(Activity activity, int i, String str) {
            boolean[] c = m43944c();
            Resources resources = activity.getResources();
            if (i == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" (");
                int i2 = C9700R.string.instabug_str_notification_title;
                c[63] = true;
                String string = resources.getString(i2);
                InstabugAppData instabugAppData = this.f24878c;
                c[64] = true;
                Object[] objArr = {instabugAppData.getAppName()};
                c[65] = true;
                sb.append(String.format(string, objArr));
                sb.append(")");
                String sb2 = sb.toString();
                c[66] = true;
                return sb2;
            } else if (i != 1) {
                c[70] = true;
                return "";
            } else {
                String string2 = resources.getString(C9371R.string.instabug_str_notification_title);
                InstabugAppData instabugAppData2 = this.f24878c;
                c[67] = true;
                Object[] objArr2 = {instabugAppData2.getAppName()};
                c[68] = true;
                String format = String.format(string2, objArr2);
                c[69] = true;
                return format;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0094  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0099  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x00aa  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00af  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00c2  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00c7  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00e0  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00e5  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m43940a(android.content.Context r9, android.content.Intent r10, java.lang.CharSequence r11) {
            /*
                r8 = this;
                boolean[] r0 = m43944c()
                int r1 = com.instabug.chat.settings.C9441a.m44206i()
                r2 = 1
                r3 = -1
                if (r1 != r3) goto L_0x0011
                r1 = 71
                r0[r1] = r2
                goto L_0x001c
            L_0x0011:
                if (r1 == 0) goto L_0x0018
                r3 = 72
                r0[r3] = r2
                goto L_0x0026
            L_0x0018:
                r1 = 73
                r0[r1] = r2
            L_0x001c:
                com.instabug.library.util.InstabugAppData r1 = r8.f24878c
                int r1 = r1.getAppIcon()
                r3 = 74
                r0[r3] = r2
            L_0x0026:
                java.lang.String r3 = com.instabug.chat.settings.C9441a.m44212o()
                if (r3 == 0) goto L_0x0039
                r3 = 75
                r0[r3] = r2
                java.lang.String r3 = com.instabug.chat.settings.C9441a.m44212o()
                r4 = 76
                r0[r4] = r2
                goto L_0x003f
            L_0x0039:
                r3 = 77
                r0[r3] = r2
                java.lang.String r3 = "ibg_channel"
            L_0x003f:
                r4 = 134217728(0x8000000, float:3.85186E-34)
                r5 = 0
                android.app.PendingIntent r10 = android.app.PendingIntent.getActivity(r9, r5, r10, r4)
                r4 = 78
                r0[r4] = r2
                r4 = 2
                android.net.Uri r4 = android.media.RingtoneManager.getDefaultUri(r4)
                r6 = 79
                r0[r6] = r2
                androidx.core.app.p$e r6 = new androidx.core.app.p$e
                r6.<init>(r9, r3)
                r7 = 80
                r0[r7] = r2
                androidx.core.app.p$e r1 = r6.mo4253g(r1)
                com.instabug.library.util.InstabugAppData r6 = r8.f24878c
                r7 = 81
                r0[r7] = r2
                java.lang.String r6 = r6.getAppName()
                androidx.core.app.p$e r1 = r1.mo4234c(r6)
                r6 = 82
                r0[r6] = r2
                androidx.core.app.p$e r11 = r1.mo4228b(r11)
                r1 = 83
                r0[r1] = r2
                androidx.core.app.p$e r11 = r11.mo4217a(r2)
                r1 = 84
                r0[r1] = r2
                androidx.core.app.p$e r11 = r11.mo4235c(r3)
                r1 = 85
                r0[r1] = r2
                androidx.core.app.p$e r10 = r11.mo4204a(r10)
                int r11 = android.os.Build.VERSION.SDK_INT
                r1 = 16
                if (r11 >= r1) goto L_0x0099
                r11 = 86
                r0[r11] = r2
                goto L_0x00a4
            L_0x0099:
                r11 = 87
                r0[r11] = r2
                r10.mo4249f(r2)
                r11 = 88
                r0[r11] = r2
            L_0x00a4:
                int r11 = android.os.Build.VERSION.SDK_INT
                r1 = 21
                if (r11 >= r1) goto L_0x00af
                r11 = 89
                r0[r11] = r2
                goto L_0x00bc
            L_0x00af:
                r11 = 90
                r0[r11] = r2
                long[] r11 = new long[r5]
                r10.mo4218a(r11)
                r11 = 91
                r0[r11] = r2
            L_0x00bc:
                boolean r11 = com.instabug.chat.settings.C9441a.m44204g()
                if (r11 != 0) goto L_0x00c7
                r11 = 92
                r0[r11] = r2
                goto L_0x00d2
            L_0x00c7:
                r11 = 93
                r0[r11] = r2
                r10.mo4207a(r4)
                r11 = 94
                r0[r11] = r2
            L_0x00d2:
                r11 = 95
                r0[r11] = r2
                java.lang.String r11 = "notification"
                java.lang.Object r9 = r9.getSystemService(r11)
                android.app.NotificationManager r9 = (android.app.NotificationManager) r9
                if (r9 != 0) goto L_0x00e5
                r9 = 96
                r0[r9] = r2
                goto L_0x011d
            L_0x00e5:
                int r11 = android.os.Build.VERSION.SDK_INT
                r1 = 26
                if (r11 >= r1) goto L_0x00f0
                r11 = 97
                r0[r11] = r2
                goto L_0x0112
            L_0x00f0:
                android.app.NotificationChannel r11 = new android.app.NotificationChannel
                com.instabug.library.util.InstabugAppData r1 = r8.f24878c
                r4 = 98
                r0[r4] = r2
                java.lang.String r1 = r1.getAppName()
                r4 = 4
                r11.<init>(r3, r1, r4)
                r1 = 99
                r0[r1] = r2
                r11.setImportance(r4)
                r1 = 100
                r0[r1] = r2
                r9.createNotificationChannel(r11)
                r11 = 101(0x65, float:1.42E-43)
                r0[r11] = r2
            L_0x0112:
                android.app.Notification r10 = r10.mo4196a()
                r9.notify(r5, r10)
                r9 = 102(0x66, float:1.43E-43)
                r0[r9] = r2
            L_0x011d:
                r9 = 103(0x67, float:1.44E-43)
                r0[r9] = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.chat.C9377a.C9397d.m43940a(android.content.Context, android.content.Intent, java.lang.CharSequence):void");
        }

        /* renamed from: a */
        public void mo33836a(Bundle bundle) {
            boolean[] c = m43944c();
            if (InstabugCore.getFeatureState(Feature.PUSH_NOTIFICATION) != State.ENABLED) {
                c[104] = true;
            } else {
                c[105] = true;
                if (!InstabugChat.isInstabugNotification(bundle)) {
                    c[106] = true;
                } else {
                    c[107] = true;
                    SynchronizationManager.getInstance().sync();
                    c[108] = true;
                }
            }
            c[109] = true;
        }

        /* renamed from: a */
        public void mo33837a(Map<String, String> map) {
            boolean[] c = m43944c();
            if (InstabugCore.getFeatureState(Feature.PUSH_NOTIFICATION) != State.ENABLED) {
                c[110] = true;
            } else {
                c[111] = true;
                if (!InstabugChat.isInstabugNotification(map)) {
                    c[112] = true;
                } else {
                    c[113] = true;
                    SynchronizationManager.getInstance().sync();
                    c[114] = true;
                }
            }
            c[115] = true;
        }

        /* renamed from: a */
        private void m43939a(Activity activity, List<Message> list) {
            C9425c cVar;
            boolean[] c = m43944c();
            c[143] = true;
            Message message = (Message) list.get(list.size() - 1);
            if (this.f24876a != 1) {
                cVar = new C9425c();
                c[144] = true;
                cVar.mo33967a(m43937a((Context) activity, 0, list));
                c[145] = true;
                String i = message.mo33923i();
                c[146] = true;
                cVar.mo33969b(m43936a(activity, 0, i));
                c[147] = true;
                cVar.mo33971c(message.mo33924j());
                c[148] = true;
            } else {
                cVar = new C9425c();
                c[149] = true;
                cVar.mo33967a(m43937a((Context) activity, 1, list));
                c[150] = true;
                String i2 = message.mo33923i();
                c[151] = true;
                cVar.mo33969b(m43936a(activity, 1, i2));
                c[152] = true;
                cVar.mo33971c(message.mo33924j());
                c[153] = true;
            }
            this.f24877b.mo33813a(activity, cVar, (C9395n) new C9399b(this, activity));
            c[154] = true;
            PresentationManager.getInstance().setNotificationShowing(true);
            c[155] = true;
        }

        /* renamed from: a */
        private void m43938a(Activity activity) {
            boolean[] c = m43944c();
            if (this.f24876a != 1) {
                List<Message> list = this.f24879d;
                Message message = (Message) list.get(list.size() - 1);
                c[156] = true;
                String d = message.mo33914d();
                c[157] = true;
                Intent a = C9456b.m44298a(activity, d);
                c[158] = true;
                activity.startActivity(a);
                c[159] = true;
            } else {
                Intent a2 = C9456b.m44297a(activity);
                c[160] = true;
                activity.startActivity(a2);
                c[161] = true;
            }
            c[162] = true;
        }
    }

    C9377a() {
        m43876f()[0] = true;
    }

    /* renamed from: a */
    static void m43865a(Context context) {
        boolean[] f = m43876f();
        C9441a.m44184a(context);
        f[1] = true;
        C9409a.m44003a(context);
        f[2] = true;
        C9409a.m44002a();
        f[3] = true;
        m43873e(context);
        f[4] = true;
    }

    /* renamed from: b */
    static long m43867b() {
        boolean[] f = m43876f();
        long d = C9441a.m44198d();
        f[9] = true;
        return d;
    }

    /* renamed from: c */
    private static void m43870c() {
        boolean[] f = m43876f();
        SynchronizationManager.getInstance().release();
        f[8] = true;
    }

    /* renamed from: d */
    static /* synthetic */ void m43872d(Context context) {
        boolean[] f = m43876f();
        m43877g(context);
        f[46] = true;
    }

    /* renamed from: e */
    private static void m43873e(Context context) {
        boolean[] f = m43876f();
        SynchronizationManager.getInstance().init(context);
        f[5] = true;
    }

    /* renamed from: f */
    private static PluginPromptOption m43875f(Context context) {
        boolean[] f = m43876f();
        PluginPromptOption pluginPromptOption = new PluginPromptOption();
        f[15] = true;
        pluginPromptOption.setOrder(3);
        f[16] = true;
        pluginPromptOption.setInvocationMode(4);
        f[17] = true;
        pluginPromptOption.setNotificationCount(ChatsCacheManager.getUnreadCount());
        f[18] = true;
        pluginPromptOption.setIcon(C9371R.C9374drawable.ib_core_ic_talk_to_us);
        f[19] = true;
        pluginPromptOption.setTitle(m43878h(context));
        f[20] = true;
        pluginPromptOption.setOnInvocationListener(new C9378a(context));
        f[21] = true;
        return pluginPromptOption;
    }

    /* renamed from: f */
    private static /* synthetic */ boolean[] m43876f() {
        boolean[] zArr = f24819a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-5961422538963640709L, "com/instabug/chat/ChatPluginWrapper", 47);
        f24819a = a;
        return a;
    }

    /* renamed from: g */
    private static void m43877g(Context context) {
        boolean[] f = m43876f();
        m43871d();
        f[22] = true;
        Intent intent = InstabugDialogActivity.getIntent(context, null, null, null, true);
        f[23] = true;
        context.startActivity(intent);
        f[24] = true;
        if (ChatsCacheManager.getValidChats().size() > 0) {
            f[25] = true;
            InstabugChat.showChats();
            f[26] = true;
        } else {
            InstabugChat.openNewChat();
            f[27] = true;
        }
        f[28] = true;
    }

    @C0193h0
    /* renamed from: h */
    private static String m43878h(Context context) {
        boolean[] f = m43876f();
        Key key = Key.START_CHATS;
        f[33] = true;
        String localeStringResource = LocaleUtils.getLocaleStringResource(Instabug.getLocale(context), C9700R.string.instabug_str_talk_to_us, context);
        f[34] = true;
        String placeHolder = PlaceHolderUtils.getPlaceHolder(key, localeStringResource);
        f[35] = true;
        return placeHolder;
    }

    /* renamed from: b */
    static ArrayList<PluginPromptOption> m43868b(Context context) {
        boolean[] f = m43876f();
        ArrayList<PluginPromptOption> arrayList = new ArrayList<>();
        f[10] = true;
        if (!m43874e()) {
            f[11] = true;
        } else {
            f[12] = true;
            arrayList.add(m43875f(context));
            f[13] = true;
        }
        f[14] = true;
        return arrayList;
    }

    /* renamed from: d */
    private static void m43871d() {
        boolean[] f = m43876f();
        ChatPlugin chatPlugin = (ChatPlugin) InstabugCore.getXPlugin(ChatPlugin.class);
        if (chatPlugin == null) {
            f[29] = true;
        } else {
            f[30] = true;
            chatPlugin.setState(1);
            f[31] = true;
        }
        InstabugSDKLogger.m46622d(C9377a.class, "setPluginStateForeground->change plugin state to FOREGROUND");
        f[32] = true;
    }

    /* renamed from: c */
    static C12331g<SDKCoreEvent> m43869c(Context context) {
        boolean[] f = m43876f();
        C9379b bVar = new C9379b(context);
        f[37] = true;
        return bVar;
    }

    /* renamed from: e */
    private static boolean m43874e() {
        boolean z;
        boolean[] f = m43876f();
        if (InstabugCore.getFeatureState(Feature.IN_APP_MESSAGING) == State.ENABLED) {
            f[43] = true;
            z = true;
        } else {
            z = false;
            f[44] = true;
        }
        f[45] = true;
        return z;
    }

    /* renamed from: a */
    static void m43864a() {
        boolean[] f = m43876f();
        m43870c();
        f[6] = true;
        C9409a.m44004b();
        f[7] = true;
    }

    /* renamed from: a */
    static C12314c m43863a(C12331g<SDKCoreEvent> gVar) {
        boolean[] f = m43876f();
        C12314c subscribe = SDKCoreEventSubscriber.subscribe(gVar);
        f[36] = true;
        return subscribe;
    }

    /* renamed from: a */
    static void m43866a(C12314c cVar) {
        boolean[] f = m43876f();
        if (cVar == null) {
            f[38] = true;
        } else if (cVar.mo41878d()) {
            f[39] = true;
        } else {
            f[40] = true;
            cVar.dispose();
            f[41] = true;
        }
        f[42] = true;
    }
}
