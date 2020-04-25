package org.jivesoftware.smack.debugger;

import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.jivesoftware.smack.XMPPConnection;

public class ConsoleDebugger extends AbstractDebugger {
    private final SimpleDateFormat dateFormatter = new SimpleDateFormat("hh:mm:ss aaa");

    public ConsoleDebugger(XMPPConnection xMPPConnection, Writer writer, Reader reader) {
        super(xMPPConnection, writer, reader);
    }

    /* access modifiers changed from: protected */
    public void log(String str) {
        String format;
        synchronized (this.dateFormatter) {
            format = this.dateFormatter.format(new Date());
        }
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder();
        sb.append(format);
        sb.append(' ');
        sb.append(str);
        printStream.println(sb.toString());
    }
}
