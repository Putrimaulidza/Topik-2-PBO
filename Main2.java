public class Main2 {
    public static void main(String[] args){
        GameCharacter character1 = new GameCharacter("Raiden",10,20);
        GameCharacter character2 = new GameCharacter("Sub-Zero",5,25);
        character1.kick(character2);
        character2.kick(character1);

        for(int i=0;i<3;i++){
            character2.hit(character1);
        }
        for (int i=0;i<4;i++){
            character1.kick(character2);
        }
        System.out.println("Raiden="+character1.getlifePoint());
        System.out.println("Sub-Zero="+character2.getlifePoint());

        character1.compare(character2);
    }
}