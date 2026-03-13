var map = L.map('map').setView([20.5937, 78.9629], 5);

L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png',{
maxZoom:19
}).addTo(map);

var marker;

var latitude = null;
var longitude = null;

map.on('click', function(e){

latitude = e.latlng.lat;
longitude = e.latlng.lng;

document.getElementById("lat").innerText = latitude;
document.getElementById("lng").innerText = longitude;

if(marker){
map.removeLayer(marker);
}

marker = L.marker([latitude, longitude]).addTo(map);

});

function sendLocation(){

if(latitude === null){
alert("Please click on the map first");
return;
}

fetch("/api/location",{

method:"POST",

headers:{
"Content-Type":"application/json"
},

body: JSON.stringify({

latitude: latitude,
longitude: longitude

})

})
.then(response => response.text())
.then(data => {

alert(data);

})
.catch(error => {

console.error(error);

});

}