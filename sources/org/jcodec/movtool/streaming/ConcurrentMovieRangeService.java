package org.jcodec.movtool.streaming;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import org.jcodec.common.NIOUtils;

public class ConcurrentMovieRangeService {
    /* access modifiers changed from: private */
    public ExecutorService exec;
    /* access modifiers changed from: private */
    public VirtualMovie movie;

    public class ConcurrentMovieRange extends InputStream {
        private static final int READ_AHEAD_SEGMENTS = 10;
        private int nextReadAheadNo;
        private long remaining;
        private List<Future<ByteBuffer>> segments = new ArrayList();

        /* renamed from: to */
        private long f44909to;

        public ConcurrentMovieRange(long j, long j2) throws IOException {
            if (j2 >= j) {
                this.remaining = (j2 - j) + 1;
                this.f44909to = j2;
                MovieSegment packetAt = ConcurrentMovieRangeService.this.movie.getPacketAt(j);
                if (packetAt != null) {
                    this.nextReadAheadNo = packetAt.getNo();
                    scheduleSegmentRetrieve(packetAt);
                    for (int i = 0; i < 10; i++) {
                        tryReadAhead();
                    }
                    NIOUtils.skip(segmentData(), (int) (j - packetAt.getPos()));
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("from < to");
        }

        private void disposeReadAhead(ByteBuffer byteBuffer) {
            if (!byteBuffer.hasRemaining()) {
                this.segments.remove(0);
                tryReadAhead();
            }
        }

        private void scheduleSegmentRetrieve(MovieSegment movieSegment) {
            this.segments.add(ConcurrentMovieRangeService.this.exec.submit(new C15574b(movieSegment)));
            this.nextReadAheadNo++;
        }

        private ByteBuffer segmentData() throws IOException {
            try {
                return (ByteBuffer) ((Future) this.segments.get(0)).get();
            } catch (InterruptedException e) {
                throw new IOException(e);
            } catch (ExecutionException e2) {
                throw new IOException(e2);
            }
        }

        private void tryReadAhead() {
            MovieSegment packetByNo = ConcurrentMovieRangeService.this.movie.getPacketByNo(this.nextReadAheadNo);
            if (packetByNo != null && packetByNo.getPos() < this.f44909to) {
                scheduleSegmentRetrieve(packetByNo);
            }
        }

        public void close() throws IOException {
            for (Future cancel : this.segments) {
                cancel.cancel(false);
            }
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (this.segments.size() != 0) {
                long j = this.remaining;
                if (j != 0) {
                    int min = (int) Math.min((long) i2, j);
                    int i3 = 0;
                    while (min > 0 && this.segments.size() > 0) {
                        ByteBuffer segmentData = segmentData();
                        int min2 = Math.min(segmentData.remaining(), min);
                        segmentData.get(bArr, i, min2);
                        i3 += min2;
                        min -= min2;
                        i += min2;
                        disposeReadAhead(segmentData);
                    }
                    this.remaining -= (long) i3;
                    return i3;
                }
            }
            return -1;
        }

        public int read() throws IOException {
            if (this.segments.size() == 0 || this.remaining == 0) {
                return -1;
            }
            ByteBuffer segmentData = segmentData();
            byte b = segmentData.get() & 255;
            disposeReadAhead(segmentData);
            this.remaining--;
            return b;
        }
    }

    /* renamed from: org.jcodec.movtool.streaming.ConcurrentMovieRangeService$a */
    class C15573a implements ThreadFactory {
        C15573a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setDaemon(true);
            return newThread;
        }
    }

    /* renamed from: org.jcodec.movtool.streaming.ConcurrentMovieRangeService$b */
    static class C15574b implements Callable<ByteBuffer> {

        /* renamed from: a */
        private MovieSegment f44911a;

        public C15574b(MovieSegment movieSegment) {
            this.f44911a = movieSegment;
        }

        public ByteBuffer call() throws Exception {
            return MovieRange.checkDataLen(this.f44911a.getData() == null ? null : this.f44911a.getData().duplicate(), this.f44911a.getDataLen());
        }
    }

    public ConcurrentMovieRangeService(VirtualMovie virtualMovie, int i) {
        this.exec = Executors.newFixedThreadPool(i, new C15573a());
        this.movie = virtualMovie;
    }

    public InputStream getRange(long j, long j2) throws IOException {
        ConcurrentMovieRange concurrentMovieRange = new ConcurrentMovieRange(j, j2);
        return concurrentMovieRange;
    }

    public void shutdown() {
        this.exec.shutdown();
    }
}
