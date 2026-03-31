package collections.M1_Practice.set1.version_contorlled_storage_system.copy;

import java.util.*;

class FileVersion {

    String version;
    int size;

    public FileVersion(String version, int size){
        this.version = version;
        this.size = size;
    }
}

public class FileVersionController {

    static Map<String, List<FileVersion>> storage = new HashMap<>();


    // UPLOAD
    public static void upload(String fileName, String version, int size){
    	
    	storage.putIfAbsent(fileName, new ArrayList<>());
    		
    		List<FileVersion> versions = storage.get(fileName);
    	
    		for(FileVersion v : versions) {
    			if(v.version.equals(version)) {
    				return;
    			}
    		}
    			
    	    versions.add(new FileVersion(version,size));
    			
    	}
    		
    	

    	
//    	if(!storage.containsKey(fileName)) {
//    		
//    		List<FileVersion> versions = storage.get(fileName);
//    		
//    		
//    		for(FileVersion v : versions) {
//    			if(version.equals(v.version)) {
//    				return;
//    			}
//    			else {
//    				versions.add(new FileVersion(version,size));
//    			}
//    		}
//    	
//    	}	  	

    


    // FETCH
    public static void fetch(String fileName){

        // check file exists
    	
       if(!storage.containsKey(fileName)) {
    	   System.out.println("File Not Found");
    	   return;
       }
       
       List<FileVersion> versions = storage.get(fileName);
       
       Collections.sort(versions,(a,b)->{
    	   if(a.size != b.size) {
    		   return a.size-b.size;
    		   
    	   }
    	   
    	   return a.version.compareTo(b.version);
       });
    	
       
       for(FileVersion v : versions) {
    	   
    	   System.out.println(fileName+ " "+ v.version+" "+v.size);
       }

    }


    // LATEST
    public static void latest(String fileName){

        // check file exists
    	
    	if(!storage.containsKey(fileName)) {
    		System.out.println("File Not Found");
    		return;
    	}
    	
    	List<FileVersion> versions = storage.get(fileName);
    	FileVersion latest = versions.get(versions.size()-1);
    	
    	System.out.println(fileName+" "+latest.version+" "+latest.size);
   
    }


    // TOTAL_STORAGE
    public static void totalStorage(String fileName){

        // check file exists
    	
    	if(!storage.containsKey(fileName)) {
    		System.out.println("File Not Found");
    		return;
    	}
    	
    	List<FileVersion> version = storage.get(fileName);
    	
    	int sum = 0;
    	for(FileVersion v : version) {
    		
    		sum+=v.size;
    		
    	}
    	
    	System.out.println(fileName+" "+ sum);

    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){

            String input = sc.nextLine();
            String[] data = input.split(" ");

            if(data[0].equals("UPLOAD")){
                upload(data[1], data[2], Integer.parseInt(data[3]));
            }

            else if(data[0].equals("FETCH")){
                fetch(data[1]);
            }

            else if(data[0].equals("LATEST")){
                latest(data[1]);
            }

            else if(data[0].equals("TOTAL_STORAGE")){
                totalStorage(data[1]);
            }
        }
    }
}