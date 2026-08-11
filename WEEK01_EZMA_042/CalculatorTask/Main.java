public class Main {
 public static void main(String[] args){
    Calculator casio= new Calculator(70,56);
    Calculator citizen= new Calculator(casio);
casio.subtract();
citizen.modulus();
casio.setNum1(89);
casio.display();
casio.divide();
}
}