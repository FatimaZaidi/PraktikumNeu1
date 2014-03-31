import static org.junit.Assert.*;

import org.junit.Test;


public class CustomertestCase {

	
		
		 WebShop webshop= new WebShop();
		 
		 //Teste addCustomer
		 @Test
			public void testaddCustomer() {
			 
			 webshop.addCustomer("Jogi", "Löwe");
			 assertFalse(webshop.getCustomerFromList("Ulli", "Hoeneß"));
			 
			 webshop.addCustomer("Ulli", "Hoeneß");
			 assertTrue(webshop.getCustomerFromList("Ulli", "Hoeneß"));
			 
}
		  /**
		  * Testet die Liste Löschen Methode
		  */
		 @Test 
		 public void testClearMethode(){
			 webshop.ListeLoeschen();
			 assertTrue(webshop.getListe().isEmpty());
		 }
/*
 * Teste die remove Methode
 * 
 */
		 @Test
		 public void testeremoveCustomer(){
			 webshop.addCustomer("Jogi", "Löw");
			 assertTrue(webshop.removeCustomer(0,"Jogi", "Löw"));
		 }
		
		 /*Testet ComparartorID
		  * 
		  */
		 @Test
		 public void testSortiererID(){
			 
			 webshop.ListeLoeschen();
			 
			 webshop.addCustomer("Hansi", "Flick");
			 webshop.addCustomer("Mehmet", "Scholl");
		
			 webshop.getSortList(SortingCriterion.SORT_BY_ID);
			 assertTrue(webshop.getListe().get(1).getId()==4);
			 
	}
		 
		 
		 /*Testet den ComparatorNachnamen
		  * 
		  */
		 
		 @Test
		 public void testSortName(){
			 
			 
			 webshop.listeL�schen();
			 webshop.addCustomer("Hansi", "Flick");
			 webshop.addCustomer("Mehmet", "Scholl");
			 webshop.addCustomer("Hans", "Peter");
			 webshop.printListOfCustomer(SortingCriterion.SORT_BY_LASTNAME_FIRSTNAME);
			 assertTrue(webshop.getListe().get(0).getNachname()=="Flick" && webshop.getListe().get(1).getNachname()=="Peter");
			 
		 }
			
			 
		 }
		 

		 
				 
				 
			 
		 

		
		 

