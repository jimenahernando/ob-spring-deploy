package com.jimenahernando.obspringdeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${app.message}")
    String message;

//    @Value("${app.varexample}")
//    String varEnvironment;

    @GetMapping("/hola")
    public String holaMundo(){
//        return message + " - les habla " + varEnvironment;
        return message + " - les habla ";
//        return "Hola mundo que tal vamos ahora";
    }

    @GetMapping("/bootstrap")
    public String bootstrap(){
        // la triple comilla sirve para concatenar sin poner el *
        return """
                    <!doctype html>
                    <html lang="en">
                      <head>
                        <meta charset="utf-8">
                        <meta name="viewport" content="width=device-width, initial-scale=1">
                        <title>Bootstrap demo</title>
                        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
                      </head>
                      <body>
                        <h1>Hola Mundo desde SpringBooot!</h1>
                        <button type="button" class="btn btn-primary">Google</button>
                        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
                      </body>
                    </html>
                """;
    }
}
