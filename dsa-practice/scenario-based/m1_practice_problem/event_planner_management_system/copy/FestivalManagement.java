package collections.event_planner_management_system.copy;

import java.util.*;

abstract class Festival {

    String name;
    String location;
    int date;

    public Festival(String name, String location, int date){
        this.name = name;
        this.location = location;
        this.date = date;
    }

    abstract void displayDetails();
}

//================================MUSICAL FESTIVAL===================================

class MusicFestival extends Festival {

    String headliner;
    String musicGenre;
    int ticketPrice;
    


    public MusicFestival(String name, String location, int date,
                         String headliner, String musicGenre, int ticketPrice){

        super(name, location, date);
        // initialize variables
        
        this.headliner = headliner;
        this.musicGenre = musicGenre;
        this.ticketPrice = ticketPrice;

    }

    void displayDetails(){

        // print details in required format
    		
    		System.out.println("Festival Name: "+name);
    		System.out.println("Location: "+location);
    		System.out.println("Date: "+date);
    		System.out.println("Headliner: "+headliner);
    		System.out.println("Music Genere: "+musicGenre);
    		System.out.println("Ticket Price: "+ticketPrice);
    	

    }
}

//---------------------------------FOOD Festival---------------------------------

class FoodFestival extends Festival {

    String cuisine;
    int numStalls;
    int entryFee;

    public FoodFestival(String name, String location, int date,
                        String cuisine, int numStalls, int entryFee){

        super(name, location, date);

        // initialize variables
        this.cuisine = cuisine;
        this.numStalls = numStalls;
        this.entryFee = entryFee;
    }

    void displayDetails(){

        // print details
    	System.out.println("Festival Name: "+name);
		System.out.println("Location: "+location);
		System.out.println("Date: "+date);
		System.out.println("Cuisine: "+cuisine);
		System.out.println("Number of Stalls: "+numStalls);
		System.out.println("Entry Fee: "+ entryFee);
    	

    }
}

//-----------------------------------ART FESTIVAL-----------------------------------

class ArtFestival extends Festival {

    String artType;
    int numArtists;
    int exhibitionFee;

    public ArtFestival(String name, String location, int date,
                       String artType, int numArtists, int exhibitionFee){

        super(name, location, date);

        // initialize variables
        this.artType = artType;
        this.numArtists = numArtists;
        this.exhibitionFee = exhibitionFee;
    }

    void displayDetails(){

        // print details
    	System.out.println("Festival Name: "+name);
		System.out.println("Location: "+location);
		System.out.println("Date: "+date);
		System.out.println("Art Type: "+artType);
		System.out.println("Number of Artists: "+numArtists);
		System.out.println("Exhibition Fee: "+ exhibitionFee);

    }
}


//++++++++++++++++++++++++++++++++++ MAIN CLASS ++++++++++++++++++++++++++++++++++

public class FestivalManagement {

    static Map<String, Festival> festivalMap = new HashMap<>();

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while(true){

            String input = sc.nextLine();

            if(input.equals("EXIT"))
                break;

            String[] data = input.split(" ");

            if(data[0].equals("ADD_FESTIVAL")){
            	
            	if(data[1].equals("MUSIC")) {
            		
            		festivalMap.putIfAbsent(data[2],new MusicFestival(data[2],data[3],Integer.parseInt(data[4]),
            				data[5],data[6],Integer.parseInt(data[7])));
            	}
            	
            	else if(data[1].equals("FOOD")) {
            		
            		festivalMap.putIfAbsent(data[2],new FoodFestival(data[2],data[3],Integer.parseInt(data[4]),
            				data[5],Integer.parseInt(data[6]),Integer.parseInt(data[7])));
            		
            	}
            	
            	else if(data[1].equals("ART")) {
            		
            		festivalMap.putIfAbsent(data[2],new ArtFestival(data[2],data[3],Integer.parseInt(data[4]),
            				data[5],Integer.parseInt(data[6]),Integer.parseInt(data[7])));
            	}

              
            }

            else if(data[0].equals("DISPLAY_DETAILS")){

                // search festival
                // call displayDetails()
            	
            	//for(Festival f : festivalMap.values()) {
            		
            		Festival f = festivalMap.get(data[1]);

            		if(f != null){
            		    f.displayDetails();
            		    System.out.println();
            		}
            		
            		 else {
                     	continue;
                     }
            		
//            		if(data[1].equals(f.name)) {
//            			
//            			f.displayDetails();
 //           		}
            		
            	}
            	
            }
           
        }
    }
