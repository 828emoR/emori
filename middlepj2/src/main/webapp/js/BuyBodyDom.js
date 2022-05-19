document.addEventListener("DOMContentLoaded", change);

	function change() {
		let count = document.getElementById("pamount").value;
		let price = "<c:out value='${product.productPrice }'/>";
		
		price = count * price;
		document.getElementById("totalprice").innerText = price;
		document.getElementById("totalprice2").innerText = price;
		document.getElementById("totalcount").innerText = count;
		
		
	}