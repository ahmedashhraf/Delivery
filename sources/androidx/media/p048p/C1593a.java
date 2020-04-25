package androidx.media.p048p;

import android.app.Notification;
import android.app.Notification.DecoratedMediaCustomViewStyle;
import android.app.Notification.MediaStyle;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p003v4.media.session.MediaSessionCompat.Token;
import android.widget.RemoteViews;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.RequiresApi;
import androidx.core.app.C0748i;
import androidx.core.app.C0769o;
import androidx.core.app.C0770p;
import androidx.core.app.C0770p.C0771a;
import androidx.core.app.C0770p.C0779e;
import androidx.core.app.C0770p.C0791n;
import androidx.media.C1519R;

/* renamed from: androidx.media.p.a */
/* compiled from: NotificationCompat */
public class C1593a {

    /* renamed from: androidx.media.p.a$a */
    /* compiled from: NotificationCompat */
    public static class C1594a extends C1595b {
        @C0207n0({C0208a.LIBRARY_GROUP})
        /* renamed from: a */
        public void mo4190a(C0769o oVar) {
            if (VERSION.SDK_INT >= 24) {
                oVar.mo4156a().setStyle(mo6821a((MediaStyle) new DecoratedMediaCustomViewStyle()));
            } else {
                super.mo4190a(oVar);
            }
        }

        @C0207n0({C0208a.LIBRARY_GROUP})
        /* renamed from: b */
        public RemoteViews mo4278b(C0769o oVar) {
            RemoteViews remoteViews;
            if (VERSION.SDK_INT >= 24) {
                return null;
            }
            if (this.f3699a.mo4220b() != null) {
                remoteViews = this.f3699a.mo4220b();
            } else {
                remoteViews = this.f3699a.mo4237d();
            }
            if (remoteViews == null) {
                return null;
            }
            RemoteViews b = mo4290b();
            mo4307a(b, remoteViews);
            if (VERSION.SDK_INT >= 21) {
                m8104a(b);
            }
            return b;
        }

