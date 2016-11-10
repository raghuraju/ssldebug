package ssldebug;

import java.io.IOException;
import org.joda.time.LocalTime;
import ssldebug.OkHttpExample;

public class HelloWorld {
  public static void main(String[] args) throws IOException {
    LocalTime localTime = new LocalTime();
    System.out.println("Current local time: "+localTime);

    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());

    OkHttpExample okExample = new OkHttpExample();
    String response = okExample.run("https://raw.github.com/square/okhttp/master/README.md");
	System.out.println(response);    
  }
}