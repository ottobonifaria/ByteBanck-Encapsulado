public class TestaGetSet {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setNumero(1337);
        System.out.println(conta.getNumero());
        Cliente marcos = new Cliente();

        marcos.setNome("Marcos Faria");

        conta.setTitular(marcos);
        System.out.println(conta.getTitular().getNome());
        System.out.println(marcos);

        conta.getTitular().setProfissao("Programador");
        System.out.println(conta.getTitular());
        System.out.println(conta.getTitular().getProfissao());

        //agora em duas linhas
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Programador 1");
        System.out.println(titularDaConta);
        System.out.println(titularDaConta.getProfissao());


    }
}
