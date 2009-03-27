function validar_email(email) {
	regex = /^[a-zA-Z0-9][a-zA-Z0-9\._-]+@([a-zA-Z0-9\._-]+\.)[a-zA-Z-0-9]{2}/;
    if(regex.exec(email)) {
    	return true;
    } else {
    	return false;
    }
}