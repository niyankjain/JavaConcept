import com.inn.wrapper.Emp;
import com.inn.wrapper.EmpIDComparator;
import com.inn.wrapper.EmpNameComparator;
import com.inn.wrapper.EmpNew;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainMethod {

    public static void main(String[] args) {

        //Comaparable
        //create a list of employees
        List<Emp> empList = new ArrayList<>();

        // Create an object of Emp class
        empList.add(new Emp("Chintu", "1234567890", 2));
        empList.add(new Emp("Akbar", "2234567890", 1));
        empList.add(new Emp("Birbal", "3234567890", 3));

        System.out.println(empList);
        Collections.sort(empList);
        System.out.println(empList);

        //Comaparator
        List<EmpNew> newEmpList = new ArrayList<>();

        newEmpList.add(new EmpNew("Chintu", "1234567890", 2));
        newEmpList.add(new EmpNew("Akbar", "2234567890", 1));
        newEmpList.add(new EmpNew("Birbal", "3234567890", 3));

        System.out.println(newEmpList);
        Collections.sort(newEmpList, new EmpIDComparator());
        System.out.println(newEmpList);

        List<EmpNew> newEmpList1 = newEmpList;
        System.out.println(newEmpList1);
        Collections.sort(newEmpList1, new EmpNameComparator());
        System.out.println(newEmpList1);

    }
}
