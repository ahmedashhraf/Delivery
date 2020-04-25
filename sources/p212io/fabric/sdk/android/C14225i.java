package p212io.fabric.sdk.android;

import android.content.Context;
import java.io.File;
import java.util.Collection;
import p212io.fabric.sdk.android.p493p.p495b.C14265s;
import p212io.fabric.sdk.android.services.concurrency.C14368n;
import p212io.fabric.sdk.android.services.concurrency.C6035e;

/* renamed from: io.fabric.sdk.android.i */
/* compiled from: Kit */
public abstract class C14225i<Result> implements Comparable<C14225i> {
    Context context;
    final C6035e dependsOnAnnotation = ((C6035e) getClass().getAnnotation(C6035e.class));
    C14215d fabric;
    C14265s idManager;
    C14221g<Result> initializationCallback;
    C14224h<Result> initializationTask = new C14224h<>(this);

    /* access modifiers changed from: 0000 */
    public boolean containsAnnotatedDependency(C14225i iVar) {
        if (hasAnnotatedDependency()) {
            for (Class isAssignableFrom : this.dependsOnAnnotation.value()) {
                if (isAssignableFrom.isAssignableFrom(iVar.getClass())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract Result doInBackground();

    public Context getContext() {
        return this.context;
    }

    /* access modifiers changed from: protected */
    public Collection<C14368n> getDependencies() {
        return this.initializationTask.getDependencies();
    }

    public C14215d getFabric() {
        return this.fabric;
    }

    /* access modifiers changed from: protected */
    public C14265s getIdManager() {
        return this.idManager;
    }

    public abstract String getIdentifier();

    public String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append(".Fabric");
        sb.append(File.separator);
        sb.append(getIdentifier());
        return sb.toString();
    }

    public abstract String getVersion();

    /* access modifiers changed from: 0000 */
    public boolean hasAnnotatedDependency() {
        return this.dependsOnAnnotation != null;
    }

    /* access modifiers changed from: 0000 */
    public final void initialize() {
        this.initializationTask.mo45322a(this.fabric.mo45062e(), null);
    }

    /* access modifiers changed from: 0000 */
    public void injectParameters(Context context2, C14215d dVar, C14221g<Result> gVar, C14265s sVar) {
        this.fabric = dVar;
        this.context = new C14219e(context2, getIdentifier(), getPath());
        this.initializationCallback = gVar;
        this.idManager = sVar;
    }

    /* access modifiers changed from: protected */
    public void onCancelled(Result result) {
    }

    /* access modifiers changed from: protected */
    public void onPostExecute(Result result) {
    }

    /* access modifiers changed from: protected */
    public boolean onPreExecute() {
        return true;
    }

    public int compareTo(C14225i iVar) {
        if (containsAnnotatedDependency(iVar)) {
            return 1;
        }
        if (iVar.containsAnnotatedDependency(this)) {
            return -1;
        }
        if (hasAnnotatedDependency() && !iVar.hasAnnotatedDependency()) {
            return 1;
        }
        if (hasAnnotatedDependency() || !iVar.hasAnnotatedDependency()) {
            return 0;
        }
        return -1;
    }
}
