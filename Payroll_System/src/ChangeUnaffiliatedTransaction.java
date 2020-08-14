// The employee leaves the union
public class ChangeUnaffiliatedTransaction extends ChangeAffiliationTransaction{

    public ChangeUnaffiliatedTransaction(int empId) {
        super(empId);
    }

    @Override
    protected Affiliation getAffiliation() {
        return new NoAffiliation();
    }

    @Override
    protected void RecordMembership(Employee e) {
        Affiliation af = e.getAffiliation();
        if (af instanceof UnionAffiliation) {
            UnionAffiliation uaf = (UnionAffiliation) af;
            int memberId = uaf.getMemberId();
            PayrollDatabase.deleteUnionMember(memberId);
        }
    }
}
