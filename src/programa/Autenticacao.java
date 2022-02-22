package programa;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Exceptions.EmailInvalidoException;

//Classe autenticadora de emails
public class Autenticacao extends Exception {

	public static String validarEmail(String email) throws EmailInvalidoException {
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
            	return email;
            }
        }
        throw new EmailInvalidoException("Email invalido.");
	}
}
