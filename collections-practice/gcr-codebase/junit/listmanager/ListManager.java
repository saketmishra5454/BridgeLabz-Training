package junit.listmanager;


import java.util.List;

public class ListManager {

    //add element in the list
    public void addElement(List<Integer> list, int element){
         list.add(element);
    }

    //remove element in the list
    public void removeElement(List<Integer> list, int element){
        list.remove(Integer.valueOf(element));
    }
    //get the size of the list
    public int getSize(List<Integer> list){
        return list.size();
    }
}
