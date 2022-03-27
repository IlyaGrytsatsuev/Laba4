package MainLab4;

import java.util.*; 

public class SortedIntegerList {
	private LinkedList<Integer> list; 
    private boolean isMultiSet; 

    public SortedIntegerList(boolean flag){ 
        isMultiSet = flag; 
        list = new LinkedList<Integer>(); 
    } 

    public void add(int value){ 
        boolean flag = false; 
        ListIterator<Integer> i = list.listIterator(); 
        while(i.hasNext()) { 
            int cur = i.next(); 
            if (value == cur && isMultiSet) { 
                i.previous(); 
                i.add(value); 
                flag = true; 
                break; 
            } 
            if (value < cur) { 
                i.previous(); 
                i.add(value); 
                flag = true; 
                break; 
            } 
            if (value == cur && !isMultiSet) {
            	flag = true;
            	break;
            }
        } 
        
       if(!flag) 
            list.add(value); 
    } 

    public void remove(int value){ 
        ListIterator<Integer> i = list.listIterator(); 
        while(i.hasNext()) { 
            int cur = i.next(); 
            if (value == cur) { 
                i.remove(); 
            if (!isMultiSet) 
                break; 
            } 
        } 
    } 

    public boolean equals(SortedIntegerList o){ 
        if(list.size() != o.list.size()) 
            return false; 
        ListIterator<Integer> i1 = list.listIterator(); 
        ListIterator<Integer> i2 = o.list.listIterator(); 
        while(i1.hasNext()) 
            if (i1.next() != i2.next()) 
                return false; 
            
        return true; 
    } 

    public void out(){
        System.out.println(this.list);
    }


    public String toString(){ 
        return list.toString(); 
    } 
}
