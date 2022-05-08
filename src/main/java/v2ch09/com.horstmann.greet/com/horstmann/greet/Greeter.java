package v2ch09.com.horstmann.greet;

public interface Greeter
{
   static Greeter newInstance()
   {
      return new v2ch09.com.horstmann.greet.internal.GreeterImpl();
   }

   String greet(String subject);
}
