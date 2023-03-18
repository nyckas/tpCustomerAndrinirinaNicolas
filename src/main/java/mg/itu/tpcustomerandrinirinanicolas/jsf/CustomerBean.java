/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.itu.tpcustomerandrinirinanicolas.jsf;

import jakarta.ejb.EJB;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;
import mg.itu.tpcustomerandrinirinanicolas.ejb.CustomerManager;
import mg.itu.tpcustomerandrinirinanicolas.entities.Customer;

/**
 *
 * @author nicol
 */
@Named(value = "customerBean")
@ViewScoped
public class CustomerBean implements Serializable {
  private List<Customer> customers;

  @EJB
  private CustomerManager customerManager;

  /**
   * Creates a new instance of CustomerMBean
   */
  public CustomerBean() {
  }

  /** 
  * Renvoie la liste des clients pour affichage dans une DataTable 
  * @return 
  */  
  public List<Customer> getCustomers() {
    if (customers == null) {
      customers = customerManager.getAllCustomers();
    }
    return customers;  
  }  
  
}