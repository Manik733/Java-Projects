/****    
 * Name: Manik Singh
 * Student Number: T00715263
 * Assignment Number: 3
 * Due Date: October 17, 2023
 * Program Description: The plant class contains the usual constructors (both default and parameterized), 
 *     get (accessor methods), set (mutator methods) for every attribute, a toString method, 
 *     an equals method. Also, it implements the Comparable<Plant> interface and uses compareTo method to 
 *     show age-based comparisons between plant objects.
 ****/

public class Plant implements Comparable<Plant>
{
    protected String name;
    protected int age;
        
    public Plant()  // create default constructor
    {
        name = "Not defined";
        age = 0;
    }
        
    public Plant(String newName, int newAge )   //create parameterized constructor
    {
         name = newName;
         age = newAge;
    }
        
    public String getName()    //create getName method to return the name of the plant
    {
         return name;
    }
        
    public int getAge()    //create getAge method to return the age of the plant
    {
         return age;
    }
        
    public void setName(String newName)    //create setName method to set the name of the plant
    {
         name = newName;
    }
        
    public void setAge(int newAge)      //create setAge method to set the age of the plant
    {
        age = newAge;
    }
       
    public void set(String newName, int newAge)     /* create set method to set both the name 
    and age of the plant */                                                                                  
    {                                               
         name = newName;
         age = newAge;
    }
    
    public String toString()     //create toString method to return a string that contains all the plant attributes
    {
         return "Name = " + name + " and Age = " + age;
    }


    public boolean equals(Object o) {       //equals method
     if (this == o) {
         return true;       // Same object reference, they are equal
     }
     
     if (o == null) {
         return false;     // o is null, they are not equal
     }

     if (!(o instanceof Plant)) {
         return false;     // o is not an instance of Plant, they are not equal
     }
 
     Plant plant = (Plant) o;        // Cast o to a Plant object
 
     // Compare the name and age attributes for equality
     return this.name.equals(plant.name) && this.age == plant.age;
  }

 public int compareTo(Plant other) {
    // Compare plant objects based on their age
    if (this.age > other.age) {
        return 1; // This plant is younger
    } 

    else if (this.age == other.age) {
        return 0;  // Ages are equal
    } 
    
    else {
        return -1;  // This plant is older
    }
  }
 
}