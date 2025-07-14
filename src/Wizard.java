public class Wizard extends Character {
    int mp;

    public Wizard(String name,int hp ,int mp) {
        super(name,hp);
        this.mp = mp;
    }
    public void attack(Creature target){
        System.out.println(getName() + "は火の玉を放った！" + target.getName() + "に3のダメージを与えた！");
        target.setHp(target.getHp()-3);
        this.mp -= 1;
    }
}
