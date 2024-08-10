import java.util.*;
public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Rook r = new Rook();
        r.moves();

        King k = new King();
        k.moves();
    }
}

// Interface -> In java interface provides blueprint of the classes. All methods in interfaces are public and abstract.
interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer{
    public void moves() {
        System.out.println("Moves of queen");
    }
}

class King implements ChessPlayer{
    public void moves() {
        System.out.println("Moves of king");
    }
}

class Rook implements ChessPlayer{
    public void moves() {
        System.out.println("Moves of Rook");
    }
}
