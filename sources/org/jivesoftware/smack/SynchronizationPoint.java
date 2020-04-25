package org.jivesoftware.smack;

import java.lang.Exception;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.packet.PlainStreamElement;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.packet.TopLevelStreamElement;

public class SynchronizationPoint<E extends Exception> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Logger LOGGER = Logger.getLogger(SynchronizationPoint.class.getName());
    private final Condition condition;
    private final AbstractXMPPConnection connection;
    private final Lock connectionLock;
    private E failureException;
    private State state;

    /* renamed from: org.jivesoftware.smack.SynchronizationPoint$1 */
    static /* synthetic */ class C156071 {
        static final /* synthetic */ int[] $SwitchMap$org$jivesoftware$smack$SynchronizationPoint$State = new int[State.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                org.jivesoftware.smack.SynchronizationPoint$State[] r0 = org.jivesoftware.smack.SynchronizationPoint.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$jivesoftware$smack$SynchronizationPoint$State = r0
                int[] r0 = $SwitchMap$org$jivesoftware$smack$SynchronizationPoint$State     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jivesoftware.smack.SynchronizationPoint$State r1 = org.jivesoftware.smack.SynchronizationPoint.State.Failure     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$org$jivesoftware$smack$SynchronizationPoint$State     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jivesoftware.smack.SynchronizationPoint$State r1 = org.jivesoftware.smack.SynchronizationPoint.State.Initial     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$org$jivesoftware$smack$SynchronizationPoint$State     // Catch:{ NoSuchFieldError -> 0x002a }
                org.jivesoftware.smack.SynchronizationPoint$State r1 = org.jivesoftware.smack.SynchronizationPoint.State.NoResponse     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = $SwitchMap$org$jivesoftware$smack$SynchronizationPoint$State     // Catch:{ NoSuchFieldError -> 0x0035 }
                org.jivesoftware.smack.SynchronizationPoint$State r1 = org.jivesoftware.smack.SynchronizationPoint.State.RequestSent     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.SynchronizationPoint.C156071.<clinit>():void");
        }
    }

    private enum State {
        Initial,
        RequestSent,
        NoResponse,
        Success,
        Failure
    }

    public SynchronizationPoint(AbstractXMPPConnection abstractXMPPConnection) {
        this.connection = abstractXMPPConnection;
        this.connectionLock = abstractXMPPConnection.getConnectionLock();
        this.condition = abstractXMPPConnection.getConnectionLock().newCondition();
        init();
    }

    private void checkForResponse() throws NoResponseException {
        int i = C156071.$SwitchMap$org$jivesoftware$smack$SynchronizationPoint$State[this.state.ordinal()];
        if (i == 2 || i == 3 || i == 4) {
            throw NoResponseException.newWith(this.connection);
        }
    }

    private void waitForConditionOrTimeout() {
        long nanos = TimeUnit.MILLISECONDS.toNanos(this.connection.getPacketReplyTimeout());
        while (true) {
            State state2 = this.state;
            if (state2 != State.RequestSent && state2 != State.Initial) {
                return;
            }
            if (nanos <= 0) {
                try {
                    this.state = State.NoResponse;
                    return;
                } catch (InterruptedException e) {
                    LOGGER.log(Level.WARNING, "Thread interrupt while waiting for condition or timeout ignored", e);
                }
            } else {
                nanos = this.condition.awaitNanos(nanos);
            }
        }
    }

    public void checkIfSuccessOrWait() throws NoResponseException {
        this.connectionLock.lock();
        try {
            if (this.state != State.Success) {
                waitForConditionOrTimeout();
                this.connectionLock.unlock();
                checkForResponse();
            }
        } finally {
            this.connectionLock.unlock();
        }
    }

    public void checkIfSuccessOrWaitOrThrow() throws NoResponseException, Exception {
        checkIfSuccessOrWait();
        if (this.state == State.Failure) {
            throw this.failureException;
        }
    }

    public void init() {
        this.connectionLock.lock();
        this.state = State.Initial;
        this.failureException = null;
        this.connectionLock.unlock();
    }

    @Deprecated
    public void reportFailure() {
        reportFailure(null);
    }

    public void reportSuccess() {
        this.connectionLock.lock();
        try {
            this.state = State.Success;
            this.condition.signalAll();
        } finally {
            this.connectionLock.unlock();
        }
    }

    public boolean requestSent() {
        this.connectionLock.lock();
        try {
            return this.state == State.RequestSent;
        } finally {
            this.connectionLock.unlock();
        }
    }

    public void sendAndWaitForResponse(TopLevelStreamElement topLevelStreamElement) throws NoResponseException, NotConnectedException {
        this.connectionLock.lock();
        if (topLevelStreamElement != null) {
            try {
                if (topLevelStreamElement instanceof Stanza) {
                    this.connection.sendStanza((Stanza) topLevelStreamElement);
                } else if (topLevelStreamElement instanceof PlainStreamElement) {
                    this.connection.send((PlainStreamElement) topLevelStreamElement);
                } else {
                    throw new IllegalStateException("Unsupported element type");
                }
                this.state = State.RequestSent;
            } catch (Throwable th) {
                this.connectionLock.unlock();
                throw th;
            }
        }
        waitForConditionOrTimeout();
        this.connectionLock.unlock();
        checkForResponse();
    }

    public void sendAndWaitForResponseOrThrow(PlainStreamElement plainStreamElement) throws Exception, NoResponseException, NotConnectedException {
        sendAndWaitForResponse(plainStreamElement);
        if (C156071.$SwitchMap$org$jivesoftware$smack$SynchronizationPoint$State[this.state.ordinal()] == 1) {
            E e = this.failureException;
            if (e != null) {
                throw e;
            }
        }
    }

    public boolean wasSuccessful() {
        this.connectionLock.lock();
        try {
            return this.state == State.Success;
        } finally {
            this.connectionLock.unlock();
        }
    }

    public void reportFailure(E e) {
        this.connectionLock.lock();
        try {
            this.state = State.Failure;
            this.failureException = e;
            this.condition.signalAll();
        } finally {
            this.connectionLock.unlock();
        }
    }
}
