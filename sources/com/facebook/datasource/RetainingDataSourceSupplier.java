package com.facebook.datasource;

import com.facebook.common.internal.Supplier;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p201f.p202a.C5952h;
import p201f.p202a.p203u.C5966a;
import p201f.p202a.p203u.C5968c;

@C5968c
public class RetainingDataSourceSupplier<T> implements Supplier<DataSource<T>> {
    @C5952h
    private Supplier<DataSource<T>> mCurrentDataSourceSupplier = null;
    private final Set<RetainingDataSource> mDataSources = Collections.newSetFromMap(new WeakHashMap());

    private static class RetainingDataSource<T> extends AbstractDataSource<T> {
        @C5952h
        @C5966a("RetainingDataSource.this")
        private DataSource<T> mDataSource;

        private class InternalDataSubscriber implements DataSubscriber<T> {
            private InternalDataSubscriber() {
            }

            public void onCancellation(DataSource<T> dataSource) {
            }

            public void onFailure(DataSource<T> dataSource) {
                RetainingDataSource.this.onDataSourceFailed(dataSource);
            }

            public void onNewResult(DataSource<T> dataSource) {
                if (dataSource.hasResult()) {
                    RetainingDataSource.this.onDataSourceNewResult(dataSource);
                } else if (dataSource.isFinished()) {
                    RetainingDataSource.this.onDataSourceFailed(dataSource);
                }
            }

            public void onProgressUpdate(DataSource<T> dataSource) {
                RetainingDataSource.this.onDatasourceProgress(dataSource);
            }
        }

        private RetainingDataSource() {
            this.mDataSource = null;
        }

        private static <T> void closeSafely(DataSource<T> dataSource) {
            if (dataSource != null) {
                dataSource.close();
            }
        }

        /* access modifiers changed from: private */
        public void onDataSourceFailed(DataSource<T> dataSource) {
        }

        /* access modifiers changed from: private */
        public void onDataSourceNewResult(DataSource<T> dataSource) {
            if (dataSource == this.mDataSource) {
                setResult(null, false);
            }
        }

        /* access modifiers changed from: private */
        public void onDatasourceProgress(DataSource<T> dataSource) {
            if (dataSource == this.mDataSource) {
                setProgress(dataSource.getProgress());
            }
        }

        public boolean close() {
            synchronized (this) {
                if (!super.close()) {
                    return false;
                }
                DataSource<T> dataSource = this.mDataSource;
                this.mDataSource = null;
                closeSafely(dataSource);
                return true;
            }
        }

        @C5952h
        public synchronized T getResult() {
            return this.mDataSource != null ? this.mDataSource.getResult() : null;
        }

        public synchronized boolean hasResult() {
            return this.mDataSource != null && this.mDataSource.hasResult();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
            if (r4 == null) goto L_0x0031;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
            r4.subscribe(new com.facebook.datasource.RetainingDataSourceSupplier.RetainingDataSource.InternalDataSubscriber(r3, null), com.facebook.common.executors.CallerThreadExecutor.getInstance());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
            closeSafely(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void setSupplier(@p201f.p202a.C5952h com.facebook.common.internal.Supplier<com.facebook.datasource.DataSource<T>> r4) {
            /*
                r3 = this;
                boolean r0 = r3.isClosed()
                if (r0 == 0) goto L_0x0007
                return
            L_0x0007:
                r0 = 0
                if (r4 == 0) goto L_0x0011
                java.lang.Object r4 = r4.get()
                com.facebook.datasource.DataSource r4 = (com.facebook.datasource.DataSource) r4
                goto L_0x0012
            L_0x0011:
                r4 = r0
            L_0x0012:
                monitor-enter(r3)
                boolean r1 = r3.isClosed()     // Catch:{ all -> 0x0035 }
                if (r1 == 0) goto L_0x001e
                closeSafely(r4)     // Catch:{ all -> 0x0035 }
                monitor-exit(r3)     // Catch:{ all -> 0x0035 }
                return
            L_0x001e:
                com.facebook.datasource.DataSource<T> r1 = r3.mDataSource     // Catch:{ all -> 0x0035 }
                r3.mDataSource = r4     // Catch:{ all -> 0x0035 }
                monitor-exit(r3)     // Catch:{ all -> 0x0035 }
                if (r4 == 0) goto L_0x0031
                com.facebook.datasource.RetainingDataSourceSupplier$RetainingDataSource$InternalDataSubscriber r2 = new com.facebook.datasource.RetainingDataSourceSupplier$RetainingDataSource$InternalDataSubscriber
                r2.<init>()
                com.facebook.common.executors.CallerThreadExecutor r0 = com.facebook.common.executors.CallerThreadExecutor.getInstance()
                r4.subscribe(r2, r0)
            L_0x0031:
                closeSafely(r1)
                return
            L_0x0035:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0035 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.RetainingDataSourceSupplier.RetainingDataSource.setSupplier(com.facebook.common.internal.Supplier):void");
        }
    }

    public void replaceSupplier(Supplier<DataSource<T>> supplier) {
        this.mCurrentDataSourceSupplier = supplier;
        for (RetainingDataSource retainingDataSource : this.mDataSources) {
            if (!retainingDataSource.isClosed()) {
                retainingDataSource.setSupplier(supplier);
            }
        }
    }

    public DataSource<T> get() {
        RetainingDataSource retainingDataSource = new RetainingDataSource();
        retainingDataSource.setSupplier(this.mCurrentDataSourceSupplier);
        this.mDataSources.add(retainingDataSource);
        return retainingDataSource;
    }
}
