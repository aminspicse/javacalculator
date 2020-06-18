
package calculator;

public class Calculation {
   
    public static float cal(float a, char op, float b){
        float result;
        if(op == '+'){
            result = a+b;
        }else if(op == '-'){
            result = a-b; 
        }else if(op == '*'){
            result = a*b;
        }else{
            result = 0;
        }
        return result;
    }
}
