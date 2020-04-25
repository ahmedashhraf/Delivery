package p212io.fabric.sdk.android.services.concurrency;

import java.util.Collection;

/* renamed from: io.fabric.sdk.android.services.concurrency.c */
/* compiled from: Dependency */
public interface C14347c<T> {
    void addDependency(T t);

    boolean areDependenciesMet();

    Collection<T> getDependencies();
}
