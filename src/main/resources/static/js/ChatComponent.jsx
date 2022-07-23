// Retorna la url del servicio. Es una función de configuración.
function BBServiceURL() {
 var url = WShostURL() + '/bbService';
 console.log("BBService URL Calculada: " + url);
 return url;
}
// Retorna la url del servicio. Es una función de configuración.
function ticketServiceURL() {
 var url = RESThostURL() + '/getticket';
 console.log("ticketService URL Calculada: " + url);
 return url;
}
// Retorna la url del servicio. Es una función de configuración.
function WShostURL() {
 var host = window.location.host;
 var url = 'ws://' + (host);
 console.log("host URL Calculada: " + url);
 return url;
}
// Retorna la url del servicio. Es una función de configuración.
function RESThostURL() {
 var host = window.location.host;
 var protocol = window.location.protocol;
 var url = protocol + '//' + (host);
 console.log("host URL Calculada: " + url);
 return url;
}
// Retorna la url del servicio. Es una función de configuración.
async function getTicket() {
 const response = await fetch(ticketServiceURL());
 console.log("ticket: " + response);
 return response;
}
async onOpen(evt) {
 console.log("In onOpen", evt);
 var response = await getTicket();
 var json;
 if (response.ok) {
 // // if HTTP-status is 200-299
 // get the response body (the method explained below)
 json = await response.json();
 } else {
 console.log("HTTP-Error: " + response.status);
 }
 this.wsocket.send(json.ticket);
 }