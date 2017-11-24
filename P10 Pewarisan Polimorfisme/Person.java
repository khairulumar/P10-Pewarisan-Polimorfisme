public class Person {
    protected String name;
    protected String address;

    /**
     * Default constructor
     */

     public Person(){
         System.out.println("Inside Person:Constructor");
     name = "";
     address = "";
     }

     /**
      * Constructor dg dua parameter
      */
      public Person( String vname, String vaddress) {
      this.name = vname;
      this.address = vaddress;
      }

      /**
       * Method accesor
       */
       public String getName(){         //method accesor menangani sebuah class

           return name;
       }

       public String getAddress(){

           return address;
       }

       public void setName(String vname){
           this.name = vname;
       }

       public void setAddress(String vaddress){
           this.address = vaddress;
       }
}