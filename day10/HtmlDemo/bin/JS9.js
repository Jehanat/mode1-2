/**
 * 
 */
function fullname(){
var fname=frmName.firstName.value;
	var lname=frmName.lastName.value;
	var fullName= fname+ ' ' + lname;
	frmName.fullName.value=fullName;
}