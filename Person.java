public class Person{
// Write Your Code Here
private int pid;
private String pname;
private int psal;
private String pdeg;
public int getPid() {
    return pid;
}
public void setPid(int pid) {
    this.pid = pid;
}
public String getPname() {
    return pname;
}
public void setPname(String pname) {
    this.pname = pname;
}
public int getPsal() {
    return psal;
}
public void setPsal(int psal) {
    this.psal = psal;
}
public String getPdeg() {
    return pdeg;
}
public void setPdeg(String pdeg) {
    this.pdeg = pdeg;
}
@Override
public String toString() {
    return "Person [pid=" + pid + ", pname=" + pname + ", psal=" + psal + ", pdeg=" + pdeg + "]";
}
public Person(int pid, String pname, int psal, String pdeg) {
    this.pid = pid;
    this.pname = pname;
    this.psal = psal;
    this.pdeg = pdeg;
}
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + pid;
    result = prime * result + ((pname == null) ? 0 : pname.hashCode());
    result = prime * result + psal;
    result = prime * result + ((pdeg == null) ? 0 : pdeg.hashCode());
    return result;
}
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Person other = (Person) obj;
    if (pid != other.pid)
        return false;
    if (pname == null) {
        if (other.pname != null)
            return false;
    } else if (!pname.equals(other.pname))
        return false;
    if (psal != other.psal)
        return false;
    if (pdeg == null) {
        if (other.pdeg != null)
            return false;
    } else if (!pdeg.equals(other.pdeg))
        return false;
    return true;
}











}
