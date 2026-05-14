class Conversor {

    // Celsius para Fahrenheit
    public double converter(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Quilômetros para Milhas
    public double converter(int quilometros) {
        return quilometros * 0.621371;
    }

    // String para maiúsculas
    public String converter(String texto) {
        return texto.toUpperCase();
    }
}