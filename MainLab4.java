package MainLab4;

public class MainLab4 {
	public static void main(String[] args) {
        SortedIntegerList item = new SortedIntegerList(true);

        for(int i = 0; i < 100; i++)
                item.add(i);
        
        item.out();
        
        for(int i = 99; i >= 0; i--)
                item.add(i);
            
        item.out();

        for(int i = 0; i < 100; i++)
                item.remove(i);
        
        item.out();
        
        SortedIntegerList item2 = new SortedIntegerList(false);
        
        for(int i = 0; i < 100; i++)
            item2.add(i);

        item2.out();

    
        for(int i = 99; i >= 0; i--)
        	item2.add(i);
        
        item2.out();

	    for(int i = 0; i < 100; i++)
	            item2.remove(i);
    
	    item2.out();
	    
    
    }
}
