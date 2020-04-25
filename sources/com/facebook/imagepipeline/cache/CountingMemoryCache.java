package com.facebook.imagepipeline.cache;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Predicate;
import com.facebook.common.internal.Supplier;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.common.memory.MemoryTrimmable;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.ResourceReleaser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import p201f.p202a.C5952h;
import p201f.p202a.p203u.C5966a;
import p201f.p202a.p203u.C5969d;

@C5969d
public class CountingMemoryCache<K, V> implements MemoryCache<K, V>, MemoryTrimmable {
    @VisibleForTesting
    static final long PARAMS_INTERCHECK_INTERVAL_MS = TimeUnit.MINUTES.toMillis(5);
    private final CacheTrimStrategy mCacheTrimStrategy;
    @VisibleForTesting
    @C5966a("this")
    final CountingLruMap<K, Entry<K, V>> mCachedEntries;
    @VisibleForTesting
    @C5966a("this")
    final CountingLruMap<K, Entry<K, V>> mExclusiveEntries;
    @C5966a("this")
    private long mLastCacheParamsCheck;
    @C5966a("this")
    protected MemoryCacheParams mMemoryCacheParams;
    private final Supplier<MemoryCacheParams> mMemoryCacheParamsSupplier;
    @VisibleForTesting
    @C5966a("this")
    final Map<Bitmap, Object> mOtherEntries = new WeakHashMap();
    private final ValueDescriptor<V> mValueDescriptor;

    public interface CacheTrimStrategy {
        double getTrimRatio(MemoryTrimType memoryTrimType);
    }

    @VisibleForTesting
    static class Entry<K, V> {
        public int clientCount = 0;
        public boolean isOrphan = false;
        public final K key;
        @C5952h
        public final EntryStateObserver<K> observer;
        public final CloseableReference<V> valueRef;

        private Entry(K k, CloseableReference<V> closeableReference, @C5952h EntryStateObserver<K> entryStateObserver) {
            this.key = Preconditions.checkNotNull(k);
            this.valueRef = (CloseableReference) Preconditions.checkNotNull(CloseableReference.cloneOrNull(closeableReference));
            this.observer = entryStateObserver;
        }

        @VisibleForTesting
        /* renamed from: of */
        static <K, V> Entry<K, V> m15821of(K k, CloseableReference<V> closeableReference, @C5952h EntryStateObserver<K> entryStateObserver) {
            return new Entry<>(k, closeableReference, entryStateObserver);
        }
    }

    public interface EntryStateObserver<K> {
        void onExclusivityChanged(K k, boolean z);
    }

    public CountingMemoryCache(ValueDescriptor<V> valueDescriptor, CacheTrimStrategy cacheTrimStrategy, Supplier<MemoryCacheParams> supplier) {
        this.mValueDescriptor = valueDescriptor;
        this.mExclusiveEntries = new CountingLruMap<>(wrapValueDescriptor(valueDescriptor));
        this.mCachedEntries = new CountingLruMap<>(wrapValueDescriptor(valueDescriptor));
        this.mCacheTrimStrategy = cacheTrimStrategy;
        this.mMemoryCacheParamsSupplier = supplier;
        this.mMemoryCacheParams = (MemoryCacheParams) this.mMemoryCacheParamsSupplier.get();
        this.mLastCacheParamsCheck = SystemClock.uptimeMillis();
    }

    private synchronized boolean canCacheNewValue(V v) {
        boolean z;
        int sizeInBytes = this.mValueDescriptor.getSizeInBytes(v);
        z = true;
        if (sizeInBytes > this.mMemoryCacheParams.maxCacheEntrySize || getInUseCount() > this.mMemoryCacheParams.maxCacheEntries - 1 || getInUseSizeInBytes() > this.mMemoryCacheParams.maxCacheSize - sizeInBytes) {
            z = false;
        }
        return z;
    }

    private synchronized void decreaseClientCount(Entry<K, V> entry) {
        Preconditions.checkNotNull(entry);
        Preconditions.checkState(entry.clientCount > 0);
        entry.clientCount--;
    }

    private synchronized void increaseClientCount(Entry<K, V> entry) {
        Preconditions.checkNotNull(entry);
        Preconditions.checkState(!entry.isOrphan);
        entry.clientCount++;
    }

    private synchronized void makeOrphan(Entry<K, V> entry) {
        Preconditions.checkNotNull(entry);
        Preconditions.checkState(!entry.isOrphan);
        entry.isOrphan = true;
    }

