package attendance_tracker;

public class Session{
    private String sessionId;
    private String sessionTitle;


    public Session(String sessionId, String sessionTitle) {
        this.sessionId = sessionId;
        this.sessionTitle = sessionTitle;
    }

    public String getSessionId(){
        return sessionId;
    }

    public void setSessionId(String sessionId){
        this.sessionId = sessionId;
    }

    public String getSessionTitle(){
        return sessionTitle;
    }
    public void setSessionTitle(String sessionTitle){
        this.sessionTitle = sessionTitle;
    }
}
