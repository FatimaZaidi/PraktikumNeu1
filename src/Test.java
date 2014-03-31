import java.util.List;




   public class Test {

	public static void main(String[] args) {
		
		WebShop webShop = new WebShop();
		webShop.addCustomer("Jogi", "Löw");
		webShop.addCustomer("Uli", "Hoeneß");
		webShop.addCustomer("Hansi", "Flick");
		webShop.addCustomer("Dieter", "Hoeneß");
		webShop.addCustomer("Hansi", "Flick");
		webShop.addCustomer("Mehmet", "Scholl");
		webShop.addCustomer("Marco", "Reus"); 
		webShop.printListOfCustomers(SortingCriterion.SORT_BY_LASTNAME_FIRSTNAME);
		
	
	System.out.println(webShop.toString());

	System.out.println("Sortiere nach Name");
		List<Customer> list = webShop.getSortList(SortingCriterion.SORT_BY_LASTNAME_FIRSTNAME);
		for(Customer element : list){
			System.out.println(element);
		}
	
		System.out.println("\nsortiere nach ID");
		
		List<Customer> list2 = webShop.getSortList(SortingCriterion.SORT_BY_ID);
		for(Customer element : list2){
			System.out.println(element);
		}
	


	  
		
	   
	      
	
}
	} 
