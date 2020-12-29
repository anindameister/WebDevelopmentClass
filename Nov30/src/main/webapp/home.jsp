<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<h1>What are the annotations, we have learnt till now?</h1>
<ol><li>
    @Component
    <ul><li>This tells that, I authorise this class to be used as bean</li></ul>
</li>
    <li>@Scope(value="prototype")
    </li>
    <ul><li>To be noted, the default type is Singleton for Spring Boot which means that an instance of the class would be given to the other class, even without calling it</li>
    <li>with @Scope(value="prototype") , the class needs to call for the bean explicitly</li></ul>
    <li>@Autowired</li>
    <ul><li>a class' method to be called within another class' method</li>
    <li>Eg:Laptop class called by Alien.class and this Alien.class being called by DemoApplication.java</li>
    </ul>
    <li> @Autowired @Qualifier("lap1")</li>
    <ul><li>@Autowired is used to connect one class to another class on the basis of class name</li>
    <li>@Autowired @Qualifier("lap1") is used to connect a class to another class, by the other class' object name by using things like @Component("lap1")
    </li>
    <li>@Controller</li>
        <ul><li>When client request a server to serve the webPage, then this Client searches for the controller in the server. To create this Controller, the server just needs a class and this class should have a method. This class needs to be annotated by @Controller</li>
        </ul>
    </ul>
    <li>@RestController</li>
    <ul><li>Same as @Controller but @RestController would be used for creating Restful Services.</li></ul>

    <li>@ResponseBody</li>
    <ul><li>Would be used more in @RestMapping</li>
    <li>It has been used under @RequestMapping("/ResponseBodyIntroduced") to send texts to the client as response.</li></ul>
<li>@RequestParam("name")</li>
    <ul><li>Part of ModelAndView</li>
    <li>"name" what we are seeing is the accepting parameter. This keyName needs to match the keyName such as "?name" coming from the client</li></ul>

    <li>@Entity-table name AND @Id- table column header</li>
    <ul><li>This is done within the java class under the model package</li></ul>
    <li>@RequestParam is used to fetch data from client</li>
    <ul><li>@RequestParam was previously used as a part of ModelAndView</li>
    <li>Now, Telusko brought the same @RequestParam without talking about ModelANdView, though me mentioned the same later</li></ul>
    <li>@Query("from Alien where tech=?1 order by aname")</li>
    <ul><li>This is used in order to create your own method in order to do advanced CRUD operations</li>
    <li>This is a JPQL query written as the body of the annotation</li></ul>
    <li>@RestController if used in place of @Controller then we dont need to use @ResponseBody, just to say that we are not returning JSP</li>
    <li>@PostMapping is used for Post</li>
    <li>@GetMapping can be used in place of @RequestMapping</li>
    <li>Here, since we are accepting from the url directly, we are using @PathVariable("aid") int aid</li>
</ol>

<form action="addAlien">
    <input type="text" name="aid"><br>
    <input type="text" name="aname"><br>
    <input type="submit"><br>
</form>



</body>
</html>