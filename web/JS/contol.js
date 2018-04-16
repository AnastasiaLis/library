function addlibrary()
{
    alert('I here!');
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
           // Typical action to be performed when the document is ready:
           //document.getElementById("demo").innerHTML = xhttp.responseText;
           alert("HERE 2");
        }
    };
    xhttp.open("GET", "control.jsp?library_name="+document.getElementById("library_name").value, true);
    xhttp.send();
}

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


