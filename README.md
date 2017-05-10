emailSender
==================

## About
a template build for me in spring boot to send emails. [project generate with Spring initializr] 

## Technical Specifications
+ Java
+ Spring Boot

## How To use? 

1. Download the project and inside the folder emailSender execute the followin command:
```
mvn install
```

2. in the POM of your project insert the following dependency:
```
<dependency>
    <groupId>br.com.possenti.EmailSender</groupId>
    <artifactId>emailSender</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```

3. use the example above in the class to send a email:
```
import br.com.possenti.emailSender.EmailService;
@Controller
public class MyClass {
    @RequestMapping("sendEmail")
    public String sendEmail(String userEmail, 
                            String subject, 
                            String message){
          new EmailService().send(userEmail, subject, message);   
          return "index";
    }
}
```



## Directory Structure 

  ```
 \
 |--src
 \
  |--main
  \
   |--main\java\br\com\possenti\emailSender
   \
    |--EmailSenderApplication.java
    |--EmailService.java
  |--\test\java\br\com\possenti\emailSender
  \
   |--EmailSenderApplicationTests.java
   
  ```
