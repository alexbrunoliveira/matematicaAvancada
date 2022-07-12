package matematica;

import matematica.matematicaAvancada;


public class testeLivro {

  public static void main(String[] args) {
   matematicaAvancada ma = new matematicaAvancada();
   ma.soma(900,750);
   
   double valorSeguro = ma.getResultado();
   
   System.out.println("valor do seguro..........:" + valorSeguro);
   
   if(ma.par(valorSeguro)){
     System.out.println("<----- este número é par ------>");
   }else {
     System.out.println("<----- este número é impar ------>");
   }
   double fatorDesconto=ma.descontoSeguro(5);
   // classe bonus 5
   
   double seguroDesconto = valorSeguro * fatorDesconto;
   
   double seguroFinal = valorSeguro - seguroDesconto;
   
   System.out.println("-- Fator de desconto  --->" + fatorDesconto);
   System.out.println("Valor do desconto ..........: "+ seguroFinal);
   
  }
}
