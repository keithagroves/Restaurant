async function fetchSpecial () {
	var request = {method: "get", headers: {'Content-Type': 'application/json'}};
	var response = await fetch("http://localhost:8080/special", request);
	response.text().then (function(res) {
		console.log(res);
		alert(res);
	});
}
async function fetchDrink () {
	var request = {method: "get", headers: {'Content-Type': 'application/json'}};
	var response = await fetch("http://localhost:8080/drink", request);
	response.text().then (function(res) {
		console.log(res);
		var element = document.getElementById("order");
		element.innerHTML = res;
	});
}