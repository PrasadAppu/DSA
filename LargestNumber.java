import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

class LargestNumber{
    public static void main(String[] args) {
        String[] arr ={"3", "30", "34", "5", "9"};
       System.out.println(printLargest(arr));
    }
   static String printLargest(String[] arr) {
       Vector<String> ar =new Vector<>();
       String result ="";
        for(int i=0;i<arr.length; i++) {
            ar.add(arr[i]);
        }
        Collections.sort(ar,new Comparator<String>(){
            @Override
            public int compare(String X, String Y){
                String XY =X+Y;
                String YX= Y+X;
                return XY.compareTo(YX)>0? -1: 1;
            }
        });
        Iterator it = ar.iterator();
 
        while (it.hasNext()){
           result =result+it.next();
        }
        return result;
    }

    }