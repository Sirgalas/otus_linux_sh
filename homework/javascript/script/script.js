let numberRow = 1;
let middle_age = 0;

function requestForm() {
    let name = document.querySelector("#name").value;

    let date = new Date(document.querySelector("#date").value);

    let now = new Date();

    let gender = document.querySelector("#gender").value;

    let table = document.querySelector("#table_data");

    let newRow = table.insertRow(numberRow);

    
    let oneCell = newRow.insertCell(0);
    oneCell.appendChild(document.createTextNode(numberRow));

    let twoCell = newRow.insertCell(1);
    twoCell.appendChild(document.createTextNode(name));

    let threeCell = newRow.insertCell(2);
    threeCell.appendChild(document.createTextNode(gender));

    let age = now.getFullYear() - date.getFullYear();
    let foureCell = newRow.insertCell(3);
    foureCell.appendChild(document.createTextNode(age));
    
    
    middle_age += age;
    let h = document.querySelector("#middle_age h3 span");
    h.innerHTML = "";
    h.appendChild(document.createTextNode(middle_age / numberRow));

    numberRow ++;
}