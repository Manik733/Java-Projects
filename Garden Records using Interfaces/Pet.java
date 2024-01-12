public class Pet
{
      private String name;
      private int age;
          
      public Pet( )
      {
          name = "not defined";
          age = 0;
      }
          
      public Pet(String newName, int newAge )
      {
           name = newName;
           age = newAge;
      }
          
      public String getName( )
      {
           return name;
      }
          
      public int getAge( )
      {
           return age;
      }
          
      public void setName(String newName )
      {
           name = newName;
      }
          
      public void setAge(int newAge )
      {
          age = newAge;
      }
         
      public void set(String newName, int newAge)
      {
           name = newName;
           age = newAge;
      }
         
      public String toString( )
      {
           return "Name = " + name + " age is " + age;
      }
}