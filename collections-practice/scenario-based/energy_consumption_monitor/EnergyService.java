package energy_consumption_monitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnergyService {

    private Map<String, List<Double>> energyMap = new HashMap<>();

    // Add Energy Reading
    public void addEnergyReading(String date, double energyUsed) throws InvalidEnergyReadingException {
        if (energyUsed <= 0)
            throw new InvalidEnergyReadingException("Invalid EnergyUsed: " + energyUsed + " take energy greater then Zero.");


        if (energyMap.containsKey(date)) {
            energyMap.get(date).add(energyUsed);

        } else {
            energyMap.put(date, new ArrayList<>());
            energyMap.get(date).add(energyUsed);
        }
    }

    // Calculate Daily Average

    public double getDailyAverage(String date) {

        if (energyMap.containsKey(date)) {
            List<Double> reading = energyMap.get(date);
            double sum = 0;

            for (Double e : reading) {
                sum = sum + e;
            }
            double avg = sum / reading.size();
            return avg;
        } else {
          //  System.out.println("Date is not Found");
            return 0;
        }
    }

// Calculate Monthly Average
    public double getMonthlyAverage(String month) {

        double sum = 0.0;
        int count = 0;

        for(Map.Entry<String,List<Double>> entry: energyMap.entrySet()){

            String date = entry.getKey();

            if(date.startsWith(month)){

                List<Double> readings = entry.getValue();
                for(Double read : readings){

                    sum+=read;
                    count++;
                }
            }
        }
        if(count == 0){
            return 0;
        }
        else{
            return sum/count;
        }
    }

// View Energy Report

    public void viewReport() {
        System.out.println("Date\t\tEnergy Readings");

        for(Map.Entry<String, List<Double>> entry : energyMap.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }


    public Map<String, List<Double>> getEnergyMap() {
        return energyMap;
    }

    public void setEnergyMap(Map<String, List<Double>> energyMap) {
        this.energyMap = energyMap;
    }
}
