package Collections.ArrayList;
import java.util.Comparator;

public class SIDComparator implements Comparator<StudentInfo>{
    
    public int compare(StudentInfo o1, StudentInfo o2){

        if(o1.getSID()==o2.getSID()){
            return 0;
        }
        else if(o1.getSID()>o2.getSID()){
            return 1;
        }
        else{
            return -1;
        }

    }
}
