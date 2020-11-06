public class Player {
    private String name;
    private int hp;

    public Player(String someName, int someHP) {
        this.name = someName;
        this.hp = someHP;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public void hit(int damage) {
        int v = 0;
        int percent = (damage + 1) * 10; // при 9 не должны попадать
        v =(int) Math.floor(Math.random() * 100) + 1;
        if ( v > percent) {
            this.hp -= damage;
        }
        else {
            System.out.println("Промах!");
            this.hp -= 0;
        }
    }


}
