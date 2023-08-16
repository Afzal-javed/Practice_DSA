import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<List<Integer>> lst=new ArrayList<>();
        List<Integer>lst1=new ArrayList<>();
        List<Integer>lst2=new ArrayList<>();
        List<Integer>lst3=new ArrayList<>();
        lst3.add(0);
        lst3.add(9);
        lst3.add(8);
        lst2.add(5);
        lst2.add(6);
        lst2.add(7);
        lst1.add(2);
        lst1.add(3);
        lst1.add(4);
        lst.add(lst1);
        lst.add(lst2);
        int idx=1;
        if(idx==-1){
            lst.add(lst3);
        }
        System.out.println(lst);
    }
}
