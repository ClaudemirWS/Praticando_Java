package com.claudemir.primeiroscomandos;

public class EstruturasCondicionais {
    
    public static void main(String[] args) {
    int num1 = 10, num2 = 15, num3 = 20;
    //OPERADOR MAIOR QUE
    System.out.println( num1 > num2 ); 
    //OPERADOR DIFERENTE DE
    System.out.println( num1 != num2 ); 
    //OPERADOR NÃO 
    System.out.println(!(num1 < num2)); 
    //OPERADOR E
    System.out.println( num1 < num2 && num2 < num3); 
    //OPERADOR OU
    System.out.println( num1 >= num2 || num1 >= num3); 
    //FAZENDO O USO DE MULTIPLOS OPERADORES
    System.out.println( (num1 > num2 && num2 > num3) || (num2 +10 > num3 ) ); 
    }
    
}
