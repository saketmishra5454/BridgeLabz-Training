package collections.M1_Practice.set1.document_revision_tracker;

import java.util.*;

class Revision {

    String revisionId;
    int pages;

    public Revision(String revisionId, int pages){
        this.revisionId = revisionId;
        this.pages = pages;
    }
}

public class RevisionTracker {

    static Map<String, List<Revision>> storage = new HashMap<>();

    public static void addRevision(String docName, String revisionId, int pages){
    	
    	storage.putIfAbsent(docName, new ArrayList<>());
    	
    	List<Revision> revisions = storage.get(docName);
    	
    	for(Revision r : revisions) {
    		if(r.revisionId.equals(revisionId)) {
    			return;
    		}
    	}
    	
    	revisions.add(new Revision(revisionId,pages));
    	
    }

    public static void showRevisions(String docName){

        // check document exists
    	if(!storage.containsKey(docName)) {
    		System.out.println("Document Not Found");
    		return;
    	}
    	
    	List<Revision> revisions = new ArrayList<>(storage.get(docName));
    	
    	Collections.sort(revisions,(a,b)->{
    		if(a.pages != b.pages) 
    			return a.pages-b.pages;
    		
    		
    		return a.revisionId.compareTo(b.revisionId);
    			
    			
    		
    	});
    	
    	for(Revision r : revisions) {
    		System.out.println(docName+" "+r.revisionId+" "+r.pages);
    	}

    }

    public static void latestRevision(String docName){

        // print last revision
    	
    	if(!storage.containsKey(docName)) {
    		System.out.println("Document Not Found");
    		return;
    	}
    	
    	List<Revision> revisions = storage.get(docName);
    	
    	Revision latest = revisions.get(revisions.size()-1);
    	
    	System.out.println(docName+ " "+latest.revisionId+" "+ latest.pages);
    }

    public static void totalPages(String docName){

        // sum pages
    	if(!storage.containsKey(docName)) {
    		System.out.println("Document Not Found");
    		return;
    	}
    	
    	List<Revision> revisions = storage.get(docName);
    	int sum = 0;
    	for(Revision r : revisions) {
    		
    		sum+=r.pages;
    		
    	}
    	System.out.println(docName+" "+sum);
    }
    
    
    public static void main(String[] args) {
		
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter the NUmber of Operations:");
    	
    	int n = sc.nextInt();
    	sc.nextLine();
    	
    	for(int i = 0; i<n;i++) {
    		
    		String input = sc.nextLine();
    		
    		String[] data = input.split(" ");
    	
    		
    	
    	if(data[0].equals("ADD_REVISION")) {
    		
    		addRevision(data[1],data[2],Integer.parseInt(data[3]));
    		
    	}
    	
    	else if(data[0].equals("SHOW_REVISIONS")) {
    		
    		showRevisions(data[1]);
    	}
    	
    	else if(data[0].equals("LATEST_REVISION")) {
    		latestRevision(data[1]);
    	}
    	
    	else if(data[0].equals("TOTAL_PAGES")) {
    		totalPages(data[1]);
    	}
    	
    	
    	else {
    		return;
    	}
    		
    	}
	}
}


