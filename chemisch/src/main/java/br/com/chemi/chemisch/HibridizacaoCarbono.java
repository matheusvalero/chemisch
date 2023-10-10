package br.com.chemi.chemisch;

public class HibridizacaoCarbono {
    private String tipo;
    private String carbono;
    private String geometria;
    private int angulo;


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCarbono() {
        return carbono;
    }

    public void setCarbono(String carbono) {
        this.carbono = carbono;
    }

    public String getGeometria() {
        return geometria;
    }

    public void setGeometria(String geometria) {
        this.geometria = geometria;
    }

    public int getAngulo() {
        return angulo;
    }

    public void setAngulo(int angulo) {
        this.angulo = angulo;
    }

    public String classificaHibridizacao(int angulo){
        switch (angulo) {
            case 109:
                setTipo("sp3");
                setGeometria("Tetraédrica");
                setAngulo(109);
                setCarbono("4 simples");
                return this.tipo;
            case 120:
                setTipo("sp2");
                setGeometria("Trigonal Plana ou Triangular");
                setAngulo(120);
                setCarbono("2 simples e 1 dupla");
                return this.tipo;
            case 180:
                setTipo("sp");
                setGeometria("Linear");
                setAngulo(180);
                setCarbono("2 duplas ou 1 tripla e 1 simples");
                return this.tipo;
        }
        return "algo deu errado";
    }
}
