import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {
        ArrayList<Character> party = new ArrayList<>();
        Hero h = new Hero("勇者", 100, "剣");
        Wizard w = new Wizard("魔法使い", 60, 20);
        Thief t = new Thief("盗賊", 70);
        System.out.println("---味方パーティ---");
        party.add(h);
        party.add(w);
        party.add(t);
        for (Character c : party) {
            c.showStatus();
        }

        ArrayList<Monster> monsters = new ArrayList<>();
        Matango m = new Matango(45, 'A');
        Goblin g = new Goblin(50, 'A');
        Slime s = new Slime(40, 'A');
        System.out.println("---敵グループ---");
        monsters.add(m);
        monsters.add(g);
        monsters.add(s);
        for (Monster mo : monsters) {
            mo.showStatus();
        }

        System.out.println("\n味方の総攻撃！");
        for (Character c : party) {
            for (Monster mo : monsters) {
                c.attack(mo);
            }
        }
        System.out.println("\n敵の総攻撃！");
        for (Monster mo : monsters) {
            for (Character c : party) {
                mo.attack(c);
            }
        }

        System.out.println("\nダメージを受けた勇者が突然光りだした！");
        System.out.println(h.getName() + "はスーパーヒーローに進化した！");
        SuperHero sh = new SuperHero(h);
        for (Monster mo : monsters) {
            sh.attack(mo);
        }

        System.out.println("\n---味方パーティ最終ステータス---");
        if (h.isAlive()) {
            h.showStatus();
            System.out.println("生存状況:生存");
        } else {
            h.showStatus();
            System.out.println("生存状況:戦闘不能");
        }
        if (w.isAlive()){
            w.showStatus();
            System.out.println("生存状況:生存");
        } else {
            w.showStatus();
            System.out.println("生存状況:戦闘不能");
        }
        if (t.isAlive()){
            t.showStatus();
            System.out.println("生存状況:生存");
        } else {
            System.out.println("生存状況:戦闘不能");
        }

        System.out.println("\n---敵グループ最終ステータス---");
        if (m.isAlive()){
            m.showStatus();
            System.out.println("生存状況:生存");
        } else {
            m.showStatus();
            System.out.println("生存状況:討伐済み");
        }
        if (g.isAlive()){
            g.showStatus();
            System.out.println("生存状況:生存");
        } else {
            g.showStatus();
            System.out.println("生存状況:討伐済み");
        }
        if (s.isAlive()){
            s.showStatus();
            System.out.println("生存状況:生存");
        } else {
            s.showStatus();
            System.out.println("生存状況:討伐済み");
        }
    }
}