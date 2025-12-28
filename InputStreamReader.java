import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class InputStreamReader extends Reader {
    private final java.io.InputStreamReader delegate;

    public InputStreamReader(InputStream in) {
        this.delegate = new java.io.InputStreamReader(in);
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return delegate.read(cbuf, off, len);
    }

    @Override
    public void close() throws IOException {
        delegate.close();
    }
}
