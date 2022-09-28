package VariablesyOperadores;

public class EjemplosIncrementoDecremento {
    public static void main(String[] args) {
        //De momento no le vamos a dar utilidad
        //pero es super util cuando veamos bucles: for, while, do-while

        //Se utilizan cuando queremos que una variable aumente o disminuya
        // en una unidad
        int n = 10;
        System.out.println("1. " + n);

        // quiero aumentar una unidad
        n = n + 1;
        System.out.println("2. " + n);

        // esto mismo podría haberlo hecho así:
        n++; // incrementa el valor de n en 1-> es lo mismo que el n = n + 1
        System.out.println("3. " + n);

        // otra forma de escribir eso mismo es
        n +=1; // esta nomenclatura vale también para el producto ( n *= 1) etc.....
        System.out.println("4. " + n);

        // y una opción más de escribir lo mismo (pero es exactamente igual)
        ++n;
        System.out.println("5. " + n);

        // lo mismo para el decremento
        // si quiero que la variable disminuya en una unidad puedo hacerlo de dos formas
        n = n - 1;
        n--;
        n-= 1;
        --n;
        System.out.println("Decremento tras decremento..." + n);

        //diferencia entre prefijo ++ o sufijo
        int a = 4;
        int b = a++; // primero asigna A a B
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println(b++);

        int c = 10;
        System.out.println("c++: " + c++);
        System.out.println("C: " + c);
        System.out.println("++C: " + ++c);



    }
}
