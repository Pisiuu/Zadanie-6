package Cwiczenie6;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class GreetingController {
    private static final String template = "ID: %s, Hello, %s!,Your age: %s";
    private static final String template2 = "Bye, %s!";

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/bye") // odpowiada endpoint’om http
    public Greeting goodbye(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template2, name));
    }
    @RequestMapping("/homepage")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name, @RequestParam(value = "age", defaultValue = "0") String age, @RequestParam(value = "id", defaultValue = "id") String id) {
        return new Greeting(counter.incrementAndGet(), String.format(template, id, name, age));
    }


}
