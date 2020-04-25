package com.facebook.cache.disk;

import com.facebook.binaryresource.BinaryResource;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.CacheErrorLogger.CacheErrorCategory;
import com.facebook.cache.disk.DiskStorage.DiskDumpInfo;
import com.facebook.cache.disk.DiskStorage.Entry;
import com.facebook.cache.disk.DiskStorage.Inserter;
import com.facebook.common.file.FileTree;
import com.facebook.common.file.FileUtils;
import com.facebook.common.file.FileUtils.CreateDirectoryException;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.logging.FLog;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import p201f.p202a.C5952h;

public class DynamicDefaultDiskStorage implements DiskStorage {
    private static final Class<?> TAG = DynamicDefaultDiskStorage.class;
    private final String mBaseDirectoryName;
    private final Supplier<File> mBaseDirectoryPathSupplier;
    private final CacheErrorLogger mCacheErrorLogger;
    @VisibleForTesting
    volatile State mCurrentState = new State(null, null);
    private final int mVersion;

    @VisibleForTesting
    static class State {
        @C5952h
        public final DiskStorage delegate;
        @C5952h
        public final File rootDirectory;

        @VisibleForTesting
        State(@C5952h File file, @C5952h DiskStorage diskStorage) {
            this.delegate = diskStorage;
            this.rootDirectory = file;
        }
    }

    public DynamicDefaultDiskStorage(int i, Supplier<File> supplier, String str, CacheErrorLogger cacheErrorLogger) {
        this.mVersion = i;
        this.mCacheErrorLogger = cacheErrorLogger;
        this.mBaseDirectoryPathSupplier = supplier;
        this.mBaseDirectoryName = str;
    }

    private void createStorage() throws IOException {
        File file = new File((File) this.mBaseDirectoryPathSupplier.get(), this.mBaseDirectoryName);
        createRootDirectoryIfNecessary(file);
        this.mCurrentState = new State(file, new DefaultDiskStorage(file, this.mVersion, this.mCacheErrorLogger));
    }

    private boolean shouldCreateNewStorage() {
        State state = this.mCurrentState;
        if (state.delegate != null) {
            File file = state.rootDirectory;
            if (file != null && file.exists()) {
                return false;
            }
        }
        return true;
    }

    public void clearAll() throws IOException {
        get().clearAll();
    }

    public boolean contains(String str, Object obj) throws IOException {
        return get().contains(str, obj);
    }

    /* access modifiers changed from: 0000 */
    @VisibleForTesting
    public void createRootDirectoryIfNecessary(File file) throws IOException {
        try {
            FileUtils.mkdirs(file);
            FLog.m15734d(TAG, "Created cache directory %s", (Object) file.getAbsolutePath());
        } catch (CreateDirectoryException e) {
            this.mCacheErrorLogger.logError(CacheErrorCategory.WRITE_CREATE_DIR, TAG, "createRootDirectoryIfNecessary", e);
            throw e;
        }
    }

    /* access modifiers changed from: 0000 */
    @VisibleForTesting
    public void deleteOldStorageIfNecessary() {
        if (this.mCurrentState.delegate != null && this.mCurrentState.rootDirectory != null) {
            FileTree.deleteRecursively(this.mCurrentState.rootDirectory);
        }
    }

    /* access modifiers changed from: 0000 */
    @VisibleForTesting
    public synchronized DiskStorage get() throws IOException {
        if (shouldCreateNewStorage()) {
            deleteOldStorageIfNecessary();
            createStorage();
        }
        return (DiskStorage) Preconditions.checkNotNull(this.mCurrentState.delegate);
    }

    public DiskDumpInfo getDumpInfo() throws IOException {
        return get().getDumpInfo();
    }

    public Collection<Entry> getEntries() throws IOException {
        return get().getEntries();
    }

    public BinaryResource getResource(String str, Object obj) throws IOException {
        return get().getResource(str, obj);
    }

    public String getStorageName() {
        try {
            return get().getStorageName();
        } catch (IOException unused) {
            return "";
        }
    }

    public Inserter insert(String str, Object obj) throws IOException {
        return get().insert(str, obj);
    }

    public boolean isEnabled() {
        try {
            return get().isEnabled();
        } catch (IOException unused) {
            return false;
        }
    }

    public boolean isExternal() {
        try {
            return get().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }

    public void purgeUnexpectedResources() {
        try {
            get().purgeUnexpectedResources();
        } catch (IOException e) {
            FLog.m15750e(TAG, "purgeUnexpectedResources", (Throwable) e);
        }
    }

    public long remove(Entry entry) throws IOException {
        return get().remove(entry);
    }

    public boolean touch(String str, Object obj) throws IOException {
        return get().touch(str, obj);
    }

    public long remove(String str) throws IOException {
        return get().remove(str);
    }
}
