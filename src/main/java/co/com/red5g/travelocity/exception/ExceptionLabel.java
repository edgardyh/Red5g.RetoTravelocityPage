package co.com.red5g.travelocity.exception;

public class ExceptionLabel extends AssertionError{

    public ExceptionLabel(String lbl, Throwable throwable){
        super(lbl,throwable);
    }
}
