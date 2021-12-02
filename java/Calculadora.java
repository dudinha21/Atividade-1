public class Calculadora{
        // atributo
        private int resultado = 0;
        // método somar
        public double somar( int soma1, int soma2 ){
            resultado = soma1 + soma2;
            return resultado;
        }
        // método subtrair
        public double subtrair( int sub1, int sub2 ){
            resultado = sub1 ­ sub2;
            return resultado;
        }
        // método multiplicar
        public double multiplicar( int mult1, int mult2 ){
            resultado = mult1 * mult2;
            return resultado;
        }
        // método dividir
        public double dividir( int div1, int div2 ){
            resultado = div1 / div2;
            return resultado;
        }
}
