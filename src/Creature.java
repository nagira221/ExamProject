public interface Creature {

    boolean isAlive();

    void showStatus();

    void attack(Creature target);

    default String getName() {
        return "";
    }

    default int getHp(){
        return 0;
    }

    default void setHp(int hp) {
    }
}
