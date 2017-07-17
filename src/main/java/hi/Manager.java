package hi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by azhilin on 31.01.2017.
 */
@Entity
@Table(name = "managers")
public class Manager extends Human {
    @Column(name = "company_name")
    String companyName;

    public Manager() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
