// the employee join the union
public abstract class ChangeAffiliationTransaction extends ChangeEmployeeTransaction{
    public ChangeAffiliationTransaction(int empId) {
        super(empId);
    }
    protected abstract Affiliation getAffiliation();
    protected abstract void RecordMembership(Employee e);

    @Override
    protected void change(Employee e) {
        RecordMembership(e);
        e.setAffiliation(getAffiliation());
    }
}
