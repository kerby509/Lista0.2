class Circulo {
    private int raio;
    int Raio;
    double area;
    double circunf;

    public Circulo(int raio, double area, double circunf){
        this.raio=raio;
        this.area=area;
        this.circunf=circunf;
    }

    void imprime() {
        System.out.println("raio = " + raio); // imprimindo os atributos
        System.out.println("area = " + area);
        System.out.println("circunf = " + circunf);
    }
}