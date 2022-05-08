package v2ch09.com.horstmann.places;

/*

javac v2ch09.com.horstmann.util/module-info.java \
   v2ch09.com.horstmann.util/com/horstmann/util/ObjectAnalyzer.java
javac -p v2ch09.com.horstmann.util v2ch09.openpkg/module-info.java \
   v2ch09.openpkg/com/horstmann/places/*.java
java -p v2ch09.openpkg:v2ch09.com.horstmann.util -m v2ch09.openpkg/v2ch09.com.horstmann.places.Demo

Remove the opens clause in the module descriptor and recompile/run to
see the failure

*/


import v2ch09.com.horstmann.util.*;

public class Demo
{
   public static void main(String[] args) throws ReflectiveOperationException
   {
      Country belgium = new Country("Belgium", 30510);
      ObjectAnalyzer analyzer = new ObjectAnalyzer();
      System.out.println(analyzer.toString(belgium));
   }
}
