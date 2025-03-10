public class Pessoa {

            private String nome;
            private int idade;
            private double altura;
            private double peso;


        public void setNome (String nome_digitado){
            this.nome = nome_digitado;
        }

        public String getNome(){
            return nome;
        }


        public void setIdade (int idade_digitada){
            this.idade = idade_digitada;
        }

        public int getIdade(){
            return idade;
        }


        public void setPeso(double peso_digitado) {
            this.peso = peso_digitado;
        }

        public double getPeso() {
            return peso;
        }


        public void setAltura(double altura_digitada) {
            this.altura = altura_digitada;
        }

        public double getAltura() {
            return altura;
        }




}
