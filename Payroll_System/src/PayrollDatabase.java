import java.util.HashMap;
// 2 hashmap, one for employee, one for union
public class PayrollDatabase {
    // employeeHashMap (EmpID, Employee)
    private static HashMap<Integer, Employee> employeeHashMap = new HashMap<Integer, Employee>();
    // unionHashMap (MemberID, EmpId)
    private static HashMap<Integer, Employee> unionHashMap = new HashMap<Integer, Employee>();

    // Operations for employeeHashMap
    public static Employee getEmployee(int empId) {
        return employeeHashMap.get(empId);
    }

    public static void addEmployee(int empId, Employee e) {
        employeeHashMap.put(empId, e);
    }

    public static void deleteEmployee(int empId) {
        employeeHashMap.remove(empId);
    }

    // Operations for unionHashMap
    public static Employee getUnionMember(int memberId) {
        return unionHashMap.get(memberId);
    }

    public static void addUnionMember(int memberId, Employee e) {
        unionHashMap.put(memberId, e);
    }

    public static void deleteUnionMember(int memberId) {
        unionHashMap.remove(memberId);
    }

}
