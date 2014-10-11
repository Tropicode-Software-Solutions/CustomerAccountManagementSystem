/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function init(){
    var fork = document.getElementById("chooser");
    fork.onclick = newCustomerChoice();

}

function newCustomerChoice() {
    alert("hey hey hey");
    var i = document.getElementById("testText");
    i.innerHTML = "aha!";
}
window.onload = init();