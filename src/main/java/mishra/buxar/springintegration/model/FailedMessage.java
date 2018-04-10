package mishra.buxar.springintegration.model;

import java.io.Serializable;
import java.util.Date;

public class FailedMessage implements Serializable {
    private static final long serialVersionUID = 4411815706008283621L;
    
    private final Date requestDate;
    private final String messsage;
    private final String theater;
    
    public FailedMessage(Date requestDate, String message, String theater) {
        this.requestDate = requestDate;
        this.messsage = message;
        this.theater = theater;
    }
    
    
    public Date getRequestDate() {
        return new Date(requestDate.getTime());
    }
    
    public String getMessage() {
        return this.messsage;
    }
    
    public String getTheater() {
        return this.theater;
    }
}