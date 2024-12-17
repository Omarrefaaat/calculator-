import java.util.Arrays;

public class dashboard2 {


    public static void main(String[] args) {
        String[] employeeNames = {"'Alice", "Bob", "Charlie", "Diana", "Edward", "Fiona","ahmed","ali","mahmoud","omar"};
        int[] employeeSalaries = {5000, 7000, 8000, 6000, 7500, 8200, 5644 ,18000,12000 ,18000};
        String[] employeeDepartments = {"HR", "IT", "IT", "HR", "Finance", "Finance"};

        System.out.println("Number of employee in company : " + numOfCompanyEmploy(employeeNames));
        System.out.println("------------------------------------------------------");
        System.out.println("total salaries in company : " + totalSalaryOfCompany(employeeSalaries));
        System.out.println("------------------------------------------------------");
        System.out.println("the highest salary of company is : " + highestSalaryCompany(employeeSalaries));
        System.out.println("------------------------------------------------------");
        System.out.println("the lowest salary of company is : " + lowestSalaryCompany(employeeSalaries));
        System.out.println("------------------------------------------------------");
        System.out.println("the department is : " + Arrays.toString(uniqueDepartments(employeeDepartments)));
        System.out.println("------------------------------------------------------");
        totalSalariesOfDepartment(employeeDepartments,employeeSalaries,uniqueDepartments(employeeDepartments));
        System.out.println("------------------------------------------------------");
        maxAndMinSalaryOfEachDepartment(employeeDepartments, employeeSalaries, uniqueDepartments(employeeDepartments));
    }


    static int numOfCompanyEmploy(String[] employees) {
        int employee = employees.length;
        return employee;
    }

    static int totalSalaryOfCompany(int[] salaries) {
        int totalSalaries = 0;
        for (int salary : salaries)
            totalSalaries += salary;
        return totalSalaries;
    }

    static int highestSalaryCompany(int[] salaries) {
        int highestSalaries = Integer.MIN_VALUE;
        for (int salary : salaries)
            if (salary > highestSalaries)
                highestSalaries = salary;
        return highestSalaries;
    }

    static int lowestSalaryCompany(int[] salaries) {
        int lowestSalaries = Integer.MAX_VALUE;
        for (int salary : salaries)
            if (salary < lowestSalaries)
                lowestSalaries = salary;
        return lowestSalaries;
    }

    static String[] uniqueDepartments(String[] departments) {
        boolean isExist;
        int count = 0;
        String[] departmentNew = new String[(departments.length)];
        for (String department : departments) {
            isExist = false;
            for (String departmentNw : departmentNew) {
                if (department.equals(departmentNw)) {
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                departmentNew[count] = department;
                count++;
            }
        }
        String[] result = new String[(count)];
        for (int i = 0; i < count; i++)
            result[i] = departmentNew[i];
        return result;
    }

    static void totalSalariesOfDepartment(String[] departments, int[] salaries, String[] uniqueDepartment) {
        for (String department : uniqueDepartment) {
            int totalSalary = 0;
            for (int j = 0; j < departments.length; j++) {
                if (departments[j].equals(department)){
                    totalSalary += salaries[j];
                }
        }
            System.out.println("total salary of "+department+" is "+totalSalary);
            }

    }

    static void maxAndMinSalaryOfEachDepartment(String[] departments, int[] salaries, String[] uniqueDepartment) {
        for (String department : uniqueDepartment) {
            int highestSalary = Integer.MIN_VALUE;
            int lowestSalary = Integer.MAX_VALUE;
            for (int i = 0; i < departments.length; i++) {
                if (departments[i].equals(department)) {
                    if (salaries[i] > highestSalary) {
                        highestSalary = salaries[i];
                    }
                    if (salaries[i] < lowestSalary) {
                        lowestSalary = salaries[i];
                    }
                }
            }
            System.out.println("department  " + department + "\n" + "the highest salary " + highestSalary + "\n" + "the lowest salary " + lowestSalary + "\n" + "********");
        }
    }
}