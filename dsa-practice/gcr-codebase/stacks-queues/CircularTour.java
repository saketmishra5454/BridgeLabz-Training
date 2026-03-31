import java.util.*;

class PetrolPump {
    int petrol;
    int dist; // distance to next

    PetrolPump(int p, int d) {
        petrol = p;
        dist = d;
    }
}

public class CircularTour {

    // returns index of starting pump or -1 if not possible 
    public static int findStart(List<PetrolPump> pumps) {
        int start = 0;
        int total = 0;
        int curr = 0;

        // we not use real queue here but logic feels same (tracking surplas)
        for (int i = 0; i < pumps.size(); i++) {
            total += pumps.get(i).petrol - pumps.get(i).dist;
            curr += pumps.get(i).petrol - pumps.get(i).dist;

            // if current becomes minus, means cant start from 'start'
            // so try next index
            if (curr < 0) {
                start = i + 1;
                curr = 0; // reset curr for new try
            }
        }

        // if total petrol < total dist then tour not possible
        if (total >= 0) return start;
        return -1;
    }

    public static void main(String[] args) {
        List<PetrolPump> pumps = new ArrayList<>();
        pumps.add(new PetrolPump(6, 4));
        pumps.add(new PetrolPump(3, 6));
        pumps.add(new PetrolPump(7, 3));

        int ans = findStart(pumps);

        // printing result (should be 2 for this inputs)
        System.out.println("Start pump index: " + ans);
    }
}
