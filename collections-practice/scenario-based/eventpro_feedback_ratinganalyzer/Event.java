package eventpro_feedback_ratinganalyzer;

public class Event {
    private String eventId;
    private String eventName;

    public Event(String eventId, String eventName) {
        this.eventId = eventId;
        this.eventName = eventName;
    }


    public String getEventId() {
        return eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}
