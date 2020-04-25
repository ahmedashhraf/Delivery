package bolts;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AggregateException extends Exception {

    /* renamed from: b */
    private static final String f8585b = "There were multiple errors.";
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private List<Throwable> f8586a;

    public AggregateException(String str, Throwable[] thArr) {
        this(str, Arrays.asList(thArr));
    }

    @Deprecated
    /* renamed from: a */
    public Throwable[] mo9260a() {
        List<Throwable> list = this.f8586a;
        return (Throwable[]) list.toArray(new Throwable[list.size()]);
    }

    @Deprecated
    /* renamed from: d */
    public List<Exception> mo9261d() {
        ArrayList arrayList = new ArrayList();
        List<Throwable> list = this.f8586a;
        if (list == null) {
            return arrayList;
        }
        for (Throwable th : list) {
            if (th instanceof Exception) {
                arrayList.add((Exception) th);
            } else {
                arrayList.add(new Exception(th));
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public List<Throwable> mo9262e() {
        return this.f8586a;
    }

    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        int i = -1;
        for (Throwable th : this.f8586a) {
            String str = "\n";
            printStream.append(str);
            printStream.append("  Inner throwable #");
            i++;
            printStream.append(Integer.toString(i));
            printStream.append(": ");
            th.printStackTrace(printStream);
            printStream.append(str);
        }
    }

    public AggregateException(String str, List<? extends Throwable> list) {
        super(str, (list == null || list.size() <= 0) ? null : (Throwable) list.get(0));
        this.f8586a = Collections.unmodifiableList(list);
    }

    public AggregateException(List<? extends Throwable> list) {
        this(f8585b, list);
    }

    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        int i = -1;
        for (Throwable th : this.f8586a) {
            String str = "\n";
            printWriter.append(str);
            printWriter.append("  Inner throwable #");
            i++;
            printWriter.append(Integer.toString(i));
            printWriter.append(": ");
            th.printStackTrace(printWriter);
            printWriter.append(str);
        }
    }
}
