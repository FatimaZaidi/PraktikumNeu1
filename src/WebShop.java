

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WebShop {
	public static void main(String []args){
		
		
	}
		
	
	
	
/*Erzeugung eines neuen ArrayList*/
 public static List<Customer> list = new ArrayList<Customer>(); 

/*-------------------ÖFFENTLICHE METHODEN-----------------*/

 /*Methode um Customer hinzuzufügen*/
	public void addCustomer(String vorname, String nachname){
		Customer eintrag= new Customer(vorname,nachname);
		appendEintragAnListe(eintrag);
	}
	
/*Methode zum Customer Löschen*/
	public boolean removeEintragAusListe(int id){
		for(Customer e : list){
			if (e.getId() == id) {
				list.remove(e);
				System.out.println("Customer mit der ID :"+ id +" gelöscht");
				return true;
			}
		}
		return false;
	}

	
	/*Gibt die Liste zurück*/
	public List<Customer> getListe(){
		return list;
	}

	
    /*Löscht die Liste*/
   public void ListeLoeschen(){
	list.clear();
}

/*-------------------PRIVATE METHODE-------------------*/
/* Trägt den neuen Customer ans Ende der Liste*/
private void appendEintragAnListe(Customer eintrag){
	if (eintrag!=null){
		list.add(eintrag);
	}
}



/*gibt die Liste als einen Array zurück*/
public Customer[] getListeAlsArray(){
  /* Neues Array erzeugen */
Customer [] ergebnis = new Customer[list.size()];
/* Liste in Array umwandeln */
list.toArray(ergebnis);


return ergebnis;
}

/**
 * Prueft ob in der Lister ein Customer mit den gegebenen Namen
 * und Vornamen vorhanden ist.
 * 
 * @param vorname des Customer
 * @param nachname des Customer
 * @return true wenn Customer in der Liste vorhanden , sonst false
 */
public boolean getCustomerFromList( String vorname, String nachname){
	for (Customer element : list) {
		if(element.getNachname().equals(nachname) && element.getVorname().equals(vorname))
		{
			System.out.println("Uebereinstimmung gefunden");
			
			return true;
		}
	}
	
	return false;
	
}

/*Gib die Sortierte Liste zurück */
	public List<Customer> getSortList(SortingCriterion mode){
		switch (mode) {
		case SORT_BY_ID:
			Collections.sort(list, new CustomerComparator());
			break;
		case SORT_BY_LASTNAME_FIRSTNAME:
			Collections.sort(list, new CustomerComparator2());
			break;
		default:
			break;
		}
		
		
		
		return list;
		
		
	}
	
	
	
}
	



	 
    


     
     
        
    	 
       
       


     
        	
       
    		
         	
	
   
        
		
        	
	
     

    











 
	 
	 




