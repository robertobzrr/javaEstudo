public class IMC {

                private String nome;
                private double peso;
                private double altura;
                private double imc;


        public void setPeso(double peso_digitado){
            this.peso = peso_digitado;
        }

        public double getPeso(){
                return peso;
        }


        public void setAltura(double altura_digitada){
                this.altura = altura_digitada;
        }

        public double getAltura(){
                return altura;
        }


        public double calculo_IMC(double peso, double altura){
                imc = peso / (altura * altura);
                return imc;
        }



}
