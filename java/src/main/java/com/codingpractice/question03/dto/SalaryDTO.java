package main.java.com.codingpractice.question03.dto;


    public class SalaryDTO {

        private String empID;
        private String empName;
        private String phone;
        private String jobCode;
        private int salary;

        public SalaryDTO() {
        }

        public SalaryDTO(String empID, String empName, String phone, String jobCode, int salary) {
            this.empID = empID;
            this.empName = empName;
            this.phone = phone;
            this.jobCode = jobCode;
            this.salary = salary;
        }

        public String getEmpID() {
            return empID;
        }

        public void setEmpID(String empID) {
            this.empID = empID;
        }

        public String getEmpName() {
            return empName;
        }

        public void setEmpName(String empName) {
            this.empName = empName;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getJobCode() {
            return jobCode;
        }

        public void setJobCode(String jobCode) {
            this.jobCode = jobCode;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "SalaryDTO{" +
                    "empID='" + empID + '\'' +
                    ", empName='" + empName + '\'' +
                    ", phone='" + phone + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }

