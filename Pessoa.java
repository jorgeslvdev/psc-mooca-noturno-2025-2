import javax.swing.JOptionPane;

public class Pessoa {
    private String nome;
    private double idade;
    private double altura;
    private String email;
    private String cpf;
    private double peso;
    private String cnpj;


    public void realizarLogin (){


    }

    public void realizarCadastro (){




   }        
   public void emitirNota (){



}
    public void chorar (){
        JOptionPane.showMessageDialog(null, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void criarPessoa() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'criarPessoa'");
    }

    public void exibirPessoa() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exibirPessoa'");
    }
}