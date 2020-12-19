const host = "https://lit-river-05482.herokuapp.com";
async function fetchSpecial () {
	var request = {method: "get", headers: {'Content-Type': 'application/json'}};
	var response = await fetch(host + "/special", request);
	response.text().then (function(res) {
		console.log(res);
		alert(res);
	});
}
async function fetchDrink () {
	var request = {method: "get", headers: {'Content-Type': 'application/json'}};
	var response = await fetch(host + "/drink", request);
	response.text().then (function(res) {
		console.log(res);
		var element = document.getElementById("order");
		element.innerHTML = res;
	});
}