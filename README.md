# Lab03CVDS

## Integrantes

Crhystian Camilo Molano Chacon

Cristian Camilo Ruiz Santa

## Clases de equivalencia

### Clase 1: Debería decir edad inválida

Los valores para que nos entregue una edad inválida son:

Que la edad sea menor o igual a 0 o mayor o igual a 120 años independientemente de los otros valores ingresados 
de la persona.

p.getAge()==-30; 

### Clase 2: Debería decir que la persona no cumple la edad

Los valores para que nos diga que la persona no cumple la edad son:

Que la edad sea válida, es decir, que la edad sea >=18 y <=119 años independendiente mente de los otros valores 
ingresados de la persona.

p.getAge()==2;

### Clase 3: Debería decir que la persona está muerta

Los valores para que nos diga que la persona está muerta son:

Que tenga una edad válida, que la persona sea mayor de edad y que la variable alive sea igual a false 
independientemente de los otros valores ingresados.

p.getAge()==22;

p.getAlive()==false;

### Clase 4: Debería decir que la persona está duplicada

Los valores para que nos diga que la persona está duplicada son:

Que tenga una edad válida, que la persona sea mayor de edad, que la variable alive sea igual a true y que la id 
se haya registrado antes.

p.getAge()==22;

p.getAlive()==true;

p.getId() está en la lista de ids registradas

### Clase 5: debría decir que el voto de la persona es válido

Los valores para que nos diga que el voto de la persona es válido son:

Que tenga una edad válida, que la persona sea mayor de edad, que la variable alive sea igual a true, que la id 
de la persona no se haya registrado anteriormente.

p.getAge()==22;

p.getAlive()==true;

p.getId() no está en la lista de ids registradas
