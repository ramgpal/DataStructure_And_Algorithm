public class interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}


interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves() {
        System.out.println("can move in up, down, right, left and diagonal");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("can move in up, down, right, left");
    }
}
