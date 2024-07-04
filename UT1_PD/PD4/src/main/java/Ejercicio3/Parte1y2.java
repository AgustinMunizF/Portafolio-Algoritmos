
/*
1)
String[] students = new String[10];
String studentName = "Peter Parker";
students[0] = studentName;
studentName = null;
...
students sera una referencia al array de Strings
y students[0] sera una referencia a un String que contiene "Peter Parker"

ninguno de estos objetos sera recolectado por el garbage collector,
aunque studentName ya no hace referencia al String "Peter Parker" 
el student[0] sigue haciendo referencia a el, por lo que no se puede recolectar 
*/

/*
2) la destruccion de un objeto en java la hace el garbaje collector de forma automatica.
Cuando un objeto ya no tiene ninguna referencia apuntando a él se considera inaccesible y
es elegible para ser recolectado por el garbage collector

*/