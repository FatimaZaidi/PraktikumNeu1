import java.util.Comparator;


public class CustomerComparator implements Comparator <Customer>{

	

	@Override
	public int compare(Customer o1, Customer o2 ){
		
		if (o1.getId() < o2.getId()){
			return -1;
		}else if (o1.getId() > o2.getId()){
			return 1;
		} else {
	         return 0;
	}
	
	
	

}
}
