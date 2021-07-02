var id = 1;

document.querySelector("button").addEventListener("click", function() {
  var who = document.querySelector("#who").value;
  var what = document.querySelector("#what").value;
  var html = "<tr><td>" + id + "</td><td>" + who + "</td><td>" + what + "</td></tr>";
  var tbody = document.querySelector("tbody");
  tbody.innerHTML = tbody.innerHTML + html;
  id++;
});