class Employee {
  constructor(empno, name, email, deptid) {
    this.empno = empno;
    this.name = name;
    this.email = email;
    this.deptid = deptid;
  }

  getEmpDetails() {
    return this.empno + " " + this.name + " " + this.email + " " + this.deptid;
  }

  setEmpDetails(empno, name, email, deptid) {
    this.empno = empno;
    this.name = name;
    this.email = email;
    this.deptid = deptid;
  }
}

class Logic {
  constructor() {
    this.employees = [
      new Employee(111, "ABC", "abc@gmail.com", 10),
      new Employee(222, "DEF", "def@gmail.com", 10),
      new Employee(333, "LMN", "lmn@gmail.com", 20),
      new Employee(444, "PQR", "pqr@gmail.com", 20),
      new Employee(555, "XYZ", "xyz@gmail.com", 30),
    ];
  }

  dispayAllEmployees() {
    return this.employees;
  }

  blurEvent(input) {
    let output = { flag: false, employeeDetails: {} };
    for (let i = 0; i < this.employees.length; i++) {
      if (this.employees[i].empno == input) {
        output.flag = true;
        output.employeeDetails = {
          empno: this.employees[i].empno,
          name: this.employees[i].name,
          email: this.employees[i].email,
          deptid: this.employees[i].deptid,
        };
        break;
      }
    }
    return output;
  }

  viewOndeptId(input) {
    let output = { flag: false, employeeDetails: [] };
    for (let i = 0; i < this.employees.length; i++) {
      if (this.employees[i].deptid == input) {
        output.flag = true;
        let details = {
          empno: this.employees[i].empno,
          name: this.employees[i].name,
          email: this.employees[i].email,
          deptid: this.employees[i].deptid,
        };
        output.employeeDetails.push(details);
      }
    }

    return output;
  }

  addEmployee(newEmp) {
    this.employees.push({
      empno: newEmp.empno,
      name: newEmp.name,
      email: newEmp.email,
      deptid: newEmp.deptid,
    });
  }

  deleteEmployee(empno) {
    let index = this.employees.map((emp) => emp.empno).indexOf(parseInt(empno));
    this.employees.splice(index, 1);
  }

  modifyEmp(input) {
    if (
      input.modifyEmployee.name != "" &&
      input.modifyEmployee.email != "" &&
      input.modifyEmployee.deptid != ""
    ) {
      let index = this.employees
        .map((emp) => emp.empno)
        .indexOf(parseInt(input.modifyEmployee.empno));
      this.employees[index].name = input.modifyEmployee.name;
      this.employees[index].email = input.modifyEmployee.email;
      this.employees[index].deptid = input.modifyEmployee.deptid;
      input.flag = true;
    }
    return input.flag;
  }
}

window.addEventListener("DOMContentLoaded", () => {
  const empnoEL = document.getElementById("empno");
  const empnameEL = document.getElementById("empname");
  const emailEL = document.getElementById("email");
  const deptidEL = document.getElementById("deptid");
  const addEL = document.getElementById("add");
  const modifyEL = document.getElementById("modify");
  const deleteEL = document.getElementById("delete");
  const viewEL = document.getElementById("view");
  const viewdeptIdEL = document.getElementById("odd");
  const msgEl = document.getElementById("msg");
  const displaymsgEl = document.getElementById("displaymsg");

  let logic = new Logic();

  if (empno.value == "") {
    msgEl.innerText = "Enter Emp Id";
    addEL.disabled = true;
    modifyEL.disabled = true;
    deleteEL.disabled = true;
  }

  viewEL.addEventListener("click", () => {
    console.log(logic.employees);

    let output = logic.dispayAllEmployees();

    for (let i = 0; i < output.length; i++) {
      displaymsgEl.innerText =
        displaymsgEl.innerText +
        " Emp No: " +
        output[i].empno +
        " Name:  " +
        output[i].name +
        " Email:  " +
        output[i].email +
        " Dept Id: " +
        output[i].deptid +
        "\n";
    }
    msgEl.innerHTML = "Employees Displayed";
    displaymsgEl.innerText = displaymsgEl.innerText + "\n";
  });

  empnoEL.addEventListener("blur", () => {
    let output = logic.blurEvent(empnoEL.value);
    if (output.flag) {
      empnameEL.value = output.employeeDetails.name;
      emailEL.value = output.employeeDetails.email;
      deptidEL.value = output.employeeDetails.deptid;
      msgEl.innerHTML = "Employee Exists";
      modifyEL.disabled = false;
      deleteEL.disabled = false;
      addEL.disabled = true;
    } else {
      empnameEL.value = "";
      emailEL.value = "";
      deptidEL.value = "";
      msgEl.innerHTML = "Employee does not exist";
      addEL.disabled = false;
      modifyEL.disabled = true;
      deleteEL.disabled = true;
    }
  });

  viewdeptIdEL.addEventListener("click", () => {
    let output = logic.viewOndeptId(deptidEL.value);
    if (output.flag) {
      for (let i = 0; i < output.employeeDetails.length; i++) {
        displaymsgEl.innerText =
          displaymsgEl.innerText +
          " Emp No: " +
          output.employeeDetails[i].empno +
          " Name:  " +
          output.employeeDetails[i].name +
          " Email:  " +
          output.employeeDetails[i].email +
          " Dept Id: " +
          output.employeeDetails[i].deptid +
          "\n";
      }
      msgEl.innerText = "Details displayed on Id";
    } else {
      msgEl.innerText = "Enter Valid Dept Id";
    }
  });

  addEL.addEventListener("click", () => {
    if (empnameEL.value != "" && emailEL.value != "" && deptidEL.value != "") {
      let newEmp = {
        empno: empnoEL.value,
        name: empnameEL.value,
        email: emailEL.value,
        deptid: deptidEL.value,
      };
      logic.addEmployee(newEmp);
      msgEl.innerText = "Employee Added Successfully";
    } else {
      msgEl.innerText = "Please Enter all Details";
    }
  });

  deleteEL.addEventListener("click", () => {
    logic.deleteEmployee(empnoEL.value);
    msgEl.innerText = "Employee Deleted";
  });

  modifyEL.addEventListener("click", () => {
    let input = {
      flag: false,
      modifyEmployee: {
        empno: empnoEL.value,
        name: empnameEL.value,
        email: emailEL.value,
        deptid: deptidEL.value,
      },
    };

    let output = logic.modifyEmp(input);
    if (output) {
      msgEl.innerText = "Employee Details Modified";
    } else {
      msgEl.innerText = "Please Enter all values";
    }
  });
});
