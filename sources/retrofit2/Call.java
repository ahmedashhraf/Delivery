package retrofit2;

import java.io.IOException;
import p468g.C13813c0;

public interface Call<T> extends Cloneable {
    void cancel();

    Call<T> clone();

    void enqueue(Callback<T> callback);

    Response<T> execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    C13813c0 request();
}
