package org.jivesoftware.smack.debugger;

import java.io.Reader;
import java.io.Writer;
import org.jivesoftware.smack.ConnectionListener;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.util.ObservableReader;
import org.jivesoftware.smack.util.ObservableWriter;
import org.jivesoftware.smack.util.ReaderListener;
import org.jivesoftware.smack.util.WriterListener;
import p205i.p486d.p487a.C14055b;

public abstract class AbstractDebugger implements SmackDebugger {
    public static boolean printInterpreted = false;
    private final ConnectionListener connListener;
    private final XMPPConnection connection;
    private final StanzaListener listener;
    private ObservableReader reader;
    private final ReaderListener readerListener;
    private ObservableWriter writer;
    private final WriterListener writerListener;

    public AbstractDebugger(final XMPPConnection xMPPConnection, Writer writer2, Reader reader2) {
        this.connection = xMPPConnection;
        this.reader = new ObservableReader(reader2);
        this.readerListener = new ReaderListener() {
            public void read(String str) {
                AbstractDebugger abstractDebugger = AbstractDebugger.this;
                StringBuilder sb = new StringBuilder();
                sb.append("RECV (");
                sb.append(xMPPConnection.getConnectionCounter());
                sb.append("): ");
                sb.append(str);
                abstractDebugger.log(sb.toString());
            }
        };
        this.reader.addReaderListener(this.readerListener);
        this.writer = new ObservableWriter(writer2);
        this.writerListener = new WriterListener() {
            public void write(String str) {
                AbstractDebugger abstractDebugger = AbstractDebugger.this;
                StringBuilder sb = new StringBuilder();
                sb.append("SENT (");
                sb.append(xMPPConnection.getConnectionCounter());
                sb.append("): ");
                sb.append(str);
                abstractDebugger.log(sb.toString());
            }
        };
        this.writer.addWriterListener(this.writerListener);
        this.listener = new StanzaListener() {
            public void processPacket(Stanza stanza) {
                if (AbstractDebugger.printInterpreted) {
                    AbstractDebugger abstractDebugger = AbstractDebugger.this;
                    StringBuilder sb = new StringBuilder();
                    sb.append("RCV PKT (");
                    sb.append(xMPPConnection.getConnectionCounter());
                    sb.append("): ");
                    sb.append(stanza.toXML());
                    abstractDebugger.log(sb.toString());
                }
            }
        };
        this.connListener = new ConnectionListener() {
            public void authenticated(XMPPConnection xMPPConnection, boolean z) {
                StringBuilder sb = new StringBuilder();
                sb.append("XMPPConnection authenticated (");
                sb.append(xMPPConnection.getConnectionCounter());
                sb.append(")");
                String sb2 = sb.toString();
                if (z) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(sb2);
                    sb3.append(" and resumed");
                    sb2 = sb3.toString();
                }
                AbstractDebugger.this.log(sb2);
            }

            public void connected(XMPPConnection xMPPConnection) {
                AbstractDebugger abstractDebugger = AbstractDebugger.this;
                StringBuilder sb = new StringBuilder();
                sb.append("XMPPConnection connected (");
                sb.append(xMPPConnection.getConnectionCounter());
                sb.append(")");
                abstractDebugger.log(sb.toString());
            }

            public void connectionClosed() {
                AbstractDebugger abstractDebugger = AbstractDebugger.this;
                StringBuilder sb = new StringBuilder();
                sb.append("XMPPConnection closed (");
                sb.append(xMPPConnection.getConnectionCounter());
                sb.append(")");
                abstractDebugger.log(sb.toString());
            }

            public void connectionClosedOnError(Exception exc) {
                AbstractDebugger abstractDebugger = AbstractDebugger.this;
                StringBuilder sb = new StringBuilder();
                sb.append("XMPPConnection closed due to an exception (");
                sb.append(xMPPConnection.getConnectionCounter());
                sb.append(")");
                abstractDebugger.log(sb.toString());
                exc.printStackTrace();
            }

            public void reconnectingIn(int i) {
                AbstractDebugger abstractDebugger = AbstractDebugger.this;
                StringBuilder sb = new StringBuilder();
                sb.append("XMPPConnection (");
                sb.append(xMPPConnection.getConnectionCounter());
                sb.append(") will reconnect in ");
                sb.append(i);
                abstractDebugger.log(sb.toString());
            }

            public void reconnectionFailed(Exception exc) {
                AbstractDebugger abstractDebugger = AbstractDebugger.this;
                StringBuilder sb = new StringBuilder();
                sb.append("Reconnection failed due to an exception (");
                sb.append(xMPPConnection.getConnectionCounter());
                sb.append(")");
                abstractDebugger.log(sb.toString());
                exc.printStackTrace();
            }

            public void reconnectionSuccessful() {
                AbstractDebugger abstractDebugger = AbstractDebugger.this;
                StringBuilder sb = new StringBuilder();
                sb.append("XMPPConnection reconnected (");
                sb.append(xMPPConnection.getConnectionCounter());
                sb.append(")");
                abstractDebugger.log(sb.toString());
            }
        };
    }

    public Reader getReader() {
        return this.reader;
    }

    public StanzaListener getReaderListener() {
        return this.listener;
    }

    public Writer getWriter() {
        return this.writer;
    }

    public StanzaListener getWriterListener() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract void log(String str);

    public Reader newConnectionReader(Reader reader2) {
        this.reader.removeReaderListener(this.readerListener);
        ObservableReader observableReader = new ObservableReader(reader2);
        observableReader.addReaderListener(this.readerListener);
        this.reader = observableReader;
        return this.reader;
    }

    public Writer newConnectionWriter(Writer writer2) {
        this.writer.removeWriterListener(this.writerListener);
        ObservableWriter observableWriter = new ObservableWriter(writer2);
        observableWriter.addWriterListener(this.writerListener);
        this.writer = observableWriter;
        return this.writer;
    }

    public void userHasLogged(String str) {
        String g = C14055b.m60647g(str);
        String str2 = "";
        boolean equals = str2.equals(g);
        StringBuilder sb = new StringBuilder();
        sb.append("User logged (");
        sb.append(this.connection.getConnectionCounter());
        sb.append("): ");
        if (equals) {
            g = str2;
        }
        sb.append(g);
        sb.append("@");
        sb.append(this.connection.getServiceName());
        sb.append(":");
        sb.append(this.connection.getPort());
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append("/");
        sb3.append(C14055b.m60648h(str));
        log(sb3.toString());
        this.connection.addConnectionListener(this.connListener);
    }
}
