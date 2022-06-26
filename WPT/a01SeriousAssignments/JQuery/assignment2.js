const employees = [
  { empno: 111, name: "ABC", email: "abc@gmail.com", deptid: 10 },
  { empno: 222, name: "DEF", email: "def@gmail.com", deptid: 10 },
  { empno: 333, name: "LMN", email: "lmn@gmail.com", deptid: 20 },
  { empno: 444, name: "PQR", email: "pqr@gmail.com", deptid: 20 },
  { empno: 555, name: "XYZ", email: "xyz@gmail.com", deptid: 30 },
];

$(() => {
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

  if ($(empnoEL).val() == "") {
    $(msgEl).text("Enter Emp Id");
    $(addEL).prop("disabled", true);
    $(modifyEL).prop("disabled", true);
    $(deleteEL).prop("disabled", true);
  }

  $(empnoEL).blur(() => {
    let flag = false;
    for (let i = 0; i < employees.length; i++) {
      if (employees[i].empno == $(empnoEL).val()) {
        flag = true;
        $(empnameEL).val(employees[i].name);
        $(emailEL).val(employees[i].email);
        $(deptidEL).val(employees[i].deptid);
        $(msgEl).text("Employee Exists");
        $(modifyEL).prop("disabled", false);
        $(deleteEL).prop("disabled", false);
        $(addEL).prop("disabled", true);
      }
    }
    if (flag == false) {
      $(empnameEL).val("");
      $(deptidEL).val("");
      $(emailEL).val("");
      $(msgEl).text("Employee does not exist");
      $(modifyEL).prop("disabled", true);
      $(deleteEL).prop("disabled", true);
      $(addEL).prop("disabled", false);
    }
  });

  $(addEL).click(() => {
    if (
      $(empnameEL).val() != "" &&
      $(emailEL).val() != "" &&
      $(deptidEL).val() != ""
    ) {
      employees.push({
        empno: $(empnoEL).val(),
        name: $(empnameEL).val(),
        email: $(emailEL).val(),
        deptid: $(deptidEL).val(),
      });
      $(msgEl).text("Employee Added Successfully");
    } else {
      $(msgEl).text("Please Enter all Details");
    }
  });

  $(modifyEL).click(() => {
    let flag = false;
    let index = employees
      .map((emp) => emp.empno)
      .indexOf(parseInt($(empnoEL).val()));
    if (
      $(empnameEL).val() != "" &&
      $(emailEL).val() != "" &&
      $(deptidEL).val() != ""
    ) {
      employees[index].name = $(empnameEL).val();
      employees[index].email = $(emailEL).val();
      employees[index].deptid = $(deptidEL).val();
      flag = true;
      $(msgEl).text("Employee Details Modified");
    }
    if (flag == false) {
      $(msgEl).text("Please Enter all values");
    }
  });

  $(deleteEL).click(() => {
    let index = employees
      .map((emp) => emp.empno)
      .indexOf(parseInt($(empnoEL).val()));
    employees.splice(index, 1);
    $(msgEl).text("Employee Deleted");
  });

  $(viewEL).click(() => {
    for (let i = 0; i < employees.length; i++) {
      $(displaymsgEl).html(
        $(displaymsgEl).html() +
          " Emp No: " +
          employees[i].empno +
          " Name:  " +
          employees[i].name +
          " Email:  " +
          employees[i].email +
          " Dept Id: " +
          employees[i].deptid +
          "<br>"
      );
    }
    $(msgEl).text("Employees Displayed");
    $(displaymsgEl).html($(displaymsgEl).html() + "<br>");
  });

  $(viewdeptIdEL).click(() => {
    if (deptidEL != "") {
      let flag = false;
      for (let i = 0; i < employees.length; i++) {
        if (employees[i].deptid == $(deptidEL).val()) {
          $(displaymsgEl).html(
            $(displaymsgEl).html() +
              " Emp No: " +
              employees[i].empno +
              " Name:  " +
              employees[i].name +
              " Email:  " +
              employees[i].email +
              " Dept Id: " +
              employees[i].deptid +
              "<br>"
          );
          flag = true;
        }
        $(msgEl).text("Employees Displayed");
      }
      if (flag == false) {
        $(msgEl).text("Enter valid Dept Id");
      }
    }
    $(displaymsgEl).html($(displaymsgEl).html() + "<br>");
  });
});
