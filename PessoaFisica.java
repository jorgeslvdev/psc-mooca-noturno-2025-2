public class PessoaFisica {
    public void criarPessoaFisica(){
        boolean nasceu = true;

        if(nasceu){
        Pessoa pessoa = new Pessoa();
        pessoa.chorar();
        pessoa.setNome ("Jorge");
        pessoa.setCpf ("123.456.789-00");
        } else {
            System.out.println("Pessoa não nasceu");
        }
        


    }

    public void exibirPessoa(){
        Pessoa pessoa = new Pessoa();
        System.out.println("Nome: " + pessoa.getNome() + " CPF: " + pessoa.getCpf());
    }

}



