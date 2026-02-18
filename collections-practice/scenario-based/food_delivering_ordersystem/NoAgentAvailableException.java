package food_delivering_ordersystem;

public class NoAgentAvailableException extends Exception{
    public NoAgentAvailableException(String msg){
        super(msg);
    }
}