        @C0207n0({C0208a.LIBRARY_GROUP})
        /* renamed from: c */
        public RemoteViews mo4279c(C0769o oVar) {
            if (VERSION.SDK_INT >= 24) {
                return null;
            }
            boolean z = true;
            boolean z2 = this.f3699a.mo4237d() != null;
            if (VERSION.SDK_INT >= 21) {
                if (!z2 && this.f3699a.mo4220b() == null) {
                    z = false;
                }
                if (z) {
                    RemoteViews c = mo6826c();
                    if (z2) {
                        mo4307a(c, this.f3699a.mo4237d());
                    }
                    m8104a(c);
                    return c;
                }
            } else {
                RemoteViews c2 = mo6826c();
                if (z2) {
                    mo4307a(c2, this.f3699a.mo4237d());
                    return c2;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo6820d() {
            if (this.f3699a.mo4237d() != null) {
                return C1519R.layout.notification_template_media_custom;
            }
            return super.mo6820d();
        }

        @C0207n0({C0208a.LIBRARY_GROUP})
        /* renamed from: d */
        public RemoteViews mo4280d(C0769o oVar) {
            RemoteViews remoteViews;
            if (VERSION.SDK_INT >= 24) {
                return null;
            }
            if (this.f3699a.mo4248f() != null) {
                remoteViews = this.f3699a.mo4248f();
            } else {
                remoteViews = this.f3699a.mo4237d();
            }
            if (remoteViews == null) {
                return null;
            }
            RemoteViews b = mo4290b();
            mo4307a(b, remoteViews);
            if (VERSION.SDK_INT >= 21) {
                m8104a(b);
            }
            return b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo6819a(int i) {
            return i <= 3 ? C1519R.layout.notification_template_big_media_narrow_custom : C1519R.layout.notification_template_big_media_custom;
        }

        /* renamed from: a */
        private void m8104a(RemoteViews remoteViews) {
            int i;
            if (this.f3699a.mo4231c() != 0) {
                i = this.f3699a.mo4231c();
            } else {
                i = this.f3699a.f3624a.getResources().getColor(C1519R.C1520color.notification_material_background_media_default_color);
            }
            remoteViews.setInt(C1519R.C1522id.status_bar_latest_event_content, "setBackgroundColor", i);
        }
    }

    /* renamed from: androidx.media.p.a$b */
    /* compiled from: NotificationCompat */
    public static class C1595b extends C0791n {

        /* renamed from: i */
        private static final int f6071i = 3;

        /* renamed from: j */
        private static final int f6072j = 5;

        /* renamed from: e */
        int[] f6073e = null;

        /* renamed from: f */
        Token f6074f;

        /* renamed from: g */
        boolean f6075g;

        /* renamed from: h */
        PendingIntent f6076h;

        public C1595b() {
        }

        /* renamed from: a */
        public static Token m8111a(Notification notification) {
            Bundle f = C0770p.m4373f(notification);
            if (f != null) {
                int i = VERSION.SDK_INT;
                String str = C0770p.f3500P;
                if (i >= 21) {
                    Parcelable parcelable = f.getParcelable(str);
                    if (parcelable != null) {
                        return Token.m550b((Object) parcelable);
                    }
                } else {
                    IBinder a = C0748i.m4315a(f, str);
                    if (a != null) {
                        Parcel obtain = Parcel.obtain();
                        obtain.writeStrongBinder(a);
                        obtain.setDataPosition(0);
                        Token token = (Token) Token.CREATOR.createFromParcel(obtain);
                        obtain.recycle();
                        return token;
                    }
                }
            }
            return null;
        }

        @C0207n0({C0208a.LIBRARY_GROUP})
        /* renamed from: b */
        public RemoteViews mo4278b(C0769o oVar) {
            if (VERSION.SDK_INT >= 21) {
                return null;
            }
            return mo4290b();
        }

        @C0207n0({C0208a.LIBRARY_GROUP})
        /* renamed from: c */
        public RemoteViews mo4279c(C0769o oVar) {
            if (VERSION.SDK_INT >= 21) {
                return null;
            }
            return mo6826c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo6820d() {
            return C1519R.layout.notification_template_media;
        }

        public C1595b(C0779e eVar) {
            mo4308a(eVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public RemoteViews mo4290b() {
            int min = Math.min(this.f3699a.f3625b.size(), 5);
            RemoteViews a = mo4306a(false, mo6819a(min), false);
            a.removeAllViews(C1519R.C1522id.media_actions);
            if (min > 0) {
                for (int i = 0; i < min; i++) {
                    a.addView(C1519R.C1522id.media_actions, m8112a((C0771a) this.f3699a.f3625b.get(i)));
                }
            }
            if (this.f6075g) {
                a.setViewVisibility(C1519R.C1522id.cancel_action, 0);
                a.setInt(C1519R.C1522id.cancel_action, "setAlpha", this.f3699a.f3624a.getResources().getInteger(C1519R.integer.cancel_button_image_alpha));
                a.setOnClickPendingIntent(C1519R.C1522id.cancel_action, this.f6076h);
            } else {
                a.setViewVisibility(C1519R.C1522id.cancel_action, 8);
            }
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public RemoteViews mo6826c() {
            int i;
            RemoteViews a = mo4306a(false, mo6820d(), true);
            int size = this.f3699a.f3625b.size();
            int[] iArr = this.f6073e;
            if (iArr == null) {
                i = 0;
            } else {
                i = Math.min(iArr.length, 3);
            }
            a.removeAllViews(C1519R.C1522id.media_actions);
            if (i > 0) {
                int i2 = 0;
                while (i2 < i) {
                    if (i2 < size) {
                        a.addView(C1519R.C1522id.media_actions, m8112a((C0771a) this.f3699a.f3625b.get(this.f6073e[i2])));
                        i2++;
                    } else {
                        throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[]{Integer.valueOf(i2), Integer.valueOf(size - 1)}));
                    }
                }
            }
            if (this.f6075g) {
                a.setViewVisibility(C1519R.C1522id.end_padder, 8);
                a.setViewVisibility(C1519R.C1522id.cancel_action, 0);
                a.setOnClickPendingIntent(C1519R.C1522id.cancel_action, this.f6076h);
                a.setInt(C1519R.C1522id.cancel_action, "setAlpha", this.f3699a.f3624a.getResources().getInteger(C1519R.integer.cancel_button_image_alpha));
            } else {
                a.setViewVisibility(C1519R.C1522id.end_padder, 0);
                a.setViewVisibility(C1519R.C1522id.cancel_action, 8);
            }
            return a;
        }

        /* renamed from: a */
        public C1595b mo6825a(int... iArr) {
            this.f6073e = iArr;
            return this;
        }

        /* renamed from: a */
        public C1595b mo6823a(Token token) {
            this.f6074f = token;
            return this;
        }

        /* renamed from: a */
        public C1595b mo6824a(boolean z) {
            if (VERSION.SDK_INT < 21) {
                this.f6075g = z;
            }
            return this;
        }

        /* renamed from: a */
        public C1595b mo6822a(PendingIntent pendingIntent) {
            this.f6076h = pendingIntent;
            return this;
        }

        @C0207n0({C0208a.LIBRARY_GROUP})
        /* renamed from: a */
        public void mo4190a(C0769o oVar) {
            if (VERSION.SDK_INT >= 21) {
                oVar.mo4156a().setStyle(mo6821a(new MediaStyle()));
            } else if (this.f6075g) {
                oVar.mo4156a().setOngoing(true);
            }
        }

        /* access modifiers changed from: 0000 */
        @RequiresApi(21)
        /* renamed from: a */
        public MediaStyle mo6821a(MediaStyle mediaStyle) {
            int[] iArr = this.f6073e;
            if (iArr != null) {
                mediaStyle.setShowActionsInCompactView(iArr);
            }
            Token token = this.f6074f;
            if (token != null) {
                mediaStyle.setMediaSession((MediaSession.Token) token.mo374c());
            }
            return mediaStyle;
        }

        /* renamed from: a */
        private RemoteViews m8112a(C0771a aVar) {
            boolean z = aVar.mo4157a() == null;
            RemoteViews remoteViews = new RemoteViews(this.f3699a.f3624a.getPackageName(), C1519R.layout.notification_media_action);
            remoteViews.setImageViewResource(C1519R.C1522id.action0, aVar.mo4161e());
            if (!z) {
                remoteViews.setOnClickPendingIntent(C1519R.C1522id.action0, aVar.mo4157a());
            }
            if (VERSION.SDK_INT >= 15) {
                remoteViews.setContentDescription(C1519R.C1522id.action0, aVar.mo4165i());
            }
            return remoteViews;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo6819a(int i) {
            return i <= 3 ? C1519R.layout.notification_template_big_media_narrow : C1519R.layout.notification_template_big_media;
        }
    }

    private C1593a() {
    }
}
