public class Matango extends Monster{
    public Matango(int hp, char suffix) {
        super(hp, suffix);
    }
    public void attack(Creature target) {
        System.out.println("お化けキノコ" + getSuffix() + "は体当たり攻撃！" + target.getName() + "に6のダメージを与えた！");
        target.setHp(target.getHp()-6);
    }
}
