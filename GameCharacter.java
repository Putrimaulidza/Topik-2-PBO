public class GameCharacter {
    private String nama;
    private int Lifepoint = 100;
    private int Attackhitpoint;
    private int Attackkickpoint;

    public GameCharacter(String nama, int Attackhitpoint, int Attackkickpoint) {
        this.nama = nama;
        this.Attackhitpoint = Attackhitpoint;
        this.Attackkickpoint = Attackkickpoint;
    }
    public String getNama() {
        return nama;
    }
    public int getlifePoint() {
        return Lifepoint;
    }
    public void setlifePoint(int Lifepoint) {
        this.Lifepoint = Lifepoint;
    }
    public void kick(GameCharacter character) {
        character.setlifePoint(character.getlifePoint() - this.Attackkickpoint);
    }
    public void hit(GameCharacter character) {
        character.setlifePoint(character.getlifePoint() - this.Attackhitpoint);
    }
    public void compare(GameCharacter character) {
        int result = Integer.compare(this.Lifepoint, character.getlifePoint());
        if (result > 0) {
            System.out.println(this.nama + " is WINNER!!!");
        } else if (result < 0) {
            System.out.println(character.getNama() + " is WINNER!!!");
        } else {
            System.out.println("DRAW");
        }
    }
}