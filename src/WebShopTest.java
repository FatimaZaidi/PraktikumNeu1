import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class WebShopTest {
	
	

	private WebShop webshop;

	@Before
	public void setUp() throws Exception {
		 webshop= new WebShop();
	}

	/**
	 * Teste addCustomer
	 */
	@Test
	public void testaddCustomer() {
         webshop.addCustomer("Jogi", "Löw");
		
		assertFalse(webshop.getCustomerFromList("Uli", "Hoeneß"));
		
		
		
		webshop.addCustomer("Uli", "Hoeneß");
        assertTrue(webshop.getCustomerFromList("Uli", "Hoeneß"));
		
       
	}
	
	/**
	 * Testet die Liste löschen Methode
	 */
	@Test
	public void clearList(){
		webshop.ListeLoeschen();
		assertTrue(webshop.getListe().isEmpty());
		
	}
	
	/**
	 * Testet remove 
	 */
	@Test
	public void removeCustomer(){
		webshop.addCustomer("Jogi", "Löw");
		assertTrue(webshop.removeEintragAusListe(0));
		
	}
	
	/**
	 * Teste die Sortieren..
	 */
	@Test
	public void sort(){
		webshop.ListeLoeschen();
		
		webshop.addCustomer("Jogi", "Löw");
		webshop.addCustomer("Uli", "Hoeneß");
		webshop.addCustomer("Hansi", "Flick");
		webshop.addCustomer("Dieter", "Hoeneß");
		webshop.addCustomer("Hansi", "Flick");
		webshop.addCustomer("Mehmet", "Scholl");
		webshop.getSortList(SortingCriterion.SORT_BY_ID);
		
		for(Customer e : webshop.getListe()){
			System.out.println(e);
		}
		assertTrue((webshop.getListe().get(0).getId()==3) && 
				webshop.getListe().get(1).getId()==4 &&
				webshop.getListe().get(2).getId()==5);
		
		webshop.getSortList(SortingCriterion.SORT_BY_LASTNAME_FIRSTNAME);
		assertEquals("Jogi", "Jogi"); 
		

		
	}

}
