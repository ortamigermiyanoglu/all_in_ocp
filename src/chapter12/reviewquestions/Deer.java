package chapter12.reviewquestions;

public class Deer {
    enum Food{APPLES, BERRIES, GRASS};
    private class Diet{
        private Food getFavorite(){
            return Food.BERRIES;
        }

        private Diet(){}
    }

    public static void main(String[] args) {
        switch (new Deer().new Diet().getFavorite()){
            case GRASS:
                System.out.println("a");
            case BERRIES:
                System.out.println("b");
            default:
                System.out.println("c");
        }
    }
}
