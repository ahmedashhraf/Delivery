package com.crashlytics.android;

import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.beta.Beta;
import com.crashlytics.android.core.CrashlyticsCore;
import com.crashlytics.android.core.CrashlyticsListener;
import com.crashlytics.android.core.PinningInfoProvider;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.C14225i;
import p212io.fabric.sdk.android.C14226j;
import p212io.fabric.sdk.android.p493p.p495b.C14255l;

public class Crashlytics extends C14225i<Void> implements C14226j {
    public static final String TAG = "Crashlytics";
    public final Answers answers;
    public final Beta beta;
    public final CrashlyticsCore core;
    public final Collection<? extends C14225i> kits;

    public static class Builder {
        private Answers answers;
        private Beta beta;
        private CrashlyticsCore core;
        private com.crashlytics.android.core.CrashlyticsCore.Builder coreBuilder;

        private synchronized com.crashlytics.android.core.CrashlyticsCore.Builder getCoreBuilder() {
            if (this.coreBuilder == null) {
                this.coreBuilder = new com.crashlytics.android.core.CrashlyticsCore.Builder();
            }
            return this.coreBuilder;
        }

        public Builder answers(Answers answers2) {
            if (answers2 == null) {
                throw new NullPointerException("Answers Kit must not be null.");
            } else if (this.answers == null) {
                this.answers = answers2;
                return this;
            } else {
                throw new IllegalStateException("Answers Kit already set.");
            }
        }

        public Builder beta(Beta beta2) {
            if (beta2 == null) {
                throw new NullPointerException("Beta Kit must not be null.");
            } else if (this.beta == null) {
                this.beta = beta2;
                return this;
            } else {
                throw new IllegalStateException("Beta Kit already set.");
            }
        }

        public Crashlytics build() {
            com.crashlytics.android.core.CrashlyticsCore.Builder builder = this.coreBuilder;
            if (builder != null) {
                if (this.core == null) {
                    this.core = builder.build();
                } else {
                    throw new IllegalStateException("Must not use Deprecated methods delay(), disabled(), listener(), pinningInfoProvider() with core()");
                }
            }
            if (this.answers == null) {
                this.answers = new Answers();
            }
            if (this.beta == null) {
                this.beta = new Beta();
            }
            if (this.core == null) {
                this.core = new CrashlyticsCore();
            }
            return new Crashlytics(this.answers, this.beta, this.core);
        }

        public Builder core(CrashlyticsCore crashlyticsCore) {
            if (crashlyticsCore == null) {
                throw new NullPointerException("CrashlyticsCore Kit must not be null.");
            } else if (this.core == null) {
                this.core = crashlyticsCore;
                return this;
            } else {
                throw new IllegalStateException("CrashlyticsCore Kit already set.");
            }
        }

        @Deprecated
        public Builder delay(float f) {
            getCoreBuilder().delay(f);
            return this;
        }

        @Deprecated
        public Builder disabled(boolean z) {
            getCoreBuilder().disabled(z);
            return this;
        }

        @Deprecated
        public Builder listener(CrashlyticsListener crashlyticsListener) {
            getCoreBuilder().listener(crashlyticsListener);
            return this;
        }

        @Deprecated
        public Builder pinningInfo(PinningInfoProvider pinningInfoProvider) {
            getCoreBuilder().pinningInfo(pinningInfoProvider);
            return this;
        }
    }

    public Crashlytics() {
        this(new Answers(), new Beta(), new CrashlyticsCore());
    }

    private static void checkInitialized() {
        if (getInstance() == null) {
            throw new IllegalStateException("Crashlytics must be initialized by calling Fabric.with(Context) prior to calling Crashlytics.getInstance()");
        }
    }

    public static Crashlytics getInstance() {
        return (Crashlytics) C14215d.m61662a(Crashlytics.class);
    }

    public static PinningInfoProvider getPinningInfoProvider() {
        checkInitialized();
        return getInstance().core.getPinningInfoProvider();
    }

    private static boolean isCrashlyticsCollectionEnabled() {
        checkInitialized();
        return C14255l.m61854a(getInstance().getContext()).mo45147a();
    }

    public static void log(String str) {
        checkInitialized();
        getInstance().core.log(str);
    }

    public static void logException(Throwable th) {
        checkInitialized();
        getInstance().core.logException(th);
    }

    public static void setBool(String str, boolean z) {
        checkInitialized();
        getInstance().core.setBool(str, z);
    }

    private static void setCrashlyticsCollectionEnabled(boolean z) {
        checkInitialized();
        C14255l.m61854a(getInstance().getContext()).mo45146a(z);
    }

    public static void setDouble(String str, double d) {
        checkInitialized();
        getInstance().core.setDouble(str, d);
    }

    public static void setFloat(String str, float f) {
        checkInitialized();
        getInstance().core.setFloat(str, f);
    }

    public static void setInt(String str, int i) {
        checkInitialized();
        getInstance().core.setInt(str, i);
    }

    public static void setLong(String str, long j) {
        checkInitialized();
        getInstance().core.setLong(str, j);
    }

    @Deprecated
    public static void setPinningInfoProvider(PinningInfoProvider pinningInfoProvider) {
        C14215d.m61672j().mo45051w(TAG, "Use of Crashlytics.setPinningInfoProvider is deprecated");
    }

    public static void setString(String str, String str2) {
        checkInitialized();
        getInstance().core.setString(str, str2);
    }

    public static void setUserEmail(String str) {
        checkInitialized();
        getInstance().core.setUserEmail(str);
    }

    public static void setUserIdentifier(String str) {
        checkInitialized();
        getInstance().core.setUserIdentifier(str);
    }

    public static void setUserName(String str) {
        checkInitialized();
        getInstance().core.setUserName(str);
    }

    public void crash() {
        this.core.crash();
    }

    /* access modifiers changed from: protected */
    public Void doInBackground() {
        return null;
    }

    @Deprecated
    public boolean getDebugMode() {
        C14215d.m61672j().mo45051w(TAG, "Use of Crashlytics.getDebugMode is deprecated.");
        getFabric();
        return C14215d.m61674l();
    }

    public String getIdentifier() {
        return "com.crashlytics.sdk.android:crashlytics";
    }

    public Collection<? extends C14225i> getKits() {
        return this.kits;
    }

    public String getVersion() {
        return "2.10.1.34";
    }

    @Deprecated
    public void setDebugMode(boolean z) {
        C14215d.m61672j().mo45051w(TAG, "Use of Crashlytics.setDebugMode is deprecated.");
    }

    @Deprecated
    public synchronized void setListener(CrashlyticsListener crashlyticsListener) {
        this.core.setListener(crashlyticsListener);
    }

    public boolean verifyPinning(URL url) {
        return this.core.verifyPinning(url);
    }

    Crashlytics(Answers answers2, Beta beta2, CrashlyticsCore crashlyticsCore) {
        this.answers = answers2;
        this.beta = beta2;
        this.core = crashlyticsCore;
        this.kits = Collections.unmodifiableCollection(Arrays.asList(new C14225i[]{answers2, beta2, crashlyticsCore}));
    }

    public static void log(int i, String str, String str2) {
        checkInitialized();
        getInstance().core.log(i, str, str2);
    }
}
