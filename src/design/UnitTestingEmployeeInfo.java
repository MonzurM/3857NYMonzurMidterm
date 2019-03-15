package design;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTestingEmployeeInfo {

    EmployeeInfo testEmployee = new EmployeeInfo(1);

    @Test
    public void testCalculateEmployeeBonus() {
        testEmployee.setSalary(50000);
        testEmployee.setPerformance(5);
        double expectedBonus = 5000;
        double actualBonus = EmployeeInfo.calculateEmployeeBonus(testEmployee.getSalary(), testEmployee.getPerformance());
        Assert.assertEquals(expectedBonus, actualBonus);
    }

    @Test
    public void testCalculateEmployeePension() {
        testEmployee.setSalary(50000);
        double expectedPension = 3.5;
        double actualPension = EmployeeInfo.calculateEmployeePension(testEmployee.getSalary());
        Assert.assertEquals(expectedPension, actualPension);
    }
}