    private synchronized void makeOrphans(@C5952h ArrayList<Entry<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                makeOrphan((Entry) it.next());
            }
        }
    }

    private synchronized boolean maybeAddToExclusives(Entry<K, V> entry) {
        if (entry.isOrphan || entry.clientCount != 0) {
            return false;
        }
        this.mExclusiveEntries.put(entry.key, entry);
        return true;
    }

    private void maybeClose(@C5952h ArrayList<Entry<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CloseableReference.closeSafely(referenceToClose((Entry) it.next()));
            }
        }
    }

    private void maybeEvictEntries() {
        ArrayList trimExclusivelyOwnedEntries;
        synchronized (this) {
            trimExclusivelyOwnedEntries = trimExclusivelyOwnedEntries(Math.min(this.mMemoryCacheParams.maxEvictionQueueEntries, this.mMemoryCacheParams.maxCacheEntries - getInUseCount()), Math.min(this.mMemoryCacheParams.maxEvictionQueueSize, this.mMemoryCacheParams.maxCacheSize - getInUseSizeInBytes()));
            makeOrphans(trimExclusivelyOwnedEntries);
        }
        maybeClose(trimExclusivelyOwnedEntries);
        maybeNotifyExclusiveEntryRemoval(trimExclusivelyOwnedEntries);
    }

    private static <K, V> void maybeNotifyExclusiveEntryInsertion(@C5952h Entry<K, V> entry) {
        if (entry != null) {
            EntryStateObserver<K> entryStateObserver = entry.observer;
            if (entryStateObserver != null) {
                entryStateObserver.onExclusivityChanged(entry.key, true);
            }
        }
    }

    private void maybeNotifyExclusiveEntryRemoval(@C5952h ArrayList<Entry<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                maybeNotifyExclusiveEntryRemoval((Entry) it.next());
            }
        }
    }

    private synchronized void maybeUpdateCacheParams() {
        if (this.mLastCacheParamsCheck + PARAMS_INTERCHECK_INTERVAL_MS <= SystemClock.uptimeMillis()) {
            this.mLastCacheParamsCheck = SystemClock.uptimeMillis();
            this.mMemoryCacheParams = (MemoryCacheParams) this.mMemoryCacheParamsSupplier.get();
        }
    }

    private synchronized CloseableReference<V> newClientReference(final Entry<K, V> entry) {
        increaseClientCount(entry);
        return CloseableReference.m15818of(entry.valueRef.get(), new ResourceReleaser<V>() {
            public void release(V v) {
                CountingMemoryCache.this.releaseClientReference(entry);
            }
        });
    }

    @C5952h
    private synchronized CloseableReference<V> referenceToClose(Entry<K, V> entry) {
        Preconditions.checkNotNull(entry);
        return (!entry.isOrphan || entry.clientCount != 0) ? null : entry.valueRef;
    }

    /* access modifiers changed from: private */
    public void releaseClientReference(Entry<K, V> entry) {
        boolean maybeAddToExclusives;
        CloseableReference referenceToClose;
        Preconditions.checkNotNull(entry);
        synchronized (this) {
            decreaseClientCount(entry);
            maybeAddToExclusives = maybeAddToExclusives(entry);
            referenceToClose = referenceToClose(entry);
        }
        CloseableReference.closeSafely(referenceToClose);
        if (!maybeAddToExclusives) {
            entry = null;
        }
        maybeNotifyExclusiveEntryInsertion(entry);
        maybeUpdateCacheParams();
        maybeEvictEntries();
    }

    @C5952h
    private synchronized ArrayList<Entry<K, V>> trimExclusivelyOwnedEntries(int i, int i2) {
        int max = Math.max(i, 0);
        int max2 = Math.max(i2, 0);
        if (this.mExclusiveEntries.getCount() <= max && this.mExclusiveEntries.getSizeInBytes() <= max2) {
            return null;
        }
        ArrayList<Entry<K, V>> arrayList = new ArrayList<>();
        while (true) {
            if (this.mExclusiveEntries.getCount() <= max && this.mExclusiveEntries.getSizeInBytes() <= max2) {
                return arrayList;
            }
            Object firstKey = this.mExclusiveEntries.getFirstKey();
            this.mExclusiveEntries.remove(firstKey);
            arrayList.add(this.mCachedEntries.remove(firstKey));
        }
    }

    private ValueDescriptor<Entry<K, V>> wrapValueDescriptor(final ValueDescriptor<V> valueDescriptor) {
        return new ValueDescriptor<Entry<K, V>>() {
            public int getSizeInBytes(Entry<K, V> entry) {
                return valueDescriptor.getSizeInBytes(entry.valueRef.get());
            }
        };
    }

    public CloseableReference<V> cache(K k, CloseableReference<V> closeableReference) {
        return cache(k, closeableReference, null);
    }

    public void clear() {
        ArrayList clear;
        ArrayList clear2;
        synchronized (this) {
            clear = this.mExclusiveEntries.clear();
            clear2 = this.mCachedEntries.clear();
            makeOrphans(clear2);
        }
        maybeClose(clear2);
        maybeNotifyExclusiveEntryRemoval(clear);
        maybeUpdateCacheParams();
    }

    public synchronized boolean contains(Predicate<K> predicate) {
        return !this.mCachedEntries.getMatchingEntries(predicate).isEmpty();
    }

    @C5952h
    public CloseableReference<V> get(K k) {
        Entry entry;
        CloseableReference<V> newClientReference;
        Preconditions.checkNotNull(k);
        synchronized (this) {
            entry = (Entry) this.mExclusiveEntries.remove(k);
            Entry entry2 = (Entry) this.mCachedEntries.get(k);
            newClientReference = entry2 != null ? newClientReference(entry2) : null;
        }
        maybeNotifyExclusiveEntryRemoval(entry);
        maybeUpdateCacheParams();
        maybeEvictEntries();
        return newClientReference;
    }

    public synchronized int getCount() {
        return this.mCachedEntries.getCount();
    }

    public synchronized int getEvictionQueueCount() {
        return this.mExclusiveEntries.getCount();
    }

    public synchronized int getEvictionQueueSizeInBytes() {
        return this.mExclusiveEntries.getSizeInBytes();
    }

    public synchronized int getInUseCount() {
        return this.mCachedEntries.getCount() - this.mExclusiveEntries.getCount();
    }

    public synchronized int getInUseSizeInBytes() {
        return this.mCachedEntries.getSizeInBytes() - this.mExclusiveEntries.getSizeInBytes();
    }

    public synchronized int getSizeInBytes() {
        return this.mCachedEntries.getSizeInBytes();
    }

    public int removeAll(Predicate<K> predicate) {
        ArrayList removeAll;
        ArrayList removeAll2;
        synchronized (this) {
            removeAll = this.mExclusiveEntries.removeAll(predicate);
            removeAll2 = this.mCachedEntries.removeAll(predicate);
            makeOrphans(removeAll2);
        }
        maybeClose(removeAll2);
        maybeNotifyExclusiveEntryRemoval(removeAll);
        maybeUpdateCacheParams();
        maybeEvictEntries();
        return removeAll2.size();
    }

    @C5952h
    public CloseableReference<V> reuse(K k) {
        Entry entry;
        boolean z;
        CloseableReference<V> closeableReference;
        Preconditions.checkNotNull(k);
        synchronized (this) {
            entry = (Entry) this.mExclusiveEntries.remove(k);
            z = true;
            boolean z2 = false;
            if (entry != null) {
                Entry entry2 = (Entry) this.mCachedEntries.remove(k);
                Preconditions.checkNotNull(entry2);
                if (entry2.clientCount == 0) {
                    z2 = true;
                }
                Preconditions.checkState(z2);
                closeableReference = entry2.valueRef;
            } else {
                closeableReference = null;
                z = false;
            }
        }
        if (z) {
            maybeNotifyExclusiveEntryRemoval(entry);
        }
        return closeableReference;
    }

    public void trim(MemoryTrimType memoryTrimType) {
        ArrayList trimExclusivelyOwnedEntries;
        double trimRatio = this.mCacheTrimStrategy.getTrimRatio(memoryTrimType);
        synchronized (this) {
            double sizeInBytes = (double) this.mCachedEntries.getSizeInBytes();
            double d = 1.0d - trimRatio;
            Double.isNaN(sizeInBytes);
            trimExclusivelyOwnedEntries = trimExclusivelyOwnedEntries(Integer.MAX_VALUE, Math.max(0, ((int) (sizeInBytes * d)) - getInUseSizeInBytes()));
            makeOrphans(trimExclusivelyOwnedEntries);
        }
        maybeClose(trimExclusivelyOwnedEntries);
        maybeNotifyExclusiveEntryRemoval(trimExclusivelyOwnedEntries);
        maybeUpdateCacheParams();
        maybeEvictEntries();
    }

    public CloseableReference<V> cache(K k, CloseableReference<V> closeableReference, EntryStateObserver<K> entryStateObserver) {
        Entry entry;
        CloseableReference<V> closeableReference2;
        CloseableReference closeableReference3;
        Preconditions.checkNotNull(k);
        Preconditions.checkNotNull(closeableReference);
        maybeUpdateCacheParams();
        synchronized (this) {
            entry = (Entry) this.mExclusiveEntries.remove(k);
            Entry entry2 = (Entry) this.mCachedEntries.remove(k);
            closeableReference2 = null;
            if (entry2 != null) {
                makeOrphan(entry2);
                closeableReference3 = referenceToClose(entry2);
            } else {
                closeableReference3 = null;
            }
            if (canCacheNewValue(closeableReference.get())) {
                Entry of = Entry.m15821of(k, closeableReference, entryStateObserver);
                this.mCachedEntries.put(k, of);
                closeableReference2 = newClientReference(of);
            }
        }
        CloseableReference.closeSafely(closeableReference3);
        maybeNotifyExclusiveEntryRemoval(entry);
        maybeEvictEntries();
        return closeableReference2;
    }

    public synchronized boolean contains(K k) {
        return this.mCachedEntries.contains(k);
    }

    private static <K, V> void maybeNotifyExclusiveEntryRemoval(@C5952h Entry<K, V> entry) {
        if (entry != null) {
            EntryStateObserver<K> entryStateObserver = entry.observer;
            if (entryStateObserver != null) {
                entryStateObserver.onExclusivityChanged(entry.key, false);
            }
        }
    }
}
