import java.util.List;
import java.util.ArrayList;

class PascalTriangle {
    public List<List<Integer>> generate(int numrows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if(numrows == 0){
            return triangle;
        }
        for(int i=0; i<numrows; i++){
            List<Integer> rows = new ArrayList<>();
            rows.add(1);
            for(int j = 1; j<i; j++){
                int value = triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j);
                rows.add(value);
            }
            if(i>0){
                rows.add(1);
            }
            triangle.add(rows);
        }
        return triangle;
    }
}