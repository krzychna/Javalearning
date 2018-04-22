package Test;
public class Monster {

    public static void main (String[] args){
        monsterinherit[] tab = new monsterinherit [10];
        for (int i =0; i<5; i++){
            tab[i] = new zombie(50,"zombie_" + i,2);
        }
        for (int i =5; i<10; i++){
            tab[i] = new skeleton(50,"skeleton_" + i,2);
        }
        for (int i =0; i<tab.length;i++){
            if (tab[i] instanceof skeleton)
            System.out.println(i+". "+ tab[i]+ "\n");
        }
    }
}
