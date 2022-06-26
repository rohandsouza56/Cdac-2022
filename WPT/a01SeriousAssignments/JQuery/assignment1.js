const arr = Array.from(
  {
    length: 10,
  },
  () => Math.floor(Math.random() * 100)
);


$(() => {
  const displayEL = document.getElementById("display");
  const addEL = document.getElementById("add");
  const editEL = document.getElementById("edit");
  const deleteEL = document.getElementById("delete");
  const viewEL = document.getElementById("view");
  const oddEL = document.getElementById("odd");
  const msgEl = document.getElementById("msg");
  const displaymsgEl = document.getElementById("displaymsg");

  console.log(arr);

  if (($(displayEL).val()=="")) {
    $(addEL).prop("disabled",true);
    $(editEL).prop("disabled",true);
    $(deleteEL).prop("disabled",true);
  }

  $(displayEL).blur(()=>{
    let flag = false;
    for (let i = 0; i < arr.length; i++) {
      if ($(displayEL).val() == arr[i]) {
        flag = true;
      }
    }
    if (flag == true) {
      $(editEL).prop("disabled",false);
      $(deleteEL).prop("disabled",false);
      $(addEL).prop("disabled",true);
    } else {
      $(editEL).prop("disabled",true);
      $(deleteEL).prop("disabled",true);
      $(addEL).prop("disabled",false);
    }
  });

  $(viewEL).click(()=>{
    $(displaymsgEl).html( $(displaymsgEl).html() + arr + " <br>");
    $(msgEl).text("Array Displayed");
  });

  $(oddEL).click(()=>{
    for (let i = 1; i < arr.length; i = i + 2) {
      $(displaymsgEl).html( $(displaymsgEl).html() + arr[i] + " ");
    }
    $(displaymsgEl).html($(displaymsgEl).html()+"<br>");
    $(msgEl).text("Odd Positions");
  });


  $("#add").click(()=>{
    arr.push($("#display").val());
    $("#msg").text("Array Item added");
  });
 
    
 

  $(editEL).click(()=>{
    let newValue = parseInt(window.prompt("Enter new Value"));
    let flag = false;
    for (let i = 0; i < arr.length; i++) {
      if (newValue == arr[i]) {
        flag = true;
      }
    }
    if (flag == false) {
      let index = arr.indexOf(parseInt($(displayEL).val()));

      arr[index] = newValue;
      $(msgEl).text("Element Replaced");
    } else {
      $(msgEl).text("Element already exists");
    }
  });

  $(deleteEL).click(()=>{
    let index = arr.indexOf(parseInt($(displayEL).val()));

    arr.splice(index, 1);
    $(msgEl).text("Element deleted");
  });
});
