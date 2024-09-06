package org.myproject.restapi.controller;
import org.myproject.restapi.beans.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
// @RequestMapping("service")
// unComment ReqMapping to add base-Url to your handler.
public class CustomerController {

    //
    @GetMapping("/simplehome")
    public Customer home2() {
        Customer customer = new Customer();
        customer.setFirstName("Vikrant");
        customer.setLastName("Messy");
        return customer;
    }
    @GetMapping("/home")
    public ResponseEntity<Customer> home() {
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setLastName("Doe");

        // return ResponseEntity.ok(customer);                      // Response Api with Http ok status
        // return new ResponseEntity<>(customer, HttpStatus.OK);       //Response with Http code 201
        // return ResponseEntity.ok().body(customer);                   // differ method.
        return ResponseEntity.ok().header("Myheader","abc").body(customer);     //custom Header with value
    }
    // http://localhost:8080/customers-list
    @GetMapping("customers-list")
    public ResponseEntity<List<Customer>> customers() {
        List<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer("Ravi","Devarkonda",28));
        customers.add(new Customer("Salman","Khan",40));
        return ResponseEntity.ok(customers);
    }




    // http://localhost:8080/customer/1
    @GetMapping("customer/{id}")
    public ResponseEntity<Customer> customer(@PathVariable("id") int custAge) {
        Customer customer = new Customer("Pankaj","Tripathi",custAge);
        return ResponseEntity.ok(customer);
    }

    // http://localhost:8080/customer/1/akash/chopra
    // {id} -> custAge are differ, so we need to bind the id -> custAge
    @GetMapping("customer/{id}/{firstName}/{lastName}")
    public ResponseEntity<Customer> customer(@PathVariable("id") int custAge,
                                             @PathVariable String firstName,
                                             @PathVariable String lastName) {
        Customer customer = new Customer(firstName,lastName,custAge);
        return ResponseEntity.ok(customer);
    }




    // Spring boot REST API with Request Param
    //  http://localhost:8080/customer/query?id=1&firstName=Navin&lastName=rajen
    // id ==> age are differ , so we need to bind id -> age by specify
    @GetMapping("customer/query")
    public ResponseEntity<Customer> studentRequestVariable(@RequestParam("id") int age,
                                                           @RequestParam String firstName,
                                                           @RequestParam String lastName){
        Customer customer = new Customer(firstName, lastName,age);
        return ResponseEntity.ok(customer);
    }

    // Post = create a new customer detail
    // Use Postman as Post request
    // http://localhost:8080/customer/create
    @PostMapping("customer/create")
    @ResponseStatus(HttpStatus.CREATED)     // RestApi response with Http-201 ok
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        System.out.println(customer.getFirstName());
        System.out.println(customer.getLastName());
        System.out.println(customer.getAge());
        //return new ResponseEntity<>(customer, HttpStatus.CREATED);
        return ResponseEntity.ok(customer);
    }

    // Put = Update existed resource...
    //Use PostMan to create put req
    // http://localhost:8080/customer/23/update
    @PutMapping("customer/{id}/update")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer,
                                                   @PathVariable("id") int custAge) {
        customer.setAge(custAge);
        System.out.println(customer.getFirstName());
        System.out.println(customer.getLastName());
        System.out.println(customer.getAge());
        return ResponseEntity.ok(customer);
    }



    // Use Postman to hit Request
    // http://localhost:8080/customer/neeraj/delete
    @DeleteMapping("customer/{firstName}/delete")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Customer> deleteCustomer(@RequestBody Customer customer,
                                                   @PathVariable String firstName)
    {
        System.out.println("Customer deleted Successfully"+ customer.getFirstName());
        return ResponseEntity.ok(customer);
    }

}
