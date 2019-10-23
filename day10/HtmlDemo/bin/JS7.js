/**
 * 
 */
function show(){
	var radios=frmRadio.elements["gender"];
	for(var i=0; i<radios.length;i++){
		if(radios[i].checked){
			gen=radios[i].value;
		}
	}
	alert(gen);
	
}