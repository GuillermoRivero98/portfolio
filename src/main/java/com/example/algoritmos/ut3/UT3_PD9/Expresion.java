package porfolio.ut3.UT3_PD9;

import java.util.List;
import java.util.Stack;

public class Expresion {
    public static boolean controlCorchetes(List<Character> listaDeEntrada){
        Stack<Character> pila = new Stack<>();

        for(char c : listaDeEntrada){
            if(c == '{'){
                pila.push(c);
            }else if(c == '}'){
                if(pila.isEmpty() || pila.pop() != '{'){
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }
    
}
