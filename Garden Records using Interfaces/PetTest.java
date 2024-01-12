public class PetTest
{
     public static void main(String[] x)
     {
          Pet pet1 = new Pet( );
          Pet pet2 = new Pet("Fluffy", 3);
          
          System.out.println("showing inital pet values set by default and parameterized constructors:\n");
          System.out.println(pet1);
          System.out.println(pet2.toString( ));
          System.out.println();
          
          System.out.println("testing setName, setAge and set methods");
          pet1.setName("Rex");
          pet1.setAge(7);
          pet2.set("Ralph", 6);
          
          System.out.println("new values for pet 1 " + pet1);
          System.out.println("new values for pet 2 " + pet2);
          
          System.out.println();
          System.out.println("testing getName, getAge methods");
          System.out.println("values for pet 1 from get methods " + pet1.getName() + "  " + pet1.getAge());
     }
}