
public class Anwendung {

	public static void main(String[] args) {
		
		/*
		 * Neuer Webshop
		 * webshop bekommt Kunden
		 */
		WebShop webshop = new WebShop();
		webshop.addCustomer("Jogi","L�w");
		webshop.addCustomer("Uli","Hoene�");
		webshop.addCustomer("Hansi","Flick");
		webshop.addCustomer("Dieter","Hoene�");
		webshop.addCustomer("Hansi","Flick");
		webshop.addCustomer("Mehmet","Scholl");
		webshop.addCustomer("Marco","Reus");
		
	
		//Kunden nach Namen sortiert//
	System.out.println("----------Sortiert nach Nachnamen-----------");	
    webshop.getSortList(SortingCriterion.SORT_BY_LASTNAME_FIRSTNAME);
    
    
    //Kunden nach Id sortiert//
    System.out.println("--------Sortiert nach ID-------");
	webshop.getSortList(SortingCriterion.SORT_BY_ID);
	
	System.out.println("-----------------------");
    
	//Kunden l�schen//

	
	webshop.removeCustomer(2,"Scholl", "Mehmet");
	webshop.removeCustomer(5,"Hansi","Flick");
	
    
	




		

	}

}
