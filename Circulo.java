  public  class Circulo {
    private int raio;
    Circulo (int raio){};
    double area ;
    double circunf ;
    

    public Circulo(int raio,double area, double circunf){
        setRaio(raio);
        setArea(area);
        setCircunf(circunf);
        
    }
    public int getRaio() {
        return this.raio;
    }

    public void setRaio(int raio) {

        this.raio = raio;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {

        this.area = area;
    }

    public double getCircunf() {
        return this.circunf;
    }

    public void setCircunf(double circunf) {

        this.circunf =circunf;
    }




    void imprime() {
        System.out.println("area = " + area);

        System.out.println("raio = " + raio); // imprimindo os atributos
        System.out.println("area = " + area);
        System.out.println("circunf = " + circunf);
    }
}