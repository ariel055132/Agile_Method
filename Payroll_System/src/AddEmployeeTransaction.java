// Abstract 當您定義類別時，可以僅宣告方法名稱而不實作當中的邏輯，這樣的方法稱之為「抽象方法」（Abstract method）
public abstract class AddEmployeeTransaction implements Transaction{
    protected int EmpId;
    protected String Name;
    protected String Address;

    // Constructor
    public AddEmployeeTransaction(int empId, String name, String address) {
        EmpId = empId;
        Name = name;
        Address = address;
    }

    // Abstract: not a must to implement the function
    public abstract PaymentClassification getClassification();
    public abstract PaymentSchedule getSchedule();

    public void execute() {
        PaymentClassification pc = getClassification();
        PaymentSchedule ps = getSchedule();
        PaymentMethod pm = new HoldMethod();
        Affiliation af = new NoAffiliation();

        Employee e = new Employee(EmpId, Name, Address);
        e.setPaymentClassification(pc);
        e.setPaymentMethod(pm);
        e.setPaymentSchedule(ps);
        e.setAffiliation(af);

    }

}
