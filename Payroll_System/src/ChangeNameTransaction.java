/*
this：存取 本身類別 的成員（資料成員、函數成員、建構元）
super：存取 父類別 的成員（資料成員、函數成員、建構元）
 */

public class ChangeNameTransaction extends ChangeEmployeeTransaction {
    private String newName;

    // Constructor
    public ChangeNameTransaction(int empId, String name) {
        super(empId);
        newName = name;
    }

    @Override
    protected void change(Employee e) {
        e.setName(newName);
    }
}
