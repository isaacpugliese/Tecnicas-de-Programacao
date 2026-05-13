public interface Autenticacao {
    boolean login(String usuario, String senha);
    void logout();
}
