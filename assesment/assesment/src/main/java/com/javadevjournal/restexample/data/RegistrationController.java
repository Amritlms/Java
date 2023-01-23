package com.javadevjournal.restexample.data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import es.softtek.jwtDemo.controller.Customer;
import es.softtek.jwtDemo.controller.CustomerService;
import es.softtek.jwtDemo.controller.HttpStatus;
import es.softtek.jwtDemo.controller.PostMapping;
import es.softtek.jwtDemo.controller.RequestBody;
import es.softtek.jwtDemo.controller.ResponseEntity;


@Controller
public class RegistrationController {

 @Autowired
 private Registration registration;

 @SuppressWarnings("static-access")
@PostMapping("/registration")
 public ResponseEntity < Customer > register(@RequestBody Registration registration) {
  Customer customer = CustomerService.saveCustomer(mapCustomerData(registration));
  return new ResponseEntity < Customer > (customer, HttpStatus.OK);
 }

 protected Registration mapCustomerData(Registration registration) {
  Customer registration1 = new Customer(registration1.getfirstName(), registration1.getlastName(), registration1.getEmai());
  customer.setAge(registration1.getAge());
  return customer;
 }

public Registration getRegistration() {
	return registration;
}

public void setRegistration(Registration registration) {
	this.registration = registration;
}
}