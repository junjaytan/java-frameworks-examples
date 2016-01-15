/*
This groovy app can be run through Spring Boot CLI:
>> spring run app.groovy
 */

@RestController
class ThisWillActuallyRun {

    @RequestMapping("/")
    String home() {
        return "Hello World!"
    }

}