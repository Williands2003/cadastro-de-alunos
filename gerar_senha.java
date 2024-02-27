import java.security.SecureRandom;

public class GeradorSenhas {

    private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
    private static final String NUMBER = "0123456789";
    private static final String OTHER_CHAR = "!@#$%&*()_+-=[]{}<>|";

    private static final String PASSWORD_ALLOW_BASE = CHAR_LOWER + CHAR_UPPER + NUMBER + OTHER_CHAR;
    private static final SecureRandom random = new SecureRandom();

    public static void main(String[] args) {
        int length = 12; // comprimento da senha
        System.out.println("Senha gerada: " + generatePassword(length));
    }

    public static String generatePassword(int length) {
        if (length < 4) {
            throw new IllegalArgumentException("A senha deve ter no mínimo 4 caracteres.");
        }

        StringBuilder password = new StringBuilder(length);

        // Pelo menos um caractere de cada conjunto de caracteres
        password.append(randomChar(CHAR_LOWER));
        password.append(randomChar(CHAR_UPPER));
        password.append(randomChar(NUMBER));
        password.append(randomChar(OTHER_CHAR));

        // Restantes caracteres - preenche aleatoriamente
        for (int i = 4; i < length; i++) {
            password.append(randomChar(PASSWORD_ALLOW_BASE));
        }

        // Embaralha a senha e a retorna
        return password.toString();
    }

    private static char randomChar(String inputString) {
        int randomIndex = random.nextInt(inputString.length());
        return inputString.charAt(randomIndex);
    }
}
