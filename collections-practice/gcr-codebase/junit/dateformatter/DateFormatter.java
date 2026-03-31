package junit.dateformatter;

public class DateFormatter {

    //method is used to check the format of date
    public String formatDate(String inputDate){
        if(!inputDate.matches("\\d{4}-\\d{2}-\\d{2}")){
            throw new IllegalArgumentException();
        }
        String[] parts = inputDate.split("-");

        return parts[2] + "-" + parts[1] + "-" + parts[0];
    }
}
