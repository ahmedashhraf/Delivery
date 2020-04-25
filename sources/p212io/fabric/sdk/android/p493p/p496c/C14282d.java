package p212io.fabric.sdk.android.p493p.p496c;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.p493p.p495b.C14248i;
import p212io.fabric.sdk.android.p493p.p495b.C14254k;

/* renamed from: io.fabric.sdk.android.p.c.d */
/* compiled from: EventsFilesManager */
public abstract class C14282d<T> {
    public static final int MAX_BYTE_SIZE_PER_FILE = 8000;
    public static final int MAX_FILES_IN_BATCH = 1;
    public static final int MAX_FILES_TO_KEEP = 100;
    public static final String ROLL_OVER_FILE_NAME_SEPARATOR = "_";
    protected final Context context;
    protected final C14254k currentTimeProvider;
    private final int defaultMaxFilesToKeep;
    protected final C14291g eventStorage;
    protected volatile long lastRollOverTime;
    protected final List<C14292h> rollOverListeners = new CopyOnWriteArrayList();
    protected final C14281c<T> transform;

    /* renamed from: io.fabric.sdk.android.p.c.d$a */
    /* compiled from: EventsFilesManager */
    class C14283a implements Comparator<C14284b> {
        C14283a() {
        }

        /* renamed from: a */
        public int compare(C14284b bVar, C14284b bVar2) {
            return (int) (bVar.f42133b - bVar2.f42133b);
        }
    }

    /* renamed from: io.fabric.sdk.android.p.c.d$b */
    /* compiled from: EventsFilesManager */
    static class C14284b {

        /* renamed from: a */
        final File f42132a;

        /* renamed from: b */
        final long f42133b;

        public C14284b(File file, long j) {
            this.f42132a = file;
            this.f42133b = j;
        }
    }

    public C14282d(Context context2, C14281c<T> cVar, C14254k kVar, C14291g gVar, int i) throws IOException {
        this.context = context2.getApplicationContext();
        this.transform = cVar;
        this.eventStorage = gVar;
        this.currentTimeProvider = kVar;
        this.lastRollOverTime = this.currentTimeProvider.mo45145a();
        this.defaultMaxFilesToKeep = i;
    }

    private void rollFileOverIfNeeded(int i) throws IOException {
        if (!this.eventStorage.mo45234a(i, getMaxByteSizePerFile())) {
            C14248i.m61811a(this.context, 4, C14215d.f41919m, String.format(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", new Object[]{Integer.valueOf(this.eventStorage.mo45229a()), Integer.valueOf(i), Integer.valueOf(getMaxByteSizePerFile())}));
            rollFileOver();
        }
    }

    private void triggerRollOverOnListeners(String str) {
        for (C14292h onRollOver : this.rollOverListeners) {
            try {
                onRollOver.onRollOver(str);
            } catch (Exception e) {
                C14248i.m61813a(this.context, "One of the roll over listeners threw an exception", (Throwable) e);
            }
        }
    }

    public void deleteAllEventsFiles() {
        C14291g gVar = this.eventStorage;
        gVar.mo45232a(gVar.mo45236c());
        this.eventStorage.mo45239f();
    }

    public void deleteOldestInRollOverIfOverMax() {
        List<File> c = this.eventStorage.mo45236c();
        int maxFilesToKeep = getMaxFilesToKeep();
        if (c.size() > maxFilesToKeep) {
            int size = c.size() - maxFilesToKeep;
            C14248i.m61829c(this.context, String.format(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", new Object[]{Integer.valueOf(c.size()), Integer.valueOf(maxFilesToKeep), Integer.valueOf(size)}));
            TreeSet treeSet = new TreeSet(new C14283a());
            for (File file : c) {
                treeSet.add(new C14284b(file, parseCreationTimestampFromFileName(file.getName())));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = treeSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((C14284b) it.next()).f42132a);
                if (arrayList.size() == size) {
                    break;
                }
            }
            this.eventStorage.mo45232a((List<File>) arrayList);
        }
    }

    public void deleteSentFiles(List<File> list) {
        this.eventStorage.mo45232a(list);
    }

    /* access modifiers changed from: protected */
    public abstract String generateUniqueRollOverFileName();

    public List<File> getBatchOfFilesToSend() {
        return this.eventStorage.mo45230a(1);
    }

    public long getLastRollOverTime() {
        return this.lastRollOverTime;
    }

    /* access modifiers changed from: protected */
    public int getMaxByteSizePerFile() {
        return 8000;
    }

    /* access modifiers changed from: protected */
    public int getMaxFilesToKeep() {
        return this.defaultMaxFilesToKeep;
    }

    public long parseCreationTimestampFromFileName(String str) {
        String[] split = str.split(ROLL_OVER_FILE_NAME_SEPARATOR);
        if (split.length != 3) {
            return 0;
        }
        try {
            return Long.valueOf(split[2]).longValue();
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public void registerRollOverListener(C14292h hVar) {
        if (hVar != null) {
            this.rollOverListeners.add(hVar);
        }
    }

    public boolean rollFileOver() throws IOException {
        String str;
        boolean z = true;
        if (!this.eventStorage.mo45235b()) {
            str = generateUniqueRollOverFileName();
            this.eventStorage.mo45231a(str);
            C14248i.m61811a(this.context, 4, C14215d.f41919m, String.format(Locale.US, "generated new file %s", new Object[]{str}));
            this.lastRollOverTime = this.currentTimeProvider.mo45145a();
        } else {
            str = null;
            z = false;
        }
        triggerRollOverOnListeners(str);
        return z;
    }

    public void writeEvent(T t) throws IOException {
        byte[] bytes = this.transform.toBytes(t);
        rollFileOverIfNeeded(bytes.length);
        this.eventStorage.mo45233a(bytes);
    }
}
