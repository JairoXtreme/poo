public class App {
    public static void main(String[] args) throws Exception {
      Jogador jogador = new jogador("Jairo");

      jogador.receberDano(10);
      System.out.println(jogador.getnome());
      System.out.println(jogador.gethp());

    }
}
