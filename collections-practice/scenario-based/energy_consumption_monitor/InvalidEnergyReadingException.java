package energy_consumption_monitor;

public class InvalidEnergyReadingException extends  Exception{

    public InvalidEnergyReadingException(String msg){
        super(msg);
    }
}
