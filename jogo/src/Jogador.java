public class Jogador {
    private String nome;
    private int xp = 0;
    private int hp = 100;
    private boolean envenenado = false;

    public Jogador(){

    }

    public Jogador(String nome){
        this.nome = nome;
    }

    public void receberDano(int pontos){
        this.hp -= this.hp - pontos;
        //pode se melhorar esse método usando : this.hp -= pontos;
    }

    public void receberCura(int pontos){
        this.hp += pontos;
    }
    public void ganharExperiencia (int pontos){
        this.xp += pontos;
    }

    public void receberAntidoto(){
        if(envenenado){
            envenenado = false;
            return;
        }
        envenenado = true;

    }

    public String getnome(){
        return nome;
    }


    public int getxp(){
        return xp;
    }
    public int gethp(){
        return hp;
    }
}