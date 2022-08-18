public class Main {
    public static void main(String[] args){

        //Instanciar la clase
        Cuenta miCuenta = new Cuenta("123456","Ahorros", 150000);
        System.out.println("El saldo minimo es: "+miCuenta.getSaldoMinimo());
        miCuenta.consignar(80000);
        System.out.println("El saldo actual es: "+miCuenta.getSaldoActual());
        miCuenta.retirar(100000);
        System.out.printf("El saldo actual es de: "+miCuenta.getSaldoActual());
        miCuenta.setNumero("985412");
        System.out.printf(miCuenta.toString()+"\n");
        System.out.println("-------------------------");
        Cuenta pedroCuenta = new Cuenta("789456", "prestamo", 5000);
        System.out.printf(pedroCuenta.toString());
    }
}
