package com.example;

public class dato {
  
    byte edad = 25;
        short codigoPostal = 12345;
        double salario = 3500.00;
        String nombre = "Juan Pérez";
        boolean esMayorDeEdad = true;

        Byte edadObjeto = edad;

        byte edadJP = edadObjeto;

        Double salariObjeto = salario;

        int salarioEnt = (int) salario;

        long codigoPostalLong = (long) codigoPostal;

        /*¿Qué sucede con la información al realizar el casteado?
            -Se puede notar que en la primera variable, el casteo permite que la variable 'salario' que antes era
            de tipo double se convierta en tipo int, es decir, entero. Por ende, se conserva la parte entera del 
            número y la parte decimal se pierde.
            -En la segunda variable, pasa lo mismo que en la primera, pero con la diferencia de que la variable 
            'codigoPostal' cambio de tipo short a tipo long gracias al casteo.
        */   

        String numeroStr = "12345678";

        int numeroInt = Integer.parseInt(numeroStr);

        String decimalStr = "3.14159";

        double decimalValor = Double.parseDouble(decimalStr);

        
        System.out.println ("Nombre (método toString): " + nombre.toString());
    
        System.out.println("Edad como objeto Byte: " + edadObjeto);
        System.out.println("Edad después de unboxing: " + edadJP);
        System.out.println("Salario como objeto Double: " + salariObjeto);
        System.out.println("Es Mayor de Edad: " + esMayorDeEdad);

        System.out.println("Salario entero: " + salarioEnt);
        System.out.println("Código postal long: " + codigoPostalLong);

        System.out.println("Número como entero: " + numeroInt);
        System.out.println("Decimal como double: " + decimalValor);
    }




    


       