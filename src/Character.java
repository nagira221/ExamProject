public abstract class Character implements Creature {
    private String name;
    private int hp;

    public Character(String name, int hp) {
        this.setName(name);
        this.setHp(hp);
        if (hp < 0) {
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
    }
    public final boolean isAlive() {
        return this.hp > 0;
    }
    public void showStatus(){
        System.out.println(getName() + ":HP " + getHp());
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHp(){
        return this.hp;
    }
    public void setHp(int hp){
        this.hp = Math.max(0, hp);
    }
}
