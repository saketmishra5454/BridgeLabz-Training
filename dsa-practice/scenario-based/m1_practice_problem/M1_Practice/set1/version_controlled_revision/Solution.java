package collections.M1_Practice.set1.version_controlled_revision;

import java.util.*;

//import collections.M1_Practice.set1.version_contorlled_storage_system.copy.FileVersion;

class FileVersion {

    String version;
    int size;

    public FileVersion(String version, int size){
        this.version = version;
        this.size = size;
    }
}

public class Solution {

    static Map<String, List<FileVersion>> storage = new HashMap<>();


    // =========================
    // UPLOAD
    // =========================
    public static void upload(String fileName, String version, int size){
    	
    	
    	storage.putIfAbsent(fileName, new ArrayList());
    	
    	List<FileVersion> ls = storage.get(fileName);
    	
    	for(FileVersion i : ls) {
    		if(version.equals(i.version)) {
    			return;
    		
    	}
    	}
    		
    	ls.add(new FileVersion(version,size));
    	
    }

    // =========================
    // FETCH
    // =========================
    public static void fetch(String fileName){

        // 1. If file not found → print "File Not Found" and return
    	
    	if(!storage.containsKey(fileName)) {
    		System.out.println("File Not Found");
    		return;
    	}

        // 2. Get list of versions
    	
        List<FileVersion> versions = new ArrayList<>(storage.get(fileName));
        
        Collections.sort(versions,(a,b)->{
        	if(a.size != b.size)
        		return a.size - b.size;
        	
        	return (a.version).compareTo(b.version);
        });

        for(FileVersion v : versions) {
        System.out.println(fileName+ " "+ v.version+ " "+ v.size);
    }
    }


    // =========================
    // LATEST
    // =========================
    
    
    public static void latest(String fileName){

        // 1. If file not found → print "File Not Found"
    	
    	if(!storage.containsKey(fileName)) {
    		System.out.println("File Not Found");
    		return;
    	}

        // 2. Get list
    	List<FileVersion> ver = storage.get(fileName);
    	
    	FileVersion latest = ver.get(ver.size()-1);
    
    	System.out.println(fileName+" "+latest.version+" "+ latest.size);
    	 
    	}


    // =========================
    // TOTAL STORAGE
    // =========================
    public static void totalStorage(String fileName){

        // 1. If file not found → print "File Not Found"
    	
    	if(!storage.containsKey(fileName)) {
    		System.out.println("File Not Found");
    		return;
    	}
    	
    	List<FileVersion> list = storage.get(fileName);
    	int sum = 0;
    	
    	for(FileVersion v:list) {
    		sum += v.size;
    	}
    	
    	System.out.println(fileName+" "+sum);

     
    }


    // =========================
    // MAIN METHOD
    // =========================
    public static void main(String[] args){
    	
    	System.out.println("Enter:");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){

            String input = sc.nextLine();

            String[] data = input.split(" ");

            if(data[0].equals("UPLOAD")){

                // call upload method
            	upload(data[1],data[2], Integer.parseInt(data[3]));

            }

            else if(data[0].equals("FETCH")){

                // call fetch method
            	
            	fetch(data[1]);

            }

            else if(data[0].equals("LATEST")){

                // call latest method
            	latest(data[1]);

            }

            else if(data[0].equals("TOTAL_STORAGE")){

                // call totalStorage method
            	totalStorage(data[1]);

            }
        }
    }
}
