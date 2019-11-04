import static java.lang.System.*;

public class Program {
    public static void main(String[] args){
        QuickFindUF quickFindUF = new QuickFindUF(6);
        quickFindUF.union(2,3);
        out.println(quickFindUF.connected(2,3));
    }
}
